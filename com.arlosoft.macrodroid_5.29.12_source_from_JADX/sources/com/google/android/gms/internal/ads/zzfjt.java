package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfjt {
    /* renamed from: a */
    public static void m50318a(zzfzp zzfzp, zzfju zzfju, zzfjj zzfjj) {
        m50324g(zzfzp, zzfju, zzfjj, false);
    }

    /* renamed from: b */
    public static void m50319b(zzfzp zzfzp, zzfju zzfju, zzfjj zzfjj) {
        m50324g(zzfzp, zzfju, zzfjj, true);
    }

    /* renamed from: c */
    public static void m50320c(zzfzp zzfzp, zzfju zzfju, zzfjj zzfjj) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            zzfzg.m51423r(zzfyx.m51389C(zzfzp), new zzfjs(zzfju, zzfjj), zzchc.f28461f);
        }
    }

    /* renamed from: d */
    public static void m50321d(zzfzp zzfzp, zzfjj zzfjj) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            zzfzg.m51423r(zzfyx.m51389C(zzfzp), new zzfjq(zzfjj), zzchc.f28461f);
        }
    }

    /* renamed from: e */
    public static boolean m50322e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzay.m1924c().mo42663b(zzbjc.f26814A7), str);
    }

    /* renamed from: f */
    public static int m50323f(zzfef zzfef) {
        int d = zzf.m3063d(zzfef) - 1;
        return (d == 0 || d == 1) ? 7 : 23;
    }

    /* renamed from: g */
    private static void m50324g(zzfzp zzfzp, zzfju zzfju, zzfjj zzfjj, boolean z) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            zzfzg.m51423r(zzfyx.m51389C(zzfzp), new zzfjr(zzfju, zzfjj, z), zzchc.f28461f);
        }
    }
}
