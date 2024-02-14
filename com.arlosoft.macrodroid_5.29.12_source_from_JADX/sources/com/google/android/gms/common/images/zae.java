package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zae extends zag {

    /* renamed from: c */
    private final WeakReference f3566c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21607a(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.f3566c.get();
        if (imageView == null) {
            return;
        }
        if (z2 || z3 || !(imageView instanceof zal)) {
            boolean z4 = false;
            if (!z2 && !z) {
                z4 = true;
            }
            if (z4) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zak) {
                    drawable2 = ((zak) drawable2).mo48590a();
                }
                drawable = new zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zal) {
                zal zal = (zal) imageView;
                throw null;
            } else if (drawable != null && z4) {
                ((zak) drawable).mo48591b(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            }
        } else {
            zal zal2 = (zal) imageView;
            throw null;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.f3566c.get();
        ImageView imageView2 = (ImageView) ((zae) obj).f3566c.get();
        return (imageView2 == null || imageView == null || !Objects.m4470a(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }
}
