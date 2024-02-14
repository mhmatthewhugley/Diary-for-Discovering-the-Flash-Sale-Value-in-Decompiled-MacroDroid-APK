package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgta extends zzgpo {

    /* renamed from: a */
    final zzgte f37256a;

    /* renamed from: c */
    zzgpq f37257c = m53224a();

    /* renamed from: d */
    final /* synthetic */ zzgtg f37258d;

    zzgta(zzgtg zzgtg) {
        this.f37258d = zzgtg;
        this.f37256a = new zzgte(zzgtg, (zzgtd) null);
    }

    /* renamed from: a */
    private final zzgpq m53224a() {
        zzgte zzgte = this.f37256a;
        if (zzgte.hasNext()) {
            return zzgte.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f37257c != null;
    }

    public final byte zza() {
        zzgpq zzgpq = this.f37257c;
        if (zzgpq != null) {
            byte zza = zzgpq.zza();
            if (!this.f37257c.hasNext()) {
                this.f37257c = m53224a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
