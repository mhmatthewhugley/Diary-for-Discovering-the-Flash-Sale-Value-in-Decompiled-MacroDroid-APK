package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.apache.http.client.methods.HttpHead;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeuu implements zzevd {

    /* renamed from: a */
    public final boolean f34977a;

    /* renamed from: b */
    public final boolean f34978b;

    /* renamed from: c */
    public final String f34979c;

    /* renamed from: d */
    public final boolean f34980d;

    /* renamed from: e */
    public final int f34981e;

    /* renamed from: f */
    public final int f34982f;

    /* renamed from: g */
    public final int f34983g;

    public zzeuu(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f34977a = z;
        this.f34978b = z2;
        this.f34979c = str;
        this.f34980d = z3;
        this.f34981e = i;
        this.f34982f = i2;
        this.f34983g = i3;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f34979c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzay.m1924c().mo42663b(zzbjc.f26959P2));
        bundle.putInt("target_api", this.f34981e);
        bundle.putInt("dv", this.f34982f);
        bundle.putInt("lv", this.f34983g);
        Bundle a = zzfeq.m50020a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) zzbks.f27463a.mo42728e()).booleanValue());
        a.putBoolean("instant_app", this.f34977a);
        a.putBoolean("lite", this.f34978b);
        a.putBoolean("is_privileged_process", this.f34980d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = zzfeq.m50020a(a, "build_meta");
        a2.putString("cl", "474357726");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", HttpHead.METHOD_NAME);
        a.putBundle("build_meta", a2);
    }
}
