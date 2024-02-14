package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C10462R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import org.apache.commons.p353io.IOUtils;

abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: a */
    public final TextInputLayout f49145a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final DateFormat f49146c;

    /* renamed from: d */
    private final CalendarConstraints f49147d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f49148f;

    /* renamed from: g */
    private final Runnable f49149g;

    /* renamed from: o */
    private Runnable f49150o;

    DateFormatTextWatcher(final String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f49146c = dateFormat;
        this.f49145a = textInputLayout;
        this.f49147d = calendarConstraints;
        this.f49148f = textInputLayout.getContext().getString(C10462R.string.mtrl_picker_out_of_range);
        this.f49149g = new Runnable() {
            public void run() {
                TextInputLayout a = DateFormatTextWatcher.this.f49145a;
                DateFormat b = DateFormatTextWatcher.this.f49146c;
                Context context = a.getContext();
                String string = context.getString(C10462R.string.mtrl_picker_invalid_format);
                String format = String.format(context.getString(C10462R.string.mtrl_picker_invalid_format_use), new Object[]{str});
                String format2 = String.format(context.getString(C10462R.string.mtrl_picker_invalid_format_example), new Object[]{b.format(new Date(UtcDates.m68328o().getTimeInMillis()))});
                a.setError(string + IOUtils.LINE_SEPARATOR_UNIX + format + IOUtils.LINE_SEPARATOR_UNIX + format2);
                DateFormatTextWatcher.this.mo57578e();
            }
        };
    }

    /* renamed from: d */
    private Runnable m68144d(final long j) {
        return new Runnable() {
            public void run() {
                DateFormatTextWatcher.this.f49145a.setError(String.format(DateFormatTextWatcher.this.f49148f, new Object[]{DateStrings.m68158c(j)}));
                DateFormatTextWatcher.this.mo57578e();
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo57578e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo57579f(@Nullable Long l);

    /* renamed from: g */
    public void mo57580g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    public void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        this.f49145a.removeCallbacks(this.f49149g);
        this.f49145a.removeCallbacks(this.f49150o);
        this.f49145a.setError((CharSequence) null);
        mo57579f((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f49146c.parse(charSequence.toString());
                this.f49145a.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f49147d.mo57549f().mo57564C0(time) || !this.f49147d.mo57556l(time)) {
                    Runnable d = m68144d(time);
                    this.f49150o = d;
                    mo57580g(this.f49145a, d);
                    return;
                }
                mo57579f(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                mo57580g(this.f49145a, this.f49149g);
            }
        }
    }
}
