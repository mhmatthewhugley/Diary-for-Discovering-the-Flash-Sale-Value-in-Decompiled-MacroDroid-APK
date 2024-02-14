package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\t"}, mo71668d2 = {"T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/Function1;", "Lja/u;", "onChanged", "Landroidx/lifecycle/Observer;", "observe", "lifecycle-livedata-core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: LiveData.kt */
public final class LiveDataKt {
    @MainThread
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner lifecycleOwner, C16265l<? super T, C13339u> lVar) {
        C13706o.m87929f(liveData, "<this>");
        C13706o.m87929f(lifecycleOwner, "owner");
        C13706o.m87929f(lVar, "onChanged");
        LiveDataKt$observe$wrappedObserver$1 liveDataKt$observe$wrappedObserver$1 = new LiveDataKt$observe$wrappedObserver$1(lVar);
        liveData.observe(lifecycleOwner, liveDataKt$observe$wrappedObserver$1);
        return liveDataKt$observe$wrappedObserver$1;
    }
}
