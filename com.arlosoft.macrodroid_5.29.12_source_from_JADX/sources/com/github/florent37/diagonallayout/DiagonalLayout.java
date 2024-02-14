package com.github.florent37.diagonallayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

public class DiagonalLayout extends FrameLayout {

    /* renamed from: a */
    C6915a f16186a;

    /* renamed from: c */
    int f16187c = 0;

    /* renamed from: d */
    int f16188d = 0;

    /* renamed from: f */
    Path f16189f;

    /* renamed from: g */
    Path f16190g;

    /* renamed from: o */
    Paint f16191o;

    /* renamed from: p */
    Integer f16192p;

    /* renamed from: s */
    private PorterDuffXfermode f16193s;

    /* renamed from: com.github.florent37.diagonallayout.DiagonalLayout$a */
    class C6914a extends ViewOutlineProvider {
        C6914a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setConvexPath(DiagonalLayout.this.f16190g);
        }
    }

    public DiagonalLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo34305e(context, attributeSet);
    }

    /* renamed from: a */
    private void m26118a() {
        if (this.f16186a != null) {
            this.f16187c = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            this.f16188d = measuredWidth;
            if (measuredWidth > 0 && this.f16187c > 0) {
                float tan = (float) (((double) measuredWidth) * Math.tan(Math.toRadians((double) this.f16186a.mo34309a())));
                this.f16189f = m26119b(tan);
                this.f16190g = m26120c(tan);
                m26121d(tan);
                ViewCompat.setElevation(this, this.f16186a.mo34310b());
                setOutlineProvider(getOutlineProvider());
            }
        }
    }

    /* renamed from: b */
    private Path m26119b(float f) {
        Path path = new Path();
        if (this.f16186a.mo34311c()) {
            if (this.f16186a.mo34312d()) {
                path.moveTo(((float) (this.f16188d - getPaddingRight())) + 0.5f, ((((float) this.f16187c) - f) - ((float) getPaddingBottom())) + 0.5f);
                path.lineTo(((float) (this.f16188d - getPaddingRight())) + 0.5f, ((float) (this.f16187c - getPaddingBottom())) + 0.5f);
                path.lineTo(((float) getPaddingLeft()) - 0.5f, ((float) (this.f16187c - getPaddingBottom())) + 0.5f);
                path.close();
            } else {
                path.moveTo(((float) (this.f16188d - getPaddingRight())) + 0.5f, ((float) (this.f16187c - getPaddingBottom())) + 0.5f);
                path.lineTo(((float) getPaddingLeft()) - 0.5f, ((float) (this.f16187c - getPaddingBottom())) + 0.5f);
                path.lineTo(((float) getPaddingLeft()) - 0.5f, ((((float) this.f16187c) - f) - ((float) getPaddingBottom())) + 0.5f);
                path.close();
            }
        } else if (this.f16186a.mo34312d()) {
            path.moveTo(((float) (this.f16188d - getPaddingRight())) + 0.5f, (((float) getPaddingTop()) + f) - 0.5f);
            path.lineTo(((float) getPaddingLeft()) - 0.5f, ((float) getPaddingTop()) - 0.5f);
            path.lineTo(((float) (this.f16188d - getPaddingRight())) + 0.5f, ((float) getPaddingTop()) - 0.5f);
            path.close();
        } else {
            path.moveTo(((float) (this.f16188d - getPaddingRight())) + 0.5f, ((float) getPaddingTop()) - 0.5f);
            path.lineTo(((float) getPaddingLeft()) - 0.5f, (((float) getPaddingTop()) + f) - 0.5f);
            path.lineTo(((float) getPaddingLeft()) - 0.5f, ((float) getPaddingTop()) - 0.5f);
            path.close();
        }
        return path;
    }

    /* renamed from: c */
    private Path m26120c(float f) {
        Path path = new Path();
        if (this.f16186a.mo34311c()) {
            if (this.f16186a.mo34312d()) {
                path.moveTo((float) getPaddingLeft(), (float) getPaddingRight());
                path.lineTo((float) (this.f16188d - getPaddingRight()), (float) getPaddingTop());
                path.lineTo((float) (this.f16188d - getPaddingRight()), (((float) this.f16187c) - f) - ((float) getPaddingBottom()));
                path.lineTo((float) getPaddingLeft(), (float) (this.f16187c - getPaddingBottom()));
                path.close();
            } else {
                path.moveTo((float) (this.f16188d - getPaddingRight()), (float) (this.f16187c - getPaddingBottom()));
                path.lineTo((float) getPaddingLeft(), (((float) this.f16187c) - f) - ((float) getPaddingBottom()));
                path.lineTo((float) getPaddingLeft(), (float) getPaddingTop());
                path.lineTo((float) (this.f16188d - getPaddingRight()), (float) getPaddingTop());
                path.close();
            }
        } else if (this.f16186a.mo34312d()) {
            path.moveTo((float) (this.f16188d - getPaddingRight()), (float) (this.f16187c - getPaddingBottom()));
            path.lineTo((float) (this.f16188d - getPaddingRight()), ((float) getPaddingTop()) + f);
            path.lineTo((float) getPaddingLeft(), (float) getPaddingTop());
            path.lineTo((float) getPaddingLeft(), (float) (this.f16187c - getPaddingBottom()));
            path.close();
        } else {
            path.moveTo((float) (this.f16188d - getPaddingRight()), (float) (this.f16187c - getPaddingBottom()));
            path.lineTo((float) (this.f16188d - getPaddingRight()), (float) getPaddingTop());
            path.lineTo((float) getPaddingLeft(), ((float) getPaddingTop()) + f);
            path.lineTo((float) getPaddingLeft(), (float) (this.f16187c - getPaddingBottom()));
            path.close();
        }
        return path;
    }

    /* renamed from: d */
    private void m26121d(float f) {
        if (this.f16186a.mo34313e()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (this.f16186a.mo34311c()) {
                    if (this.f16192p == null) {
                        this.f16192p = Integer.valueOf(marginLayoutParams.bottomMargin);
                    } else {
                        this.f16192p = 0;
                    }
                    marginLayoutParams.bottomMargin = (int) (((float) this.f16192p.intValue()) - f);
                } else {
                    if (this.f16192p == null) {
                        this.f16192p = Integer.valueOf(marginLayoutParams.topMargin);
                    } else {
                        this.f16192p = 0;
                    }
                    marginLayoutParams.topMargin = (int) (((float) this.f16192p.intValue()) - f);
                }
                setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
        super.dispatchDraw(canvas);
        this.f16191o.setXfermode(this.f16193s);
        canvas.drawPath(this.f16189f, this.f16191o);
        canvas.restoreToCount(saveLayer);
        this.f16191o.setXfermode((Xfermode) null);
    }

    /* renamed from: e */
    public void mo34305e(Context context, AttributeSet attributeSet) {
        C6915a aVar = new C6915a(context, attributeSet);
        this.f16186a = aVar;
        aVar.mo34314f(ViewCompat.getElevation(this));
        Paint paint = new Paint(1);
        this.f16191o = paint;
        paint.setColor(-1);
        this.f16193s = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    public ViewOutlineProvider getOutlineProvider() {
        return new C6914a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m26118a();
        }
    }
}
