package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqv {

    /* renamed from: d */
    private static final zzgqv f37078d = new zzgqv(true);

    /* renamed from: a */
    final zzgtu f37079a = new zzgtk(16);

    /* renamed from: b */
    private boolean f37080b;

    /* renamed from: c */
    private boolean f37081c;

    private zzgqv() {
    }

    /* renamed from: a */
    public static zzgqv m52922a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m52923d(zzgqu zzgqu, Object obj) {
        boolean z;
        zzguo zzb = zzgqu.zzb();
        zzgro.m53027e(obj);
        zzguo zzguo = zzguo.DOUBLE;
        zzgup zzgup = zzgup.INT;
        switch (zzb.mo47535b().ordinal()) {
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
                if ((obj instanceof zzgpw) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgrg)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzgso) || (obj instanceof zzgrt)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgqu.zza()), zzgqu.zzb().mo47535b(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo47285b() {
        if (!this.f37080b) {
            this.f37079a.mo47434a();
            this.f37080b = true;
        }
    }

    /* renamed from: c */
    public final void mo47286c(zzgqu zzgqu, Object obj) {
        if (!zzgqu.mo47282a()) {
            m52923d(zzgqu, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m52923d(zzgqu, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgrt) {
            this.f37081c = true;
        }
        this.f37079a.put(zzgqu, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgqv zzgqv = new zzgqv();
        for (int i = 0; i < this.f37079a.mo47456b(); i++) {
            Map.Entry g = this.f37079a.mo47463g(i);
            zzgqv.mo47286c((zzgqu) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f37079a.mo47457c()) {
            zzgqv.mo47286c((zzgqu) entry.getKey(), entry.getValue());
        }
        zzgqv.f37081c = this.f37081c;
        return zzgqv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgqv)) {
            return false;
        }
        return this.f37079a.equals(((zzgqv) obj).f37079a);
    }

    public final int hashCode() {
        return this.f37079a.hashCode();
    }

    private zzgqv(boolean z) {
        mo47285b();
        mo47285b();
    }
}
