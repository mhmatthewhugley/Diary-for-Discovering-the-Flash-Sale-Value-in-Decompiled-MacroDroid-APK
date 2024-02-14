package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeko {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Clock f34293a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzekp f34294b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzfkm f34295c;

    /* renamed from: d */
    private final List f34296d = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f34297e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzehh f34298f;

    public zzeko(Clock clock, zzekp zzekp, zzehh zzehh, zzfkm zzfkm) {
        this.f34293a = clock;
        this.f34294b = zzekp;
        this.f34297e = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27022V5)).booleanValue();
        this.f34298f = zzehh;
        this.f34295c = zzfkm;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m49007g(zzeko zzeko, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27263u1)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzeko.f34296d.add(str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final zzfzp mo45350e(zzfdw zzfdw, zzfdk zzfdk, zzfzp zzfzp, zzfki zzfki) {
        zzfdn zzfdn = zzfdw.f35590b.f35587b;
        long c = this.f34293a.mo21952c();
        String str = zzfdk.f35558x;
        if (str != null) {
            zzfzg.m51423r(zzfzp, new zzekn(this, c, str, zzfdk, zzfdn, zzfki, zzfdw), zzchc.f28461f);
        }
        return zzfzp;
    }

    /* renamed from: f */
    public final String mo45351f() {
        return TextUtils.join("_", this.f34296d);
    }
}
