package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzevb;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.cli.HelpFormatter;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzr {

    /* renamed from: a */
    private final Context f2356a;

    /* renamed from: b */
    private final String f2357b;

    /* renamed from: c */
    private final Map f2358c = new TreeMap();

    /* renamed from: d */
    private String f2359d;

    /* renamed from: e */
    private String f2360e;

    /* renamed from: f */
    private final String f2361f;

    public zzr(Context context, String str) {
        String str2;
        this.f2356a = context.getApplicationContext();
        this.f2357b = str;
        String packageName = context.getPackageName();
        try {
            str2 = packageName + HelpFormatter.DEFAULT_OPT_PREFIX + Wrappers.m4929a(context).mo21963f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            zzcgp.m45227e("Unable to get package version name for reporting", e);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.f2361f = str2;
    }

    /* renamed from: a */
    public final String mo20451a() {
        return this.f2361f;
    }

    /* renamed from: b */
    public final String mo20452b() {
        return this.f2360e;
    }

    /* renamed from: c */
    public final String mo20453c() {
        return this.f2357b;
    }

    /* renamed from: d */
    public final String mo20454d() {
        return this.f2359d;
    }

    /* renamed from: e */
    public final Map mo20455e() {
        return this.f2358c;
    }

    /* renamed from: f */
    public final void mo20456f(zzl zzl, zzcgv zzcgv) {
        this.f2359d = zzl.f1982A.f1971a;
        Bundle bundle = zzl.f1985D;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbkg.f27390c.mo42728e();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    this.f2360e = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f2358c.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            this.f2358c.put("SDKVersion", zzcgv.f28446a);
            if (((Boolean) zzbkg.f27388a.mo42728e()).booleanValue()) {
                try {
                    Bundle a = zzevb.m49523a(this.f2356a, new JSONArray((String) zzbkg.f27389b.mo42728e()));
                    for (String str3 : a.keySet()) {
                        this.f2358c.put(str3, a.get(str3).toString());
                    }
                } catch (JSONException e) {
                    zzcgp.m45227e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
    }
}
