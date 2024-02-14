package androidx.window.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo71668d2 = {"Landroidx/window/core/AndroidLogger;", "Landroidx/window/core/Logger;", "", "tag", "message", "Lja/u;", "debug", "<init>", "()V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SpecificationComputer.kt */
public final class AndroidLogger implements Logger {
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    public void debug(String str, String str2) {
        C13706o.m87929f(str, "tag");
        C13706o.m87929f(str2, "message");
    }
}
