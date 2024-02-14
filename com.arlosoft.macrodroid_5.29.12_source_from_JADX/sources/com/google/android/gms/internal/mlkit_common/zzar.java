package com.google.android.gms.internal.mlkit_common;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class zzar implements Map, Serializable {

    /* renamed from: a */
    private transient zzas f41947a;

    /* renamed from: c */
    private transient zzas f41948c;

    /* renamed from: d */
    private transient zzak f41949d;

    zzar() {
    }

    /* renamed from: c */
    public static zzar m61171c(Object obj, Object obj2) {
        zzaf.m61142a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzaz.m61192g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, (zzaq) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract zzak mo51763a();

    /* renamed from: b */
    public final zzak values() {
        zzak zzak = this.f41949d;
        if (zzak != null) {
            return zzak;
        }
        zzak a = mo51763a();
        this.f41949d = a;
        return a;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract zzas mo51768d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract zzas mo51769e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: f */
    public final zzas entrySet() {
        zzas zzas = this.f41947a;
        if (zzas != null) {
            return zzas;
        }
        zzas d = mo51768d();
        this.f41947a = d;
        return d;
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzba.m61196a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzas zzas = this.f41948c;
        if (zzas != null) {
            return zzas;
        }
        zzas e = mo51769e();
        this.f41948c = e;
        return e;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, FileUtils.ONE_GB));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
