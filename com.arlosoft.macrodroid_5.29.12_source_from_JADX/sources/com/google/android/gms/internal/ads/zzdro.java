package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdro implements zzfsm {

    /* renamed from: a */
    public final /* synthetic */ String f32885a;

    /* renamed from: b */
    public final /* synthetic */ double f32886b;

    /* renamed from: c */
    public final /* synthetic */ int f32887c;

    /* renamed from: d */
    public final /* synthetic */ int f32888d;

    public /* synthetic */ zzdro(String str, double d, int i, int i2) {
        this.f32885a = str;
        this.f32886b = d;
        this.f32887c = i;
        this.f32888d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f32885a;
        return new zzblq(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f32886b, this.f32887c, this.f32888d);
    }
}
