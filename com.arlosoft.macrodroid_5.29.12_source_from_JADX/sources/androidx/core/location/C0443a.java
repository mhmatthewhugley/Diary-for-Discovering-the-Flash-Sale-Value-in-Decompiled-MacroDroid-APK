package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: androidx.core.location.a */
/* compiled from: LocationListenerCompat */
public final /* synthetic */ class C0443a {
    /* renamed from: a */
    public static void m478a(LocationListenerCompat locationListenerCompat, int i) {
    }

    /* renamed from: b */
    public static void m479b(LocationListenerCompat locationListenerCompat, @NonNull List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i));
        }
    }

    /* renamed from: c */
    public static void m480c(LocationListenerCompat locationListenerCompat, @NonNull String str) {
    }

    /* renamed from: d */
    public static void m481d(LocationListenerCompat locationListenerCompat, @NonNull String str) {
    }

    /* renamed from: e */
    public static void m482e(LocationListenerCompat locationListenerCompat, @NonNull String str, int i, @Nullable Bundle bundle) {
    }
}
