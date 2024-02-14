package p310kd;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.TaskStackBuilder;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Objects;
import p097gd.C7354d;

/* renamed from: kd.c */
/* compiled from: BluetoothMedic */
public class C13552c {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f61830m = "c";
    @Nullable

    /* renamed from: n */
    private static C13552c f61831n;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public BluetoothAdapter f61832a;
    @NonNull

    /* renamed from: b */
    private Handler f61833b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private int f61834c = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Boolean f61835d = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public Boolean f61836e = null;

    /* renamed from: f */
    private boolean f61837f = false;

    /* renamed from: g */
    private boolean f61838g = false;

    /* renamed from: h */
    private int f61839h = 0;

    /* renamed from: i */
    private long f61840i = 0;

    /* renamed from: j */
    private boolean f61841j = false;
    @Nullable

    /* renamed from: k */
    private Context f61842k = null;
    @RequiresApi(21)

    /* renamed from: l */
    private BroadcastReceiver f61843l = new C13553a();

    /* renamed from: kd.c$a */
    /* compiled from: BluetoothMedic */
    class C13553a extends BroadcastReceiver {
        C13553a() {
        }

        public void onReceive(Context context, Intent intent) {
            C7354d.m30376a(C13552c.f61830m, "Broadcast notification received.", new Object[0]);
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if (action.equalsIgnoreCase("onScanFailed")) {
                if (intent.getIntExtra("errorCode", -1) == 2) {
                    C13552c.this.m87367p("scan failed", "Power cycling bluetooth");
                    C7354d.m30376a(C13552c.f61830m, "Detected a SCAN_FAILED_APPLICATION_REGISTRATION_FAILED.  We need to cycle bluetooth to recover", new Object[0]);
                    if (!C13552c.this.m87363i()) {
                        C13552c.this.m87367p("scan failed", "Cannot power cycle bluetooth again");
                    }
                }
            } else if (!action.equalsIgnoreCase("onStartFailed")) {
                C7354d.m30376a(C13552c.f61830m, "Unknown event.", new Object[0]);
            } else if (intent.getIntExtra("errorCode", -1) == 4) {
                C13552c.this.m87367p("advertising failed", "Expected failure.  Power cycling.");
                if (!C13552c.this.m87363i()) {
                    C13552c.this.m87367p("advertising failed", "Cannot power cycle bluetooth again");
                }
            }
        }
    }

    /* renamed from: kd.c$b */
    /* compiled from: BluetoothMedic */
    class C13554b extends ScanCallback {

        /* renamed from: a */
        final /* synthetic */ BluetoothLeScanner f61845a;

        C13554b(BluetoothLeScanner bluetoothLeScanner) {
            this.f61845a = bluetoothLeScanner;
        }

        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
        }

        public void onScanFailed(int i) {
            super.onScanFailed(i);
            C7354d.m30376a(C13552c.f61830m, "Sending onScanFailed event", new Object[0]);
            C13552c.this.mo71649m("onScanFailed", i);
            if (i == 2) {
                C7354d.m30381f(C13552c.f61830m, "Scan test failed in a way we consider a failure", new Object[0]);
                C13552c.this.m87367p("scan failed", "bluetooth not ok");
                Boolean unused = C13552c.this.f61836e = Boolean.FALSE;
                return;
            }
            C7354d.m30379d(C13552c.f61830m, "Scan test failed in a way we do not consider a failure", new Object[0]);
            Boolean unused2 = C13552c.this.f61836e = Boolean.TRUE;
        }

        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            Boolean unused = C13552c.this.f61836e = Boolean.TRUE;
            C7354d.m30379d(C13552c.f61830m, "Scan test succeeded", new Object[0]);
            try {
                this.f61845a.stopScan(this);
            } catch (IllegalStateException unused2) {
            }
        }
    }

    /* renamed from: kd.c$c */
    /* compiled from: BluetoothMedic */
    class C13555c extends AdvertiseCallback {

        /* renamed from: a */
        final /* synthetic */ BluetoothLeAdvertiser f61847a;

        C13555c(BluetoothLeAdvertiser bluetoothLeAdvertiser) {
            this.f61847a = bluetoothLeAdvertiser;
        }

        public void onStartFailure(int i) {
            super.onStartFailure(i);
            C7354d.m30376a(C13552c.f61830m, "Sending onStartFailure event", new Object[0]);
            C13552c.this.mo71649m("onStartFailed", i);
            if (i == 4) {
                Boolean unused = C13552c.this.f61835d = Boolean.FALSE;
                C7354d.m30381f(C13552c.f61830m, "Transmitter test failed in a way we consider a test failure", new Object[0]);
                return;
            }
            Boolean unused2 = C13552c.this.f61835d = Boolean.TRUE;
            C7354d.m30379d(C13552c.f61830m, "Transmitter test failed, but not in a way we consider a test failure", new Object[0]);
        }

        public void onStartSuccess(AdvertiseSettings advertiseSettings) {
            super.onStartSuccess(advertiseSettings);
            C7354d.m30379d(C13552c.f61830m, "Transmitter test succeeded", new Object[0]);
            this.f61847a.stopAdvertising(this);
            Boolean unused = C13552c.this.f61835d = Boolean.TRUE;
        }
    }

    /* renamed from: kd.c$d */
    /* compiled from: BluetoothMedic */
    class C13556d implements Runnable {
        C13556d() {
        }

        public void run() {
            C7354d.m30376a(C13552c.f61830m, "Turning Bluetooth back on.", new Object[0]);
            if (C13552c.this.f61832a != null) {
                C13552c.this.f61832a.enable();
            }
        }
    }

    private C13552c() {
    }

    /* renamed from: g */
    private void m87361g(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, "Errors", 3);
            notificationChannel.setDescription("Scan errors");
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            this.f61838g = true;
        }
    }

    @RequiresApi(21)
    /* renamed from: h */
    private void m87362h() {
        String str = f61830m;
        C7354d.m30376a(str, "Power cycling bluetooth", new Object[0]);
        C7354d.m30376a(str, "Turning Bluetooth off.", new Object[0]);
        BluetoothAdapter bluetoothAdapter = this.f61832a;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.disable();
            this.f61833b.postDelayed(new C13556d(), 1000);
            return;
        }
        C7354d.m30381f(str, "Cannot cycle bluetooth.  Manager is null.", new Object[0]);
    }

    /* access modifiers changed from: private */
    @RequiresApi(21)
    /* renamed from: i */
    public boolean m87363i() {
        long currentTimeMillis = System.currentTimeMillis() - this.f61840i;
        if (currentTimeMillis < 60000) {
            String str = f61830m;
            C7354d.m30376a(str, "Not cycling bluetooth because we just did so " + currentTimeMillis + " milliseconds ago.", new Object[0]);
            return false;
        }
        this.f61840i = System.currentTimeMillis();
        C7354d.m30376a(f61830m, "Power cycling bluetooth", new Object[0]);
        m87362h();
        return true;
    }

    @RequiresApi(api = 21)
    /* renamed from: j */
    private BluetoothLeAdvertiser m87364j(BluetoothAdapter bluetoothAdapter) {
        try {
            return bluetoothAdapter.getBluetoothLeAdvertiser();
        } catch (Exception e) {
            C7354d.m30381f(f61830m, "Cannot get bluetoothLeAdvertiser", e);
            return null;
        }
    }

    /* renamed from: k */
    public static C13552c m87365k() {
        if (f61831n == null) {
            f61831n = new C13552c();
        }
        return f61831n;
    }

    @RequiresApi(21)
    /* renamed from: l */
    private void m87366l(Context context) {
        if (this.f61832a == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            Objects.requireNonNull(bluetoothManager, "Cannot get BluetoothManager");
            this.f61832a = bluetoothManager.getAdapter();
        }
    }

    /* access modifiers changed from: private */
    @RequiresApi(21)
    /* renamed from: p */
    public void m87367p(String str, String str2) {
        Context context = this.f61842k;
        if (context == null) {
            C7354d.m30377b(f61830m, "congtext is unexpectedly null", new Object[0]);
            return;
        }
        m87366l(context);
        if (this.f61837f) {
            if (!this.f61838g) {
                m87361g(context, NotificationCompat.CATEGORY_ERROR);
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, NotificationCompat.CATEGORY_ERROR);
            NotificationCompat.Builder contentText = builder.setContentTitle("BluetoothMedic: " + str).setSmallIcon(this.f61839h).setVibrate(new long[]{200, 100, 200}).setContentText(str2);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            create.addNextIntent(new Intent("NoOperation"));
            contentText.setContentIntent(create.getPendingIntent(0, 201326592));
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(1, contentText.build());
            }
        }
    }

    /* renamed from: m */
    public void mo71649m(String str, int i) {
        if (!this.f61841j) {
            return;
        }
        if (str.equalsIgnoreCase("onScanFailed")) {
            if (i == 2) {
                C7354d.m30379d(f61830m, "Detected a SCAN_FAILED_APPLICATION_REGISTRATION_FAILED.  We need to cycle bluetooth to recover", new Object[0]);
                m87367p("scan failed", "Power cycling bluetooth");
                if (!m87363i()) {
                    m87367p("scan failed", "Cannot power cycle bluetooth again");
                }
            }
        } else if (!str.equalsIgnoreCase("onStartFailed")) {
            C7354d.m30376a(f61830m, "Unknown event.", new Object[0]);
        } else if (i == 4) {
            C7354d.m30379d(f61830m, "advertising failed: Expected failure.  Power cycling.", new Object[0]);
            m87367p("advertising failed", "Expected failure.  Power cycling.");
            if (!m87363i()) {
                m87367p("advertising failed", "Cannot power cycle bluetooth again");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|(2:27|15)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC] */
    @androidx.annotation.RequiresApi(21)
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71650n(android.content.Context r11) {
        /*
            r10 = this;
            r10.m87366l(r11)
            r11 = 0
            r10.f61836e = r11
            java.lang.String r11 = f61830m
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Starting scan test"
            p097gd.C7354d.m30379d(r11, r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            android.bluetooth.BluetoothAdapter r3 = r10.f61832a
            r4 = 1
            if (r3 == 0) goto L_0x006f
            android.bluetooth.le.BluetoothLeScanner r3 = r3.getBluetoothLeScanner()
            kd.c$b r5 = new kd.c$b
            r5.<init>(r3)
            if (r3 == 0) goto L_0x0068
            r3.startScan(r5)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
        L_0x0027:
            java.lang.Boolean r11 = r10.f61836e     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            if (r11 != 0) goto L_0x004d
            java.lang.String r11 = f61830m     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            java.lang.String r6 = "Waiting for scan test to complete..."
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            p097gd.C7354d.m30376a(r11, r6, r7)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x0039 }
        L_0x0039:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            long r6 = r6 - r1
            r8 = 5000(0x1388, double:2.4703E-320)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0027
            java.lang.String r11 = f61830m     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            java.lang.String r1 = "Timeout running scan test"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            p097gd.C7354d.m30376a(r11, r1, r2)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
        L_0x004d:
            r3.stopScan(r5)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            goto L_0x006f
        L_0x0051:
            r11 = move-exception
            java.lang.String r1 = f61830m
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r0] = r11
            java.lang.String r11 = "NullPointerException. Cannot run scan test."
            p097gd.C7354d.m30377b(r1, r11, r2)
            goto L_0x006f
        L_0x005e:
            java.lang.String r11 = f61830m
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Bluetooth is off.  Cannot run scan test."
            p097gd.C7354d.m30376a(r11, r2, r1)
            goto L_0x006f
        L_0x0068:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Cannot get scanner"
            p097gd.C7354d.m30376a(r11, r2, r1)
        L_0x006f:
            java.lang.String r11 = f61830m
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "scan test complete"
            p097gd.C7354d.m30376a(r11, r2, r1)
            java.lang.Boolean r11 = r10.f61836e
            if (r11 == 0) goto L_0x0082
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0083
        L_0x0082:
            r0 = 1
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p310kd.C13552c.mo71650n(android.content.Context):boolean");
    }

    @RequiresApi(21)
    /* renamed from: o */
    public boolean mo71651o(Context context) {
        m87366l(context);
        this.f61835d = null;
        long currentTimeMillis = System.currentTimeMillis();
        BluetoothAdapter bluetoothAdapter = this.f61832a;
        if (bluetoothAdapter != null) {
            BluetoothLeAdvertiser j = m87364j(bluetoothAdapter);
            if (j != null) {
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(0).build();
                AdvertiseData build2 = new AdvertiseData.Builder().addManufacturerData(0, new byte[]{0}).build();
                C7354d.m30379d(f61830m, "Starting transmitter test", new Object[0]);
                j.startAdvertising(build, build2, new C13555c(j));
            } else {
                C7354d.m30376a(f61830m, "Cannot get advertiser", new Object[0]);
            }
            while (true) {
                if (this.f61835d != null) {
                    break;
                }
                C7354d.m30376a(f61830m, "Waiting for transmitter test to complete...", new Object[0]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
                if (System.currentTimeMillis() - currentTimeMillis > 5000) {
                    C7354d.m30376a(f61830m, "Timeout running transmitter test", new Object[0]);
                    break;
                }
            }
        }
        C7354d.m30376a(f61830m, "transmitter test complete", new Object[0]);
        Boolean bool = this.f61835d;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
