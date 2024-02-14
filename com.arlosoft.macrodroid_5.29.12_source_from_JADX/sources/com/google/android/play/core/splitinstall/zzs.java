package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.zzag;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzs {

    /* renamed from: c */
    private static final zzag f51934c = new zzag("SplitInstallInfoProvider");

    /* renamed from: a */
    private final Context f51935a;

    /* renamed from: b */
    private final String f51936b;

    zzs(Context context) {
        this.f51935a = context;
        this.f51936b = context.getPackageName();
    }

    /* renamed from: a */
    public static String m71223a(String str) {
        if (str.startsWith("config.")) {
            return "";
        }
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: b */
    public static boolean m71224b(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: c */
    public static boolean m71225c(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }
}
