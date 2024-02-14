package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.core.view.ViewCompat;

/* renamed from: com.facebook.shimmer.a */
/* compiled from: Shimmer */
public class C6712a {

    /* renamed from: a */
    final float[] f15712a = new float[4];

    /* renamed from: b */
    final int[] f15713b = new int[4];

    /* renamed from: c */
    final RectF f15714c = new RectF();

    /* renamed from: d */
    int f15715d = 0;
    @ColorInt

    /* renamed from: e */
    int f15716e = -1;
    @ColorInt

    /* renamed from: f */
    int f15717f = 1291845631;

    /* renamed from: g */
    int f15718g = 0;

    /* renamed from: h */
    int f15719h = 0;

    /* renamed from: i */
    int f15720i = 0;

    /* renamed from: j */
    float f15721j = 1.0f;

    /* renamed from: k */
    float f15722k = 1.0f;

    /* renamed from: l */
    float f15723l = 0.0f;

    /* renamed from: m */
    float f15724m = 0.5f;

    /* renamed from: n */
    float f15725n = 20.0f;

    /* renamed from: o */
    boolean f15726o = true;

    /* renamed from: p */
    boolean f15727p = true;

    /* renamed from: q */
    boolean f15728q = true;

    /* renamed from: r */
    int f15729r = -1;

    /* renamed from: s */
    int f15730s = 1;

    /* renamed from: t */
    long f15731t = 1000;

    /* renamed from: u */
    long f15732u;

    /* renamed from: com.facebook.shimmer.a$a */
    /* compiled from: Shimmer */
    public static class C6713a extends C6714b<C6713a> {
        public C6713a() {
            this.f15733a.f15728q = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public C6713a mo33134d() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.a$b */
    /* compiled from: Shimmer */
    public static abstract class C6714b<T extends C6714b<T>> {

        /* renamed from: a */
        final C6712a f15733a = new C6712a();

        /* renamed from: b */
        private static float m25430b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: a */
        public C6712a mo33136a() {
            this.f15733a.mo33131b();
            this.f15733a.mo33132c();
            return this.f15733a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public T mo33137c(TypedArray typedArray) {
            int i = R$styleable.ShimmerFrameLayout_shimmer_clip_to_children;
            if (typedArray.hasValue(i)) {
                mo33140g(typedArray.getBoolean(i, this.f15733a.f15726o));
            }
            int i2 = R$styleable.ShimmerFrameLayout_shimmer_auto_start;
            if (typedArray.hasValue(i2)) {
                mo33138e(typedArray.getBoolean(i2, this.f15733a.f15727p));
            }
            int i3 = R$styleable.ShimmerFrameLayout_shimmer_base_alpha;
            if (typedArray.hasValue(i3)) {
                mo33139f(typedArray.getFloat(i3, 0.3f));
            }
            int i4 = R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha;
            if (typedArray.hasValue(i4)) {
                mo33147n(typedArray.getFloat(i4, 1.0f));
            }
            int i5 = R$styleable.ShimmerFrameLayout_shimmer_duration;
            if (typedArray.hasValue(i5)) {
                mo33143j((long) typedArray.getInt(i5, (int) this.f15733a.f15731t));
            }
            int i6 = R$styleable.ShimmerFrameLayout_shimmer_repeat_count;
            if (typedArray.hasValue(i6)) {
                mo33149p(typedArray.getInt(i6, this.f15733a.f15729r));
            }
            int i7 = R$styleable.ShimmerFrameLayout_shimmer_repeat_delay;
            if (typedArray.hasValue(i7)) {
                mo33150q((long) typedArray.getInt(i7, (int) this.f15733a.f15732u));
            }
            int i8 = R$styleable.ShimmerFrameLayout_shimmer_repeat_mode;
            if (typedArray.hasValue(i8)) {
                mo33151r(typedArray.getInt(i8, this.f15733a.f15730s));
            }
            int i9 = R$styleable.ShimmerFrameLayout_shimmer_direction;
            if (typedArray.hasValue(i9)) {
                int i10 = typedArray.getInt(i9, this.f15733a.f15715d);
                if (i10 == 1) {
                    mo33141h(1);
                } else if (i10 == 2) {
                    mo33141h(2);
                } else if (i10 != 3) {
                    mo33141h(0);
                } else {
                    mo33141h(3);
                }
            }
            int i11 = R$styleable.ShimmerFrameLayout_shimmer_shape;
            if (typedArray.hasValue(i11)) {
                if (typedArray.getInt(i11, this.f15733a.f15718g) != 1) {
                    mo33152s(0);
                } else {
                    mo33152s(1);
                }
            }
            int i12 = R$styleable.ShimmerFrameLayout_shimmer_dropoff;
            if (typedArray.hasValue(i12)) {
                mo33142i(typedArray.getFloat(i12, this.f15733a.f15724m));
            }
            int i13 = R$styleable.ShimmerFrameLayout_shimmer_fixed_width;
            if (typedArray.hasValue(i13)) {
                mo33145l(typedArray.getDimensionPixelSize(i13, this.f15733a.f15719h));
            }
            int i14 = R$styleable.ShimmerFrameLayout_shimmer_fixed_height;
            if (typedArray.hasValue(i14)) {
                mo33144k(typedArray.getDimensionPixelSize(i14, this.f15733a.f15720i));
            }
            int i15 = R$styleable.ShimmerFrameLayout_shimmer_intensity;
            if (typedArray.hasValue(i15)) {
                mo33148o(typedArray.getFloat(i15, this.f15733a.f15723l));
            }
            int i16 = R$styleable.ShimmerFrameLayout_shimmer_width_ratio;
            if (typedArray.hasValue(i16)) {
                mo33154u(typedArray.getFloat(i16, this.f15733a.f15721j));
            }
            int i17 = R$styleable.ShimmerFrameLayout_shimmer_height_ratio;
            if (typedArray.hasValue(i17)) {
                mo33146m(typedArray.getFloat(i17, this.f15733a.f15722k));
            }
            int i18 = R$styleable.ShimmerFrameLayout_shimmer_tilt;
            if (typedArray.hasValue(i18)) {
                mo33153t(typedArray.getFloat(i18, this.f15733a.f15725n));
            }
            return mo33134d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract T mo33134d();

        /* renamed from: e */
        public T mo33138e(boolean z) {
            this.f15733a.f15727p = z;
            return mo33134d();
        }

        /* renamed from: f */
        public T mo33139f(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
            C6712a aVar = this.f15733a;
            aVar.f15717f = (((int) (m25430b(0.0f, 1.0f, f) * 255.0f)) << 24) | (aVar.f15717f & ViewCompat.MEASURED_SIZE_MASK);
            return mo33134d();
        }

        /* renamed from: g */
        public T mo33140g(boolean z) {
            this.f15733a.f15726o = z;
            return mo33134d();
        }

        /* renamed from: h */
        public T mo33141h(int i) {
            this.f15733a.f15715d = i;
            return mo33134d();
        }

        /* renamed from: i */
        public T mo33142i(float f) {
            if (f >= 0.0f) {
                this.f15733a.f15724m = f;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        /* renamed from: j */
        public T mo33143j(long j) {
            if (j >= 0) {
                this.f15733a.f15731t = j;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        /* renamed from: k */
        public T mo33144k(@C0144Px int i) {
            if (i >= 0) {
                this.f15733a.f15720i = i;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        /* renamed from: l */
        public T mo33145l(@C0144Px int i) {
            if (i >= 0) {
                this.f15733a.f15719h = i;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        /* renamed from: m */
        public T mo33146m(float f) {
            if (f >= 0.0f) {
                this.f15733a.f15722k = f;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        /* renamed from: n */
        public T mo33147n(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
            C6712a aVar = this.f15733a;
            aVar.f15716e = (((int) (m25430b(0.0f, 1.0f, f) * 255.0f)) << 24) | (aVar.f15716e & ViewCompat.MEASURED_SIZE_MASK);
            return mo33134d();
        }

        /* renamed from: o */
        public T mo33148o(float f) {
            if (f >= 0.0f) {
                this.f15733a.f15723l = f;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* renamed from: p */
        public T mo33149p(int i) {
            this.f15733a.f15729r = i;
            return mo33134d();
        }

        /* renamed from: q */
        public T mo33150q(long j) {
            if (j >= 0) {
                this.f15733a.f15732u = j;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        /* renamed from: r */
        public T mo33151r(int i) {
            this.f15733a.f15730s = i;
            return mo33134d();
        }

        /* renamed from: s */
        public T mo33152s(int i) {
            this.f15733a.f15718g = i;
            return mo33134d();
        }

        /* renamed from: t */
        public T mo33153t(float f) {
            this.f15733a.f15725n = f;
            return mo33134d();
        }

        /* renamed from: u */
        public T mo33154u(float f) {
            if (f >= 0.0f) {
                this.f15733a.f15721j = f;
                return mo33134d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* renamed from: com.facebook.shimmer.a$c */
    /* compiled from: Shimmer */
    public static class C6715c extends C6714b<C6715c> {
        public C6715c() {
            this.f15733a.f15728q = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public C6715c mo33137c(TypedArray typedArray) {
            super.mo33137c(typedArray);
            int i = R$styleable.ShimmerFrameLayout_shimmer_base_color;
            if (typedArray.hasValue(i)) {
                mo33157x(typedArray.getColor(i, this.f15733a.f15717f));
            }
            int i2 = R$styleable.ShimmerFrameLayout_shimmer_highlight_color;
            if (typedArray.hasValue(i2)) {
                mo33158y(typedArray.getColor(i2, this.f15733a.f15716e));
            }
            return mo33134d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public C6715c mo33134d() {
            return this;
        }

        /* renamed from: x */
        public C6715c mo33157x(@ColorInt int i) {
            C6712a aVar = this.f15733a;
            aVar.f15717f = (i & ViewCompat.MEASURED_SIZE_MASK) | (aVar.f15717f & ViewCompat.MEASURED_STATE_MASK);
            return mo33134d();
        }

        /* renamed from: y */
        public C6715c mo33158y(@ColorInt int i) {
            this.f15733a.f15716e = i;
            return mo33134d();
        }
    }

    C6712a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo33130a(int i) {
        int i2 = this.f15720i;
        return i2 > 0 ? i2 : Math.round(this.f15722k * ((float) i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33131b() {
        if (this.f15718g != 1) {
            int[] iArr = this.f15713b;
            int i = this.f15717f;
            iArr[0] = i;
            int i2 = this.f15716e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f15713b;
        int i3 = this.f15716e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f15717f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33132c() {
        if (this.f15718g != 1) {
            this.f15712a[0] = Math.max(((1.0f - this.f15723l) - this.f15724m) / 2.0f, 0.0f);
            this.f15712a[1] = Math.max(((1.0f - this.f15723l) - 0.001f) / 2.0f, 0.0f);
            this.f15712a[2] = Math.min(((this.f15723l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f15712a[3] = Math.min(((this.f15723l + 1.0f) + this.f15724m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f15712a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f15723l, 1.0f);
        this.f15712a[2] = Math.min(this.f15723l + this.f15724m, 1.0f);
        this.f15712a[3] = 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo33133d(int i) {
        int i2 = this.f15719h;
        return i2 > 0 ? i2 : Math.round(this.f15721j * ((float) i));
    }
}
