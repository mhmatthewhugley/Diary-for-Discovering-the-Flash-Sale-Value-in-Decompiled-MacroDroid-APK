package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzeo implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ zzeo f51590a = new zzeo();

    private /* synthetic */ zzeo() {
    }

    public final boolean accept(File file, String str) {
        return zzep.f51591a.matcher(str).matches();
    }
}
