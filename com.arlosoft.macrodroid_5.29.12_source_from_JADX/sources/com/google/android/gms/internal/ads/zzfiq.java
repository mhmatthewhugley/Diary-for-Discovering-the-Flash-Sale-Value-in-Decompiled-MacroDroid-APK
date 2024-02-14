package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfiq {

    /* renamed from: a */
    private final HashMap f35849a;

    /* renamed from: b */
    private final zzfiw f35850b = new zzfiw(zzt.m2889b());

    private zzfiq() {
        HashMap hashMap = new HashMap();
        this.f35849a = hashMap;
        hashMap.put("new_csi", "1");
    }

    /* renamed from: b */
    public static zzfiq m50227b(String str) {
        zzfiq zzfiq = new zzfiq();
        zzfiq.f35849a.put("action", str);
        return zzfiq;
    }

    /* renamed from: c */
    public static zzfiq m50228c(String str) {
        zzfiq zzfiq = new zzfiq();
        zzfiq.f35849a.put("request_id", str);
        return zzfiq;
    }

    /* renamed from: a */
    public final zzfiq mo45774a(@NonNull String str, @NonNull String str2) {
        this.f35849a.put(str, str2);
        return this;
    }

    /* renamed from: d */
    public final zzfiq mo45775d(@NonNull String str) {
        this.f35850b.mo45788b(str);
        return this;
    }

    /* renamed from: e */
    public final zzfiq mo45776e(@NonNull String str, @NonNull String str2) {
        this.f35850b.mo45789c(str, str2);
        return this;
    }

    /* renamed from: f */
    public final zzfiq mo45777f(zzfdk zzfdk) {
        this.f35849a.put("aai", zzfdk.f35558x);
        return this;
    }

    /* renamed from: g */
    public final zzfiq mo45778g(zzfdn zzfdn) {
        if (!TextUtils.isEmpty(zzfdn.f35566b)) {
            this.f35849a.put("gqi", zzfdn.f35566b);
        }
        return this;
    }

    /* renamed from: h */
    public final zzfiq mo45779h(zzfdw zzfdw, @Nullable zzcgc zzcgc) {
        zzfdv zzfdv = zzfdw.f35590b;
        mo45778g(zzfdv.f35587b);
        if (!zzfdv.f35586a.isEmpty()) {
            switch (((zzfdk) zzfdv.f35586a.get(0)).f35521b) {
                case 1:
                    this.f35849a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f35849a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f35849a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f35849a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f35849a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f35849a.put("ad_format", "app_open_ad");
                    if (zzcgc != null) {
                        this.f35849a.put("as", true != zzcgc.mo43543i() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.f35849a.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final zzfiq mo45780i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f35849a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f35849a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* renamed from: j */
    public final Map mo45781j() {
        HashMap hashMap = new HashMap(this.f35849a);
        for (zzfiv zzfiv : this.f35850b.mo45787a()) {
            hashMap.put(zzfiv.f35859a, zzfiv.f35860b);
        }
        return hashMap;
    }
}
