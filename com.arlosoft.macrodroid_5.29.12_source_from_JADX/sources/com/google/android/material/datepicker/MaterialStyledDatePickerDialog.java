package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.C10462R;
import com.google.android.material.dialog.InsetDialogOnTouchListener;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.TESTS})
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    @StyleRes

    /* renamed from: d */
    private static final int f49223d = C10462R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    @NonNull

    /* renamed from: a */
    private final Drawable f49224a;
    @NonNull

    /* renamed from: c */
    private final Rect f49225c;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f49224a);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, this.f49225c));
    }
}
