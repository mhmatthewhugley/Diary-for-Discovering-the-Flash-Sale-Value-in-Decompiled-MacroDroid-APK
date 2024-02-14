package p045q;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0010h;

/* renamed from: q.b */
/* compiled from: CompoundTrimPathContent */
public class C2048b {

    /* renamed from: a */
    private List<C2067s> f6304a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24129a(C2067s sVar) {
        this.f6304a.add(sVar);
    }

    /* renamed from: b */
    public void mo24130b(Path path) {
        for (int size = this.f6304a.size() - 1; size >= 0; size--) {
            C0010h.m72b(path, this.f6304a.get(size));
        }
    }
}
