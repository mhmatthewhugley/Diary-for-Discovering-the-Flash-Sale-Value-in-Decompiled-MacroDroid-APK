package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbwo extends zzbvy {

    /* renamed from: a */
    private final UnifiedNativeAdMapper f27908a;

    public zzbwo(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f27908a = unifiedNativeAdMapper;
    }

    /* renamed from: B8 */
    public final void mo43131B8(IObjectWrapper iObjectWrapper) {
        this.f27908a.untrackView((View) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: D */
    public final void mo43132D() {
        this.f27908a.recordImpression();
    }

    /* renamed from: F */
    public final boolean mo43133F() {
        return this.f27908a.getOverrideClickHandling();
    }

    /* renamed from: V */
    public final boolean mo43134V() {
        return this.f27908a.getOverrideImpressionRecording();
    }

    /* renamed from: b */
    public final double mo43135b() {
        if (this.f27908a.getStarRating() != null) {
            return this.f27908a.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: b7 */
    public final void mo43136b7(IObjectWrapper iObjectWrapper) {
        this.f27908a.handleClick((View) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: c */
    public final float mo43137c() {
        return this.f27908a.getMediaContentAspectRatio();
    }

    /* renamed from: e */
    public final float mo43138e() {
        return this.f27908a.getDuration();
    }

    /* renamed from: f */
    public final float mo43139f() {
        return this.f27908a.getCurrentTime();
    }

    /* renamed from: g */
    public final Bundle mo43140g() {
        return this.f27908a.getExtras();
    }

    @Nullable
    /* renamed from: h */
    public final zzdk mo43141h() {
        if (this.f27908a.zzb() != null) {
            return this.f27908a.zzb().mo19753b();
        }
        return null;
    }

    @Nullable
    /* renamed from: i */
    public final zzblw mo43142i() {
        return null;
    }

    @Nullable
    /* renamed from: j */
    public final zzbme mo43143j() {
        NativeAd.Image icon = this.f27908a.getIcon();
        if (icon != null) {
            return new zzblq(icon.mo19786a(), icon.mo19788c(), icon.mo19787b(), icon.mo19790e(), icon.mo19789d());
        }
        return null;
    }

    @Nullable
    /* renamed from: k */
    public final IObjectWrapper mo43144k() {
        View adChoicesContent = this.f27908a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m5051g8(adChoicesContent);
    }

    @Nullable
    /* renamed from: l */
    public final IObjectWrapper mo43145l() {
        Object zzc = this.f27908a.zzc();
        if (zzc == null) {
            return null;
        }
        return ObjectWrapper.m5051g8(zzc);
    }

    /* renamed from: m */
    public final String mo43146m() {
        return this.f27908a.getAdvertiser();
    }

    @Nullable
    /* renamed from: n */
    public final IObjectWrapper mo43147n() {
        View zza = this.f27908a.zza();
        if (zza == null) {
            return null;
        }
        return ObjectWrapper.m5051g8(zza);
    }

    /* renamed from: p */
    public final String mo43148p() {
        return this.f27908a.getHeadline();
    }

    /* renamed from: q */
    public final String mo43149q() {
        return this.f27908a.getCallToAction();
    }

    /* renamed from: r */
    public final String mo43150r() {
        return this.f27908a.getPrice();
    }

    /* renamed from: s */
    public final String mo43151s() {
        return this.f27908a.getBody();
    }

    /* renamed from: u */
    public final String mo43152u() {
        return this.f27908a.getStore();
    }

    /* renamed from: w */
    public final List mo43153w() {
        List<NativeAd.Image> images = this.f27908a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new zzblq(next.mo19786a(), next.mo19788c(), next.mo19787b(), next.mo19790e(), next.mo19789d()));
            }
        }
        return arrayList;
    }

    /* renamed from: wa */
    public final void mo43154wa(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f27908a.trackViews((View) ObjectWrapper.m5050A1(iObjectWrapper), (HashMap) ObjectWrapper.m5050A1(iObjectWrapper2), (HashMap) ObjectWrapper.m5050A1(iObjectWrapper3));
    }
}
