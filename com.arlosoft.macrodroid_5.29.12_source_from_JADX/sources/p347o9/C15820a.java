package p347o9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;
import p292io.grpc.C12542c;
import p292io.grpc.C12558f;
import p292io.grpc.C12926n;
import p292io.grpc.C12930o0;
import p292io.grpc.C12951p0;
import p292io.grpc.C12972r0;
import p292io.grpc.C13008x;
import p360p9.C16114e;

/* renamed from: o9.a */
/* compiled from: AndroidChannelBuilder */
public final class C15820a extends C13008x<C15820a> {

    /* renamed from: c */
    private static final Class<?> f65250c = m95413j();

    /* renamed from: a */
    private final C12951p0<?> f65251a;

    /* renamed from: b */
    private Context f65252b;

    @VisibleForTesting
    /* renamed from: o9.a$b */
    /* compiled from: AndroidChannelBuilder */
    static final class C15822b extends C12930o0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12930o0 f65253a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Context f65254b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final ConnectivityManager f65255c;

        /* renamed from: d */
        private final Object f65256d = new Object();

        /* renamed from: e */
        private Runnable f65257e;

        /* renamed from: o9.a$b$a */
        /* compiled from: AndroidChannelBuilder */
        class C15823a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15825c f65258a;

            C15823a(C15825c cVar) {
                this.f65258a = cVar;
            }

            public void run() {
                C15822b.this.f65255c.unregisterNetworkCallback(this.f65258a);
            }
        }

        /* renamed from: o9.a$b$b */
        /* compiled from: AndroidChannelBuilder */
        class C15824b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15826d f65260a;

            C15824b(C15826d dVar) {
                this.f65260a = dVar;
            }

            public void run() {
                C15822b.this.f65254b.unregisterReceiver(this.f65260a);
            }
        }

        /* renamed from: o9.a$b$c */
        /* compiled from: AndroidChannelBuilder */
        private class C15825c extends ConnectivityManager.NetworkCallback {

            /* renamed from: a */
            private boolean f65262a;

            private C15825c() {
                this.f65262a = false;
            }

            public void onAvailable(Network network) {
                if (this.f65262a) {
                    C15822b.this.f65253a.mo69270j();
                } else {
                    C15822b.this.f65253a.mo69273m();
                }
                this.f65262a = true;
            }

            public void onLost(Network network) {
                this.f65262a = false;
            }
        }

        /* renamed from: o9.a$b$d */
        /* compiled from: AndroidChannelBuilder */
        private class C15826d extends BroadcastReceiver {

            /* renamed from: a */
            private boolean f65264a;

            private C15826d() {
                this.f65264a = false;
            }

            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z = this.f65264a;
                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f65264a = z2;
                if (z2 && !z) {
                    C15822b.this.f65253a.mo69273m();
                }
            }
        }

        @VisibleForTesting
        C15822b(C12930o0 o0Var, Context context) {
            this.f65253a = o0Var;
            this.f65254b = context;
            if (context != null) {
                this.f65255c = (ConnectivityManager) context.getSystemService("connectivity");
                try {
                    m95421s();
                } catch (SecurityException e) {
                    Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
                }
            } else {
                this.f65255c = null;
            }
        }

        /* renamed from: s */
        private void m95421s() {
            if (Build.VERSION.SDK_INT < 24 || this.f65255c == null) {
                C15826d dVar = new C15826d();
                this.f65254b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f65257e = new C15824b(dVar);
                return;
            }
            C15825c cVar = new C15825c();
            this.f65255c.registerDefaultNetworkCallback(cVar);
            this.f65257e = new C15823a(cVar);
        }

        /* renamed from: t */
        private void m95422t() {
            synchronized (this.f65256d) {
                Runnable runnable = this.f65257e;
                if (runnable != null) {
                    runnable.run();
                    this.f65257e = null;
                }
            }
        }

        /* renamed from: a */
        public String mo69114a() {
            return this.f65253a.mo69114a();
        }

        /* renamed from: h */
        public <RequestT, ResponseT> C12558f<RequestT, ResponseT> mo69115h(C12972r0<RequestT, ResponseT> r0Var, C12542c cVar) {
            return this.f65253a.mo69115h(r0Var, cVar);
        }

        /* renamed from: i */
        public boolean mo69269i(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f65253a.mo69269i(j, timeUnit);
        }

        /* renamed from: j */
        public void mo69270j() {
            this.f65253a.mo69270j();
        }

        /* renamed from: k */
        public C12926n mo69271k(boolean z) {
            return this.f65253a.mo69271k(z);
        }

        /* renamed from: l */
        public void mo69272l(C12926n nVar, Runnable runnable) {
            this.f65253a.mo69272l(nVar, runnable);
        }

        /* renamed from: m */
        public void mo69273m() {
            this.f65253a.mo69273m();
        }

        /* renamed from: n */
        public C12930o0 mo69274n() {
            m95422t();
            return this.f65253a.mo69274n();
        }

        /* renamed from: o */
        public C12930o0 mo69275o() {
            m95422t();
            return this.f65253a.mo69275o();
        }
    }

    private C15820a(C12951p0<?> p0Var) {
        this.f65251a = (C12951p0) Preconditions.m5393t(p0Var, "delegateBuilder");
    }

    /* renamed from: j */
    private static Class<?> m95413j() {
        Class<C16114e> cls = C16114e.class;
        try {
            int i = C16114e.f66105c0;
            return cls;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static C15820a m95414k(C12951p0<?> p0Var) {
        return new C15820a(p0Var);
    }

    /* renamed from: a */
    public C12930o0 mo69212a() {
        return new C15822b(this.f65251a.mo69212a(), this.f65252b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12951p0<?> mo69866e() {
        return this.f65251a;
    }

    /* renamed from: i */
    public C15820a mo75601i(Context context) {
        this.f65252b = context;
        return this;
    }
}
