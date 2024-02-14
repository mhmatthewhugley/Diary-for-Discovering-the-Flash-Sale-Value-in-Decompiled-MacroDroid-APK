package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

public final class FirebaseOptions {

    /* renamed from: a */
    private final String f53752a;

    /* renamed from: b */
    private final String f53753b;

    /* renamed from: c */
    private final String f53754c;

    /* renamed from: d */
    private final String f53755d;

    /* renamed from: e */
    private final String f53756e;

    /* renamed from: f */
    private final String f53757f;

    /* renamed from: g */
    private final String f53758g;

    public static final class Builder {
    }

    private FirebaseOptions(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.m4494q(!Strings.m4912b(str), "ApplicationId must be set.");
        this.f53753b = str;
        this.f53752a = str2;
        this.f53754c = str3;
        this.f53755d = str4;
        this.f53756e = str5;
        this.f53757f = str6;
        this.f53758g = str7;
    }

    @Nullable
    /* renamed from: a */
    public static FirebaseOptions m74418a(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String a = stringResourceValueReader.mo21730a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new FirebaseOptions(a, stringResourceValueReader.mo21730a("google_api_key"), stringResourceValueReader.mo21730a("firebase_database_url"), stringResourceValueReader.mo21730a("ga_trackingId"), stringResourceValueReader.mo21730a("gcm_defaultSenderId"), stringResourceValueReader.mo21730a("google_storage_bucket"), stringResourceValueReader.mo21730a("project_id"));
    }

    @NonNull
    /* renamed from: b */
    public String mo61961b() {
        return this.f53752a;
    }

    @NonNull
    /* renamed from: c */
    public String mo61962c() {
        return this.f53753b;
    }

    @Nullable
    /* renamed from: d */
    public String mo61963d() {
        return this.f53756e;
    }

    @Nullable
    /* renamed from: e */
    public String mo61964e() {
        return this.f53758g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        if (!Objects.m4470a(this.f53753b, firebaseOptions.f53753b) || !Objects.m4470a(this.f53752a, firebaseOptions.f53752a) || !Objects.m4470a(this.f53754c, firebaseOptions.f53754c) || !Objects.m4470a(this.f53755d, firebaseOptions.f53755d) || !Objects.m4470a(this.f53756e, firebaseOptions.f53756e) || !Objects.m4470a(this.f53757f, firebaseOptions.f53757f) || !Objects.m4470a(this.f53758g, firebaseOptions.f53758g)) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: f */
    public String mo61966f() {
        return this.f53757f;
    }

    public int hashCode() {
        return Objects.m4471b(this.f53753b, this.f53752a, this.f53754c, this.f53755d, this.f53756e, this.f53757f, this.f53758g);
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("applicationId", this.f53753b).mo21720a("apiKey", this.f53752a).mo21720a("databaseUrl", this.f53754c).mo21720a("gcmSenderId", this.f53756e).mo21720a("storageBucket", this.f53757f).mo21720a("projectId", this.f53758g).toString();
    }
}
