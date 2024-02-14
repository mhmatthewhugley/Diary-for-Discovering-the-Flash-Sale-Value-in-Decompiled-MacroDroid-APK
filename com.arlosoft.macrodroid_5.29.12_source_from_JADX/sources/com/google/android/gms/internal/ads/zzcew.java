package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcew {
    @VisibleForTesting
    /* renamed from: a */
    static Uri m45058a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* renamed from: b */
    public static String m45059b(Uri uri, Context context) {
        if (!zzt.m2903p().mo43449z(context)) {
            return uri.toString();
        }
        String f = zzt.m2903p().mo43429f(context);
        if (f == null) {
            return uri.toString();
        }
        String str = (String) zzay.m1924c().mo42663b(zzbjc.f27082c0);
        String uri2 = uri.toString();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27072b0)).booleanValue() && uri2.contains(str)) {
            zzt.m2903p().mo43441r(context, f);
            return m45061d(uri2, context).replace(str, f);
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        } else {
            String uri3 = m45058a(m45061d(uri2, context), "fbs_aeid", f).toString();
            zzt.m2903p().mo43441r(context, f);
            return uri3;
        }
    }

    /* renamed from: c */
    public static String m45060c(String str, Context context, boolean z) {
        String f;
        if ((((Boolean) zzay.m1924c().mo42663b(zzbjc.f27152j0)).booleanValue() && !z) || !zzt.m2903p().mo43449z(context) || TextUtils.isEmpty(str) || (f = zzt.m2903p().mo43429f(context)) == null) {
            return str;
        }
        String str2 = (String) zzay.m1924c().mo42663b(zzbjc.f27082c0);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27072b0)).booleanValue() || !str.contains(str2)) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (zzt.m2905r().mo20406D(str)) {
                zzt.m2903p().mo43441r(context, f);
                return m45058a(m45061d(str, context), "fbs_aeid", f).toString();
            } else if (!zzt.m2905r().mo20407E(str)) {
                return str;
            } else {
                zzt.m2903p().mo43442s(context, f);
                return m45058a(m45061d(str, context), "fbs_aeid", f).toString();
            }
        } else if (zzt.m2905r().mo20406D(str)) {
            zzt.m2903p().mo43441r(context, f);
            return m45061d(str, context).replace(str2, f);
        } else if (!zzt.m2905r().mo20407E(str)) {
            return str;
        } else {
            zzt.m2903p().mo43442s(context, f);
            return m45061d(str, context).replace(str2, f);
        }
    }

    /* renamed from: d */
    private static String m45061d(String str, Context context) {
        String j = zzt.m2903p().mo43433j(context);
        String h = zzt.m2903p().mo43431h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(j)) {
            str = m45058a(str, "gmp_app_id", j).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(h)) ? str : m45058a(str, "fbs_aiid", h).toString();
    }
}
