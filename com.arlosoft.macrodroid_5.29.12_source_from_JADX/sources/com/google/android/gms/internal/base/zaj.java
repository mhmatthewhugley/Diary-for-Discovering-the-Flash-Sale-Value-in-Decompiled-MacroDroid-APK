package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaj extends Drawable.ConstantState {

    /* renamed from: a */
    int f39255a;

    /* renamed from: b */
    int f39256b;

    zaj(@Nullable zaj zaj) {
        if (zaj != null) {
            this.f39255a = zaj.f39255a;
            this.f39256b = zaj.f39256b;
        }
    }

    public final int getChangingConfigurations() {
        return this.f39255a;
    }

    public final Drawable newDrawable() {
        return new zak(this);
    }
}
