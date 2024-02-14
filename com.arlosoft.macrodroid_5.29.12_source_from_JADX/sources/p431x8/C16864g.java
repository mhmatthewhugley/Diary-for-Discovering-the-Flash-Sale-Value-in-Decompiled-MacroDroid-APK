package p431x8;

import java.util.ArrayList;
import java.util.List;

/* renamed from: x8.g */
/* compiled from: PendingPost */
final class C16864g {

    /* renamed from: d */
    private static final List<C16864g> f68097d = new ArrayList();

    /* renamed from: a */
    Object f68098a;

    /* renamed from: b */
    C16869l f68099b;

    /* renamed from: c */
    C16864g f68100c;

    private C16864g(Object obj, C16869l lVar) {
        this.f68098a = obj;
        this.f68099b = lVar;
    }

    /* renamed from: a */
    static C16864g m99914a(C16869l lVar, Object obj) {
        List<C16864g> list = f68097d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new C16864g(obj, lVar);
            }
            C16864g remove = list.remove(size - 1);
            remove.f68098a = obj;
            remove.f68099b = lVar;
            remove.f68100c = null;
            return remove;
        }
    }

    /* renamed from: b */
    static void m99915b(C16864g gVar) {
        gVar.f68098a = null;
        gVar.f68099b = null;
        gVar.f68100c = null;
        List<C16864g> list = f68097d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(gVar);
            }
        }
    }
}
