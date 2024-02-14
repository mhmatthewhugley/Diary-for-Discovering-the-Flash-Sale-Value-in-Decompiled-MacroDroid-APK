package p281hd;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.work.PeriodicWorkRequest;
import java.util.Date;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import p097gd.C7354d;
import p310kd.C13551b;

/* renamed from: hd.b */
/* compiled from: CycledLeScanner */
public abstract class C12421b {

    /* renamed from: a */
    private BluetoothAdapter f59165a;

    /* renamed from: b */
    private long f59166b = 0;

    /* renamed from: c */
    private long f59167c = 0;

    /* renamed from: d */
    protected long f59168d = 0;

    /* renamed from: e */
    private long f59169e = 0;

    /* renamed from: f */
    private long f59170f = 0;

    /* renamed from: g */
    private boolean f59171g = false;

    /* renamed from: h */
    private boolean f59172h;

    /* renamed from: i */
    protected boolean f59173i;

    /* renamed from: j */
    private boolean f59174j = false;

    /* renamed from: k */
    private boolean f59175k = false;

    /* renamed from: l */
    protected final Context f59176l;

    /* renamed from: m */
    private long f59177m;

    /* renamed from: n */
    private boolean f59178n = false;

    /* renamed from: o */
    private BroadcastReceiver f59179o = null;

    /* renamed from: p */
    protected long f59180p;
    @NonNull

    /* renamed from: q */
    protected final Handler f59181q = new Handler(Looper.getMainLooper());
    @NonNull

    /* renamed from: r */
    protected final Handler f59182r;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: s */
    public final HandlerThread f59183s;

    /* renamed from: t */
    protected final C13551b f59184t;

    /* renamed from: u */
    protected final C12420a f59185u;

    /* renamed from: v */
    protected boolean f59186v = false;

    /* renamed from: w */
    protected boolean f59187w = false;

    /* renamed from: x */
    private volatile boolean f59188x = false;

    /* renamed from: y */
    private PendingIntent f59189y = null;

    /* renamed from: hd.b$a */
    /* compiled from: CycledLeScanner */
    class C12422a implements Runnable {
        C12422a() {
        }

        @WorkerThread
        public void run() {
            C7354d.m30376a("CycledLeScanner", "Quitting scan thread", new Object[0]);
            C12421b.this.f59183s.quit();
        }
    }

    /* renamed from: hd.b$b */
    /* compiled from: CycledLeScanner */
    class C12423b implements Runnable {
        C12423b() {
        }

        @MainThread
        public void run() {
            C12421b.this.mo68796r();
        }
    }

    /* renamed from: hd.b$c */
    /* compiled from: CycledLeScanner */
    class C12424c extends BroadcastReceiver {
        C12424c() {
        }

        public void onReceive(Context context, Intent intent) {
            C7354d.m30381f("CycledLeScanner", "User switch detected.  Cancelling alarm to prevent potential crash.", new Object[0]);
            C12421b.this.mo68787c();
        }
    }

    protected C12421b(Context context, long j, long j2, boolean z, C12420a aVar, C13551b bVar) {
        this.f59177m = j;
        this.f59180p = j2;
        this.f59176l = context;
        this.f59185u = aVar;
        this.f59184t = bVar;
        this.f59186v = z;
        HandlerThread handlerThread = new HandlerThread("CycledLeScannerThread");
        this.f59183s = handlerThread;
        handlerThread.start();
        this.f59182r = new Handler(handlerThread.getLooper());
    }

    /* renamed from: d */
    private boolean m83323d() {
        return m83324e("android.permission.ACCESS_COARSE_LOCATION") || m83324e("android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: e */
    private boolean m83324e(String str) {
        return this.f59176l.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* renamed from: g */
    public static C12421b m83325g(Context context, long j, long j2, boolean z, C12420a aVar, C13551b bVar) {
        boolean z2 = true;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            C7354d.m30379d("CycledLeScanner", "Using Android O scanner", new Object[0]);
        } else if (BeaconManager.m33483M()) {
            C7354d.m30379d("CycledLeScanner", "This is Android 5.0, but L scanning is disabled. We are using old scanning APIs", new Object[0]);
            z2 = false;
        } else {
            C7354d.m30379d("CycledLeScanner", "This is Android 5.0.  We are using new scanning APIs", new Object[0]);
            z2 = false;
            z3 = true;
        }
        if (z2) {
            return new C12425c(context, j, j2, z, aVar, bVar);
        }
        if (z3) {
            return new C12431e(context, j, j2, z, aVar, bVar);
        }
        return new C12426d(context, j, j2, z, aVar, bVar);
    }

    @MainThread
    /* renamed from: k */
    private void m83326k() {
        C7354d.m30376a("CycledLeScanner", "Done with scan cycle", new Object[0]);
        try {
            this.f59185u.mo68785b();
            if (this.f59172h) {
                if (mo68792l() != null) {
                    if (mo68792l().isEnabled()) {
                        if (this.f59188x && this.f59180p == 0) {
                            if (!m83328p()) {
                                C7354d.m30376a("CycledLeScanner", "Not stopping scanning.  Device capable of multiple indistinct detections per scan.", new Object[0]);
                                this.f59178n = true;
                                this.f59167c = SystemClock.elapsedRealtime();
                            }
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Build.VERSION.SDK_INT < 24 || this.f59180p + this.f59177m >= 6000 || elapsedRealtime - this.f59166b >= 6000) {
                            try {
                                C7354d.m30376a("CycledLeScanner", "stopping bluetooth le scan", new Object[0]);
                                mo68791j();
                                this.f59178n = false;
                            } catch (Exception e) {
                                C7354d.m30382g(e, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                            }
                            this.f59167c = SystemClock.elapsedRealtime();
                        } else {
                            C7354d.m30376a("CycledLeScanner", "Not stopping scan because this is Android N and we keep scanning for a minimum of 6 seconds at a time. We will stop in " + (6000 - (elapsedRealtime - this.f59166b)) + " millisconds.", new Object[0]);
                            this.f59178n = true;
                            this.f59167c = SystemClock.elapsedRealtime();
                        }
                    } else {
                        C7354d.m30376a("CycledLeScanner", "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                        this.f59187w = true;
                    }
                }
                this.f59168d = m83327n();
                if (this.f59175k) {
                    mo68795q(Boolean.TRUE);
                }
            }
            if (!this.f59175k) {
                C7354d.m30376a("CycledLeScanner", "Scanning disabled. ", new Object[0]);
                this.f59174j = false;
                mo68787c();
            }
        } catch (SecurityException unused) {
            C7354d.m30381f("CycledLeScanner", "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    /* renamed from: n */
    private long m83327n() {
        long j = this.f59180p;
        if (j == 0) {
            return SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = j - (SystemClock.elapsedRealtime() % (this.f59177m + j));
        C7354d.m30376a("CycledLeScanner", "Normalizing between scan period from %s to %s", Long.valueOf(this.f59180p), Long.valueOf(elapsedRealtime));
        return SystemClock.elapsedRealtime() + elapsedRealtime;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m83328p() {
        /*
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r9.f59180p
            long r0 = r0 + r2
            long r2 = r9.f59177m
            long r0 = r0 + r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r4 = 0
            r5 = 24
            if (r2 < r5) goto L_0x0024
            long r5 = r9.f59170f
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0024
            long r0 = r0 - r5
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0043
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "CycledLeScanner"
            java.lang.String r2 = "The next scan cycle would go over the Android N max duration."
            p097gd.C7354d.m30376a(r1, r2, r0)
            boolean r0 = r9.f59171g
            if (r0 == 0) goto L_0x003c
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "Stopping scan to prevent Android N scan timeout."
            p097gd.C7354d.m30376a(r1, r2, r0)
            return r3
        L_0x003c:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "Allowing a long running scan to be stopped by the OS.  To prevent this, set longScanForcingEnabled in the AndroidBeaconLibrary."
            p097gd.C7354d.m30381f(r1, r2, r0)
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p281hd.C12421b.m83328p():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo68786b() {
        if (this.f59179o == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_BACKGROUND");
            intentFilter.addAction("android.intent.action.USER_FOREGROUND");
            C12424c cVar = new C12424c();
            this.f59179o = cVar;
            this.f59176l.registerReceiver(cVar, intentFilter);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo68787c() {
        C7354d.m30376a("CycledLeScanner", "cancel wakeup alarm: %s", this.f59189y);
        ((AlarmManager) this.f59176l.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(2, LocationRequestCompat.PASSIVE_INTERVAL, mo68794o());
        C7354d.m30376a("CycledLeScanner", "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(LocationRequestCompat.PASSIVE_INTERVAL - SystemClock.elapsedRealtime()), mo68794o());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68788f() {
        BroadcastReceiver broadcastReceiver = this.f59179o;
        if (broadcastReceiver != null) {
            try {
                this.f59176l.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f59179o = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo68789h();

    @MainThread
    /* renamed from: i */
    public void mo68790i() {
        C7354d.m30376a("CycledLeScanner", "Destroying", new Object[0]);
        this.f59181q.removeCallbacksAndMessages((Object) null);
        this.f59182r.post(new C12422a());
        mo68788f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo68791j();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public BluetoothAdapter mo68792l() {
        try {
            if (this.f59165a == null) {
                BluetoothAdapter adapter = ((BluetoothManager) this.f59176l.getApplicationContext().getSystemService("bluetooth")).getAdapter();
                this.f59165a = adapter;
                if (adapter == null) {
                    C7354d.m30381f("CycledLeScanner", "Failed to construct a BluetoothAdapter", new Object[0]);
                }
            }
        } catch (SecurityException unused) {
            C7354d.m30377b("CycledLeScanner", "Cannot consruct bluetooth adapter.  Security Exception", new Object[0]);
        }
        return this.f59165a;
    }

    @AnyThread
    /* renamed from: m */
    public boolean mo68793m() {
        return this.f59188x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public PendingIntent mo68794o() {
        if (this.f59189y == null) {
            Intent intent = new Intent(this.f59176l, StartupBroadcastReceiver.class);
            intent.putExtra("wakeup", true);
            this.f59189y = PendingIntent.getBroadcast(this.f59176l, 0, intent, 201326592);
        }
        return this.f59189y;
    }

    /* access modifiers changed from: protected */
    @MainThread
    /* renamed from: q */
    public void mo68795q(Boolean bool) {
        try {
            this.f59174j = true;
            if (mo68792l() == null) {
                C7354d.m30377b("CycledLeScanner", "No Bluetooth adapter.  beaconService cannot scan.", new Object[0]);
            }
            if (!this.f59175k || !bool.booleanValue()) {
                C7354d.m30376a("CycledLeScanner", "disabling scan", new Object[0]);
                this.f59172h = false;
                this.f59174j = false;
                mo68804z();
                this.f59170f = 0;
                this.f59167c = SystemClock.elapsedRealtime();
                this.f59181q.removeCallbacksAndMessages((Object) null);
                m83326k();
            } else if (!mo68789h()) {
                C7354d.m30376a("CycledLeScanner", "starting a new scan cycle", new Object[0]);
                if (this.f59172h && !this.f59173i) {
                    if (!this.f59187w) {
                        C7354d.m30376a("CycledLeScanner", "We are already scanning and have been for " + (SystemClock.elapsedRealtime() - this.f59170f) + " millis", new Object[0]);
                        this.f59169e = SystemClock.elapsedRealtime() + this.f59177m;
                        mo68796r();
                        C7354d.m30376a("CycledLeScanner", "Scan started", new Object[0]);
                    }
                }
                this.f59172h = true;
                this.f59173i = false;
                try {
                    if (mo68792l() != null) {
                        if (mo68792l().isEnabled()) {
                            C13551b bVar = this.f59184t;
                            if (bVar != null && bVar.mo71647a()) {
                                C7354d.m30381f("CycledLeScanner", "Skipping scan because crash recovery is in progress.", new Object[0]);
                            } else if (this.f59175k) {
                                if (this.f59187w) {
                                    this.f59187w = false;
                                    C7354d.m30376a("CycledLeScanner", "restarting a bluetooth le scan", new Object[0]);
                                } else {
                                    C7354d.m30376a("CycledLeScanner", "starting a new bluetooth le scan", new Object[0]);
                                }
                                try {
                                    if (Build.VERSION.SDK_INT < 23 || m83323d()) {
                                        this.f59170f = SystemClock.elapsedRealtime();
                                        mo68802x();
                                    }
                                } catch (Exception e) {
                                    C7354d.m30378c(e, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                                }
                            } else {
                                C7354d.m30376a("CycledLeScanner", "Scanning unnecessary - no monitoring or ranging active.", new Object[0]);
                            }
                            this.f59166b = SystemClock.elapsedRealtime();
                        } else {
                            C7354d.m30376a("CycledLeScanner", "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                        }
                    }
                } catch (Exception e2) {
                    C7354d.m30378c(e2, "CycledLeScanner", "Exception starting Bluetooth scan.  Perhaps Bluetooth is disabled or unavailable?", new Object[0]);
                }
                this.f59169e = SystemClock.elapsedRealtime() + this.f59177m;
                mo68796r();
                C7354d.m30376a("CycledLeScanner", "Scan started", new Object[0]);
            }
        } catch (SecurityException unused) {
            C7354d.m30381f("CycledLeScanner", "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @MainThread
    /* renamed from: r */
    public void mo68796r() {
        long elapsedRealtime = this.f59169e - SystemClock.elapsedRealtime();
        if (!this.f59175k || elapsedRealtime <= 0) {
            m83326k();
            return;
        }
        C7354d.m30376a("CycledLeScanner", "Waiting to stop scan cycle for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.f59186v) {
            mo68800v();
        }
        Handler handler = this.f59181q;
        C12423b bVar = new C12423b();
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(bVar, elapsedRealtime);
    }

    @AnyThread
    /* renamed from: s */
    public void mo68797s(boolean z) {
        this.f59188x = z;
    }

    /* renamed from: t */
    public void mo68798t(boolean z) {
        this.f59171g = z;
    }

    @MainThread
    /* renamed from: u */
    public void mo68799u(long j, long j2, boolean z) {
        C7354d.m30376a("CycledLeScanner", "Set scan periods called with %s, %s Background mode must have changed.", Long.valueOf(j), Long.valueOf(j2));
        if (this.f59186v != z) {
            this.f59187w = true;
        }
        this.f59186v = z;
        this.f59177m = j;
        this.f59180p = j2;
        if (z) {
            C7354d.m30376a("CycledLeScanner", "We are in the background.  Setting wakeup alarm", new Object[0]);
            mo68800v();
        } else {
            C7354d.m30376a("CycledLeScanner", "We are not in the background.  Cancelling wakeup alarm", new Object[0]);
            mo68787c();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f59168d;
        if (j3 > elapsedRealtime) {
            long j4 = this.f59167c + j2;
            if (j4 < j3) {
                this.f59168d = j4;
                C7354d.m30379d("CycledLeScanner", "Adjusted nextScanStartTime to be %s", new Date((this.f59168d - SystemClock.elapsedRealtime()) + System.currentTimeMillis()));
            }
        }
        long j5 = this.f59169e;
        if (j5 > elapsedRealtime) {
            long j6 = this.f59166b + j;
            if (j6 < j5) {
                this.f59169e = j6;
                C7354d.m30379d("CycledLeScanner", "Adjusted scanStopTime to be %s", Long.valueOf(j6));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo68800v() {
        long j = this.f59180p;
        if (PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS >= j) {
            j = 300000;
        }
        long j2 = this.f59177m;
        if (j < j2) {
            j = j2;
        }
        ((AlarmManager) this.f59176l.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(2, SystemClock.elapsedRealtime() + j, mo68794o());
        C7354d.m30376a("CycledLeScanner", "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(j), mo68794o());
        mo68786b();
    }

    @MainThread
    /* renamed from: w */
    public void mo68801w() {
        C7354d.m30376a("CycledLeScanner", "start called", new Object[0]);
        this.f59175k = true;
        if (!this.f59174j) {
            mo68795q(Boolean.TRUE);
        } else {
            C7354d.m30376a("CycledLeScanner", "scanning already started", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo68802x();

    @MainThread
    /* renamed from: y */
    public void mo68803y() {
        C7354d.m30376a("CycledLeScanner", "stop called", new Object[0]);
        this.f59175k = false;
        if (this.f59174j) {
            mo68795q(Boolean.FALSE);
            if (this.f59178n) {
                C7354d.m30376a("CycledLeScanner", "Stopping scanning previously left on.", new Object[0]);
                this.f59178n = false;
                try {
                    C7354d.m30376a("CycledLeScanner", "stopping bluetooth le scan", new Object[0]);
                    mo68791j();
                } catch (Exception e) {
                    C7354d.m30382g(e, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                }
            }
        } else {
            C7354d.m30376a("CycledLeScanner", "scanning already stopped", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo68804z();
}
