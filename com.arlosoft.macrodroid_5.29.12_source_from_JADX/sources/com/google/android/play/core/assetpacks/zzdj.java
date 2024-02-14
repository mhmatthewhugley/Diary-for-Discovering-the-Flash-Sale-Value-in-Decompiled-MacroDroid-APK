package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzdj implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f51474a;

    public /* synthetic */ zzdj(String str) {
        this.f51474a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f51474a).concat(HelpFormatter.DEFAULT_OPT_PREFIX)) && str.endsWith(".apk");
    }
}
