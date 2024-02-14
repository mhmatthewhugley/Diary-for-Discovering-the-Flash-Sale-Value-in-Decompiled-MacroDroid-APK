package p196y4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import p090f5.C7315j;
import p196y4.C10410c;

/* renamed from: y4.e */
/* compiled from: DefaultConnectivityMonitor */
final class C10413e implements C10410c {

    /* renamed from: a */
    private final Context f23652a;

    /* renamed from: b */
    final C10410c.C10411a f23653b;

    /* renamed from: c */
    boolean f23654c;

    /* renamed from: d */
    private boolean f23655d;

    /* renamed from: e */
    private final BroadcastReceiver f23656e = new C10414a();

    /* renamed from: y4.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C10414a extends BroadcastReceiver {
        C10414a() {
        }

        public void onReceive(@NonNull Context context, Intent intent) {
            C10413e eVar = C10413e.this;
            boolean z = eVar.f23654c;
            eVar.f23654c = eVar.mo41110i(context);
            if (z != C10413e.this.f23654c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(C10413e.this.f23654c);
                }
                C10413e eVar2 = C10413e.this;
                eVar2.f23653b.mo37198a(eVar2.f23654c);
            }
        }
    }

    C10413e(@NonNull Context context, @NonNull C10410c.C10411a aVar) {
        this.f23652a = context.getApplicationContext();
        this.f23653b = aVar;
    }

    /* renamed from: j */
    private void m40785j() {
        if (!this.f23655d) {
            this.f23654c = mo41110i(this.f23652a);
            try {
                this.f23652a.registerReceiver(this.f23656e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f23655d = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: k */
    private void m40786k() {
        if (this.f23655d) {
            this.f23652a.unregisterReceiver(this.f23656e);
            this.f23655d = false;
        }
    }

    /* renamed from: N */
    public void mo24581N() {
        m40786k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo41110i(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C7315j.m30204d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    public void onDestroy() {
    }

    public void onStart() {
        m40785j();
    }
}
