package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C10462R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

class UtcDates {

    /* renamed from: a */
    static AtomicReference<TimeSource> f49274a = new AtomicReference<>();

    private UtcDates() {
    }

    /* renamed from: a */
    static long m68314a(long j) {
        Calendar q = m68330q();
        q.setTimeInMillis(j);
        return m68319f(q).getTimeInMillis();
    }

    /* renamed from: b */
    private static int m68315b(@NonNull String str, @NonNull String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: c */
    static DateFormat m68316c(Locale locale) {
        return m68318e("MMMd", locale);
    }

    /* renamed from: d */
    static DateFormat m68317d(Locale locale) {
        return m68318e("MMMEd", locale);
    }

    /* renamed from: e */
    private static DateFormat m68318e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m68329p());
        return instanceForSkeleton;
    }

    /* renamed from: f */
    static Calendar m68319f(Calendar calendar) {
        Calendar r = m68331r(calendar);
        Calendar q = m68330q();
        q.set(r.get(1), r.get(2), r.get(5));
        return q;
    }

    /* renamed from: g */
    private static java.text.DateFormat m68320g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m68327n());
        return dateInstance;
    }

    /* renamed from: h */
    static java.text.DateFormat m68321h(Locale locale) {
        return m68320g(0, locale);
    }

    /* renamed from: i */
    static java.text.DateFormat m68322i(Locale locale) {
        return m68320g(2, locale);
    }

    /* renamed from: j */
    static java.text.DateFormat m68323j(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m68322i(locale);
        simpleDateFormat.applyPattern(m68334u(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: k */
    static SimpleDateFormat m68324k() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m68327n());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: l */
    static String m68325l(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C10462R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C10462R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C10462R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: m */
    static TimeSource m68326m() {
        TimeSource timeSource = f49274a.get();
        return timeSource == null ? TimeSource.m68311c() : timeSource;
    }

    /* renamed from: n */
    private static TimeZone m68327n() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: o */
    static Calendar m68328o() {
        Calendar a = m68326m().mo57699a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m68327n());
        return a;
    }

    /* renamed from: p */
    private static android.icu.util.TimeZone m68329p() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: q */
    static Calendar m68330q() {
        return m68331r((Calendar) null);
    }

    /* renamed from: r */
    static Calendar m68331r(@Nullable Calendar calendar) {
        Calendar instance = Calendar.getInstance(m68327n());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: s */
    static DateFormat m68332s(Locale locale) {
        return m68318e("yMMMd", locale);
    }

    /* renamed from: t */
    static DateFormat m68333t(Locale locale) {
        return m68318e("yMMMEd", locale);
    }

    @NonNull
    /* renamed from: u */
    private static String m68334u(@NonNull String str) {
        int b = m68315b(str, "yY", 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b2 = m68315b(str, str2, 1, b);
        if (b2 < str.length()) {
            str2 = str2 + ",";
        }
        return str.replace(str.substring(m68315b(str, str2, -1, b) + 1, b2), " ").trim();
    }
}
