package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzuf {

    /* renamed from: a */
    private int f38618a;

    /* renamed from: b */
    private final SparseArray f38619b;

    /* renamed from: c */
    private final zzdh f38620c;

    public zzuf() {
        zzue zzue = zzue.f38617a;
        throw null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    public final java.lang.Object mo48258a(int r4) {
        /*
            r3 = this;
            int r0 = r3.f38618a
            r1 = -1
            if (r0 == r1) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0 = 0
        L_0x0007:
            r3.f38618a = r0
        L_0x0009:
            int r0 = r3.f38618a
            if (r0 > 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            android.util.SparseArray r2 = r3.f38619b
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L_0x001a
            int r0 = r3.f38618a
            int r0 = r0 + r1
            goto L_0x0007
        L_0x001a:
            int r0 = r3.f38618a
            android.util.SparseArray r2 = r3.f38619b
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L_0x0038
            android.util.SparseArray r0 = r3.f38619b
            int r2 = r3.f38618a
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L_0x0038
            int r0 = r3.f38618a
            int r0 = r0 + 1
            r3.f38618a = r0
            goto L_0x001a
        L_0x0038:
            android.util.SparseArray r4 = r3.f38619b
            int r0 = r3.f38618a
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuf.mo48258a(int):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo48259b() {
        SparseArray sparseArray = this.f38619b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: c */
    public final void mo48260c(int i, Object obj) {
        boolean z = true;
        if (this.f38618a == -1) {
            zzdd.m47212f(this.f38619b.size() == 0);
            this.f38618a = 0;
        }
        if (this.f38619b.size() > 0) {
            SparseArray sparseArray = this.f38619b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z = false;
            }
            zzdd.m47210d(z);
            if (keyAt == i) {
                SparseArray sparseArray2 = this.f38619b;
                zzty.m55076A((zztw) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f38619b.append(i, obj);
    }

    /* renamed from: d */
    public final void mo48261d() {
        for (int i = 0; i < this.f38619b.size(); i++) {
            zzty.m55076A((zztw) this.f38619b.valueAt(i));
        }
        this.f38618a = -1;
        this.f38619b.clear();
    }

    /* renamed from: e */
    public final void mo48262e(int i) {
        int i2 = 0;
        while (i2 < this.f38619b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f38619b.keyAt(i3)) {
                zzty.m55076A((zztw) this.f38619b.valueAt(i2));
                this.f38619b.removeAt(i2);
                int i4 = this.f38618a;
                if (i4 > 0) {
                    this.f38618a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo48263f() {
        return this.f38619b.size() == 0;
    }

    public zzuf(zzdh zzdh) {
        this.f38619b = new SparseArray();
        this.f38620c = zzdh;
        this.f38618a = -1;
    }
}
