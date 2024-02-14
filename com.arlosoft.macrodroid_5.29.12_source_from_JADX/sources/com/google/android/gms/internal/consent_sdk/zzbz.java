package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzbz {

    /* renamed from: a */
    private final Context f39405a;

    /* renamed from: b */
    private final Map<String, SharedPreferences.Editor> f39406b = new HashMap();

    public zzbz(Context context) {
        this.f39405a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final SharedPreferences.Editor m55965d(String str) {
        if (!this.f39406b.containsKey(str)) {
            this.f39406b.put(str, this.f39405a.getSharedPreferences(str, 0).edit());
        }
        return this.f39406b.get(str);
    }

    /* renamed from: b */
    public final void mo48711b() {
        for (SharedPreferences.Editor apply : this.f39406b.values()) {
            apply.apply();
        }
    }

    /* renamed from: c */
    public final boolean mo48712c(String str, @Nullable Object obj) {
        zzby a = zzca.m55968a(this.f39405a, str);
        if (a == null) {
            return false;
        }
        SharedPreferences.Editor d = m55965d(a.f39403a);
        if (obj instanceof Integer) {
            d.putInt(a.f39404b, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Long) {
            d.putLong(a.f39404b, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof Double) {
            d.putFloat(a.f39404b, ((Double) obj).floatValue());
            return true;
        } else if (obj instanceof Float) {
            d.putFloat(a.f39404b, ((Float) obj).floatValue());
            return true;
        } else if (obj instanceof Boolean) {
            d.putBoolean(a.f39404b, ((Boolean) obj).booleanValue());
            return true;
        } else if (!(obj instanceof String)) {
            return false;
        } else {
            d.putString(a.f39404b, (String) obj);
            return true;
        }
    }
}
