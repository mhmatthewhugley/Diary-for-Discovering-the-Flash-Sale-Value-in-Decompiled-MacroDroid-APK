package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Constructor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
final class StaticLayoutBuilderCompat {

    /* renamed from: n */
    static final int f49638n = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: o */
    private static boolean f49639o;
    @Nullable

    /* renamed from: p */
    private static Constructor<StaticLayout> f49640p;
    @Nullable

    /* renamed from: q */
    private static Object f49641q;

    /* renamed from: a */
    private CharSequence f49642a;

    /* renamed from: b */
    private final TextPaint f49643b;

    /* renamed from: c */
    private final int f49644c;

    /* renamed from: d */
    private int f49645d = 0;

    /* renamed from: e */
    private int f49646e;

    /* renamed from: f */
    private Layout.Alignment f49647f;

    /* renamed from: g */
    private int f49648g;

    /* renamed from: h */
    private float f49649h;

    /* renamed from: i */
    private float f49650i;

    /* renamed from: j */
    private int f49651j;

    /* renamed from: k */
    private boolean f49652k;

    /* renamed from: l */
    private boolean f49653l;
    @Nullable

    /* renamed from: m */
    private TextUtils.TruncateAt f49654m;

    static class StaticLayoutBuilderCompatException extends Exception {
        StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f49642a = charSequence;
        this.f49643b = textPaint;
        this.f49644c = i;
        this.f49646e = charSequence.length();
        this.f49647f = Layout.Alignment.ALIGN_NORMAL;
        this.f49648g = Integer.MAX_VALUE;
        this.f49649h = 0.0f;
        this.f49650i = 1.0f;
        this.f49651j = f49638n;
        this.f49652k = true;
        this.f49654m = null;
    }

    /* renamed from: b */
    private void m68792b() throws StaticLayoutBuilderCompatException {
        if (!f49639o) {
            try {
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                f49641q = this.f49653l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f49640p = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f49639o = true;
            } catch (Exception e) {
                throw new StaticLayoutBuilderCompatException(e);
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public static StaticLayoutBuilderCompat m68793c(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo58209a() throws StaticLayoutBuilderCompatException {
        if (this.f49642a == null) {
            this.f49642a = "";
        }
        int max = Math.max(0, this.f49644c);
        CharSequence charSequence = this.f49642a;
        if (this.f49648g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f49643b, (float) max, this.f49654m);
        }
        int min = Math.min(charSequence.length(), this.f49646e);
        this.f49646e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f49653l && this.f49648g == 1) {
                this.f49647f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f49645d, min, this.f49643b, max);
            obtain.setAlignment(this.f49647f);
            obtain.setIncludePad(this.f49652k);
            obtain.setTextDirection(this.f49653l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f49654m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f49648g);
            float f = this.f49649h;
            if (!(f == 0.0f && this.f49650i == 1.0f)) {
                obtain.setLineSpacing(f, this.f49650i);
            }
            if (this.f49648g > 1) {
                obtain.setHyphenationFrequency(this.f49651j);
            }
            return obtain.build();
        }
        m68792b();
        try {
            return (StaticLayout) ((Constructor) Preconditions.checkNotNull(f49640p)).newInstance(new Object[]{charSequence, Integer.valueOf(this.f49645d), Integer.valueOf(this.f49646e), this.f49643b, Integer.valueOf(max), this.f49647f, Preconditions.checkNotNull(f49641q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f49652k), null, Integer.valueOf(max), Integer.valueOf(this.f49648g)});
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    @NonNull
    /* renamed from: d */
    public StaticLayoutBuilderCompat mo58210d(@NonNull Layout.Alignment alignment) {
        this.f49647f = alignment;
        return this;
    }

    @NonNull
    /* renamed from: e */
    public StaticLayoutBuilderCompat mo58211e(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f49654m = truncateAt;
        return this;
    }

    @NonNull
    /* renamed from: f */
    public StaticLayoutBuilderCompat mo58212f(int i) {
        this.f49651j = i;
        return this;
    }

    @NonNull
    /* renamed from: g */
    public StaticLayoutBuilderCompat mo58213g(boolean z) {
        this.f49652k = z;
        return this;
    }

    /* renamed from: h */
    public StaticLayoutBuilderCompat mo58214h(boolean z) {
        this.f49653l = z;
        return this;
    }

    @NonNull
    /* renamed from: i */
    public StaticLayoutBuilderCompat mo58215i(float f, float f2) {
        this.f49649h = f;
        this.f49650i = f2;
        return this;
    }

    @NonNull
    /* renamed from: j */
    public StaticLayoutBuilderCompat mo58216j(@IntRange(from = 0) int i) {
        this.f49648g = i;
        return this;
    }
}
