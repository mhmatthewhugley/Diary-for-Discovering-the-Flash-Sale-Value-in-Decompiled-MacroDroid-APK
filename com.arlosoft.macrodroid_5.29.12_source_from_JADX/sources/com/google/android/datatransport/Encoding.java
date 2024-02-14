package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

public final class Encoding {

    /* renamed from: a */
    private final String f1107a;

    private Encoding(@NonNull String str) {
        Objects.requireNonNull(str, "name is null");
        this.f1107a = str;
    }

    /* renamed from: b */
    public static Encoding m954b(@NonNull String str) {
        return new Encoding(str);
    }

    /* renamed from: a */
    public String mo19267a() {
        return this.f1107a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f1107a.equals(((Encoding) obj).f1107a);
    }

    public int hashCode() {
        return this.f1107a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f1107a + "\"}";
    }
}
