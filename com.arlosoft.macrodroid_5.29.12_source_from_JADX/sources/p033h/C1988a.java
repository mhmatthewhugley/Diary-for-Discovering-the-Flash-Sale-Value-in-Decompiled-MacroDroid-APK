package p033h;

import androidx.annotation.Nullable;
import p000a.C0002c;
import p011b.C1396a;
import p031f.C1980a;
import p034i.C1990b;

/* renamed from: h.a */
/* compiled from: ParallaxScrollListener */
public class C1988a implements C1980a {

    /* renamed from: a */
    private C1396a f6069a;

    public C1988a(C1396a aVar) {
        this.f6069a = aVar;
    }

    @Nullable
    /* renamed from: b */
    private C0002c m8294b(int i) {
        if (i < this.f6069a.mo16804c()) {
            return this.f6069a.getItem(i + 1);
        }
        return null;
    }

    /* renamed from: a */
    public void mo86a(int i, float f) {
        if (i != this.f6069a.mo16807g()) {
            C0002c b = this.f6069a.getItem(i);
            C0002c b2 = m8294b(i);
            boolean z = b instanceof C1990b;
            if (z) {
                b.setOffset(f);
            }
            if (b2 != null && z) {
                b2.setOffset(f - 1.0f);
            }
        }
    }
}
