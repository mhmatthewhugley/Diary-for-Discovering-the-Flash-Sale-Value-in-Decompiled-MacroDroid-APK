package com.arlosoft.macrodroid.action.services;

import android.app.IntentService;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.lang.reflect.Method;
import p122l0.C7590b;
import p122l0.C7591c;
import p148q0.C8151a;
import p150q2.C8164a;

public class WifiHotspotService extends IntentService {

    /* renamed from: a */
    private transient int f9179a = -1;

    /* renamed from: c */
    private transient WifiManager f9180c;

    /* renamed from: d */
    private transient boolean f9181d;

    /* renamed from: f */
    private transient String f9182f;

    /* renamed from: com.arlosoft.macrodroid.action.services.WifiHotspotService$a */
    class C3446a extends C7590b {
        C3446a() {
        }
    }

    public WifiHotspotService() {
        super("WifiHotspotService");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0088, code lost:
        com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g("Cannot start tethering: " + r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1.getDeclaredMethod("startTethering", new java.lang.Class[]{java.lang.Integer.TYPE, android.os.ResultReceiver.class, java.lang.Boolean.TYPE, java.lang.String.class}).invoke(r11, new java.lang.Object[]{0, r2, java.lang.Boolean.FALSE, "com.arlosoft.macrodroid"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0087, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0036 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14428a(java.lang.Object r11) throws java.lang.ReflectiveOperationException {
        /*
            r10 = this;
            java.lang.String r0 = "startTethering"
            java.lang.String r1 = "android.net.IConnectivityManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)
            android.os.ResultReceiver r2 = new android.os.ResultReceiver
            r3 = 0
            r2.<init>(r3)
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0036 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0036 }
            r7[r6] = r8     // Catch:{ Exception -> 0x0036 }
            java.lang.Class<android.os.ResultReceiver> r8 = android.os.ResultReceiver.class
            r7[r4] = r8     // Catch:{ Exception -> 0x0036 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0036 }
            r7[r3] = r8     // Catch:{ Exception -> 0x0036 }
            java.lang.reflect.Method r7 = r1.getDeclaredMethod(r0, r7)     // Catch:{ Exception -> 0x0036 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0036 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0036 }
            r8[r6] = r9     // Catch:{ Exception -> 0x0036 }
            r8[r4] = r2     // Catch:{ Exception -> 0x0036 }
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0036 }
            r8[r3] = r9     // Catch:{ Exception -> 0x0036 }
            r7.invoke(r11, r8)     // Catch:{ Exception -> 0x0036 }
            goto L_0x00a0
        L_0x0036:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x005a }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x005a }
            r7[r6] = r8     // Catch:{ Exception -> 0x005a }
            java.lang.Class<android.os.ResultReceiver> r8 = android.os.ResultReceiver.class
            r7[r4] = r8     // Catch:{ Exception -> 0x005a }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x005a }
            r7[r3] = r8     // Catch:{ Exception -> 0x005a }
            java.lang.reflect.Method r7 = r1.getDeclaredMethod(r0, r7)     // Catch:{ Exception -> 0x005a }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x005a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x005a }
            r8[r6] = r9     // Catch:{ Exception -> 0x005a }
            r8[r4] = r2     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x005a }
            r8[r3] = r9     // Catch:{ Exception -> 0x005a }
            r7.invoke(r11, r8)     // Catch:{ Exception -> 0x005a }
            goto L_0x00a0
        L_0x005a:
            r7 = 4
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0087 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0087 }
            r8[r6] = r9     // Catch:{ Exception -> 0x0087 }
            java.lang.Class<android.os.ResultReceiver> r9 = android.os.ResultReceiver.class
            r8[r4] = r9     // Catch:{ Exception -> 0x0087 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0087 }
            r8[r3] = r9     // Catch:{ Exception -> 0x0087 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r5] = r9     // Catch:{ Exception -> 0x0087 }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r8)     // Catch:{ Exception -> 0x0087 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0087 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0087 }
            r1[r6] = r7     // Catch:{ Exception -> 0x0087 }
            r1[r4] = r2     // Catch:{ Exception -> 0x0087 }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0087 }
            r1[r3] = r2     // Catch:{ Exception -> 0x0087 }
            java.lang.String r2 = "com.arlosoft.macrodroid"
            r1[r5] = r2     // Catch:{ Exception -> 0x0087 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0087 }
            goto L_0x00a0
        L_0x0087:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot start tethering: "
            r0.append(r1)
            java.lang.String r11 = r11.toString()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r11)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.WifiHotspotService.m14428a(java.lang.Object):void");
    }

    /* renamed from: b */
    private int m14429b() {
        try {
            int intValue = ((Integer) this.f9180c.getClass().getMethod("getWifiApState", new Class[0]).invoke(this.f9180c, new Object[0])).intValue();
            return intValue > 10 ? intValue - 10 : intValue;
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("WifiHotspotService: getWifiAPState failed: " + e.getMessage()));
            return 4;
        }
    }

    /* renamed from: c */
    private boolean m14430c() {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        try {
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("getWifiApState", new Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(wifiManager, (Object[]) null)).intValue();
            if (intValue > 10) {
                intValue -= 10;
            }
            if (intValue == 2 || intValue == 3) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C4878b.m18868g("Error getting wifi AP State: " + e.getMessage());
            C8151a.m33873n(new RuntimeException("Error getting wifi AP State: " + e.getMessage()));
        }
    }

    /* renamed from: d */
    private void m14431d(boolean z, int i, boolean z2) {
        if (z && this.f9179a == -1) {
            this.f9179a = this.f9180c.getWifiState();
        }
        int i2 = 10;
        if (z && this.f9180c.getConnectionInfo() != null) {
            try {
                this.f9180c.setWifiEnabled(false);
            } catch (SecurityException unused) {
                C4061t1.m16023v(this, "Could not change wifi state", "The wifi state could not be changed due to a problem with your wifi driver. This is most likely due to a problem in a custom ROM.", false);
            } catch (Exception e) {
                C4878b.m18868g("Could not change wifi state: " + e.toString());
            }
            int i3 = 10;
            while (i3 > 0 && this.f9180c.getWifiState() != 1) {
                try {
                    Thread.sleep(500);
                    i3--;
                } catch (Exception unused2) {
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && !z2 && i == 0) {
            m14433f(z);
        } else if (i4 < 25 || (z2 && i != 1)) {
            m14434g(z);
            this.f9179a = -1;
        } else {
            m14432e(z);
        }
        if (!z) {
            int b = m14429b();
            while (true) {
                try {
                    Thread.sleep(500);
                    i2--;
                } catch (Exception unused3) {
                }
                if (i2 <= 0 || !(b == 0 || b == 3 || b == 4)) {
                }
            }
            try {
                Thread.sleep(1000);
                if (!this.f9181d) {
                    return;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    this.f9180c.setWifiEnabled(true);
                } else {
                    m14435h();
                }
            } catch (Exception unused4) {
                C4061t1.m16023v(this, "Could not change wifi state", "The wifi state could not be changed due to a problem with your wifi driver. This is most likley due to a problem in a custom ROM.", false);
            }
        }
    }

    /* renamed from: e */
    private int m14432e(boolean z) {
        Class<ConnectivityManager> cls = ConnectivityManager.class;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            if (z) {
                m14428a(connectivityManager);
            } else {
                cls.getDeclaredMethod("stopTethering", new Class[]{Integer.TYPE}).invoke(connectivityManager, new Object[]{0});
            }
        } catch (Exception e) {
            C4878b.m18868g("Failed to set hotspot on API25+: " + e.toString());
        }
        return 0;
    }

    @RequiresApi(api = 26)
    /* renamed from: f */
    private int m14433f(boolean z) {
        C3446a aVar = new C3446a();
        C7591c cVar = new C7591c(this);
        if (z) {
            cVar.mo37662a(aVar, new Handler());
        } else {
            cVar.mo37663b();
        }
        try {
            Thread.sleep(2000);
        } catch (Exception unused) {
        }
        if (m14430c() == z) {
            return 0;
        }
        m14432e(z);
        return 0;
    }

    /* renamed from: g */
    private int m14434g(boolean z) {
        int i;
        try {
            this.f9180c.setWifiEnabled(false);
        } catch (SecurityException unused) {
            try {
                C4061t1.m16023v(this, "Could not change wifi state", "The wifi state could not be changed due to a problem with your wifi driver. This is most likely due to a problem in a custom ROM.", false);
            } catch (Exception e) {
                C8151a.m33873n(e);
                C4061t1.m16023v(this, "MacroDroid Error", "WifiHotspot Action Failed", false);
                i = -1;
            }
        }
        this.f9180c.getClass().getMethod("setWifiApEnabled", new Class[]{WifiConfiguration.class, Boolean.TYPE}).invoke(this.f9180c, new Object[]{null, Boolean.valueOf(z)});
        i = ((Integer) this.f9180c.getClass().getMethod("getWifiApState", new Class[0]).invoke(this.f9180c, new Object[0])).intValue();
        if (z) {
            int i2 = 10;
            int b = m14429b();
            while (i2 > 0 && (b == 2 || b == 1 || b == 4)) {
                try {
                    Thread.sleep(500);
                    i2--;
                } catch (Exception unused2) {
                }
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m14435h() {
        if (C8164a.m33886a()) {
            C4061t1.m15947B0(new String[]{"svc wifi enable"});
        } else if (C4031k.m15905e() != null) {
            C4878b.m18874m("Sending request to Helper File to enable wifi", 0);
            HelperSystemCommands.m24584g(this, true, this.f9182f);
        } else {
            C4878b.m18869h("Cannot set wifi, Helper File is not installed. Please see: https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/", 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        this.f9180c = (WifiManager) getApplicationContext().getSystemService("wifi");
        boolean z = false;
        boolean booleanExtra = intent.getBooleanExtra("ForceLegacy", false);
        int intExtra = intent.getIntExtra("WifiAPState", 0);
        int intExtra2 = intent.getIntExtra("Mechanism", 0);
        this.f9181d = intent.getBooleanExtra("TurnOnWifi", false);
        this.f9182f = intent.getStringExtra("com.arlosoft.macrodroid.MACRO_NAME");
        if (intExtra == 0) {
            m14431d(true, intExtra2, booleanExtra);
        } else if (intExtra == 1) {
            m14431d(false, intExtra2, booleanExtra);
        } else if (intExtra == 2) {
            int b = m14429b();
            if (!(b == 2 || b == 3)) {
                z = true;
            }
            m14431d(z, intExtra2, booleanExtra);
        }
    }
}
