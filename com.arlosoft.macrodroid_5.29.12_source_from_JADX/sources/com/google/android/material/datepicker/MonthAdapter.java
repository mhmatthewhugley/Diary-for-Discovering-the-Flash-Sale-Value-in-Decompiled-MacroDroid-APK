package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Collection;

class MonthAdapter extends BaseAdapter {

    /* renamed from: o */
    static final int f49237o = UtcDates.m68330q().getMaximum(4);

    /* renamed from: a */
    final Month f49238a;

    /* renamed from: c */
    final DateSelector<?> f49239c;

    /* renamed from: d */
    private Collection<Long> f49240d;

    /* renamed from: f */
    CalendarStyle f49241f;

    /* renamed from: g */
    final CalendarConstraints f49242g;

    MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f49238a = month;
        this.f49239c = dateSelector;
        this.f49242g = calendarConstraints;
        this.f49240d = dateSelector.mo57586Z1();
    }

    /* renamed from: e */
    private void m68247e(Context context) {
        if (this.f49241f == null) {
            this.f49241f = new CalendarStyle(context);
        }
    }

    /* renamed from: h */
    private boolean m68248h(long j) {
        for (Long longValue : this.f49239c.mo57586Z1()) {
            if (UtcDates.m68314a(j) == UtcDates.m68314a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m68249k(@Nullable TextView textView, long j) {
        CalendarItemStyle calendarItemStyle;
        if (textView != null) {
            if (this.f49242g.mo57549f().mo57564C0(j)) {
                textView.setEnabled(true);
                if (m68248h(j)) {
                    calendarItemStyle = this.f49241f.f49134b;
                } else if (UtcDates.m68328o().getTimeInMillis() == j) {
                    calendarItemStyle = this.f49241f.f49135c;
                } else {
                    calendarItemStyle = this.f49241f.f49133a;
                }
            } else {
                textView.setEnabled(false);
                calendarItemStyle = this.f49241f.f49139g;
            }
            calendarItemStyle.mo57567d(textView);
        }
    }

    /* renamed from: l */
    private void m68250l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m68235e(j).equals(this.f49238a)) {
            m68249k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo57663a(this.f49238a.mo57653j(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo57663a(int i) {
        return mo57664b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo57664b() {
        return this.f49238a.mo57650g();
    }

    @Nullable
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f49238a.mo57650g() || i > mo57674i()) {
            return null;
        }
        return Long.valueOf(this.f49238a.mo57652i(mo57675j(i)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    @androidx.annotation.NonNull
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m68247e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.C10462R.C10467layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo57664b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.Month r8 = r5.f49238a
            int r2 = r8.f49234g
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f49238a
            long r7 = r8.mo57652i(r7)
            com.google.android.material.datepicker.Month r3 = r5.f49238a
            int r3 = r3.f49232d
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m68236f()
            int r4 = r4.f49232d
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.m68162g(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.m68167l(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.m68249k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MonthAdapter.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo57667f(int i) {
        return i % this.f49238a.f49233f == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo57668g(int i) {
        return (i + 1) % this.f49238a.f49233f == 0;
    }

    public int getCount() {
        return this.f49238a.f49234g + mo57664b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f49238a.f49233f);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo57674i() {
        return (this.f49238a.mo57650g() + this.f49238a.f49234g) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo57675j(int i) {
        return (i - this.f49238a.mo57650g()) + 1;
    }

    /* renamed from: m */
    public void mo57676m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f49240d) {
            m68250l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector<?> dateSelector = this.f49239c;
        if (dateSelector != null) {
            for (Long longValue2 : dateSelector.mo57586Z1()) {
                m68250l(materialCalendarGridView, longValue2.longValue());
            }
            this.f49240d = this.f49239c.mo57586Z1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo57677n(int i) {
        return i >= mo57664b() && i <= mo57674i();
    }
}
