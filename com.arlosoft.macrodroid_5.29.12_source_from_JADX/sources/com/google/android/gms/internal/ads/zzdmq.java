package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdmq implements zzdeo, zzo, zzddu {

    /* renamed from: a */
    private final Context f32466a;
    @Nullable

    /* renamed from: c */
    private final zzcmp f32467c;

    /* renamed from: d */
    private final zzfdk f32468d;

    /* renamed from: f */
    private final zzcgv f32469f;

    /* renamed from: g */
    private final zzbez f32470g;
    @Nullable
    @VisibleForTesting

    /* renamed from: o */
    IObjectWrapper f32471o;

    public zzdmq(Context context, @Nullable zzcmp zzcmp, zzfdk zzfdk, zzcgv zzcgv, zzbez zzbez) {
        this.f32466a = context;
        this.f32467c = zzcmp;
        this.f32468d = zzfdk;
        this.f32469f = zzcgv;
        this.f32470g = zzbez;
    }

    /* renamed from: Z8 */
    public final void mo20216Z8() {
    }

    /* renamed from: b */
    public final void mo20217b() {
    }

    /* renamed from: j */
    public final void mo44390j() {
        if (this.f32471o != null && this.f32467c != null) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27176l4)).booleanValue()) {
                this.f32467c.mo42954y("onSdkImpression", new ArrayMap());
            }
        }
    }

    /* renamed from: n */
    public final void mo44393n() {
        zzeha zzeha;
        zzehb zzehb;
        zzehb zzehb2;
        zzbez zzbez = this.f32470g;
        if ((zzbez == zzbez.REWARD_BASED_VIDEO_AD || zzbez == zzbez.INTERSTITIAL || zzbez == zzbez.APP_OPEN) && this.f32468d.f35513U && this.f32467c != null && zzt.m2888a().mo45294d(this.f32466a)) {
            zzcgv zzcgv = this.f32469f;
            String str = zzcgv.f28447c + "." + zzcgv.f28448d;
            String a = this.f32468d.f35515W.mo45627a();
            if (this.f32468d.f35515W.mo45628b() == 1) {
                zzeha = zzeha.VIDEO;
                zzehb = zzehb.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.f32468d.f35518Z == 2) {
                    zzehb2 = zzehb.UNSPECIFIED;
                } else {
                    zzehb2 = zzehb.BEGIN_TO_RENDER;
                }
                zzehb = zzehb2;
                zzeha = zzeha.HTML_DISPLAY;
            }
            IObjectWrapper a2 = zzt.m2888a().mo45291a(str, this.f32467c.mo44029S(), "", "javascript", a, zzehb, zzeha, this.f32468d.f35546n0);
            this.f32471o = a2;
            if (a2 != null) {
                zzt.m2888a().mo45293c(this.f32471o, (View) this.f32467c);
                this.f32467c.mo44015F0(this.f32471o);
                zzt.m2888a().mo45295d0(this.f32471o);
                this.f32467c.mo42954y("onSdkLoaded", new ArrayMap());
            }
        }
    }

    /* renamed from: sb */
    public final void mo20218sb() {
    }

    /* renamed from: t1 */
    public final void mo20219t1() {
    }

    /* renamed from: y */
    public final void mo20220y(int i) {
        this.f32471o = null;
    }

    public final void zzb() {
        if (this.f32471o != null && this.f32467c != null) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27176l4)).booleanValue()) {
                this.f32467c.mo42954y("onSdkImpression", new ArrayMap());
            }
        }
    }
}
