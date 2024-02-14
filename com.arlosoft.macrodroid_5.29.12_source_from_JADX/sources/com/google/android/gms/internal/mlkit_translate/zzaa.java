package com.google.android.gms.internal.mlkit_translate;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public abstract class zzaa extends zzr implements Set {

    /* renamed from: c */
    private transient zzv f43084c;

    zzaa() {
    }

    /* renamed from: j */
    static int m61553j(int i) {
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

    /* renamed from: n */
    public static zzaa m61555n() {
        return zzaj.f43103z;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static zzaa m61556q(int i, Object... objArr) {
        if (i == 0) {
            return zzaj.f43103z;
        }
        if (i != 1) {
            int j = m61553j(i);
            Object[] objArr2 = new Object[j];
            int i2 = j - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                zzac.m61561a(obj, i5);
                int hashCode = obj.hashCode();
                int a = zzo.m62080a(hashCode);
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
                return new zzal(obj3);
            } else if (m61553j(i4) < j / 2) {
                return m61556q(i4, objArr);
            } else {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzaj(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzal(obj4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzaa) && mo52028p() && ((zzaa) obj).mo52028p() && hashCode() != obj.hashCode()) {
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
    public abstract zzam iterator();

    public int hashCode() {
        return zzak.m61585a(this);
    }

    /* renamed from: k */
    public final zzv mo52026k() {
        zzv zzv = this.f43084c;
        if (zzv != null) {
            return zzv;
        }
        zzv l = mo52027l();
        this.f43084c = l;
        return l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public zzv mo52027l() {
        return zzv.m62253l(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo52028p() {
        return false;
    }
}
