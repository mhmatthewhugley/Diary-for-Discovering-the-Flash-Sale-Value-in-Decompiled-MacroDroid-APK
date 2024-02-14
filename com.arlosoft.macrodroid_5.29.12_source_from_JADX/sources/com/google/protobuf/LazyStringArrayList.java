package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    /* renamed from: d */
    private static final LazyStringArrayList f56980d;

    /* renamed from: f */
    public static final LazyStringList f56981f;

    /* renamed from: c */
    private final List<Object> f56982c;

    private static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: a */
        private final LazyStringArrayList f56983a;

        /* renamed from: c */
        public void add(int i, byte[] bArr) {
            this.f56983a.m80789n(i, bArr);
            this.modCount++;
        }

        /* renamed from: d */
        public byte[] get(int i) {
            return this.f56983a.mo65279t(i);
        }

        /* renamed from: f */
        public byte[] remove(int i) {
            String z = this.f56983a.remove(i);
            this.modCount++;
            return LazyStringArrayList.m80790o(z);
        }

        /* renamed from: h */
        public byte[] set(int i, byte[] bArr) {
            Object d = this.f56983a.m80781F(i, bArr);
            this.modCount++;
            return LazyStringArrayList.m80790o(d);
        }

        public int size() {
            return this.f56983a.size();
        }
    }

    private static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {

        /* renamed from: a */
        private final LazyStringArrayList f56984a;

        /* renamed from: c */
        public void add(int i, ByteString byteString) {
            this.f56984a.m80788l(i, byteString);
            this.modCount++;
        }

        /* renamed from: d */
        public ByteString get(int i) {
            return this.f56984a.mo65280u(i);
        }

        /* renamed from: f */
        public ByteString remove(int i) {
            String z = this.f56984a.remove(i);
            this.modCount++;
            return LazyStringArrayList.m80791p(z);
        }

        /* renamed from: h */
        public ByteString set(int i, ByteString byteString) {
            Object i2 = this.f56984a.m80780D(i, byteString);
            this.modCount++;
            return LazyStringArrayList.m80791p(i2);
        }

        public int size() {
            return this.f56984a.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
        f56980d = lazyStringArrayList;
        lazyStringArrayList.mo64743U();
        f56981f = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public Object m80780D(int i, ByteString byteString) {
        mo64748c();
        return this.f56982c.set(i, byteString);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public Object m80781F(int i, byte[] bArr) {
        mo64748c();
        return this.f56982c.set(i, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m80788l(int i, ByteString byteString) {
        mo64748c();
        this.f56982c.add(i, byteString);
        this.modCount++;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m80789n(int i, byte[] bArr) {
        mo64748c();
        this.f56982c.add(i, bArr);
        this.modCount++;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static byte[] m80790o(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Internal.m80741j((String) obj);
        }
        return ((ByteString) obj).mo64916V();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static ByteString m80791p(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.m79775t((String) obj);
        }
        return ByteString.m79773p((byte[]) obj);
    }

    /* renamed from: q */
    private static String m80792q(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).mo64919a0();
        }
        return Internal.m80742k((byte[]) obj);
    }

    /* renamed from: B */
    public String set(int i, String str) {
        mo64748c();
        return m80792q(this.f56982c.set(i, str));
    }

    /* renamed from: L */
    public LazyStringList mo65271L() {
        return mo64749c1() ? new UnmodifiableLazyStringList(this) : this;
    }

    /* renamed from: Z */
    public void mo65272Z(ByteString byteString) {
        mo64748c();
        this.f56982c.add(byteString);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c1 */
    public /* bridge */ /* synthetic */ boolean mo64749c1() {
        return super.mo64749c1();
    }

    public void clear() {
        mo64748c();
        this.f56982c.clear();
        this.modCount++;
    }

    /* renamed from: d2 */
    public Object mo65273d2(int i) {
        return this.f56982c.get(i);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public void add(int i, String str) {
        mo64748c();
        this.f56982c.add(i, str);
        this.modCount++;
    }

    /* renamed from: r */
    public List<?> mo65276r() {
        return Collections.unmodifiableList(this.f56982c);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public String get(int i) {
        Object obj = this.f56982c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String a0 = byteString.mo64919a0();
            if (byteString.mo64908F()) {
                this.f56982c.set(i, a0);
            }
            return a0;
        }
        byte[] bArr = (byte[]) obj;
        String k = Internal.m80742k(bArr);
        if (Internal.m80738g(bArr)) {
            this.f56982c.set(i, k);
        }
        return k;
    }

    public int size() {
        return this.f56982c.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.List<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo65279t(int r3) {
        /*
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.f56982c
            java.lang.Object r0 = r0.get(r3)
            byte[] r1 = m80790o(r0)
            if (r1 == r0) goto L_0x0011
            java.util.List<java.lang.Object> r0 = r2.f56982c
            r0.set(r3, r1)
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyStringArrayList.mo65279t(int):byte[]");
    }

    /* renamed from: u */
    public ByteString mo65280u(int i) {
        Object obj = this.f56982c.get(i);
        ByteString p = m80791p(obj);
        if (p != obj) {
            this.f56982c.set(i, p);
        }
        return p;
    }

    /* renamed from: w */
    public LazyStringArrayList mo64901q1(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f56982c);
            return new LazyStringArrayList((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public String remove(int i) {
        mo64748c();
        Object remove = this.f56982c.remove(i);
        this.modCount++;
        return m80792q(remove);
    }

    public LazyStringArrayList(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo64748c();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).mo65276r();
        }
        boolean addAll = this.f56982c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private LazyStringArrayList(ArrayList<Object> arrayList) {
        this.f56982c = arrayList;
    }
}
