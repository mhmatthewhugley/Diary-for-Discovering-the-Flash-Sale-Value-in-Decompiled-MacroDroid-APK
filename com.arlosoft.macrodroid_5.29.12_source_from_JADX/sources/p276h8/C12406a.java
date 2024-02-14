package p276h8;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* renamed from: h8.a */
/* compiled from: Assertions */
public final class C12406a {
    /* renamed from: a */
    public static void m83257a(int i, int i2, int i3, @NonNull String str) {
        if (i2 > i3) {
            throw new IllegalArgumentException("maxInclusive is not >= minInclusive");
        } else if (i < i2 || i > i3) {
            throw new AssertionError(m83261e("%s=%d is not in the range [%d, %d]", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    /* renamed from: b */
    public static void m83258b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError("Current thread is not the main thread");
        }
    }

    /* renamed from: c */
    public static void m83259c(@Nullable String str, @NonNull String str2) {
        if (str == null || str.length() == 0) {
            throw new AssertionError(m83261e("%s cannot be null or empty", str2));
        }
    }

    /* renamed from: d */
    public static void m83260d(@Nullable Object obj, @NonNull String str) {
        if (obj == null) {
            throw new AssertionError(m83261e("%s cannot be null", str));
        }
    }

    @NonNull
    /* renamed from: e */
    private static String m83261e(@NonNull String str, @NonNull Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
