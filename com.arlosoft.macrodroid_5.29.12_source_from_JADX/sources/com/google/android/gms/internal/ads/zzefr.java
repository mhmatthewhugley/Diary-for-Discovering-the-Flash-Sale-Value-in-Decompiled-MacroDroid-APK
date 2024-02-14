package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzefr implements zzfhk {

    /* renamed from: a */
    public final /* synthetic */ zzefs f33908a;

    /* renamed from: b */
    public final /* synthetic */ long f33909b;

    public /* synthetic */ zzefr(zzefs zzefs, long j) {
        this.f33908a = zzefs;
        this.f33909b = j;
    }

    /* renamed from: a */
    public final Object mo44523a(Object obj) {
        zzefs zzefs = this.f33908a;
        long j = this.f33909b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzefs.mo45270a()) {
            return null;
        }
        zzbgx N = zzbgy.m43390N();
        N.mo42600B(j);
        byte[] p = ((zzbgy) N.mo47341h()).mo47050p();
        zzefz.m48781g(sQLiteDatabase, false, false);
        zzefz.m48778d(sQLiteDatabase, j, p);
        return null;
    }
}
