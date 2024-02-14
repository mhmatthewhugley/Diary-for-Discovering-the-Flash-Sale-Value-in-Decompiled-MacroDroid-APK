package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

abstract class EndIconDelegate {

    /* renamed from: a */
    TextInputLayout f50455a;

    /* renamed from: b */
    Context f50456b;

    /* renamed from: c */
    CheckableImageButton f50457c;
    @DrawableRes

    /* renamed from: d */
    final int f50458d;

    EndIconDelegate(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        this.f50455a = textInputLayout;
        this.f50456b = textInputLayout.getContext();
        this.f50457c = textInputLayout.getEndIconView();
        this.f50458d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo59095a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo59113b(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo59096c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo59114d() {
        return false;
    }
}
