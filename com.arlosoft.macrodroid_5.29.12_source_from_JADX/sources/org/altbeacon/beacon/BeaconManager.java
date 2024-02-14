package org.altbeacon.beacon;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.altbeacon.beacon.service.BeaconService;
import org.altbeacon.beacon.service.C16010a;
import org.altbeacon.beacon.service.C16013d;
import org.altbeacon.beacon.service.C16015f;
import org.altbeacon.beacon.service.C16019j;
import org.altbeacon.beacon.service.C16021l;
import org.altbeacon.beacon.service.C16028n;
import org.altbeacon.beacon.service.C16030p;
import org.altbeacon.beacon.service.StartRMData;
import p097gd.C7354d;
import p281hd.C12438g;
import p290id.C12516a;
import p300jd.C13374a;

public class BeaconManager {

    /* renamed from: A */
    private static boolean f19569A = false;

    /* renamed from: B */
    private static boolean f19570B = false;

    /* renamed from: C */
    private static final Object f19571C = new Object();

    /* renamed from: D */
    private static long f19572D = 10000;
    @Nullable

    /* renamed from: E */
    protected static C12516a f19573E = null;

    /* renamed from: F */
    protected static String f19574F = "https://s3.amazonaws.com/android-beacon-library/android-distance.json";

    /* renamed from: G */
    protected static Class f19575G = C16021l.class;
    @Nullable

    /* renamed from: z */
    protected static volatile BeaconManager f19576z;
    @NonNull

    /* renamed from: a */
    private final Context f19577a;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: b */
    public final ConcurrentMap<C8050g, C8042b> f19578b = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public Messenger f19579c = null;
    @NonNull

    /* renamed from: d */
    protected final Set<C8052i> f19580d = new CopyOnWriteArraySet();
    @Nullable

    /* renamed from: e */
    protected C8052i f19581e = null;
    @NonNull

    /* renamed from: f */
    protected final Set<C8051h> f19582f = new CopyOnWriteArraySet();
    @NonNull

    /* renamed from: g */
    private final Set<Region> f19583g = new CopyOnWriteArraySet();
    @NonNull

    /* renamed from: h */
    private final Set<Region> f19584h = new HashSet();
    @NonNull

    /* renamed from: i */
    private final Set<Region> f19585i = new HashSet();
    @NonNull

    /* renamed from: j */
    private final List<BeaconParser> f19586j;
    @Nullable

    /* renamed from: k */
    private C12438g f19587k;

    /* renamed from: l */
    private boolean f19588l;

    /* renamed from: m */
    private boolean f19589m;

    /* renamed from: n */
    private boolean f19590n;

    /* renamed from: o */
    private boolean f19591o;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: p */
    public Boolean f19592p;

    /* renamed from: q */
    private boolean f19593q;
    @Nullable

    /* renamed from: r */
    private Notification f19594r;

    /* renamed from: s */
    private int f19595s;

    /* renamed from: t */
    private long f19596t;

    /* renamed from: u */
    private long f19597u;

    /* renamed from: v */
    private long f19598v;

    /* renamed from: w */
    private long f19599w;

    /* renamed from: x */
    private HashMap<Region, C8053j> f19600x;
    @Nullable

    /* renamed from: y */
    private C8045b f19601y;

    public class ServiceNotDeclaredException extends RuntimeException {
        public ServiceNotDeclaredException() {
            super("The BeaconService is not properly declared in AndroidManifest.xml.  If using Eclipse, please verify that your project.properties has manifestmerger.enabled=true");
        }
    }

    /* renamed from: org.altbeacon.beacon.BeaconManager$a */
    private class C8041a implements ServiceConnection {
        /* synthetic */ C8041a(BeaconManager beaconManager, C8047d dVar) {
            this();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C7354d.m30376a("BeaconManager", "we have a connection to the service now", new Object[0]);
            if (BeaconManager.this.f19592p == null) {
                Boolean unused = BeaconManager.this.f19592p = Boolean.FALSE;
            }
            Messenger unused2 = BeaconManager.this.f19579c = new Messenger(iBinder);
            BeaconManager.this.mo37998h();
            synchronized (BeaconManager.this.f19578b) {
                for (Map.Entry entry : BeaconManager.this.f19578b.entrySet()) {
                    if (!((C8042b) entry.getValue()).f19603a) {
                        ((C8050g) entry.getKey()).mo24564b();
                        ((C8042b) entry.getValue()).f19603a = true;
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C7354d.m30377b("BeaconManager", "onServiceDisconnected", new Object[0]);
            Messenger unused = BeaconManager.this.f19579c = null;
        }

        private C8041a() {
        }
    }

    /* renamed from: org.altbeacon.beacon.BeaconManager$b */
    private class C8042b {

        /* renamed from: a */
        public boolean f19603a = false;
        @NonNull

        /* renamed from: b */
        public C8041a f19604b;

        public C8042b() {
            this.f19604b = new C8041a(BeaconManager.this, (C8047d) null);
        }
    }

    protected BeaconManager(@NonNull Context context) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f19586j = copyOnWriteArrayList;
        this.f19588l = true;
        this.f19589m = false;
        this.f19590n = true;
        this.f19591o = false;
        this.f19592p = null;
        this.f19593q = false;
        this.f19594r = null;
        this.f19595s = -1;
        this.f19596t = 1100;
        this.f19597u = 0;
        this.f19598v = WorkRequest.MIN_BACKOFF_MILLIS;
        this.f19599w = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f19600x = new HashMap<>();
        this.f19601y = null;
        this.f19577a = context.getApplicationContext();
        mo38005m();
        if (!f19570B) {
            m33496l0();
        }
        copyOnWriteArrayList.add(new C8044a());
        m33492d0();
    }

    @NonNull
    /* renamed from: A */
    public static BeaconManager m33479A(@NonNull Context context) {
        BeaconManager beaconManager = f19576z;
        if (beaconManager == null) {
            synchronized (f19571C) {
                beaconManager = f19576z;
                if (beaconManager == null) {
                    beaconManager = new BeaconManager(context);
                    f19576z = beaconManager;
                }
            }
        }
        return beaconManager;
    }

    /* renamed from: H */
    public static long m33480H() {
        return f19572D;
    }

    /* renamed from: J */
    public static Class m33481J() {
        return f19575G;
    }

    /* renamed from: K */
    private long m33482K() {
        if (this.f19589m) {
            return this.f19598v;
        }
        return this.f19596t;
    }

    /* renamed from: M */
    public static boolean m33483M() {
        return f19569A;
    }

    /* renamed from: O */
    private boolean m33484O() {
        if (this.f19577a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        }
        C7354d.m30381f("BeaconManager", "This device does not support bluetooth LE.", new Object[0]);
        return false;
    }

    /* renamed from: P */
    private boolean m33485P() {
        if (m33498s() != null) {
            return true;
        }
        return m33484O();
    }

    /* renamed from: X */
    public static void m33486X(boolean z) {
        f19569A = z;
        BeaconManager beaconManager = f19576z;
        if (beaconManager != null) {
            beaconManager.mo37998h();
        }
    }

    /* renamed from: a0 */
    public static void m33488a0(long j) {
        f19572D = j;
        BeaconManager beaconManager = f19576z;
        if (beaconManager != null) {
            beaconManager.mo37998h();
        }
    }

    /* renamed from: d0 */
    private void m33492d0() {
        this.f19593q = Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: g */
    private void m33493g(int i, Region region) throws RemoteException {
        if (!mo37981N()) {
            C7354d.m30381f("BeaconManager", "The BeaconManager is not bound to the service.  Call beaconManager.bind(BeaconConsumer consumer) and wait for a callback to onBeaconServiceConnect()", new Object[0]);
        } else if (this.f19593q) {
            C16028n.m96632g().mo76507a(this.f19577a, this);
        } else {
            Message obtain = Message.obtain((Handler) null, i, 0, 0);
            if (i == 6) {
                obtain.setData(new StartRMData(m33482K(), m33499t(), this.f19589m).mo76426g());
            } else if (i == 7) {
                obtain.setData(new C16030p().mo76528b(this.f19577a).mo76529d());
            } else {
                obtain.setData(new StartRMData(region, m33495l(), m33482K(), m33499t(), this.f19589m).mo76426g());
            }
            this.f19579c.send(obtain);
        }
    }

    /* renamed from: i */
    private void m33494i() {
        C8045b bVar;
        if (mo37974C().size() == 0 && mo37977F().size() == 0 && (bVar = this.f19601y) != null) {
            mo38004k0(bVar);
            this.f19601y = null;
            this.f19584h.clear();
            this.f19585i.clear();
        }
    }

    /* renamed from: l */
    private String m33495l() {
        String packageName = this.f19577a.getPackageName();
        C7354d.m30376a("BeaconManager", "callback packageName: %s", packageName);
        return packageName;
    }

    /* renamed from: l0 */
    private void m33496l0() {
        List<ResolveInfo> queryIntentServices = this.f19577a.getPackageManager().queryIntentServices(new Intent(this.f19577a, BeaconService.class), 65536);
        if (queryIntentServices != null && queryIntentServices.isEmpty()) {
            throw new ServiceNotDeclaredException();
        }
    }

    /* renamed from: n */
    private boolean m33497n() {
        if (!mo37985T() || mo37982Q()) {
            return false;
        }
        C7354d.m30381f("BeaconManager", "Ranging/Monitoring may not be controlled from a separate BeaconScanner process.  To remove this warning, please wrap this call in: if (beaconManager.isMainProcess())", new Object[0]);
        return true;
    }

    @Nullable
    /* renamed from: s */
    public static C12516a m33498s() {
        return f19573E;
    }

    /* renamed from: t */
    private long m33499t() {
        if (this.f19589m) {
            return this.f19599w;
        }
        return this.f19597u;
    }

    /* renamed from: v */
    public static String m33500v() {
        return f19574F;
    }

    /* renamed from: B */
    public C16013d mo37973B() {
        return null;
    }

    @NonNull
    /* renamed from: C */
    public Collection<Region> mo37974C() {
        return C16015f.m96542d(this.f19577a).mo76444i();
    }

    @NonNull
    /* renamed from: D */
    public Set<C8051h> mo37975D() {
        return Collections.unmodifiableSet(this.f19582f);
    }

    @Nullable
    /* renamed from: E */
    public C12438g mo37976E() {
        return this.f19587k;
    }

    @NonNull
    /* renamed from: F */
    public Collection<Region> mo37977F() {
        return Collections.unmodifiableSet(this.f19583g);
    }

    @NonNull
    /* renamed from: G */
    public Set<C8052i> mo37978G() {
        return Collections.unmodifiableSet(this.f19580d);
    }

    @NonNull
    /* renamed from: I */
    public C8053j mo37979I(Region region) {
        C8053j jVar = this.f19600x.get(region);
        if (jVar != null) {
            return jVar;
        }
        C8053j jVar2 = new C8053j();
        this.f19600x.put(region, jVar2);
        return jVar2;
    }

    /* renamed from: L */
    public boolean mo37980L() {
        return this.f19593q;
    }

    /* renamed from: N */
    public boolean mo37981N() {
        boolean z;
        synchronized (this.f19578b) {
            z = !this.f19578b.isEmpty() && (this.f19593q || this.f19579c != null);
        }
        return z;
    }

    /* renamed from: Q */
    public boolean mo37982Q() {
        return this.f19591o;
    }

    /* renamed from: R */
    public boolean mo37983R() {
        return this.f19588l;
    }

    /* renamed from: S */
    public boolean mo37984S(Region region) {
        return this.f19600x.get(region) != null;
    }

    /* renamed from: T */
    public boolean mo37985T() {
        Boolean bool = this.f19592p;
        return bool != null && !bool.booleanValue();
    }

    /* renamed from: U */
    public void mo37986U() {
        if (!m33497n()) {
            this.f19582f.clear();
        }
    }

    /* renamed from: V */
    public void mo37987V() {
        this.f19580d.clear();
    }

    /* renamed from: W */
    public void mo37988W(@NonNull Region region) {
        if (!m33497n()) {
            C16019j r = C16015f.m96542d(this.f19577a).mo76451r(region);
            int i = 0;
            if (r != null && r.mo76473b()) {
                i = 1;
            }
            for (C8051h c : this.f19582f) {
                c.mo24569c(i, region);
            }
        }
    }

    /* renamed from: Y */
    public void mo37989Y(long j) {
        this.f19599w = j;
        if (Build.VERSION.SDK_INT >= 26 && j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            C7354d.m30381f("BeaconManager", "Setting a short backgroundBetweenScanPeriod has no effect on Android 8+, which is limited to scanning every ~15 minutes", new Object[0]);
        }
    }

    /* renamed from: Z */
    public void mo37990Z(long j) {
        this.f19596t = j;
    }

    /* renamed from: b0 */
    public void mo37991b0(boolean z) {
        this.f19588l = z;
        if (!mo37985T()) {
            if (z) {
                C16015f.m96542d(this.f19577a).mo76450q();
            } else {
                C16015f.m96542d(this.f19577a).mo76452s();
            }
        }
        mo37998h();
    }

    /* renamed from: c0 */
    public void mo37992c0(boolean z) {
        this.f19592p = Boolean.valueOf(z);
    }

    /* renamed from: e */
    public void mo37993e(@NonNull C8051h hVar) {
        if (!m33497n() && hVar != null) {
            this.f19582f.add(hVar);
        }
    }

    @Deprecated
    /* renamed from: e0 */
    public void mo37994e0(@NonNull Region region) throws RemoteException {
        if (!m33485P()) {
            C7354d.m30381f("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!m33497n()) {
            if (!mo37985T()) {
                C16015f.m96542d(this.f19577a).mo76440c(region, new C16010a(m33495l()));
            }
            m33493g(4, region);
            if (mo37985T()) {
                C16015f.m96542d(this.f19577a).mo76439a(region);
            }
            mo37988W(region);
        }
    }

    /* renamed from: f */
    public void mo37995f(@NonNull C8052i iVar) {
        if (iVar != null) {
            this.f19580d.add(iVar);
        }
    }

    @Deprecated
    /* renamed from: f0 */
    public void mo37996f0(@NonNull Region region) throws RemoteException {
        C7354d.m30376a("BeaconManager", "startRangingBeaconsInRegion", new Object[0]);
        if (!m33485P()) {
            C7354d.m30381f("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!m33497n()) {
            this.f19583g.remove(region);
            this.f19583g.add(region);
            m33493g(2, region);
        }
    }

    @Deprecated
    /* renamed from: g0 */
    public void mo37997g0(@NonNull Region region) throws RemoteException {
        if (!m33485P()) {
            C7354d.m30381f("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!m33497n()) {
            if (!mo37985T()) {
                C16015f.m96542d(this.f19577a).mo76447m(region);
            }
            m33493g(5, region);
            if (mo37985T()) {
                C16015f.m96542d(this.f19577a).mo76446l(region);
            }
            m33494i();
        }
    }

    /* renamed from: h */
    public void mo37998h() {
        if (!m33497n()) {
            if (!mo37981N()) {
                C7354d.m30376a("BeaconManager", "Not synchronizing settings to service, as it has not started up yet", new Object[0]);
            } else if (mo37985T()) {
                C7354d.m30376a("BeaconManager", "Synchronizing settings to service", new Object[0]);
                mo38000i0();
            } else {
                C7354d.m30376a("BeaconManager", "Not synchronizing settings to service, as it is in the same process", new Object[0]);
            }
        }
    }

    @Deprecated
    /* renamed from: h0 */
    public void mo37999h0(@NonNull Region region) throws RemoteException {
        C7354d.m30376a("BeaconManager", "stopRangingBeaconsInRegion", new Object[0]);
        if (!m33485P()) {
            C7354d.m30381f("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!m33497n()) {
            this.f19583g.remove(region);
            m33493g(3, region);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo38000i0() {
        if (this.f19593q) {
            C16028n.m96632g().mo76507a(this.f19577a, this);
            return;
        }
        try {
            m33493g(7, (Region) null);
        } catch (RemoteException e) {
            C7354d.m30377b("BeaconManager", "Failed to sync settings to service", e);
        }
    }

    @Deprecated
    /* renamed from: j */
    public void mo38001j(@NonNull C8045b bVar) {
        mo38003k(bVar);
    }

    @Deprecated
    /* renamed from: j0 */
    public void mo38002j0(@NonNull C8045b bVar) {
        mo38004k0(bVar);
    }

    /* renamed from: k */
    public void mo38003k(@NonNull C8050g gVar) {
        if (!m33485P()) {
            C7354d.m30381f("BeaconManager", "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.f19578b) {
            C8042b bVar = new C8042b();
            if (this.f19578b.putIfAbsent(gVar, bVar) != null) {
                C7354d.m30376a("BeaconManager", "This consumer is already bound", new Object[0]);
            } else {
                C7354d.m30376a("BeaconManager", "This consumer is not bound.  Binding now: %s", gVar);
                if (this.f19593q) {
                    C7354d.m30376a("BeaconManager", "Not starting beacon scanning service. Using scheduled jobs", new Object[0]);
                    gVar.mo24564b();
                } else {
                    C7354d.m30376a("BeaconManager", "Binding to service", new Object[0]);
                    Intent intent = new Intent(gVar.mo24565c(), BeaconService.class);
                    if (Build.VERSION.SDK_INT >= 26 && mo38013y() != null) {
                        if (mo37981N()) {
                            C7354d.m30379d("BeaconManager", "Not starting foreground beacon scanning service.  A consumer is already bound, so it should be started", new Object[0]);
                        } else {
                            C7354d.m30379d("BeaconManager", "Starting foreground beacon scanning service.", new Object[0]);
                            this.f19577a.startForegroundService(intent);
                        }
                    }
                    gVar.mo24566d(intent, bVar.f19604b, 1);
                }
                C7354d.m30376a("BeaconManager", "consumer count is now: %s", Integer.valueOf(this.f19578b.size()));
            }
        }
    }

    /* renamed from: k0 */
    public void mo38004k0(@NonNull C8050g gVar) {
        if (!m33485P()) {
            C7354d.m30381f("BeaconManager", "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.f19578b) {
            if (this.f19578b.containsKey(gVar)) {
                C7354d.m30376a("BeaconManager", "Unbinding", new Object[0]);
                if (this.f19593q) {
                    C7354d.m30376a("BeaconManager", "Not unbinding from scanning service as we are using scan jobs.", new Object[0]);
                } else {
                    gVar.mo24563a(((C8042b) this.f19578b.get(gVar)).f19604b);
                }
                C7354d.m30376a("BeaconManager", "Before unbind, consumer count is " + this.f19578b.size(), new Object[0]);
                this.f19578b.remove(gVar);
                C7354d.m30376a("BeaconManager", "After unbind, consumer count is " + this.f19578b.size(), new Object[0]);
                if (this.f19578b.size() == 0) {
                    this.f19579c = null;
                    if (this.f19593q) {
                        C7354d.m30379d("BeaconManager", "Cancelling scheduled jobs after unbind of last consumer.", new Object[0]);
                        C16028n.m96632g().mo76508c(this.f19577a);
                    }
                }
            } else {
                C7354d.m30376a("BeaconManager", "This consumer is not bound to: %s", gVar);
                C7354d.m30376a("BeaconManager", "Bound consumers: ", new Object[0]);
                for (Map.Entry value : this.f19578b.entrySet()) {
                    C7354d.m30376a("BeaconManager", String.valueOf(value.getValue()), new Object[0]);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo38005m() {
        C13374a aVar = new C13374a(this.f19577a);
        String c = aVar.mo70789c();
        String a = aVar.mo70787a();
        int b = aVar.mo70788b();
        this.f19591o = aVar.mo70790d();
        C7354d.m30379d("BeaconManager", "BeaconManager started up on pid " + b + " named '" + c + "' for application package '" + a + "'.  isMainProcess=" + this.f19591o, new Object[0]);
    }

    /* renamed from: o */
    public long mo38006o() {
        return this.f19599w;
    }

    /* renamed from: p */
    public boolean mo38007p() {
        return this.f19589m;
    }

    /* renamed from: q */
    public long mo38008q() {
        return this.f19598v;
    }

    @NonNull
    /* renamed from: r */
    public List<BeaconParser> mo38009r() {
        return this.f19586j;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: u */
    public C8052i mo38010u() {
        return this.f19581e;
    }

    /* renamed from: w */
    public long mo38011w() {
        return this.f19597u;
    }

    /* renamed from: x */
    public long mo38012x() {
        return this.f19596t;
    }

    /* renamed from: y */
    public Notification mo38013y() {
        return this.f19594r;
    }

    /* renamed from: z */
    public int mo38014z() {
        return this.f19595s;
    }
}
