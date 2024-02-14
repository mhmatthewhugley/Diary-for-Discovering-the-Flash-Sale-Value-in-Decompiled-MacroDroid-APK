package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdxl {

    /* renamed from: a */
    private final ConcurrentHashMap f33318a;

    /* renamed from: b */
    private final zzcgc f33319b;

    /* renamed from: c */
    private final zzfef f33320c;

    /* renamed from: d */
    private final String f33321d;

    /* renamed from: e */
    private final String f33322e;

    public zzdxl(zzdxv zzdxv, zzcgc zzcgc, zzfef zzfef, String str, String str2) {
        ConcurrentHashMap c = zzdxv.mo45054c();
        this.f33318a = c;
        this.f33319b = zzcgc;
        this.f33320c = zzfef;
        this.f33321d = str;
        this.f33322e = str2;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27098d6)).booleanValue()) {
            int d = zzf.m3063d(zzfef);
            int i = d - 1;
            if (i != 0) {
                if (i == 1) {
                    c.put("se", "query_g");
                } else if (i == 2) {
                    c.put("se", "r_adinfo");
                } else if (i != 3) {
                    c.put("se", "r_both");
                } else {
                    c.put("se", "r_adstring");
                }
                c.put("scar", "true");
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26853E6)).booleanValue()) {
                    c.put("ad_format", str2);
                }
                if (d == 2) {
                    c.put("rid", str);
                }
                m48310d("ragent", zzfef.f35629d.f1988G);
                m48310d("rtype", zzf.m3060a(zzf.m3061b(zzfef.f35629d)));
                return;
            }
            c.put("scar", "false");
        }
    }

    /* renamed from: d */
    private final void m48310d(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f33318a.put(str, str2);
        }
    }

    /* renamed from: a */
    public final Map mo45036a() {
        return this.f33318a;
    }

    /* renamed from: b */
    public final void mo45037b(zzfdw zzfdw) {
        if (zzfdw.f35590b.f35586a.size() > 0) {
            switch (((zzfdk) zzfdw.f35590b.f35586a.get(0)).f35521b) {
                case 1:
                    this.f33318a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f33318a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f33318a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f33318a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f33318a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f33318a.put("ad_format", "app_open_ad");
                    this.f33318a.put("as", true != this.f33319b.mo43543i() ? "0" : "1");
                    break;
                default:
                    this.f33318a.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        m48310d("gqi", zzfdw.f35590b.f35587b.f35566b);
    }

    /* renamed from: c */
    public final void mo45038c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f33318a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f33318a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
