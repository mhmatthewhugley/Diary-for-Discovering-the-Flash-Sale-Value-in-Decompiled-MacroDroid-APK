package androidx.window.core;

import androidx.window.core.ConsumerAdapter;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"androidx/window/core/ConsumerAdapter$createSubscription$1", "Landroidx/window/core/ConsumerAdapter$Subscription;", "Lja/u;", "dispose", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ConsumerAdapter.kt */
public final class ConsumerAdapter$createSubscription$1 implements ConsumerAdapter.Subscription {
    final /* synthetic */ Object $javaConsumer;
    final /* synthetic */ Object $obj;
    final /* synthetic */ Method $removeMethod;

    ConsumerAdapter$createSubscription$1(Method method, Object obj, Object obj2) {
        this.$removeMethod = method;
        this.$obj = obj;
        this.$javaConsumer = obj2;
    }

    public void dispose() {
        this.$removeMethod.invoke(this.$obj, new Object[]{this.$javaConsumer});
    }
}
