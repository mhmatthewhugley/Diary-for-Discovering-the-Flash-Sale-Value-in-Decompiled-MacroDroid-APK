package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaf extends zag {

    /* renamed from: c */
    private final WeakReference f3567c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21607a(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (!z2 && (onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f3567c.get()) != null) {
            onImageLoadedListener.mo21591a(this.f3568a.f3565a, drawable, z3);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf)) {
            return false;
        }
        zaf zaf = (zaf) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f3567c.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) zaf.f3567c.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.m4470a(onImageLoadedListener2, onImageLoadedListener) && Objects.m4470a(zaf.f3568a, this.f3568a);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f3568a);
    }
}
