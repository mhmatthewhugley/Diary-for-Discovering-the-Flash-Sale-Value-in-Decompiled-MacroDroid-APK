package com.google.android.gms.internal.nearby;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzss extends zzsn implements Set {

    /* renamed from: c */
    private transient zzsq f45108c;

    zzss() {
    }

    /* renamed from: l */
    static int m63024l(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return BasicMeasure.EXACTLY;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static zzss m63026q(int i, Object... objArr) {
        if (i == 0) {
            return zzsw.f45115z;
        }
        if (i != 1) {
            int l = m63024l(i);
            Object[] objArr2 = new Object[l];
            int i2 = l - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                zzsu.m63031a(obj, i5);
                int hashCode = obj.hashCode();
                int a = zzsk.m62995a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzsx(obj3);
            } else if (m63024l(i4) < l / 2) {
                return m63026q(i4, objArr);
            } else {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzsw(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzsx(obj4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzss) && mo53274p() && ((zzss) obj).mo53274p() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: h */
    public zzsq mo53243h() {
        zzsq zzsq = this.f45108c;
        if (zzsq != null) {
            return zzsq;
        }
        zzsq m = mo53273m();
        this.f45108c = m;
        return m;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: i */
    public abstract zzsy iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public zzsq mo53273m() {
        return zzsq.m63011m(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo53274p() {
        return false;
    }
}
