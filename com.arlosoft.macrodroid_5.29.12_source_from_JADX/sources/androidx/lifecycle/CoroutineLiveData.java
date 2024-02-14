package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15516s2;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BH\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012(\u0010\u001d\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\tH\u0014J\b\u0010\u000e\u001a\u00020\tH\u0014R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo71668d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/c1;", "emitSource$lifecycle_livedata_ktx_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "emitSource", "Lja/u;", "clearSource$lifecycle_livedata_ktx_release", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "clearSource", "onActive", "onInactive", "Landroidx/lifecycle/BlockRunner;", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "Landroidx/lifecycle/EmittedSource;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/d;", "", "block", "<init>", "(Lkotlin/coroutines/g;JLqa/p;)V", "lifecycle-livedata-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CoroutineLiveData.kt */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    /* access modifiers changed from: private */
    public BlockRunner<T> blockRunner;
    private EmittedSource emittedSource;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutineLiveData(C13640g gVar, long j, C16269p pVar, int i, C13695i iVar) {
        this((i & 1) != 0 ? C13646h.f61899a : gVar, (i & 2) != 0 ? 5000 : j, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object clearSource$lifecycle_livedata_ktx_release(kotlin.coroutines.C13635d<? super p297ja.C13339u> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r0 = (androidx.lifecycle.CoroutineLiveData) r0
            p297ja.C13332o.m85685b(r5)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p297ja.C13332o.m85685b(r5)
            androidx.lifecycle.EmittedSource r5 = r4.emittedSource
            if (r5 != 0) goto L_0x003e
        L_0x003c:
            r0 = r4
            goto L_0x0049
        L_0x003e:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.disposeNow(r0)
            if (r5 != r1) goto L_0x003c
            return r1
        L_0x0049:
            r5 = 0
            r0.emittedSource = r5
            ja.u r5 = p297ja.C13339u.f61331a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.clearSource$lifecycle_livedata_ktx_release(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emitSource$lifecycle_livedata_ktx_release(androidx.lifecycle.LiveData<T> r6, kotlin.coroutines.C13635d<? super kotlinx.coroutines.C15202c1> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r6 = (androidx.lifecycle.CoroutineLiveData) r6
            p297ja.C13332o.m85685b(r7)
            goto L_0x0066
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            java.lang.Object r6 = r0.L$1
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            java.lang.Object r2 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r2 = (androidx.lifecycle.CoroutineLiveData) r2
            p297ja.C13332o.m85685b(r7)
            r7 = r6
            r6 = r2
            goto L_0x0058
        L_0x0046:
            p297ja.C13332o.m85685b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.clearSource$lifecycle_livedata_ktx_release(r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r7 = r6
            r6 = r5
        L_0x0058:
            r0.L$0 = r6
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r6, r7, r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            androidx.lifecycle.EmittedSource r7 = (androidx.lifecycle.EmittedSource) r7
            r6.emittedSource = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_ktx_release(androidx.lifecycle.LiveData, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner2 = this.blockRunner;
        if (blockRunner2 != null) {
            blockRunner2.maybeRun();
        }
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner2 = this.blockRunner;
        if (blockRunner2 != null) {
            blockRunner2.cancel();
        }
    }

    public CoroutineLiveData(C13640g gVar, long j, C16269p<? super LiveDataScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(gVar, "context");
        C13706o.m87929f(pVar, "block");
        C16269p<? super LiveDataScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar2 = pVar;
        long j2 = j;
        this.blockRunner = new BlockRunner(this, pVar2, j2, C15482l0.m94502a(C15186a1.m93731c().mo74507o().plus(gVar).plus(C15516s2.m94603a((C15561w1) gVar.get(C15561w1.f64808x)))), new C16254a<C13339u>(this) {
            final /* synthetic */ CoroutineLiveData<T> this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.blockRunner = null;
            }
        });
    }
}
