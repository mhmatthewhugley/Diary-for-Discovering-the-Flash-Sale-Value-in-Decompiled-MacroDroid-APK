package p046r;

import java.util.List;
import p012b0.C1397a;
import p050v.C2118c;

/* renamed from: r.d */
/* compiled from: GradientColorKeyframeAnimation */
public class C2077d extends C2079f<C2118c> {

    /* renamed from: i */
    private final C2118c f6438i;

    public C2077d(List<C1397a<C2118c>> list) {
        super(list);
        int i = 0;
        C2118c cVar = (C2118c) list.get(0).f715b;
        i = cVar != null ? cVar.mo24251c() : i;
        this.f6438i = new C2118c(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C2118c mo24149i(C1397a<C2118c> aVar, float f) {
        this.f6438i.mo24252d((C2118c) aVar.f715b, (C2118c) aVar.f716c, f);
        return this.f6438i;
    }
}
