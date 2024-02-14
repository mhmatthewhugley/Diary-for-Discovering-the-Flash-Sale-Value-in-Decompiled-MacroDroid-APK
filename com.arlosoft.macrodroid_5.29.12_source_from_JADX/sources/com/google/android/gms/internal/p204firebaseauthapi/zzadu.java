package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzadu extends zzady {

    /* renamed from: c */
    private static final Class f39768c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzadu() {
        super((zzadx) null);
    }

    /* synthetic */ zzadu(zzadt zzadt) {
        super((zzadx) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.firebase-auth-api.zzadr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.firebase-auth-api.zzadr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.firebase-auth-api.zzadr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m56489f(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzads
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.firebase-auth-api.zzadr r0 = new com.google.android.gms.internal.firebase-auth-api.zzadr
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzaer
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzadk
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.firebase-auth-api.zzadk r0 = (com.google.android.gms.internal.p204firebaseauthapi.zzadk) r0
            com.google.android.gms.internal.firebase-auth-api.zzadk r6 = r0.mo48877G(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r3, r4, r0)
            goto L_0x0087
        L_0x002f:
            java.lang.Class r1 = f39768c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r3, r4, r1)
        L_0x004b:
            r0 = r1
            goto L_0x0087
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzafs
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.internal.firebase-auth-api.zzadr r1 = new com.google.android.gms.internal.firebase-auth-api.zzadr
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.firebase-auth-api.zzafs r0 = (com.google.android.gms.internal.p204firebaseauthapi.zzafs) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r3, r4, r1)
            goto L_0x004b
        L_0x0068:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzaer
            if (r1 == 0) goto L_0x0087
            boolean r1 = r0 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzadk
            if (r1 == 0) goto L_0x0087
            r1 = r0
            com.google.android.gms.internal.firebase-auth-api.zzadk r1 = (com.google.android.gms.internal.p204firebaseauthapi.zzadk) r1
            boolean r2 = r1.mo48862a()
            if (r2 == 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.firebase-auth-api.zzadk r6 = r1.mo48877G(r0)
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r3, r4, r6)
            return r6
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzadu.m56489f(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo49114a(Object obj, long j) {
        return m56489f(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49115b(Object obj, long j) {
        Object obj2;
        List list = (List) zzafx.m56844k(obj, j);
        if (list instanceof zzads) {
            obj2 = ((zzads) list).mo49108b();
        } else if (!f39768c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzaer) || !(list instanceof zzadk)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzadk zzadk = (zzadk) list;
                if (zzadk.mo48862a()) {
                    zzadk.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzafx.m56857x(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo49116c(Object obj, Object obj2, long j) {
        List list = (List) zzafx.m56844k(obj2, j);
        List f = m56489f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        zzafx.m56857x(obj, j, list);
    }
}
