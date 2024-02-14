package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j */
/* compiled from: LazyField */
public class C14506j extends C14510k {

    /* renamed from: e */
    private final C14516o f63381e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$b */
    /* compiled from: LazyField */
    static class C14508b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, C14506j> f63382a;

        public K getKey() {
            return this.f63382a.getKey();
        }

        public Object getValue() {
            C14506j value = this.f63382a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo73407e();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C14516o) {
                return this.f63382a.getValue().mo73421d((C14516o) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C14508b(Map.Entry<K, C14506j> entry) {
            this.f63382a = entry;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$c */
    /* compiled from: LazyField */
    static class C14509c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f63383a;

        public C14509c(Iterator<Map.Entry<K, Object>> it) {
            this.f63383a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f63383a.next();
            return next.getValue() instanceof C14506j ? new C14508b(next) : next;
        }

        public boolean hasNext() {
            return this.f63383a.hasNext();
        }

        public void remove() {
            this.f63383a.remove();
        }
    }

    /* renamed from: e */
    public C14516o mo73407e() {
        return mo73420c(this.f63381e);
    }

    public boolean equals(Object obj) {
        return mo73407e().equals(obj);
    }

    public int hashCode() {
        return mo73407e().hashCode();
    }

    public String toString() {
        return mo73407e().toString();
    }
}
