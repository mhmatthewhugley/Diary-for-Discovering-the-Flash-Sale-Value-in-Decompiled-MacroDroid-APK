package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13332o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "Landroid/content/Context;", "context", "Lja/u;", "onContextAvailable", "activity-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ContextAware.kt */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ C15492n<R> $co;
    final /* synthetic */ C16265l<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(C15492n<? super R> nVar, C16265l<? super Context, ? extends R> lVar) {
        this.$co = nVar;
        this.$onContextAvailable = lVar;
    }

    public void onContextAvailable(Context context) {
        Object obj;
        C13706o.m87929f(context, "context");
        C15492n<R> nVar = this.$co;
        C16265l<Context, R> lVar = this.$onContextAvailable;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            obj = C13329n.m85676a(lVar.invoke(context));
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            obj = C13329n.m85676a(C13332o.m85684a(th));
        }
        nVar.resumeWith(obj);
    }
}
