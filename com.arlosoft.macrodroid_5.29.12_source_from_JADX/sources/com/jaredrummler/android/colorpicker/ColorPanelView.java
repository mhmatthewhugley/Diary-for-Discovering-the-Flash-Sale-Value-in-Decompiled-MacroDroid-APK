package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import java.util.Locale;

public class ColorPanelView extends View {

    /* renamed from: A */
    private int f57352A;

    /* renamed from: B */
    private int f57353B;

    /* renamed from: C */
    private int f57354C;

    /* renamed from: D */
    private int f57355D;

    /* renamed from: a */
    private Drawable f57356a;

    /* renamed from: c */
    private Paint f57357c;

    /* renamed from: d */
    private Paint f57358d;

    /* renamed from: f */
    private Paint f57359f;

    /* renamed from: g */
    private Paint f57360g;

    /* renamed from: o */
    private Rect f57361o;

    /* renamed from: p */
    private Rect f57362p;

    /* renamed from: s */
    private RectF f57363s;

    /* renamed from: z */
    private boolean f57364z;

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m81751a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPanelView);
        this.f57355D = obtainStyledAttributes.getInt(R$styleable.ColorPanelView_cpv_colorShape, 1);
        boolean z = obtainStyledAttributes.getBoolean(R$styleable.ColorPanelView_cpv_showOldColor, false);
        this.f57364z = z;
        if (!z || this.f57355D == 1) {
            this.f57353B = obtainStyledAttributes.getColor(R$styleable.ColorPanelView_cpv_borderColor, -9539986);
            obtainStyledAttributes.recycle();
            if (this.f57353B == -9539986) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{16842808});
                this.f57353B = obtainStyledAttributes2.getColor(0, this.f57353B);
                obtainStyledAttributes2.recycle();
            }
            this.f57352A = C11692d.m81826a(context, 1.0f);
            Paint paint = new Paint();
            this.f57357c = paint;
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f57358d = paint2;
            paint2.setAntiAlias(true);
            if (this.f57364z) {
                this.f57360g = new Paint();
            }
            if (this.f57355D == 1) {
                Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R$drawable.cpv_alpha)).getBitmap();
                Paint paint3 = new Paint();
                this.f57359f = paint3;
                paint3.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f57359f.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                return;
            }
            return;
        }
        throw new IllegalStateException("Color preview is only available in circle mode");
    }

    /* renamed from: b */
    private void m81752b() {
        Rect rect = this.f57361o;
        int i = rect.left;
        int i2 = this.f57352A;
        this.f57363s = new RectF((float) (i + i2), (float) (rect.top + i2), (float) (rect.right - i2), (float) (rect.bottom - i2));
    }

    /* renamed from: c */
    private void m81753c() {
        Rect rect = this.f57361o;
        int i = rect.left;
        int i2 = this.f57352A;
        this.f57362p = new Rect(i + i2, rect.top + i2, rect.right - i2, rect.bottom - i2);
        C11674a aVar = new C11674a(C11692d.m81826a(getContext(), 4.0f));
        this.f57356a = aVar;
        aVar.setBounds(Math.round((float) this.f57362p.left), Math.round((float) this.f57362p.top), Math.round((float) this.f57362p.right), Math.round((float) this.f57362p.bottom));
    }

    /* renamed from: d */
    public void mo65650d() {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = iArr[0] + (width / 2);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        StringBuilder sb = new StringBuilder("#");
        if (Color.alpha(this.f57354C) != 255) {
            sb.append(Integer.toHexString(this.f57354C).toUpperCase(Locale.ENGLISH));
        } else {
            sb.append(String.format("%06X", new Object[]{Integer.valueOf(16777215 & this.f57354C)}).toUpperCase(Locale.ENGLISH));
        }
        Toast makeText = Toast.makeText(context, sb.toString(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
    }

    public int getBorderColor() {
        return this.f57353B;
    }

    public int getColor() {
        return this.f57354C;
    }

    public int getShape() {
        return this.f57355D;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f57357c.setColor(this.f57353B);
        this.f57358d.setColor(this.f57354C);
        int i = this.f57355D;
        if (i == 0) {
            if (this.f57352A > 0) {
                canvas.drawRect(this.f57361o, this.f57357c);
            }
            Drawable drawable = this.f57356a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.drawRect(this.f57362p, this.f57358d);
        } else if (i == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f57352A > 0) {
                canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) measuredWidth, this.f57357c);
            }
            if (Color.alpha(this.f57354C) < 255) {
                canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (measuredWidth - this.f57352A), this.f57359f);
            }
            if (this.f57364z) {
                canvas.drawArc(this.f57363s, 90.0f, 180.0f, true, this.f57360g);
                canvas.drawArc(this.f57363s, 270.0f, 180.0f, true, this.f57358d);
                return;
            }
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (measuredWidth - this.f57352A), this.f57358d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f57355D;
        if (i3 == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else if (i3 == 1) {
            super.onMeasure(i, i);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f57354C = bundle.getInt(TypedValues.Custom.S_COLOR);
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f57354C);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f57355D == 0 || this.f57364z) {
            Rect rect = new Rect();
            this.f57361o = rect;
            rect.left = getPaddingLeft();
            this.f57361o.right = i - getPaddingRight();
            this.f57361o.top = getPaddingTop();
            this.f57361o.bottom = i2 - getPaddingBottom();
            if (this.f57364z) {
                m81752b();
            } else {
                m81753c();
            }
        }
    }

    public void setBorderColor(int i) {
        this.f57353B = i;
        invalidate();
    }

    public void setColor(int i) {
        this.f57354C = i;
        invalidate();
    }

    public void setOriginalColor(@ColorInt int i) {
        Paint paint = this.f57360g;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setShape(int i) {
        this.f57355D = i;
        invalidate();
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57363s = new RectF();
        this.f57353B = -9539986;
        this.f57354C = ViewCompat.MEASURED_STATE_MASK;
        m81751a(context, attributeSet);
    }
}
