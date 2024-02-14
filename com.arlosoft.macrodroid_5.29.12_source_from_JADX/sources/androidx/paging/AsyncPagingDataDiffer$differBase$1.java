package androidx.paging;

import kotlin.Metadata;
import kotlinx.coroutines.C15415h0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JG\u0010\n\u001a\u0004\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo71668d2 = {"androidx/paging/AsyncPagingDataDiffer$differBase$1", "Landroidx/paging/PagingDataDiffer;", "Landroidx/paging/NullPaddedList;", "previousList", "newList", "", "lastAccessedIndex", "Lkotlin/Function0;", "Lja/u;", "onListPresentable", "presentNewList", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;ILqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "postEvents", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer$differBase$1 extends PagingDataDiffer<T> {
    final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$differBase$1(AsyncPagingDataDiffer<T> asyncPagingDataDiffer, DifferCallback differCallback, C15415h0 h0Var) {
        super(differCallback, h0Var);
        this.this$0 = asyncPagingDataDiffer;
    }

    public boolean postEvents() {
        return this.this$0.getInGetItem$paging_runtime_release();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: qa.a<ja.u>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.paging.NullPaddedList<T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object presentNewList(androidx.paging.NullPaddedList<T> r7, androidx.paging.NullPaddedList<T> r8, int r9, p370qa.C16254a<p297ja.C13339u> r10, kotlin.coroutines.C13635d<? super java.lang.Integer> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1 r0 = (androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1 r0 = new androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            int r9 = r0.I$0
            java.lang.Object r7 = r0.L$3
            r10 = r7
            qa.a r10 = (p370qa.C16254a) r10
            java.lang.Object r7 = r0.L$2
            r8 = r7
            androidx.paging.NullPaddedList r8 = (androidx.paging.NullPaddedList) r8
            java.lang.Object r7 = r0.L$1
            androidx.paging.NullPaddedList r7 = (androidx.paging.NullPaddedList) r7
            java.lang.Object r0 = r0.L$0
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r0 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r0
            p297ja.C13332o.m85685b(r11)
            goto L_0x0099
        L_0x003e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0046:
            p297ja.C13332o.m85685b(r11)
            int r11 = r7.getSize()
            r2 = 0
            if (r11 != 0) goto L_0x0061
            r10.invoke()
            androidx.paging.AsyncPagingDataDiffer<T> r7 = r6.this$0
            androidx.paging.DifferCallback r7 = r7.getDifferCallback$paging_runtime_release()
            int r8 = r8.getSize()
            r7.onInserted(r2, r8)
            goto L_0x00af
        L_0x0061:
            int r11 = r8.getSize()
            if (r11 != 0) goto L_0x0078
            r10.invoke()
            androidx.paging.AsyncPagingDataDiffer<T> r8 = r6.this$0
            androidx.paging.DifferCallback r8 = r8.getDifferCallback$paging_runtime_release()
            int r7 = r7.getSize()
            r8.onRemoved(r2, r7)
            goto L_0x00af
        L_0x0078:
            androidx.paging.AsyncPagingDataDiffer<T> r11 = r6.this$0
            kotlinx.coroutines.h0 r11 = r11.workerDispatcher
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 r2 = new androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1
            androidx.paging.AsyncPagingDataDiffer<T> r5 = r6.this$0
            r2.<init>(r7, r8, r5, r4)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r10
            r0.I$0 = r9
            r0.label = r3
            java.lang.Object r11 = kotlinx.coroutines.C15414h.m94298g(r11, r2, r0)
            if (r11 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r0 = r6
        L_0x0099:
            androidx.paging.NullPaddedDiffResult r11 = (androidx.paging.NullPaddedDiffResult) r11
            r10.invoke()
            androidx.paging.AsyncPagingDataDiffer<T> r10 = r0.this$0
            androidx.recyclerview.widget.ListUpdateCallback r10 = r10.updateCallback
            androidx.paging.NullPaddedListDiffHelperKt.dispatchDiff(r7, r10, r8, r11)
            int r7 = androidx.paging.NullPaddedListDiffHelperKt.transformAnchorIndex(r7, r11, r8, r9)
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r7)
        L_0x00af:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$differBase$1.presentNewList(androidx.paging.NullPaddedList, androidx.paging.NullPaddedList, int, qa.a, kotlin.coroutines.d):java.lang.Object");
    }
}
