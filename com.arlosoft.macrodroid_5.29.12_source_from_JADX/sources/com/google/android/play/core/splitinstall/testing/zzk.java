package com.google.android.play.core.splitinstall.testing;

import java.io.File;
import java.io.FileFilter;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzk implements FileFilter {

    /* renamed from: a */
    public static final /* synthetic */ zzk f51836a = new zzk();

    private /* synthetic */ zzk() {
    }

    public final boolean accept(File file) {
        int i = FakeSplitInstallManager.f51799q;
        return file.getName().endsWith(".apk");
    }
}
