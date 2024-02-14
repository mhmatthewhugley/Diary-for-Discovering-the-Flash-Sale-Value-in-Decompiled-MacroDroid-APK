package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgbs extends zzgbl {

    /* renamed from: a */
    private final String f36660a;

    /* renamed from: b */
    private final int f36661b;

    /* synthetic */ zzgbs(String str, int i, zzgbr zzgbr) {
        this.f36660a = str;
        this.f36661b = i;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f36660a;
        int i = this.f36661b - 2;
        objArr[1] = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
