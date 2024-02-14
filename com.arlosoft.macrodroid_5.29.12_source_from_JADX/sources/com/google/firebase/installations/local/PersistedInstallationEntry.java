package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
public abstract class PersistedInstallationEntry {
    @NonNull

    /* renamed from: a */
    public static PersistedInstallationEntry f54892a = m76681a().mo63260a();

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract PersistedInstallationEntry mo63260a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo63261b(@Nullable String str);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo63262c(long j);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo63263d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract Builder mo63264e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract Builder mo63265f(@Nullable String str);

        @NonNull
        /* renamed from: g */
        public abstract Builder mo63266g(@NonNull PersistedInstallation.RegistrationStatus registrationStatus);

        @NonNull
        /* renamed from: h */
        public abstract Builder mo63267h(long j);
    }

    @NonNull
    /* renamed from: a */
    public static Builder m76681a() {
        return new AutoValue_PersistedInstallationEntry.Builder().mo63267h(0).mo63266g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).mo63262c(0);
    }

    @Nullable
    /* renamed from: b */
    public abstract String mo63249b();

    /* renamed from: c */
    public abstract long mo63250c();

    @Nullable
    /* renamed from: d */
    public abstract String mo63251d();

    @Nullable
    /* renamed from: e */
    public abstract String mo63252e();

    @Nullable
    /* renamed from: f */
    public abstract String mo63254f();

    @NonNull
    /* renamed from: g */
    public abstract PersistedInstallation.RegistrationStatus mo63255g();

    /* renamed from: h */
    public abstract long mo63256h();

    /* renamed from: i */
    public boolean mo63272i() {
        return mo63255g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo63273j() {
        return mo63255g() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || mo63255g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo63274k() {
        return mo63255g() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo63275l() {
        return mo63255g() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo63276m() {
        return mo63255g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    @NonNull
    /* renamed from: n */
    public abstract Builder mo63258n();

    @NonNull
    /* renamed from: o */
    public PersistedInstallationEntry mo63277o(@NonNull String str, long j, long j2) {
        return mo63258n().mo63261b(str).mo63262c(j).mo63267h(j2).mo63260a();
    }

    @NonNull
    /* renamed from: p */
    public PersistedInstallationEntry mo63278p() {
        return mo63258n().mo63261b((String) null).mo63260a();
    }

    @NonNull
    /* renamed from: q */
    public PersistedInstallationEntry mo63279q(@NonNull String str) {
        return mo63258n().mo63264e(str).mo63266g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).mo63260a();
    }

    @NonNull
    /* renamed from: r */
    public PersistedInstallationEntry mo63280r() {
        return mo63258n().mo63266g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).mo63260a();
    }

    @NonNull
    /* renamed from: s */
    public PersistedInstallationEntry mo63281s(@NonNull String str, @NonNull String str2, long j, @Nullable String str3, long j2) {
        return mo63258n().mo63263d(str).mo63266g(PersistedInstallation.RegistrationStatus.REGISTERED).mo63261b(str3).mo63265f(str2).mo63262c(j2).mo63267h(j).mo63260a();
    }

    @NonNull
    /* renamed from: t */
    public PersistedInstallationEntry mo63282t(@NonNull String str) {
        return mo63258n().mo63263d(str).mo63266g(PersistedInstallation.RegistrationStatus.UNREGISTERED).mo63260a();
    }
}
