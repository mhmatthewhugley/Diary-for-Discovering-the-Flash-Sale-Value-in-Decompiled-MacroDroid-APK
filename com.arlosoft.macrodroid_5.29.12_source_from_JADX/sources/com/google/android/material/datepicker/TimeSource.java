package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

class TimeSource {

    /* renamed from: c */
    private static final TimeSource f49271c = new TimeSource((Long) null, (TimeZone) null);
    @Nullable

    /* renamed from: a */
    private final Long f49272a;
    @Nullable

    /* renamed from: b */
    private final TimeZone f49273b;

    private TimeSource(@Nullable Long l, @Nullable TimeZone timeZone) {
        this.f49272a = l;
        this.f49273b = timeZone;
    }

    /* renamed from: c */
    static TimeSource m68311c() {
        return f49271c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo57699a() {
        return mo57700b(this.f49273b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Calendar mo57700b(@Nullable TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f49272a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
