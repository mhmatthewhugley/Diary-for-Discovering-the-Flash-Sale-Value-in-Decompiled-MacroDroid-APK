package p048t;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: t.b */
/* compiled from: DocumentData */
public class C2093b {

    /* renamed from: a */
    public final String f6487a;

    /* renamed from: b */
    public final String f6488b;

    /* renamed from: c */
    public final float f6489c;

    /* renamed from: d */
    public final C2094a f6490d;

    /* renamed from: e */
    public final int f6491e;

    /* renamed from: f */
    public final float f6492f;

    /* renamed from: g */
    public final float f6493g;
    @ColorInt

    /* renamed from: h */
    public final int f6494h;
    @ColorInt

    /* renamed from: i */
    public final int f6495i;

    /* renamed from: j */
    public final float f6496j;

    /* renamed from: k */
    public final boolean f6497k;

    /* renamed from: t.b$a */
    /* compiled from: DocumentData */
    public enum C2094a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C2093b(String str, String str2, float f, C2094a aVar, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z) {
        this.f6487a = str;
        this.f6488b = str2;
        this.f6489c = f;
        this.f6490d = aVar;
        this.f6491e = i;
        this.f6492f = f2;
        this.f6493g = f3;
        this.f6494h = i2;
        this.f6495i = i3;
        this.f6496j = f4;
        this.f6497k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f6487a.hashCode() * 31) + this.f6488b.hashCode()) * 31)) + this.f6489c)) * 31) + this.f6490d.ordinal()) * 31) + this.f6491e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f6492f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f6494h;
    }
}
