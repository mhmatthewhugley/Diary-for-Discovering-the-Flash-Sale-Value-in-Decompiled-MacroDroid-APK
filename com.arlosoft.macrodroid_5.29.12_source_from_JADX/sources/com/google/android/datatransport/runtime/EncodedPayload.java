package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;
import java.util.Objects;

public final class EncodedPayload {

    /* renamed from: a */
    private final Encoding f1354a;

    /* renamed from: b */
    private final byte[] f1355b;

    public EncodedPayload(@NonNull Encoding encoding, @NonNull byte[] bArr) {
        Objects.requireNonNull(encoding, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f1354a = encoding;
        this.f1355b = bArr;
    }

    /* renamed from: a */
    public byte[] mo19440a() {
        return this.f1355b;
    }

    /* renamed from: b */
    public Encoding mo19441b() {
        return this.f1354a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (!this.f1354a.equals(encodedPayload.f1354a)) {
            return false;
        }
        return Arrays.equals(this.f1355b, encodedPayload.f1355b);
    }

    public int hashCode() {
        return ((this.f1354a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1355b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f1354a + ", bytes=[...]}";
    }
}
