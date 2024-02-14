package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;

public class Blob implements Comparable<Blob> {

    /* renamed from: a */
    private final ByteString f5621a;

    /* renamed from: b */
    public int compareTo(@NonNull Blob blob) {
        return Util.m76520c(this.f5621a, blob.f5621a);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Blob) && this.f5621a.equals(((Blob) obj).f5621a);
    }

    public int hashCode() {
        return this.f5621a.hashCode();
    }

    @NonNull
    public String toString() {
        return "Blob { bytes=" + Util.m76530m(this.f5621a) + " }";
    }
}
