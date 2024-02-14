package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

class TimePickerView extends ConstraintLayout implements TimePickerControls {

    /* renamed from: a */
    private final Chip f50711a;

    /* renamed from: c */
    private final Chip f50712c;

    /* renamed from: d */
    private final ClockHandView f50713d;

    /* renamed from: f */
    private final ClockFaceView f50714f;

    /* renamed from: g */
    private final MaterialButtonToggleGroup f50715g;

    /* renamed from: o */
    private final View.OnClickListener f50716o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public OnPeriodChangeListener f50717p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public OnSelectionChange f50718s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public OnDoubleTapListener f50719z;

    interface OnDoubleTapListener {
        /* renamed from: y */
        void mo59370y();
    }

    interface OnPeriodChangeListener {
        /* renamed from: c */
        void mo59396c(int i);
    }

    interface OnSelectionChange {
        /* renamed from: d */
        void mo59397d(int i);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: o */
    private void m70059o() {
        Chip chip = this.f50711a;
        int i = C10462R.C10465id.selection_type;
        chip.setTag(i, 12);
        this.f50712c.setTag(i, 10);
        this.f50711a.setOnClickListener(this.f50716o);
        this.f50712c.setOnClickListener(this.f50716o);
    }

    /* renamed from: q */
    private void m70060q() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            public boolean onDoubleTap(MotionEvent motionEvent) {
                OnDoubleTapListener c = TimePickerView.this.f50719z;
                if (c == null) {
                    return false;
                }
                c.mo59370y();
                return true;
            }
        });
        C107154 r1 = new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.f50711a.setOnTouchListener(r1);
        this.f50712c.setOnTouchListener(r1);
    }

    /* renamed from: t */
    private void m70061t() {
        if (this.f50715g.getVisibility() == 0) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone((ConstraintLayout) this);
            int i = 1;
            if (ViewCompat.getLayoutDirection(this) == 0) {
                i = 2;
            }
            constraintSet.clear(C10462R.C10465id.material_clock_display, i);
            constraintSet.applyTo(this);
        }
    }

    /* renamed from: d */
    public void mo59409d(ClockHandView.OnRotateListener onRotateListener) {
        this.f50713d.mo59355b(onRotateListener);
    }

    /* renamed from: f */
    public void mo59410f(int i) {
        boolean z = true;
        this.f50711a.setChecked(i == 12);
        Chip chip = this.f50712c;
        if (i != 10) {
            z = false;
        }
        chip.setChecked(z);
    }

    /* renamed from: g */
    public void mo59411g(boolean z) {
        this.f50713d.mo59359j(z);
    }

    /* renamed from: h */
    public void mo59412h(float f, boolean z) {
        this.f50713d.mo59362m(f, z);
    }

    /* renamed from: i */
    public void mo59413i(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f50711a, accessibilityDelegateCompat);
    }

    /* renamed from: j */
    public void mo59414j(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f50712c, accessibilityDelegateCompat);
    }

    /* renamed from: k */
    public void mo59415k(ClockHandView.OnActionUpListener onActionUpListener) {
        this.f50713d.mo59363o(onActionUpListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo59416l(@Nullable OnDoubleTapListener onDoubleTapListener) {
        this.f50719z = onDoubleTapListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo59417m(OnPeriodChangeListener onPeriodChangeListener) {
        this.f50717p = onPeriodChangeListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo59418n(OnSelectionChange onSelectionChange) {
        this.f50718s = onSelectionChange;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m70061t();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m70061t();
        }
    }

    /* renamed from: p */
    public void mo59421p(String[] strArr, @StringRes int i) {
        this.f50714f.mo59352n(strArr, i);
    }

    /* renamed from: r */
    public void mo59422r() {
        this.f50715g.setVisibility(0);
    }

    /* renamed from: s */
    public void mo59423s(int i, int i2, int i3) {
        this.f50715g.mo57081j(i == 1 ? C10462R.C10465id.material_clock_period_pm_button : C10462R.C10465id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(i3)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(i2)});
        this.f50711a.setText(format);
        this.f50712c.setText(format2);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50716o = new View.OnClickListener() {
            public void onClick(View view) {
                if (TimePickerView.this.f50718s != null) {
                    TimePickerView.this.f50718s.mo59397d(((Integer) view.getTag(C10462R.C10465id.selection_type)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(C10462R.C10467layout.material_timepicker, this);
        this.f50714f = (ClockFaceView) findViewById(C10462R.C10465id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C10462R.C10465id.material_clock_period_toggle);
        this.f50715g = materialButtonToggleGroup;
        materialButtonToggleGroup.mo57076g(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            /* renamed from: a */
            public void mo57094a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
                int i2 = i == C10462R.C10465id.material_clock_period_pm_button ? 1 : 0;
                if (TimePickerView.this.f50717p != null && z) {
                    TimePickerView.this.f50717p.mo59396c(i2);
                }
            }
        });
        Chip chip = (Chip) findViewById(C10462R.C10465id.material_minute_tv);
        this.f50711a = chip;
        Chip chip2 = (Chip) findViewById(C10462R.C10465id.material_hour_tv);
        this.f50712c = chip2;
        this.f50713d = (ClockHandView) findViewById(C10462R.C10465id.material_clock_hand);
        ViewCompat.setAccessibilityLiveRegion(chip, 2);
        ViewCompat.setAccessibilityLiveRegion(chip2, 2);
        m70060q();
        m70059o();
    }
}
