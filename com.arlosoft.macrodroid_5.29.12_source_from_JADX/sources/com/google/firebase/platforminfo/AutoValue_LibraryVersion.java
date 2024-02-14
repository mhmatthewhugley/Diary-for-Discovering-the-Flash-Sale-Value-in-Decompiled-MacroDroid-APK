package com.google.firebase.platforminfo;

import java.util.Objects;

final class AutoValue_LibraryVersion extends LibraryVersion {

    /* renamed from: a */
    private final String f55179a;

    /* renamed from: b */
    private final String f55180b;

    AutoValue_LibraryVersion(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f55179a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f55180b = str2;
    }

    /* renamed from: b */
    public String mo63494b() {
        return this.f55179a;
    }

    /* renamed from: c */
    public String mo63495c() {
        return this.f55180b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        if (!this.f55179a.equals(libraryVersion.mo63494b()) || !this.f55180b.equals(libraryVersion.mo63495c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f55179a.hashCode() ^ 1000003) * 1000003) ^ this.f55180b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f55179a + ", version=" + this.f55180b + "}";
    }
}
