package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzego extends SQLiteOpenHelper {

    /* renamed from: a */
    private final Context f33961a;

    /* renamed from: c */
    private final zzfzq f33962c;

    public zzego(Context context, zzfzq zzfzq) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzay.m1924c().mo42663b(zzbjc.f27159j7)).intValue());
        this.f33961a = context;
        this.f33962c = zzfzq;
    }

    /* renamed from: h */
    static /* synthetic */ void m48804h(SQLiteDatabase sQLiteDatabase, String str, zzcgu zzcgu) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m48806o(sQLiteDatabase, zzcgu);
    }

    /* renamed from: m */
    static final void m48805m(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static void m48806o(SQLiteDatabase sQLiteDatabase, zzcgu zzcgu) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = " + 1, (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzcgu.mo20399o(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Void mo45277b(zzegq zzegq, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzegq.f33965a));
        contentValues.put("gws_query_id", zzegq.f33966b);
        contentValues.put("url", zzegq.f33967c);
        contentValues.put("event_state", Integer.valueOf(zzegq.f33968d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        zzt.m2905r();
        zzbr T = zzs.m2746T(this.f33961a);
        if (T != null) {
            try {
                T.zze(ObjectWrapper.m5051g8(this.f33961a));
            } catch (RemoteException e) {
                zze.m2646l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo45278e(String str) {
        mo45280g(new zzegl(this, str));
    }

    /* renamed from: f */
    public final void mo45279f(zzegq zzegq) {
        mo45280g(new zzegj(this, zzegq));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo45280g(zzfhk zzfhk) {
        zzfzg.m51423r(this.f33962c.mo46579F(new zzegh(this)), new zzegn(this, zzfhk), this.f33962c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo45281i(SQLiteDatabase sQLiteDatabase, zzcgu zzcgu, String str) {
        this.f33962c.execute(new zzegi(sQLiteDatabase, str, zzcgu));
    }

    /* renamed from: j */
    public final void mo45282j(zzcgu zzcgu, String str) {
        mo45280g(new zzegm(this, zzcgu, str));
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
