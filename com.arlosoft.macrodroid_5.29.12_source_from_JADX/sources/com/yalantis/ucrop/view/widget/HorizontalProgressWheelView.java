package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;

public class HorizontalProgressWheelView extends View {

    /* renamed from: A */
    private int f58087A;

    /* renamed from: a */
    private final Rect f58088a;

    /* renamed from: c */
    private C11926a f58089c;

    /* renamed from: d */
    private float f58090d;

    /* renamed from: f */
    private Paint f58091f;

    /* renamed from: g */
    private int f58092g;

    /* renamed from: o */
    private int f58093o;

    /* renamed from: p */
    private int f58094p;

    /* renamed from: s */
    private boolean f58095s;

    /* renamed from: z */
    private float f58096z;

    /* renamed from: com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a */
    public interface C11926a {
        /* renamed from: a */
        void mo67199a();

        /* renamed from: b */
        void mo67200b();

        /* renamed from: c */
        void mo67201c(float f, float f2);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m82283a() {
        this.f58087A = ContextCompat.getColor(getContext(), R$color.ucrop_color_progress_wheel_line);
        this.f58092g = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_width_horizontal_wheel_progress_line);
        this.f58093o = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_height_horizontal_wheel_progress_line);
        this.f58094p = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f58091f = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f58091f.setStrokeWidth((float) this.f58092g);
    }

    /* renamed from: b */
    private void m82284b(MotionEvent motionEvent, float f) {
        this.f58096z -= f;
        postInvalidate();
        this.f58090d = motionEvent.getX();
        C11926a aVar = this.f58089c;
        if (aVar != null) {
            aVar.mo67201c(-f, this.f58096z);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f58088a);
        int width = this.f58088a.width();
        int i = this.f58092g;
        int i2 = this.f58094p;
        int i3 = width / (i + i2);
        float f = this.f58096z % ((float) (i2 + i));
        this.f58091f.setColor(getResources().getColor(R$color.ucrop_color_progress_wheel_line));
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                this.f58091f.setAlpha((int) ((((float) i4) / ((float) i5)) * 255.0f));
            } else if (i4 > (i3 * 3) / 4) {
                this.f58091f.setAlpha((int) ((((float) (i3 - i4)) / ((float) i5)) * 255.0f));
            } else {
                this.f58091f.setAlpha(255);
            }
            float f2 = -f;
            Rect rect = this.f58088a;
            float f3 = ((float) rect.left) + f2 + ((float) ((this.f58092g + this.f58094p) * i4));
            float centerY = ((float) rect.centerY()) - (((float) this.f58093o) / 4.0f);
            Rect rect2 = this.f58088a;
            canvas.drawLine(f3, centerY, f2 + ((float) rect2.left) + ((float) ((this.f58092g + this.f58094p) * i4)), ((float) rect2.centerY()) + (((float) this.f58093o) / 4.0f), this.f58091f);
        }
        this.f58091f.setColor(this.f58087A);
        float centerX = (float) this.f58088a.centerX();
        float centerY2 = ((float) this.f58088a.centerY()) - (((float) this.f58093o) / 2.0f);
        Canvas canvas2 = canvas;
        float f4 = centerY2;
        canvas2.drawLine(centerX, f4, (float) this.f58088a.centerX(), (((float) this.f58093o) / 2.0f) + ((float) this.f58088a.centerY()), this.f58091f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f58090d = motionEvent.getX();
        } else if (action == 1) {
            C11926a aVar = this.f58089c;
            if (aVar != null) {
                this.f58095s = false;
                aVar.mo67199a();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f58090d;
            if (x != 0.0f) {
                if (!this.f58095s) {
                    this.f58095s = true;
                    C11926a aVar2 = this.f58089c;
                    if (aVar2 != null) {
                        aVar2.mo67200b();
                    }
                }
                m82284b(motionEvent, x);
            }
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int i) {
        this.f58087A = i;
        invalidate();
    }

    public void setScrollingListener(C11926a aVar) {
        this.f58089c = aVar;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58088a = new Rect();
        m82283a();
    }
}
