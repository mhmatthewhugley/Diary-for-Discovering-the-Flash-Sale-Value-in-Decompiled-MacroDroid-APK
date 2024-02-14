package p048t;

/* renamed from: t.h */
/* compiled from: Marker */
public class C2100h {

    /* renamed from: d */
    private static String f6517d = "\r";

    /* renamed from: a */
    private final String f6518a;

    /* renamed from: b */
    public final float f6519b;

    /* renamed from: c */
    public final float f6520c;

    public C2100h(String str, float f, float f2) {
        this.f6518a = str;
        this.f6520c = f2;
        this.f6519b = f;
    }

    /* renamed from: a */
    public boolean mo24223a(String str) {
        if (this.f6518a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f6518a.endsWith(f6517d)) {
            String str2 = this.f6518a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
