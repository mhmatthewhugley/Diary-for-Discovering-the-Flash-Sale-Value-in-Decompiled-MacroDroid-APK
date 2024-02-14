package p280hc;

import java.io.Serializable;

/* renamed from: hc.e */
/* compiled from: MapEntry */
final class C12419e<K, V> implements Serializable {
    public final K key;
    public final V value;

    public C12419e(K k, V v) {
        this.key = k;
        this.value = v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p280hc.C12419e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            hc.e r4 = (p280hc.C12419e) r4
            K r0 = r3.key
            if (r0 != 0) goto L_0x0011
            K r0 = r4.key
            if (r0 != 0) goto L_0x0029
            goto L_0x0019
        L_0x0011:
            K r2 = r4.key
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            V r0 = r3.value
            V r4 = r4.value
            if (r0 != 0) goto L_0x0022
            if (r4 != 0) goto L_0x0029
            goto L_0x0028
        L_0x0022:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p280hc.C12419e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        K k = this.key;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.value;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }
}
