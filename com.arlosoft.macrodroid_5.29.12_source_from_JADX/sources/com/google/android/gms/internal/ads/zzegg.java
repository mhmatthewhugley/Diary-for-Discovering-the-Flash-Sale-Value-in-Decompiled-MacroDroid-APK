package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzegg {

    /* renamed from: a */
    private final zzbep f33941a;

    /* renamed from: b */
    private final Context f33942b;

    /* renamed from: c */
    private final zzefk f33943c;

    /* renamed from: d */
    private final zzcgv f33944d;

    /* renamed from: e */
    private final String f33945e;

    /* renamed from: f */
    private final zzfir f33946f;

    /* renamed from: g */
    private final zzg f33947g = zzt.m2904q().mo43494h();

    public zzegg(Context context, zzcgv zzcgv, zzbep zzbep, zzefk zzefk, String str, zzfir zzfir) {
        this.f33942b = context;
        this.f33944d = zzcgv;
        this.f33941a = zzbep;
        this.f33943c = zzefk;
        this.f33945e = str;
        this.f33946f = zzfir;
    }

    /* renamed from: c */
    private static final void m48794c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbgy zzbgy = (zzbgy) arrayList.get(i);
            if (zzbgy.mo42622d0() == 2 && zzbgy.mo42615L() > j) {
                j = zzbgy.mo42615L();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo45273a(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        String str2;
        if (z) {
            this.f33942b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27249s7)).booleanValue()) {
            zzfiq b = zzfiq.m50227b("oa_upload");
            b.mo45774a("oa_failed_reqs", String.valueOf(zzefz.m48775a(sQLiteDatabase, 0)));
            b.mo45774a("oa_total_reqs", String.valueOf(zzefz.m48775a(sQLiteDatabase, 1)));
            b.mo45774a("oa_upload_time", String.valueOf(zzt.m2889b().mo21950a()));
            b.mo45774a("oa_last_successful_time", String.valueOf(zzefz.m48776b(sQLiteDatabase, 2)));
            if (this.f33947g.mo20366e0()) {
                str = "";
            } else {
                str = this.f33945e;
            }
            b.mo45774a("oa_session_id", str);
            this.f33946f.mo45782a(b);
            ArrayList c = zzefz.m48777c(sQLiteDatabase);
            m48794c(sQLiteDatabase, c);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzbgy zzbgy = (zzbgy) c.get(i2);
                zzfiq b2 = zzfiq.m50227b("oa_signals");
                if (this.f33947g.mo20366e0()) {
                    str2 = "";
                } else {
                    str2 = this.f33945e;
                }
                b2.mo45774a("oa_session_id", str2);
                zzbgt M = zzbgy.mo42616M();
                String valueOf = M.mo42596J() ? String.valueOf(M.mo42598L() - 1) : "-1";
                String obj = zzfwb.m51180b(zzbgy.mo42618R(), zzegf.f33940a).toString();
                b2.mo45774a("oa_sig_ts", String.valueOf(zzbgy.mo42615L()));
                b2.mo45774a("oa_sig_status", String.valueOf(zzbgy.mo42622d0() - 1));
                b2.mo45774a("oa_sig_resp_lat", String.valueOf(zzbgy.mo42614K()));
                b2.mo45774a("oa_sig_render_lat", String.valueOf(zzbgy.mo42613J()));
                b2.mo45774a("oa_sig_formats", obj);
                b2.mo45774a("oa_sig_nw_type", valueOf);
                b2.mo45774a("oa_sig_wifi", String.valueOf(zzbgy.mo42623e0() - 1));
                b2.mo45774a("oa_sig_airplane", String.valueOf(zzbgy.mo42619a0() - 1));
                b2.mo45774a("oa_sig_data", String.valueOf(zzbgy.mo42620b0() - 1));
                b2.mo45774a("oa_sig_nw_resp", String.valueOf(zzbgy.mo42612I()));
                b2.mo45774a("oa_sig_offline", String.valueOf(zzbgy.mo42621c0() - 1));
                b2.mo45774a("oa_sig_nw_state", String.valueOf(zzbgy.mo42617Q().zza()));
                if (M.mo42595I() && M.mo42596J() && M.mo42598L() == 2) {
                    b2.mo45774a("oa_sig_cell_type", String.valueOf(M.mo42597K() - 1));
                }
                this.f33946f.mo45782a(b2);
            }
        } else {
            ArrayList c2 = zzefz.m48777c(sQLiteDatabase);
            zzbgz F = zzbhd.m43429F();
            F.mo42627o(this.f33942b.getPackageName());
            F.mo42629v(Build.MODEL);
            F.mo42630x(zzefz.m48775a(sQLiteDatabase, 0));
            F.mo42626n(c2);
            F.mo42624A(zzefz.m48775a(sQLiteDatabase, 1));
            F.mo42628u(zzefz.m48775a(sQLiteDatabase, 3));
            F.mo42625B(zzt.m2889b().mo21950a());
            F.mo42631y(zzefz.m48776b(sQLiteDatabase, 2));
            m48794c(sQLiteDatabase, c2);
            this.f33941a.mo42550b(new zzegd((zzbhd) F.mo47341h()));
            zzbho F2 = zzbhp.m43453F();
            F2.mo42634n(this.f33944d.f28447c);
            F2.mo42636u(this.f33944d.f28448d);
            if (true == this.f33944d.f28449f) {
                i = 0;
            }
            F2.mo42635o(i);
            this.f33941a.mo42550b(new zzege((zzbhp) F2.mo47341h()));
            this.f33941a.mo42551c(SamsungIrisUnlockModule.IRIS_ACQUIRED_CAPTURE_IRIS_LEAVE);
        }
        zzefz.m48780f(sQLiteDatabase);
        return null;
    }

    /* renamed from: b */
    public final void mo45274b(boolean z) {
        try {
            this.f33943c.mo45256a(new zzegc(this, z));
        } catch (Exception e) {
            zzcgp.m45226d("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
