package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Landroidx/lifecycle/EmittedSource;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", mo71894f = "CoroutineLiveData.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: CoroutineLiveData.kt */
final class CoroutineLiveDataKt$addDisposableSource$2 extends C13665l implements C16269p<C15478k0, C13635d<? super EmittedSource>, Object> {
    final /* synthetic */ LiveData<T> $source;
    final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, C13635d<? super CoroutineLiveDataKt$addDisposableSource$2> dVar) {
        super(2, dVar);
        this.$this_addDisposableSource = mediatorLiveData;
        this.$source = liveData;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super EmittedSource> dVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            final MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new Observer() {
                public final void onChanged(T t) {
                    mediatorLiveData.setValue(t);
                }
            });
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
