package p050v;

import android.graphics.PointF;
import com.airbnb.lottie.C1472f;
import p045q.C2049c;
import p045q.C2061n;
import p049u.C2103b;
import p049u.C2114m;
import p051w.C2140a;

/* renamed from: v.i */
/* compiled from: PolystarShape */
public class C2126i implements C2117b {

    /* renamed from: a */
    private final String f6591a;

    /* renamed from: b */
    private final C2127a f6592b;

    /* renamed from: c */
    private final C2103b f6593c;

    /* renamed from: d */
    private final C2114m<PointF, PointF> f6594d;

    /* renamed from: e */
    private final C2103b f6595e;

    /* renamed from: f */
    private final C2103b f6596f;

    /* renamed from: g */
    private final C2103b f6597g;

    /* renamed from: h */
    private final C2103b f6598h;

    /* renamed from: i */
    private final C2103b f6599i;

    /* renamed from: j */
    private final boolean f6600j;

    /* renamed from: v.i$a */
    /* compiled from: PolystarShape */
    public enum C2127a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private C2127a(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static C2127a m8772b(int i) {
            for (C2127a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C2126i(String str, C2127a aVar, C2103b bVar, C2114m<PointF, PointF> mVar, C2103b bVar2, C2103b bVar3, C2103b bVar4, C2103b bVar5, C2103b bVar6, boolean z) {
        this.f6591a = str;
        this.f6592b = aVar;
        this.f6593c = bVar;
        this.f6594d = mVar;
        this.f6595e = bVar2;
        this.f6596f = bVar3;
        this.f6597g = bVar4;
        this.f6598h = bVar5;
        this.f6599i = bVar6;
        this.f6600j = z;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2061n(fVar, aVar, this);
    }

    /* renamed from: b */
    public C2103b mo24282b() {
        return this.f6596f;
    }

    /* renamed from: c */
    public C2103b mo24283c() {
        return this.f6598h;
    }

    /* renamed from: d */
    public String mo24284d() {
        return this.f6591a;
    }

    /* renamed from: e */
    public C2103b mo24285e() {
        return this.f6597g;
    }

    /* renamed from: f */
    public C2103b mo24286f() {
        return this.f6599i;
    }

    /* renamed from: g */
    public C2103b mo24287g() {
        return this.f6593c;
    }

    /* renamed from: h */
    public C2114m<PointF, PointF> mo24288h() {
        return this.f6594d;
    }

    /* renamed from: i */
    public C2103b mo24289i() {
        return this.f6595e;
    }

    /* renamed from: j */
    public C2127a mo24290j() {
        return this.f6592b;
    }

    /* renamed from: k */
    public boolean mo24291k() {
        return this.f6600j;
    }
}
