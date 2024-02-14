package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzgf extends zzbn {

    /* renamed from: a */
    private final String f40091a;

    /* renamed from: b */
    private final zzoy f40092b;

    /* synthetic */ zzgf(String str, zzoy zzoy, zzge zzge) {
        this.f40091a = str;
        this.f40092b = zzoy;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f40091a;
        zzoy zzoy = this.f40092b;
        zznr zznr = zznr.UNKNOWN_KEYMATERIAL;
        zzoy zzoy2 = zzoy.UNKNOWN_PREFIX;
        int ordinal = zzoy.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
