package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zza {
    /* renamed from: a */
    public static final boolean m2429a(Context context, Intent intent, zzz zzz, @Nullable zzx zzx, boolean z) {
        if (z) {
            return m2431c(context, intent.getData(), zzz, zzx);
        }
        try {
            String uri = intent.toURI();
            zze.m2645k("Launching an intent: " + uri);
            zzt.m2905r();
            zzs.m2759j(context, intent);
            if (zzz != null) {
                zzz.mo20242f();
            }
            if (zzx != null) {
                zzx.mo20241O(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzcgp.m45229g(e.getMessage());
            if (zzx != null) {
                zzx.mo20241O(false);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m2430b(Context context, @Nullable zzc zzc, zzz zzz, @Nullable zzx zzx) {
        int i = 0;
        if (zzc == null) {
            zzcgp.m45229g("No intent data for launcher overlay.");
            return false;
        }
        zzbjc.m43542c(context);
        Intent intent = zzc.f2085s;
        if (intent != null) {
            return m2429a(context, intent, zzz, zzx, zzc.f2077A);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzc.f2079c)) {
            zzcgp.m45229g("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.f2080d)) {
            intent2.setDataAndType(Uri.parse(zzc.f2079c), zzc.f2080d);
        } else {
            intent2.setData(Uri.parse(zzc.f2079c));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.f2081f)) {
            intent2.setPackage(zzc.f2081f);
        }
        if (!TextUtils.isEmpty(zzc.f2082g)) {
            String[] split = zzc.f2082g.split("/", 2);
            if (split.length < 2) {
                zzcgp.m45229g("Could not parse component name from open GMSG: ".concat(String.valueOf(zzc.f2082g)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzc.f2083o;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzcgp.m45229g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26870G3)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26860F3)).booleanValue()) {
                zzt.m2905r();
                zzs.m2736J(context, intent2);
            }
        }
        return m2429a(context, intent2, zzz, zzx, zzc.f2077A);
    }

    /* renamed from: c */
    private static final boolean m2431c(Context context, Uri uri, zzz zzz, zzx zzx) {
        int i;
        try {
            i = zzt.m2905r().mo20410H(context, uri);
            if (zzz != null) {
                zzz.mo20242f();
            }
        } catch (ActivityNotFoundException e) {
            zzcgp.m45229g(e.getMessage());
            i = 6;
        }
        if (zzx != null) {
            zzx.mo20240B(i);
        }
        return i == 5;
    }
}
