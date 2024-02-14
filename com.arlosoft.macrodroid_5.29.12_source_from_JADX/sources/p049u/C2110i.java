package p049u;

import android.graphics.PointF;
import java.util.List;
import p012b0.C1397a;
import p046r.C2068a;
import p046r.C2086m;

/* renamed from: u.i */
/* compiled from: AnimatableSplitDimensionPathValue */
public class C2110i implements C2114m<PointF, PointF> {

    /* renamed from: a */
    private final C2103b f6524a;

    /* renamed from: b */
    private final C2103b f6525b;

    public C2110i(C2103b bVar, C2103b bVar2) {
        this.f6524a = bVar;
        this.f6525b = bVar2;
    }

    /* renamed from: a */
    public C2068a<PointF, PointF> mo24228a() {
        return new C2086m(this.f6524a.mo24228a(), this.f6525b.mo24228a());
    }

    /* renamed from: b */
    public List<C1397a<PointF>> mo24229b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: h */
    public boolean mo24230h() {
        return this.f6524a.mo24230h() && this.f6525b.mo24230h();
    }
}
