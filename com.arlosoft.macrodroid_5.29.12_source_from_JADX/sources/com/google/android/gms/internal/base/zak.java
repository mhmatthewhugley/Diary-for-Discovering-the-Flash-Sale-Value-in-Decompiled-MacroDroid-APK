package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zak extends Drawable implements Drawable.Callback {

    /* renamed from: A */
    private Drawable f39257A;

    /* renamed from: B */
    private Drawable f39258B;

    /* renamed from: C */
    private boolean f39259C;

    /* renamed from: D */
    private boolean f39260D;

    /* renamed from: E */
    private boolean f39261E;

    /* renamed from: F */
    private int f39262F;

    /* renamed from: a */
    private int f39263a;

    /* renamed from: c */
    private long f39264c;

    /* renamed from: d */
    private int f39265d;

    /* renamed from: f */
    private int f39266f;

    /* renamed from: g */
    private int f39267g;

    /* renamed from: o */
    private int f39268o;

    /* renamed from: p */
    private boolean f39269p;

    /* renamed from: s */
    private boolean f39270s;

    /* renamed from: z */
    private zaj f39271z;

    public zak(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this((zaj) null);
        drawable = drawable == null ? zai.f39253a : drawable;
        this.f39257A = drawable;
        drawable.setCallback(this);
        zaj zaj = this.f39271z;
        zaj.f39256b = drawable.getChangingConfigurations() | zaj.f39256b;
        drawable2 = drawable2 == null ? zai.f39253a : drawable2;
        this.f39258B = drawable2;
        drawable2.setCallback(this);
        zaj zaj2 = this.f39271z;
        zaj2.f39256b = drawable2.getChangingConfigurations() | zaj2.f39256b;
    }

    /* renamed from: a */
    public final Drawable mo48590a() {
        return this.f39258B;
    }

    /* renamed from: b */
    public final void mo48591b(int i) {
        this.f39265d = this.f39266f;
        this.f39268o = 0;
        this.f39267g = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        this.f39263a = 1;
        invalidateSelf();
    }

    /* renamed from: c */
    public final boolean mo48592c() {
        if (!this.f39259C) {
            boolean z = false;
            if (!(this.f39257A.getConstantState() == null || this.f39258B.getConstantState() == null)) {
                z = true;
            }
            this.f39260D = z;
            this.f39259C = true;
        }
        return this.f39260D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r0 == 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.f39263a
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0039
            if (r0 == r1) goto L_0x000a
            goto L_0x0042
        L_0x000a:
            long r0 = r7.f39264c
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0042
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f39264c
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r7.f39267g
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x002a
            r7.f39263a = r2
        L_0x002a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f39265d
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f39268o = r0
            goto L_0x0042
        L_0x0039:
            long r3 = android.os.SystemClock.uptimeMillis()
            r7.f39264c = r3
            r7.f39263a = r1
            r3 = 0
        L_0x0042:
            int r0 = r7.f39268o
            boolean r1 = r7.f39269p
            android.graphics.drawable.Drawable r4 = r7.f39257A
            android.graphics.drawable.Drawable r5 = r7.f39258B
            if (r3 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0056
            goto L_0x0052
        L_0x0051:
            r2 = r0
        L_0x0052:
            r4.draw(r8)
            r0 = r2
        L_0x0056:
            int r1 = r7.f39266f
            if (r0 != r1) goto L_0x0060
            r5.setAlpha(r1)
            r5.draw(r8)
        L_0x0060:
            return
        L_0x0061:
            if (r1 == 0) goto L_0x0069
            int r2 = r7.f39266f
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L_0x0069:
            r4.draw(r8)
            if (r1 == 0) goto L_0x0073
            int r1 = r7.f39266f
            r4.setAlpha(r1)
        L_0x0073:
            if (r0 <= 0) goto L_0x0080
            r5.setAlpha(r0)
            r5.draw(r8)
            int r8 = r7.f39266f
            r5.setAlpha(r8)
        L_0x0080:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zak.draw(android.graphics.Canvas):void");
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zaj zaj = this.f39271z;
        return changingConfigurations | zaj.f39255a | zaj.f39256b;
    }

    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!mo48592c()) {
            return null;
        }
        this.f39271z.f39255a = getChangingConfigurations();
        return this.f39271z;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f39257A.getIntrinsicHeight(), this.f39258B.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f39257A.getIntrinsicWidth(), this.f39258B.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.f39261E) {
            this.f39262F = Drawable.resolveOpacity(this.f39257A.getOpacity(), this.f39258B.getOpacity());
            this.f39261E = true;
        }
        return this.f39262F;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @CanIgnoreReturnValue
    public final Drawable mutate() {
        if (!this.f39270s && super.mutate() == this) {
            if (mo48592c()) {
                this.f39257A.mutate();
                this.f39258B.mutate();
                this.f39270s = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f39257A.setBounds(rect);
        this.f39258B.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f39268o == this.f39266f) {
            this.f39268o = i;
        }
        this.f39266f = i;
        invalidateSelf();
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f39257A.setColorFilter(colorFilter);
        this.f39258B.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    zak(@Nullable zaj zaj) {
        this.f39263a = 0;
        this.f39266f = 255;
        this.f39268o = 0;
        this.f39269p = true;
        this.f39271z = new zaj(zaj);
    }
}
