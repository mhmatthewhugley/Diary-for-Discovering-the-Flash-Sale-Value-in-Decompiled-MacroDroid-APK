package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzefu implements zzfhk {

    /* renamed from: a */
    public final /* synthetic */ zzefv f33912a;

    /* renamed from: b */
    public final /* synthetic */ boolean f33913b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f33914c;

    /* renamed from: d */
    public final /* synthetic */ zzbgt f33915d;

    /* renamed from: e */
    public final /* synthetic */ zzbhc f33916e;

    public /* synthetic */ zzefu(zzefv zzefv, boolean z, ArrayList arrayList, zzbgt zzbgt, zzbhc zzbhc) {
        this.f33912a = zzefv;
        this.f33913b = z;
        this.f33914c = arrayList;
        this.f33915d = zzbgt;
        this.f33916e = zzbhc;
    }

    /* renamed from: a */
    public final Object mo44523a(Object obj) {
        zzefv zzefv = this.f33912a;
        boolean z = this.f33913b;
        ArrayList arrayList = this.f33914c;
        zzbgt zzbgt = this.f33915d;
        zzbhc zzbhc = this.f33916e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzefv.f33918b.mo45270a()) {
            return null;
        }
        byte[] f = zzefw.m48770f(zzefv.f33918b, z, arrayList, zzbgt, zzbhc);
        zzefz.m48781g(sQLiteDatabase, z, true);
        zzefz.m48778d(sQLiteDatabase, zzefv.f33918b.f33923f.mo45261d(), f);
        return null;
    }
}
