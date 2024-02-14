package com.google.android.material.timepicker;

import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.C10462R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;

class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {

    /* renamed from: o */
    private static final String[] f50685o = {"12", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: p */
    private static final String[] f50686p = {"00", ExifInterface.GPS_MEASUREMENT_2D, "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};

    /* renamed from: s */
    private static final String[] f50687s = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a */
    private TimePickerView f50688a;

    /* renamed from: c */
    private TimeModel f50689c;

    /* renamed from: d */
    private float f50690d;

    /* renamed from: f */
    private float f50691f;

    /* renamed from: g */
    private boolean f50692g = false;

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.f50688a = timePickerView;
        this.f50689c = timeModel;
        mo59399i();
    }

    /* renamed from: g */
    private int m70023g() {
        return this.f50689c.f50680d == 1 ? 15 : 30;
    }

    /* renamed from: h */
    private String[] m70024h() {
        return this.f50689c.f50680d == 1 ? f50686p : f50685o;
    }

    /* renamed from: j */
    private void m70025j(int i, int i2) {
        TimeModel timeModel = this.f50689c;
        if (timeModel.f50682g != i2 || timeModel.f50681f != i) {
            this.f50688a.performHapticFeedback(4);
        }
    }

    /* renamed from: l */
    private void m70026l() {
        TimePickerView timePickerView = this.f50688a;
        TimeModel timeModel = this.f50689c;
        timePickerView.mo59423s(timeModel.f50684p, timeModel.mo59381c(), this.f50689c.f50682g);
    }

    /* renamed from: m */
    private void m70027m() {
        m70028n(f50685o, "%d");
        m70028n(f50686p, "%d");
        m70028n(f50687s, "%02d");
    }

    /* renamed from: n */
    private void m70028n(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.m70013b(this.f50688a.getResources(), strArr[i], str);
        }
    }

    /* renamed from: a */
    public void mo59395a() {
        this.f50691f = (float) (this.f50689c.mo59381c() * m70023g());
        TimeModel timeModel = this.f50689c;
        this.f50690d = (float) (timeModel.f50682g * 6);
        mo59400k(timeModel.f50683o, false);
        m70026l();
    }

    /* renamed from: b */
    public void mo59369b(float f, boolean z) {
        this.f50692g = true;
        TimeModel timeModel = this.f50689c;
        int i = timeModel.f50682g;
        int i2 = timeModel.f50681f;
        if (timeModel.f50683o == 10) {
            this.f50688a.mo59412h(this.f50691f, false);
            if (!((AccessibilityManager) ContextCompat.getSystemService(this.f50688a.getContext(), AccessibilityManager.class)).isTouchExplorationEnabled()) {
                mo59400k(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.f50689c.mo59387h(((round + 15) / 30) * 5);
                this.f50690d = (float) (this.f50689c.f50682g * 6);
            }
            this.f50688a.mo59412h(this.f50690d, z);
        }
        this.f50692g = false;
        m70026l();
        m70025j(i2, i);
    }

    /* renamed from: c */
    public void mo59396c(int i) {
        this.f50689c.mo59389i(i);
    }

    /* renamed from: d */
    public void mo59397d(int i) {
        mo59400k(i, true);
    }

    /* renamed from: e */
    public void mo59351e(float f, boolean z) {
        if (!this.f50692g) {
            TimeModel timeModel = this.f50689c;
            int i = timeModel.f50681f;
            int i2 = timeModel.f50682g;
            int round = Math.round(f);
            TimeModel timeModel2 = this.f50689c;
            if (timeModel2.f50683o == 12) {
                timeModel2.mo59387h((round + 3) / 6);
                this.f50690d = (float) Math.floor((double) (this.f50689c.f50682g * 6));
            } else {
                this.f50689c.mo59386g((round + (m70023g() / 2)) / m70023g());
                this.f50691f = (float) (this.f50689c.mo59381c() * m70023g());
            }
            if (!z) {
                m70026l();
                m70025j(i, i2);
            }
        }
    }

    /* renamed from: f */
    public void mo59398f() {
        this.f50688a.setVisibility(8);
    }

    /* renamed from: i */
    public void mo59399i() {
        if (this.f50689c.f50680d == 0) {
            this.f50688a.mo59422r();
        }
        this.f50688a.mo59409d(this);
        this.f50688a.mo59418n(this);
        this.f50688a.mo59417m(this);
        this.f50688a.mo59415k(this);
        m70027m();
        mo59395a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo59400k(int i, boolean z) {
        String[] strArr;
        boolean z2 = i == 12;
        this.f50688a.mo59411g(z2);
        this.f50689c.f50683o = i;
        TimePickerView timePickerView = this.f50688a;
        if (z2) {
            strArr = f50687s;
        } else {
            strArr = m70024h();
        }
        timePickerView.mo59421p(strArr, z2 ? C10462R.string.material_minute_suffix : C10462R.string.material_hour_suffix);
        this.f50688a.mo59412h(z2 ? this.f50690d : this.f50691f, z);
        this.f50688a.mo59410f(i);
        this.f50688a.mo59414j(new ClickActionDelegate(this.f50688a.getContext(), C10462R.string.material_hour_selection));
        this.f50688a.mo59413i(new ClickActionDelegate(this.f50688a.getContext(), C10462R.string.material_minute_selection));
    }

    public void show() {
        this.f50688a.setVisibility(0);
    }
}
