package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzecj implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzeck f33681a;

    zzecj(zzeck zzeck) {
        this.f33681a = zzeck;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue()) {
            Matcher matcher = zzeck.f33682h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f33681a.f33687e.mo45266i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        zzfdw zzfdw = (zzfdw) obj;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue()) {
            this.f33681a.f33687e.mo45266i(zzfdw.f35590b.f35587b.f35569e);
            this.f33681a.f33687e.mo45267j(zzfdw.f35590b.f35587b.f35570f);
        }
    }
}
