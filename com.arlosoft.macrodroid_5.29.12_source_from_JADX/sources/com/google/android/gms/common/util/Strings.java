package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class Strings {

    /* renamed from: a */
    private static final Pattern f3947a = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public static String m4911a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m4912b(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
