package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

public final class Internal {

    /* renamed from: a */
    static final Charset f56935a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f56936b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f56937c;

    /* renamed from: d */
    public static final ByteBuffer f56938d;

    /* renamed from: e */
    public static final CodedInputStream f56939e;

    public interface BooleanList extends ProtobufList<Boolean> {
    }

    public interface DoubleList extends ProtobufList<Double> {
    }

    public interface EnumLite {
        /* renamed from: c */
        int mo60052c();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        /* renamed from: a */
        T mo60053a(int i);
    }

    public interface EnumVerifier {
        /* renamed from: a */
        boolean mo60055a(int i);
    }

    public interface FloatList extends ProtobufList<Float> {
    }

    public interface IntList extends ProtobufList<Integer> {
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* renamed from: a */
        private final List<F> f56940a;

        /* renamed from: c */
        private final Converter<F, T> f56941c;

        public interface Converter<F, T> {
            /* renamed from: a */
            T mo65230a(F f);
        }

        public T get(int i) {
            return this.f56941c.mo65230a(this.f56940a.get(i));
        }

        public int size() {
            return this.f56940a.size();
        }
    }

    public interface LongList extends ProtobufList<Long> {
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: a */
        private final Map<K, RealValue> f56942a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Converter<RealValue, V> f56943c;

        /* renamed from: com.google.protobuf.Internal$MapAdapter$1 */
        final class C115921 implements Converter<Integer, EnumLite> {

            /* renamed from: a */
            final /* synthetic */ EnumLiteMap f56944a;

            /* renamed from: b */
            final /* synthetic */ EnumLite f56945b;

            /* renamed from: c */
            public Integer mo65235b(EnumLite enumLite) {
                return Integer.valueOf(enumLite.mo60052c());
            }

            /* renamed from: d */
            public EnumLite mo65234a(Integer num) {
                EnumLite a = this.f56944a.mo60053a(num.intValue());
                return a == null ? this.f56945b : a;
            }
        }

        public interface Converter<A, B> {
            /* renamed from: a */
            B mo65234a(A a);

            /* renamed from: b */
            A mo65235b(B b);
        }

        private class EntryAdapter implements Map.Entry<K, V> {

            /* renamed from: a */
            private final Map.Entry<K, RealValue> f56946a;

            public EntryAdapter(Map.Entry<K, RealValue> entry) {
                this.f56946a = entry;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if ((obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue())) {
                    return true;
                }
                return false;
            }

            public K getKey() {
                return this.f56946a.getKey();
            }

            public V getValue() {
                return MapAdapter.this.f56943c.mo65234a(this.f56946a.getValue());
            }

            public int hashCode() {
                return this.f56946a.hashCode();
            }

            public V setValue(V v) {
                RealValue value = this.f56946a.setValue(MapAdapter.this.f56943c.mo65235b(v));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.f56943c.mo65234a(value);
            }
        }

        private class IteratorAdapter implements Iterator<Map.Entry<K, V>> {

            /* renamed from: a */
            private final Iterator<Map.Entry<K, RealValue>> f56948a;

            public IteratorAdapter(Iterator<Map.Entry<K, RealValue>> it) {
                this.f56948a = it;
            }

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.f56948a.next());
            }

            public boolean hasNext() {
                return this.f56948a.hasNext();
            }

            public void remove() {
                this.f56948a.remove();
            }
        }

        private class SetAdapter extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: a */
            private final Set<Map.Entry<K, RealValue>> f56950a;

            public SetAdapter(Set<Map.Entry<K, RealValue>> set) {
                this.f56950a = set;
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.f56950a.iterator());
            }

            public int size() {
                return this.f56950a.size();
            }
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this.f56942a.entrySet());
        }

        public V get(Object obj) {
            RealValue realvalue = this.f56942a.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f56943c.mo65234a(realvalue);
        }

        public V put(K k, V v) {
            RealValue put = this.f56942a.put(k, this.f56943c.mo65235b(v));
            if (put == null) {
                return null;
            }
            return this.f56943c.mo65234a(put);
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        /* renamed from: U */
        void mo64743U();

        /* renamed from: c1 */
        boolean mo64749c1();

        /* renamed from: q1 */
        ProtobufList<E> mo64901q1(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f56937c = bArr;
        f56938d = ByteBuffer.wrap(bArr);
        f56939e = CodedInputStream.m79837i(bArr);
    }

    private Internal() {
    }

    /* renamed from: a */
    static <T> T m80732a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    static <T> T m80733b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static int m80734c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m80735d(byte[] bArr) {
        return m80736e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m80736e(byte[] bArr, int i, int i2) {
        int i3 = m80740i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m80737f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m80738g(byte[] bArr) {
        return Utf8.m81486t(bArr);
    }

    /* renamed from: h */
    static Object m80739h(Object obj, Object obj2) {
        return ((MessageLite) obj).mo65173b().mo64733y0((MessageLite) obj2).mo65192E0();
    }

    /* renamed from: i */
    static int m80740i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static byte[] m80741j(String str) {
        return str.getBytes(f56935a);
    }

    /* renamed from: k */
    public static String m80742k(byte[] bArr) {
        return new String(bArr, f56935a);
    }
}
