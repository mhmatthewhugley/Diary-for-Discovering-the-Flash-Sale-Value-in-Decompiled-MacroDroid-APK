package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzacx {

    /* renamed from: d */
    private static final zzacx f39675d = new zzacx(true);

    /* renamed from: a */
    final zzafj f39676a = new zzaez(16);

    /* renamed from: b */
    private boolean f39677b;

    /* renamed from: c */
    private boolean f39678c;

    private zzacx() {
    }

    /* renamed from: a */
    public static zzacx m56400a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m56401d(zzacw zzacw, Object obj) {
        boolean z;
        zzagd zzb = zzacw.zzb();
        zzadl.m56461e(obj);
        zzagd zzagd = zzagd.DOUBLE;
        zzage zzage = zzage.INT;
        switch (zzb.mo49256b().ordinal()) {
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
                if ((obj instanceof zzacc) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzadh)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzaek) || (obj instanceof zzadp)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacw.zza()), zzacw.zzb().mo49256b(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo49052b() {
        if (!this.f39677b) {
            for (int i = 0; i < this.f39676a.mo49178b(); i++) {
                Map.Entry g = this.f39676a.mo49185g(i);
                if (g.getValue() instanceof zzadf) {
                    ((zzadf) g.getValue()).mo49077g();
                }
            }
            this.f39676a.mo49155a();
            this.f39677b = true;
        }
    }

    /* renamed from: c */
    public final void mo49053c(zzacw zzacw, Object obj) {
        if (!zzacw.mo49049a()) {
            m56401d(zzacw, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m56401d(zzacw, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzadp) {
            this.f39678c = true;
        }
        this.f39676a.put(zzacw, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzacx zzacx = new zzacx();
        for (int i = 0; i < this.f39676a.mo49178b(); i++) {
            Map.Entry g = this.f39676a.mo49185g(i);
            zzacx.mo49053c((zzacw) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f39676a.mo49179c()) {
            zzacx.mo49053c((zzacw) entry.getKey(), entry.getValue());
        }
        zzacx.f39678c = this.f39678c;
        return zzacx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacx)) {
            return false;
        }
        return this.f39676a.equals(((zzacx) obj).f39676a);
    }

    public final int hashCode() {
        return this.f39676a.hashCode();
    }

    private zzacx(boolean z) {
        mo49052b();
        mo49052b();
    }
}
