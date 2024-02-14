package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbo {

    /* renamed from: d */
    private static final zzbo f45566d = new zzbo(true);

    /* renamed from: a */
    final zzea f45567a = new zzdq(16);

    /* renamed from: b */
    private boolean f45568b;

    /* renamed from: c */
    private boolean f45569c;

    private zzbo() {
    }

    /* renamed from: a */
    public static zzbo m64168a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m64169d(zzbn zzbn, Object obj) {
        boolean z;
        zzeu zzb = zzbn.zzb();
        zzcd.m64226e(obj);
        zzeu zzeu = zzeu.DOUBLE;
        zzev zzev = zzev.INT;
        switch (zzb.mo54093b().ordinal()) {
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
                if ((obj instanceof zzaw) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzbx)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzdc) || (obj instanceof zzch)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzbn.zza()), zzbn.zzb().mo54093b(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo53919b() {
        if (!this.f45568b) {
            this.f45567a.mo54008a();
            this.f45568b = true;
        }
    }

    /* renamed from: c */
    public final void mo53920c(zzbn zzbn, Object obj) {
        if (!zzbn.mo53916a()) {
            m64169d(zzbn, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m64169d(zzbn, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzch) {
            this.f45569c = true;
        }
        this.f45567a.put(zzbn, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzbo zzbo = new zzbo();
        for (int i = 0; i < this.f45567a.mo54030b(); i++) {
            Map.Entry g = this.f45567a.mo54037g(i);
            zzbo.mo53920c((zzbn) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f45567a.mo54031c()) {
            zzbo.mo53920c((zzbn) entry.getKey(), entry.getValue());
        }
        zzbo.f45569c = this.f45569c;
        return zzbo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbo)) {
            return false;
        }
        return this.f45567a.equals(((zzbo) obj).f45567a);
    }

    public final int hashCode() {
        return this.f45567a.hashCode();
    }

    private zzbo(boolean z) {
        mo53919b();
        mo53919b();
    }
}
