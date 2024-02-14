package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzegn implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzfhk f33960a;

    zzegn(zzego zzego, zzfhk zzfhk) {
        this.f33960a = zzfhk;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zzcgp.m45226d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        try {
            this.f33960a.mo44523a((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzcgp.m45226d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
