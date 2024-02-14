package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import p297ja.C13329n;
import p297ja.C13332o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\"\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, mo71668d2 = {"Landroid/os/Looper;", "", "async", "Landroid/os/Handler;", "a", "Lkotlinx/coroutines/android/c;", "Lkotlinx/coroutines/android/c;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.android.d */
/* compiled from: HandlerDispatcher.kt */
public final class C15194d {

    /* renamed from: a */
    public static final C15193c f64402a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C15193c cVar = null;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            obj = C13329n.m85676a(new C15190b(m93742a(Looper.getMainLooper(), true), (String) null, 2, (C13695i) null));
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            obj = C13329n.m85676a(C13332o.m85684a(th));
        }
        if (!C13329n.m85680e(obj)) {
            cVar = obj;
        }
        f64402a = cVar;
    }

    @VisibleForTesting
    /* renamed from: a */
    public static final Handler m93742a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
