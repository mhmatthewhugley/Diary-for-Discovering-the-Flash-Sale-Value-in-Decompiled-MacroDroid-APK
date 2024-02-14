package com.google.firebase.firestore.auth;

import androidx.annotation.Nullable;

public final class User {

    /* renamed from: b */
    public static final User f5771b = new User((String) null);
    @Nullable

    /* renamed from: a */
    private final String f5772a;

    public User(@Nullable String str) {
        this.f5772a = str;
    }

    @Nullable
    /* renamed from: a */
    public String mo23756a() {
        return this.f5772a;
    }

    /* renamed from: b */
    public boolean mo23757b() {
        return this.f5772a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }
        String str = this.f5772a;
        String str2 = ((User) obj).f5772a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5772a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.f5772a + ")";
    }
}
