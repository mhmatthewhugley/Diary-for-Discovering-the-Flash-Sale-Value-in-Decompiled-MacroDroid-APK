package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbis extends zzbiu {
    zzbis(int i, String str, String str2) {
        super(1, str, str2, (zzbit) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42645a(JSONObject jSONObject) {
        return jSONObject.optString(mo42652n(), (String) mo42651m());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo42646b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo42652n()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(mo42652n()));
        }
        return (String) mo42651m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo42647c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo42652n(), (String) mo42651m());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo42648d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo42652n(), (String) obj);
    }
}
