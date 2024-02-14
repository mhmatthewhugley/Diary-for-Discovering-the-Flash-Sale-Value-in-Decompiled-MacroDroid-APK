package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevp implements zzeve {

    /* renamed from: a */
    private final zzfzq f35041a;

    /* renamed from: b */
    private final Context f35042b;

    public zzevp(zzfzq zzfzq, Context context) {
        this.f35041a = zzfzq;
        this.f35042b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzevn mo45488a() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.f35042b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.m2905r();
        int i3 = -1;
        if (zzs.m2747U(this.f35042b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f35042b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new zzevn(networkOperator, i2, zzt.m2906s().mo20255j(this.f35042b), phoneType, z, i);
    }

    public final int zza() {
        return 39;
    }

    public final zzfzp zzb() {
        return this.f35041a.mo46579F(new zzevo(this));
    }
}
