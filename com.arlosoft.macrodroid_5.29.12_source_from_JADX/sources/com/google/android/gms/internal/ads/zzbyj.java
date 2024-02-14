package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyj extends NativeAd.Image {

    /* renamed from: a */
    private final zzbme f27998a;
    @Nullable

    /* renamed from: b */
    private final Drawable f27999b;
    @Nullable

    /* renamed from: c */
    private final Uri f28000c;

    /* renamed from: d */
    private final double f28001d;

    public zzbyj(zzbme zzbme) {
        Drawable drawable;
        double d;
        this.f27998a = zzbme;
        Uri uri = null;
        try {
            IObjectWrapper c = zzbme.mo42743c();
            if (c != null) {
                drawable = (Drawable) ObjectWrapper.m5050A1(c);
                this.f27999b = drawable;
                uri = this.f27998a.mo42742b();
                this.f28000c = uri;
                d = this.f27998a.zzb();
                this.f28001d = d;
                this.f27998a.mo42744d();
                this.f27998a.mo42741a();
            }
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
        drawable = null;
        this.f27999b = drawable;
        try {
            uri = this.f27998a.mo42742b();
        } catch (RemoteException e2) {
            zzcgp.m45227e("", e2);
        }
        this.f28000c = uri;
        try {
            d = this.f27998a.zzb();
        } catch (RemoteException e3) {
            zzcgp.m45227e("", e3);
            d = 1.0d;
        }
        this.f28001d = d;
        try {
            this.f27998a.mo42744d();
        } catch (RemoteException e4) {
            zzcgp.m45227e("", e4);
        }
        try {
            this.f27998a.mo42741a();
        } catch (RemoteException e5) {
            zzcgp.m45227e("", e5);
        }
    }
}
