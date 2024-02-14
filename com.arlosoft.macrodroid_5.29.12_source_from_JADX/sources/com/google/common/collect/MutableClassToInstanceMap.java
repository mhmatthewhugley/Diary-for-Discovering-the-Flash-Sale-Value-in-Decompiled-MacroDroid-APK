package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Primitives;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class MutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    private static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Map<Class<? extends B>, B> backingMap;

        SerializedForm(Map<Class<? extends B>, B> map) {
            this.backingMap = map;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return MutableClassToInstanceMap.m28442Y(this.backingMap);
        }
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) Preconditions.m5392s(map);
    }

    /* access modifiers changed from: private */
    @CanIgnoreReturnValue
    /* renamed from: W */
    public static <B, T extends B> T m28440W(Class<T> cls, B b) {
        return Primitives.m73648b(cls).cast(b);
    }

    /* renamed from: X */
    static <B> Map.Entry<Class<? extends B>, B> m28441X(final Map.Entry<Class<? extends B>, B> entry) {
        return new ForwardingMapEntry<Class<? extends B>, B>() {
            /* access modifiers changed from: protected */
            /* renamed from: R */
            public Map.Entry<Class<? extends B>, B> mo22325Q() {
                return entry;
            }

            public B setValue(B b) {
                return super.setValue(MutableClassToInstanceMap.m28440W((Class) getKey(), b));
            }
        };
    }

    /* renamed from: Y */
    public static <B> MutableClassToInstanceMap<B> m28442Y(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }

    private Object writeReplace() {
        return new SerializedForm(mo22325Q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public Map<Class<? extends B>, B> mo22325Q() {
        return this.delegate;
    }

    @CanIgnoreReturnValue
    /* renamed from: a0 */
    public B put(Class<? extends B> cls, B b) {
        return super.put(cls, m28440W(cls, b));
    }

    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new ForwardingSet<Map.Entry<Class<? extends B>, B>>() {
            /* access modifiers changed from: protected */
            /* renamed from: b0 */
            public Set<Map.Entry<Class<? extends B>, B>> mo34397R() {
                return MutableClassToInstanceMap.this.mo22325Q().entrySet();
            }

            public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
                return new TransformedIterator<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>>(this, mo34397R().iterator()) {
                    /* access modifiers changed from: package-private */
                    /* renamed from: b */
                    public Map.Entry<Class<? extends B>, B> mo34726a(Map.Entry<Class<? extends B>, B> entry) {
                        return MutableClassToInstanceMap.m28441X(entry);
                    }
                };
            }

            public Object[] toArray() {
                return mo35131X();
            }

            public <T> T[] toArray(T[] tArr) {
                return mo35132Y(tArr);
            }
        };
    }

    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            m28440W((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }
}
