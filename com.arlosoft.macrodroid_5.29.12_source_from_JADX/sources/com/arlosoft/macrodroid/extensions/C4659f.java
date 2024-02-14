package com.arlosoft.macrodroid.extensions;

import android.os.Bundle;
import android.os.Parcel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.extensions.f */
/* compiled from: ParcelExtensions.kt */
public final class C4659f {
    /* renamed from: a */
    public static final Map<String, String> m18121a(Parcel parcel) {
        C13706o.m87929f(parcel, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle readBundle = parcel.readBundle();
        C13706o.m87926c(readBundle);
        Set<String> keySet = readBundle.keySet();
        C13706o.m87928e(keySet, "bundle.keySet()");
        for (String str : keySet) {
            C13706o.m87928e(str, "it");
            String string = readBundle.getString(str, "");
            C13706o.m87928e(string, "bundle.getString(it, \"\")");
            linkedHashMap.put(str, string);
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static final void m18122b(Parcel parcel, Map<String, String> map) {
        C13706o.m87929f(parcel, "<this>");
        C13706o.m87929f(map, "stringMap");
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
        }
        parcel.writeBundle(bundle);
    }
}
