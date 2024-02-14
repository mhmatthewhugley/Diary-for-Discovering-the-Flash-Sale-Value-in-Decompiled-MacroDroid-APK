package p049u;

import android.graphics.PointF;
import java.util.List;
import p012b0.C1397a;
import p046r.C2068a;
import p046r.C2082i;
import p046r.C2083j;

/* renamed from: u.e */
/* compiled from: AnimatablePathValue */
public class C2106e implements C2114m<PointF, PointF> {

    /* renamed from: a */
    private final List<C1397a<PointF>> f6523a;

    public C2106e(List<C1397a<PointF>> list) {
        this.f6523a = list;
    }

    /* renamed from: a */
    public C2068a<PointF, PointF> mo24228a() {
        if (this.f6523a.get(0).mo16815h()) {
            return new C2083j(this.f6523a);
        }
        return new C2082i(this.f6523a);
    }

    /* renamed from: b */
    public List<C1397a<PointF>> mo24229b() {
        return this.f6523a;
    }

    /* renamed from: h */
    public boolean mo24230h() {
        return this.f6523a.size() == 1 && this.f6523a.get(0).mo16815h();
    }
}
