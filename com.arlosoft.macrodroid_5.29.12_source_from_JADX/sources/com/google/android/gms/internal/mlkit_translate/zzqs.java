package com.google.android.gms.internal.mlkit_translate;

import android.util.Log;
import java.net.HttpURLConnection;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzqs implements zzrc {

    /* renamed from: a */
    private final String f44482a;

    /* renamed from: b */
    private final Date f44483b;

    /* renamed from: c */
    private final zzox f44484c;

    /* renamed from: d */
    private zzy f44485d;

    /* renamed from: e */
    private zzqk f44486e;

    /* renamed from: f */
    final /* synthetic */ zzqt f44487f;

    zzqs(zzqt zzqt, String str, Date date, zzox zzox) {
        this.f44487f = zzqt;
        this.f44482a = str;
        this.f44483b = date;
        this.f44484c = zzox;
    }

    /* renamed from: a */
    public final zzy mo52461a() {
        return this.f44485d;
    }

    /* renamed from: b */
    public final zzqk mo52462b() {
        return this.f44486e;
    }

    public final boolean zza() throws zzqv {
        try {
            HttpURLConnection b = this.f44487f.f44496e.mo52457b();
            zzqt zzqt = this.f44487f;
            zzqk a = zzqt.f44496e.mo52456a(b, zzqt.f44495d.mo52382a().mo52371a(), this.f44482a, zzy.m62268c(), (String) null, zzy.m62268c(), this.f44483b, "o:a:mlkit:1.0.0", (String) null, this.f44484c).mo52458a();
            this.f44486e = a;
            JSONObject d = a.mo52454d();
            try {
                this.f44485d = zzqt.m62223j(d);
                return true;
            } catch (JSONException e) {
                this.f44484c.mo52386b(zznk.RPC_RETURNED_MALFORMED_RESULT);
                Log.e("MLKit RemoteConfigRestC", "Fetched remote config setting has invalid format: ".concat(String.valueOf(d)), e);
                return false;
            }
        } catch (zzqv e2) {
            Log.e("MLKit RemoteConfigRestC", "Creating HTTP connection to remote config service failed", e2);
            this.f44484c.mo52386b(zznk.NO_CONNECTION);
            return false;
        }
    }
}
