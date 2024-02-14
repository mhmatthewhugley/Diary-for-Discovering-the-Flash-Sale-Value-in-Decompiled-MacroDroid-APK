package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

@ElementTypesAreNonnullByDefault
final class OverflowAvoidingLockSupport {
    private OverflowAvoidingLockSupport() {
    }

    /* renamed from: a */
    static void m74279a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
