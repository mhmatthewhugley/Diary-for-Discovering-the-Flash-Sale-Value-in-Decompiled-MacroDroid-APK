package com.google.android.gms.internal.mlkit_translate;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public abstract class zzy implements Map, Serializable {

    /* renamed from: a */
    private transient zzaa f44524a;

    /* renamed from: c */
    private transient zzaa f44525c;

    /* renamed from: d */
    private transient zzr f44526d;

    zzy() {
    }

    /* renamed from: c */
    public static zzy m62268c() {
        return zzai.f43098p;
    }

    /* renamed from: d */
    public static zzy m62269d(Object obj, Object obj2) {
        zzn.m61999a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzai.m61574i(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, (zzx) null);
    }

    /* renamed from: e */
    public static zzy m62270e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzn.m61999a("iw", "he");
        zzn.m61999a("in", "id");
        zzn.m61999a("nb", "no");
        return zzai.m61574i(3, new Object[]{"iw", "he", "in", "id", "nb", "no"}, (zzx) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract zzr mo52044a();

    /* renamed from: b */
    public final zzr values() {
        zzr zzr = this.f44526d;
        if (zzr != null) {
            return zzr;
        }
        zzr a = mo52044a();
        this.f44526d = a;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract zzaa mo52045f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract zzaa mo52046g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public final zzaa entrySet() {
        zzaa zzaa = this.f44524a;
        if (zzaa != null) {
            return zzaa;
        }
        zzaa f = mo52045f();
        this.f44524a = f;
        return f;
    }

    public final int hashCode() {
        return zzak.m61585a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzaa zzaa = this.f44525c;
        if (zzaa != null) {
            return zzaa;
        }
        zzaa g = mo52046g();
        this.f44525c = g;
        return g;
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
