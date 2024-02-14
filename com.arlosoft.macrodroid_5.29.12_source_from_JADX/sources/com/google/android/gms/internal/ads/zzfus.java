package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfus extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ zzfux f36440a;

    zzfus(zzfux zzfux) {
        this.f36440a = zzfux;
    }

    public final void clear() {
        this.f36440a.clear();
    }

    public final boolean contains(Object obj) {
        Map n = this.f36440a.mo46381n();
        if (n != null) {
            return n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int e = this.f36440a.m51059z(entry.getKey());
            if (e == -1 || !zzfss.m50929a(zzfux.m51052l(this.f36440a, e), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        zzfux zzfux = this.f36440a;
        Map n = zzfux.mo46381n();
        if (n != null) {
            return n.entrySet().iterator();
        }
        return new zzfuq(zzfux);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = r0.m51058y();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfux r0 = r10.f36440a
            java.util.Map r0 = r0.mo46381n()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r11 = r0.remove(r11)
            return r11
        L_0x0011:
            boolean r0 = r11 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x005f
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            com.google.android.gms.internal.ads.zzfux r0 = r10.f36440a
            boolean r2 = r0.mo46388u()
            if (r2 == 0) goto L_0x0021
            return r1
        L_0x0021:
            int r0 = r0.m51058y()
            java.lang.Object r3 = r11.getKey()
            java.lang.Object r4 = r11.getValue()
            com.google.android.gms.internal.ads.zzfux r11 = r10.f36440a
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzfux.m51053m(r11)
            com.google.android.gms.internal.ads.zzfux r11 = r10.f36440a
            int[] r7 = r11.m51042D()
            com.google.android.gms.internal.ads.zzfux r11 = r10.f36440a
            java.lang.Object[] r8 = r11.m51043a()
            com.google.android.gms.internal.ads.zzfux r11 = r10.f36440a
            java.lang.Object[] r9 = r11.m51044b()
            r5 = r0
            int r11 = com.google.android.gms.internal.ads.zzfuy.m51068b(r3, r4, r5, r6, r7, r8, r9)
            r2 = -1
            if (r11 != r2) goto L_0x004e
            return r1
        L_0x004e:
            com.google.android.gms.internal.ads.zzfux r1 = r10.f36440a
            r1.mo46387t(r11, r0)
            com.google.android.gms.internal.ads.zzfux r11 = r10.f36440a
            com.google.android.gms.internal.ads.zzfux.m51046d(r11)
            com.google.android.gms.internal.ads.zzfux r11 = r10.f36440a
            r11.mo46383q()
            r11 = 1
            return r11
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfus.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.f36440a.size();
    }
}
