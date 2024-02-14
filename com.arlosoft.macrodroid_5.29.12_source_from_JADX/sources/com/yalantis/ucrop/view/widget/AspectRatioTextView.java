package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;
import com.yalantis.ucrop.R$styleable;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.Locale;

public class AspectRatioTextView extends TextView {

    /* renamed from: a */
    private final Rect f58080a;

    /* renamed from: c */
    private Paint f58081c;

    /* renamed from: d */
    private int f58082d;

    /* renamed from: f */
    private float f58083f;

    /* renamed from: g */
    private String f58084g;

    /* renamed from: o */
    private float f58085o;

    /* renamed from: p */
    private float f58086p;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m82278a(@ColorInt int i) {
        Paint paint = this.f58081c;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, ContextCompat.getColor(getContext(), R$color.ucrop_color_widget)}));
    }

    /* renamed from: c */
    private void m82279c(@NonNull TypedArray typedArray) {
        setGravity(1);
        this.f58084g = typedArray.getString(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.f58085o = typedArray.getFloat(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0f);
        float f = typedArray.getFloat(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0f);
        this.f58086p = f;
        float f2 = this.f58085o;
        if (f2 == 0.0f || f == 0.0f) {
            this.f58083f = 0.0f;
        } else {
            this.f58083f = f2 / f;
        }
        this.f58082d = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f58081c = paint;
        paint.setStyle(Paint.Style.FILL);
        m82280d();
        m82278a(getResources().getColor(R$color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    /* renamed from: d */
    private void m82280d() {
        if (!TextUtils.isEmpty(this.f58084g)) {
            setText(this.f58084g);
            return;
        }
        setText(String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.f58085o), Integer.valueOf((int) this.f58086p)}));
    }

    /* renamed from: e */
    private void m82281e() {
        if (this.f58083f != 0.0f) {
            float f = this.f58085o;
            float f2 = this.f58086p;
            this.f58085o = f2;
            this.f58086p = f;
            this.f58083f = f2 / f;
        }
    }

    /* renamed from: b */
    public float mo67315b(boolean z) {
        if (z) {
            m82281e();
            m82280d();
        }
        return this.f58083f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f58080a);
            Rect rect = this.f58080a;
            int i = rect.bottom;
            int i2 = this.f58082d;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, (float) (i - i2), (float) (i2 / 2), this.f58081c);
        }
    }

    public void setActiveColor(@ColorInt int i) {
        m82278a(i);
        invalidate();
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        this.f58084g = aspectRatio.mo67216a();
        this.f58085o = aspectRatio.mo67217b();
        float c = aspectRatio.mo67218c();
        this.f58086p = c;
        float f = this.f58085o;
        if (f == 0.0f || c == 0.0f) {
            this.f58083f = 0.0f;
        } else {
            this.f58083f = f / c;
        }
        m82280d();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58080a = new Rect();
        m82279c(context.obtainStyledAttributes(attributeSet, R$styleable.ucrop_AspectRatioTextView));
    }
}
