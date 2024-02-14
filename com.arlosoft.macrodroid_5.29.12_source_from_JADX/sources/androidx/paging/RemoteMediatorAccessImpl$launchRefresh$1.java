package androidx.paging;

import androidx.paging.RemoteMediator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13678a0;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", mo71894f = "RemoteMediatorAccessor.kt", mo71895l = {266}, mo71896m = "invokeSuspend")
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl$launchRefresh$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H@"}, mo71668d2 = {"", "Key", "Value", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", mo71894f = "RemoteMediatorAccessor.kt", mo71895l = {273}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1 */
    /* compiled from: RemoteMediatorAccessor.kt */
    static final class C09511 extends C13665l implements C16265l<C13635d<? super C13339u>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public final C13635d<C13339u> create(C13635d<?> dVar) {
            return new C09511(remoteMediatorAccessImpl, a0Var2, dVar);
        }

        public final Object invoke(C13635d<? super C13339u> dVar) {
            return ((C09511) create(dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
            C13678a0 a0Var;
            boolean z;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                PagingState pagingState = (PagingState) remoteMediatorAccessImpl.accessorState.use(RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1.INSTANCE);
                if (pagingState != null) {
                    remoteMediatorAccessImpl = remoteMediatorAccessImpl;
                    C13678a0 a0Var2 = a0Var2;
                    RemoteMediator access$getRemoteMediator$p = remoteMediatorAccessImpl.remoteMediator;
                    LoadType loadType = LoadType.REFRESH;
                    this.L$0 = remoteMediatorAccessImpl;
                    this.L$1 = a0Var2;
                    this.label = 1;
                    obj = access$getRemoteMediator$p.load(loadType, pagingState, this);
                    if (obj == c) {
                        return c;
                    }
                    a0Var = a0Var2;
                }
                return C13339u.f61331a;
            } else if (i == 1) {
                a0Var = (C13678a0) this.L$1;
                remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
            if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                z = ((Boolean) remoteMediatorAccessImpl.accessorState.use(new RemoteMediatorAccessImpl$launchRefresh$1$1$1$1(mediatorResult))).booleanValue();
            } else if (mediatorResult instanceof RemoteMediator.MediatorResult.Error) {
                z = ((Boolean) remoteMediatorAccessImpl.accessorState.use(new RemoteMediatorAccessImpl$launchRefresh$1$1$1$2(mediatorResult))).booleanValue();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            a0Var.element = z;
            return C13339u.f61331a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$launchRefresh$1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, C13635d<? super RemoteMediatorAccessImpl$launchRefresh$1> dVar) {
        super(2, dVar);
        this.this$0 = remoteMediatorAccessImpl;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new RemoteMediatorAccessImpl$launchRefresh$1(this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((RemoteMediatorAccessImpl$launchRefresh$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        C13678a0 a0Var;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            final C13678a0 a0Var2 = new C13678a0();
            SingleRunner access$getIsolationRunner$p = this.this$0.isolationRunner;
            final RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl = this.this$0;
            C09511 r4 = new C09511((C13635d<? super C09511>) null);
            this.L$0 = a0Var2;
            this.label = 1;
            if (access$getIsolationRunner$p.runInIsolation(2, r4, this) == c) {
                return c;
            }
            a0Var = a0Var2;
        } else if (i == 1) {
            a0Var = (C13678a0) this.L$0;
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (a0Var.element) {
            this.this$0.launchBoundary();
        }
        return C13339u.f61331a;
    }
}
