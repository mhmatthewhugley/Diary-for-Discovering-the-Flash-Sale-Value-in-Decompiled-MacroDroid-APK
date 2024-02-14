package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;

public final class zzby {
    private zzby() {
    }

    /* renamed from: a */
    private static <T extends Parcelable> T m65131a(@Nullable Bundle bundle, String str) {
        Class<zzby> cls = zzby.class;
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(cls.getClassLoader());
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m65132b(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m65131a(bundle, "MapOptions");
            if (a != null) {
                m65133c(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m65131a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m65133c(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m65131a(bundle, "camera");
            if (a3 != null) {
                m65133c(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m65133c(Bundle bundle, String str, Parcelable parcelable) {
        Class<zzby> cls = zzby.class;
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(cls.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
