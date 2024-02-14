package dev.skomlach.common.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12114c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001/B\t\b\u0002¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002XD¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010*\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0011\u0010,\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b#\u0010+¨\u00060"}, mo71668d2 = {"Ldev/skomlach/common/network/Connection;", "", "Lja/u;", "e", "j", "f", "h", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "Ldev/skomlach/common/network/ConnectionStateListener;", "c", "Ldev/skomlach/common/network/ConnectionStateListener;", "g", "()Ldev/skomlach/common/network/ConnectionStateListener;", "connectionStateListener", "Landroid/net/ConnectivityManager;", "d", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "Ldev/skomlach/common/network/Connection$a;", "Ljava/util/List;", "netlistLis", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "screenLockReceiver", "", "Ljava/lang/String;", "ACTION", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "job", "Ljava/util/concurrent/atomic/AtomicReference;", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "lastActiveNetworkInfo", "", "Z", "lastKnownConnection", "l", "checkConnection", "()Z", "isConnection", "<init>", "()V", "a", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Connection.kt */
public final class Connection {

    /* renamed from: a */
    public static final Connection f58385a;

    /* renamed from: b */
    private static final Context f58386b;

    /* renamed from: c */
    private static final ConnectionStateListener f58387c = new ConnectionStateListener();

    /* renamed from: d */
    private static final ConnectivityManager f58388d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final List<C12121a> f58389e;

    /* renamed from: f */
    private static final BroadcastReceiver f58390f = new Connection$screenLockReceiver$1();

    /* renamed from: g */
    private static final String f58391g = "check_network";

    /* renamed from: h */
    private static Runnable f58392h;

    /* renamed from: i */
    private static AtomicReference<Object> f58393i = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static boolean f58394j;

    /* renamed from: k */
    private static final C16254a<C13339u> f58395k = C12122b.f58397a;

    /* renamed from: l */
    private static final BroadcastReceiver f58396l = new Connection$checkConnection$1();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/common/network/Connection$a;", "", "", "isConnected", "Lja/u;", "a", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: dev.skomlach.common.network.Connection$a */
    /* compiled from: Connection.kt */
    public interface C12121a {
        /* renamed from: a */
        void mo68323a(boolean z);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "invoke", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: dev.skomlach.common.network.Connection$b */
    /* compiled from: Connection.kt */
    static final class C12122b extends C13708q implements C16254a<C13339u> {

        /* renamed from: a */
        public static final C12122b f58397a = new C12122b();

        C12122b() {
            super(0);
        }

        public final void invoke() {
            ArrayList arrayList = new ArrayList(Connection.f58389e);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C12121a) arrayList.get(i)).mo68323a(Connection.f58394j);
            }
        }
    }

    static {
        Connection connection = new Connection();
        f58385a = connection;
        Context g = C12104a.f58372a.mo68283g();
        f58386b = g;
        f58388d = (ConnectivityManager) g.getSystemService("connectivity");
        List<C12121a> synchronizedList = Collections.synchronizedList(new ArrayList());
        C13706o.m87928e(synchronizedList, "synchronizedList(ArrayList<NetworkListener>())");
        f58389e = synchronizedList;
        connection.mo68321h();
    }

    private Connection() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m82601e() {
        try {
            Object obj = null;
            if (Build.VERSION.SDK_INT >= 24) {
                ConnectivityManager connectivityManager = f58388d;
                if (connectivityManager != null) {
                    obj = connectivityManager.getActiveNetwork();
                }
            } else {
                ConnectivityManager connectivityManager2 = f58388d;
                if (connectivityManager2 != null) {
                    obj = connectivityManager2.getActiveNetworkInfo();
                }
            }
            boolean i = mo68322i();
            if ((obj != null && !C13706o.m87924a(obj, f58393i.get())) || i != f58394j) {
                f58393i.set(obj);
                f58394j = i;
                m82602j();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    private final void m82602j() {
        Runnable runnable = f58392h;
        if (runnable != null) {
            C12114c.f58379a.mo68307i(runnable);
        }
        C12125a aVar = C12125a.f58406a;
        f58392h = aVar;
        if (aVar != null) {
            C12114c.f58379a.mo68306h(aVar, TimeUnit.SECONDS.toMillis(1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m82603k() {
        f58395k.invoke();
    }

    /* renamed from: f */
    public final void mo68319f() {
        LocalBroadcastManager.getInstance(f58386b).sendBroadcast(new Intent(f58391g));
    }

    /* renamed from: g */
    public final ConnectionStateListener mo68320g() {
        return f58387c;
    }

    /* renamed from: h */
    public final void mo68321h() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        Context context = f58386b;
        context.registerReceiver(f58390f, intentFilter);
        f58387c.mo68328d();
        LocalBroadcastManager.getInstance(context).registerReceiver(f58396l, new IntentFilter(f58391g));
    }

    /* renamed from: i */
    public final boolean mo68322i() {
        ConnectionStateListener connectionStateListener = f58387c;
        connectionStateListener.mo68329e(0);
        return connectionStateListener.mo68326b();
    }
}
