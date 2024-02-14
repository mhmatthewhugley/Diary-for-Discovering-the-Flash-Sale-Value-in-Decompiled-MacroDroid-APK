package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;

class NoEndIconDelegate extends EndIconDelegate {
    NoEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59095a() {
        this.f50455a.setEndIconOnClickListener((View.OnClickListener) null);
        this.f50455a.setEndIconDrawable((Drawable) null);
        this.f50455a.setEndIconContentDescription((CharSequence) null);
    }
}
