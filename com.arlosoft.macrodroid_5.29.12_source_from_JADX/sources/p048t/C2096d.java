package p048t;

import androidx.annotation.RestrictTo;
import java.util.List;
import p050v.C2132n;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: t.d */
/* compiled from: FontCharacter */
public class C2096d {

    /* renamed from: a */
    private final List<C2132n> f6506a;

    /* renamed from: b */
    private final char f6507b;

    /* renamed from: c */
    private final double f6508c;

    /* renamed from: d */
    private final double f6509d;

    /* renamed from: e */
    private final String f6510e;

    /* renamed from: f */
    private final String f6511f;

    public C2096d(List<C2132n> list, char c, double d, double d2, String str, String str2) {
        this.f6506a = list;
        this.f6507b = c;
        this.f6508c = d;
        this.f6509d = d2;
        this.f6510e = str;
        this.f6511f = str2;
    }

    /* renamed from: c */
    public static int m8651c(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C2132n> mo24210a() {
        return this.f6506a;
    }

    /* renamed from: b */
    public double mo24211b() {
        return this.f6509d;
    }

    public int hashCode() {
        return m8651c(this.f6507b, this.f6511f, this.f6510e);
    }
}
