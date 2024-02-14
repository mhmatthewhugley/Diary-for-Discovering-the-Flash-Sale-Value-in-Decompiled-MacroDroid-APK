package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.remote.Stream.StreamCallback;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p292io.grpc.C12537b1;
import p292io.grpc.C12558f;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;

abstract class AbstractStream<ReqT, RespT, CallbackT extends Stream.StreamCallback> implements Stream<CallbackT> {

    /* renamed from: l */
    private static final long f54515l;

    /* renamed from: m */
    private static final long f54516m;

    /* renamed from: n */
    private static final long f54517n;

    /* renamed from: o */
    private static final long f54518o;
    @Nullable

    /* renamed from: a */
    private AsyncQueue.DelayedTask f54519a;

    /* renamed from: b */
    private final FirestoreChannel f54520b;

    /* renamed from: c */
    private final C12972r0<ReqT, RespT> f54521c;

    /* renamed from: d */
    private final AbstractStream<ReqT, RespT, CallbackT>.IdleTimeoutRunnable f54522d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AsyncQueue f54523e;

    /* renamed from: f */
    private final AsyncQueue.TimerId f54524f;

    /* renamed from: g */
    private Stream.State f54525g = Stream.State.Initial;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f54526h = 0;

    /* renamed from: i */
    private C12558f<ReqT, RespT> f54527i;

    /* renamed from: j */
    final ExponentialBackoff f54528j;

    /* renamed from: k */
    final CallbackT f54529k;

    class CloseGuardedRunner {

        /* renamed from: a */
        private final long f54530a;

        CloseGuardedRunner(long j) {
            this.f54530a = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63001a(Runnable runnable) {
            AbstractStream.this.f54523e.mo63156t();
            if (AbstractStream.this.f54526h == this.f54530a) {
                runnable.run();
            } else {
                Logger.m76508a(AbstractStream.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    @VisibleForTesting
    class IdleTimeoutRunnable implements Runnable {
        IdleTimeoutRunnable() {
        }

        public void run() {
            AbstractStream.this.m76131g();
        }
    }

    class StreamObserver implements IncomingStreamObserver<RespT> {

        /* renamed from: a */
        private final AbstractStream<ReqT, RespT, CallbackT>.CloseGuardedRunner f54533a;

        StreamObserver(AbstractStream<ReqT, RespT, CallbackT>.CloseGuardedRunner closeGuardedRunner) {
            this.f54533a = closeGuardedRunner;
        }

        /* renamed from: d */
        static /* synthetic */ void m76146d(StreamObserver streamObserver, C12537b1 b1Var) {
            if (b1Var.mo69064o()) {
                Logger.m76508a(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractStream.this)));
            } else {
                Logger.m76511d(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractStream.this)), b1Var);
            }
            AbstractStream.this.mo62991h(b1Var);
        }

        /* renamed from: e */
        static /* synthetic */ void m76147e(StreamObserver streamObserver, C12960q0 q0Var) {
            if (Logger.m76510c()) {
                HashMap hashMap = new HashMap();
                for (String next : q0Var.mo69766i()) {
                    if (Datastore.f54557e.contains(next.toLowerCase(Locale.ENGLISH))) {
                        hashMap.put(next, (String) q0Var.mo69764f(C12960q0.C12967g.m85092e(next, C12960q0.f60666d)));
                    }
                }
                if (!hashMap.isEmpty()) {
                    Logger.m76508a(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractStream.this)), hashMap);
                }
            }
        }

        /* renamed from: f */
        static /* synthetic */ void m76148f(StreamObserver streamObserver, Object obj) {
            if (Logger.m76510c()) {
                Logger.m76508a(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(AbstractStream.this)), obj);
            }
            AbstractStream.this.mo62996n(obj);
        }

        /* renamed from: g */
        static /* synthetic */ void m76149g(StreamObserver streamObserver) {
            Logger.m76508a(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractStream.this)));
            AbstractStream.this.m76133o();
        }

        /* renamed from: a */
        public void mo63003a(C12537b1 b1Var) {
            this.f54533a.mo63001a(AbstractStream$StreamObserver$$Lambda$4.m76157a(this, b1Var));
        }

        /* renamed from: b */
        public void mo63004b() {
            this.f54533a.mo63001a(AbstractStream$StreamObserver$$Lambda$3.m76156a(this));
        }

        /* renamed from: c */
        public void mo63005c(C12960q0 q0Var) {
            this.f54533a.mo63001a(AbstractStream$StreamObserver$$Lambda$1.m76154a(this, q0Var));
        }

        public void onNext(RespT respt) {
            this.f54533a.mo63001a(AbstractStream$StreamObserver$$Lambda$2.m76155a(this, respt));
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f54515l = timeUnit.toMillis(1);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f54516m = timeUnit2.toMillis(1);
        f54517n = timeUnit2.toMillis(1);
        f54518o = timeUnit.toMillis(10);
    }

    AbstractStream(FirestoreChannel firestoreChannel, C12972r0<ReqT, RespT> r0Var, AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, AsyncQueue.TimerId timerId2, CallbackT callbackt) {
        this.f54520b = firestoreChannel;
        this.f54521c = r0Var;
        this.f54523e = asyncQueue;
        this.f54524f = timerId2;
        this.f54529k = callbackt;
        this.f54522d = new IdleTimeoutRunnable();
        this.f54528j = new ExponentialBackoff(asyncQueue, timerId, f54515l, 1.5d, f54516m);
    }

    /* renamed from: e */
    private void m76129e() {
        AsyncQueue.DelayedTask delayedTask = this.f54519a;
        if (delayedTask != null) {
            delayedTask.mo63157e();
            this.f54519a = null;
        }
    }

    /* renamed from: f */
    private void m76130f(Stream.State state, C12537b1 b1Var) {
        Assert.m76443d(mo62994k(), "Only started streams should be closed.", new Object[0]);
        Stream.State state2 = Stream.State.Error;
        Assert.m76443d(state == state2 || b1Var.mo69064o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f54523e.mo63156t();
        if (Datastore.m76164d(b1Var)) {
            Util.m76526i(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", b1Var.mo69061l()));
        }
        m76129e();
        this.f54528j.mo63181b();
        this.f54526h++;
        C12537b1.C12539b m = b1Var.mo69062m();
        if (m == C12537b1.C12539b.OK) {
            this.f54528j.mo63182e();
        } else if (m == C12537b1.C12539b.RESOURCE_EXHAUSTED) {
            Logger.m76508a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f54528j.mo63183f();
        } else if (m == C12537b1.C12539b.UNAUTHENTICATED) {
            this.f54520b.mo63027e();
        } else if (m == C12537b1.C12539b.UNAVAILABLE && ((b1Var.mo69061l() instanceof UnknownHostException) || (b1Var.mo69061l() instanceof ConnectException))) {
            this.f54528j.mo63184g(f54518o);
        }
        if (state != state2) {
            Logger.m76508a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            mo62999s();
        }
        if (this.f54527i != null) {
            if (b1Var.mo69064o()) {
                Logger.m76508a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f54527i.mo63035a();
            }
            this.f54527i = null;
        }
        this.f54525g = state;
        this.f54529k.mo63092a(b1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m76131g() {
        if (mo62993j()) {
            m76130f(Stream.State.Initial, C12537b1.f59407f);
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m76132l(AbstractStream abstractStream) {
        Stream.State state = abstractStream.f54525g;
        Assert.m76443d(state == Stream.State.Backoff, "State should still be backoff but was %s", state);
        abstractStream.f54525g = Stream.State.Initial;
        abstractStream.mo62997q();
        Assert.m76443d(abstractStream.mo62994k(), "Stream should have started", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m76133o() {
        this.f54525g = Stream.State.Open;
        this.f54529k.mo63093b();
    }

    /* renamed from: p */
    private void m76134p() {
        Assert.m76443d(this.f54525g == Stream.State.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f54525g = Stream.State.Backoff;
        this.f54528j.mo63180a(AbstractStream$$Lambda$1.m76153a(this));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: h */
    public void mo62991h(C12537b1 b1Var) {
        Assert.m76443d(mo62994k(), "Can't handle server close on non-started stream!", new Object[0]);
        m76130f(Stream.State.Error, b1Var);
    }

    /* renamed from: i */
    public void mo62992i() {
        Assert.m76443d(!mo62994k(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f54523e.mo63156t();
        this.f54525g = Stream.State.Initial;
        this.f54528j.mo63182e();
    }

    /* renamed from: j */
    public boolean mo62993j() {
        this.f54523e.mo63156t();
        return this.f54525g == Stream.State.Open;
    }

    /* renamed from: k */
    public boolean mo62994k() {
        this.f54523e.mo63156t();
        Stream.State state = this.f54525g;
        return state == Stream.State.Starting || state == Stream.State.Open || state == Stream.State.Backoff;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo62995m() {
        if (mo62993j() && this.f54519a == null) {
            this.f54519a = this.f54523e.mo63151g(this.f54524f, f54517n, this.f54522d);
        }
    }

    /* renamed from: n */
    public abstract void mo62996n(RespT respt);

    /* renamed from: q */
    public void mo62997q() {
        this.f54523e.mo63156t();
        boolean z = true;
        Assert.m76443d(this.f54527i == null, "Last call still set", new Object[0]);
        Assert.m76443d(this.f54519a == null, "Idle timer still set", new Object[0]);
        Stream.State state = this.f54525g;
        if (state == Stream.State.Error) {
            m76134p();
            return;
        }
        if (state != Stream.State.Initial) {
            z = false;
        }
        Assert.m76443d(z, "Already started", new Object[0]);
        this.f54527i = this.f54520b.mo63028j(this.f54521c, new StreamObserver(new CloseGuardedRunner(this.f54526h)));
        this.f54525g = Stream.State.Starting;
    }

    /* renamed from: r */
    public void mo62998r() {
        if (mo62994k()) {
            m76130f(Stream.State.Initial, C12537b1.f59407f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo62999s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo63000t(ReqT reqt) {
        this.f54523e.mo63156t();
        Logger.m76508a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        m76129e();
        this.f54527i.mo69132c(reqt);
    }
}
