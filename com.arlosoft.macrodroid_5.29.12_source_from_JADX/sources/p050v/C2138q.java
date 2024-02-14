package p050v;

import com.airbnb.lottie.C1472f;
import p045q.C2049c;
import p045q.C2067s;
import p049u.C2103b;
import p051w.C2140a;

/* renamed from: v.q */
/* compiled from: ShapeTrimPath */
public class C2138q implements C2117b {

    /* renamed from: a */
    private final String f6650a;

    /* renamed from: b */
    private final C2139a f6651b;

    /* renamed from: c */
    private final C2103b f6652c;

    /* renamed from: d */
    private final C2103b f6653d;

    /* renamed from: e */
    private final C2103b f6654e;

    /* renamed from: f */
    private final boolean f6655f;

    /* renamed from: v.q$a */
    /* compiled from: ShapeTrimPath */
    public enum C2139a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: b */
        public static C2139a m8824b(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public C2138q(String str, C2139a aVar, C2103b bVar, C2103b bVar2, C2103b bVar3, boolean z) {
        this.f6650a = str;
        this.f6651b = aVar;
        this.f6652c = bVar;
        this.f6653d = bVar2;
        this.f6654e = bVar3;
        this.f6655f = z;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2067s(aVar, this);
    }

    /* renamed from: b */
    public C2103b mo24334b() {
        return this.f6653d;
    }

    /* renamed from: c */
    public String mo24335c() {
        return this.f6650a;
    }

    /* renamed from: d */
    public C2103b mo24336d() {
        return this.f6654e;
    }

    /* renamed from: e */
    public C2103b mo24337e() {
        return this.f6652c;
    }

    /* renamed from: f */
    public C2139a mo24338f() {
        return this.f6651b;
    }

    /* renamed from: g */
    public boolean mo24339g() {
        return this.f6655f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f6652c + ", end: " + this.f6653d + ", offset: " + this.f6654e + "}";
    }
}
