package com.google.android.gms.internal.p204firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcd {

    /* renamed from: a */
    public static final zznx f39948a = m57019b(16);

    /* renamed from: b */
    public static final zznx f39949b = m57019b(32);

    /* renamed from: c */
    public static final zznx f39950c = m57018a(16, 16);

    /* renamed from: d */
    public static final zznx f39951d = m57018a(32, 16);

    /* renamed from: e */
    public static final zznx f39952e = m57020c(16, 16, 32, 16, 5);

    /* renamed from: f */
    public static final zznx f39953f = m57020c(32, 16, 32, 32, 5);

    /* renamed from: g */
    public static final zznx f39954g;

    /* renamed from: h */
    public static final zznx f39955h;

    static {
        zznw C = zznx.m57794C();
        new zzcy();
        C.mo49661o("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzoy zzoy = zzoy.TINK;
        C.mo49660n(zzoy);
        f39954g = (zznx) C.mo49069f();
        zznw C2 = zznx.m57794C();
        new zzdi();
        C2.mo49661o("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        C2.mo49660n(zzoy);
        f39955h = (zznx) C2.mo49069f();
    }

    /* renamed from: a */
    public static zznx m57018a(int i, int i2) {
        zzkn D = zzko.m57528D();
        D.mo49554n(i);
        zzkq D2 = zzkr.m57537D();
        D2.mo49558n(16);
        D.mo49555o((zzkr) D2.mo49069f());
        zznw C = zznx.m57794C();
        C.mo49662q(((zzko) D.mo49069f()).mo48860l());
        new zzcp();
        C.mo49661o("type.googleapis.com/google.crypto.tink.AesEaxKey");
        C.mo49660n(zzoy.TINK);
        return (zznx) C.mo49069f();
    }

    /* renamed from: b */
    public static zznx m57019b(int i) {
        zzkw D = zzkx.m57554D();
        D.mo49564n(i);
        zznw C = zznx.m57794C();
        C.mo49662q(((zzkx) D.mo49069f()).mo48860l());
        new zzcs();
        C.mo49661o("type.googleapis.com/google.crypto.tink.AesGcmKey");
        C.mo49660n(zzoy.TINK);
        return (zznx) C.mo49069f();
    }

    /* renamed from: c */
    public static zznx m57020c(int i, int i2, int i3, int i4, int i5) {
        zzke D = zzkf.m57497D();
        zzkh D2 = zzki.m57507D();
        D2.mo49546n(16);
        D.mo49543o((zzki) D2.mo49069f());
        D.mo49542n(i);
        zzmv D3 = zzmw.m57707D();
        zzmy D4 = zzmz.m57718D();
        D4.mo49627o(5);
        D4.mo49626n(i4);
        D3.mo49623o((zzmz) D4.mo49069f());
        D3.mo49622n(32);
        zzjy C = zzjz.m57473C();
        C.mo49531n((zzkf) D.mo49069f());
        C.mo49532o((zzmw) D3.mo49069f());
        zznw C2 = zznx.m57794C();
        C2.mo49662q(((zzjz) C.mo49069f()).mo48860l());
        new zzcj();
        C2.mo49661o("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        C2.mo49660n(zzoy.TINK);
        return (zznx) C2.mo49069f();
    }
}
