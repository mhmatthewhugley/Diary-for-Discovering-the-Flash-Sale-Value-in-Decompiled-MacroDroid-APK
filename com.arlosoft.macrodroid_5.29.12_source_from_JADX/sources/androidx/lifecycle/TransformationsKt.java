package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71667d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\b\u001a>\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006H\bø\u0001\u0000\u001aD\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001a\b\u0004\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00010\u0006H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\b"}, mo71668d2 = {"distinctUntilChanged", "Landroidx/lifecycle/LiveData;", "X", "map", "Y", "transform", "Lkotlin/Function1;", "switchMap", "lifecycle-livedata-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: Transformations.kt */
public final class TransformationsKt {
    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        C13706o.m87929f(liveData, "<this>");
        LiveData<X> distinctUntilChanged = Transformations.distinctUntilChanged(liveData);
        C13706o.m87928e(distinctUntilChanged, "distinctUntilChanged(this)");
        return distinctUntilChanged;
    }

    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, C16265l<? super X, ? extends Y> lVar) {
        C13706o.m87929f(liveData, "<this>");
        C13706o.m87929f(lVar, "transform");
        LiveData<Y> map = Transformations.map(liveData, new TransformationsKt$map$1(lVar));
        C13706o.m87928e(map, "crossinline transform: (…p(this) { transform(it) }");
        return map;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, C16265l<? super X, ? extends LiveData<Y>> lVar) {
        C13706o.m87929f(liveData, "<this>");
        C13706o.m87929f(lVar, "transform");
        LiveData<Y> switchMap = Transformations.switchMap(liveData, new TransformationsKt$switchMap$1(lVar));
        C13706o.m87928e(switchMap, "crossinline transform: (…p(this) { transform(it) }");
        return switchMap;
    }
}
