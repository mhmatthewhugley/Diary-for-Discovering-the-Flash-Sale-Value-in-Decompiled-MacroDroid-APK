package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdyt {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public Long f33404a;

    /* renamed from: b */
    private final String f33405b;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public String f33406c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Integer f33407d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public String f33408e;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public Integer f33409f;

    /* synthetic */ zzdyt(String str, zzdys zzdys) {
        this.f33405b = str;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ String m48387a(zzdyt zzdyt) {
        String str = (String) zzay.m1924c().mo42663b(zzbjc.f27150i8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdyt.f33404a);
            jSONObject.put("eventCategory", zzdyt.f33405b);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdyt.f33406c);
            jSONObject.putOpt("errorCode", zzdyt.f33407d);
            jSONObject.putOpt("rewardType", zzdyt.f33408e);
            jSONObject.putOpt("rewardAmount", zzdyt.f33409f);
        } catch (JSONException unused) {
            zzcgp.m45229g("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
