package p484yf;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, mo71668d2 = {"mainthread_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: yf.a */
/* compiled from: MainThread.kt */
public final class C17517a {

    /* renamed from: a */
    public static final Looper f69346a;

    /* renamed from: b */
    public static final Thread f69347b;

    static {
        Looper mainLooper = Looper.getMainLooper();
        C13706o.m87926c(mainLooper);
        f69346a = mainLooper;
        Thread thread = mainLooper.getThread();
        C13706o.m87928e(thread, "mainLooper.thread");
        f69347b = thread;
    }
}
