package dev.skomlach.common.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p240d9.C11966a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001f¨\u0006#"}, mo71668d2 = {"Ldev/skomlach/common/network/ConnectionStateListener;", "", "Lja/u;", "d", "", "newState", "c", "", "delaySeconds", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isConnectionOk", "Ldev/skomlach/common/network/e;", "b", "Ldev/skomlach/common/network/e;", "ping", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "receiverTypeConnection", "Landroid/content/Context;", "f", "Landroid/content/Context;", "appContext", "()Z", "isConnected", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ConnectionStateListener.kt */
public final class ConnectionStateListener {

    /* renamed from: a */
    private final AtomicBoolean f58398a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12129e f58399b = new C12129e(this);

    /* renamed from: c */
    private ConnectivityManager f58400c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f58401d;

    /* renamed from: e */
    private BroadcastReceiver f58402e;

    /* renamed from: f */
    private final Context f58403f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"dev/skomlach/common/network/ConnectionStateListener$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lja/u;", "onUnavailable", "Landroid/net/Network;", "network", "onAvailable", "onLost", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: dev.skomlach.common.network.ConnectionStateListener$a */
    /* compiled from: ConnectionStateListener.kt */
    public static final class C12124a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final /* synthetic */ ConnectionStateListener f58405a;

        C12124a(ConnectionStateListener connectionStateListener) {
            this.f58405a = connectionStateListener;
        }

        public void onAvailable(Network network) {
            C13706o.m87929f(network, "network");
            this.f58405a.f58399b.mo68343l(1);
        }

        public void onLost(Network network) {
            C13706o.m87929f(network, "network");
            this.f58405a.f58399b.mo68343l(1);
        }

        public void onUnavailable() {
            this.f58405a.f58399b.mo68343l(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (((r2 == null || (r2 = r2.getActiveNetworkInfo()) == null || !r2.isConnectedOrConnecting()) ? false : true) != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r2.isConnectedOrConnecting() == true) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionStateListener() {
        /*
            r6 = this;
            r6.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r6.f58398a = r0
            dev.skomlach.common.network.e r2 = new dev.skomlach.common.network.e
            r2.<init>(r6)
            r6.f58399b = r2
            dev.skomlach.common.contextprovider.a r2 = dev.skomlach.common.contextprovider.C12104a.f58372a
            android.content.Context r2 = r2.mo68283g()
            r6.f58403f = r2
            java.lang.String r3 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r6.f58400c = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 1
            r5 = 28
            if (r3 < r5) goto L_0x004e
            if (r2 == 0) goto L_0x0035
            boolean r2 = r2.isDefaultNetworkActive()
            if (r2 != r4) goto L_0x0035
            r2 = 1
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 != 0) goto L_0x005c
            android.net.ConnectivityManager r2 = r6.f58400c
            if (r2 == 0) goto L_0x004a
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L_0x004a
            boolean r2 = r2.isConnectedOrConnecting()
            if (r2 != r4) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            if (r2 == 0) goto L_0x005d
            goto L_0x005c
        L_0x004e:
            if (r2 == 0) goto L_0x005d
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L_0x005d
            boolean r2 = r2.isConnectedOrConnecting()
            if (r2 != r4) goto L_0x005d
        L_0x005c:
            r1 = 1
        L_0x005d:
            r0.set(r1)
            dev.skomlach.common.network.ConnectionStateListener$a r0 = new dev.skomlach.common.network.ConnectionStateListener$a
            r0.<init>(r6)
            r6.f58401d = r0
            dev.skomlach.common.network.ConnectionStateListener$2 r0 = new dev.skomlach.common.network.ConnectionStateListener$2
            r0.<init>(r6)
            r6.f58402e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.common.network.ConnectionStateListener.<init>():void");
    }

    /* renamed from: b */
    public final boolean mo68326b() {
        return this.f58398a.get();
    }

    /* renamed from: c */
    public final void mo68327c(boolean z) {
        this.f58399b.mo68342c();
        if (z != this.f58398a.get()) {
            this.f58398a.set(z);
            C11966a aVar = C11966a.f58161a;
            aVar.mo67379b("ConnectionStateListener detected new connection state - " + z);
            Connection.f58385a.mo68319f();
        }
    }

    /* renamed from: d */
    public final void mo68328d() {
        ConnectivityManager connectivityManager;
        try {
            ConnectivityManager.NetworkCallback networkCallback = this.f58401d;
            if (networkCallback != null && (connectivityManager = this.f58400c) != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), networkCallback);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public final void mo68329e(long j) {
        this.f58399b.mo68343l(j);
    }
}
