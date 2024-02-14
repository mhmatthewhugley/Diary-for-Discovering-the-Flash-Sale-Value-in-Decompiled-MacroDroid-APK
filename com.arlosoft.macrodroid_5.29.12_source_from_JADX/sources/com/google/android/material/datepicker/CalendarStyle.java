package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.C10462R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

final class CalendarStyle {
    @NonNull

    /* renamed from: a */
    final CalendarItemStyle f49133a;
    @NonNull

    /* renamed from: b */
    final CalendarItemStyle f49134b;
    @NonNull

    /* renamed from: c */
    final CalendarItemStyle f49135c;
    @NonNull

    /* renamed from: d */
    final CalendarItemStyle f49136d;
    @NonNull

    /* renamed from: e */
    final CalendarItemStyle f49137e;
    @NonNull

    /* renamed from: f */
    final CalendarItemStyle f49138f;
    @NonNull

    /* renamed from: g */
    final CalendarItemStyle f49139g;
    @NonNull

    /* renamed from: h */
    final Paint f49140h;

    CalendarStyle(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m69119d(context, C10462R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C10462R.styleable.MaterialCalendar);
        this.f49133a = CalendarItemStyle.m68129a(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendar_dayStyle, 0));
        this.f49139g = CalendarItemStyle.m68129a(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f49134b = CalendarItemStyle.m68129a(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f49135c = CalendarItemStyle.m68129a(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.MaterialCalendar_rangeFillColor);
        this.f49136d = CalendarItemStyle.m68129a(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendar_yearStyle, 0));
        this.f49137e = CalendarItemStyle.m68129a(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f49138f = CalendarItemStyle.m68129a(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f49140h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
