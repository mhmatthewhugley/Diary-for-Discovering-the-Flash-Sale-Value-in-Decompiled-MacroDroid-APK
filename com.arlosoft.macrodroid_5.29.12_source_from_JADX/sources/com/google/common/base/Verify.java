package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Verify {
    private Verify() {
    }

    /* renamed from: a */
    public static void m5498a(boolean z, String str, Object obj) {
        if (!z) {
            throw new VerifyException(Strings.m5473c(str, obj));
        }
    }
}
