package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbf {

    /* renamed from: a */
    private final zznx f39911a;

    private zzbf(zznx zznx) {
        this.f39911a = zznx;
    }

    /* renamed from: e */
    public static zzbf m56944e(String str, byte[] bArr, int i) {
        zznw C = zznx.m57794C();
        C.mo49661o(str);
        C.mo49662q(zzacc.m56159t(bArr));
        int i2 = i - 1;
        C.mo49660n(i2 != 0 ? i2 != 1 ? i2 != 2 ? zzoy.CRUNCHY : zzoy.RAW : zzoy.LEGACY : zzoy.TINK);
        return new zzbf((zznx) C.mo49069f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zznx mo49324a() {
        return this.f39911a;
    }

    /* renamed from: b */
    public final String mo49325b() {
        return this.f39911a.mo49665H();
    }

    /* renamed from: c */
    public final byte[] mo49326c() {
        return this.f39911a.mo49664G().mo48904F();
    }

    /* renamed from: d */
    public final int mo49327d() {
        zzoy F = this.f39911a.mo49663F();
        zzoy zzoy = zzoy.UNKNOWN_PREFIX;
        int ordinal = F.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
