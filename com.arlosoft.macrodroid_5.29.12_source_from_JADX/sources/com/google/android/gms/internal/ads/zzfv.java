package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfv {

    /* renamed from: a */
    private static final Pattern f36460a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    private static final Pattern f36461b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: a */
    public static long m51072a(@Nullable String str, @Nullable String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzdw.m48252b("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f36460a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String group = matcher.group(2);
            Objects.requireNonNull(group);
            long parseLong = Long.parseLong(group);
            String group2 = matcher.group(1);
            Objects.requireNonNull(group2);
            long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
            if (j < 0) {
                return parseLong2;
            }
            if (j == parseLong2) {
                return j;
            }
            zzdw.m48255e("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, parseLong2);
        } catch (NumberFormatException unused2) {
            zzdw.m48252b("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    /* renamed from: b */
    public static long m51073b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = f36461b.matcher(str);
        if (!matcher.matches()) {
            return -1;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Long.parseLong(group);
    }
}
