package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfxq implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f36535a;

    public zzfxq(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f36535a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f36535a.matcher(str).matches();
    }
}
