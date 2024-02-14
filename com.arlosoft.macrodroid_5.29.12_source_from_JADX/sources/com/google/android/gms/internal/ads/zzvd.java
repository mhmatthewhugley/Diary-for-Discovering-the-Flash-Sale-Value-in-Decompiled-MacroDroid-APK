package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzvd extends zzct {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f38673q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f38674r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f38675s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f38676t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f38677u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f38678v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final SparseArray f38679w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final SparseBooleanArray f38680x;

    @Deprecated
    public zzvd() {
        this.f38679w = new SparseArray();
        this.f38680x = new SparseBooleanArray();
        m55177v();
    }

    /* renamed from: v */
    private final void m55177v() {
        this.f38673q = true;
        this.f38674r = true;
        this.f38675s = true;
        this.f38676t = true;
        this.f38677u = true;
        this.f38678v = true;
    }

    /* renamed from: e */
    public final /* synthetic */ zzct mo44371e(int i, int i2, boolean z) {
        super.mo44371e(i, i2, true);
        return this;
    }

    /* renamed from: o */
    public final zzvd mo48289o(int i, boolean z) {
        if (this.f38680x.get(i) == z) {
            return this;
        }
        if (z) {
            this.f38680x.put(i, true);
        } else {
            this.f38680x.delete(i);
        }
        return this;
    }

    public zzvd(Context context) {
        super.mo44370d(context);
        Point b = zzen.m49154b(context);
        mo44371e(b.x, b.y, true);
        this.f38679w = new SparseArray();
        this.f38680x = new SparseBooleanArray();
        m55177v();
    }

    /* synthetic */ zzvd(zzvf zzvf, zzvc zzvc) {
        super(zzvf);
        this.f38673q = zzvf.f38684D;
        this.f38674r = zzvf.f38686F;
        this.f38675s = zzvf.f38688H;
        this.f38676t = zzvf.f38693M;
        this.f38677u = zzvf.f38694N;
        this.f38678v = zzvf.f38696P;
        SparseArray a = zzvf.f38697Q;
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < a.size(); i++) {
            sparseArray.put(a.keyAt(i), new HashMap((Map) a.valueAt(i)));
        }
        this.f38679w = sparseArray;
        this.f38680x = zzvf.f38698R.clone();
    }
}
