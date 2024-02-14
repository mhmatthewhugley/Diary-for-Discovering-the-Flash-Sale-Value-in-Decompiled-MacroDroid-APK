package p050v;

import android.graphics.PointF;
import com.airbnb.lottie.C1472f;
import p045q.C2049c;
import p045q.C2052f;
import p049u.C2107f;
import p049u.C2114m;
import p051w.C2140a;

/* renamed from: v.a */
/* compiled from: CircleShape */
public class C2116a implements C2117b {

    /* renamed from: a */
    private final String f6540a;

    /* renamed from: b */
    private final C2114m<PointF, PointF> f6541b;

    /* renamed from: c */
    private final C2107f f6542c;

    /* renamed from: d */
    private final boolean f6543d;

    /* renamed from: e */
    private final boolean f6544e;

    public C2116a(String str, C2114m<PointF, PointF> mVar, C2107f fVar, boolean z, boolean z2) {
        this.f6540a = str;
        this.f6541b = mVar;
        this.f6542c = fVar;
        this.f6543d = z;
        this.f6544e = z2;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2052f(fVar, aVar, this);
    }

    /* renamed from: b */
    public String mo24244b() {
        return this.f6540a;
    }

    /* renamed from: c */
    public C2114m<PointF, PointF> mo24245c() {
        return this.f6541b;
    }

    /* renamed from: d */
    public C2107f mo24246d() {
        return this.f6542c;
    }

    /* renamed from: e */
    public boolean mo24247e() {
        return this.f6544e;
    }

    /* renamed from: f */
    public boolean mo24248f() {
        return this.f6543d;
    }
}
