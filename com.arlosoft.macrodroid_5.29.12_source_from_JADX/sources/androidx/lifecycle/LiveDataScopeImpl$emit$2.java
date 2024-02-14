package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", mo71894f = "CoroutineLiveData.kt", mo71895l = {98}, mo71896m = "invokeSuspend")
/* compiled from: CoroutineLiveData.kt */
final class LiveDataScopeImpl$emit$2 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ T $value;
    int label;
    final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LiveDataScopeImpl$emit$2(LiveDataScopeImpl<T> liveDataScopeImpl, T t, C13635d<? super LiveDataScopeImpl$emit$2> dVar) {
        super(2, dVar);
        this.this$0 = liveDataScopeImpl;
        this.$value = t;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((LiveDataScopeImpl$emit$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            CoroutineLiveData<T> target$lifecycle_livedata_ktx_release = this.this$0.getTarget$lifecycle_livedata_ktx_release();
            this.label = 1;
            if (target$lifecycle_livedata_ktx_release.clearSource$lifecycle_livedata_ktx_release(this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.getTarget$lifecycle_livedata_ktx_release().setValue(this.$value);
        return C13339u.f61331a;
    }
}
