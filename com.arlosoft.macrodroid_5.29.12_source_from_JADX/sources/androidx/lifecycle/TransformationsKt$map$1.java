package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Metadata;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n"}, mo71668d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: Transformations.kt */
public final class TransformationsKt$map$1<I, O> implements Function {
    final /* synthetic */ C16265l<X, Y> $transform;

    public TransformationsKt$map$1(C16265l<? super X, ? extends Y> lVar) {
        this.$transform = lVar;
    }

    public final Y apply(X x) {
        return this.$transform.invoke(x);
    }
}
