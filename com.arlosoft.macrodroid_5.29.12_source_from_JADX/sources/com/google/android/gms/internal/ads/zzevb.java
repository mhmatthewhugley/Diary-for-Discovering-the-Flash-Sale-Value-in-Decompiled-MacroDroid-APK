package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevb implements zzeve {

    /* renamed from: a */
    private final zzfzq f34996a;

    /* renamed from: b */
    private final Context f34997b;

    zzevb(zzfzq zzfzq, Context context) {
        this.f34996a = zzfzq;
        this.f34997b = context;
    }

    /* renamed from: a */
    public static Bundle m49523a(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i2 - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzevd mo45478b() throws Exception {
        String str = (String) zzay.m1924c().mo42663b(zzbjc.f27147i5);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zzeva(m49523a(this.f34997b, new JSONArray(str)));
        } catch (JSONException e) {
            zzcgp.m45225c("JSON parsing error", e);
            return null;
        }
    }

    public final int zza() {
        return 37;
    }

    public final zzfzp zzb() {
        return this.f34996a.mo46579F(new zzeuz(this));
    }
}
