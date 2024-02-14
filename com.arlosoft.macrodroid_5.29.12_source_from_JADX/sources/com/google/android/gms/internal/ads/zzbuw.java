package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbuw implements zzfyn {

    /* renamed from: a */
    private final zzbuc f27814a;

    /* renamed from: b */
    private final zzbud f27815b;

    /* renamed from: c */
    private final String f27816c = "google.afma.activeView.handleUpdate";

    /* renamed from: d */
    private final zzfzp f27817d;

    zzbuw(zzfzp zzfzp, String str, zzbud zzbud, zzbuc zzbuc) {
        this.f27817d = zzfzp;
        this.f27815b = zzbud;
        this.f27814a = zzbuc;
    }

    /* renamed from: a */
    public final zzfzp mo20417a(Object obj) throws Exception {
        return mo43006c(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo43005b(Object obj, zzbtx zzbtx) throws Exception {
        zzchh zzchh = new zzchh();
        zzt.m2905r();
        String uuid = UUID.randomUUID().toString();
        zzbpt.f27617o.mo42888c(uuid, new zzbuv(this, zzchh));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbtx.mo42972d1(this.f27816c, jSONObject);
        return zzchh;
    }

    /* renamed from: c */
    public final zzfzp mo43006c(Object obj) {
        return zzfzg.m51419n(this.f27817d, new zzbuu(this, obj), zzchc.f28461f);
    }
}
