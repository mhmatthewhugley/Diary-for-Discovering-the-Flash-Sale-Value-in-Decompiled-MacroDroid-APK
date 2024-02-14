package p050v;

import android.graphics.PointF;
import com.airbnb.lottie.C1472f;
import p045q.C2049c;
import p045q.C2063o;
import p049u.C2103b;
import p049u.C2114m;
import p051w.C2140a;

/* renamed from: v.j */
/* compiled from: RectangleShape */
public class C2128j implements C2117b {

    /* renamed from: a */
    private final String f6604a;

    /* renamed from: b */
    private final C2114m<PointF, PointF> f6605b;

    /* renamed from: c */
    private final C2114m<PointF, PointF> f6606c;

    /* renamed from: d */
    private final C2103b f6607d;

    /* renamed from: e */
    private final boolean f6608e;

    public C2128j(String str, C2114m<PointF, PointF> mVar, C2114m<PointF, PointF> mVar2, C2103b bVar, boolean z) {
        this.f6604a = str;
        this.f6605b = mVar;
        this.f6606c = mVar2;
        this.f6607d = bVar;
        this.f6608e = z;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2063o(fVar, aVar, this);
    }

    /* renamed from: b */
    public C2103b mo24292b() {
        return this.f6607d;
    }

    /* renamed from: c */
    public String mo24293c() {
        return this.f6604a;
    }

    /* renamed from: d */
    public C2114m<PointF, PointF> mo24294d() {
        return this.f6605b;
    }

    /* renamed from: e */
    public C2114m<PointF, PointF> mo24295e() {
        return this.f6606c;
    }

    /* renamed from: f */
    public boolean mo24296f() {
        return this.f6608e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f6605b + ", size=" + this.f6606c + '}';
    }
}
