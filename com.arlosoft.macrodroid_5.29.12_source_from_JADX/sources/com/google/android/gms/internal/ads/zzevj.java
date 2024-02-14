package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevj implements zzevd {

    /* renamed from: a */
    public final boolean f35014a;

    /* renamed from: b */
    public final boolean f35015b;

    /* renamed from: c */
    public final String f35016c;

    /* renamed from: d */
    public final boolean f35017d;

    /* renamed from: e */
    public final boolean f35018e;

    /* renamed from: f */
    public final boolean f35019f;

    /* renamed from: g */
    public final String f35020g;

    /* renamed from: h */
    public final ArrayList f35021h;

    /* renamed from: i */
    public final String f35022i;

    /* renamed from: j */
    public final String f35023j;

    /* renamed from: k */
    public final String f35024k;

    /* renamed from: l */
    public final boolean f35025l;

    /* renamed from: m */
    public final String f35026m;

    /* renamed from: n */
    public final long f35027n;

    /* renamed from: o */
    public final boolean f35028o;

    public zzevj(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j, boolean z7) {
        this.f35014a = z;
        this.f35015b = z2;
        this.f35016c = str;
        this.f35017d = z3;
        this.f35018e = z4;
        this.f35019f = z5;
        this.f35020g = str2;
        this.f35021h = arrayList;
        this.f35022i = str3;
        this.f35023j = str4;
        this.f35024k = str5;
        this.f35025l = z6;
        this.f35026m = str6;
        this.f35027n = j;
        this.f35028o = z7;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f35014a);
        bundle.putBoolean("coh", this.f35015b);
        bundle.putString("gl", this.f35016c);
        bundle.putBoolean("simulator", this.f35017d);
        bundle.putBoolean("is_latchsky", this.f35018e);
        bundle.putBoolean("is_sidewinder", this.f35019f);
        bundle.putString("hl", this.f35020g);
        if (!this.f35021h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f35021h);
        }
        bundle.putString("mv", this.f35022i);
        bundle.putString("submodel", this.f35026m);
        Bundle a = zzfeq.m50020a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.f35024k);
        a.putLong("remaining_data_partition_space", this.f35027n);
        Bundle a2 = zzfeq.m50020a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.f35025l);
        if (!TextUtils.isEmpty(this.f35023j)) {
            Bundle a3 = zzfeq.m50020a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.f35023j);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26985R8)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f35028o);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26965P8)).booleanValue()) {
            bundle.putBoolean("gotmt_l", ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue());
            bundle.putBoolean("gotmt_i", ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26925L8)).booleanValue());
        }
    }
}
