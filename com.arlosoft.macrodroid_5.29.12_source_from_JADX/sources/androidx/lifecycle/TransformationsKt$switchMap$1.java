package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Metadata;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n"}, mo71668d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "Landroidx/lifecycle/LiveData;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: Transformations.kt */
public final class TransformationsKt$switchMap$1<I, O> implements Function {
    final /* synthetic */ C16265l<X, LiveData<Y>> $transform;

    public TransformationsKt$switchMap$1(C16265l<? super X, ? extends LiveData<Y>> lVar) {
        this.$transform = lVar;
    }

    public final LiveData<Y> apply(X x) {
        return this.$transform.invoke(x);
    }
}
