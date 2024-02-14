package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzae implements Iterable, zzap, zzal {

    /* renamed from: a */
    final SortedMap f41184a;

    /* renamed from: c */
    final Map f41185c;

    public zzae() {
        this.f41184a = new TreeMap();
        this.f41185c = new TreeMap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzap) r2.f41185c.get(r3);
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap mo50701W(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.zzah r3 = new com.google.android.gms.internal.measurement.zzah
            int r0 = r2.mo50714l()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo50708h(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f41185c
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.f41197i
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.mo50701W(java.lang.String):com.google.android.gms.internal.measurement.zzap");
    }

    /* renamed from: c */
    public final zzap mo50702c(String str, zzg zzg, List list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return zzbb.m59509a(str, this, zzg, list);
        }
        return zzaj.m59448a(this, new zzat(str), zzg, list);
    }

    /* renamed from: d */
    public final zzap mo50703d() {
        zzae zzae = new zzae();
        for (Map.Entry entry : this.f41184a.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzae.f41184a.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzae.f41184a.put((Integer) entry.getKey(), ((zzap) entry.getValue()).mo50703d());
            }
        }
        return zzae;
    }

    /* renamed from: e */
    public final Double mo50704e() {
        if (this.f41184a.size() == 1) {
            return mo50715m(0).mo50704e();
        }
        if (this.f41184a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzae = (zzae) obj;
        if (mo50714l() != zzae.mo50714l()) {
            return false;
        }
        if (this.f41184a.isEmpty()) {
            return zzae.f41184a.isEmpty();
        }
        for (int intValue = ((Integer) this.f41184a.firstKey()).intValue(); intValue <= ((Integer) this.f41184a.lastKey()).intValue(); intValue++) {
            if (!mo50715m(intValue).equals(zzae.mo50715m(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo50706f() {
        return Boolean.TRUE;
    }

    /* renamed from: g */
    public final String mo50707g() {
        return mo50716n(",");
    }

    /* renamed from: h */
    public final boolean mo50708h(String str) {
        return "length".equals(str) || this.f41185c.containsKey(str);
    }

    public final int hashCode() {
        return this.f41184a.hashCode() * 31;
    }

    /* renamed from: i */
    public final void mo50710i(String str, zzap zzap) {
        if (zzap == null) {
            this.f41185c.remove(str);
        } else {
            this.f41185c.put(str, zzap);
        }
    }

    public final Iterator iterator() {
        return new zzad(this);
    }

    /* renamed from: j */
    public final Iterator mo50712j() {
        return new zzac(this, this.f41184a.keySet().iterator(), this.f41185c.keySet().iterator());
    }

    /* renamed from: k */
    public final int mo50713k() {
        return this.f41184a.size();
    }

    /* renamed from: l */
    public final int mo50714l() {
        if (this.f41184a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f41184a.lastKey()).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.zzap) r1.f41184a.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap mo50715m(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo50714l()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo50724w(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f41184a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.f41197i
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.mo50715m(int):com.google.android.gms.internal.measurement.zzap");
    }

    /* renamed from: n */
    public final String mo50716n(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f41184a.isEmpty()) {
            for (int i = 0; i < mo50714l(); i++) {
                zzap m = mo50715m(i);
                sb.append(str);
                if (!(m instanceof zzau) && !(m instanceof zzan)) {
                    sb.append(m.mo50707g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: o */
    public final Iterator mo50717o() {
        return this.f41184a.keySet().iterator();
    }

    /* renamed from: p */
    public final List mo50718p() {
        ArrayList arrayList = new ArrayList(mo50714l());
        for (int i = 0; i < mo50714l(); i++) {
            arrayList.add(mo50715m(i));
        }
        return arrayList;
    }

    /* renamed from: q */
    public final void mo50719q() {
        this.f41184a.clear();
    }

    /* renamed from: s */
    public final void mo50720s(int i, zzap zzap) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo50714l()) {
            mo50723u(i, zzap);
        } else {
            for (int intValue = ((Integer) this.f41184a.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f41184a;
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzap2 = (zzap) sortedMap.get(valueOf);
                if (zzap2 != null) {
                    mo50723u(intValue + 1, zzap2);
                    this.f41184a.remove(valueOf);
                }
            }
            mo50723u(i, zzap);
        }
    }

    /* renamed from: t */
    public final void mo50721t(int i) {
        int intValue = ((Integer) this.f41184a.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f41184a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f41184a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f41184a.put(valueOf, zzap.f41197i);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f41184a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f41184a;
                    Integer valueOf2 = Integer.valueOf(i);
                    zzap zzap = (zzap) sortedMap2.get(valueOf2);
                    if (zzap != null) {
                        this.f41184a.put(Integer.valueOf(i - 1), zzap);
                        this.f41184a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return mo50716n(",");
    }

    /* renamed from: u */
    public final void mo50723u(int i, zzap zzap) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (zzap == null) {
            this.f41184a.remove(Integer.valueOf(i));
        } else {
            this.f41184a.put(Integer.valueOf(i), zzap);
        }
    }

    /* renamed from: w */
    public final boolean mo50724w(int i) {
        if (i >= 0 && i <= ((Integer) this.f41184a.lastKey()).intValue()) {
            return this.f41184a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo50723u(i, (zzap) list.get(i));
            }
        }
    }
}
