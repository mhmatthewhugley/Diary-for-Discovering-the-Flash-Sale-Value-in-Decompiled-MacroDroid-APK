package com.google.firebase.firestore.remote;

import androidx.work.WorkRequest;
import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.util.Locale;
import p292io.grpc.C12537b1;

class OnlineStateTracker {

    /* renamed from: a */
    private OnlineState f54628a = OnlineState.UNKNOWN;

    /* renamed from: b */
    private int f54629b;

    /* renamed from: c */
    private AsyncQueue.DelayedTask f54630c;

    /* renamed from: d */
    private boolean f54631d = true;

    /* renamed from: e */
    private final AsyncQueue f54632e;

    /* renamed from: f */
    private final OnlineStateCallback f54633f;

    interface OnlineStateCallback {
        /* renamed from: a */
        void mo63048a(OnlineState onlineState);
    }

    OnlineStateTracker(AsyncQueue asyncQueue, OnlineStateCallback onlineStateCallback) {
        this.f54632e = asyncQueue;
        this.f54633f = onlineStateCallback;
    }

    /* renamed from: a */
    private void m76243a() {
        AsyncQueue.DelayedTask delayedTask = this.f54630c;
        if (delayedTask != null) {
            delayedTask.mo63157e();
            this.f54630c = null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m76244d(OnlineStateTracker onlineStateTracker) {
        onlineStateTracker.f54630c = null;
        Assert.m76443d(onlineStateTracker.f54628a == OnlineState.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        onlineStateTracker.m76245e(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", new Object[]{10}));
        onlineStateTracker.m76246f(OnlineState.OFFLINE);
    }

    /* renamed from: e */
    private void m76245e(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", new Object[]{str});
        if (this.f54631d) {
            Logger.m76511d("OnlineStateTracker", "%s", format);
            this.f54631d = false;
            return;
        }
        Logger.m76508a("OnlineStateTracker", "%s", format);
    }

    /* renamed from: f */
    private void m76246f(OnlineState onlineState) {
        if (onlineState != this.f54628a) {
            this.f54628a = onlineState;
            this.f54633f.mo63048a(onlineState);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63045b(C12537b1 b1Var) {
        boolean z = true;
        if (this.f54628a == OnlineState.ONLINE) {
            m76246f(OnlineState.UNKNOWN);
            Assert.m76443d(this.f54629b == 0, "watchStreamFailures must be 0", new Object[0]);
            if (this.f54630c != null) {
                z = false;
            }
            Assert.m76443d(z, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i = this.f54629b + 1;
        this.f54629b = i;
        if (i >= 1) {
            m76243a();
            m76245e(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", new Object[]{1, b1Var}));
            m76246f(OnlineState.OFFLINE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo63046c() {
        if (this.f54629b == 0) {
            m76246f(OnlineState.UNKNOWN);
            Assert.m76443d(this.f54630c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f54630c = this.f54632e.mo63151g(AsyncQueue.TimerId.ONLINE_STATE_TIMEOUT, WorkRequest.MIN_BACKOFF_MILLIS, OnlineStateTracker$$Lambda$1.m76251a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo63047g(OnlineState onlineState) {
        m76243a();
        this.f54629b = 0;
        if (onlineState == OnlineState.ONLINE) {
            this.f54631d = false;
        }
        m76246f(onlineState);
    }
}
