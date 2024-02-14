package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import p112j2.C7439d0;
import p136n3.C7976h;

public class PhoneStateMonitorService extends Service {

    /* renamed from: a */
    private static C7976h f14527a;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (f14527a == null) {
            try {
                f14527a = new C7976h();
                ((TelephonyManager) getSystemService("phone")).listen(f14527a, 33);
            } catch (SecurityException unused) {
                C4878b.m18868g("Monitoring phone state failed - missing READ_PHONE_STATE permission");
                C7439d0.m30909o0(this, "android.permission.READ_PHONE_STATE", getString(C17541R$string.trigger_call_active), true, false);
            }
        }
    }

    public void onDestroy() {
        ((TelephonyManager) getSystemService("phone")).listen(f14527a, 0);
        f14527a = null;
        super.onDestroy();
    }
}
