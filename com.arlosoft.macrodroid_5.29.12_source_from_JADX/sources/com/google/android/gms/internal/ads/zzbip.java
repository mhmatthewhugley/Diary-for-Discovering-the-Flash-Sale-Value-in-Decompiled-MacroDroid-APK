package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbip extends zzbiu {
    zzbip(int i, String str, Integer num) {
        super(1, str, num, (zzbit) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42645a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo42652n(), ((Integer) mo42651m()).intValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo42646b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo42652n()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(mo42652n())));
        }
        return (Integer) mo42651m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo42647c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo42652n(), ((Integer) mo42651m()).intValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo42648d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo42652n(), ((Integer) obj).intValue());
    }
}
