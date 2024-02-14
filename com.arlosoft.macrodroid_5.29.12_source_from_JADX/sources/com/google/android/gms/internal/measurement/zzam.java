package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public class zzam implements zzap, zzal {

    /* renamed from: a */
    final Map f41193a = new HashMap();

    /* renamed from: W */
    public final zzap mo50701W(String str) {
        return this.f41193a.containsKey(str) ? (zzap) this.f41193a.get(str) : zzap.f41197i;
    }

    /* renamed from: a */
    public final List mo50741a() {
        return new ArrayList(this.f41193a.keySet());
    }

    /* renamed from: c */
    public zzap mo50702c(String str, zzg zzg, List list) {
        if ("toString".equals(str)) {
            return new zzat(toString());
        }
        return zzaj.m59448a(this, new zzat(str), zzg, list);
    }

    /* renamed from: d */
    public final zzap mo50703d() {
        zzam zzam = new zzam();
        for (Map.Entry entry : this.f41193a.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzam.f41193a.put((String) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzam.f41193a.put((String) entry.getKey(), ((zzap) entry.getValue()).mo50703d());
            }
        }
        return zzam;
    }

    /* renamed from: e */
    public final Double mo50704e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        return this.f41193a.equals(((zzam) obj).f41193a);
    }

    /* renamed from: f */
    public final Boolean mo50706f() {
        return Boolean.TRUE;
    }

    /* renamed from: g */
    public final String mo50707g() {
        return "[object Object]";
    }

    /* renamed from: h */
    public final boolean mo50708h(String str) {
        return this.f41193a.containsKey(str);
    }

    public final int hashCode() {
        return this.f41193a.hashCode();
    }

    /* renamed from: i */
    public final void mo50710i(String str, zzap zzap) {
        if (zzap == null) {
            this.f41193a.remove(str);
        } else {
            this.f41193a.put(str, zzap);
        }
    }

    /* renamed from: j */
    public final Iterator mo50712j() {
        return zzaj.m59449b(this.f41193a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f41193a.isEmpty()) {
            for (String str : this.f41193a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f41193a.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
