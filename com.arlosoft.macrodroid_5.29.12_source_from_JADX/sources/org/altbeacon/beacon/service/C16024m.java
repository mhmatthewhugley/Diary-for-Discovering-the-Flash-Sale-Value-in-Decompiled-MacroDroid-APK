package org.altbeacon.beacon.service;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import p097gd.C7354d;
import p281hd.C12420a;
import p281hd.C12421b;
import p281hd.C12437f;
import p281hd.C12438g;
import p281hd.C12439h;
import p310kd.C13551b;

/* renamed from: org.altbeacon.beacon.service.m */
/* compiled from: ScanHelper */
class C16024m {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f65941l = "m";
    @Nullable

    /* renamed from: a */
    private ExecutorService f65942a;

    /* renamed from: b */
    private BeaconManager f65943b;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public C12421b f65944c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C16015f f65945d;

    /* renamed from: e */
    private final Map<Region, C16016g> f65946e = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C12437f f65947f = new C12437f();
    @NonNull

    /* renamed from: g */
    private C16012c f65948g = new C16012c();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Set<BeaconParser> f65949h = new HashSet();

    /* renamed from: i */
    private List<Beacon> f65950i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f65951j;

    /* renamed from: k */
    private final C12420a f65952k = new C16025a();

    /* renamed from: org.altbeacon.beacon.service.m$a */
    /* compiled from: ScanHelper */
    class C16025a implements C12420a {
        C16025a() {
        }

        @MainThread
        /* renamed from: a */
        public void mo68784a(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j) {
            C16024m.this.mo76491r(bluetoothDevice, i, bArr, j);
        }

        @MainThread
        /* renamed from: b */
        public void mo68785b() {
            if (BeaconManager.m33498s() != null) {
                C7354d.m30376a(C16024m.f65941l, "Beacon simulator enabled", new Object[0]);
                if (BeaconManager.m33498s().mo69013a() != null) {
                    ApplicationInfo applicationInfo = C16024m.this.f65951j.getApplicationInfo();
                    int i = applicationInfo.flags & 2;
                    applicationInfo.flags = i;
                    if (i != 0) {
                        String a = C16024m.f65941l;
                        C7354d.m30376a(a, "Beacon simulator returns " + BeaconManager.m33498s().mo69013a().size() + " beacons.", new Object[0]);
                        for (Beacon c : BeaconManager.m33498s().mo69013a()) {
                            C16024m.this.m96608p(c);
                        }
                    } else {
                        C7354d.m30381f(C16024m.f65941l, "Beacon simulations provided, but ignored because we are not running in debug mode.  Please remove beacon simulations for production.", new Object[0]);
                    }
                } else {
                    C7354d.m30381f(C16024m.f65941l, "getBeacons is returning null. No simulated beacons to report.", new Object[0]);
                }
            } else if (C7354d.m30380e()) {
                C7354d.m30376a(C16024m.f65941l, "Beacon simulator not enabled", new Object[0]);
            }
            C16024m.this.f65947f.mo68819a();
            C16024m.this.f65945d.mo76456w();
            C16024m.this.m96609q();
        }
    }

    /* renamed from: org.altbeacon.beacon.service.m$b */
    /* compiled from: ScanHelper */
    private class C16026b {

        /* renamed from: a */
        final int f65954a;
        @NonNull

        /* renamed from: b */
        BluetoothDevice f65955b;
        @NonNull

        /* renamed from: c */
        byte[] f65956c;
        @NonNull

        /* renamed from: d */
        long f65957d;

        C16026b(@NonNull BluetoothDevice bluetoothDevice, int i, @NonNull byte[] bArr, long j) {
            this.f65955b = bluetoothDevice;
            this.f65954a = i;
            this.f65956c = bArr;
            this.f65957d = j;
        }
    }

    /* renamed from: org.altbeacon.beacon.service.m$c */
    /* compiled from: ScanHelper */
    private class C16027c extends AsyncTask<C16026b, Void, Void> {

        /* renamed from: a */
        final C16011b f65959a = C16011b.m96530a();

        /* renamed from: b */
        private final C12438g f65960b;

        C16027c(C12438g gVar) {
            this.f65960b = gVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x0028, LOOP_START, PHI: r3 
          PHI: (r3v1 org.altbeacon.beacon.Beacon) = (r3v0 org.altbeacon.beacon.Beacon), (r3v5 org.altbeacon.beacon.Beacon) binds: [B:0:0x0000, B:4:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        @androidx.annotation.WorkerThread
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(org.altbeacon.beacon.service.C16024m.C16026b... r11) {
            /*
                r10 = this;
                r0 = 0
                r11 = r11[r0]
                org.altbeacon.beacon.service.m r1 = org.altbeacon.beacon.service.C16024m.this
                java.util.Set r1 = r1.f65949h
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
                r3 = r2
            L_0x000f:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x002a
                java.lang.Object r3 = r1.next()
                r4 = r3
                org.altbeacon.beacon.BeaconParser r4 = (org.altbeacon.beacon.BeaconParser) r4
                byte[] r5 = r11.f65956c
                int r6 = r11.f65954a
                android.bluetooth.BluetoothDevice r7 = r11.f65955b
                long r8 = r11.f65957d
                org.altbeacon.beacon.Beacon r3 = r4.mo38018g(r5, r6, r7, r8)
                if (r3 == 0) goto L_0x000f
            L_0x002a:
                if (r3 == 0) goto L_0x00a0
                boolean r1 = p097gd.C7354d.m30380e()
                if (r1 == 0) goto L_0x0058
                java.lang.String r1 = org.altbeacon.beacon.service.C16024m.f65941l
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Beacon packet detected for: "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r5 = " with rssi "
                r4.append(r5)
                int r5 = r3.mo37956l()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.Object[] r5 = new java.lang.Object[r0]
                p097gd.C7354d.m30376a(r1, r4, r5)
            L_0x0058:
                org.altbeacon.beacon.service.b r1 = r10.f65959a
                r1.mo76434c()
                org.altbeacon.beacon.service.m r1 = org.altbeacon.beacon.service.C16024m.this
                hd.b r1 = r1.f65944c
                if (r1 == 0) goto L_0x009a
                org.altbeacon.beacon.service.m r1 = org.altbeacon.beacon.service.C16024m.this
                hd.b r1 = r1.f65944c
                boolean r1 = r1.mo68793m()
                if (r1 != 0) goto L_0x009a
                org.altbeacon.beacon.service.m r1 = org.altbeacon.beacon.service.C16024m.this
                hd.f r1 = r1.f65947f
                android.bluetooth.BluetoothDevice r4 = r11.f65955b
                java.lang.String r4 = r4.getAddress()
                byte[] r11 = r11.f65956c
                boolean r11 = r1.mo68820b(r4, r11)
                if (r11 != 0) goto L_0x009a
                java.lang.String r11 = org.altbeacon.beacon.service.C16024m.f65941l
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Non-distinct packets detected in a single scan.  Restarting scans unecessary."
                p097gd.C7354d.m30379d(r11, r1, r0)
                org.altbeacon.beacon.service.m r11 = org.altbeacon.beacon.service.C16024m.this
                hd.b r11 = r11.f65944c
                r0 = 1
                r11.mo68797s(r0)
            L_0x009a:
                org.altbeacon.beacon.service.m r11 = org.altbeacon.beacon.service.C16024m.this
                r11.m96608p(r3)
                goto L_0x00ad
            L_0x00a0:
                hd.g r0 = r10.f65960b
                if (r0 == 0) goto L_0x00ad
                android.bluetooth.BluetoothDevice r1 = r11.f65955b
                int r3 = r11.f65954a
                byte[] r11 = r11.f65956c
                r0.mo68821a(r1, r3, r11)
            L_0x00ad:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C16024m.C16027c.doInBackground(org.altbeacon.beacon.service.m$b[]):java.lang.Void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(Void... voidArr) {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    C16024m(Context context) {
        C7354d.m30376a(f65941l, "new ScanHelper", new Object[0]);
        this.f65951j = context;
        this.f65943b = BeaconManager.m33479A(context);
    }

    /* renamed from: k */
    private ExecutorService m96606k() {
        if (this.f65942a == null) {
            this.f65942a = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        }
        return this.f65942a;
    }

    /* renamed from: o */
    private List<Region> m96607o(Beacon beacon, Collection<Region> collection) {
        ArrayList arrayList = new ArrayList();
        for (Region next : collection) {
            if (next != null) {
                if (next.mo38039g(beacon)) {
                    arrayList.add(next);
                } else {
                    C7354d.m30376a(f65941l, "This region (%s) does not match beacon: %s", next, beacon);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: p */
    public void m96608p(@NonNull Beacon beacon) {
        if (C16031q.m96660c().mo76531d()) {
            C16031q.m96660c().mo76532e(beacon);
        }
        if (C7354d.m30380e()) {
            C7354d.m30376a(f65941l, "beacon detected : %s", beacon.toString());
        }
        Beacon b = this.f65948g.mo76435b(beacon);
        if (b != null) {
            this.f65945d.mo76455v(b);
            C7354d.m30376a(f65941l, "looking for ranging region matches for this beacon", new Object[0]);
            synchronized (this.f65946e) {
                for (Region next : m96607o(b, this.f65946e.keySet())) {
                    C7354d.m30376a(f65941l, "matches ranging region: %s", next);
                    C16016g gVar = this.f65946e.get(next);
                    if (gVar != null) {
                        gVar.mo76457a(b);
                    }
                }
            }
        } else if (C7354d.m30380e()) {
            C7354d.m30376a(f65941l, "not processing detections for GATT extra data beacon", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m96609q() {
        synchronized (this.f65946e) {
            for (Region next : this.f65946e.keySet()) {
                C16016g gVar = this.f65946e.get(next);
                C7354d.m30376a(f65941l, "Calling ranging callback", new Object[0]);
                gVar.mo76459c().mo76432a(this.f65951j, "rangingData", new C16018i(gVar.mo76458b(), next).mo76471d());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(api = 26)
    /* renamed from: A */
    public void mo76483A() {
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.f65951j.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter == null) {
                C7354d.m30381f(f65941l, "Failed to construct a BluetoothAdapter", new Object[0]);
            } else if (!adapter.isEnabled()) {
                C7354d.m30381f(f65941l, "BluetoothAdapter is not enabled", new Object[0]);
            } else {
                BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(mo76490n());
                }
            }
        } catch (SecurityException unused) {
            C7354d.m30377b(f65941l, "SecurityException stopping Android O background scanner", new Object[0]);
        } catch (NullPointerException e) {
            C7354d.m30377b(f65941l, "NullPointerException stopping Android O background scanner", e);
        } catch (RuntimeException e2) {
            C7354d.m30377b(f65941l, "Unexpected runtime exception stopping Android O background scanner", e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo76484B() {
        ExecutorService executorService = this.f65942a;
        if (executorService != null) {
            executorService.shutdown();
            try {
                if (!this.f65942a.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                    C7354d.m30377b(f65941l, "Can't stop beacon parsing thread.", new Object[0]);
                }
            } catch (InterruptedException unused) {
                C7354d.m30377b(f65941l, "Interrupted waiting to stop beacon parsing thread.", new Object[0]);
            }
            this.f65942a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        mo76484B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo76486i(boolean z, C13551b bVar) {
        this.f65944c = C12421b.m83325g(this.f65951j, 1100, 0, z, this.f65952k, bVar);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: j */
    public C12421b mo76487j() {
        return this.f65944c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C16015f mo76488l() {
        return this.f65945d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Map<Region, C16016g> mo76489m() {
        return this.f65946e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public PendingIntent mo76490n() {
        Intent intent = new Intent(this.f65951j, StartupBroadcastReceiver.class);
        intent.putExtra("o-scan", true);
        return PendingIntent.getBroadcast(this.f65951j, 0, intent, 167772160);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo76491r(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j) {
        try {
            new C16027c(this.f65943b.mo37976E()).executeOnExecutor(m96606k(), new C16026b[]{new C16026b(bluetoothDevice, i, bArr, j)});
        } catch (RejectedExecutionException unused) {
            C7354d.m30381f(f65941l, "Ignoring scan result because we cannot keep up.", new Object[0]);
        } catch (OutOfMemoryError unused2) {
            C7354d.m30381f(f65941l, "Ignoring scan result because we cannot start a thread to keep up.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo76492s() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f65943b.mo38009r());
        boolean z = true;
        for (BeaconParser next : this.f65943b.mo38009r()) {
            if (next.mo38021i().size() > 0) {
                z = false;
                hashSet.addAll(next.mo38021i());
            }
        }
        this.f65949h = hashSet;
        this.f65948g = new C16012c(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo76493t(Set<BeaconParser> set) {
        this.f65949h = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo76494u(@NonNull C16012c cVar) {
        this.f65948g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo76495v(C16015f fVar) {
        this.f65945d = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo76496w(Map<Region, C16016g> map) {
        C7354d.m30376a(f65941l, "rangeRegionState updated with %d regions", Integer.valueOf(map.size()));
        synchronized (this.f65946e) {
            this.f65946e.clear();
            this.f65946e.putAll(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo76497x(List<Beacon> list) {
        this.f65950i = list;
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(api = 26)
    /* renamed from: y */
    public void mo76498y(Set<BeaconParser> set) {
        mo76499z(set, (List<Region>) null);
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(api = 26)
    /* renamed from: z */
    public void mo76499z(Set<BeaconParser> set, List<Region> list) {
        ScanSettings build = new ScanSettings.Builder().setScanMode(0).build();
        List<ScanFilter> c = new C12439h().mo68824c(new ArrayList(set), list);
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.f65951j.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter == null) {
                C7354d.m30381f(f65941l, "Failed to construct a BluetoothAdapter", new Object[0]);
            } else if (!adapter.isEnabled()) {
                C7354d.m30381f(f65941l, "Failed to start background scan on Android O: BluetoothAdapter is not enabled", new Object[0]);
            } else {
                BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    int startScan = bluetoothLeScanner.startScan(c, build, mo76490n());
                    if (startScan != 0) {
                        String str = f65941l;
                        C7354d.m30377b(str, "Failed to start background scan on Android O.  Code: " + startScan, new Object[0]);
                        return;
                    }
                    C7354d.m30376a(f65941l, "Started passive beacon scan", new Object[0]);
                    return;
                }
                C7354d.m30377b(f65941l, "Failed to start background scan on Android O: scanner is null", new Object[0]);
            }
        } catch (SecurityException unused) {
            C7354d.m30377b(f65941l, "SecurityException making Android O background scanner", new Object[0]);
        } catch (NullPointerException e) {
            C7354d.m30377b(f65941l, "NullPointerException starting Android O background scanner", e);
        } catch (RuntimeException e2) {
            C7354d.m30377b(f65941l, "Unexpected runtime exception starting Android O background scanner", e2);
        }
    }
}
