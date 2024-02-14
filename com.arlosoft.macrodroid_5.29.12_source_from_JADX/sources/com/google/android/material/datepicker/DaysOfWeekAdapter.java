package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Calendar;

class DaysOfWeekAdapter extends BaseAdapter {

    /* renamed from: f */
    private static final int f49157f = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    @NonNull

    /* renamed from: a */
    private final Calendar f49158a;

    /* renamed from: c */
    private final int f49159c;

    /* renamed from: d */
    private final int f49160d;

    public DaysOfWeekAdapter() {
        Calendar q = UtcDates.m68330q();
        this.f49158a = q;
        this.f49159c = q.getMaximum(7);
        this.f49160d = q.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m68176b(int i) {
        int i2 = i + this.f49160d;
        int i3 = this.f49159c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Nullable
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f49159c) {
            return null;
        }
        return Integer.valueOf(m68176b(i));
    }

    public int getCount() {
        return this.f49159c;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.C10462R.C10467layout.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f49158a
            int r6 = r5.m68176b(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f49158a
            int r3 = f49157f
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = com.google.android.material.C10462R.string.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f49158a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.DaysOfWeekAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
