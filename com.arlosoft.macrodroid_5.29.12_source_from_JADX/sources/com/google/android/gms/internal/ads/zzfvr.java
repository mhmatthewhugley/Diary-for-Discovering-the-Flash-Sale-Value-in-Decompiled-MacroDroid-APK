package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfvr extends zzfvg {

    /* renamed from: d */
    Object[] f36483d;

    /* renamed from: e */
    private int f36484e;

    public zzfvr() {
        super(4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfvh mo46408a(Object obj) {
        mo46471f(obj);
        return this;
    }

    /* renamed from: f */
    public final zzfvr mo46471f(Object obj) {
        int length;
        Objects.requireNonNull(obj);
        if (this.f36483d == null || zzfvs.m51160l(this.f36467b) > (length = this.f36483d.length)) {
            this.f36483d = null;
            super.mo46409c(obj);
            return this;
        }
        int i = length - 1;
        int hashCode = obj.hashCode();
        int a = zzfvf.m51100a(hashCode);
        while (true) {
            int i2 = a & i;
            Object[] objArr = this.f36483d;
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                if (obj2.equals(obj)) {
                    break;
                }
                a = i2 + 1;
            } else {
                objArr[i2] = obj;
                this.f36484e += hashCode;
                super.mo46409c(obj);
                break;
            }
        }
        return this;
    }

    /* renamed from: g */
    public final zzfvr mo46472g(Iterable iterable) {
        if (this.f36483d != null) {
            for (Object f : iterable) {
                mo46471f(f);
            }
        } else {
            super.mo46410d(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.zzfxc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.zzfvs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.ads.zzfxc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.internal.ads.zzfxc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfvs mo46473h() {
        /*
            r9 = this;
            int r0 = r9.f36467b
            if (r0 == 0) goto L_0x0056
            r1 = 1
            if (r0 == r1) goto L_0x0048
            java.lang.Object[] r2 = r9.f36483d
            if (r2 == 0) goto L_0x0034
            int r0 = com.google.android.gms.internal.ads.zzfvs.m51160l(r0)
            java.lang.Object[] r2 = r9.f36483d
            int r2 = r2.length
            if (r0 != r2) goto L_0x0034
            int r0 = r9.f36467b
            java.lang.Object[] r2 = r9.f36466a
            int r3 = r2.length
            boolean r3 = com.google.android.gms.internal.ads.zzfvs.m51159B(r0, r3)
            if (r3 == 0) goto L_0x0023
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
        L_0x0023:
            r4 = r2
            com.google.android.gms.internal.ads.zzfxc r0 = new com.google.android.gms.internal.ads.zzfxc
            int r5 = r9.f36484e
            java.lang.Object[] r6 = r9.f36483d
            int r2 = r6.length
            int r7 = r2 + -1
            int r8 = r9.f36467b
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0042
        L_0x0034:
            int r0 = r9.f36467b
            java.lang.Object[] r2 = r9.f36466a
            com.google.android.gms.internal.ads.zzfvs r0 = com.google.android.gms.internal.ads.zzfvs.m51166z(r0, r2)
            int r2 = r0.size()
            r9.f36467b = r2
        L_0x0042:
            r9.f36468c = r1
            r1 = 0
            r9.f36483d = r1
            return r0
        L_0x0048:
            java.lang.Object[] r0 = r9.f36466a
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            com.google.android.gms.internal.ads.zzfxj r1 = new com.google.android.gms.internal.ads.zzfxj
            r1.<init>(r0)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzfxc r0 = com.google.android.gms.internal.ads.zzfxc.f36525z
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfvr.mo46473h():com.google.android.gms.internal.ads.zzfvs");
    }

    zzfvr(int i) {
        super(i);
        this.f36483d = new Object[zzfvs.m51160l(i)];
    }
}
