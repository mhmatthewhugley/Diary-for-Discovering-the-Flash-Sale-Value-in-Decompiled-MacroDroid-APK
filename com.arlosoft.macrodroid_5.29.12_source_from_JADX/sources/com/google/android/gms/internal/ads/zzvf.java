package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzvf extends zzcu {

    /* renamed from: S */
    public static final zzvf f38681S;
    @Deprecated

    /* renamed from: T */
    public static final zzvf f38682T;

    /* renamed from: U */
    public static final zzn f38683U = zzvb.f38672a;

    /* renamed from: D */
    public final boolean f38684D;

    /* renamed from: E */
    public final boolean f38685E;

    /* renamed from: F */
    public final boolean f38686F;

    /* renamed from: G */
    public final boolean f38687G;

    /* renamed from: H */
    public final boolean f38688H;

    /* renamed from: I */
    public final boolean f38689I;

    /* renamed from: J */
    public final boolean f38690J;

    /* renamed from: K */
    public final boolean f38691K;

    /* renamed from: L */
    public final boolean f38692L;

    /* renamed from: M */
    public final boolean f38693M;

    /* renamed from: N */
    public final boolean f38694N;

    /* renamed from: O */
    public final boolean f38695O;

    /* renamed from: P */
    public final boolean f38696P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final SparseArray f38697Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final SparseBooleanArray f38698R;

    static {
        zzvf zzvf = new zzvf(new zzvd());
        f38681S = zzvf;
        f38682T = zzvf;
    }

    private zzvf(zzvd zzvd) {
        super(zzvd);
        this.f38684D = zzvd.f38673q;
        this.f38685E = false;
        this.f38686F = zzvd.f38674r;
        this.f38687G = false;
        this.f38688H = zzvd.f38675s;
        this.f38689I = false;
        this.f38690J = false;
        this.f38691K = false;
        this.f38692L = false;
        this.f38693M = zzvd.f38676t;
        this.f38694N = zzvd.f38677u;
        this.f38695O = false;
        this.f38696P = zzvd.f38678v;
        this.f38697Q = zzvd.f38679w;
        this.f38698R = zzvd.f38680x;
    }

    /* renamed from: d */
    public static zzvf m55182d(Context context) {
        return new zzvf(new zzvd(context));
    }

    /* renamed from: c */
    public final zzvd mo48290c() {
        return new zzvd(this, (zzvc) null);
    }

    @Deprecated
    @Nullable
    /* renamed from: e */
    public final zzvh mo48291e(int i, zzuh zzuh) {
        Map map = (Map) this.f38697Q.get(i);
        if (map != null) {
            return (zzvh) map.get(zzuh);
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvf.class == obj.getClass()) {
            zzvf zzvf = (zzvf) obj;
            if (super.equals(zzvf) && this.f38684D == zzvf.f38684D && this.f38686F == zzvf.f38686F && this.f38688H == zzvf.f38688H && this.f38693M == zzvf.f38693M && this.f38694N == zzvf.f38694N && this.f38696P == zzvf.f38696P) {
                SparseBooleanArray sparseBooleanArray = this.f38698R;
                SparseBooleanArray sparseBooleanArray2 = zzvf.f38698R;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f38697Q;
                            SparseArray sparseArray2 = zzvf.f38697Q;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzuh zzuh = (zzuh) entry.getKey();
                                                if (map2.containsKey(zzuh)) {
                                                    if (!zzen.m49181t(entry.getValue(), map2.get(zzuh))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo48292f(int i) {
        return this.f38698R.get(i);
    }

    @Deprecated
    /* renamed from: g */
    public final boolean mo48293g(int i, zzuh zzuh) {
        Map map = (Map) this.f38697Q.get(i);
        return map != null && map.containsKey(zzuh);
    }

    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.f38684D ? 1 : 0)) * 961) + (this.f38686F ? 1 : 0)) * 961) + (this.f38688H ? 1 : 0)) * 28629151) + (this.f38693M ? 1 : 0)) * 31) + (this.f38694N ? 1 : 0)) * 961) + (this.f38696P ? 1 : 0);
    }
}
