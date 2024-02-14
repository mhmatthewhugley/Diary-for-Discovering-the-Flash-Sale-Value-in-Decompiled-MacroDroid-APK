package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.util.Objects;

final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* renamed from: b */
    private final String f54867b;

    /* renamed from: c */
    private final PersistedInstallation.RegistrationStatus f54868c;

    /* renamed from: d */
    private final String f54869d;

    /* renamed from: e */
    private final String f54870e;

    /* renamed from: f */
    private final long f54871f;

    /* renamed from: g */
    private final long f54872g;

    /* renamed from: h */
    private final String f54873h;

    static final class Builder extends PersistedInstallationEntry.Builder {

        /* renamed from: a */
        private String f54874a;

        /* renamed from: b */
        private PersistedInstallation.RegistrationStatus f54875b;

        /* renamed from: c */
        private String f54876c;

        /* renamed from: d */
        private String f54877d;

        /* renamed from: e */
        private Long f54878e;

        /* renamed from: f */
        private Long f54879f;

        /* renamed from: g */
        private String f54880g;

        /* renamed from: a */
        public PersistedInstallationEntry mo63260a() {
            String str = "";
            if (this.f54875b == null) {
                str = str + " registrationStatus";
            }
            if (this.f54878e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f54879f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.f54874a, this.f54875b, this.f54876c, this.f54877d, this.f54878e.longValue(), this.f54879f.longValue(), this.f54880g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public PersistedInstallationEntry.Builder mo63261b(@Nullable String str) {
            this.f54876c = str;
            return this;
        }

        /* renamed from: c */
        public PersistedInstallationEntry.Builder mo63262c(long j) {
            this.f54878e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public PersistedInstallationEntry.Builder mo63263d(String str) {
            this.f54874a = str;
            return this;
        }

        /* renamed from: e */
        public PersistedInstallationEntry.Builder mo63264e(@Nullable String str) {
            this.f54880g = str;
            return this;
        }

        /* renamed from: f */
        public PersistedInstallationEntry.Builder mo63265f(@Nullable String str) {
            this.f54877d = str;
            return this;
        }

        /* renamed from: g */
        public PersistedInstallationEntry.Builder mo63266g(PersistedInstallation.RegistrationStatus registrationStatus) {
            Objects.requireNonNull(registrationStatus, "Null registrationStatus");
            this.f54875b = registrationStatus;
            return this;
        }

        /* renamed from: h */
        public PersistedInstallationEntry.Builder mo63267h(long j) {
            this.f54879f = Long.valueOf(j);
            return this;
        }

        Builder() {
        }

        private Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.f54874a = persistedInstallationEntry.mo63251d();
            this.f54875b = persistedInstallationEntry.mo63255g();
            this.f54876c = persistedInstallationEntry.mo63249b();
            this.f54877d = persistedInstallationEntry.mo63254f();
            this.f54878e = Long.valueOf(persistedInstallationEntry.mo63250c());
            this.f54879f = Long.valueOf(persistedInstallationEntry.mo63256h());
            this.f54880g = persistedInstallationEntry.mo63252e();
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo63249b() {
        return this.f54869d;
    }

    /* renamed from: c */
    public long mo63250c() {
        return this.f54871f;
    }

    @Nullable
    /* renamed from: d */
    public String mo63251d() {
        return this.f54867b;
    }

    @Nullable
    /* renamed from: e */
    public String mo63252e() {
        return this.f54873h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f54867b;
        if (str3 != null ? str3.equals(persistedInstallationEntry.mo63251d()) : persistedInstallationEntry.mo63251d() == null) {
            if (this.f54868c.equals(persistedInstallationEntry.mo63255g()) && ((str = this.f54869d) != null ? str.equals(persistedInstallationEntry.mo63249b()) : persistedInstallationEntry.mo63249b() == null) && ((str2 = this.f54870e) != null ? str2.equals(persistedInstallationEntry.mo63254f()) : persistedInstallationEntry.mo63254f() == null) && this.f54871f == persistedInstallationEntry.mo63250c() && this.f54872g == persistedInstallationEntry.mo63256h()) {
                String str4 = this.f54873h;
                if (str4 == null) {
                    if (persistedInstallationEntry.mo63252e() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.mo63252e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo63254f() {
        return this.f54870e;
    }

    @NonNull
    /* renamed from: g */
    public PersistedInstallation.RegistrationStatus mo63255g() {
        return this.f54868c;
    }

    /* renamed from: h */
    public long mo63256h() {
        return this.f54872g;
    }

    public int hashCode() {
        String str = this.f54867b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f54868c.hashCode()) * 1000003;
        String str2 = this.f54869d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f54870e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f54871f;
        long j2 = this.f54872g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f54873h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public PersistedInstallationEntry.Builder mo63258n() {
        return new Builder(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f54867b + ", registrationStatus=" + this.f54868c + ", authToken=" + this.f54869d + ", refreshToken=" + this.f54870e + ", expiresInSecs=" + this.f54871f + ", tokenCreationEpochInSecs=" + this.f54872g + ", fisError=" + this.f54873h + "}";
    }

    private AutoValue_PersistedInstallationEntry(@Nullable String str, PersistedInstallation.RegistrationStatus registrationStatus, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.f54867b = str;
        this.f54868c = registrationStatus;
        this.f54869d = str2;
        this.f54870e = str3;
        this.f54871f = j;
        this.f54872g = j2;
        this.f54873h = str4;
    }
}
