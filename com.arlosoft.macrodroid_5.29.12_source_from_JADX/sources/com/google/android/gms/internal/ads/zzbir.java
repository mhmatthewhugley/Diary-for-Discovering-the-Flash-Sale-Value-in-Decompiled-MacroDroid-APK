package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbir extends zzbiu {
    zzbir(int i, String str, Float f) {
        super(1, str, f, (zzbit) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42645a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo42652n(), (double) ((Float) mo42651m()).floatValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo42646b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo42652n()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(mo42652n())));
        }
        return (Float) mo42651m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo42647c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo42652n(), ((Float) mo42651m()).floatValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo42648d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo42652n(), ((Float) obj).floatValue());
    }
}
