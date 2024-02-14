package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextAppearance {
    @Nullable

    /* renamed from: a */
    public final ColorStateList f49907a;
    @Nullable

    /* renamed from: b */
    public final ColorStateList f49908b;
    @Nullable

    /* renamed from: c */
    public final ColorStateList f49909c;
    @Nullable

    /* renamed from: d */
    public final String f49910d;

    /* renamed from: e */
    public final int f49911e;

    /* renamed from: f */
    public final int f49912f;

    /* renamed from: g */
    public final boolean f49913g;

    /* renamed from: h */
    public final float f49914h;

    /* renamed from: i */
    public final float f49915i;

    /* renamed from: j */
    public final float f49916j;

    /* renamed from: k */
    public final boolean f49917k;

    /* renamed from: l */
    public final float f49918l;
    @Nullable

    /* renamed from: m */
    private ColorStateList f49919m;

    /* renamed from: n */
    private float f49920n;
    @FontRes

    /* renamed from: o */
    private final int f49921o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f49922p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Typeface f49923q;

    public TextAppearance(@NonNull Context context, @StyleRes int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10462R.styleable.TextAppearance);
        mo58606l(obtainStyledAttributes.getDimension(C10462R.styleable.TextAppearance_android_textSize, 0.0f));
        mo58605k(MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.TextAppearance_android_textColor));
        this.f49907a = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.TextAppearance_android_textColorHint);
        this.f49908b = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.TextAppearance_android_textColorLink);
        this.f49911e = obtainStyledAttributes.getInt(C10462R.styleable.TextAppearance_android_textStyle, 0);
        this.f49912f = obtainStyledAttributes.getInt(C10462R.styleable.TextAppearance_android_typeface, 1);
        int e = MaterialResources.m69125e(obtainStyledAttributes, C10462R.styleable.TextAppearance_fontFamily, C10462R.styleable.TextAppearance_android_fontFamily);
        this.f49921o = obtainStyledAttributes.getResourceId(e, 0);
        this.f49910d = obtainStyledAttributes.getString(e);
        this.f49913g = obtainStyledAttributes.getBoolean(C10462R.styleable.TextAppearance_textAllCaps, false);
        this.f49909c = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.TextAppearance_android_shadowColor);
        this.f49914h = obtainStyledAttributes.getFloat(C10462R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f49915i = obtainStyledAttributes.getFloat(C10462R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f49916j = obtainStyledAttributes.getFloat(C10462R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C10462R.styleable.MaterialTextAppearance);
        int i2 = C10462R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.f49917k = obtainStyledAttributes2.hasValue(i2);
        this.f49918l = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    private void m69132d() {
        String str;
        if (this.f49923q == null && (str = this.f49910d) != null) {
            this.f49923q = Typeface.create(str, this.f49911e);
        }
        if (this.f49923q == null) {
            int i = this.f49912f;
            if (i == 1) {
                this.f49923q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f49923q = Typeface.SERIF;
            } else if (i != 3) {
                this.f49923q = Typeface.DEFAULT;
            } else {
                this.f49923q = Typeface.MONOSPACE;
            }
            this.f49923q = Typeface.create(this.f49923q, this.f49911e);
        }
    }

    /* renamed from: m */
    private boolean m69133m(Context context) {
        if (TextAppearanceConfig.m69147a()) {
            return true;
        }
        int i = this.f49921o;
        if ((i != 0 ? ResourcesCompat.getCachedFont(context, i) : null) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Typeface mo58599e() {
        m69132d();
        return this.f49923q;
    }

    @VisibleForTesting
    @NonNull
    /* renamed from: f */
    public Typeface mo58600f(@NonNull Context context) {
        if (this.f49922p) {
            return this.f49923q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.f49921o);
                this.f49923q = font;
                if (font != null) {
                    this.f49923q = Typeface.create(font, this.f49911e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f49910d);
            }
        }
        m69132d();
        this.f49922p = true;
        return this.f49923q;
    }

    /* renamed from: g */
    public void mo58601g(@NonNull Context context, @NonNull final TextPaint textPaint, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        mo58609p(textPaint, mo58599e());
        mo58602h(context, new TextAppearanceFontCallback() {
            /* renamed from: a */
            public void mo57323a(int i) {
                textAppearanceFontCallback.mo57323a(i);
            }

            /* renamed from: b */
            public void mo57324b(@NonNull Typeface typeface, boolean z) {
                TextAppearance.this.mo58609p(textPaint, typeface);
                textAppearanceFontCallback.mo57324b(typeface, z);
            }
        });
    }

    /* renamed from: h */
    public void mo58602h(@NonNull Context context, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m69133m(context)) {
            mo58600f(context);
        } else {
            m69132d();
        }
        int i = this.f49921o;
        if (i == 0) {
            this.f49922p = true;
        }
        if (this.f49922p) {
            textAppearanceFontCallback.mo57324b(this.f49923q, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i, new ResourcesCompat.FontCallback() {
                public void onFontRetrievalFailed(int i) {
                    boolean unused = TextAppearance.this.f49922p = true;
                    textAppearanceFontCallback.mo57323a(i);
                }

                public void onFontRetrieved(@NonNull Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    Typeface unused = textAppearance.f49923q = Typeface.create(typeface, textAppearance.f49911e);
                    boolean unused2 = TextAppearance.this.f49922p = true;
                    textAppearanceFontCallback.mo57324b(TextAppearance.this.f49923q, false);
                }
            }, (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f49922p = true;
            textAppearanceFontCallback.mo57323a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f49910d);
            this.f49922p = true;
            textAppearanceFontCallback.mo57323a(-3);
        }
    }

    @Nullable
    /* renamed from: i */
    public ColorStateList mo58603i() {
        return this.f49919m;
    }

    /* renamed from: j */
    public float mo58604j() {
        return this.f49920n;
    }

    /* renamed from: k */
    public void mo58605k(@Nullable ColorStateList colorStateList) {
        this.f49919m = colorStateList;
    }

    /* renamed from: l */
    public void mo58606l(float f) {
        this.f49920n = f;
    }

    /* renamed from: n */
    public void mo58607n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        mo58608o(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.f49919m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        float f = this.f49916j;
        float f2 = this.f49914h;
        float f3 = this.f49915i;
        ColorStateList colorStateList2 = this.f49909c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: o */
    public void mo58608o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m69133m(context)) {
            mo58609p(textPaint, mo58600f(context));
        } else {
            mo58601g(context, textPaint, textAppearanceFontCallback);
        }
    }

    /* renamed from: p */
    public void mo58609p(@NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f49911e;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f49920n);
        if (this.f49917k) {
            textPaint.setLetterSpacing(this.f49918l);
        }
    }
}
