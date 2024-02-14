package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzcu<T extends zzct<T>> {

    /* renamed from: d */
    private static final zzcu f40814d = new zzcu(true);

    /* renamed from: a */
    final zzez<T, Object> f40815a = new zzes(16);

    /* renamed from: b */
    private boolean f40816b;

    /* renamed from: c */
    private boolean f40817c;

    private zzcu() {
    }

    /* renamed from: a */
    public static <T extends zzct<T>> zzcu<T> m58778a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m58779d(T t, Object obj) {
        boolean z;
        zzfs zzb = t.zzb();
        zzdh.m58816a(obj);
        zzfs zzfs = zzfs.DOUBLE;
        zzft zzft = zzft.INT;
        switch (zzb.mo50450b().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzcf) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzde)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzee) || (obj instanceof zzdl)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().mo50450b(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo50294b() {
        if (!this.f40816b) {
            this.f40815a.mo50367a();
            this.f40816b = true;
        }
    }

    /* renamed from: c */
    public final void mo50295c(T t, Object obj) {
        if (!t.mo50291a()) {
            m58779d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m58779d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzdl) {
            this.f40817c = true;
        }
        this.f40815a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzcu zzcu = new zzcu();
        for (int i = 0; i < this.f40815a.mo50390c(); i++) {
            Map.Entry<T, Object> d = this.f40815a.mo50393d(i);
            zzcu.mo50295c((zzct) d.getKey(), d.getValue());
        }
        for (Map.Entry next : this.f40815a.mo50394e()) {
            zzcu.mo50295c((zzct) next.getKey(), next.getValue());
        }
        zzcu.f40817c = this.f40817c;
        return zzcu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcu)) {
            return false;
        }
        return this.f40815a.equals(((zzcu) obj).f40815a);
    }

    public final int hashCode() {
        return this.f40815a.hashCode();
    }

    private zzcu(boolean z) {
        mo50294b();
        mo50294b();
    }
}
