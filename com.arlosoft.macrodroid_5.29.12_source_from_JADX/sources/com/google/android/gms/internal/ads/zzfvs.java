package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfvs extends zzfvi implements Set {

    /* renamed from: c */
    private transient zzfvn f36485c;

    zzfvs() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static boolean m51159B(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: l */
    static int m51160l(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        zzfsx.m50941f(max < 1073741824, "collection too large");
        return BasicMeasure.EXACTLY;
    }

    /* renamed from: n */
    public static zzfvr m51161n(int i) {
        return new zzfvr(i);
    }

    /* renamed from: q */
    public static zzfvs m51163q(Collection collection) {
        Object[] array = collection.toArray();
        return m51166z(array.length, array);
    }

    @SafeVarargs
    /* renamed from: t */
    public static zzfvs m51164t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return m51166z(12, objArr2);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static zzfvs m51166z(int i, Object... objArr) {
        if (i == 0) {
            return zzfxc.f36525z;
        }
        if (i != 1) {
            int l = m51160l(i);
            Object[] objArr2 = new Object[l];
            int i2 = l - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                zzfwu.m51205a(obj, i5);
                int hashCode = obj.hashCode();
                int a = zzfvf.m51100a(hashCode);
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
                return new zzfxj(obj3);
            } else if (m51160l(i4) < l / 2) {
                return m51166z(i4, objArr);
            } else {
                if (m51159B(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzfxc(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfxj(obj4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfvs) || !mo46477w() || !((zzfvs) obj).mo46477w() || hashCode() == obj.hashCode()) {
            return zzfxi.m51244c(this, obj);
        }
        return false;
    }

    /* renamed from: h */
    public zzfvn mo46418h() {
        zzfvn zzfvn = this.f36485c;
        if (zzfvn != null) {
            return zzfvn;
        }
        zzfvn m = mo46476m();
        this.f36485c = m;
        return m;
    }

    public int hashCode() {
        return zzfxi.m51242a(this);
    }

    /* renamed from: i */
    public abstract zzfxm iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public zzfvn mo46476m() {
        return zzfvn.m51130n(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo46477w() {
        return false;
    }
}
