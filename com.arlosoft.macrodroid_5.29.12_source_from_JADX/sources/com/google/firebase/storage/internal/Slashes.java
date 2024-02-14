package com.google.firebase.storage.internal;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

public class Slashes {
    @NonNull
    /* renamed from: a */
    public static String m77604a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: b */
    public static String m77605b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return m77606c(Uri.encode(str));
    }

    @NonNull
    /* renamed from: c */
    public static String m77606c(@NonNull String str) {
        Preconditions.m4488k(str);
        return str.replace("%2F", "/");
    }
}
