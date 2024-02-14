package p153q5;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import java.util.Objects;

/* renamed from: q5.d */
/* compiled from: Preconditions */
public final class C8180d {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m33937a(@NonNull Context context, @Nullable String str, @StringRes int... iArr) {
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            if (!context.getString(iArr[i]).equals("CHANGE-ME")) {
                i++;
            } else {
                throw new IllegalStateException(str);
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public static <T> T m33938b(@Nullable T t, @NonNull String str, @Nullable Object... objArr) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(objArr, str);
        throw new NullPointerException(String.format(str, objArr));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static void m33939c(@NonNull Bundle bundle, @Nullable String str, @NonNull String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            if (!bundle.containsKey(strArr[i])) {
                i++;
            } else {
                throw new IllegalStateException(str);
            }
        }
    }

    @StyleRes
    /* renamed from: d */
    public static int m33940d(@NonNull Context context, int i, @NonNull String str, @Nullable Object... objArr) {
        try {
            if ("style".equals(context.getResources().getResourceTypeName(i))) {
                return i;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
