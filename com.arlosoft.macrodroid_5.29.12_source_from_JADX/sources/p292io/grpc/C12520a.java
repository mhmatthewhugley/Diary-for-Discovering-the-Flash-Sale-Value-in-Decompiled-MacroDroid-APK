package p292io.grpc;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: io.grpc.a */
/* compiled from: Attributes */
public final class C12520a {

    /* renamed from: b */
    public static final C12520a f59384b = new C12520a(Collections.emptyMap());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C12523c<?>, Object> f59385a;

    /* renamed from: io.grpc.a$b */
    /* compiled from: Attributes */
    public static final class C12522b {

        /* renamed from: a */
        private C12520a f59386a;

        /* renamed from: b */
        private Map<C12523c<?>, Object> f59387b;

        /* renamed from: b */
        private Map<C12523c<?>, Object> m83643b(int i) {
            if (this.f59387b == null) {
                this.f59387b = new IdentityHashMap(i);
            }
            return this.f59387b;
        }

        /* renamed from: a */
        public C12520a mo69031a() {
            if (this.f59387b != null) {
                for (Map.Entry entry : this.f59386a.f59385a.entrySet()) {
                    if (!this.f59387b.containsKey(entry.getKey())) {
                        this.f59387b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f59386a = new C12520a(this.f59387b);
                this.f59387b = null;
            }
            return this.f59386a;
        }

        /* renamed from: c */
        public <T> C12522b mo69032c(C12523c<T> cVar) {
            if (this.f59386a.f59385a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f59386a.f59385a);
                identityHashMap.remove(cVar);
                this.f59386a = new C12520a(identityHashMap);
            }
            Map<C12523c<?>, Object> map = this.f59387b;
            if (map != null) {
                map.remove(cVar);
            }
            return this;
        }

        /* renamed from: d */
        public <T> C12522b mo69033d(C12523c<T> cVar, T t) {
            m83643b(1).put(cVar, t);
            return this;
        }

        private C12522b(C12520a aVar) {
            this.f59386a = aVar;
        }
    }

    /* renamed from: io.grpc.a$c */
    /* compiled from: Attributes */
    public static final class C12523c<T> {

        /* renamed from: a */
        private final String f59388a;

        private C12523c(String str) {
            this.f59388a = str;
        }

        /* renamed from: a */
        public static <T> C12523c<T> m83647a(String str) {
            return new C12523c<>(str);
        }

        public String toString() {
            return this.f59388a;
        }
    }

    /* renamed from: c */
    public static C12522b m83640c() {
        return new C12522b();
    }

    /* renamed from: b */
    public <T> T mo69026b(C12523c<T> cVar) {
        return this.f59385a.get(cVar);
    }

    /* renamed from: d */
    public C12522b mo69027d() {
        return new C12522b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r7 == 0) goto L_0x005a
            java.lang.Class<io.grpc.a> r2 = p292io.grpc.C12520a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x005a
        L_0x0010:
            io.grpc.a r7 = (p292io.grpc.C12520a) r7
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r2 = r6.f59385a
            int r2 = r2.size()
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r3 = r7.f59385a
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0021
            return r1
        L_0x0021:
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r2 = r6.f59385a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r4 = r7.f59385a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Object r4 = r3.getValue()
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r5 = r7.f59385a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = com.google.common.base.Objects.m5349a(r4, r3)
            if (r3 != 0) goto L_0x002b
            return r1
        L_0x0059:
            return r0
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.C12520a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry next : this.f59385a.entrySet()) {
            i += Objects.m5350b(next.getKey(), next.getValue());
        }
        return i;
    }

    public String toString() {
        return this.f59385a.toString();
    }

    private C12520a(Map<C12523c<?>, Object> map) {
        this.f59385a = map;
    }
}
