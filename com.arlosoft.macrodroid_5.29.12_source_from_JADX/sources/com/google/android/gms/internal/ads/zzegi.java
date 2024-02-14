package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzegi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SQLiteDatabase f33949a;

    /* renamed from: c */
    public final /* synthetic */ String f33950c;

    /* renamed from: d */
    public final /* synthetic */ zzcgu f33951d;

    public /* synthetic */ zzegi(SQLiteDatabase sQLiteDatabase, String str, zzcgu zzcgu) {
        this.f33949a = sQLiteDatabase;
        this.f33950c = str;
        this.f33951d = zzcgu;
    }

    public final void run() {
        zzego.m48804h(this.f33949a, this.f33950c, this.f33951d);
    }
}
