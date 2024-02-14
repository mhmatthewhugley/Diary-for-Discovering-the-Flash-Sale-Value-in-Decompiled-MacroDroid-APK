package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

class DateStrings {
    private DateStrings() {
    }

    /* renamed from: a */
    static Pair<String, String> m68156a(@Nullable Long l, @Nullable Long l2) {
        return m68157b(l, l2, (SimpleDateFormat) null);
    }

    /* renamed from: b */
    static Pair<String, String> m68157b(@Nullable Long l, @Nullable Long l2, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return Pair.create(null, null);
        }
        if (l == null) {
            return Pair.create(null, m68159d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return Pair.create(m68159d(l.longValue(), simpleDateFormat), null);
        }
        Calendar o = UtcDates.m68328o();
        Calendar q = UtcDates.m68330q();
        q.setTimeInMillis(l.longValue());
        Calendar q2 = UtcDates.m68330q();
        q2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (q.get(1) != q2.get(1)) {
            return Pair.create(m68166k(l.longValue(), Locale.getDefault()), m68166k(l2.longValue(), Locale.getDefault()));
        } else {
            if (q.get(1) == o.get(1)) {
                return Pair.create(m68161f(l.longValue(), Locale.getDefault()), m68161f(l2.longValue(), Locale.getDefault()));
            }
            return Pair.create(m68161f(l.longValue(), Locale.getDefault()), m68166k(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    static String m68158c(long j) {
        return m68159d(j, (SimpleDateFormat) null);
    }

    /* renamed from: d */
    static String m68159d(long j, @Nullable SimpleDateFormat simpleDateFormat) {
        Calendar o = UtcDates.m68328o();
        Calendar q = UtcDates.m68330q();
        q.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (o.get(1) == q.get(1)) {
            return m68160e(j);
        }
        return m68165j(j);
    }

    /* renamed from: e */
    static String m68160e(long j) {
        return m68161f(j, Locale.getDefault());
    }

    /* renamed from: f */
    static String m68161f(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.m68316c(locale).format(new Date(j));
        }
        return UtcDates.m68323j(locale).format(new Date(j));
    }

    /* renamed from: g */
    static String m68162g(long j) {
        return m68163h(j, Locale.getDefault());
    }

    /* renamed from: h */
    static String m68163h(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.m68317d(locale).format(new Date(j));
        }
        return UtcDates.m68321h(locale).format(new Date(j));
    }

    /* renamed from: i */
    static String m68164i(Context context, long j) {
        return DateUtils.formatDateTime(context, j - ((long) TimeZone.getDefault().getOffset(j)), 36);
    }

    /* renamed from: j */
    static String m68165j(long j) {
        return m68166k(j, Locale.getDefault());
    }

    /* renamed from: k */
    static String m68166k(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.m68332s(locale).format(new Date(j));
        }
        return UtcDates.m68322i(locale).format(new Date(j));
    }

    /* renamed from: l */
    static String m68167l(long j) {
        return m68168m(j, Locale.getDefault());
    }

    /* renamed from: m */
    static String m68168m(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.m68333t(locale).format(new Date(j));
        }
        return UtcDates.m68321h(locale).format(new Date(j));
    }
}
