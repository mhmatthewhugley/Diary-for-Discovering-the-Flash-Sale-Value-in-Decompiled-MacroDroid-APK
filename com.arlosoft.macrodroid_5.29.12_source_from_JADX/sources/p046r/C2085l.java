package p046r;

import android.graphics.Path;
import java.util.List;
import p001a0.C0009g;
import p012b0.C1397a;
import p050v.C2130l;

/* renamed from: r.l */
/* compiled from: ShapeKeyframeAnimation */
public class C2085l extends C2068a<C2130l, Path> {

    /* renamed from: i */
    private final C2130l f6450i = new C2130l();

    /* renamed from: j */
    private final Path f6451j = new Path();

    public C2085l(List<C1397a<C2130l>> list) {
        super(list);
    }

    /* renamed from: p */
    public Path mo24149i(C1397a<C2130l> aVar, float f) {
        this.f6450i.mo24305c((C2130l) aVar.f715b, (C2130l) aVar.f716c, f);
        C0009g.m66i(this.f6450i, this.f6451j);
        return this.f6451j;
    }
}
