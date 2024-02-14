package com.google.android.gms.internal.p204firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzen */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzen {

    /* renamed from: a */
    private static final byte[] f40002a;

    /* renamed from: b */
    public static final zznx f40003b;

    /* renamed from: c */
    public static final zznx f40004c;

    /* renamed from: d */
    public static final zznx f40005d;

    static {
        byte[] bArr = new byte[0];
        f40002a = bArr;
        zznx zznx = zzcd.f39948a;
        zzoy zzoy = zzoy.TINK;
        zznx zznx2 = zznx;
        byte[] bArr2 = bArr;
        f40003b = m57193a(4, 5, 3, zznx2, zzoy, bArr2);
        f40004c = m57193a(4, 5, 4, zznx2, zzoy.RAW, bArr2);
        f40005d = m57193a(4, 5, 3, zzcd.f39952e, zzoy, bArr2);
    }

    /* renamed from: a */
    public static zznx m57193a(int i, int i2, int i3, zznx zznx, zzoy zzoy, byte[] bArr) {
        zzlw C = zzlx.m57617C();
        zzmi C2 = zzmj.m57669C();
        C2.mo49608o(4);
        C2.mo49609q(5);
        C2.mo49607n(zzacc.m56159t(bArr));
        zzlt C3 = zzlu.m57610C();
        C3.mo49583n(zznx);
        zzlz D = zzma.m57626D();
        D.mo49588o((zzmj) C2.mo49069f());
        D.mo49587n((zzlu) C3.mo49069f());
        D.mo49589q(i3);
        C.mo49585n((zzma) D.mo49069f());
        zznw C4 = zznx.m57794C();
        new zzef();
        C4.mo49661o("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        C4.mo49660n(zzoy);
        C4.mo49662q(((zzlx) C.mo49069f()).mo48860l());
        return (zznx) C4.mo49069f();
    }
}
