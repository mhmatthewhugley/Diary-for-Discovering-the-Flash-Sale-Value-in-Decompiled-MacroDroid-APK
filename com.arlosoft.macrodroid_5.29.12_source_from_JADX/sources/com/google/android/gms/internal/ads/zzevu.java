package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevu implements zzevd {

    /* renamed from: a */
    private final AdvertisingIdClient.Info f35052a;

    /* renamed from: b */
    private final String f35053b;

    public zzevu(AdvertisingIdClient.Info info, String str) {
        this.f35052a = info;
        this.f35053b = str;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            JSONObject f = zzbu.m2596f((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f35052a;
            if (info == null || TextUtils.isEmpty(info.mo19848a())) {
                f.put("pdid", this.f35053b);
                f.put("pdidtype", "ssaid");
                return;
            }
            f.put("rdid", this.f35052a.mo19848a());
            f.put("is_lat", this.f35052a.mo19849b());
            f.put("idtype", "adid");
        } catch (JSONException e) {
            zze.m2646l("Failed putting Ad ID.", e);
        }
    }
}
