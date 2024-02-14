package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p368q8.C16233b;
import p377r8.C16363b;
import p395t8.C16581a;
import p395t8.C16584d;
import p395t8.C16590g;

public class TransformImageView extends ImageView {

    /* renamed from: A */
    protected boolean f58060A;

    /* renamed from: B */
    protected boolean f58061B;

    /* renamed from: C */
    private int f58062C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public String f58063D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public String f58064E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C16363b f58065F;

    /* renamed from: a */
    protected final float[] f58066a;

    /* renamed from: c */
    protected final float[] f58067c;

    /* renamed from: d */
    private final float[] f58068d;

    /* renamed from: f */
    protected Matrix f58069f;

    /* renamed from: g */
    protected int f58070g;

    /* renamed from: o */
    protected int f58071o;

    /* renamed from: p */
    protected C11923b f58072p;

    /* renamed from: s */
    private float[] f58073s;

    /* renamed from: z */
    private float[] f58074z;

    /* renamed from: com.yalantis.ucrop.view.TransformImageView$a */
    class C11922a implements C16233b {
        C11922a() {
        }

        /* renamed from: a */
        public void mo67308a(@NonNull Bitmap bitmap, @NonNull C16363b bVar, @NonNull String str, @Nullable String str2) {
            String unused = TransformImageView.this.f58063D = str;
            String unused2 = TransformImageView.this.f58064E = str2;
            C16363b unused3 = TransformImageView.this.f58065F = bVar;
            TransformImageView transformImageView = TransformImageView.this;
            transformImageView.f58060A = true;
            transformImageView.setImageBitmap(bitmap);
        }

        /* renamed from: c */
        public void mo67309c(@NonNull Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            C11923b bVar = TransformImageView.this.f58072p;
            if (bVar != null) {
                bVar.mo67195b(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.TransformImageView$b */
    public interface C11923b {
        /* renamed from: a */
        void mo67194a();

        /* renamed from: b */
        void mo67195b(@NonNull Exception exc);

        /* renamed from: c */
        void mo67196c(float f);

        /* renamed from: d */
        void mo67197d(float f);
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: m */
    private void m82257m() {
        this.f58069f.mapPoints(this.f58066a, this.f58073s);
        this.f58069f.mapPoints(this.f58067c, this.f58074z);
    }

    /* renamed from: d */
    public float mo67289d(@NonNull Matrix matrix) {
        return (float) (-(Math.atan2((double) mo67291f(matrix, 1), (double) mo67291f(matrix, 0)) * 57.29577951308232d));
    }

    /* renamed from: e */
    public float mo67290e(@NonNull Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) mo67291f(matrix, 0), 2.0d) + Math.pow((double) mo67291f(matrix, 3), 2.0d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public float mo67291f(@NonNull Matrix matrix, @IntRange(from = 0, mo610to = 9) int i) {
        matrix.getValues(this.f58068d);
        return this.f58068d[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo67253g() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public float getCurrentAngle() {
        return mo67289d(this.f58069f);
    }

    public float getCurrentScale() {
        return mo67290e(this.f58069f);
    }

    public C16363b getExifInfo() {
        return this.f58065F;
    }

    public String getImageInputPath() {
        return this.f58063D;
    }

    public String getImageOutputPath() {
        return this.f58064E;
    }

    public int getMaxBitmapSize() {
        if (this.f58062C <= 0) {
            this.f58062C = C16581a.m98832b(getContext());
        }
        return this.f58062C;
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C16584d)) {
            return null;
        }
        return ((C16584d) getDrawable()).mo79418a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo67233h() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)});
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f58073s = C16590g.m98871b(rectF);
            this.f58074z = C16590g.m98870a(rectF);
            this.f58061B = true;
            C11923b bVar = this.f58072p;
            if (bVar != null) {
                bVar.mo67194a();
            }
        }
    }

    /* renamed from: i */
    public void mo67299i(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f58069f.postRotate(f, f2, f3);
            setImageMatrix(this.f58069f);
            C11923b bVar = this.f58072p;
            if (bVar != null) {
                bVar.mo67197d(mo67289d(this.f58069f));
            }
        }
    }

    /* renamed from: j */
    public void mo67234j(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f58069f.postScale(f, f, f2, f3);
            setImageMatrix(this.f58069f);
            C11923b bVar = this.f58072p;
            if (bVar != null) {
                bVar.mo67196c(mo67290e(this.f58069f));
            }
        }
    }

    /* renamed from: k */
    public void mo67300k(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f58069f.postTranslate(f, f2);
            setImageMatrix(this.f58069f);
        }
    }

    /* renamed from: l */
    public void mo67301l(@NonNull Uri uri, @Nullable Uri uri2) throws Exception {
        int maxBitmapSize = getMaxBitmapSize();
        C16581a.m98834d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new C11922a());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f58060A && !this.f58061B)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f58070g = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f58071o = (getHeight() - getPaddingBottom()) - paddingTop;
            mo67233h();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C16584d(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f58069f.set(matrix);
        m82257m();
    }

    public void setMaxBitmapSize(int i) {
        this.f58062C = i;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(C11923b bVar) {
        this.f58072p = bVar;
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58066a = new float[8];
        this.f58067c = new float[2];
        this.f58068d = new float[9];
        this.f58069f = new Matrix();
        this.f58060A = false;
        this.f58061B = false;
        this.f58062C = 0;
        mo67253g();
    }
}
