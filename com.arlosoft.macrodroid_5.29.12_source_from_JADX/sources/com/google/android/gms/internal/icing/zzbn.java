package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzbn<T> implements zzbm<T> {

    /* renamed from: a */
    volatile zzbm<T> f40782a;

    public final String toString() {
        Object obj = this.f40782a;
        if (obj == null) {
            StringBuilder sb = new StringBuilder("null".length() + 25);
            sb.append("<supplier that returned ");
            sb.append("null");
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
