package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() {
        @NonNull
        /* renamed from: a */
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Long unused = rangeDateSelector.f49255d = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.f49256f = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        @NonNull
        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    };

    /* renamed from: a */
    private String f49253a;

    /* renamed from: c */
    private final String f49254c = " ";
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Long f49255d = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public Long f49256f = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public Long f49257g = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: o */
    public Long f49258o = null;

    /* renamed from: f */
    private void m68276f(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f49253a.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    /* renamed from: h */
    private boolean m68277h(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: i */
    private void m68278i(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f49253a);
        textInputLayout2.setError(" ");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m68279j(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        Long l = this.f49257g;
        if (l == null || this.f49258o == null) {
            m68276f(textInputLayout, textInputLayout2);
            onSelectionChangedListener.mo57641a();
        } else if (m68277h(l.longValue(), this.f49258o.longValue())) {
            this.f49255d = this.f49257g;
            this.f49256f = this.f49258o;
            onSelectionChangedListener.mo57642b(mo57587b2());
        } else {
            m68278i(textInputLayout, textInputLayout2);
            onSelectionChangedListener.mo57641a();
        }
    }

    /* renamed from: H1 */
    public View mo57584H1(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        View inflate = layoutInflater.inflate(C10462R.C10467layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C10462R.C10465id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C10462R.C10465id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.m68719a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f49253a = inflate.getResources().getString(C10462R.string.mtrl_picker_invalid_range);
        SimpleDateFormat k = UtcDates.m68324k();
        Long l = this.f49255d;
        if (l != null) {
            editText.setText(k.format(l));
            this.f49257g = this.f49255d;
        }
        Long l2 = this.f49256f;
        if (l2 != null) {
            editText2.setText(k.format(l2));
            this.f49258o = this.f49256f;
        }
        String l3 = UtcDates.m68325l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l3);
        textInputLayout2.setPlaceholderText(l3);
        SimpleDateFormat simpleDateFormat = k;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        final TextInputLayout textInputLayout3 = textInputLayout;
        C105461 r9 = r0;
        final TextInputLayout textInputLayout4 = textInputLayout2;
        String str = l3;
        final OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener2 = onSelectionChangedListener;
        C105461 r0 = new DateFormatTextWatcher(l3, simpleDateFormat, textInputLayout, calendarConstraints2) {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo57578e() {
                Long unused = RangeDateSelector.this.f49257g = null;
                RangeDateSelector.this.m68279j(textInputLayout3, textInputLayout4, onSelectionChangedListener2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public void mo57579f(@Nullable Long l) {
                Long unused = RangeDateSelector.this.f49257g = l;
                RangeDateSelector.this.m68279j(textInputLayout3, textInputLayout4, onSelectionChangedListener2);
            }
        };
        editText.addTextChangedListener(r9);
        editText2.addTextChangedListener(new DateFormatTextWatcher(str, simpleDateFormat, textInputLayout2, calendarConstraints2) {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo57578e() {
                Long unused = RangeDateSelector.this.f49258o = null;
                RangeDateSelector.this.m68279j(textInputLayout3, textInputLayout4, onSelectionChangedListener2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public void mo57579f(@Nullable Long l) {
                Long unused = RangeDateSelector.this.f49258o = l;
                RangeDateSelector.this.m68279j(textInputLayout3, textInputLayout4, onSelectionChangedListener2);
            }
        });
        ViewUtils.m68847n(editText);
        return inflate;
    }

    /* renamed from: Y1 */
    public boolean mo57585Y1() {
        Long l = this.f49255d;
        return (l == null || this.f49256f == null || !m68277h(l.longValue(), this.f49256f.longValue())) ? false : true;
    }

    @NonNull
    /* renamed from: Z1 */
    public Collection<Long> mo57586Z1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f49255d;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f49256f;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    @NonNull
    /* renamed from: g */
    public Pair<Long, Long> mo57587b2() {
        return new Pair<>(this.f49255d, this.f49256f);
    }

    /* renamed from: g2 */
    public void mo57588g2(long j) {
        Long l = this.f49255d;
        if (l == null) {
            this.f49255d = Long.valueOf(j);
        } else if (this.f49256f != null || !m68277h(l.longValue(), j)) {
            this.f49256f = null;
            this.f49255d = Long.valueOf(j);
        } else {
            this.f49256f = Long.valueOf(j);
        }
    }

    @NonNull
    /* renamed from: l1 */
    public String mo57589l1(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f49255d;
        if (l == null && this.f49256f == null) {
            return resources.getString(C10462R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f49256f;
        if (l2 == null) {
            return resources.getString(C10462R.string.mtrl_picker_range_header_only_start_selected, new Object[]{DateStrings.m68158c(l.longValue())});
        } else if (l == null) {
            return resources.getString(C10462R.string.mtrl_picker_range_header_only_end_selected, new Object[]{DateStrings.m68158c(l2.longValue())});
        } else {
            Pair<String, String> a = DateStrings.m68156a(l, l2);
            return resources.getString(C10462R.string.mtrl_picker_range_header_selected, new Object[]{a.first, a.second});
        }
    }

    @NonNull
    /* renamed from: o1 */
    public Collection<Pair<Long, Long>> mo57590o1() {
        if (this.f49255d == null || this.f49256f == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.f49255d, this.f49256f));
        return arrayList;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f49255d);
        parcel.writeValue(this.f49256f);
    }

    /* renamed from: z0 */
    public int mo57591z0(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.m69119d(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C10462R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? C10462R.attr.materialCalendarTheme : C10462R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }
}
