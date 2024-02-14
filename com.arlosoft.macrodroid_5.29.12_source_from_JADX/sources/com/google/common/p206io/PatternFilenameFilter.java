package com.google.common.p206io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@Beta
/* renamed from: com.google.common.io.PatternFilenameFilter */
public final class PatternFilenameFilter implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f53012a;

    public boolean accept(File file, String str) {
        return this.f53012a.matcher(str).matches();
    }
}
