package p090f5;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Objects;

/* renamed from: f5.j */
/* compiled from: Preconditions */
public final class C7315j {
    /* renamed from: a */
    public static void m30201a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    /* renamed from: b */
    public static String m30202b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m30203c(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @NonNull
    /* renamed from: d */
    public static <T> T m30204d(@Nullable T t) {
        return m30205e(t, "Argument must not be null");
    }

    @NonNull
    /* renamed from: e */
    public static <T> T m30205e(@Nullable T t, @NonNull String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
