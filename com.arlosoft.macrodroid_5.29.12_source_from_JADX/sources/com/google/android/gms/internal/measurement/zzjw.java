package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjw {

    /* renamed from: d */
    private static final zzjw f41565d = new zzjw(true);

    /* renamed from: a */
    final zzmk f41566a = new zzma(16);

    /* renamed from: b */
    private boolean f41567b;

    /* renamed from: c */
    private boolean f41568c;

    private zzjw() {
    }

    /* renamed from: a */
    public static zzjw m60474a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m60475d(zzjv zzjv, Object obj) {
        boolean z;
        zzne zzb = zzjv.zzb();
        zzkn.m60542e(obj);
        zzne zzne = zzne.DOUBLE;
        zznf zznf = zznf.INT;
        switch (zzb.mo51613b().ordinal()) {
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
                if ((obj instanceof zzje) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzkh)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzlm) || (obj instanceof zzkr)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzjv.zza()), zzjv.zzb().mo51613b(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo51423b() {
        if (!this.f41567b) {
            for (int i = 0; i < this.f41566a.mo51545b(); i++) {
                Map.Entry g = this.f41566a.mo51552g(i);
                if (g.getValue() instanceof zzkf) {
                    ((zzkf) g.getValue()).mo51453r();
                }
            }
            this.f41566a.mo51523a();
            this.f41567b = true;
        }
    }

    /* renamed from: c */
    public final void mo51424c(zzjv zzjv, Object obj) {
        if (!zzjv.mo51420a()) {
            m60475d(zzjv, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m60475d(zzjv, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzkr) {
            this.f41568c = true;
        }
        this.f41566a.put(zzjv, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjw zzjw = new zzjw();
        for (int i = 0; i < this.f41566a.mo51545b(); i++) {
            Map.Entry g = this.f41566a.mo51552g(i);
            zzjw.mo51424c((zzjv) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f41566a.mo51546c()) {
            zzjw.mo51424c((zzjv) entry.getKey(), entry.getValue());
        }
        zzjw.f41568c = this.f41568c;
        return zzjw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjw)) {
            return false;
        }
        return this.f41566a.equals(((zzjw) obj).f41566a);
    }

    public final int hashCode() {
        return this.f41566a.hashCode();
    }

    private zzjw(boolean z) {
        mo51423b();
        mo51423b();
    }
}
