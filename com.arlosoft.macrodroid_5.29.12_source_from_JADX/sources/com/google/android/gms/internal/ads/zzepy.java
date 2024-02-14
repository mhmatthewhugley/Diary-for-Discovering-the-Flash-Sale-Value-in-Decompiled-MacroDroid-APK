package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepy implements zzevd {

    /* renamed from: a */
    public final zzq f34679a;

    /* renamed from: b */
    public final String f34680b;

    /* renamed from: c */
    public final boolean f34681c;

    /* renamed from: d */
    public final String f34682d;

    /* renamed from: e */
    public final float f34683e;

    /* renamed from: f */
    public final int f34684f;

    /* renamed from: g */
    public final int f34685g;

    /* renamed from: h */
    public final String f34686h;

    /* renamed from: i */
    public final boolean f34687i;

    public zzepy(zzq zzq, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.m4489l(zzq, "the adSize must not be null");
        this.f34679a = zzq;
        this.f34680b = str;
        this.f34681c = z;
        this.f34682d = str2;
        this.f34683e = f;
        this.f34684f = i;
        this.f34685g = i2;
        this.f34686h = str3;
        this.f34687i = z2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfeq.m50025f(bundle, "smart_w", "full", this.f34679a.f2029g == -1);
        zzfeq.m50025f(bundle, "smart_h", "auto", this.f34679a.f2026c == -2);
        zzfeq.m50026g(bundle, "ene", true, this.f34679a.f2019A);
        zzfeq.m50025f(bundle, "rafmt", "102", this.f34679a.f2022D);
        zzfeq.m50025f(bundle, "rafmt", "103", this.f34679a.f2023E);
        zzfeq.m50025f(bundle, "rafmt", "105", this.f34679a.f2024F);
        zzfeq.m50026g(bundle, "inline_adaptive_slot", true, this.f34687i);
        zzfeq.m50026g(bundle, "interscroller_slot", true, this.f34679a.f2024F);
        zzfeq.m50022c(bundle, "format", this.f34680b);
        zzfeq.m50025f(bundle, "fluid", "height", this.f34681c);
        String str = this.f34682d;
        zzfeq.m50025f(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f34683e);
        bundle.putInt("sw", this.f34684f);
        bundle.putInt("sh", this.f34685g);
        String str2 = this.f34686h;
        zzfeq.m50025f(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzq[] zzqArr = this.f34679a.f2031p;
        if (zzqArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f34679a.f2026c);
            bundle2.putInt("width", this.f34679a.f2029g);
            bundle2.putBoolean("is_fluid_height", this.f34679a.f2033z);
            arrayList.add(bundle2);
        } else {
            for (zzq zzq : zzqArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzq.f2033z);
                bundle3.putInt("height", zzq.f2026c);
                bundle3.putInt("width", zzq.f2029g);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
