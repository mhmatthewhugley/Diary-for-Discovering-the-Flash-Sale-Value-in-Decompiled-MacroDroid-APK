package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzs {

    /* renamed from: a */
    private final Context f51162a;

    zzs(Context context) {
        this.f51162a = context;
    }

    /* renamed from: b */
    private static long m70441b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File b : listFiles) {
                j += m70441b(b);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo59560a() {
        return m70441b(new File(this.f51162a.getFilesDir(), "assetpacks"));
    }
}
