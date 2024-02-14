package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdct extends zzdg {

    /* renamed from: a */
    private final String f32136a;

    /* renamed from: c */
    private final String f32137c;

    /* renamed from: d */
    private final String f32138d;

    /* renamed from: f */
    private final String f32139f;

    /* renamed from: g */
    private final List f32140g;

    /* renamed from: o */
    private final long f32141o;

    /* renamed from: p */
    private final String f32142p;

    /* renamed from: s */
    private final zzehh f32143s;

    /* renamed from: z */
    private final Bundle f32144z;

    public zzdct(zzfdk zzfdk, String str, zzehh zzehh, zzfdn zzfdn, String str2) {
        String str3;
        String str4;
        String str5 = null;
        if (zzfdk == null) {
            str3 = null;
        } else {
            str3 = zzfdk.f35524c0;
        }
        this.f32137c = str3;
        this.f32138d = str2;
        if (zzfdn == null) {
            str4 = null;
        } else {
            str4 = zzfdn.f35566b;
        }
        this.f32139f = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str5 = zzfdk.f35557w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f32136a = str5 != null ? str5 : str;
        this.f32140g = zzehh.mo45304c();
        this.f32143s = zzehh;
        this.f32141o = zzt.m2889b().mo21950a() / 1000;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27002T5)).booleanValue() || zzfdn == null) {
            this.f32144z = new Bundle();
        } else {
            this.f32144z = zzfdn.f35574j;
        }
        this.f32142p = (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27024V7)).booleanValue() || zzfdn == null || TextUtils.isEmpty(zzfdn.f35572h)) ? "" : zzfdn.f35572h;
    }

    /* renamed from: a */
    public final long mo44569a() {
        return this.f32141o;
    }

    /* renamed from: b */
    public final Bundle mo19992b() {
        return this.f32144z;
    }

    @Nullable
    /* renamed from: c */
    public final zzu mo19993c() {
        zzehh zzehh = this.f32143s;
        if (zzehh != null) {
            return zzehh.mo45302a();
        }
        return null;
    }

    /* renamed from: d */
    public final String mo44570d() {
        return this.f32142p;
    }

    /* renamed from: e */
    public final String mo19994e() {
        return this.f32138d;
    }

    /* renamed from: f */
    public final String mo19995f() {
        return this.f32136a;
    }

    /* renamed from: g */
    public final String mo19996g() {
        return this.f32137c;
    }

    /* renamed from: h */
    public final List mo19997h() {
        return this.f32140g;
    }

    /* renamed from: i */
    public final String mo44571i() {
        return this.f32139f;
    }
}
