package p382rd;

/* renamed from: rd.d */
/* compiled from: ParseError */
public class C16411d {

    /* renamed from: a */
    private int f67033a;

    /* renamed from: b */
    private String f67034b;

    /* renamed from: c */
    private String f67035c;

    C16411d(C16382a aVar, String str) {
        this.f67033a = aVar.mo79077Q();
        this.f67034b = aVar.mo79103w();
        this.f67035c = str;
    }

    public String toString() {
        return "<" + this.f67034b + ">: " + this.f67035c;
    }

    C16411d(C16382a aVar, String str, Object... objArr) {
        this.f67033a = aVar.mo79077Q();
        this.f67034b = aVar.mo79103w();
        this.f67035c = String.format(str, objArr);
    }
}
