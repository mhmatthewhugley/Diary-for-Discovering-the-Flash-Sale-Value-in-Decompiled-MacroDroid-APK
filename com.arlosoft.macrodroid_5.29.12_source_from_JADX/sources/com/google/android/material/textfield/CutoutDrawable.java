package com.google.android.material.textfield;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

class CutoutDrawable extends MaterialShapeDrawable {
    @NonNull

    /* renamed from: Q */
    private final Paint f50423Q;
    @NonNull

    /* renamed from: R */
    private final RectF f50424R;

    /* renamed from: S */
    private int f50425S;

    CutoutDrawable() {
        this((ShapeAppearanceModel) null);
    }

    /* renamed from: s0 */
    private void m69756s0(@NonNull Canvas canvas) {
        if (!m69760z0(getCallback())) {
            canvas.restoreToCount(this.f50425S);
        }
    }

    /* renamed from: t0 */
    private void m69757t0(@NonNull Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m69760z0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m69758v0(canvas);
    }

    /* renamed from: v0 */
    private void m69758v0(@NonNull Canvas canvas) {
        this.f50425S = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
    }

    /* renamed from: y0 */
    private void m69759y0() {
        this.f50423Q.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f50423Q.setColor(-1);
        this.f50423Q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: z0 */
    private boolean m69760z0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(@NonNull Canvas canvas) {
        m69757t0(canvas);
        super.draw(canvas);
        m69756s0(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo58679r(@NonNull Canvas canvas) {
        if (this.f50424R.isEmpty()) {
            super.mo58679r(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.mo58679r(canvas2);
        canvas2.drawRect(this.f50424R, this.f50423Q);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo59109r0() {
        return !this.f50424R.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo59110u0() {
        mo59111w0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo59111w0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f50424R;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo59112x0(@NonNull RectF rectF) {
        mo59111w0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CutoutDrawable(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel == null ? new ShapeAppearanceModel() : shapeAppearanceModel);
        this.f50423Q = new Paint(1);
        m69759y0();
        this.f50424R = new RectF();
    }
}
