package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {

    /* renamed from: t0 */
    private static final String f50119t0 = BaseSlider.class.getSimpleName();

    /* renamed from: u0 */
    static final int f50120u0 = C10462R.style.Widget_MaterialComponents_Slider;
    @NonNull

    /* renamed from: A */
    private final TooltipDrawableFactory f50121A;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: B */
    public final List<TooltipDrawable> f50122B;
    @NonNull

    /* renamed from: C */
    private final List<L> f50123C;
    @NonNull

    /* renamed from: D */
    private final List<T> f50124D;

    /* renamed from: E */
    private boolean f50125E;

    /* renamed from: F */
    private ValueAnimator f50126F;

    /* renamed from: G */
    private ValueAnimator f50127G;

    /* renamed from: H */
    private final int f50128H;

    /* renamed from: I */
    private int f50129I;

    /* renamed from: J */
    private int f50130J;

    /* renamed from: K */
    private int f50131K;

    /* renamed from: L */
    private int f50132L;

    /* renamed from: M */
    private int f50133M;

    /* renamed from: N */
    private int f50134N;

    /* renamed from: O */
    private int f50135O;

    /* renamed from: P */
    private int f50136P;

    /* renamed from: Q */
    private int f50137Q;

    /* renamed from: R */
    private int f50138R;

    /* renamed from: S */
    private float f50139S;

    /* renamed from: T */
    private MotionEvent f50140T;

    /* renamed from: U */
    private LabelFormatter f50141U;

    /* renamed from: V */
    private boolean f50142V;

    /* renamed from: W */
    private float f50143W;
    @NonNull

    /* renamed from: a */
    private final Paint f50144a;

    /* renamed from: a0 */
    private float f50145a0;

    /* renamed from: b0 */
    private ArrayList<Float> f50146b0;
    @NonNull

    /* renamed from: c */
    private final Paint f50147c;

    /* renamed from: c0 */
    private int f50148c0;
    @NonNull

    /* renamed from: d */
    private final Paint f50149d;

    /* renamed from: d0 */
    private int f50150d0;

    /* renamed from: e0 */
    private float f50151e0;
    @NonNull

    /* renamed from: f */
    private final Paint f50152f;

    /* renamed from: f0 */
    private float[] f50153f0;
    @NonNull

    /* renamed from: g */
    private final Paint f50154g;

    /* renamed from: g0 */
    private boolean f50155g0;

    /* renamed from: h0 */
    private int f50156h0;

    /* renamed from: i0 */
    private boolean f50157i0;

    /* renamed from: j0 */
    private boolean f50158j0;

    /* renamed from: k0 */
    private boolean f50159k0;
    @NonNull

    /* renamed from: l0 */
    private ColorStateList f50160l0;
    @NonNull

    /* renamed from: m0 */
    private ColorStateList f50161m0;
    @NonNull

    /* renamed from: n0 */
    private ColorStateList f50162n0;
    @NonNull

    /* renamed from: o */
    private final Paint f50163o;
    @NonNull

    /* renamed from: o0 */
    private ColorStateList f50164o0;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: p */
    public final AccessibilityHelper f50165p;
    @NonNull

    /* renamed from: p0 */
    private ColorStateList f50166p0;
    @NonNull

    /* renamed from: q0 */
    private final MaterialShapeDrawable f50167q0;

    /* renamed from: r0 */
    private float f50168r0;

    /* renamed from: s */
    private final AccessibilityManager f50169s;

    /* renamed from: s0 */
    private int f50170s0;

    /* renamed from: z */
    private BaseSlider<S, L, T>.AccessibilityEventSender f50171z;

    private class AccessibilityEventSender implements Runnable {

        /* renamed from: a */
        int f50177a;

        private AccessibilityEventSender() {
            this.f50177a = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo58832a(int i) {
            this.f50177a = i;
        }

        public void run() {
            BaseSlider.this.f50165p.sendEventForVirtualView(this.f50177a, 4);
        }
    }

    private static class AccessibilityHelper extends ExploreByTouchHelper {

        /* renamed from: a */
        private final BaseSlider<?, ?, ?> f50179a;

        /* renamed from: b */
        Rect f50180b = new Rect();

        AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f50179a = baseSlider;
        }

        @NonNull
        /* renamed from: a */
        private String m69471a(int i) {
            if (i == this.f50179a.getValues().size() - 1) {
                return this.f50179a.getContext().getString(C10462R.string.material_slider_range_end);
            }
            return i == 0 ? this.f50179a.getContext().getString(C10462R.string.material_slider_range_start) : "";
        }

        /* access modifiers changed from: protected */
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f50179a.getValues().size(); i++) {
                this.f50179a.mo58757d0(i, this.f50180b);
                if (this.f50180b.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.f50179a.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* access modifiers changed from: protected */
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f50179a.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float g = this.f50179a.m69444k(20);
                if (i2 == 8192) {
                    g = -g;
                }
                if (this.f50179a.mo58755G()) {
                    g = -g;
                }
                if (!this.f50179a.m69428b0(i, MathUtils.clamp(this.f50179a.getValues().get(i).floatValue() + g, this.f50179a.getValueFrom(), this.f50179a.getValueTo()))) {
                    return false;
                }
                this.f50179a.m69433e0();
                this.f50179a.postInvalidate();
                invalidateVirtualView(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                if (this.f50179a.m69428b0(i, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                    this.f50179a.m69433e0();
                    this.f50179a.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.f50179a.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f50179a.getValueFrom();
            float valueTo = this.f50179a.getValueTo();
            if (this.f50179a.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f50179a.getContentDescription() != null) {
                sb.append(this.f50179a.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(m69471a(i));
                sb.append(this.f50179a.m69463y(floatValue));
            }
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.f50179a.mo58757d0(i, this.f50180b);
            accessibilityNodeInfoCompat.setBoundsInParent(this.f50180b);
        }
    }

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() {
            @NonNull
            /* renamed from: a */
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            @NonNull
            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        };

        /* renamed from: a */
        float f50181a;

        /* renamed from: c */
        float f50182c;

        /* renamed from: d */
        ArrayList<Float> f50183d;

        /* renamed from: f */
        float f50184f;

        /* renamed from: g */
        boolean f50185g;

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f50181a);
            parcel.writeFloat(this.f50182c);
            parcel.writeList(this.f50183d);
            parcel.writeFloat(this.f50184f);
            parcel.writeBooleanArray(new boolean[]{this.f50185g});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.f50181a = parcel.readFloat();
            this.f50182c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f50183d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f50184f = parcel.readFloat();
            this.f50185g = parcel.createBooleanArray()[0];
        }
    }

    private interface TooltipDrawableFactory {
        /* renamed from: a */
        TooltipDrawable mo58829a();
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.sliderStyle);
    }

    /* renamed from: A */
    private float m69402A(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.f50170s0 == 0) {
            minSeparation = m69454p(minSeparation);
        }
        if (mo58755G()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return MathUtils.clamp(f, i3 < 0 ? this.f50143W : this.f50146b0.get(i3).floatValue() + minSeparation, i2 >= this.f50146b0.size() ? this.f50145a0 : this.f50146b0.get(i2).floatValue() - minSeparation);
    }

    @ColorInt
    /* renamed from: B */
    private int m69403B(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: D */
    private void m69404D() {
        this.f50144a.setStrokeWidth((float) this.f50133M);
        this.f50147c.setStrokeWidth((float) this.f50133M);
        this.f50154g.setStrokeWidth(((float) this.f50133M) / 2.0f);
        this.f50163o.setStrokeWidth(((float) this.f50133M) / 2.0f);
    }

    /* renamed from: E */
    private boolean m69405E() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: F */
    private boolean m69406F(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f50151e0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    /* renamed from: H */
    private void m69407H(@NonNull Resources resources) {
        this.f50131K = resources.getDimensionPixelSize(C10462R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C10462R.dimen.mtrl_slider_track_side_padding);
        this.f50129I = dimensionPixelOffset;
        this.f50134N = dimensionPixelOffset;
        this.f50130J = resources.getDimensionPixelSize(C10462R.dimen.mtrl_slider_thumb_radius);
        this.f50135O = resources.getDimensionPixelOffset(C10462R.dimen.mtrl_slider_track_top);
        this.f50138R = resources.getDimensionPixelSize(C10462R.dimen.mtrl_slider_label_padding);
    }

    /* renamed from: I */
    private void m69408I() {
        if (this.f50151e0 > 0.0f) {
            m69437g0();
            int min = Math.min((int) (((this.f50145a0 - this.f50143W) / this.f50151e0) + 1.0f), (this.f50156h0 / (this.f50133M * 2)) + 1);
            float[] fArr = this.f50153f0;
            if (fArr == null || fArr.length != min * 2) {
                this.f50153f0 = new float[(min * 2)];
            }
            float f = ((float) this.f50156h0) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f50153f0;
                fArr2[i] = ((float) this.f50134N) + (((float) (i / 2)) * f);
                fArr2[i + 1] = (float) m69446l();
            }
        }
    }

    /* renamed from: J */
    private void m69409J(@NonNull Canvas canvas, int i, int i2) {
        if (m69423Y()) {
            int O = (int) (((float) this.f50134N) + (m69414O(this.f50146b0.get(this.f50150d0).floatValue()) * ((float) i)));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f50137Q;
                canvas.clipRect((float) (O - i3), (float) (i2 - i3), (float) (O + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) O, (float) i2, (float) this.f50137Q, this.f50152f);
        }
    }

    /* renamed from: K */
    private void m69410K(@NonNull Canvas canvas) {
        if (this.f50155g0 && this.f50151e0 > 0.0f) {
            float[] activeRange = getActiveRange();
            int U = m69419U(this.f50153f0, activeRange[0]);
            int U2 = m69419U(this.f50153f0, activeRange[1]);
            int i = U * 2;
            canvas.drawPoints(this.f50153f0, 0, i, this.f50154g);
            int i2 = U2 * 2;
            canvas.drawPoints(this.f50153f0, i, i2 - i, this.f50163o);
            float[] fArr = this.f50153f0;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f50154g);
        }
    }

    /* renamed from: L */
    private void m69411L() {
        this.f50134N = this.f50129I + Math.max(this.f50136P - this.f50130J, 0);
        if (ViewCompat.isLaidOut(this)) {
            m69435f0(getWidth());
        }
    }

    /* renamed from: M */
    private boolean m69412M(int i) {
        int i2 = this.f50150d0;
        int clamp = (int) MathUtils.clamp(((long) i2) + ((long) i), 0, (long) (this.f50146b0.size() - 1));
        this.f50150d0 = clamp;
        if (clamp == i2) {
            return false;
        }
        if (this.f50148c0 != -1) {
            this.f50148c0 = clamp;
        }
        m69433e0();
        postInvalidate();
        return true;
    }

    /* renamed from: N */
    private boolean m69413N(int i) {
        if (mo58755G()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return m69412M(i);
    }

    /* renamed from: O */
    private float m69414O(float f) {
        float f2 = this.f50143W;
        float f3 = (f - f2) / (this.f50145a0 - f2);
        return mo58755G() ? 1.0f - f3 : f3;
    }

    /* renamed from: P */
    private Boolean m69415P(int i, @NonNull KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        m69412M(-1);
                        return Boolean.TRUE;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                m69413N(-1);
                                return Boolean.TRUE;
                            case 22:
                                m69413N(1);
                                return Boolean.TRUE;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                m69412M(1);
                return Boolean.TRUE;
            }
            this.f50148c0 = this.f50150d0;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m69412M(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m69412M(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: Q */
    private void m69416Q() {
        for (T a : this.f50124D) {
            a.mo58752a(this);
        }
    }

    /* renamed from: R */
    private void m69417R() {
        for (T b : this.f50124D) {
            b.mo58753b(this);
        }
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: S */
    public static TooltipDrawable m69418S(@NonNull Context context, @NonNull TypedArray typedArray) {
        return TooltipDrawable.m70085v0(context, (AttributeSet) null, 0, typedArray.getResourceId(C10462R.styleable.Slider_labelStyle, C10462R.style.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: U */
    private static int m69419U(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    /* renamed from: V */
    private void m69420V(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.Slider, i, f50120u0, new int[0]);
        this.f50143W = h.getFloat(C10462R.styleable.Slider_android_valueFrom, 0.0f);
        this.f50145a0 = h.getFloat(C10462R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f50143W));
        this.f50151e0 = h.getFloat(C10462R.styleable.Slider_android_stepSize, 0.0f);
        int i4 = C10462R.styleable.Slider_trackColor;
        boolean hasValue = h.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = C10462R.styleable.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i4 = C10462R.styleable.Slider_trackColorActive;
        }
        ColorStateList a = MaterialResources.m69121a(context, h, i2);
        if (a == null) {
            a = AppCompatResources.getColorStateList(context, C10462R.C10463color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a);
        ColorStateList a2 = MaterialResources.m69121a(context, h, i4);
        if (a2 == null) {
            a2 = AppCompatResources.getColorStateList(context, C10462R.C10463color.material_slider_active_track_color);
        }
        setTrackActiveTintList(a2);
        this.f50167q0.mo58656a0(MaterialResources.m69121a(context, h, C10462R.styleable.Slider_thumbColor));
        int i5 = C10462R.styleable.Slider_thumbStrokeColor;
        if (h.hasValue(i5)) {
            setThumbStrokeColor(MaterialResources.m69121a(context, h, i5));
        }
        setThumbStrokeWidth(h.getDimension(C10462R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList a3 = MaterialResources.m69121a(context, h, C10462R.styleable.Slider_haloColor);
        if (a3 == null) {
            a3 = AppCompatResources.getColorStateList(context, C10462R.C10463color.material_slider_halo_color);
        }
        setHaloTintList(a3);
        this.f50155g0 = h.getBoolean(C10462R.styleable.Slider_tickVisible, true);
        int i6 = C10462R.styleable.Slider_tickColor;
        boolean hasValue2 = h.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = C10462R.styleable.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i6 = C10462R.styleable.Slider_tickColorActive;
        }
        ColorStateList a4 = MaterialResources.m69121a(context, h, i3);
        if (a4 == null) {
            a4 = AppCompatResources.getColorStateList(context, C10462R.C10463color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a4);
        ColorStateList a5 = MaterialResources.m69121a(context, h, i6);
        if (a5 == null) {
            a5 = AppCompatResources.getColorStateList(context, C10462R.C10463color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a5);
        setThumbRadius(h.getDimensionPixelSize(C10462R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(h.getDimensionPixelSize(C10462R.styleable.Slider_haloRadius, 0));
        setThumbElevation(h.getDimension(C10462R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(h.getDimensionPixelSize(C10462R.styleable.Slider_trackHeight, 0));
        this.f50132L = h.getInt(C10462R.styleable.Slider_labelBehavior, 0);
        if (!h.getBoolean(C10462R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        h.recycle();
    }

    /* renamed from: W */
    private void m69421W(int i) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.f50171z;
        if (accessibilityEventSender == null) {
            this.f50171z = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.f50171z.mo58832a(i);
        postDelayed(this.f50171z, 200);
    }

    /* renamed from: X */
    private void m69422X(TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.mo59429D0(m69463y(f));
        int O = (this.f50134N + ((int) (m69414O(f) * ((float) this.f50156h0)))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int l = m69446l() - (this.f50138R + this.f50136P);
        tooltipDrawable.setBounds(O, l - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + O, l);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.m68714c(ViewUtils.m68838e(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.m68839f(this).add(tooltipDrawable);
    }

    /* renamed from: Y */
    private boolean m69423Y() {
        return this.f50157i0 || !(getBackground() instanceof RippleDrawable);
    }

    /* renamed from: Z */
    private boolean m69424Z(float f) {
        return m69428b0(this.f50148c0, f);
    }

    /* renamed from: a0 */
    private double m69426a0(float f) {
        float f2 = this.f50151e0;
        if (f2 <= 0.0f) {
            return (double) f;
        }
        int i = (int) ((this.f50145a0 - this.f50143W) / f2);
        return ((double) Math.round(f * ((float) i))) / ((double) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public boolean m69428b0(int i, float f) {
        this.f50150d0 = i;
        if (((double) Math.abs(f - this.f50146b0.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f50146b0.set(i, Float.valueOf(m69402A(i, f)));
        m69455q(i);
        return true;
    }

    /* renamed from: c0 */
    private boolean m69430c0() {
        return m69424Z(getValueOfTouchPosition());
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m69433e0() {
        if (!m69423Y() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int O = (int) ((m69414O(this.f50146b0.get(this.f50150d0).floatValue()) * ((float) this.f50156h0)) + ((float) this.f50134N));
                int l = m69446l();
                int i = this.f50137Q;
                DrawableCompat.setHotspotBounds(background, O - i, l - i, O + i, l + i);
            }
        }
    }

    /* renamed from: f0 */
    private void m69435f0(int i) {
        this.f50156h0 = Math.max(i - (this.f50134N * 2), 0);
        m69408I();
    }

    /* renamed from: g0 */
    private void m69437g0() {
        if (this.f50159k0) {
            m69443j0();
            m69445k0();
            m69441i0();
            m69447l0();
            m69439h0();
            m69453o0();
            this.f50159k0 = false;
        }
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f50146b0.size() == 1) {
            floatValue2 = this.f50143W;
        }
        float O = m69414O(floatValue2);
        float O2 = m69414O(floatValue);
        if (mo58755G()) {
            return new float[]{O2, O};
        }
        return new float[]{O, O2};
    }

    private float getValueOfTouchPosition() {
        double a0 = m69426a0(this.f50168r0);
        if (mo58755G()) {
            a0 = 1.0d - a0;
        }
        float f = this.f50145a0;
        float f2 = this.f50143W;
        return (float) ((a0 * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f50168r0;
        if (mo58755G()) {
            f = 1.0f - f;
        }
        float f2 = this.f50145a0;
        float f3 = this.f50143W;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: h */
    private void m69438h(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.mo59427B0(ViewUtils.m68838e(this));
    }

    /* renamed from: h0 */
    private void m69439h0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f = this.f50151e0;
            if (f > 0.0f && minSeparation > 0.0f) {
                if (this.f50170s0 != 1) {
                    throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f50151e0)}));
                } else if (minSeparation < f || !m69406F(minSeparation)) {
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f50151e0), Float.valueOf(this.f50151e0)}));
                }
            }
        } else {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", new Object[]{Float.valueOf(minSeparation)}));
        }
    }

    /* renamed from: i */
    private Float m69440i(int i) {
        float k = this.f50158j0 ? m69444k(20) : m69442j();
        if (i == 21) {
            if (!mo58755G()) {
                k = -k;
            }
            return Float.valueOf(k);
        } else if (i == 22) {
            if (mo58755G()) {
                k = -k;
            }
            return Float.valueOf(k);
        } else if (i == 69) {
            return Float.valueOf(-k);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(k);
            }
            return null;
        }
    }

    /* renamed from: i0 */
    private void m69441i0() {
        if (this.f50151e0 > 0.0f && !m69449m0(this.f50145a0)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(this.f50151e0), Float.valueOf(this.f50143W), Float.valueOf(this.f50145a0)}));
        }
    }

    /* renamed from: j */
    private float m69442j() {
        float f = this.f50151e0;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: j0 */
    private void m69443j0() {
        if (this.f50143W >= this.f50145a0) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.valueOf(this.f50143W), Float.valueOf(this.f50145a0)}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public float m69444k(int i) {
        float j = m69442j();
        float f = (this.f50145a0 - this.f50143W) / j;
        float f2 = (float) i;
        if (f <= f2) {
            return j;
        }
        return ((float) Math.round(f / f2)) * j;
    }

    /* renamed from: k0 */
    private void m69445k0() {
        if (this.f50145a0 <= this.f50143W) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.valueOf(this.f50145a0), Float.valueOf(this.f50143W)}));
        }
    }

    /* renamed from: l */
    private int m69446l() {
        int i = this.f50135O;
        int i2 = 0;
        if (this.f50132L == 1) {
            i2 = this.f50122B.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: l0 */
    private void m69447l0() {
        Iterator<Float> it = this.f50146b0.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f50143W || next.floatValue() > this.f50145a0) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{next, Float.valueOf(this.f50143W), Float.valueOf(this.f50145a0)}));
            } else if (this.f50151e0 > 0.0f && !m69449m0(next.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{next, Float.valueOf(this.f50143W), Float.valueOf(this.f50151e0), Float.valueOf(this.f50151e0)}));
            }
        }
    }

    /* renamed from: m */
    private ValueAnimator m69448m(boolean z) {
        float f = 0.0f;
        float z2 = m69464z(z ? this.f50127G : this.f50126F, z ? 0.0f : 1.0f);
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{z2, f});
        ofFloat.setDuration(z ? 83 : 117);
        ofFloat.setInterpolator(z ? AnimationUtils.f48525e : AnimationUtils.f48523c);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (TooltipDrawable C0 : BaseSlider.this.f50122B) {
                    C0.mo59428C0(floatValue);
                }
                ViewCompat.postInvalidateOnAnimation(BaseSlider.this);
            }
        });
        return ofFloat;
    }

    /* renamed from: m0 */
    private boolean m69449m0(float f) {
        return m69406F(f - this.f50143W);
    }

    /* renamed from: n */
    private void m69450n() {
        if (this.f50122B.size() > this.f50146b0.size()) {
            List<TooltipDrawable> subList = this.f50122B.subList(this.f50146b0.size(), this.f50122B.size());
            for (TooltipDrawable next : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    m69452o(next);
                }
            }
            subList.clear();
        }
        while (this.f50122B.size() < this.f50146b0.size()) {
            TooltipDrawable a = this.f50121A.mo58829a();
            this.f50122B.add(a);
            if (ViewCompat.isAttachedToWindow(this)) {
                m69438h(a);
            }
        }
        int i = 1;
        if (this.f50122B.size() == 1) {
            i = 0;
        }
        for (TooltipDrawable n0 : this.f50122B) {
            n0.mo58676n0((float) i);
        }
    }

    /* renamed from: n0 */
    private float m69451n0(float f) {
        return (m69414O(f) * ((float) this.f50156h0)) + ((float) this.f50134N);
    }

    /* renamed from: o */
    private void m69452o(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl f = ViewUtils.m68839f(this);
        if (f != null) {
            f.remove(tooltipDrawable);
            tooltipDrawable.mo59433x0(ViewUtils.m68838e(this));
        }
    }

    /* renamed from: o0 */
    private void m69453o0() {
        float f = this.f50151e0;
        if (f != 0.0f) {
            if (((float) ((int) f)) != f) {
                Log.w(f50119t0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"stepSize", Float.valueOf(f)}));
            }
            float f2 = this.f50143W;
            if (((float) ((int) f2)) != f2) {
                Log.w(f50119t0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"valueFrom", Float.valueOf(f2)}));
            }
            float f3 = this.f50145a0;
            if (((float) ((int) f3)) != f3) {
                Log.w(f50119t0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"valueTo", Float.valueOf(f3)}));
            }
        }
    }

    /* renamed from: p */
    private float m69454p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - ((float) this.f50134N)) / ((float) this.f50156h0);
        float f3 = this.f50143W;
        return (f2 * (f3 - this.f50145a0)) + f3;
    }

    /* renamed from: q */
    private void m69455q(int i) {
        for (L a : this.f50123C) {
            a.mo58751a(this, this.f50146b0.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f50169s;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m69421W(i);
        }
    }

    /* renamed from: r */
    private void m69456r() {
        for (L l : this.f50123C) {
            Iterator<Float> it = this.f50146b0.iterator();
            while (it.hasNext()) {
                l.mo58751a(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: s */
    private void m69457s(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f50134N;
        float f = (float) i;
        float f2 = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) + (activeRange[0] * f), f2, ((float) i3) + (activeRange[1] * f), f2, this.f50147c);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f50146b0.size() != arrayList.size() || !this.f50146b0.equals(arrayList)) {
                this.f50146b0 = arrayList;
                this.f50159k0 = true;
                this.f50150d0 = 0;
                m69433e0();
                m69450n();
                m69456r();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: t */
    private void m69458t(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f50134N;
        float f = (float) i;
        float f2 = ((float) i3) + (activeRange[1] * f);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.f50144a);
        }
        int i4 = this.f50134N;
        float f4 = ((float) i4) + (activeRange[0] * f);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.f50144a);
        }
    }

    /* renamed from: u */
    private void m69459u(@NonNull Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f50146b0.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(((float) this.f50134N) + (m69414O(it.next().floatValue()) * ((float) i)), (float) i2, (float) this.f50136P, this.f50149d);
            }
        }
        Iterator<Float> it2 = this.f50146b0.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int O = this.f50134N + ((int) (m69414O(it2.next().floatValue()) * ((float) i)));
            int i3 = this.f50136P;
            canvas.translate((float) (O - i3), (float) (i2 - i3));
            this.f50167q0.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: v */
    private void m69460v() {
        if (this.f50132L != 2) {
            if (!this.f50125E) {
                this.f50125E = true;
                ValueAnimator m = m69448m(true);
                this.f50126F = m;
                this.f50127G = null;
                m.start();
            }
            Iterator<TooltipDrawable> it = this.f50122B.iterator();
            for (int i = 0; i < this.f50146b0.size() && it.hasNext(); i++) {
                if (i != this.f50150d0) {
                    m69422X(it.next(), this.f50146b0.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                m69422X(it.next(), this.f50146b0.get(this.f50150d0).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f50122B.size()), Integer.valueOf(this.f50146b0.size())}));
            }
        }
    }

    /* renamed from: w */
    private void m69461w() {
        if (this.f50125E) {
            this.f50125E = false;
            ValueAnimator m = m69448m(false);
            this.f50127G = m;
            this.f50126F = null;
            m.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    for (TooltipDrawable remove : BaseSlider.this.f50122B) {
                        ViewUtils.m68839f(BaseSlider.this).remove(remove);
                    }
                }
            });
            this.f50127G.start();
        }
    }

    /* renamed from: x */
    private void m69462x(int i) {
        if (i == 1) {
            m69412M(Integer.MAX_VALUE);
        } else if (i == 2) {
            m69412M(Integer.MIN_VALUE);
        } else if (i == 17) {
            m69413N(Integer.MAX_VALUE);
        } else if (i == 66) {
            m69413N(Integer.MIN_VALUE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public String m69463y(float f) {
        if (mo58754C()) {
            return this.f50141U.mo58839a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
    }

    /* renamed from: z */
    private static float m69464z(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    /* renamed from: C */
    public boolean mo58754C() {
        return this.f50141U != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo58755G() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public boolean mo58756T() {
        if (this.f50148c0 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float n0 = m69451n0(valueOfTouchPositionAbsolute);
        this.f50148c0 = 0;
        float abs = Math.abs(this.f50146b0.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f50146b0.size(); i++) {
            float abs2 = Math.abs(this.f50146b0.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float n02 = m69451n0(this.f50146b0.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !mo58755G() ? n02 - n0 < 0.0f : n02 - n0 > 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.f50148c0 = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(n02 - n0) < ((float) this.f50128H)) {
                    this.f50148c0 = -1;
                    return false;
                } else if (z) {
                    this.f50148c0 = i;
                }
            }
            abs = abs2;
        }
        if (this.f50148c0 != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo58757d0(int i, Rect rect) {
        int O = this.f50134N + ((int) (m69414O(getValues().get(i).floatValue()) * ((float) this.f50156h0)));
        int l = m69446l();
        int i2 = this.f50136P;
        rect.set(O - i2, l - i2, O + i2, l + i2);
    }

    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f50165p.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f50144a.setColor(m69403B(this.f50166p0));
        this.f50147c.setColor(m69403B(this.f50164o0));
        this.f50154g.setColor(m69403B(this.f50162n0));
        this.f50163o.setColor(m69403B(this.f50161m0));
        for (TooltipDrawable next : this.f50122B) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.f50167q0.isStateful()) {
            this.f50167q0.setState(getDrawableState());
        }
        this.f50152f.setColor(m69403B(this.f50160l0));
        this.f50152f.setAlpha(63);
    }

    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f50165p.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f50148c0;
    }

    public int getFocusedThumbIndex() {
        return this.f50150d0;
    }

    @Dimension
    public int getHaloRadius() {
        return this.f50137Q;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f50160l0;
    }

    public int getLabelBehavior() {
        return this.f50132L;
    }

    /* access modifiers changed from: protected */
    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f50151e0;
    }

    public float getThumbElevation() {
        return this.f50167q0.mo58683w();
    }

    @Dimension
    public int getThumbRadius() {
        return this.f50136P;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f50167q0.mo58642E();
    }

    public float getThumbStrokeWidth() {
        return this.f50167q0.mo58643G();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f50167q0.mo58684x();
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f50161m0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f50162n0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f50162n0.equals(this.f50161m0)) {
            return this.f50161m0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f50164o0;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f50133M;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f50166p0;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f50134N;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f50166p0.equals(this.f50164o0)) {
            return this.f50164o0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.f50156h0;
    }

    public float getValueFrom() {
        return this.f50143W;
    }

    public float getValueTo() {
        return this.f50145a0;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f50146b0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (TooltipDrawable h : this.f50122B) {
            m69438h(h);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.f50171z;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.f50125E = false;
        for (TooltipDrawable o : this.f50122B) {
            m69452o(o);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f50159k0) {
            m69437g0();
            m69408I();
        }
        super.onDraw(canvas);
        int l = m69446l();
        m69458t(canvas, this.f50156h0, l);
        if (((Float) Collections.max(getValues())).floatValue() > this.f50143W) {
            m69457s(canvas, this.f50156h0, l);
        }
        m69410K(canvas);
        if ((this.f50142V || isFocused()) && isEnabled()) {
            m69409J(canvas, this.f50156h0, l);
            if (this.f50148c0 != -1) {
                m69460v();
            }
        }
        m69459u(canvas, this.f50156h0, l);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f50148c0 = -1;
            m69461w();
            this.f50165p.clearKeyboardFocusForVirtualView(this.f50150d0);
            return;
        }
        m69462x(i);
        this.f50165p.requestKeyboardFocusForVirtualView(this.f50150d0);
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f50146b0.size() == 1) {
            this.f50148c0 = 0;
        }
        if (this.f50148c0 == -1) {
            Boolean P = m69415P(i, keyEvent);
            return P != null ? P.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.f50158j0 |= keyEvent.isLongPress();
        Float i2 = m69440i(i);
        if (i2 != null) {
            if (m69424Z(this.f50146b0.get(this.f50148c0).floatValue() + i2.floatValue())) {
                m69433e0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m69412M(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return m69412M(-1);
                }
                return false;
            }
        }
        this.f50148c0 = -1;
        m69461w();
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f50158j0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f50131K;
        int i4 = 0;
        if (this.f50132L == 1) {
            i4 = this.f50122B.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, BasicMeasure.EXACTLY));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f50143W = sliderState.f50181a;
        this.f50145a0 = sliderState.f50182c;
        setValuesInternal(sliderState.f50183d);
        this.f50151e0 = sliderState.f50184f;
        if (sliderState.f50185g) {
            requestFocus();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f50181a = this.f50143W;
        sliderState.f50182c = this.f50145a0;
        sliderState.f50183d = new ArrayList<>(this.f50146b0);
        sliderState.f50184f = this.f50151e0;
        sliderState.f50185g = hasFocus();
        return sliderState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m69435f0(i);
        m69433e0();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f50134N)) / ((float) this.f50156h0);
        this.f50168r0 = f;
        float max = Math.max(0.0f, f);
        this.f50168r0 = max;
        this.f50168r0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f50139S = x;
            if (!m69405E()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo58756T()) {
                    requestFocus();
                    this.f50142V = true;
                    m69430c0();
                    m69433e0();
                    invalidate();
                    m69416Q();
                }
            }
        } else if (actionMasked == 1) {
            this.f50142V = false;
            MotionEvent motionEvent2 = this.f50140T;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f50140T.getX() - motionEvent.getX()) <= ((float) this.f50128H) && Math.abs(this.f50140T.getY() - motionEvent.getY()) <= ((float) this.f50128H) && mo58756T()) {
                m69416Q();
            }
            if (this.f50148c0 != -1) {
                m69430c0();
                this.f50148c0 = -1;
                m69417R();
            }
            m69461w();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f50142V) {
                if (m69405E() && Math.abs(x - this.f50139S) < ((float) this.f50128H)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m69416Q();
            }
            if (mo58756T()) {
                this.f50142V = true;
                m69430c0();
                m69433e0();
                invalidate();
            }
        }
        setPressed(this.f50142V);
        this.f50140T = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActiveThumbIndex(int i) {
        this.f50148c0 = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f50146b0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f50150d0 = i;
        this.f50165p.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setHaloRadius(@Dimension @IntRange(from = 0) int i) {
        if (i != this.f50137Q) {
            this.f50137Q = i;
            Drawable background = getBackground();
            if (m69423Y() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                DrawableUtils.m68380a((RippleDrawable) background, this.f50137Q);
            }
        }
    }

    public void setHaloRadiusResource(@DimenRes int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f50160l0)) {
            this.f50160l0 = colorStateList;
            Drawable background = getBackground();
            if (m69423Y() || !(background instanceof RippleDrawable)) {
                this.f50152f.setColor(m69403B(colorStateList));
                this.f50152f.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.f50132L != i) {
            this.f50132L = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.f50141U = labelFormatter;
    }

    /* access modifiers changed from: protected */
    public void setSeparationUnit(int i) {
        this.f50170s0 = i;
        this.f50159k0 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(f), Float.valueOf(this.f50143W), Float.valueOf(this.f50145a0)}));
        } else if (this.f50151e0 != f) {
            this.f50151e0 = f;
            this.f50159k0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f50167q0.mo58655Z(f);
    }

    public void setThumbElevationResource(@DimenRes int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@Dimension @IntRange(from = 0) int i) {
        if (i != this.f50136P) {
            this.f50136P = i;
            m69411L();
            this.f50167q0.setShapeAppearanceModel(ShapeAppearanceModel.m69260a().mo58724q(0, (float) this.f50136P).mo58721m());
            MaterialShapeDrawable materialShapeDrawable = this.f50167q0;
            int i2 = this.f50136P;
            materialShapeDrawable.setBounds(0, 0, i2 * 2, i2 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f50167q0.mo58674m0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i) {
        if (i != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f50167q0.mo58676n0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f50167q0.mo58684x())) {
            this.f50167q0.mo58656a0(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f50161m0)) {
            this.f50161m0 = colorStateList;
            this.f50163o.setColor(m69403B(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f50162n0)) {
            this.f50162n0 = colorStateList;
            this.f50154g.setColor(m69403B(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f50155g0 != z) {
            this.f50155g0 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f50164o0)) {
            this.f50164o0 = colorStateList;
            this.f50147c.setColor(m69403B(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(@Dimension @IntRange(from = 0) int i) {
        if (this.f50133M != i) {
            this.f50133M = i;
            m69404D();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f50166p0)) {
            this.f50166p0 = colorStateList;
            this.f50144a.setColor(m69403B(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f50143W = f;
        this.f50159k0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f50145a0 = f;
        this.f50159k0 = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public BaseSlider(@NonNull Context context, @Nullable final AttributeSet attributeSet, final int i) {
        super(MaterialThemeOverlay.m69957c(context, attributeSet, i, f50120u0), attributeSet, i);
        this.f50122B = new ArrayList();
        this.f50123C = new ArrayList();
        this.f50124D = new ArrayList();
        this.f50125E = false;
        this.f50142V = false;
        this.f50146b0 = new ArrayList<>();
        this.f50148c0 = -1;
        this.f50150d0 = -1;
        this.f50151e0 = 0.0f;
        this.f50155g0 = true;
        this.f50158j0 = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f50167q0 = materialShapeDrawable;
        this.f50170s0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f50144a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f50147c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f50149d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f50152f = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f50154g = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f50163o = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        m69407H(context2.getResources());
        this.f50121A = new TooltipDrawableFactory() {
            /* renamed from: a */
            public TooltipDrawable mo58829a() {
                TypedArray h = ThemeEnforcement.m68822h(BaseSlider.this.getContext(), attributeSet, C10462R.styleable.Slider, i, BaseSlider.f50120u0, new int[0]);
                TooltipDrawable a = BaseSlider.m69418S(BaseSlider.this.getContext(), h);
                h.recycle();
                return a;
            }
        };
        m69420V(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.mo58668i0(2);
        this.f50128H = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.f50165p = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        this.f50169s = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }
}
