package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzd implements zzfyn {

    /* renamed from: a */
    public final /* synthetic */ zzfjw f2321a;

    /* renamed from: b */
    public final /* synthetic */ zzfjj f2322b;

    public /* synthetic */ zzd(zzfjw zzfjw, zzfjj zzfjj) {
        this.f2321a = zzfjw;
        this.f2322b = zzfjj;
    }

    /* renamed from: a */
    public final zzfzp mo20417a(Object obj) {
        zzfjw zzfjw = this.f2321a;
        zzfjj zzfjj = this.f2322b;
        JSONObject jSONObject = (JSONObject) obj;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.m2904q().mo43494h().mo20388r0(jSONObject.getString("appSettingsJson"));
        }
        zzfjj.mo45801o0(optBoolean);
        zzfjw.mo45831b(zzfjj.mo45799h());
        return zzfzg.m51414i((Object) null);
    }
}
