package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzaj implements zzfyn {

    /* renamed from: a */
    public final /* synthetic */ zzcbc f2520a;

    public /* synthetic */ zzaj(zzcbc zzcbc) {
        this.f2520a = zzcbc;
    }

    /* renamed from: a */
    public final zzfzp mo20417a(Object obj) {
        zzcbc zzcbc = this.f2520a;
        zzam zzam = new zzam(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            zzam.f2526b = zzaw.m1917b().mo43549h(zzcbc.f28122a).toString();
        } catch (JSONException unused) {
            zzam.f2526b = "{}";
        }
        return zzfzg.m51414i(zzam);
    }
}
