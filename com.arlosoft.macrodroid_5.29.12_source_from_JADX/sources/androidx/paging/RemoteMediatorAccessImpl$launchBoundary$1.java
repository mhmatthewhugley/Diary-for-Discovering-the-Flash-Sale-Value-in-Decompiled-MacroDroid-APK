package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", mo71894f = "RemoteMediatorAccessor.kt", mo71895l = {338}, mo71896m = "invokeSuspend")
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl$launchBoundary$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    int label;
    final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H@"}, mo71668d2 = {"", "Key", "Value", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", mo71894f = "RemoteMediatorAccessor.kt", mo71895l = {345}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1 */
    /* compiled from: RemoteMediatorAccessor.kt */
    static final class C09471 extends C13665l implements C16265l<C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;

        public final C13635d<C13339u> create(C13635d<?> dVar) {
            return new C09471(remoteMediatorAccessImpl, dVar);
        }

        public final Object invoke(C13635d<? super C13339u> dVar) {
            return ((C09471) create(dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r7.L$0
                androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                p297ja.C13332o.m85685b(r8)
                r3 = r1
                r1 = r0
                r0 = r7
                goto L_0x0056
            L_0x0016:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001e:
                p297ja.C13332o.m85685b(r8)
                r8 = r7
            L_0x0022:
                androidx.paging.RemoteMediatorAccessImpl<Key, Value> r1 = r3
                androidx.paging.AccessorStateHolder r1 = r1.accessorState
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r3 = androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.C09471.C09481.INSTANCE
                java.lang.Object r1 = r1.use(r3)
                ja.m r1 = (p297ja.C13328m) r1
                if (r1 != 0) goto L_0x0035
                ja.u r8 = p297ja.C13339u.f61331a
                return r8
            L_0x0035:
                java.lang.Object r3 = r1.mo70152a()
                androidx.paging.LoadType r3 = (androidx.paging.LoadType) r3
                java.lang.Object r1 = r1.mo70153b()
                androidx.paging.PagingState r1 = (androidx.paging.PagingState) r1
                androidx.paging.RemoteMediatorAccessImpl<Key, Value> r4 = r3
                androidx.paging.RemoteMediator r4 = r4.remoteMediator
                r8.L$0 = r3
                r8.label = r2
                java.lang.Object r1 = r4.load(r3, r1, r8)
                if (r1 != r0) goto L_0x0052
                return r0
            L_0x0052:
                r6 = r0
                r0 = r8
                r8 = r1
                r1 = r6
            L_0x0056:
                androidx.paging.RemoteMediator$MediatorResult r8 = (androidx.paging.RemoteMediator.MediatorResult) r8
                boolean r4 = r8 instanceof androidx.paging.RemoteMediator.MediatorResult.Success
                if (r4 == 0) goto L_0x006b
                androidx.paging.RemoteMediatorAccessImpl<Key, Value> r4 = r3
                androidx.paging.AccessorStateHolder r4 = r4.accessorState
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2 r5 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2
                r5.<init>(r3, r8)
                r4.use(r5)
                goto L_0x007d
            L_0x006b:
                boolean r4 = r8 instanceof androidx.paging.RemoteMediator.MediatorResult.Error
                if (r4 == 0) goto L_0x007d
                androidx.paging.RemoteMediatorAccessImpl<Key, Value> r4 = r3
                androidx.paging.AccessorStateHolder r4 = r4.accessorState
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3 r5 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3
                r5.<init>(r3, r8)
                r4.use(r5)
            L_0x007d:
                r8 = r0
                r0 = r1
                goto L_0x0022
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.C09471.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$launchBoundary$1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, C13635d<? super RemoteMediatorAccessImpl$launchBoundary$1> dVar) {
        super(2, dVar);
        this.this$0 = remoteMediatorAccessImpl;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new RemoteMediatorAccessImpl$launchBoundary$1(this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((RemoteMediatorAccessImpl$launchBoundary$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            SingleRunner access$getIsolationRunner$p = this.this$0.isolationRunner;
            final RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl = this.this$0;
            C09471 r1 = new C09471((C13635d<? super C09471>) null);
            this.label = 1;
            if (access$getIsolationRunner$p.runInIsolation(1, r1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
