package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbio extends zzbiu {
    zzbio(int i, String str, Boolean bool) {
        super(i, str, bool, (zzbit) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42645a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo42652n(), ((Boolean) mo42651m()).booleanValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo42646b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo42652n()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(mo42652n())));
        }
        return (Boolean) mo42651m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo42647c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo42652n(), ((Boolean) mo42651m()).booleanValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo42648d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(mo42652n(), ((Boolean) obj).booleanValue());
    }
}
