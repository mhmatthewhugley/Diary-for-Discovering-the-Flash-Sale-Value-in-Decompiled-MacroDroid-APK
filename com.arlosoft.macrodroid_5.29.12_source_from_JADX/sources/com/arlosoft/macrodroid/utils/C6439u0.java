package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.C13706o;
import p195y2.C10405a;

/* renamed from: com.arlosoft.macrodroid.utils.u0 */
/* compiled from: MobileDataUtil.kt */
public final class C6439u0 {

    /* renamed from: a */
    public static final C6439u0 f15065a = new C6439u0();

    private C6439u0() {
    }

    /* renamed from: a */
    public static final String m24742a(Context context) {
        C13706o.m87929f(context, "context");
        if (C10405a.f23647a.mo41099a()) {
            return "5G";
        }
        Object systemService = context.getSystemService("phone");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (telephonyManager.getSimState() == 1) {
            return "No Sim";
        }
        if (Build.VERSION.SDK_INT < 24) {
            return f15065a.m24743b(telephonyManager.getNetworkType());
        }
        return f15065a.m24743b(telephonyManager.getDataNetworkType());
    }

    /* renamed from: b */
    private final String m24743b(int i) {
        switch (i) {
            case 0:
                return "?";
            case 1:
                return "GPRS (2.5G)";
            case 2:
                return "EDGE (2.75G)";
            case 3:
            case 5:
            case 6:
            case 12:
                return "3G";
            case 4:
            case 7:
            case 11:
                return "2G";
            case 8:
            case 9:
            case 10:
                return "H (3G+)";
            case 13:
            case 18:
                return "4G";
            case 14:
            case 15:
            case 17:
                return "H+ (3G++)";
            case 16:
                return "GSM";
            case 20:
                return "5G";
            default:
                return "4G+";
        }
    }
}
