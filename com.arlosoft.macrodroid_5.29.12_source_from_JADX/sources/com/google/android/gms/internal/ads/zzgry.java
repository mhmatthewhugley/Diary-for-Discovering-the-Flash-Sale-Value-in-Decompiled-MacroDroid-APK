package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgry extends zzgsc {

    /* renamed from: c */
    private static final Class f37193c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgry() {
        super((zzgsb) null);
    }

    /* synthetic */ zzgry(zzgrx zzgrx) {
        super((zzgsb) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzgrv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.zzgrv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.zzgrv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m53061f(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgui.m53446p(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgrw
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.zzgrv r0 = new com.google.android.gms.internal.ads.zzgrv
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgsv
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgrn
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzgrn r0 = (com.google.android.gms.internal.ads.zzgrn) r0
            com.google.android.gms.internal.ads.zzgrn r6 = r0.mo47067G(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.ads.zzgui.m53426D(r3, r4, r0)
            goto L_0x0087
        L_0x002f:
            java.lang.Class r1 = f37193c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.zzgui.m53426D(r3, r4, r1)
        L_0x004b:
            r0 = r1
            goto L_0x0087
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgud
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzgrv r1 = new com.google.android.gms.internal.ads.zzgrv
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.zzgud r0 = (com.google.android.gms.internal.ads.zzgud) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.ads.zzgui.m53426D(r3, r4, r1)
            goto L_0x004b
        L_0x0068:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgsv
            if (r1 == 0) goto L_0x0087
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgrn
            if (r1 == 0) goto L_0x0087
            r1 = r0
            com.google.android.gms.internal.ads.zzgrn r1 = (com.google.android.gms.internal.ads.zzgrn) r1
            boolean r2 = r1.mo47052a()
            if (r2 == 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.zzgrn r6 = r1.mo47067G(r0)
            com.google.android.gms.internal.ads.zzgui.m53426D(r3, r4, r6)
            return r6
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgry.m53061f(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo47384a(Object obj, long j) {
        return m53061f(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47385b(Object obj, long j) {
        Object obj2;
        List list = (List) zzgui.m53446p(obj, j);
        if (list instanceof zzgrw) {
            obj2 = ((zzgrw) list).mo47377b();
        } else if (!f37193c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzgsv) || !(list instanceof zzgrn)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzgrn zzgrn = (zzgrn) list;
                if (zzgrn.mo47052a()) {
                    zzgrn.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzgui.m53426D(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo47386c(Object obj, Object obj2, long j) {
        List list = (List) zzgui.m53446p(obj2, j);
        List f = m53061f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        zzgui.m53426D(obj, j, list);
    }
}
