package p281hd;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelUuid;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.service.C16011b;
import p097gd.C7354d;
import p310kd.C13551b;
import p310kd.C13552c;

/* renamed from: hd.e */
/* compiled from: CycledLeScannerForLollipop */
public class C12431e extends C12421b {

    /* renamed from: A */
    private ScanCallback f59202A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f59203B = 0;

    /* renamed from: C */
    private long f59204C = 0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f59205D = false;

    /* renamed from: E */
    private final BeaconManager f59206E = BeaconManager.m33479A(this.f59176l);

    /* renamed from: F */
    private final PowerManager f59207F;

    /* renamed from: G */
    private BroadcastReceiver f59208G = new C12436e();

    /* renamed from: z */
    private BluetoothLeScanner f59209z;

    /* renamed from: hd.e$a */
    /* compiled from: CycledLeScannerForLollipop */
    class C12432a implements Runnable {
        C12432a() {
        }

        @MainThread
        public void run() {
            C12431e.this.mo68795q(Boolean.TRUE);
        }
    }

    /* renamed from: hd.e$b */
    /* compiled from: CycledLeScannerForLollipop */
    class C12433b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BluetoothLeScanner f59211a;

        /* renamed from: c */
        final /* synthetic */ List f59212c;

        /* renamed from: d */
        final /* synthetic */ ScanSettings f59213d;

        /* renamed from: f */
        final /* synthetic */ ScanCallback f59214f;

        C12433b(BluetoothLeScanner bluetoothLeScanner, List list, ScanSettings scanSettings, ScanCallback scanCallback) {
            this.f59211a = bluetoothLeScanner;
            this.f59212c = list;
            this.f59213d = scanSettings;
            this.f59214f = scanCallback;
        }

        @WorkerThread
        public void run() {
            try {
                this.f59211a.startScan(this.f59212c, this.f59213d, this.f59214f);
            } catch (IllegalStateException unused) {
                C7354d.m30381f("CycledLeScannerForLollipop", "Cannot start scan. Bluetooth may be turned off.", new Object[0]);
            } catch (NullPointerException e) {
                C7354d.m30378c(e, "CycledLeScannerForLollipop", "Cannot start scan. Unexpected NPE.", new Object[0]);
            } catch (SecurityException e2) {
                C7354d.m30377b("CycledLeScannerForLollipop", "Cannot start scan.  Security Exception: " + e2.getMessage(), e2);
            }
        }
    }

    /* renamed from: hd.e$c */
    /* compiled from: CycledLeScannerForLollipop */
    class C12434c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BluetoothLeScanner f59216a;

        /* renamed from: c */
        final /* synthetic */ ScanCallback f59217c;

        C12434c(BluetoothLeScanner bluetoothLeScanner, ScanCallback scanCallback) {
            this.f59216a = bluetoothLeScanner;
            this.f59217c = scanCallback;
        }

        @WorkerThread
        public void run() {
            try {
                C7354d.m30376a("CycledLeScannerForLollipop", "Stopping LE scan on scan handler", new Object[0]);
                this.f59216a.stopScan(this.f59217c);
            } catch (IllegalStateException unused) {
                C7354d.m30381f("CycledLeScannerForLollipop", "Cannot stop scan. Bluetooth may be turned off.", new Object[0]);
            } catch (NullPointerException e) {
                C7354d.m30378c(e, "CycledLeScannerForLollipop", "Cannot stop scan. Unexpected NPE.", new Object[0]);
            } catch (SecurityException e2) {
                C7354d.m30377b("CycledLeScannerForLollipop", "Cannot stop scan.  Security Exception", e2);
            }
        }
    }

    /* renamed from: hd.e$d */
    /* compiled from: CycledLeScannerForLollipop */
    class C12435d extends ScanCallback {
        C12435d() {
        }

        @MainThread
        public void onBatchScanResults(List<ScanResult> list) {
            C7354d.m30376a("CycledLeScannerForLollipop", "got batch records", new Object[0]);
            for (ScanResult next : list) {
                C12431e.this.f59185u.mo68784a(next.getDevice(), next.getRssi(), next.getScanRecord().getBytes(), (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (next.getTimestampNanos() / 1000000));
            }
            if (C12431e.this.f59203B > 0) {
                C7354d.m30376a("CycledLeScannerForLollipop", "got a filtered batch scan result in the background.", new Object[0]);
            }
        }

        @MainThread
        public void onScanFailed(int i) {
            C13552c.m87365k().mo71649m("onScanFailed", i);
            if (i == 1) {
                C7354d.m30377b("CycledLeScannerForLollipop", "Scan failed: a BLE scan with the same settings is already started by the app", new Object[0]);
            } else if (i == 2) {
                C7354d.m30377b("CycledLeScannerForLollipop", "Scan failed: app cannot be registered", new Object[0]);
            } else if (i == 3) {
                C7354d.m30377b("CycledLeScannerForLollipop", "Scan failed: internal error", new Object[0]);
            } else if (i != 4) {
                C7354d.m30377b("CycledLeScannerForLollipop", "Scan failed with unknown error (errorCode=" + i + ")", new Object[0]);
            } else {
                C7354d.m30377b("CycledLeScannerForLollipop", "Scan failed: power optimized scan feature is not supported", new Object[0]);
            }
        }

        @MainThread
        public void onScanResult(int i, ScanResult scanResult) {
            if (C7354d.m30380e()) {
                C7354d.m30376a("CycledLeScannerForLollipop", "got record", new Object[0]);
                List<ParcelUuid> serviceUuids = scanResult.getScanRecord().getServiceUuids();
                if (serviceUuids != null) {
                    for (ParcelUuid parcelUuid : serviceUuids) {
                        C7354d.m30376a("CycledLeScannerForLollipop", "with service uuid: " + parcelUuid, new Object[0]);
                    }
                }
            }
            C12431e.this.f59185u.mo68784a(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.getTimestampNanos() / 1000000));
            if (C12431e.this.f59203B > 0) {
                C7354d.m30376a("CycledLeScannerForLollipop", "got a filtered scan result in the background.", new Object[0]);
            }
        }
    }

    /* renamed from: hd.e$e */
    /* compiled from: CycledLeScannerForLollipop */
    class C12436e extends BroadcastReceiver {
        C12436e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!C12431e.this.f59205D) {
                C7354d.m30376a("CycledLeScannerForLollipop", "Screen has gone off while outside the main scan cycle on Samsung.  We will do nothing.", new Object[0]);
                return;
            }
            C7354d.m30376a("CycledLeScannerForLollipop", "Screen has gone off while using a wildcard scan filter on Samsung.  Restarting scanner with non-empty filters.", new Object[0]);
            C12431e.this.mo68804z();
            C12431e.this.mo68802x();
        }
    }

    public C12431e(Context context, long j, long j2, boolean z, C12420a aVar, C13551b bVar) {
        super(context, j, j2, z, aVar, bVar);
        this.f59207F = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: C */
    private ScanCallback m83358C() {
        if (this.f59202A == null) {
            this.f59202A = new C12435d();
        }
        return this.f59202A;
    }

    /* renamed from: D */
    private BluetoothLeScanner m83359D() {
        try {
            if (this.f59209z == null) {
                C7354d.m30376a("CycledLeScannerForLollipop", "Making new Android L scanner", new Object[0]);
                if (mo68792l() != null) {
                    this.f59209z = mo68792l().getBluetoothLeScanner();
                }
                if (this.f59209z == null) {
                    C7354d.m30381f("CycledLeScannerForLollipop", "Failed to make new Android L scanner", new Object[0]);
                }
            }
        } catch (SecurityException e) {
            C7354d.m30381f("CycledLeScannerForLollipop", "SecurityException making new Android L scanner", e);
        }
        return this.f59209z;
    }

    /* renamed from: E */
    private boolean m83360E() {
        try {
            BluetoothAdapter l = mo68792l();
            if (l == null) {
                C7354d.m30381f("CycledLeScannerForLollipop", "Cannot get bluetooth adapter", new Object[0]);
                return false;
            } else if (l.getState() == 12) {
                return true;
            } else {
                return false;
            }
        } catch (SecurityException e) {
            C7354d.m30381f("CycledLeScannerForLollipop", "SecurityException checking if bluetooth is on", e);
        }
    }

    /* renamed from: F */
    private void m83361F(List<ScanFilter> list, ScanSettings scanSettings) {
        BluetoothLeScanner D = m83359D();
        if (D != null) {
            ScanCallback C = m83358C();
            this.f59182r.removeCallbacksAndMessages((Object) null);
            this.f59182r.post(new C12433b(D, list, scanSettings, C));
        }
    }

    /* renamed from: G */
    private void m83362G() {
        if (!m83360E()) {
            C7354d.m30376a("CycledLeScannerForLollipop", "Not stopping scan because bluetooth is off", new Object[0]);
            return;
        }
        BluetoothLeScanner D = m83359D();
        if (D != null) {
            ScanCallback C = m83358C();
            this.f59182r.removeCallbacksAndMessages((Object) null);
            this.f59182r.post(new C12434c(D, C));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo68789h() {
        long elapsedRealtime = this.f59168d - SystemClock.elapsedRealtime();
        boolean z = elapsedRealtime > 0;
        boolean z2 = this.f59205D;
        this.f59205D = !z;
        if (z) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - C16011b.m96530a().mo76433b();
            if (z2) {
                if (elapsedRealtime2 > WorkRequest.MIN_BACKOFF_MILLIS) {
                    this.f59203B = SystemClock.elapsedRealtime();
                    this.f59204C = 0;
                    C7354d.m30376a("CycledLeScannerForLollipop", "This is Android L. Preparing to do a filtered scan for the background.", new Object[0]);
                    if (this.f59180p > 6000) {
                        mo68802x();
                    } else {
                        C7354d.m30376a("CycledLeScannerForLollipop", "Suppressing scan between cycles because the between scan cycle is too short.", new Object[0]);
                    }
                } else {
                    C7354d.m30376a("CycledLeScannerForLollipop", "This is Android L, but we last saw a beacon only %s ago, so we will not keep scanning in background.", Long.valueOf(elapsedRealtime2));
                }
            }
            if (this.f59203B > 0 && C16011b.m96530a().mo76433b() > this.f59203B) {
                if (this.f59204C == 0) {
                    this.f59204C = C16011b.m96530a().mo76433b();
                }
                if (SystemClock.elapsedRealtime() - this.f59204C >= WorkRequest.MIN_BACKOFF_MILLIS) {
                    C7354d.m30376a("CycledLeScannerForLollipop", "We've been detecting for a bit.  Stopping Android L background scanning", new Object[0]);
                    mo68804z();
                    this.f59203B = 0;
                } else {
                    C7354d.m30376a("CycledLeScannerForLollipop", "Delivering Android L background scanning results", new Object[0]);
                    this.f59185u.mo68785b();
                }
            }
            C7354d.m30376a("CycledLeScannerForLollipop", "Waiting to start full Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
            if (z2 && this.f59186v) {
                mo68800v();
            }
            Handler handler = this.f59181q;
            C12432a aVar = new C12432a();
            if (elapsedRealtime > 1000) {
                elapsedRealtime = 1000;
            }
            handler.postDelayed(aVar, elapsedRealtime);
        } else if (this.f59203B > 0) {
            mo68804z();
            this.f59203B = 0;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo68791j() {
        C7354d.m30376a("CycledLeScannerForLollipop", "Stopping scan", new Object[0]);
        mo68804z();
        this.f59173i = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo68802x() {
        List<ScanFilter> list;
        ScanSettings scanSettings;
        if (!m83360E()) {
            C7354d.m30376a("CycledLeScannerForLollipop", "Not starting scan because bluetooth is off", new Object[0]);
            return;
        }
        List<ScanFilter> arrayList = new ArrayList<>();
        if (!this.f59205D) {
            C7354d.m30376a("CycledLeScannerForLollipop", "starting filtered scan in SCAN_MODE_LOW_POWER", new Object[0]);
            scanSettings = new ScanSettings.Builder().setScanMode(0).build();
            list = new C12439h().mo68823b(this.f59206E.mo38009r());
        } else {
            C7354d.m30376a("CycledLeScannerForLollipop", "starting a scan in SCAN_MODE_LOW_LATENCY", new Object[0]);
            ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
            if (Build.VERSION.SDK_INT >= 27) {
                String str = Build.MANUFACTURER;
                if (!str.equalsIgnoreCase("samsung") || this.f59207F.isInteractive()) {
                    if (str.equalsIgnoreCase("samsung")) {
                        C7354d.m30376a("CycledLeScannerForLollipop", "Using a wildcard scan filter on Samsung because the screen is on.  We will switch to a non-empty filter if the screen goes off", new Object[0]);
                        this.f59176l.getApplicationContext().registerReceiver(this.f59208G, new IntentFilter("android.intent.action.SCREEN_OFF"));
                        C7354d.m30376a("CycledLeScannerForLollipop", "registering SamsungScreenOffReceiver " + this.f59208G, new Object[0]);
                    } else {
                        C7354d.m30376a("CycledLeScannerForLollipop", "Using an empty scan filter since this is 8.1+ on Non-Samsung", new Object[0]);
                    }
                    arrayList = new C12439h().mo68825d();
                } else {
                    C7354d.m30376a("CycledLeScannerForLollipop", "Using a non-empty scan filter since this is Samsung 8.1+", new Object[0]);
                    arrayList = new C12439h().mo68823b(this.f59206E.mo38009r());
                }
            } else {
                C7354d.m30376a("CycledLeScannerForLollipop", "Using no scan filter since this is pre-8.1", new Object[0]);
            }
            list = arrayList;
            scanSettings = build;
        }
        if (scanSettings != null) {
            m83361F(list, scanSettings);
        }
    }

    @MainThread
    /* renamed from: y */
    public void mo68803y() {
        super.mo68803y();
        C7354d.m30376a("CycledLeScannerForLollipop", "unregistering SamsungScreenOffReceiver as we stop the cycled scanner", new Object[0]);
        try {
            this.f59176l.getApplicationContext().unregisterReceiver(this.f59208G);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo68804z() {
        m83362G();
    }
}
