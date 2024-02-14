package com.google.android.material.textfield;

import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

class CustomEndIconDelegate extends EndIconDelegate {
    CustomEndIconDelegate(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        super(textInputLayout, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59095a() {
        this.f50455a.setEndIconDrawable(this.f50458d);
        this.f50455a.setEndIconOnClickListener((View.OnClickListener) null);
        this.f50455a.setEndIconOnLongClickListener((View.OnLongClickListener) null);
    }
}
