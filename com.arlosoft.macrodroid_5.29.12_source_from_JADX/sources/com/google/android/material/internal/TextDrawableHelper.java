package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextDrawableHelper {

    /* renamed from: a */
    private final TextPaint f49655a = new TextPaint(1);

    /* renamed from: b */
    private final TextAppearanceFontCallback f49656b = new TextAppearanceFontCallback() {
        /* renamed from: a */
        public void mo57323a(int i) {
            boolean unused = TextDrawableHelper.this.f49658d = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f49659e.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.mo56809a();
            }
        }

        /* renamed from: b */
        public void mo57324b(@NonNull Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = TextDrawableHelper.this.f49658d = true;
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f49659e.get();
                if (textDrawableDelegate != null) {
                    textDrawableDelegate.mo56809a();
                }
            }
        }
    };

    /* renamed from: c */
    private float f49657c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f49658d = true;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public WeakReference<TextDrawableDelegate> f49659e = new WeakReference<>((Object) null);
    @Nullable

    /* renamed from: f */
    private TextAppearance f49660f;

    public interface TextDrawableDelegate {
        /* renamed from: a */
        void mo56809a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
        mo58220g(textDrawableDelegate);
    }

    /* renamed from: c */
    private float m68804c(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f49655a.measureText(charSequence, 0, charSequence.length());
    }

    @Nullable
    /* renamed from: d */
    public TextAppearance mo58217d() {
        return this.f49660f;
    }

    @NonNull
    /* renamed from: e */
    public TextPaint mo58218e() {
        return this.f49655a;
    }

    /* renamed from: f */
    public float mo58219f(String str) {
        if (!this.f49658d) {
            return this.f49657c;
        }
        float c = m68804c(str);
        this.f49657c = c;
        this.f49658d = false;
        return c;
    }

    /* renamed from: g */
    public void mo58220g(@Nullable TextDrawableDelegate textDrawableDelegate) {
        this.f49659e = new WeakReference<>(textDrawableDelegate);
    }

    /* renamed from: h */
    public void mo58221h(@Nullable TextAppearance textAppearance, Context context) {
        if (this.f49660f != textAppearance) {
            this.f49660f = textAppearance;
            if (textAppearance != null) {
                textAppearance.mo58608o(context, this.f49655a, this.f49656b);
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) this.f49659e.get();
                if (textDrawableDelegate != null) {
                    this.f49655a.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.mo58607n(context, this.f49655a, this.f49656b);
                this.f49658d = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = (TextDrawableDelegate) this.f49659e.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.mo56809a();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo58222i(boolean z) {
        this.f49658d = z;
    }

    /* renamed from: j */
    public void mo58223j(Context context) {
        this.f49660f.mo58607n(context, this.f49655a, this.f49656b);
    }
}
