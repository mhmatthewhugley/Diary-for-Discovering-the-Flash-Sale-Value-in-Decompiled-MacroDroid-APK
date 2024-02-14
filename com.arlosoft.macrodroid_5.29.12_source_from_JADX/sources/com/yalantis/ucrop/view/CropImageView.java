package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.R$styleable;
import com.yalantis.ucrop.view.TransformImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p368q8.C16232a;
import p368q8.C16234c;
import p377r8.C16362a;
import p377r8.C16364c;
import p386s8.C16506a;
import p395t8.C16582b;
import p395t8.C16590g;

public class CropImageView extends TransformImageView {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final RectF f57992G;

    /* renamed from: H */
    private final Matrix f57993H;

    /* renamed from: I */
    private float f57994I;

    /* renamed from: J */
    private float f57995J;

    /* renamed from: K */
    private C16234c f57996K;

    /* renamed from: L */
    private Runnable f57997L;

    /* renamed from: M */
    private Runnable f57998M;

    /* renamed from: N */
    private float f57999N;

    /* renamed from: O */
    private float f58000O;

    /* renamed from: P */
    private int f58001P;

    /* renamed from: Q */
    private int f58002Q;

    /* renamed from: R */
    private long f58003R;

    /* renamed from: com.yalantis.ucrop.view.CropImageView$a */
    private static class C11916a implements Runnable {

        /* renamed from: A */
        private final boolean f58004A;

        /* renamed from: a */
        private final WeakReference<CropImageView> f58005a;

        /* renamed from: c */
        private final long f58006c;

        /* renamed from: d */
        private final long f58007d = System.currentTimeMillis();

        /* renamed from: f */
        private final float f58008f;

        /* renamed from: g */
        private final float f58009g;

        /* renamed from: o */
        private final float f58010o;

        /* renamed from: p */
        private final float f58011p;

        /* renamed from: s */
        private final float f58012s;

        /* renamed from: z */
        private final float f58013z;

        public C11916a(CropImageView cropImageView, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f58005a = new WeakReference<>(cropImageView);
            this.f58006c = j;
            this.f58008f = f;
            this.f58009g = f2;
            this.f58010o = f3;
            this.f58011p = f4;
            this.f58012s = f5;
            this.f58013z = f6;
            this.f58004A = z;
        }

        public void run() {
            CropImageView cropImageView = (CropImageView) this.f58005a.get();
            if (cropImageView != null) {
                float min = (float) Math.min(this.f58006c, System.currentTimeMillis() - this.f58007d);
                float b = C16582b.m98840b(min, 0.0f, this.f58010o, (float) this.f58006c);
                float b2 = C16582b.m98840b(min, 0.0f, this.f58011p, (float) this.f58006c);
                float a = C16582b.m98839a(min, 0.0f, this.f58013z, (float) this.f58006c);
                if (min < ((float) this.f58006c)) {
                    float[] fArr = cropImageView.f58067c;
                    cropImageView.mo67300k(b - (fArr[0] - this.f58008f), b2 - (fArr[1] - this.f58009g));
                    if (!this.f58004A) {
                        cropImageView.mo67226B(this.f58012s + a, cropImageView.f57992G.centerX(), cropImageView.f57992G.centerY());
                    }
                    if (!cropImageView.mo67245t()) {
                        cropImageView.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.CropImageView$b */
    private static class C11917b implements Runnable {

        /* renamed from: a */
        private final WeakReference<CropImageView> f58014a;

        /* renamed from: c */
        private final long f58015c;

        /* renamed from: d */
        private final long f58016d = System.currentTimeMillis();

        /* renamed from: f */
        private final float f58017f;

        /* renamed from: g */
        private final float f58018g;

        /* renamed from: o */
        private final float f58019o;

        /* renamed from: p */
        private final float f58020p;

        public C11917b(CropImageView cropImageView, long j, float f, float f2, float f3, float f4) {
            this.f58014a = new WeakReference<>(cropImageView);
            this.f58015c = j;
            this.f58017f = f;
            this.f58018g = f2;
            this.f58019o = f3;
            this.f58020p = f4;
        }

        public void run() {
            CropImageView cropImageView = (CropImageView) this.f58014a.get();
            if (cropImageView != null) {
                float min = (float) Math.min(this.f58015c, System.currentTimeMillis() - this.f58016d);
                float a = C16582b.m98839a(min, 0.0f, this.f58018g, (float) this.f58015c);
                if (min < ((float) this.f58015c)) {
                    cropImageView.mo67226B(this.f58017f + a, this.f58019o, this.f58020p);
                    cropImageView.post(this);
                    return;
                }
                cropImageView.mo67249x();
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: o */
    private float[] m82221o() {
        this.f57993H.reset();
        this.f57993H.setRotate(-getCurrentAngle());
        float[] fArr = this.f58066a;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b = C16590g.m98871b(this.f57992G);
        this.f57993H.mapPoints(copyOf);
        this.f57993H.mapPoints(b);
        RectF d = C16590g.m98873d(copyOf);
        RectF d2 = C16590g.m98873d(b);
        float f = d.left - d2.left;
        float f2 = d.top - d2.top;
        float f3 = d.right - d2.right;
        float f4 = d.bottom - d2.bottom;
        float[] fArr2 = new float[4];
        if (f <= 0.0f) {
            f = 0.0f;
        }
        fArr2[0] = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[1] = f2;
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[2] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[3] = f4;
        this.f57993H.reset();
        this.f57993H.setRotate(getCurrentAngle());
        this.f57993H.mapPoints(fArr2);
        return fArr2;
    }

    /* renamed from: p */
    private void m82222p() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            m82223q((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: q */
    private void m82223q(float f, float f2) {
        float min = Math.min(Math.min(this.f57992G.width() / f, this.f57992G.width() / f2), Math.min(this.f57992G.height() / f2, this.f57992G.height() / f));
        this.f58000O = min;
        this.f57999N = min * this.f57995J;
    }

    /* renamed from: y */
    private void m82224y(float f, float f2) {
        float width = this.f57992G.width();
        float height = this.f57992G.height();
        float max = Math.max(this.f57992G.width() / f, this.f57992G.height() / f2);
        RectF rectF = this.f57992G;
        float f3 = ((height - (f2 * max)) / 2.0f) + rectF.top;
        this.f58069f.reset();
        this.f58069f.postScale(max, max);
        this.f58069f.postTranslate(((width - (f * max)) / 2.0f) + rectF.left, f3);
        setImageMatrix(this.f58069f);
    }

    /* renamed from: A */
    public void mo67225A(float f) {
        mo67226B(f, this.f57992G.centerX(), this.f57992G.centerY());
    }

    /* renamed from: B */
    public void mo67226B(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            mo67234j(f / getCurrentScale(), f2, f3);
        }
    }

    /* renamed from: C */
    public void mo67227C(float f) {
        mo67228D(f, this.f57992G.centerX(), this.f57992G.centerY());
    }

    /* renamed from: D */
    public void mo67228D(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            mo67234j(f / getCurrentScale(), f2, f3);
        }
    }

    @Nullable
    public C16234c getCropBoundsChangeListener() {
        return this.f57996K;
    }

    public float getMaxScale() {
        return this.f57999N;
    }

    public float getMinScale() {
        return this.f58000O;
    }

    public float getTargetAspectRatio() {
        return this.f57994I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo67233h() {
        super.mo67233h();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.f57994I == 0.0f) {
                this.f57994I = intrinsicWidth / intrinsicHeight;
            }
            int i = this.f58070g;
            float f = this.f57994I;
            int i2 = (int) (((float) i) / f);
            int i3 = this.f58071o;
            if (i2 > i3) {
                int i4 = (int) (((float) i3) * f);
                int i5 = (i - i4) / 2;
                this.f57992G.set((float) i5, 0.0f, (float) (i4 + i5), (float) i3);
            } else {
                int i6 = (i3 - i2) / 2;
                this.f57992G.set(0.0f, (float) i6, (float) i, (float) (i2 + i6));
            }
            m82223q(intrinsicWidth, intrinsicHeight);
            m82224y(intrinsicWidth, intrinsicHeight);
            C16234c cVar = this.f57996K;
            if (cVar != null) {
                cVar.mo67313a(this.f57994I);
            }
            TransformImageView.C11923b bVar = this.f58072p;
            if (bVar != null) {
                bVar.mo67196c(getCurrentScale());
                this.f58072p.mo67197d(getCurrentAngle());
            }
        }
    }

    /* renamed from: j */
    public void mo67234j(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.mo67234j(f, f2, f3);
        } else if (f < 1.0f && getCurrentScale() * f >= getMinScale()) {
            super.mo67234j(f, f2, f3);
        }
    }

    /* renamed from: r */
    public void mo67235r() {
        removeCallbacks(this.f57997L);
        removeCallbacks(this.f57998M);
    }

    /* renamed from: s */
    public void mo67236s(@NonNull Bitmap.CompressFormat compressFormat, int i, @Nullable C16232a aVar) {
        mo67235r();
        setImageToWrapCropBounds(false);
        new C16506a(getContext(), getViewBitmap(), new C16364c(this.f57992G, C16590g.m98873d(this.f58066a), getCurrentScale(), getCurrentAngle()), new C16362a(this.f58001P, this.f58002Q, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), aVar).execute(new Void[0]);
    }

    public void setCropBoundsChangeListener(@Nullable C16234c cVar) {
        this.f57996K = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f57994I = rectF.width() / rectF.height();
        this.f57992G.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        m82222p();
        mo67249x();
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float f3;
        if (this.f58061B && !mo67245t()) {
            float[] fArr = this.f58067c;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.f57992G.centerX() - f4;
            float centerY = this.f57992G.centerY() - f5;
            this.f57993H.reset();
            this.f57993H.setTranslate(centerX, centerY);
            float[] fArr2 = this.f58066a;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.f57993H.mapPoints(copyOf);
            boolean u = mo67246u(copyOf);
            if (u) {
                float[] o = m82221o();
                f2 = -(o[1] + o[3]);
                f3 = -(o[0] + o[2]);
                f = 0.0f;
            } else {
                RectF rectF = new RectF(this.f57992G);
                this.f57993H.reset();
                this.f57993H.setRotate(getCurrentAngle());
                this.f57993H.mapRect(rectF);
                float[] c = C16590g.m98872c(this.f58066a);
                f3 = centerX;
                f = (Math.max(rectF.width() / c[0], rectF.height() / c[1]) * currentScale) - currentScale;
                f2 = centerY;
            }
            if (z) {
                C11916a aVar = new C11916a(this, this.f58003R, f4, f5, f3, f2, currentScale, f, u);
                this.f57997L = aVar;
                post(aVar);
                return;
            }
            mo67300k(f3, f2);
            if (!u) {
                mo67226B(currentScale + f, this.f57992G.centerX(), this.f57992G.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j) {
        if (j > 0) {
            this.f58003R = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i) {
        this.f58001P = i;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i) {
        this.f58002Q = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f57995J = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f57994I = f;
            return;
        }
        if (f == 0.0f) {
            this.f57994I = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        } else {
            this.f57994I = f;
        }
        C16234c cVar = this.f57996K;
        if (cVar != null) {
            cVar.mo67313a(this.f57994I);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo67245t() {
        return mo67246u(this.f58066a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo67246u(float[] fArr) {
        this.f57993H.reset();
        this.f57993H.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f57993H.mapPoints(copyOf);
        float[] b = C16590g.m98871b(this.f57992G);
        this.f57993H.mapPoints(b);
        return C16590g.m98873d(copyOf).contains(C16590g.m98873d(b));
    }

    /* renamed from: v */
    public void mo67247v(float f) {
        mo67299i(f, this.f57992G.centerX(), this.f57992G.centerY());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo67248w(@NonNull TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f57994I = 0.0f;
        } else {
            this.f57994I = abs / abs2;
        }
    }

    /* renamed from: x */
    public void mo67249x() {
        setImageToWrapCropBounds(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo67250z(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        C11917b bVar = new C11917b(this, j, currentScale, f - currentScale, f2, f3);
        this.f57998M = bVar;
        post(bVar);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57992G = new RectF();
        this.f57993H = new Matrix();
        this.f57995J = 10.0f;
        this.f57998M = null;
        this.f58001P = 0;
        this.f58002Q = 0;
        this.f58003R = 500;
    }
}
