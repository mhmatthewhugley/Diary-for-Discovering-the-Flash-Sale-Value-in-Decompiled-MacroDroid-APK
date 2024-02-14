package com.google.android.gms.internal.places;

import java.util.Iterator;

final class zzdg extends zzdm {

    /* renamed from: c */
    private final /* synthetic */ zzdb f45373c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzdg(zzdb zzdb) {
        super(zzdb, (zzde) null);
        this.f45373c = zzdb;
    }

    public final Iterator iterator() {
        return new zzdd(this.f45373c, (zzde) null);
    }

    /* synthetic */ zzdg(zzdb zzdb, zzde zzde) {
        this(zzdb);
    }
}
