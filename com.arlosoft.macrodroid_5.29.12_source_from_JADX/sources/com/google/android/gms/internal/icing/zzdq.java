package com.google.android.gms.internal.icing;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzdq extends zzds {

    /* renamed from: c */
    private static final Class<?> f40900c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdq() {
        super((zzdp) null);
    }

    /* synthetic */ zzdq(zzdp zzdp) {
        super((zzdp) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50333a(Object obj, long j) {
        Object obj2;
        List list = (List) zzfn.m59087s(obj, j);
        if (list instanceof zzdo) {
            obj2 = ((zzdo) list).mo50329g();
        } else if (!f40900c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzel) || !(list instanceof zzdg)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzdg zzdg = (zzdg) list;
                if (zzdg.zza()) {
                    zzdg.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzfn.m59088t(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.icing.zzdn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.icing.zzdn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.icing.zzdn} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo50334b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.icing.zzfn.m59087s(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.icing.zzfn.m59087s(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.zzdo
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.icing.zzdn r1 = new com.google.android.gms.internal.icing.zzdn
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.zzel
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.zzdg
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.icing.zzdg r1 = (com.google.android.gms.internal.icing.zzdg) r1
            com.google.android.gms.internal.icing.zzdg r0 = r1.mo50201A(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.icing.zzfn.m59088t(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = f40900c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.icing.zzfn.m59088t(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.zzfi
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.icing.zzdn r2 = new com.google.android.gms.internal.icing.zzdn
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.icing.zzfi r1 = (com.google.android.gms.internal.icing.zzfi) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.icing.zzfn.m59088t(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.zzel
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.zzdg
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.icing.zzdg r2 = (com.google.android.gms.internal.icing.zzdg) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.icing.zzdg r1 = r2.mo50201A(r1)
            com.google.android.gms.internal.icing.zzfn.m59088t(r5, r7, r1)
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
            com.google.android.gms.internal.icing.zzfn.m59088t(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzdq.mo50334b(java.lang.Object, java.lang.Object, long):void");
    }
}
