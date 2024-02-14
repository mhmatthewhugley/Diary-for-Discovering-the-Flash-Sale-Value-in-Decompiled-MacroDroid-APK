package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaeb implements zzaei {

    /* renamed from: a */
    private final zzaei[] f39774a;

    zzaeb(zzaei... zzaeiArr) {
        this.f39774a = zzaeiArr;
    }

    /* renamed from: a */
    public final zzaeh mo49065a(Class cls) {
        zzaei[] zzaeiArr = this.f39774a;
        for (int i = 0; i < 2; i++) {
            zzaei zzaei = zzaeiArr[i];
            if (zzaei.mo49066b(cls)) {
                return zzaei.mo49065a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo49066b(Class cls) {
        zzaei[] zzaeiArr = this.f39774a;
        for (int i = 0; i < 2; i++) {
            if (zzaeiArr[i].mo49066b(cls)) {
                return true;
            }
        }
        return false;
    }
}
