package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zzb;
import java.util.Objects;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m4478a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m4479b(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m4480c(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m4481d(@NonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public static void m4482e(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public static void m4483f(@NonNull String str) {
        if (!zzb.m4919a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public static String m4484g(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public static String m4485h(@Nullable String str, @NonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: i */
    public static void m4486i() {
        m4487j("Must not be called on the main application thread");
    }

    @KeepForSdk
    /* renamed from: j */
    public static void m4487j(@NonNull String str) {
        if (zzb.m4919a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public static <T> T m4488k(@Nullable T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: l */
    public static <T> T m4489l(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: m */
    public static int m4490m(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    /* renamed from: n */
    public static int m4491n(int i, @NonNull Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: o */
    public static long m4492o(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    /* renamed from: p */
    public static void m4493p(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    /* renamed from: q */
    public static void m4494q(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: r */
    public static void m4495r(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
