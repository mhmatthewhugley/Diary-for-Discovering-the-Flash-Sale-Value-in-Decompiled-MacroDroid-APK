package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    @StyleRes

    /* renamed from: c */
    private int f49226c;
    @Nullable

    /* renamed from: d */
    private DateSelector<S> f49227d;
    @Nullable

    /* renamed from: f */
    private CalendarConstraints f49228f;

    @NonNull
    /* renamed from: W */
    static <T> MaterialTextInputPicker<T> m68231W(DateSelector<T> dateSelector, @StyleRes int i, @NonNull CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f49226c = bundle.getInt("THEME_RES_ID_KEY");
        this.f49227d = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f49228f = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f49227d.mo57584H1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f49226c)), viewGroup, bundle, this.f49228f, new OnSelectionChangedListener<S>() {
            /* renamed from: a */
            public void mo57641a() {
                Iterator it = MaterialTextInputPicker.this.f49252a.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).mo57641a();
                }
            }

            /* renamed from: b */
            public void mo57642b(S s) {
                Iterator it = MaterialTextInputPicker.this.f49252a.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).mo57642b(s);
                }
            }
        });
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f49226c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f49227d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f49228f);
    }
}
