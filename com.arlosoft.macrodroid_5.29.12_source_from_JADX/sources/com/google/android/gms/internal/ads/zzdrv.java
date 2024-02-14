package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdrv {

    /* renamed from: a */
    private final Executor f32928a;

    /* renamed from: b */
    private final zzdrq f32929b;

    public zzdrv(Executor executor, zzdrq zzdrq) {
        this.f32928a = executor;
        this.f32929b = zzdrq;
    }

    /* renamed from: a */
    public final zzfzp mo44944a(JSONObject jSONObject, String str) {
        zzfzp zzfzp;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfzg.m51414i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzfzp = zzfzg.m51414i((Object) null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzfzp = zzfzg.m51414i((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if (TypedValues.Custom.S_STRING.equals(optString2)) {
                        zzfzp = zzfzg.m51414i(new zzdru(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzfzp = zzfzg.m51418m(this.f32929b.mo44939e(optJSONObject, "image_value"), new zzdrs(optString), this.f32928a);
                    } else {
                        zzfzp = zzfzg.m51414i((Object) null);
                    }
                }
            }
            arrayList.add(zzfzp);
        }
        return zzfzg.m51418m(zzfzg.m51410e(arrayList), zzdrt.f32923a, this.f32928a);
    }
}
