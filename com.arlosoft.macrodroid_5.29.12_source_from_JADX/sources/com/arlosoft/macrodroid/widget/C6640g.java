package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.arlosoft.macrodroid.widget.SlidingTabLayout;

/* renamed from: com.arlosoft.macrodroid.widget.g */
/* compiled from: SlidingTabStrip */
public class C6640g extends LinearLayout {

    /* renamed from: A */
    private SlidingTabLayout.C6632d f15411A;

    /* renamed from: B */
    private final C6642b f15412B;

    /* renamed from: a */
    private final int f15413a;

    /* renamed from: c */
    private final Paint f15414c;

    /* renamed from: d */
    private final int f15415d;

    /* renamed from: f */
    private final Paint f15416f;

    /* renamed from: g */
    private final int f15417g;

    /* renamed from: o */
    private final Paint f15418o;

    /* renamed from: p */
    private final float f15419p;

    /* renamed from: s */
    private int f15420s;

    /* renamed from: z */
    private float f15421z;

    /* renamed from: com.arlosoft.macrodroid.widget.g$b */
    /* compiled from: SlidingTabStrip */
    private static class C6642b implements SlidingTabLayout.C6632d {

        /* renamed from: a */
        private int[] f15422a;

        /* renamed from: b */
        private int[] f15423b;

        private C6642b() {
        }

        /* renamed from: a */
        public final int mo32894a(int i) {
            int[] iArr = this.f15422a;
            return iArr[i % iArr.length];
        }

        /* renamed from: b */
        public final int mo32895b(int i) {
            int[] iArr = this.f15423b;
            return iArr[i % iArr.length];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo32918c(int... iArr) {
            this.f15423b = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo32919d(int... iArr) {
            this.f15422a = iArr;
        }
    }

    C6640g(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m25129a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    /* renamed from: c */
    private static int m25130c(int i, byte b) {
        return Color.argb(b, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32913b(int i, float f) {
        this.f15420s = i;
        this.f15421z = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        float f = (float) height;
        int min = (int) (Math.min(Math.max(0.0f, this.f15419p), 1.0f) * f);
        SlidingTabLayout.C6632d dVar = this.f15411A;
        if (dVar == null) {
            dVar = this.f15412B;
        }
        SlidingTabLayout.C6632d dVar2 = dVar;
        if (childCount > 0) {
            View childAt = getChildAt(this.f15420s);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int a = dVar2.mo32894a(this.f15420s);
            if (this.f15421z > 0.0f && this.f15420s < getChildCount() - 1) {
                int a2 = dVar2.mo32894a(this.f15420s + 1);
                if (a != a2) {
                    a = m25129a(a2, a, this.f15421z);
                }
                View childAt2 = getChildAt(this.f15420s + 1);
                float left2 = this.f15421z * ((float) childAt2.getLeft());
                float f2 = this.f15421z;
                left = (int) (left2 + ((1.0f - f2) * ((float) left)));
                right = (int) ((f2 * ((float) childAt2.getRight())) + ((1.0f - this.f15421z) * ((float) right)));
            }
            this.f15416f.setColor(a);
            canvas.drawRect((float) left, (float) (height - this.f15415d), (float) right, f, this.f15416f);
        }
        canvas.drawRect(0.0f, (float) (height - this.f15413a), (float) getWidth(), f, this.f15414c);
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) this.f15413a, this.f15414c);
        int i = (height - min) / 2;
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt3 = getChildAt(i2);
            this.f15418o.setColor(dVar2.mo32895b(i2));
            canvas.drawLine((float) childAt3.getRight(), (float) i, (float) childAt3.getRight(), (float) (i + min), this.f15418o);
        }
    }

    /* access modifiers changed from: package-private */
    public void setCustomTabColorizer(SlidingTabLayout.C6632d dVar) {
        this.f15411A = dVar;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setDividerColors(int... iArr) {
        this.f15411A = null;
        this.f15412B.mo32918c(iArr);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setSelectedIndicatorColors(int... iArr) {
        this.f15411A = null;
        this.f15412B.mo32919d(iArr);
        invalidate();
    }

    private C6640g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int i = typedValue.data;
        int c = m25130c(i, (byte) 38);
        this.f15417g = c;
        C6642b bVar = new C6642b();
        this.f15412B = bVar;
        bVar.mo32919d(-13388315);
        bVar.mo32918c(m25130c(i, (byte) 32));
        this.f15413a = (int) (2.0f * f);
        Paint paint = new Paint();
        this.f15414c = paint;
        paint.setColor(c);
        this.f15415d = (int) (8.0f * f);
        this.f15416f = new Paint();
        this.f15419p = 0.5f;
        Paint paint2 = new Paint();
        this.f15418o = paint2;
        paint2.setStrokeWidth((float) ((int) (f * 1.0f)));
    }
}
