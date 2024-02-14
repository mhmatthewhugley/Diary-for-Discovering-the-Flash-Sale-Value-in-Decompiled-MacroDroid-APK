package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzhh {

    /* renamed from: a */
    private final SimpleArrayMap f41484a;

    zzhh(SimpleArrayMap simpleArrayMap) {
        this.f41484a = simpleArrayMap;
    }

    /* renamed from: a */
    public final String mo51270a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.f41484a.get(uri.toString());
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("".concat(String.valueOf(str3)));
    }
}
