package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbiq extends zzbiu {
    zzbiq(int i, String str, Long l) {
        super(1, str, l, (zzbit) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42645a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo42652n(), ((Long) mo42651m()).longValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo42646b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo42652n()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(mo42652n())));
        }
        return (Long) mo42651m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo42647c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo42652n(), ((Long) mo42651m()).longValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo42648d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo42652n(), ((Long) obj).longValue());
    }
}
