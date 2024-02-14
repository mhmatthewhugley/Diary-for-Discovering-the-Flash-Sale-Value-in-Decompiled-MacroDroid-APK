package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    CollectPreconditions() {
    }

    /* renamed from: a */
    static void m26534a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    static int m26535b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    static long m26536c(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    static void m26537d(int i, String str) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append(str);
            sb.append(" must be positive but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    static void m26538e(boolean z) {
        Preconditions.m5399z(z, "no calls to next() since the last call to remove()");
    }
}
