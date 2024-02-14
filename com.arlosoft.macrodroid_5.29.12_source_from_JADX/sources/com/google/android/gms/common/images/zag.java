package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class zag {

    /* renamed from: a */
    final zad f3568a;

    /* renamed from: b */
    protected int f3569b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21607a(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo21612b(Context context, zam zam, boolean z) {
        int i = this.f3569b;
        mo21607a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21613c(Context context, Bitmap bitmap, boolean z) {
        Asserts.m4343c(bitmap);
        mo21607a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
