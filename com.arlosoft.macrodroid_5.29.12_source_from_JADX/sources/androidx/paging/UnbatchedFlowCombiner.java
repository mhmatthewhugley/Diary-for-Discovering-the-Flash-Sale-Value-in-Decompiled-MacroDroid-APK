package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15559w;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15569y;
import kotlinx.coroutines.sync.C15536b;
import kotlinx.coroutines.sync.C15544d;
import p297ja.C13339u;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B:\u0012.\u0010\u0018\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo71668d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "", "index", "value", "Lja/u;", "onNext", "(ILjava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/w;", "initialDispatched", "Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/sync/b;", "lock", "Lkotlinx/coroutines/sync/b;", "", "valueReceived", "[Lkotlinx/coroutines/w;", "values", "[Ljava/lang/Object;", "Lkotlin/Function4;", "Landroidx/paging/CombineSource;", "Lkotlin/coroutines/d;", "send", "<init>", "(Lqa/r;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: FlowExt.kt */
public final class UnbatchedFlowCombiner<T1, T2> {
    private final C15559w<C13339u> initialDispatched = C15569y.m94743b((C15561w1) null, 1, (Object) null);
    private final C15536b lock;
    private final C16271r<T1, T2, CombineSource, C13635d<? super C13339u>, Object> send;
    private final C15559w<C13339u>[] valueReceived;
    private final Object[] values;

    public UnbatchedFlowCombiner(C16271r<? super T1, ? super T2, ? super CombineSource, ? super C13635d<? super C13339u>, ? extends Object> rVar) {
        C13706o.m87929f(rVar, "send");
        this.send = rVar;
        this.lock = C15544d.m94682b(false, 1, (Object) null);
        C15559w<C13339u>[] wVarArr = new C15559w[2];
        for (int i = 0; i < 2; i++) {
            wVarArr[i] = C15569y.m94743b((C15561w1) null, 1, (Object) null);
        }
        this.valueReceived = wVarArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            objArr[i2] = FlowExtKt.NULL;
        }
        this.values = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlinx.coroutines.sync.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2 A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2 A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e A[Catch:{ all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object onNext(int r17, java.lang.Object r18, kotlin.coroutines.C13635d<? super p297ja.C13339u> r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            boolean r3 = r2 instanceof androidx.paging.UnbatchedFlowCombiner$onNext$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.paging.UnbatchedFlowCombiner$onNext$1 r3 = (androidx.paging.UnbatchedFlowCombiner$onNext$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            androidx.paging.UnbatchedFlowCombiner$onNext$1 r3 = new androidx.paging.UnbatchedFlowCombiner$onNext$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r5 = r3.label
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x0069
            if (r5 == r9) goto L_0x005d
            if (r5 == r7) goto L_0x004b
            if (r5 != r6) goto L_0x0043
            java.lang.Object r0 = r3.L$1
            r4 = r0
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.C15536b) r4
            java.lang.Object r0 = r3.L$0
            androidx.paging.UnbatchedFlowCombiner r0 = (androidx.paging.UnbatchedFlowCombiner) r0
            p297ja.C13332o.m85685b(r2)     // Catch:{ all -> 0x0040 }
            goto L_0x0106
        L_0x0040:
            r0 = move-exception
            goto L_0x0117
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004b:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$2
            kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.C15536b) r5
            java.lang.Object r7 = r3.L$1
            java.lang.Object r10 = r3.L$0
            androidx.paging.UnbatchedFlowCombiner r10 = (androidx.paging.UnbatchedFlowCombiner) r10
            p297ja.C13332o.m85685b(r2)
        L_0x005a:
            r2 = r0
            r0 = r10
            goto L_0x00ab
        L_0x005d:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$1
            java.lang.Object r10 = r3.L$0
            androidx.paging.UnbatchedFlowCombiner r10 = (androidx.paging.UnbatchedFlowCombiner) r10
            p297ja.C13332o.m85685b(r2)
            goto L_0x0095
        L_0x0069:
            p297ja.C13332o.m85685b(r2)
            kotlinx.coroutines.w<ja.u>[] r2 = r1.valueReceived
            r2 = r2[r0]
            boolean r2 = r2.mo74625w()
            if (r2 == 0) goto L_0x0089
            kotlinx.coroutines.w<ja.u> r2 = r1.initialDispatched
            r3.L$0 = r1
            r5 = r18
            r3.L$1 = r5
            r3.I$0 = r0
            r3.label = r9
            java.lang.Object r2 = r2.mo74869h(r3)
            if (r2 != r4) goto L_0x0094
            return r4
        L_0x0089:
            r5 = r18
            kotlinx.coroutines.w<ja.u>[] r2 = r1.valueReceived
            r2 = r2[r0]
            ja.u r10 = p297ja.C13339u.f61331a
            r2.mo74924u(r10)
        L_0x0094:
            r10 = r1
        L_0x0095:
            kotlinx.coroutines.sync.b r2 = r10.lock
            r3.L$0 = r10
            r3.L$1 = r5
            r3.L$2 = r2
            r3.I$0 = r0
            r3.label = r7
            java.lang.Object r7 = r2.mo74906a(r8, r3)
            if (r7 != r4) goto L_0x00a8
            return r4
        L_0x00a8:
            r7 = r5
            r5 = r2
            goto L_0x005a
        L_0x00ab:
            java.lang.Object[] r10 = r0.values     // Catch:{ all -> 0x0115 }
            int r11 = r10.length     // Catch:{ all -> 0x0115 }
            r12 = 0
            r13 = 0
        L_0x00b0:
            if (r13 >= r11) goto L_0x00c4
            r14 = r10[r13]     // Catch:{ all -> 0x0115 }
            java.lang.Object r15 = androidx.paging.FlowExtKt.NULL     // Catch:{ all -> 0x0115 }
            if (r14 != r15) goto L_0x00bc
            r14 = 1
            goto L_0x00bd
        L_0x00bc:
            r14 = 0
        L_0x00bd:
            if (r14 == 0) goto L_0x00c1
            r10 = 1
            goto L_0x00c5
        L_0x00c1:
            int r13 = r13 + 1
            goto L_0x00b0
        L_0x00c4:
            r10 = 0
        L_0x00c5:
            java.lang.Object[] r11 = r0.values     // Catch:{ all -> 0x0115 }
            r11[r2] = r7     // Catch:{ all -> 0x0115 }
            int r7 = r11.length     // Catch:{ all -> 0x0115 }
            r13 = 0
        L_0x00cb:
            if (r13 >= r7) goto L_0x00df
            r14 = r11[r13]     // Catch:{ all -> 0x0115 }
            java.lang.Object r15 = androidx.paging.FlowExtKt.NULL     // Catch:{ all -> 0x0115 }
            if (r14 != r15) goto L_0x00d7
            r14 = 1
            goto L_0x00d8
        L_0x00d7:
            r14 = 0
        L_0x00d8:
            if (r14 == 0) goto L_0x00dc
            r7 = 0
            goto L_0x00e0
        L_0x00dc:
            int r13 = r13 + 1
            goto L_0x00cb
        L_0x00df:
            r7 = 1
        L_0x00e0:
            if (r7 == 0) goto L_0x010e
            if (r10 == 0) goto L_0x00e7
            androidx.paging.CombineSource r2 = androidx.paging.CombineSource.INITIAL     // Catch:{ all -> 0x0115 }
            goto L_0x00ee
        L_0x00e7:
            if (r2 != 0) goto L_0x00ec
            androidx.paging.CombineSource r2 = androidx.paging.CombineSource.RECEIVER     // Catch:{ all -> 0x0115 }
            goto L_0x00ee
        L_0x00ec:
            androidx.paging.CombineSource r2 = androidx.paging.CombineSource.OTHER     // Catch:{ all -> 0x0115 }
        L_0x00ee:
            qa.r<T1, T2, androidx.paging.CombineSource, kotlin.coroutines.d<? super ja.u>, java.lang.Object> r7 = r0.send     // Catch:{ all -> 0x0115 }
            java.lang.Object[] r10 = r0.values     // Catch:{ all -> 0x0115 }
            r11 = r10[r12]     // Catch:{ all -> 0x0115 }
            r9 = r10[r9]     // Catch:{ all -> 0x0115 }
            r3.L$0 = r0     // Catch:{ all -> 0x0115 }
            r3.L$1 = r5     // Catch:{ all -> 0x0115 }
            r3.L$2 = r8     // Catch:{ all -> 0x0115 }
            r3.label = r6     // Catch:{ all -> 0x0115 }
            java.lang.Object r2 = r7.invoke(r11, r9, r2, r3)     // Catch:{ all -> 0x0115 }
            if (r2 != r4) goto L_0x0105
            return r4
        L_0x0105:
            r4 = r5
        L_0x0106:
            kotlinx.coroutines.w<ja.u> r0 = r0.initialDispatched     // Catch:{ all -> 0x0040 }
            ja.u r2 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0040 }
            r0.mo74924u(r2)     // Catch:{ all -> 0x0040 }
            goto L_0x010f
        L_0x010e:
            r4 = r5
        L_0x010f:
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0040 }
            r4.mo74907b(r8)
            return r0
        L_0x0115:
            r0 = move-exception
            r4 = r5
        L_0x0117:
            r4.mo74907b(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.onNext(int, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
