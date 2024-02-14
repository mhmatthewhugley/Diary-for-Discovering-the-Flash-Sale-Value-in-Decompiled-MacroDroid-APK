package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() {
        @NonNull
        /* renamed from: a */
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.f49267a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @NonNull
        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    };
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public Long f49267a;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m68297c() {
        this.f49267a = null;
    }

    /* renamed from: H1 */
    public View mo57584H1(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View inflate = layoutInflater.inflate(C10462R.C10467layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C10462R.C10465id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.m68719a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat k = UtcDates.m68324k();
        String l = UtcDates.m68325l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l);
        Long l2 = this.f49267a;
        if (l2 != null) {
            editText.setText(k.format(l2));
        }
        final OnSelectionChangedListener<Long> onSelectionChangedListener2 = onSelectionChangedListener;
        editText.addTextChangedListener(new DateFormatTextWatcher(l, k, textInputLayout, calendarConstraints) {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo57578e() {
                onSelectionChangedListener2.mo57641a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public void mo57579f(@Nullable Long l) {
                if (l == null) {
                    SingleDateSelector.this.m68297c();
                } else {
                    SingleDateSelector.this.mo57588g2(l.longValue());
                }
                onSelectionChangedListener2.mo57642b(SingleDateSelector.this.mo57587b2());
            }
        });
        ViewUtils.m68847n(editText);
        return inflate;
    }

    /* renamed from: Y1 */
    public boolean mo57585Y1() {
        return this.f49267a != null;
    }

    @NonNull
    /* renamed from: Z1 */
    public Collection<Long> mo57586Z1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f49267a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: d */
    public Long mo57587b2() {
        return this.f49267a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g2 */
    public void mo57588g2(long j) {
        this.f49267a = Long.valueOf(j);
    }

    @NonNull
    /* renamed from: l1 */
    public String mo57589l1(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f49267a;
        if (l == null) {
            return resources.getString(C10462R.string.mtrl_picker_date_header_unselected);
        }
        String j = DateStrings.m68165j(l.longValue());
        return resources.getString(C10462R.string.mtrl_picker_date_header_selected, new Object[]{j});
    }

    @NonNull
    /* renamed from: o1 */
    public Collection<Pair<Long, Long>> mo57590o1() {
        return new ArrayList();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f49267a);
    }

    /* renamed from: z0 */
    public int mo57591z0(Context context) {
        return MaterialAttributes.m69119d(context, C10462R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }
}
