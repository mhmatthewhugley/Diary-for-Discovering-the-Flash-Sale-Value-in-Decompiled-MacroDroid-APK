package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbmf extends NativeAd.Image {

    /* renamed from: a */
    private final zzbme f27560a;

    /* renamed from: b */
    private final Drawable f27561b;

    /* renamed from: c */
    private final Uri f27562c;

    /* renamed from: d */
    private final double f27563d;

    /* renamed from: e */
    private final int f27564e;

    /* renamed from: f */
    private final int f27565f;

    public zzbmf(zzbme zzbme) {
        Drawable drawable;
        double d;
        int i;
        this.f27560a = zzbme;
        Uri uri = null;
        try {
            IObjectWrapper c = zzbme.mo42743c();
            if (c != null) {
                drawable = (Drawable) ObjectWrapper.m5050A1(c);
                this.f27561b = drawable;
                uri = this.f27560a.mo42742b();
                this.f27562c = uri;
                d = this.f27560a.zzb();
                this.f27563d = d;
                int i2 = -1;
                i = this.f27560a.mo42744d();
                this.f27564e = i;
                i2 = this.f27560a.mo42741a();
                this.f27565f = i2;
            }
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
        drawable = null;
        this.f27561b = drawable;
        try {
            uri = this.f27560a.mo42742b();
        } catch (RemoteException e2) {
            zzcgp.m45227e("", e2);
        }
        this.f27562c = uri;
        try {
            d = this.f27560a.zzb();
        } catch (RemoteException e3) {
            zzcgp.m45227e("", e3);
            d = 1.0d;
        }
        this.f27563d = d;
        int i22 = -1;
        try {
            i = this.f27560a.mo42744d();
        } catch (RemoteException e4) {
            zzcgp.m45227e("", e4);
            i = -1;
        }
        this.f27564e = i;
        try {
            i22 = this.f27560a.mo42741a();
        } catch (RemoteException e5) {
            zzcgp.m45227e("", e5);
        }
        this.f27565f = i22;
    }

    /* renamed from: a */
    public final Drawable mo19786a() {
        return this.f27561b;
    }

    /* renamed from: b */
    public final double mo19787b() {
        return this.f27563d;
    }

    /* renamed from: c */
    public final Uri mo19788c() {
        return this.f27562c;
    }

    /* renamed from: d */
    public final int mo19789d() {
        return this.f27565f;
    }

    /* renamed from: e */
    public final int mo19790e() {
        return this.f27564e;
    }
}
