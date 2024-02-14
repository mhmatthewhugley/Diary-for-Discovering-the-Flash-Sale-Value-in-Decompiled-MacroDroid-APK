package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;

public class ColorPickerView extends View {

    /* renamed from: A */
    private Paint f57365A;

    /* renamed from: B */
    private Paint f57366B;

    /* renamed from: C */
    private Paint f57367C;

    /* renamed from: D */
    private Shader f57368D;

    /* renamed from: E */
    private Shader f57369E;

    /* renamed from: F */
    private Shader f57370F;

    /* renamed from: G */
    private C11670b f57371G;

    /* renamed from: H */
    private C11670b f57372H;

    /* renamed from: I */
    private int f57373I;

    /* renamed from: J */
    private float f57374J;

    /* renamed from: K */
    private float f57375K;

    /* renamed from: L */
    private float f57376L;

    /* renamed from: M */
    private boolean f57377M;

    /* renamed from: N */
    private String f57378N;

    /* renamed from: O */
    private int f57379O;

    /* renamed from: P */
    private int f57380P;

    /* renamed from: Q */
    private int f57381Q;

    /* renamed from: R */
    private Rect f57382R;

    /* renamed from: S */
    private Rect f57383S;

    /* renamed from: T */
    private Rect f57384T;

    /* renamed from: U */
    private Rect f57385U;

    /* renamed from: V */
    private Point f57386V;

    /* renamed from: W */
    private C11674a f57387W;

    /* renamed from: a */
    private int f57388a;

    /* renamed from: a0 */
    private C11671c f57389a0;

    /* renamed from: c */
    private int f57390c;

    /* renamed from: d */
    private int f57391d;

    /* renamed from: f */
    private int f57392f;

    /* renamed from: g */
    private int f57393g;

    /* renamed from: o */
    private int f57394o;

    /* renamed from: p */
    private Paint f57395p;

    /* renamed from: s */
    private Paint f57396s;

    /* renamed from: z */
    private Paint f57397z;

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$b */
    private class C11670b {

        /* renamed from: a */
        public Canvas f57398a;

        /* renamed from: b */
        public Bitmap f57399b;

        /* renamed from: c */
        public float f57400c;

        private C11670b() {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$c */
    public interface C11671c {
        /* renamed from: K */
        void mo65685K(int i);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private Point m81755a(int i) {
        Rect rect = this.f57385U;
        float width = (float) rect.width();
        Point point = new Point();
        point.x = (int) ((width - ((((float) i) * width) / 255.0f)) + ((float) rect.left));
        point.y = rect.top;
        return point;
    }

    /* renamed from: b */
    private void m81756b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{16842808});
        if (this.f57380P == -9539986) {
            this.f57380P = obtainStyledAttributes.getColor(0, -9539986);
        }
        if (this.f57379O == -4342339) {
            this.f57379O = obtainStyledAttributes.getColor(0, -4342339);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private void m81757c(Canvas canvas) {
        Rect rect;
        if (this.f57377M && (rect = this.f57385U) != null && this.f57387W != null) {
            this.f57367C.setColor(this.f57380P);
            canvas.drawRect((float) (rect.left - 1), (float) (rect.top - 1), (float) (rect.right + 1), (float) (rect.bottom + 1), this.f57367C);
            this.f57387W.draw(canvas);
            float[] fArr = {this.f57374J, this.f57375K, this.f57376L};
            int HSVToColor = Color.HSVToColor(fArr);
            int HSVToColor2 = Color.HSVToColor(0, fArr);
            float f = (float) rect.left;
            int i = rect.top;
            LinearGradient linearGradient = new LinearGradient(f, (float) i, (float) rect.right, (float) i, HSVToColor, HSVToColor2, Shader.TileMode.CLAMP);
            this.f57370F = linearGradient;
            this.f57397z.setShader(linearGradient);
            canvas.drawRect(rect, this.f57397z);
            String str = this.f57378N;
            if (str != null && !str.equals("")) {
                canvas.drawText(this.f57378N, (float) rect.centerX(), (float) (rect.centerY() + C11692d.m81826a(getContext(), 4.0f)), this.f57365A);
            }
            Point a = m81755a(this.f57373I);
            RectF rectF = new RectF();
            int i2 = a.x;
            int i3 = this.f57394o;
            rectF.left = (float) (i2 - (i3 / 2));
            rectF.right = (float) (i2 + (i3 / 2));
            int i4 = rect.top;
            int i5 = this.f57393g;
            rectF.top = (float) (i4 - i5);
            rectF.bottom = (float) (rect.bottom + i5);
            canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f57366B);
        }
    }

    /* renamed from: d */
    private void m81758d(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect rect = this.f57384T;
        this.f57367C.setColor(this.f57380P);
        canvas.drawRect((float) (rect.left - 1), (float) (rect.top - 1), (float) (rect.right + 1), (float) (rect.bottom + 1), this.f57367C);
        if (this.f57372H == null) {
            C11670b bVar = new C11670b();
            this.f57372H = bVar;
            bVar.f57399b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f57372H.f57398a = new Canvas(this.f57372H.f57399b);
            int height = (int) (((float) rect.height()) + 0.5f);
            int[] iArr = new int[height];
            float f = 360.0f;
            for (int i = 0; i < height; i++) {
                iArr[i] = Color.HSVToColor(new float[]{f, 1.0f, 1.0f});
                f -= 360.0f / ((float) height);
            }
            Paint paint = new Paint();
            paint.setStrokeWidth(0.0f);
            for (int i2 = 0; i2 < height; i2++) {
                paint.setColor(iArr[i2]);
                C11670b bVar2 = this.f57372H;
                float f2 = (float) i2;
                bVar2.f57398a.drawLine(0.0f, f2, (float) bVar2.f57399b.getWidth(), f2, paint);
            }
        }
        canvas2.drawBitmap(this.f57372H.f57399b, (Rect) null, rect, (Paint) null);
        Point f3 = m81760f(this.f57374J);
        RectF rectF = new RectF();
        int i3 = rect.left;
        int i4 = this.f57393g;
        rectF.left = (float) (i3 - i4);
        rectF.right = (float) (rect.right + i4);
        int i5 = f3.y;
        int i6 = this.f57394o;
        rectF.top = (float) (i5 - (i6 / 2));
        rectF.bottom = (float) (i5 + (i6 / 2));
        canvas2.drawRoundRect(rectF, 2.0f, 2.0f, this.f57366B);
    }

    /* renamed from: e */
    private void m81759e(Canvas canvas) {
        Rect rect = this.f57383S;
        this.f57367C.setColor(this.f57380P);
        Rect rect2 = this.f57382R;
        canvas.drawRect((float) rect2.left, (float) rect2.top, (float) (rect.right + 1), (float) (rect.bottom + 1), this.f57367C);
        if (this.f57368D == null) {
            int i = rect.left;
            this.f57368D = new LinearGradient((float) i, (float) rect.top, (float) i, (float) rect.bottom, -1, ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.CLAMP);
        }
        C11670b bVar = this.f57371G;
        if (bVar == null || bVar.f57400c != this.f57374J) {
            if (bVar == null) {
                this.f57371G = new C11670b();
            }
            C11670b bVar2 = this.f57371G;
            if (bVar2.f57399b == null) {
                bVar2.f57399b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            }
            C11670b bVar3 = this.f57371G;
            if (bVar3.f57398a == null) {
                bVar3.f57398a = new Canvas(this.f57371G.f57399b);
            }
            int HSVToColor = Color.HSVToColor(new float[]{this.f57374J, 1.0f, 1.0f});
            float f = (float) rect.left;
            int i2 = rect.top;
            this.f57369E = new LinearGradient(f, (float) i2, (float) rect.right, (float) i2, -1, HSVToColor, Shader.TileMode.CLAMP);
            this.f57395p.setShader(new ComposeShader(this.f57368D, this.f57369E, PorterDuff.Mode.MULTIPLY));
            C11670b bVar4 = this.f57371G;
            bVar4.f57398a.drawRect(0.0f, 0.0f, (float) bVar4.f57399b.getWidth(), (float) this.f57371G.f57399b.getHeight(), this.f57395p);
            this.f57371G.f57400c = this.f57374J;
        }
        canvas.drawBitmap(this.f57371G.f57399b, (Rect) null, rect, (Paint) null);
        Point m = m81767m(this.f57375K, this.f57376L);
        this.f57396s.setColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawCircle((float) m.x, (float) m.y, (float) (this.f57392f - C11692d.m81826a(getContext(), 1.0f)), this.f57396s);
        this.f57396s.setColor(-2236963);
        canvas.drawCircle((float) m.x, (float) m.y, (float) this.f57392f, this.f57396s);
    }

    /* renamed from: f */
    private Point m81760f(float f) {
        Rect rect = this.f57384T;
        float height = (float) rect.height();
        Point point = new Point();
        point.y = (int) ((height - ((f * height) / 360.0f)) + ((float) rect.top));
        point.x = rect.left;
        return point;
    }

    /* renamed from: g */
    private void m81761g(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPickerView);
        this.f57377M = obtainStyledAttributes.getBoolean(R$styleable.ColorPickerView_cpv_alphaChannelVisible, false);
        this.f57378N = obtainStyledAttributes.getString(R$styleable.ColorPickerView_cpv_alphaChannelText);
        this.f57379O = obtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_sliderColor, -4342339);
        this.f57380P = obtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_borderColor, -9539986);
        obtainStyledAttributes.recycle();
        m81756b(context);
        this.f57388a = C11692d.m81826a(getContext(), 30.0f);
        this.f57390c = C11692d.m81826a(getContext(), 20.0f);
        this.f57391d = C11692d.m81826a(getContext(), 10.0f);
        this.f57392f = C11692d.m81826a(getContext(), 5.0f);
        this.f57394o = C11692d.m81826a(getContext(), 4.0f);
        this.f57393g = C11692d.m81826a(getContext(), 2.0f);
        this.f57381Q = getResources().getDimensionPixelSize(R$dimen.cpv_required_padding);
        m81762h();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private int getPreferredHeight() {
        int a = C11692d.m81826a(getContext(), 200.0f);
        return this.f57377M ? a + this.f57391d + this.f57390c : a;
    }

    private int getPreferredWidth() {
        return C11692d.m81826a(getContext(), 200.0f) + this.f57388a + this.f57391d;
    }

    /* renamed from: h */
    private void m81762h() {
        this.f57395p = new Paint();
        this.f57396s = new Paint();
        this.f57366B = new Paint();
        this.f57397z = new Paint();
        this.f57365A = new Paint();
        this.f57367C = new Paint();
        this.f57396s.setStyle(Paint.Style.STROKE);
        this.f57396s.setStrokeWidth((float) C11692d.m81826a(getContext(), 2.0f));
        this.f57396s.setAntiAlias(true);
        this.f57366B.setColor(this.f57379O);
        this.f57366B.setStyle(Paint.Style.STROKE);
        this.f57366B.setStrokeWidth((float) C11692d.m81826a(getContext(), 2.0f));
        this.f57366B.setAntiAlias(true);
        this.f57365A.setColor(-14935012);
        this.f57365A.setTextSize((float) C11692d.m81826a(getContext(), 14.0f));
        this.f57365A.setAntiAlias(true);
        this.f57365A.setTextAlign(Paint.Align.CENTER);
        this.f57365A.setFakeBoldText(true);
    }

    /* renamed from: i */
    private boolean m81763i(MotionEvent motionEvent) {
        Point point = this.f57386V;
        if (point == null) {
            return false;
        }
        int i = point.x;
        int i2 = point.y;
        if (this.f57384T.contains(i, i2)) {
            this.f57374J = m81765k(motionEvent.getY());
        } else if (this.f57383S.contains(i, i2)) {
            float[] l = m81766l(motionEvent.getX(), motionEvent.getY());
            this.f57375K = l[0];
            this.f57376L = l[1];
        } else {
            Rect rect = this.f57385U;
            if (rect == null || !rect.contains(i, i2)) {
                return false;
            }
            this.f57373I = m81764j((int) motionEvent.getX());
        }
        return true;
    }

    /* renamed from: j */
    private int m81764j(int i) {
        int i2;
        Rect rect = this.f57385U;
        int width = rect.width();
        int i3 = rect.left;
        if (i < i3) {
            i2 = 0;
        } else {
            i2 = i > rect.right ? width : i - i3;
        }
        return 255 - ((i2 * 255) / width);
    }

    /* renamed from: k */
    private float m81765k(float f) {
        float f2;
        Rect rect = this.f57384T;
        float height = (float) rect.height();
        int i = rect.top;
        if (f < ((float) i)) {
            f2 = 0.0f;
        } else {
            f2 = f > ((float) rect.bottom) ? height : f - ((float) i);
        }
        return 360.0f - ((f2 * 360.0f) / height);
    }

    /* renamed from: l */
    private float[] m81766l(float f, float f2) {
        float f3;
        Rect rect = this.f57383S;
        float[] fArr = new float[2];
        float width = (float) rect.width();
        float height = (float) rect.height();
        int i = rect.left;
        float f4 = 0.0f;
        if (f < ((float) i)) {
            f3 = 0.0f;
        } else {
            f3 = f > ((float) rect.right) ? width : f - ((float) i);
        }
        int i2 = rect.top;
        if (f2 >= ((float) i2)) {
            f4 = f2 > ((float) rect.bottom) ? height : f2 - ((float) i2);
        }
        fArr[0] = (1.0f / width) * f3;
        fArr[1] = 1.0f - ((1.0f / height) * f4);
        return fArr;
    }

    /* renamed from: m */
    private Point m81767m(float f, float f2) {
        Rect rect = this.f57383S;
        Point point = new Point();
        point.x = (int) ((f * ((float) rect.width())) + ((float) rect.left));
        point.y = (int) (((1.0f - f2) * ((float) rect.height())) + ((float) rect.top));
        return point;
    }

    /* renamed from: o */
    private void m81768o() {
        if (this.f57377M) {
            Rect rect = this.f57382R;
            int i = rect.bottom;
            this.f57385U = new Rect(rect.left + 1, (i - this.f57390c) + 1, rect.right - 1, i - 1);
            C11674a aVar = new C11674a(C11692d.m81826a(getContext(), 4.0f));
            this.f57387W = aVar;
            aVar.setBounds(Math.round((float) this.f57385U.left), Math.round((float) this.f57385U.top), Math.round((float) this.f57385U.right), Math.round((float) this.f57385U.bottom));
        }
    }

    /* renamed from: p */
    private void m81769p() {
        Rect rect = this.f57382R;
        int i = rect.right;
        this.f57384T = new Rect((i - this.f57388a) + 1, rect.top + 1, i - 1, (rect.bottom - 1) - (this.f57377M ? this.f57391d + this.f57390c : 0));
    }

    /* renamed from: q */
    private void m81770q() {
        Rect rect = this.f57382R;
        int i = rect.left + 1;
        int i2 = rect.top + 1;
        int i3 = rect.bottom - 1;
        int i4 = this.f57391d;
        int i5 = ((rect.right - 1) - i4) - this.f57388a;
        if (this.f57377M) {
            i3 -= this.f57390c + i4;
        }
        this.f57383S = new Rect(i, i2, i5, i3);
    }

    public String getAlphaSliderText() {
        return this.f57378N;
    }

    public int getBorderColor() {
        return this.f57380P;
    }

    public int getColor() {
        return Color.HSVToColor(this.f57373I, new float[]{this.f57374J, this.f57375K, this.f57376L});
    }

    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f57381Q);
    }

    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f57381Q);
    }

    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f57381Q);
    }

    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f57381Q);
    }

    public int getSliderTrackerColor() {
        return this.f57379O;
    }

    /* renamed from: n */
    public void mo65671n(int i, boolean z) {
        C11671c cVar;
        int alpha = Color.alpha(i);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        this.f57373I = alpha;
        float f = fArr[0];
        this.f57374J = f;
        float f2 = fArr[1];
        this.f57375K = f2;
        float f3 = fArr[2];
        this.f57376L = f3;
        if (z && (cVar = this.f57389a0) != null) {
            cVar.mo65685K(Color.HSVToColor(alpha, new float[]{f, f2, f3}));
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f57382R.width() > 0 && this.f57382R.height() > 0) {
            m81759e(canvas);
            m81758d(canvas);
            m81757c(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r1 > r6) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getPaddingLeft()
            int r6 = r6 - r2
            int r2 = r5.getPaddingRight()
            int r6 = r6 - r2
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r2 = r5.getPaddingBottom()
            int r7 = r7 - r2
            int r2 = r5.getPaddingTop()
            int r7 = r7 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x005c
            if (r1 != r2) goto L_0x002b
            goto L_0x005c
        L_0x002b:
            int r0 = r5.f57391d
            int r1 = r7 + r0
            int r2 = r5.f57388a
            int r1 = r1 + r2
            int r3 = r6 - r0
            int r3 = r3 - r2
            boolean r2 = r5.f57377M
            if (r2 == 0) goto L_0x0040
            int r2 = r5.f57390c
            int r4 = r0 + r2
            int r1 = r1 - r4
            int r0 = r0 + r2
            int r3 = r3 + r0
        L_0x0040:
            r0 = 1
            r2 = 0
            if (r1 > r6) goto L_0x0046
            r4 = 1
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            if (r3 > r7) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r4 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            if (r4 == 0) goto L_0x0056
        L_0x0054:
            r6 = r1
            goto L_0x0089
        L_0x0056:
            if (r4 != 0) goto L_0x0089
            if (r0 == 0) goto L_0x0089
        L_0x005a:
            r7 = r3
            goto L_0x0089
        L_0x005c:
            if (r0 != r2) goto L_0x0074
            if (r1 == r2) goto L_0x0074
            int r0 = r5.f57391d
            int r1 = r6 - r0
            int r2 = r5.f57388a
            int r1 = r1 - r2
            boolean r2 = r5.f57377M
            if (r2 == 0) goto L_0x006f
            int r2 = r5.f57390c
            int r0 = r0 + r2
            int r1 = r1 + r0
        L_0x006f:
            if (r1 <= r7) goto L_0x0072
            goto L_0x0089
        L_0x0072:
            r7 = r1
            goto L_0x0089
        L_0x0074:
            if (r1 != r2) goto L_0x0089
            if (r0 == r2) goto L_0x0089
            int r0 = r5.f57391d
            int r1 = r7 + r0
            int r2 = r5.f57388a
            int r1 = r1 + r2
            boolean r2 = r5.f57377M
            if (r2 == 0) goto L_0x0087
            int r2 = r5.f57390c
            int r0 = r0 + r2
            int r1 = r1 - r0
        L_0x0087:
            if (r1 <= r6) goto L_0x0054
        L_0x0089:
            int r0 = r5.getPaddingLeft()
            int r6 = r6 + r0
            int r0 = r5.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.getPaddingTop()
            int r7 = r7 + r0
            int r0 = r5.getPaddingBottom()
            int r7 = r7 + r0
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jaredrummler.android.colorpicker.ColorPickerView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f57373I = bundle.getInt("alpha");
            this.f57374J = bundle.getFloat("hue");
            this.f57375K = bundle.getFloat("sat");
            this.f57376L = bundle.getFloat("val");
            this.f57377M = bundle.getBoolean("show_alpha");
            this.f57378N = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f57373I);
        bundle.putFloat("hue", this.f57374J);
        bundle.putFloat("sat", this.f57375K);
        bundle.putFloat("val", this.f57376L);
        bundle.putBoolean("show_alpha", this.f57377M);
        bundle.putString("alpha_text", this.f57378N);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = new Rect();
        this.f57382R = rect;
        rect.left = getPaddingLeft();
        this.f57382R.right = i - getPaddingRight();
        this.f57382R.top = getPaddingTop();
        this.f57382R.bottom = i2 - getPaddingBottom();
        this.f57368D = null;
        this.f57369E = null;
        this.f57370F = null;
        this.f57371G = null;
        this.f57372H = null;
        m81770q();
        m81769p();
        m81768o();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f57386V = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            z = m81763i(motionEvent);
        } else if (action == 1) {
            this.f57386V = null;
            z = m81763i(motionEvent);
        } else if (action != 2) {
            z = false;
        } else {
            z = m81763i(motionEvent);
        }
        if (!z) {
            return super.onTouchEvent(motionEvent);
        }
        C11671c cVar = this.f57389a0;
        if (cVar != null) {
            cVar.mo65685K(Color.HSVToColor(this.f57373I, new float[]{this.f57374J, this.f57375K, this.f57376L}));
        }
        invalidate();
        return true;
    }

    public void setAlphaSliderText(int i) {
        setAlphaSliderText(getContext().getString(i));
    }

    public void setAlphaSliderVisible(boolean z) {
        if (this.f57377M != z) {
            this.f57377M = z;
            this.f57368D = null;
            this.f57369E = null;
            this.f57370F = null;
            this.f57372H = null;
            this.f57371G = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i) {
        this.f57380P = i;
        invalidate();
    }

    public void setColor(int i) {
        mo65671n(i, false);
    }

    public void setOnColorChangedListener(C11671c cVar) {
        this.f57389a0 = cVar;
    }

    public void setSliderTrackerColor(int i) {
        this.f57379O = i;
        this.f57366B.setColor(i);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57373I = 255;
        this.f57374J = 360.0f;
        this.f57375K = 0.0f;
        this.f57376L = 0.0f;
        this.f57377M = false;
        this.f57378N = null;
        this.f57379O = -4342339;
        this.f57380P = -9539986;
        this.f57386V = null;
        m81761g(context, attributeSet);
    }

    public void setAlphaSliderText(String str) {
        this.f57378N = str;
        invalidate();
    }
}
