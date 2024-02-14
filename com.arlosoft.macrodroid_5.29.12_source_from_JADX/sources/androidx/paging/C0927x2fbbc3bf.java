package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, mo71668d2 = {"", "T", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* renamed from: androidx.paging.PagingDataDiffer$collectFrom$2$1$1$transformedLastAccessedIndex$1 */
/* compiled from: PagingDataDiffer.kt */
final class C0927x2fbbc3bf extends C13708q implements C16254a<C13339u> {
    final /* synthetic */ PagePresenter<T> $newPresenter;
    final /* synthetic */ C13678a0 $onListPresentableCalled;
    final /* synthetic */ PagingDataDiffer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0927x2fbbc3bf(PagingDataDiffer<T> pagingDataDiffer, PagePresenter<T> pagePresenter, C13678a0 a0Var) {
        super(0);
        this.this$0 = pagingDataDiffer;
        this.$newPresenter = pagePresenter;
        this.$onListPresentableCalled = a0Var;
    }

    public final void invoke() {
        this.this$0.presenter = this.$newPresenter;
        this.$onListPresentableCalled.element = true;
    }
}
