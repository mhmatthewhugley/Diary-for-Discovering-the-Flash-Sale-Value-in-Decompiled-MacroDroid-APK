package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgpm extends zzgpo {

    /* renamed from: a */
    private int f37003a = 0;

    /* renamed from: c */
    private final int f37004c;

    /* renamed from: d */
    final /* synthetic */ zzgpw f37005d;

    zzgpm(zzgpw zzgpw) {
        this.f37005d = zzgpw;
        this.f37004c = zzgpw.mo47083m();
    }

    public final boolean hasNext() {
        return this.f37003a < this.f37004c;
    }

    public final byte zza() {
        int i = this.f37003a;
        if (i < this.f37004c) {
            this.f37003a = i + 1;
            return this.f37005d.mo47082k(i);
        }
        throw new NoSuchElementException();
    }
}
