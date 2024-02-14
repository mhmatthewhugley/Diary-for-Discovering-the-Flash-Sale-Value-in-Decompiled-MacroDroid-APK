package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzavu extends zzavw {

    /* renamed from: P0 */
    public final long f25852P0;

    /* renamed from: Q0 */
    public final List f25853Q0 = new ArrayList();

    /* renamed from: R0 */
    public final List f25854R0 = new ArrayList();

    public zzavu(int i, long j) {
        super(i);
        this.f25852P0 = j;
    }

    /* renamed from: d */
    public final zzavu mo42132d(int i) {
        int size = this.f25854R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzavu zzavu = (zzavu) this.f25854R0.get(i2);
            if (zzavu.f25948a == i) {
                return zzavu;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final zzavv mo42133e(int i) {
        int size = this.f25853Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzavv zzavv = (zzavv) this.f25853Q0.get(i2);
            if (zzavv.f25948a == i) {
                return zzavv;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo42134f(zzavu zzavu) {
        this.f25854R0.add(zzavu);
    }

    /* renamed from: g */
    public final void mo42135g(zzavv zzavv) {
        this.f25853Q0.add(zzavv);
    }

    public final String toString() {
        String c = zzavw.m42635c(this.f25948a);
        String arrays = Arrays.toString(this.f25853Q0.toArray());
        String arrays2 = Arrays.toString(this.f25854R0.toArray());
        return c + " leaves: " + arrays + " containers: " + arrays2;
    }
}
