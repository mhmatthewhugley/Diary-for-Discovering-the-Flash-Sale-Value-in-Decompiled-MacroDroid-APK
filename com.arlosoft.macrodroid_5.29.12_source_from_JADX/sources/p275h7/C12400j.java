package p275h7;

import android.util.DisplayMetrics;
import java.io.File;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12246f;
import p267g7.C12312a;
import p267g7.C12313b;
import p414v9.C16735i;

/* renamed from: h7.j */
/* compiled from: ScaledImageDimensions */
public final class C12400j extends C12405m<C12383b> {

    /* renamed from: a */
    private final C12246f f59113a;

    /* renamed from: b */
    private final C12241a f59114b;

    /* renamed from: c */
    private C12242b f59115c;

    public C12400j(C12246f fVar, C12241a aVar) {
        this.f59113a = fVar;
        this.f59114b = aVar;
    }

    /* renamed from: a */
    private C12383b m83245a(C12312a aVar, File file) {
        int a = aVar.mo68635a();
        C12383b q = C12393f.m83208q(file);
        int max = Math.max(q.getWidth(), q.getHeight());
        if (max < a) {
            return q;
        }
        float f = ((float) a) / ((float) max);
        return new C12383b((int) (((float) q.getWidth()) * f), (int) (((float) q.getHeight()) * f));
    }

    /* renamed from: b */
    private C12383b m83246b() {
        File c = this.f59115c.mo68545c();
        this.f59114b.mo68531g();
        if (this.f59114b.mo68531g() instanceof C12312a) {
            return m83245a((C12312a) this.f59114b.mo68531g(), c);
        }
        if (this.f59114b.mo68531g() instanceof C12313b) {
            return m83247c();
        }
        C12383b c2 = m83247c();
        return new C12383b(c2.getWidth() / 8, c2.getHeight() / 8);
    }

    /* renamed from: c */
    private C12383b m83247c() {
        DisplayMetrics displayMetrics = this.f59113a.mo68561c().getResources().getDisplayMetrics();
        return new C12383b(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: d */
    public C16735i<C12383b> mo68750d() {
        return C16735i.m99342F(m83246b());
    }

    /* renamed from: e */
    public C12400j mo68751e(C12242b bVar) {
        this.f59115c = bVar;
        return this;
    }
}
