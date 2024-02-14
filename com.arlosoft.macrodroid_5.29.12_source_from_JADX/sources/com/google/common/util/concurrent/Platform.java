package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Platform {
    private Platform() {
    }

    /* renamed from: a */
    static boolean m74280a(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }
}
