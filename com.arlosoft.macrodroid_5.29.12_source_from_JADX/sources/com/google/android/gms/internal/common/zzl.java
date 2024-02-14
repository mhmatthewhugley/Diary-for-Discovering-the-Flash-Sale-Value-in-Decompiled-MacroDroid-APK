package com.google.android.gms.internal.common;

import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzl extends zzk {

    /* renamed from: a */
    private final char f39298a;

    /* renamed from: a */
    public final boolean mo48659a(char c) {
        return c == this.f39298a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.f39298a;
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
