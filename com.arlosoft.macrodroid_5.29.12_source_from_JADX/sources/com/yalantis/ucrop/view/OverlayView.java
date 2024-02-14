package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;
import com.yalantis.ucrop.R$styleable;
import p368q8.C16235d;
import p395t8.C16590g;

public class OverlayView extends View {

    /* renamed from: A */
    private float[] f58032A;

    /* renamed from: B */
    private boolean f58033B;

    /* renamed from: C */
    private boolean f58034C;

    /* renamed from: D */
    private boolean f58035D;

    /* renamed from: E */
    private int f58036E;

    /* renamed from: F */
    private Path f58037F;

    /* renamed from: G */
    private Paint f58038G;

    /* renamed from: H */
    private Paint f58039H;

    /* renamed from: I */
    private Paint f58040I;

    /* renamed from: J */
    private Paint f58041J;

    /* renamed from: K */
    private int f58042K;

    /* renamed from: L */
    private float f58043L;

    /* renamed from: M */
    private float f58044M;

    /* renamed from: N */
    private int f58045N;

    /* renamed from: O */
    private int f58046O;

    /* renamed from: P */
    private int f58047P;

    /* renamed from: Q */
    private int f58048Q;

    /* renamed from: R */
    private C16235d f58049R;

    /* renamed from: S */
    private boolean f58050S;

    /* renamed from: a */
    private final RectF f58051a;

    /* renamed from: c */
    private final RectF f58052c;

    /* renamed from: d */
    protected int f58053d;

    /* renamed from: f */
    protected int f58054f;

    /* renamed from: g */
    protected float[] f58055g;

    /* renamed from: o */
    protected float[] f58056o;

    /* renamed from: p */
    private int f58057p;

    /* renamed from: s */
    private int f58058s;

    /* renamed from: z */
    private float f58059z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private int m82244c(float f, float f2) {
        double d = (double) this.f58046O;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double sqrt = Math.sqrt(Math.pow((double) (f - this.f58055g[i2]), 2.0d) + Math.pow((double) (f2 - this.f58055g[i2 + 1]), 2.0d));
            if (sqrt < d) {
                i = i2 / 2;
                d = sqrt;
            }
        }
        if (this.f58042K != 1 || i >= 0 || !this.f58051a.contains(f, f2)) {
            return i;
        }
        return 4;
    }

    /* renamed from: e */
    private void m82245e(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R$color.ucrop_color_default_crop_frame));
        this.f58040I.setStrokeWidth((float) dimensionPixelSize);
        this.f58040I.setColor(color);
        this.f58040I.setStyle(Paint.Style.STROKE);
        this.f58041J.setStrokeWidth((float) (dimensionPixelSize * 3));
        this.f58041J.setColor(color);
        this.f58041J.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: f */
    private void m82246f(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R$color.ucrop_color_default_crop_grid));
        this.f58039H.setStrokeWidth((float) dimensionPixelSize);
        this.f58039H.setColor(color);
        this.f58057p = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.f58058s = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    /* renamed from: i */
    private void m82247i(float f, float f2) {
        this.f58052c.set(this.f58051a);
        int i = this.f58045N;
        boolean z = true;
        if (i == 0) {
            RectF rectF = this.f58052c;
            RectF rectF2 = this.f58051a;
            rectF.set(f, f2, rectF2.right, rectF2.bottom);
        } else if (i == 1) {
            RectF rectF3 = this.f58052c;
            RectF rectF4 = this.f58051a;
            rectF3.set(rectF4.left, f2, f, rectF4.bottom);
        } else if (i == 2) {
            RectF rectF5 = this.f58052c;
            RectF rectF6 = this.f58051a;
            rectF5.set(rectF6.left, rectF6.top, f, f2);
        } else if (i == 3) {
            RectF rectF7 = this.f58052c;
            RectF rectF8 = this.f58051a;
            rectF7.set(f, rectF8.top, rectF8.right, f2);
        } else if (i == 4) {
            this.f58052c.offset(f - this.f58043L, f2 - this.f58044M);
            if (this.f58052c.left > ((float) getLeft()) && this.f58052c.top > ((float) getTop()) && this.f58052c.right < ((float) getRight()) && this.f58052c.bottom < ((float) getBottom())) {
                this.f58051a.set(this.f58052c);
                m82248j();
                postInvalidate();
                return;
            }
            return;
        }
        boolean z2 = this.f58052c.height() >= ((float) this.f58047P);
        if (this.f58052c.width() < ((float) this.f58047P)) {
            z = false;
        }
        RectF rectF9 = this.f58051a;
        rectF9.set(z ? this.f58052c.left : rectF9.left, z2 ? this.f58052c.top : rectF9.top, z ? this.f58052c.right : rectF9.right, z2 ? this.f58052c.bottom : rectF9.bottom);
        if (z2 || z) {
            m82248j();
            postInvalidate();
        }
    }

    /* renamed from: j */
    private void m82248j() {
        this.f58055g = C16590g.m98871b(this.f58051a);
        this.f58056o = C16590g.m98870a(this.f58051a);
        this.f58032A = null;
        this.f58037F.reset();
        this.f58037F.addCircle(this.f58051a.centerX(), this.f58051a.centerY(), Math.min(this.f58051a.width(), this.f58051a.height()) / 2.0f, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67264a(@NonNull Canvas canvas) {
        if (this.f58034C) {
            if (this.f58032A == null && !this.f58051a.isEmpty()) {
                this.f58032A = new float[((this.f58057p * 4) + (this.f58058s * 4))];
                int i = 0;
                for (int i2 = 0; i2 < this.f58057p; i2++) {
                    float[] fArr = this.f58032A;
                    int i3 = i + 1;
                    RectF rectF = this.f58051a;
                    fArr[i] = rectF.left;
                    int i4 = i3 + 1;
                    float f = ((float) i2) + 1.0f;
                    float height = rectF.height() * (f / ((float) (this.f58057p + 1)));
                    RectF rectF2 = this.f58051a;
                    fArr[i3] = height + rectF2.top;
                    float[] fArr2 = this.f58032A;
                    int i5 = i4 + 1;
                    fArr2[i4] = rectF2.right;
                    i = i5 + 1;
                    fArr2[i5] = (rectF2.height() * (f / ((float) (this.f58057p + 1)))) + this.f58051a.top;
                }
                for (int i6 = 0; i6 < this.f58058s; i6++) {
                    float[] fArr3 = this.f58032A;
                    int i7 = i + 1;
                    float f2 = ((float) i6) + 1.0f;
                    float width = this.f58051a.width() * (f2 / ((float) (this.f58058s + 1)));
                    RectF rectF3 = this.f58051a;
                    fArr3[i] = width + rectF3.left;
                    float[] fArr4 = this.f58032A;
                    int i8 = i7 + 1;
                    fArr4[i7] = rectF3.top;
                    int i9 = i8 + 1;
                    float width2 = rectF3.width() * (f2 / ((float) (this.f58058s + 1)));
                    RectF rectF4 = this.f58051a;
                    fArr4[i8] = width2 + rectF4.left;
                    i = i9 + 1;
                    this.f58032A[i9] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f58032A;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f58039H);
            }
        }
        if (this.f58033B) {
            canvas.drawRect(this.f58051a, this.f58040I);
        }
        if (this.f58042K != 0) {
            canvas.save();
            this.f58052c.set(this.f58051a);
            RectF rectF5 = this.f58052c;
            int i10 = this.f58048Q;
            rectF5.inset((float) i10, (float) (-i10));
            canvas.clipRect(this.f58052c, Region.Op.DIFFERENCE);
            this.f58052c.set(this.f58051a);
            RectF rectF6 = this.f58052c;
            int i11 = this.f58048Q;
            rectF6.inset((float) (-i11), (float) i11);
            canvas.clipRect(this.f58052c, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f58051a, this.f58041J);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67265b(@NonNull Canvas canvas) {
        canvas.save();
        if (this.f58035D) {
            canvas.clipPath(this.f58037F, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f58051a, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f58036E);
        canvas.restore();
        if (this.f58035D) {
            canvas.drawCircle(this.f58051a.centerX(), this.f58051a.centerY(), Math.min(this.f58051a.width(), this.f58051a.height()) / 2.0f, this.f58038G);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo67266d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo67267g(@NonNull TypedArray typedArray) {
        this.f58035D = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R$color.ucrop_color_default_dimmed));
        this.f58036E = color;
        this.f58038G.setColor(color);
        this.f58038G.setStyle(Paint.Style.STROKE);
        this.f58038G.setStrokeWidth(1.0f);
        m82245e(typedArray);
        this.f58033B = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_frame, true);
        m82246f(typedArray);
        this.f58034C = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f58051a;
    }

    public int getFreestyleCropMode() {
        return this.f58042K;
    }

    public C16235d getOverlayViewChangeListener() {
        return this.f58049R;
    }

    /* renamed from: h */
    public void mo67271h() {
        int i = this.f58053d;
        float f = this.f58059z;
        int i2 = (int) (((float) i) / f);
        int i3 = this.f58054f;
        if (i2 > i3) {
            int i4 = (int) (((float) i3) * f);
            int i5 = (i - i4) / 2;
            this.f58051a.set((float) (getPaddingLeft() + i5), (float) getPaddingTop(), (float) (getPaddingLeft() + i4 + i5), (float) (getPaddingTop() + this.f58054f));
        } else {
            int i6 = (i3 - i2) / 2;
            this.f58051a.set((float) getPaddingLeft(), (float) (getPaddingTop() + i6), (float) (getPaddingLeft() + this.f58053d), (float) (getPaddingTop() + i2 + i6));
        }
        C16235d dVar = this.f58049R;
        if (dVar != null) {
            dVar.mo67314a(this.f58051a);
        }
        m82248j();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo67265b(canvas);
        mo67264a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f58053d = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f58054f = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.f58050S) {
                this.f58050S = false;
                setTargetAspectRatio(this.f58059z);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f58051a.isEmpty() && this.f58042K != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c = m82244c(x, y);
                this.f58045N = c;
                if (c != -1) {
                    z = true;
                }
                if (!z) {
                    this.f58043L = -1.0f;
                    this.f58044M = -1.0f;
                } else if (this.f58043L < 0.0f) {
                    this.f58043L = x;
                    this.f58044M = y;
                }
                return z;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f58045N != -1) {
                float min = Math.min(Math.max(x, (float) getPaddingLeft()), (float) (getWidth() - getPaddingRight()));
                float min2 = Math.min(Math.max(y, (float) getPaddingTop()), (float) (getHeight() - getPaddingBottom()));
                m82247i(min, min2);
                this.f58043L = min;
                this.f58044M = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.f58043L = -1.0f;
                this.f58044M = -1.0f;
                this.f58045N = -1;
                C16235d dVar = this.f58049R;
                if (dVar != null) {
                    dVar.mo67314a(this.f58051a);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f58035D = z;
    }

    public void setCropFrameColor(@ColorInt int i) {
        this.f58040I.setColor(i);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i) {
        this.f58040I.setStrokeWidth((float) i);
    }

    public void setCropGridColor(@ColorInt int i) {
        this.f58039H.setColor(i);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i) {
        this.f58058s = i;
        this.f58032A = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i) {
        this.f58057p = i;
        this.f58032A = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i) {
        this.f58039H.setStrokeWidth((float) i);
    }

    public void setDimmedColor(@ColorInt int i) {
        this.f58036E = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f58042K = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f58042K = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(C16235d dVar) {
        this.f58049R = dVar;
    }

    public void setShowCropFrame(boolean z) {
        this.f58033B = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f58034C = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f58059z = f;
        if (this.f58053d > 0) {
            mo67271h();
            postInvalidate();
            return;
        }
        this.f58050S = true;
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58051a = new RectF();
        this.f58052c = new RectF();
        this.f58032A = null;
        this.f58037F = new Path();
        this.f58038G = new Paint(1);
        this.f58039H = new Paint(1);
        this.f58040I = new Paint(1);
        this.f58041J = new Paint(1);
        this.f58042K = 0;
        this.f58043L = -1.0f;
        this.f58044M = -1.0f;
        this.f58045N = -1;
        this.f58046O = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.f58047P = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_min_size);
        this.f58048Q = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        mo67266d();
    }
}
