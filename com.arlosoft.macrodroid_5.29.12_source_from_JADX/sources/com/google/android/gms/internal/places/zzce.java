package com.google.android.gms.internal.places;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzce<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private static final zzce f45319a;
    private boolean zzdy = true;

    static {
        zzce zzce = new zzce();
        f45319a = zzce;
        zzce.zzdy = false;
    }

    private zzce() {
    }

    /* renamed from: d */
    public static <K, V> zzce<K, V> m63420d() {
        return f45319a;
    }

    /* renamed from: f */
    private final void m63421f() {
        if (!this.zzdy) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private static int m63422g(Object obj) {
        if (obj instanceof byte[]) {
            return zzbd.m63341b((byte[]) obj);
        }
        if (!(obj instanceof zzbg)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo53519a() {
        return this.zzdy;
    }

    /* renamed from: b */
    public final void mo53520b() {
        this.zzdy = false;
    }

    /* renamed from: c */
    public final void mo53521c(zzce<K, V> zzce) {
        m63421f();
        if (!zzce.isEmpty()) {
            putAll(zzce);
        }
    }

    public final void clear() {
        m63421f();
        super.clear();
    }

    /* renamed from: e */
    public final zzce<K, V> mo53523e() {
        return isEmpty() ? new zzce<>() : new zzce<>(this);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzce.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m63422g(entry.getValue()) ^ m63422g(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m63421f();
        zzbd.m63340a(k);
        zzbd.m63340a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m63421f();
        for (Object next : map.keySet()) {
            zzbd.m63340a(next);
            zzbd.m63340a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m63421f();
        return super.remove(obj);
    }

    private zzce(Map<K, V> map) {
        super(map);
    }
}
