package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C10462R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {

    /* renamed from: A */
    private final float[] f50608A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final int f50609B;

    /* renamed from: C */
    private final int f50610C;

    /* renamed from: D */
    private final int f50611D;

    /* renamed from: E */
    private final int f50612E;

    /* renamed from: F */
    private String[] f50613F;

    /* renamed from: G */
    private float f50614G;

    /* renamed from: H */
    private final ColorStateList f50615H;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ClockHandView f50616f;

    /* renamed from: g */
    private final Rect f50617g;

    /* renamed from: o */
    private final RectF f50618o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final SparseArray<TextView> f50619p;

    /* renamed from: s */
    private final AccessibilityDelegateCompat f50620s;

    /* renamed from: z */
    private final int[] f50621z;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.materialClockStyle);
    }

    /* renamed from: k */
    private void m69969k() {
        RectF d = this.f50616f.mo59356d();
        for (int i = 0; i < this.f50619p.size(); i++) {
            TextView textView = this.f50619p.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f50617g);
                this.f50617g.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f50617g);
                this.f50618o.set(this.f50617g);
                textView.getPaint().setShader(m69970l(d, this.f50618o));
                textView.invalidate();
            }
        }
    }

    /* renamed from: l */
    private RadialGradient m69970l(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f50618o.left, rectF.centerY() - this.f50618o.top, rectF.width() * 0.5f, this.f50621z, this.f50608A, Shader.TileMode.CLAMP);
    }

    /* renamed from: m */
    private static float m69971m(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: o */
    private void m69972o(@StringRes int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f50619p.size();
        for (int i2 = 0; i2 < Math.max(this.f50613F.length, size); i2++) {
            TextView textView = this.f50619p.get(i2);
            if (i2 >= this.f50613F.length) {
                removeView(textView);
                this.f50619p.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C10462R.C10467layout.material_clockface_textview, this, false);
                    this.f50619p.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f50613F[i2]);
                textView.setTag(C10462R.C10465id.material_value_index, Integer.valueOf(i2));
                ViewCompat.setAccessibilityDelegate(textView, this.f50620s);
                textView.setTextColor(this.f50615H);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f50613F[i2]}));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo59350c(int i) {
        if (i != mo59376b()) {
            super.mo59350c(i);
            this.f50616f.mo59360k(mo59376b());
        }
    }

    /* renamed from: e */
    public void mo59351e(float f, boolean z) {
        if (Math.abs(this.f50614G - f) > 0.001f) {
            this.f50614G = f;
            m69969k();
        }
    }

    /* renamed from: n */
    public void mo59352n(String[] strArr, @StringRes int i) {
        this.f50613F = strArr;
        m69972o(i);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f50613F.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m69969k();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m = (int) (((float) this.f50612E) / m69971m(((float) this.f50610C) / ((float) displayMetrics.heightPixels), ((float) this.f50611D) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m, BasicMeasure.EXACTLY);
        setMeasuredDimension(m, m);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50617g = new Rect();
        this.f50618o = new RectF();
        this.f50619p = new SparseArray<>();
        this.f50608A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.ClockFaceView, i, C10462R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.ClockFaceView_clockNumberTextColor);
        this.f50615H = a;
        LayoutInflater.from(context).inflate(C10462R.C10467layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C10462R.C10465id.material_clock_hand);
        this.f50616f = clockHandView;
        this.f50609B = resources.getDimensionPixelSize(C10462R.dimen.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f50621z = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.mo59355b(this);
        int defaultColor = AppCompatResources.getColorStateList(context, C10462R.C10463color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.mo59350c(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f50616f.mo59358g()) - ClockFaceView.this.f50609B);
                return true;
            }
        });
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f50620s = new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int intValue = ((Integer) view.getTag(C10462R.C10465id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.f50619p.get(intValue - 1));
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, intValue, 1, false, view.isSelected()));
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo59352n(strArr, 0);
        this.f50610C = resources.getDimensionPixelSize(C10462R.dimen.material_time_picker_minimum_screen_height);
        this.f50611D = resources.getDimensionPixelSize(C10462R.dimen.material_time_picker_minimum_screen_width);
        this.f50612E = resources.getDimensionPixelSize(C10462R.dimen.material_clock_size);
    }
}
