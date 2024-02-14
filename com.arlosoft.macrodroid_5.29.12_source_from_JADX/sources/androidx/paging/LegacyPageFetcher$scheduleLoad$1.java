package androidx.paging;

import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "K", "V", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", mo71894f = "LegacyPageFetcher.kt", mo71895l = {53}, mo71896m = "invokeSuspend")
/* compiled from: LegacyPageFetcher.kt */
final class LegacyPageFetcher$scheduleLoad$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ PagingSource.LoadParams<K> $params;
    final /* synthetic */ LoadType $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyPageFetcher<K, V> this$0;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "K", "V", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", mo71894f = "LegacyPageFetcher.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1 */
    /* compiled from: LegacyPageFetcher.kt */
    static final class C08901 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C08901(loadResult, legacyPageFetcher, loadType, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C08901) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                PagingSource.LoadResult<K, V> loadResult = loadResult;
                if (loadResult instanceof PagingSource.LoadResult.Page) {
                    legacyPageFetcher.onLoadSuccess(loadType, (PagingSource.LoadResult.Page) loadResult);
                } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                    legacyPageFetcher.onLoadError(loadType, ((PagingSource.LoadResult.Error) loadResult).getThrowable());
                } else if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                    legacyPageFetcher.onLoadInvalid();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyPageFetcher$scheduleLoad$1(LegacyPageFetcher<K, V> legacyPageFetcher, PagingSource.LoadParams<K> loadParams, LoadType loadType, C13635d<? super LegacyPageFetcher$scheduleLoad$1> dVar) {
        super(2, dVar);
        this.this$0 = legacyPageFetcher;
        this.$params = loadParams;
        this.$type = loadType;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$1 = new LegacyPageFetcher$scheduleLoad$1(this.this$0, this.$params, this.$type, dVar);
        legacyPageFetcher$scheduleLoad$1.L$0 = obj;
        return legacyPageFetcher$scheduleLoad$1;
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((LegacyPageFetcher$scheduleLoad$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        C15478k0 k0Var;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15478k0 k0Var2 = (C15478k0) this.L$0;
            PagingSource<K, V> source = this.this$0.getSource();
            PagingSource.LoadParams<K> loadParams = this.$params;
            this.L$0 = k0Var2;
            this.label = 1;
            Object load = source.load(loadParams, this);
            if (load == c) {
                return c;
            }
            k0Var = k0Var2;
            obj = load;
        } else if (i == 1) {
            k0Var = (C15478k0) this.L$0;
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
        if (this.this$0.getSource().getInvalid()) {
            this.this$0.detach();
            return C13339u.f61331a;
        }
        C15415h0 access$getNotifyDispatcher$p = this.this$0.notifyDispatcher;
        final LegacyPageFetcher<K, V> legacyPageFetcher = this.this$0;
        final LoadType loadType = this.$type;
        C15561w1 unused = C15473j.m94492d(k0Var, access$getNotifyDispatcher$p, (C15486m0) null, new C08901((C13635d<? super C08901>) null), 2, (Object) null);
        return C13339u.f61331a;
    }
}
