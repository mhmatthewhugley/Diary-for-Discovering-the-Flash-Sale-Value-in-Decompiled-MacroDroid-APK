package com.google.android.gms.internal.places;

import java.util.Collections;
import java.util.List;

final class zzbw extends zzbu {

    /* renamed from: c */
    private static final Class<?> f45306c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzbw() {
        super();
    }

    /* renamed from: e */
    private static <E> List<E> m63392e(Object obj, long j) {
        return (List) zzdy.m63667G(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53500a(Object obj, long j) {
        Object obj2;
        List list = (List) zzdy.m63667G(obj, j);
        if (list instanceof zzbr) {
            obj2 = ((zzbr) list).mo53493t0();
        } else if (!f45306c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzcw) || !(list instanceof zzbh)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzbh zzbh = (zzbh) list;
                if (zzbh.mo53474N()) {
                    zzbh.mo53475h2();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzdy.m63682g(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.places.zzbs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.places.zzbs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.places.zzbs} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo53501b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = m63392e(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = m63392e(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0035
            boolean r2 = r1 instanceof com.google.android.gms.internal.places.zzbr
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.places.zzbs r1 = new com.google.android.gms.internal.places.zzbs
            r1.<init>((int) r0)
            goto L_0x0031
        L_0x001c:
            boolean r2 = r1 instanceof com.google.android.gms.internal.places.zzcw
            if (r2 == 0) goto L_0x002c
            boolean r2 = r1 instanceof com.google.android.gms.internal.places.zzbh
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.internal.places.zzbh r1 = (com.google.android.gms.internal.places.zzbh) r1
            com.google.android.gms.internal.places.zzbh r0 = r1.mo53396E(r0)
            r1 = r0
            goto L_0x0031
        L_0x002c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0031:
            com.google.android.gms.internal.places.zzdy.m63682g(r5, r7, r1)
            goto L_0x0087
        L_0x0035:
            java.lang.Class<?> r2 = f45306c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0053
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.places.zzdy.m63682g(r5, r7, r2)
        L_0x0051:
            r1 = r2
            goto L_0x0087
        L_0x0053:
            boolean r2 = r1 instanceof com.google.android.gms.internal.places.zzdt
            if (r2 == 0) goto L_0x006a
            com.google.android.gms.internal.places.zzbs r2 = new com.google.android.gms.internal.places.zzbs
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.places.zzdt r1 = (com.google.android.gms.internal.places.zzdt) r1
            r2.addAll(r1)
            com.google.android.gms.internal.places.zzdy.m63682g(r5, r7, r2)
            goto L_0x0051
        L_0x006a:
            boolean r2 = r1 instanceof com.google.android.gms.internal.places.zzcw
            if (r2 == 0) goto L_0x0087
            boolean r2 = r1 instanceof com.google.android.gms.internal.places.zzbh
            if (r2 == 0) goto L_0x0087
            r2 = r1
            com.google.android.gms.internal.places.zzbh r2 = (com.google.android.gms.internal.places.zzbh) r2
            boolean r3 = r2.mo53474N()
            if (r3 != 0) goto L_0x0087
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.places.zzbh r1 = r2.mo53396E(r1)
            com.google.android.gms.internal.places.zzdy.m63682g(r5, r7, r1)
        L_0x0087:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0096
            if (r2 <= 0) goto L_0x0096
            r1.addAll(r6)
        L_0x0096:
            if (r0 <= 0) goto L_0x0099
            r6 = r1
        L_0x0099:
            com.google.android.gms.internal.places.zzdy.m63682g(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzbw.mo53501b(java.lang.Object, java.lang.Object, long):void");
    }
}
