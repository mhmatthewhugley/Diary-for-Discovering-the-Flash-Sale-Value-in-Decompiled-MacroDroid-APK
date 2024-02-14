package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class Serialization {

    static final class FieldSetter<T> {

        /* renamed from: a */
        private final Field f17113a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36336a(T t, int i) {
            try {
                this.f17113a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36337b(T t, Object obj) {
            try {
                this.f17113a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        private FieldSetter(Field field) {
            this.f17113a = field;
            field.setAccessible(true);
        }
    }

    private Serialization() {
    }

    /* renamed from: a */
    static <T> FieldSetter<T> m28703a(Class<T> cls, String str) {
        try {
            return new FieldSetter<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    static <K, V> void m28704b(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m28705c(map, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: c */
    static <K, V> void m28705c(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: d */
    static <K, V> void m28706d(Multimap<K, V> multimap, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m28707e(multimap, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: e */
    static <K, V> void m28707e(Multimap<K, V> multimap, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection<V> collection = multimap.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: f */
    static <E> void m28708f(Multiset<E> multiset, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m28709g(multiset, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: g */
    static <E> void m28709g(Multiset<E> multiset, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            multiset.mo34611k1(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: h */
    static int m28710h(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* renamed from: i */
    static <K, V> void m28711i(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* renamed from: j */
    static <K, V> void m28712j(Multimap<K, V> multimap, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multimap.mo34430w().size());
        for (Map.Entry next : multimap.mo34430w().entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeInt(((Collection) next.getValue()).size());
            for (Object writeObject : (Collection) next.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: k */
    static <E> void m28713k(Multiset<E> multiset, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry next : multiset.entrySet()) {
            objectOutputStream.writeObject(next.mo35049b());
            objectOutputStream.writeInt(next.getCount());
        }
    }
}
