package com.google.android.gms.internal.ads;

import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzfsg extends zzfsf {

    /* renamed from: a */
    private final char f36334a;

    zzfsg(char c) {
        this.f36334a = c;
    }

    /* renamed from: b */
    public final boolean mo46167b(char c) {
        return c == this.f36334a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.f36334a;
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
