package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class PickerFragment<S> extends Fragment {

    /* renamed from: a */
    protected final LinkedHashSet<OnSelectionChangedListener<S>> f49252a = new LinkedHashSet<>();

    PickerFragment() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public boolean mo57614U(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.f49252a.add(onSelectionChangedListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo57684V() {
        this.f49252a.clear();
    }
}
