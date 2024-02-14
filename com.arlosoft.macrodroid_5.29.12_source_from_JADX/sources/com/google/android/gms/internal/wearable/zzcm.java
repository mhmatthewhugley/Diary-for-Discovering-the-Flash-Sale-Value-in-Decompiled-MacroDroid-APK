package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzcm extends zzcq {

    /* renamed from: c */
    private static final Class f45657c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzcm() {
        super((zzcp) null);
    }

    /* synthetic */ zzcm(zzcl zzcl) {
        super((zzcp) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53972a(Object obj, long j) {
        Object obj2;
        List list = (List) zzeo.m64499k(obj, j);
        if (list instanceof zzck) {
            obj2 = ((zzck) list).mo53966b();
        } else if (!f45657c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzdj) || !(list instanceof zzcc)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzcc zzcc = (zzcc) list;
                if (zzcc.mo53802a()) {
                    zzcc.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzeo.m64512x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.wearable.zzcj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.wearable.zzcj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.wearable.zzcj} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53973b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.wearable.zzeo.m64499k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.wearable.zzeo.m64499k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.wearable.zzck
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.wearable.zzcj r1 = new com.google.android.gms.internal.wearable.zzcj
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.wearable.zzdj
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.wearable.zzcc
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.wearable.zzcc r1 = (com.google.android.gms.internal.wearable.zzcc) r1
            com.google.android.gms.internal.wearable.zzcc r0 = r1.mo53817G(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.wearable.zzeo.m64512x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class r2 = f45657c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.wearable.zzeo.m64512x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.wearable.zzej
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.wearable.zzcj r2 = new com.google.android.gms.internal.wearable.zzcj
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.wearable.zzej r1 = (com.google.android.gms.internal.wearable.zzej) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.wearable.zzeo.m64512x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.wearable.zzdj
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.wearable.zzcc
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.wearable.zzcc r2 = (com.google.android.gms.internal.wearable.zzcc) r2
            boolean r3 = r2.mo53802a()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.wearable.zzcc r1 = r2.mo53817G(r1)
            com.google.android.gms.internal.wearable.zzeo.m64512x(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = r1
        L_0x00a2:
            com.google.android.gms.internal.wearable.zzeo.m64512x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzcm.mo53973b(java.lang.Object, java.lang.Object, long):void");
    }
}
