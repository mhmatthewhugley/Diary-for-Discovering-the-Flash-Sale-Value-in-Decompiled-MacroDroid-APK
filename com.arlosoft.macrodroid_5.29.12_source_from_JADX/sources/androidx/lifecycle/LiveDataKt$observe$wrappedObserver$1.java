package androidx.lifecycle;

import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n"}, mo71668d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: LiveData.kt */
public final class LiveDataKt$observe$wrappedObserver$1<T> implements Observer {
    final /* synthetic */ C16265l<T, C13339u> $onChanged;

    public LiveDataKt$observe$wrappedObserver$1(C16265l<? super T, C13339u> lVar) {
        this.$onChanged = lVar;
    }

    public final void onChanged(T t) {
        this.$onChanged.invoke(t);
    }
}
