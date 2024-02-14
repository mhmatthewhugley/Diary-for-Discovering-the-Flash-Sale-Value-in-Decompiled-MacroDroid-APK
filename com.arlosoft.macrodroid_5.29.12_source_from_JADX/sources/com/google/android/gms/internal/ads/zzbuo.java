package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbuo implements zzbua {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzbuc f27798a;

    /* renamed from: b */
    private final zzbud f27799b;

    /* renamed from: c */
    private final zzbtw f27800c;

    /* renamed from: d */
    private final String f27801d;

    zzbuo(zzbtw zzbtw, String str, zzbud zzbud, zzbuc zzbuc) {
        this.f27800c = zzbtw;
        this.f27801d = str;
        this.f27799b = zzbud;
        this.f27798a = zzbuc;
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m44154d(zzbuo zzbuo, zzbtq zzbtq, zzbtx zzbtx, Object obj, zzchh zzchh) {
        try {
            zzt.m2905r();
            String uuid = UUID.randomUUID().toString();
            zzbpt.f27617o.mo42888c(uuid, new zzbun(zzbuo, zzbtq, zzchh));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbuo.f27799b.mo42999c(obj));
            zzbtx.mo42972d1(zzbuo.f27801d, jSONObject);
        } catch (Exception e) {
            zzchh.mo43575d(e);
            zzcgp.m45227e("Unable to invokeJavascript", e);
            zzbtq.mo42983g();
        } catch (Throwable th) {
            zzbtq.mo42983g();
            throw th;
        }
    }

    /* renamed from: a */
    public final zzfzp mo20417a(@Nullable Object obj) throws Exception {
        return mo42995c(obj);
    }

    /* renamed from: c */
    public final zzfzp mo42995c(Object obj) {
        zzchh zzchh = new zzchh();
        zzbtq b = this.f27800c.mo42989b((zzape) null);
        b.mo43584e(new zzbul(this, b, obj, zzchh), new zzbum(this, zzchh, b));
        return zzchh;
    }
}
