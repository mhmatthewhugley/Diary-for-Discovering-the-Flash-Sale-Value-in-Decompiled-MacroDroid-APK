package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbue;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zzfzq;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zze {

    /* renamed from: a */
    private Context f2323a;

    /* renamed from: b */
    private long f2324b = 0;

    /* renamed from: a */
    public final void mo20418a(Context context, zzcgv zzcgv, String str, @Nullable Runnable runnable, zzfjw zzfjw) {
        mo20419b(context, zzcgv, true, (zzcfs) null, str, (String) null, runnable, zzfjw);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public final void mo20419b(Context context, zzcgv zzcgv, boolean z, @Nullable zzcfs zzcfs, String str, @Nullable String str2, @Nullable Runnable runnable, zzfjw zzfjw) {
        PackageInfo f;
        if (zzt.m2889b().mo21952c() - this.f2324b < 5000) {
            zzcgp.m45229g("Not retrying to fetch app settings");
            return;
        }
        this.f2324b = zzt.m2889b().mo21952c();
        if (zzcfs != null) {
            long a = zzcfs.mo43476a();
            if (zzt.m2889b().mo21950a() - a <= ((Long) zzay.m1924c().mo42663b(zzbjc.f27145i3)).longValue() && zzcfs.mo43484i()) {
                return;
            }
        }
        if (context == null) {
            zzcgp.m45229g("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f2323a = applicationContext;
            zzfjj a2 = zzfji.m50258a(context, 4);
            a2.mo45794c();
            zzbuk a3 = zzt.m2895h().mo42996a(this.f2323a, zzcgv, zzfjw);
            zzbue zzbue = zzbuh.f27784b;
            zzbua a4 = a3.mo43000a("google.afma.config.fetchAppSettings", zzbue, zzbue);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbjc.m43540a()));
                try {
                    ApplicationInfo applicationInfo = this.f2323a.getApplicationInfo();
                    if (!(applicationInfo == null || (f = Wrappers.m4929a(context).mo21963f(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put(ClientCookie.VERSION_ATTR, f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.m2645k("Error fetching PackageInfo.");
                }
                zzfzp c = a4.mo42995c(jSONObject);
                zzd zzd = new zzd(zzfjw, a2);
                zzfzq zzfzq = zzchc.f28461f;
                zzfzp n = zzfzg.m51419n(c, zzd, zzfzq);
                if (runnable != null) {
                    c.mo43580q(runnable, zzfzq);
                }
                zzchf.m45244a(n, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                zzcgp.m45227e("Error requesting application settings", e);
                a2.mo45801o0(false);
                zzfjw.mo45831b(a2.mo45799h());
            }
        } else {
            zzcgp.m45229g("App settings could not be fetched. Required parameters missing");
        }
    }

    /* renamed from: c */
    public final void mo20420c(Context context, zzcgv zzcgv, String str, zzcfs zzcfs, zzfjw zzfjw) {
        mo20419b(context, zzcgv, false, zzcfs, zzcfs != null ? zzcfs.mo43477b() : null, str, (Runnable) null, zzfjw);
    }
}
