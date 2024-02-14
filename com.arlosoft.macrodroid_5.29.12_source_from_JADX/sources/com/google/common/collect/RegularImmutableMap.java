package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* renamed from: s */
    static final ImmutableMap<Object, Object> f17080s = new RegularImmutableMap((Object) null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: g */
    private final transient Object f17081g;
    @VisibleForTesting

    /* renamed from: o */
    final transient Object[] f17082o;

    /* renamed from: p */
    private final transient int f17083p;

    static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: d */
        private final transient ImmutableMap<K, V> f17084d;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final transient Object[] f17085f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final transient int f17086g;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public final transient int f17087o;

        EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f17084d = immutableMap;
            this.f17085f = objArr;
            this.f17086g = i;
            this.f17087o = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public ImmutableList<Map.Entry<K, V>> mo35439B() {
            return new ImmutableList<Map.Entry<K, V>>() {
                /* renamed from: P */
                public Map.Entry<K, V> get(int i) {
                    Preconditions.m5390q(i, EntrySet.this.f17087o);
                    int i2 = i * 2;
                    Object obj = EntrySet.this.f17085f[EntrySet.this.f17086g + i2];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.f17085f[i2 + (EntrySet.this.f17086g ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                /* renamed from: j */
                public boolean mo34781j() {
                    return true;
                }

                public int size() {
                    return EntrySet.this.f17087o;
                }
            };
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f17084d.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo35355d(Object[] objArr, int i) {
            return mo35029c().mo35355d(objArr, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        /* renamed from: k */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return mo35029c().iterator();
        }

        public int size() {
            return this.f17087o;
        }
    }

    static final class KeySet<K> extends ImmutableSet<K> {

        /* renamed from: d */
        private final transient ImmutableMap<K, ?> f17088d;

        /* renamed from: f */
        private final transient ImmutableList<K> f17089f;

        KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f17088d = immutableMap;
            this.f17089f = immutableList;
        }

        /* renamed from: c */
        public ImmutableList<K> mo35029c() {
            return this.f17089f;
        }

        public boolean contains(Object obj) {
            return this.f17088d.get(obj) != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo35355d(Object[] objArr, int i) {
            return mo35029c().mo35355d(objArr, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        /* renamed from: k */
        public UnmodifiableIterator<K> iterator() {
            return mo35029c().iterator();
        }

        public int size() {
            return this.f17088d.size();
        }
    }

    static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* renamed from: d */
        private final transient Object[] f17090d;

        /* renamed from: f */
        private final transient int f17091f;

        /* renamed from: g */
        private final transient int f17092g;

        KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.f17090d = objArr;
            this.f17091f = i;
            this.f17092g = i2;
        }

        public Object get(int i) {
            Preconditions.m5390q(i, this.f17092g);
            Object obj = this.f17090d[(i * 2) + this.f17091f];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        public int size() {
            return this.f17092g;
        }
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.f17081g = obj;
        this.f17082o = objArr;
        this.f17083p = i;
    }

    /* renamed from: q */
    static <K, V> RegularImmutableMap<K, V> m28615q(int i, Object[] objArr) {
        return m28616r(i, objArr, (ImmutableMap.Builder) null);
    }

    /* renamed from: r */
    static <K, V> RegularImmutableMap<K, V> m28616r(int i, Object[] objArr, ImmutableMap.Builder<K, V> builder) {
        if (i == 0) {
            return (RegularImmutableMap) f17080s;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.m26534a(obj, obj2);
            return new RegularImmutableMap<>((Object) null, objArr, 1);
        }
        Preconditions.m5395v(i, objArr.length >> 1);
        Object t = m28617t(objArr, i, ImmutableSet.m27513p(i), 0);
        if (t instanceof Object[]) {
            Object[] objArr2 = (Object[]) t;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder != null) {
                builder.f16663e = duplicateKey;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                t = obj3;
                i = intValue;
            } else {
                throw duplicateKey.mo35427a();
            }
        }
        return new RegularImmutableMap<>(t, objArr, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m28617t(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0018
            r0 = r16[r19]
            java.util.Objects.requireNonNull(r0)
            r1 = r19 ^ 1
            r1 = r16[r1]
            java.util.Objects.requireNonNull(r1)
            com.google.common.collect.CollectPreconditions.m26534a(r0, r1)
            return r2
        L_0x0018:
            int r4 = r1 + -1
            r5 = 128(0x80, float:1.794E-43)
            r6 = 3
            r7 = -1
            r8 = 2
            r9 = 0
            if (r1 > r5) goto L_0x008c
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0029:
            if (r5 >= r0) goto L_0x007b
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.CollectPreconditions.m26534a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.Hashing.m27249c(r13)
        L_0x0049:
            r13 = r13 & r4
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x005f
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x005c
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x005c:
            int r7 = r7 + 1
            goto L_0x0075
        L_0x005f:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0078
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0078:
            int r13 = r13 + 1
            goto L_0x0049
        L_0x007b:
            if (r7 != r0) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x008b:
            return r1
        L_0x008c:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto L_0x00fc
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0098:
            if (r5 >= r0) goto L_0x00eb
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.CollectPreconditions.m26534a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.Hashing.m27249c(r13)
        L_0x00b8:
            r13 = r13 & r4
            short r14 = r1[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x00cf
            short r14 = (short) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x00cc
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x00cc:
            int r7 = r7 + 1
            goto L_0x00e5
        L_0x00cf:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00e8
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x00e5:
            int r5 = r5 + 1
            goto L_0x0098
        L_0x00e8:
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00eb:
            if (r7 != r0) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x00fb:
            return r1
        L_0x00fc:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r10 = 0
        L_0x0103:
            if (r5 >= r0) goto L_0x0153
            int r11 = r5 * 2
            int r11 = r11 + r19
            int r12 = r10 * 2
            int r12 = r12 + r19
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.util.Objects.requireNonNull(r11)
            com.google.common.collect.CollectPreconditions.m26534a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.common.collect.Hashing.m27249c(r14)
        L_0x0123:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r7) goto L_0x0135
            r1[r14] = r12
            if (r10 >= r5) goto L_0x0132
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L_0x0132:
            int r10 = r10 + 1
            goto L_0x014b
        L_0x0135:
            r7 = r16[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x014f
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r7 = r15 ^ 1
            r12 = r16[r7]
            java.util.Objects.requireNonNull(r12)
            r2.<init>(r13, r11, r12)
            r16[r7] = r11
        L_0x014b:
            int r5 = r5 + 1
            r7 = -1
            goto L_0x0103
        L_0x014f:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x0123
        L_0x0153:
            if (r10 != r0) goto L_0x0156
            goto L_0x0163
        L_0x0156:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x0163:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableMap.m28617t(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: u */
    static Object m28618u(Object[] objArr, int i, int i2, int i3) {
        Object t = m28617t(objArr, i, i2, i3);
        if (!(t instanceof Object[])) {
            return t;
        }
        throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) t)[2]).mo35427a();
    }

    /* renamed from: v */
    static Object m28619v(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int c = Hashing.m27249c(obj2.hashCode());
                while (true) {
                    int i3 = c & length;
                    byte b = bArr[i3] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b])) {
                        return objArr[b ^ 1];
                    }
                    c = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int c2 = Hashing.m27249c(obj2.hashCode());
                while (true) {
                    int i4 = c2 & length2;
                    short s = sArr[i4] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[s])) {
                        return objArr[s ^ 1];
                    }
                    c2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int c3 = Hashing.m27249c(obj2.hashCode());
                while (true) {
                    int i5 = c3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    c3 = i5 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ImmutableSet<Map.Entry<K, V>> mo35412e() {
        return new EntrySet(this, this.f17082o, 0, this.f17083p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ImmutableSet<K> mo34971f() {
        return new KeySet(this, new KeysOrValuesAsList(this.f17082o, 0, this.f17083p));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ImmutableCollection<V> mo35329g() {
        return new KeysOrValuesAsList(this.f17082o, 1, this.f17083p);
    }

    public V get(Object obj) {
        V v = m28619v(this.f17081g, this.f17082o, this.f17083p, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34967j() {
        return false;
    }

    public int size() {
        return this.f17083p;
    }
}
