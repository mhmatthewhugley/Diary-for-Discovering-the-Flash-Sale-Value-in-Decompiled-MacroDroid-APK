package p366q6;

import com.koushikdutta.async.C11694b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p384s6.C16502a;

/* renamed from: q6.a */
/* compiled from: AsyncHttpClient */
public class C16217a {

    /* renamed from: a */
    final List<C16218b> f66505a = new CopyOnWriteArrayList();

    /* renamed from: b */
    C16502a f66506b;

    /* renamed from: c */
    C16221e f66507c;

    /* renamed from: d */
    C16222f f66508d;

    /* renamed from: e */
    C11694b f66509e;

    public C16217a(C11694b bVar) {
        this.f66509e = bVar;
        C16221e eVar = new C16221e(this);
        this.f66507c = eVar;
        mo78740e(eVar);
        C16502a aVar = new C16502a(this);
        this.f66506b = aVar;
        mo78740e(aVar);
        C16222f fVar = new C16222f();
        this.f66508d = fVar;
        mo78740e(fVar);
        this.f66506b.mo78741b(new C16223g());
    }

    /* renamed from: a */
    public Collection<C16218b> mo78736a() {
        return this.f66505a;
    }

    /* renamed from: b */
    public C16502a mo78737b() {
        return this.f66506b;
    }

    /* renamed from: c */
    public C11694b mo78738c() {
        return this.f66509e;
    }

    /* renamed from: d */
    public C16221e mo78739d() {
        return this.f66507c;
    }

    /* renamed from: e */
    public void mo78740e(C16218b bVar) {
        this.f66505a.add(0, bVar);
    }
}
