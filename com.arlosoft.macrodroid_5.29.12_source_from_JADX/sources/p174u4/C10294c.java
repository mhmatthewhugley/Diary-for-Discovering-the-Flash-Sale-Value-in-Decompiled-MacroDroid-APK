package p174u4;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p120k4.C7587c;

/* renamed from: u4.c */
/* compiled from: NonOwnedDrawableResource */
final class C10294c extends C10293b<Drawable> {
    private C10294c(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    /* renamed from: d */
    static C7587c<Drawable> m40445d(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new C10294c(drawable);
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    public Class<Drawable> mo33103b() {
        return this.f23450a.getClass();
    }

    public int getSize() {
        return Math.max(1, this.f23450a.getIntrinsicWidth() * this.f23450a.getIntrinsicHeight() * 4);
    }

    public void recycle() {
    }
}
