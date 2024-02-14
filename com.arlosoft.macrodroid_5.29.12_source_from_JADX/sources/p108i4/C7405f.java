package p108i4;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p090f5.C7315j;
import p108i4.C7403e;

/* renamed from: i4.f */
/* compiled from: DataRewinderRegistry */
public class C7405f {

    /* renamed from: b */
    private static final C7403e.C7404a<?> f18104b = new C7406a();

    /* renamed from: a */
    private final Map<Class<?>, C7403e.C7404a<?>> f18105a = new HashMap();

    /* renamed from: i4.f$a */
    /* compiled from: DataRewinderRegistry */
    class C7406a implements C7403e.C7404a<Object> {
        C7406a() {
        }

        @NonNull
        /* renamed from: a */
        public Class<Object> mo37448a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @NonNull
        /* renamed from: b */
        public C7403e<Object> mo37449b(@NonNull Object obj) {
            return new C7407b(obj);
        }
    }

    /* renamed from: i4.f$b */
    /* compiled from: DataRewinderRegistry */
    private static final class C7407b implements C7403e<Object> {

        /* renamed from: a */
        private final Object f18106a;

        C7407b(@NonNull Object obj) {
            this.f18106a = obj;
        }

        @NonNull
        /* renamed from: a */
        public Object mo37446a() {
            return this.f18106a;
        }

        /* renamed from: b */
        public void mo37447b() {
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <T> C7403e<T> mo37450a(@NonNull T t) {
        C7403e.C7404a<?> aVar;
        C7315j.m30204d(t);
        aVar = this.f18105a.get(t.getClass());
        if (aVar == null) {
            Iterator<C7403e.C7404a<?>> it = this.f18105a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7403e.C7404a<?> next = it.next();
                if (next.mo37448a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f18104b;
        }
        return aVar.mo37449b(t);
    }

    /* renamed from: b */
    public synchronized void mo37451b(@NonNull C7403e.C7404a<?> aVar) {
        this.f18105a.put(aVar.mo37448a(), aVar);
    }
}
