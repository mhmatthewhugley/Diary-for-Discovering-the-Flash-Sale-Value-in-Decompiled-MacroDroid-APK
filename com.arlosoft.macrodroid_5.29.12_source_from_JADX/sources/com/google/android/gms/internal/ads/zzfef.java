package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfef {
    @Nullable

    /* renamed from: a */
    public final zzff f35626a;
    @Nullable

    /* renamed from: b */
    public final zzbsc f35627b;
    @Nullable

    /* renamed from: c */
    public final zzeof f35628c;

    /* renamed from: d */
    public final zzl f35629d;

    /* renamed from: e */
    public final zzq f35630e;

    /* renamed from: f */
    public final String f35631f;

    /* renamed from: g */
    public final ArrayList f35632g;

    /* renamed from: h */
    public final ArrayList f35633h;

    /* renamed from: i */
    public final zzbls f35634i;

    /* renamed from: j */
    public final zzw f35635j;

    /* renamed from: k */
    public final int f35636k;

    /* renamed from: l */
    public final AdManagerAdViewOptions f35637l;

    /* renamed from: m */
    public final PublisherAdViewOptions f35638m;

    /* renamed from: n */
    public final zzbz f35639n;

    /* renamed from: o */
    public final zzfds f35640o;

    /* renamed from: p */
    public final boolean f35641p;

    /* renamed from: q */
    public final boolean f35642q;
    @Nullable

    /* renamed from: r */
    public final zzcd f35643r;

    /* synthetic */ zzfef(zzfed zzfed, zzfee zzfee) {
        zzff zzff;
        zzbls zzbls;
        this.f35630e = zzfed.f35608b;
        this.f35631f = zzfed.f35609c;
        this.f35643r = zzfed.f35625s;
        int i = zzfed.f35607a.f1997a;
        long j = zzfed.f35607a.f1998c;
        Bundle bundle = zzfed.f35607a.f1999d;
        int i2 = zzfed.f35607a.f2000f;
        List list = zzfed.f35607a.f2001g;
        boolean z = zzfed.f35607a.f2002o;
        int i3 = zzfed.f35607a.f2003p;
        boolean z2 = true;
        if (!zzfed.f35607a.f2004s && !zzfed.f35611e) {
            z2 = false;
        }
        this.f35629d = new zzl(i, j, bundle, i2, list, z, i3, z2, zzfed.f35607a.f2005z, zzfed.f35607a.f1982A, zzfed.f35607a.f1983B, zzfed.f35607a.f1984C, zzfed.f35607a.f1985D, zzfed.f35607a.f1986E, zzfed.f35607a.f1987F, zzfed.f35607a.f1988G, zzfed.f35607a.f1989H, zzfed.f35607a.f1990I, zzfed.f35607a.f1991J, zzfed.f35607a.f1992K, zzfed.f35607a.f1993L, zzfed.f35607a.f1994M, zzs.m2773x(zzfed.f35607a.f1995N), zzfed.f35607a.f1996O);
        if (zzfed.f35610d != null) {
            zzff = zzfed.f35610d;
        } else {
            zzff = zzfed.f35614h != null ? zzfed.f35614h.f27531o : null;
        }
        this.f35626a = zzff;
        this.f35632g = zzfed.f35612f;
        this.f35633h = zzfed.f35613g;
        if (zzfed.f35612f == null) {
            zzbls = null;
        } else {
            zzbls = zzfed.f35614h == null ? new zzbls(new NativeAdOptions.Builder().mo19798a()) : zzfed.f35614h;
        }
        this.f35634i = zzbls;
        this.f35635j = zzfed.f35615i;
        this.f35636k = zzfed.f35619m;
        this.f35637l = zzfed.f35616j;
        this.f35638m = zzfed.f35617k;
        this.f35639n = zzfed.f35618l;
        this.f35627b = zzfed.f35620n;
        this.f35640o = new zzfds(zzfed.f35621o, (zzfdr) null);
        this.f35641p = zzfed.f35622p;
        this.f35628c = zzfed.f35623q;
        this.f35642q = zzfed.f35624r;
    }

    @Nullable
    /* renamed from: a */
    public final zzbnv mo45626a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f35638m;
        if (publisherAdViewOptions == null && this.f35637l == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.mo19812m2();
        }
        return this.f35637l.mo19782m2();
    }
}
