package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class FirebaseFirestoreSettings {

    /* renamed from: a */
    private final String f5689a;

    /* renamed from: b */
    private final boolean f5690b;

    /* renamed from: c */
    private final boolean f5691c;

    /* renamed from: d */
    private final long f5692d;

    public static final class Builder {

        /* renamed from: a */
        private String f5693a = "firestore.googleapis.com";

        /* renamed from: b */
        private boolean f5694b = true;

        /* renamed from: c */
        private boolean f5695c = true;

        /* renamed from: d */
        private long f5696d = 104857600;
    }

    /* renamed from: a */
    public long mo23687a() {
        return this.f5692d;
    }

    /* renamed from: b */
    public boolean mo23688b() {
        return this.f5691c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FirebaseFirestoreSettings.class != obj.getClass()) {
            return false;
        }
        FirebaseFirestoreSettings firebaseFirestoreSettings = (FirebaseFirestoreSettings) obj;
        if (this.f5689a.equals(firebaseFirestoreSettings.f5689a) && this.f5690b == firebaseFirestoreSettings.f5690b && this.f5691c == firebaseFirestoreSettings.f5691c && this.f5692d == firebaseFirestoreSettings.f5692d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f5689a.hashCode() * 31) + (this.f5690b ? 1 : 0)) * 31) + (this.f5691c ? 1 : 0)) * 31) + ((int) this.f5692d);
    }

    @NonNull
    public String toString() {
        return "FirebaseFirestoreSettings{host=" + this.f5689a + ", sslEnabled=" + this.f5690b + ", persistenceEnabled=" + this.f5691c + ", cacheSizeBytes=" + this.f5692d + "}";
    }
}
