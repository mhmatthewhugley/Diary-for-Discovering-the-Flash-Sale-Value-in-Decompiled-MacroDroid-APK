package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzaq implements zzap {

    /* renamed from: a */
    private final String f41205a;

    /* renamed from: c */
    private final ArrayList f41206c;

    public zzaq(String str, List list) {
        this.f41205a = str;
        ArrayList arrayList = new ArrayList();
        this.f41206c = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo50747a() {
        return this.f41205a;
    }

    /* renamed from: b */
    public final ArrayList mo50748b() {
        return this.f41206c;
    }

    /* renamed from: c */
    public final zzap mo50702c(String str, zzg zzg, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    /* renamed from: d */
    public final zzap mo50703d() {
        return this;
    }

    /* renamed from: e */
    public final Double mo50704e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaq)) {
            return false;
        }
        zzaq zzaq = (zzaq) obj;
        String str = this.f41205a;
        if (str == null ? zzaq.f41205a == null : str.equals(zzaq.f41205a)) {
            return this.f41206c.equals(zzaq.f41206c);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean mo50706f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: g */
    public final String mo50707g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f41205a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f41206c.hashCode();
    }

    /* renamed from: j */
    public final Iterator mo50712j() {
        return null;
    }
}
