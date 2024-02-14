package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;

public final class DatabaseId implements Comparable<DatabaseId> {

    /* renamed from: a */
    private final String f54437a;

    /* renamed from: c */
    private final String f54438c;

    /* renamed from: b */
    public int compareTo(@NonNull DatabaseId databaseId) {
        int compareTo = this.f54437a.compareTo(databaseId.f54437a);
        return compareTo != 0 ? compareTo : this.f54438c.compareTo(databaseId.f54438c);
    }

    /* renamed from: d */
    public String mo62813d() {
        return this.f54438c;
    }

    /* renamed from: e */
    public String mo62814e() {
        return this.f54437a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DatabaseId.class != obj.getClass()) {
            return false;
        }
        DatabaseId databaseId = (DatabaseId) obj;
        if (!this.f54437a.equals(databaseId.f54437a) || !this.f54438c.equals(databaseId.f54438c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f54437a.hashCode() * 31) + this.f54438c.hashCode();
    }

    public String toString() {
        return "DatabaseId(" + this.f54437a + ", " + this.f54438c + ")";
    }
}
