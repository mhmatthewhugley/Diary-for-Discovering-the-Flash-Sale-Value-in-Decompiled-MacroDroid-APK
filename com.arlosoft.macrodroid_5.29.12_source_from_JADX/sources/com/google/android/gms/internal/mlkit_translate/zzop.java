package com.google.android.gms.internal.mlkit_translate;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzop {

    /* renamed from: a */
    private final String f44357a;

    zzop(String str) {
        Preconditions.m4489l(str, "Null FID");
        int length = str.length();
        Preconditions.m4479b(length == 22, "Invalid FID: must be exactly 22 characters: ".concat(str));
        char charAt = str.charAt(0);
        Preconditions.m4479b(charAt >= 'c' && charAt <= 'f', "Invalid FID: must start with [c-f]: ".concat(str));
        for (int i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            Preconditions.m4479b((charAt2 >= '0' && charAt2 <= '9') || (charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '-' || charAt2 == '_'), "Invalid FID: must contain only URL-safe base-64 characters: ".concat(str));
        }
        this.f44357a = str;
    }

    /* renamed from: a */
    public final String mo52371a() {
        return this.f44357a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzop)) {
            return false;
        }
        return this.f44357a.equals(((zzop) obj).f44357a);
    }

    public final int hashCode() {
        return this.f44357a.hashCode();
    }
}
