package androidx.lifecycle;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo71668d2 = {"Landroidx/lifecycle/CloseableCoroutineScope;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/k0;", "Lja/u;", "close", "Lkotlin/coroutines/g;", "coroutineContext", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;)V", "lifecycle-viewmodel-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ViewModel.kt */
public final class CloseableCoroutineScope implements Closeable, C15478k0 {
    private final C13640g coroutineContext;

    public CloseableCoroutineScope(C13640g gVar) {
        C13706o.m87929f(gVar, "context");
        this.coroutineContext = gVar;
    }

    public void close() {
        C15198b2.m93748d(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public C13640g getCoroutineContext() {
        return this.coroutineContext;
    }
}
