package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* renamed from: a */
    private final Typeface f49904a;

    /* renamed from: b */
    private final ApplyFont f49905b;

    /* renamed from: c */
    private boolean f49906c;

    public interface ApplyFont {
        /* renamed from: a */
        void mo58100a(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f49904a = typeface;
        this.f49905b = applyFont;
    }

    /* renamed from: d */
    private void m69111d(Typeface typeface) {
        if (!this.f49906c) {
            this.f49905b.mo58100a(typeface);
        }
    }

    /* renamed from: a */
    public void mo57323a(int i) {
        m69111d(this.f49904a);
    }

    /* renamed from: b */
    public void mo57324b(Typeface typeface, boolean z) {
        m69111d(typeface);
    }

    /* renamed from: c */
    public void mo58598c() {
        this.f49906c = true;
    }
}
