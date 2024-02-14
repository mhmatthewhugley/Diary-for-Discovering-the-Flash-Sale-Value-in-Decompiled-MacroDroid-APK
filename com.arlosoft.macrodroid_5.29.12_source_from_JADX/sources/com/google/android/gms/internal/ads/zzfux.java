package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfux extends AbstractMap implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final Object f36450A = new Object();

    /* renamed from: a */
    private transient Object f36451a;

    /* renamed from: c */
    transient int[] f36452c;

    /* renamed from: d */
    transient Object[] f36453d;

    /* renamed from: f */
    transient Object[] f36454f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public transient int f36455g;

    /* renamed from: o */
    private transient int f36456o;

    /* renamed from: p */
    private transient Set f36457p;

    /* renamed from: s */
    private transient Set f36458s;

    /* renamed from: z */
    private transient Collection f36459z;

    zzfux() {
        mo46384r(3);
    }

    /* renamed from: A */
    private final int m51039A(int i, int i2, int i3, int i4) {
        Object d = zzfuy.m51070d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzfuy.m51071e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f36451a;
        obj.getClass();
        int[] D = m51042D();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = zzfuy.m51069c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = D[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = zzfuy.m51069c(d, i10);
                zzfuy.m51071e(d, i10, c);
                D[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f36451a = d;
        m51041C(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final Object m51040B(Object obj) {
        if (mo46388u()) {
            return f36450A;
        }
        int y = m51058y();
        Object obj2 = this.f36451a;
        obj2.getClass();
        int b = zzfuy.m51068b(obj, (Object) null, y, obj2, m51042D(), m51043a(), (Object[]) null);
        if (b == -1) {
            return f36450A;
        }
        Object obj3 = m51044b()[b];
        mo46387t(b, y);
        this.f36456o--;
        mo46383q();
        return obj3;
    }

    /* renamed from: C */
    private final void m51041C(int i) {
        this.f36455g = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f36455g & -32);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final int[] m51042D() {
        int[] iArr = this.f36452c;
        iArr.getClass();
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Object[] m51043a() {
        Object[] objArr = this.f36453d;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Object[] m51044b() {
        Object[] objArr = this.f36454f;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: d */
    static /* synthetic */ int m51046d(zzfux zzfux) {
        int i = zzfux.f36456o;
        zzfux.f36456o = i - 1;
        return i;
    }

    /* renamed from: i */
    static /* synthetic */ Object m51049i(zzfux zzfux, int i) {
        return zzfux.m51043a()[i];
    }

    /* renamed from: l */
    static /* synthetic */ Object m51052l(zzfux zzfux, int i) {
        return zzfux.m51044b()[i];
    }

    /* renamed from: m */
    static /* synthetic */ Object m51053m(zzfux zzfux) {
        Object obj = zzfux.f36451a;
        obj.getClass();
        return obj;
    }

    /* renamed from: p */
    static /* synthetic */ void m51054p(zzfux zzfux, int i, Object obj) {
        zzfux.m51044b()[i] = obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final int m51058y() {
        return (1 << (this.f36455g & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final int m51059z(Object obj) {
        if (mo46388u()) {
            return -1;
        }
        int b = zzfvf.m51101b(obj);
        int y = m51058y();
        Object obj2 = this.f36451a;
        obj2.getClass();
        int c = zzfuy.m51069c(obj2, b & y);
        if (c != 0) {
            int i = ~y;
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = m51042D()[i3];
                if ((i4 & i) == i2 && zzfss.m50929a(obj, m51043a()[i3])) {
                    return i3;
                }
                c = i4 & y;
            } while (c != 0);
        }
        return -1;
    }

    public final void clear() {
        if (!mo46388u()) {
            mo46383q();
            Map n = mo46381n();
            if (n != null) {
                this.f36455g = zzfxs.m51255b(size(), 3, 1073741823);
                n.clear();
                this.f36451a = null;
                this.f36456o = 0;
                return;
            }
            Arrays.fill(m51043a(), 0, this.f36456o, (Object) null);
            Arrays.fill(m51044b(), 0, this.f36456o, (Object) null);
            Object obj = this.f36451a;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(m51042D(), 0, this.f36456o, 0);
            this.f36456o = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map n = mo46381n();
        if (n != null) {
            return n.containsKey(obj);
        }
        return m51059z(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map n = mo46381n();
        if (n != null) {
            return n.containsValue(obj);
        }
        for (int i = 0; i < this.f36456o; i++) {
            if (zzfss.m50929a(obj, m51044b()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f36458s;
        if (set != null) {
            return set;
        }
        zzfus zzfus = new zzfus(this);
        this.f36458s = zzfus;
        return zzfus;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo46376g() {
        return isEmpty() ? -1 : 0;
    }

    public final Object get(Object obj) {
        Map n = mo46381n();
        if (n != null) {
            return n.get(obj);
        }
        int z = m51059z(obj);
        if (z == -1) {
            return null;
        }
        return m51044b()[z];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo46378h(int i) {
        int i2 = i + 1;
        if (i2 < this.f36456o) {
            return i2;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.f36457p;
        if (set != null) {
            return set;
        }
        zzfuu zzfuu = new zzfuu(this);
        this.f36457p = zzfuu;
        return zzfuu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Map mo46381n() {
        Object obj = this.f36451a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (mo46388u()) {
            zzfsx.m50944i(mo46388u(), "Arrays already allocated");
            int i = this.f36455g;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = BasicMeasure.EXACTLY;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f36451a = zzfuy.m51070d(max2);
            m51041C(max2 - 1);
            this.f36452c = new int[i];
            this.f36453d = new Object[i];
            this.f36454f = new Object[i];
        }
        Map n = mo46381n();
        if (n != null) {
            return n.put(obj3, obj4);
        }
        int[] D = m51042D();
        Object[] a = m51043a();
        Object[] b = m51044b();
        int i2 = this.f36456o;
        int i3 = i2 + 1;
        int b2 = zzfvf.m51101b(obj);
        int y = m51058y();
        int i4 = b2 & y;
        Object obj5 = this.f36451a;
        obj5.getClass();
        int c = zzfuy.m51069c(obj5, i4);
        if (c != 0) {
            int i5 = ~y;
            int i6 = b2 & i5;
            int i7 = 0;
            while (true) {
                int i8 = c - 1;
                int i9 = D[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !zzfss.m50929a(obj3, a[i8])) {
                    int i11 = i9 & y;
                    i7++;
                    if (i11 != 0) {
                        c = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m51058y() + 1, 1.0f);
                        for (int g = mo46376g(); g >= 0; g = mo46378h(g)) {
                            linkedHashMap.put(m51043a()[g], m51044b()[g]);
                        }
                        this.f36451a = linkedHashMap;
                        this.f36452c = null;
                        this.f36453d = null;
                        this.f36454f = null;
                        mo46383q();
                        return linkedHashMap.put(obj3, obj4);
                    } else if (i3 > y) {
                        y = m51039A(y, zzfuy.m51067a(y), b2, i2);
                    } else {
                        D[i8] = (i3 & y) | i10;
                    }
                } else {
                    Object obj6 = b[i8];
                    b[i8] = obj4;
                    return obj6;
                }
            }
        } else if (i3 > y) {
            y = m51039A(y, zzfuy.m51067a(y), b2, i2);
        } else {
            Object obj7 = this.f36451a;
            obj7.getClass();
            zzfuy.m51071e(obj7, i4, i3);
        }
        int length = m51042D().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f36452c = Arrays.copyOf(m51042D(), min);
            this.f36453d = Arrays.copyOf(m51043a(), min);
            this.f36454f = Arrays.copyOf(m51044b(), min);
        }
        m51042D()[i2] = (~y) & b2;
        m51043a()[i2] = obj3;
        m51044b()[i2] = obj4;
        this.f36456o = i3;
        mo46383q();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo46383q() {
        this.f36455g += 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo46384r(int i) {
        this.f36455g = zzfxs.m51255b(8, 1, 1073741823);
    }

    public final Object remove(Object obj) {
        Map n = mo46381n();
        if (n != null) {
            return n.remove(obj);
        }
        Object B = m51040B(obj);
        if (B == f36450A) {
            return null;
        }
        return B;
    }

    public final int size() {
        Map n = mo46381n();
        return n != null ? n.size() : this.f36456o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo46387t(int i, int i2) {
        Object obj = this.f36451a;
        obj.getClass();
        int[] D = m51042D();
        Object[] a = m51043a();
        Object[] b = m51044b();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = a[size];
            a[i] = obj2;
            b[i] = b[size];
            a[size] = null;
            b[size] = null;
            D[i] = D[size];
            D[size] = 0;
            int b2 = zzfvf.m51101b(obj2) & i2;
            int c = zzfuy.m51069c(obj, b2);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int i5 = D[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c = i6;
                    } else {
                        D[i4] = ((i + 1) & i2) | (i5 & (~i2));
                        return;
                    }
                }
            } else {
                zzfuy.m51071e(obj, b2, i + 1);
            }
        } else {
            a[i] = null;
            b[i] = null;
            D[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo46388u() {
        return this.f36451a == null;
    }

    public final Collection values() {
        Collection collection = this.f36459z;
        if (collection != null) {
            return collection;
        }
        zzfuw zzfuw = new zzfuw(this);
        this.f36459z = zzfuw;
        return zzfuw;
    }

    zzfux(int i) {
        mo46384r(8);
    }
}
