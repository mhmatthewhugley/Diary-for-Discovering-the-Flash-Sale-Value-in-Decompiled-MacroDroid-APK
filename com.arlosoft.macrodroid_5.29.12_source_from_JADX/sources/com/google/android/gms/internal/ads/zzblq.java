package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzblq extends zzbmd {

    /* renamed from: a */
    private final Drawable f27521a;

    /* renamed from: c */
    private final Uri f27522c;

    /* renamed from: d */
    private final double f27523d;

    /* renamed from: f */
    private final int f27524f;

    /* renamed from: g */
    private final int f27525g;

    public zzblq(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f27521a = drawable;
        this.f27522c = uri;
        this.f27523d = d;
        this.f27524f = i;
        this.f27525g = i2;
    }

    /* renamed from: a */
    public final int mo42741a() {
        return this.f27525g;
    }

    /* renamed from: b */
    public final Uri mo42742b() throws RemoteException {
        return this.f27522c;
    }

    /* renamed from: c */
    public final IObjectWrapper mo42743c() throws RemoteException {
        return ObjectWrapper.m5051g8(this.f27521a);
    }

    /* renamed from: d */
    public final int mo42744d() {
        return this.f27524f;
    }

    public final double zzb() {
        return this.f27523d;
    }
}
