package androidx.core.p007os;

import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.HandlerKt$postAtTime$runnable$1 */
/* compiled from: Handler.kt */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ C16254a<C13339u> $action;

    public HandlerKt$postAtTime$runnable$1(C16254a<C13339u> aVar) {
        this.$action = aVar;
    }

    public final void run() {
        this.$action.invoke();
    }
}
