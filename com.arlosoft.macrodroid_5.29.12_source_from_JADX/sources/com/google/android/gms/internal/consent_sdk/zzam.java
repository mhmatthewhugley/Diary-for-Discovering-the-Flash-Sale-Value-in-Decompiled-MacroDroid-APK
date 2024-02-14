package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzam {

    /* renamed from: a */
    private final Application f39323a;

    /* renamed from: b */
    private final SharedPreferences f39324b;

    /* renamed from: c */
    private final Set<String> f39325c;

    /* renamed from: a */
    public final Map<String, String> mo48674a() {
        String str;
        Application application = this.f39323a;
        Set<String> stringSet = this.f39324b.getStringSet("stored_info", Collections.emptySet());
        HashMap hashMap = new HashMap();
        for (String next : stringSet) {
            zzby a = zzca.m55968a(application, next);
            if (a == null) {
                String valueOf = String.valueOf(next);
                if (valueOf.length() != 0) {
                    "Fetching request info: failed for key: ".concat(valueOf);
                }
            } else {
                Object obj = application.getSharedPreferences(a.f39403a, 0).getAll().get(a.f39404b);
                if (obj == null) {
                    String valueOf2 = String.valueOf(next);
                    if (valueOf2.length() != 0) {
                        "Stored info not exists: ".concat(valueOf2);
                    }
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        String valueOf3 = String.valueOf(next);
                        if (valueOf3.length() != 0) {
                            "Failed to fetch stored info: ".concat(valueOf3);
                        }
                    }
                    hashMap.put(next, str);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final Set<String> mo48675b() {
        return this.f39325c;
    }

    /* renamed from: c */
    public final void mo48676c() {
        this.f39324b.edit().putStringSet("written_values", this.f39325c).apply();
    }

    /* renamed from: d */
    public final void mo48677d(int i) {
        this.f39324b.edit().putInt("consent_status", i).apply();
    }

    /* renamed from: e */
    public final void mo48678e(Set<String> set) {
        this.f39324b.edit().putStringSet("stored_info", set).apply();
    }
}
