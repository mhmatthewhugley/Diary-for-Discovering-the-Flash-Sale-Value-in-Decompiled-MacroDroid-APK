package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlinx.coroutines.C15423h2;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/internal/r;", "", "Lkotlinx/coroutines/h2;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lkotlinx/coroutines/h2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.r */
/* compiled from: MainDispatchers.kt */
public final class C15463r {

    /* renamed from: a */
    public static final C15463r f64689a;

    /* renamed from: b */
    private static final boolean f64690b = C15431b0.m94343e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C15423h2 f64691c;

    static {
        C15463r rVar = new C15463r();
        f64689a = rVar;
        f64691c = rVar.m94462a();
    }

    private C15463r() {
    }

    /* renamed from: a */
    private final C15423h2 m94462a() {
        List<MainDispatcherFactory> list;
        T t;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        try {
            if (f64690b) {
                list = C15445h.f64660a.mo74781c();
            } else {
                list = C15132p.m93480D(C15125n.m93468c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) t;
            C15423h2 e = mainDispatcherFactory == null ? null : C15464s.m94467e(mainDispatcherFactory, list);
            if (e == null) {
                return C15464s.m94464b((Throwable) null, (String) null, 3, (Object) null);
            }
            return e;
        } catch (Throwable th) {
            return C15464s.m94464b(th, (String) null, 2, (Object) null);
        }
    }
}
