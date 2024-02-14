package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class zzai implements zzap, zzal {

    /* renamed from: a */
    protected final String f41190a;

    /* renamed from: c */
    protected final Map f41191c = new HashMap();

    public zzai(String str) {
        this.f41190a = str;
    }

    /* renamed from: W */
    public final zzap mo50701W(String str) {
        return this.f41191c.containsKey(str) ? (zzap) this.f41191c.get(str) : zzap.f41197i;
    }

    /* renamed from: a */
    public abstract zzap mo50735a(zzg zzg, List list);

    /* renamed from: b */
    public final String mo50736b() {
        return this.f41190a;
    }

    /* renamed from: c */
    public final zzap mo50702c(String str, zzg zzg, List list) {
        if ("toString".equals(str)) {
            return new zzat(this.f41190a);
        }
        return zzaj.m59448a(this, new zzat(str), zzg, list);
    }

    /* renamed from: d */
    public zzap mo50703d() {
        return this;
    }

    /* renamed from: e */
    public final Double mo50704e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzai = (zzai) obj;
        String str = this.f41190a;
        if (str != null) {
            return str.equals(zzai.f41190a);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean mo50706f() {
        return Boolean.TRUE;
    }

    /* renamed from: g */
    public final String mo50707g() {
        return this.f41190a;
    }

    /* renamed from: h */
    public final boolean mo50708h(String str) {
        return this.f41191c.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f41190a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo50710i(String str, zzap zzap) {
        if (zzap == null) {
            this.f41191c.remove(str);
        } else {
            this.f41191c.put(str, zzap);
        }
    }

    /* renamed from: j */
    public final Iterator mo50712j() {
        return zzaj.m59449b(this.f41191c);
    }
}
