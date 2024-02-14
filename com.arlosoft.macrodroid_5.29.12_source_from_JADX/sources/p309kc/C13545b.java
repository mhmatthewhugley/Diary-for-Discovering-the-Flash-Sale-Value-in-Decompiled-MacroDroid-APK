package p309kc;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0002"}, mo71668d2 = {"Lja/u;", "a", "leakcanary-android-utils_release"}, mo71669k = 2, mo71670mv = {1, 4, 1})
/* renamed from: kc.b */
/* compiled from: Handlers.kt */
public final class C13545b {

    /* renamed from: a */
    private static final C13321g f61820a = C13323i.m85669b(C13546a.f61821a);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Landroid/os/Handler;", "a", "()Landroid/os/Handler;"}, mo71669k = 3, mo71670mv = {1, 4, 1})
    /* renamed from: kc.b$a */
    /* compiled from: Handlers.kt */
    static final class C13546a extends C13708q implements C16254a<Handler> {

        /* renamed from: a */
        public static final C13546a f61821a = new C13546a();

        C13546a() {
            super(0);
        }

        /* renamed from: a */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static final void m87345a() {
        Looper mainLooper = Looper.getMainLooper();
        C13706o.m87925b(mainLooper, "Looper.getMainLooper()");
        if (!(mainLooper.getThread() == Thread.currentThread())) {
            throw new IllegalStateException(("Should be called from the main thread, not " + Thread.currentThread()).toString());
        }
    }
}
