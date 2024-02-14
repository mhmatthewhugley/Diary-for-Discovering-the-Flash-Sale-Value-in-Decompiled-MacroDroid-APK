package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/GenerationalViewportHint;", "previous", "next", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", mo71894f = "PageFetcherSnapshot.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends C13665l implements C16270q<GenerationalViewportHint, GenerationalViewportHint, C13635d<? super GenerationalViewportHint>, Object> {
    final /* synthetic */ LoadType $loadType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, C13635d<? super PageFetcherSnapshot$collectAsGenerationalViewportHints$3> dVar) {
        super(3, dVar);
        this.$loadType = loadType;
    }

    public final Object invoke(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, C13635d<? super GenerationalViewportHint> dVar) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.$loadType, dVar);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$0 = generationalViewportHint;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$1 = generationalViewportHint2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.L$0;
            GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.L$1;
            return PageFetcherSnapshotKt.shouldPrioritizeOver(generationalViewportHint2, generationalViewportHint, this.$loadType) ? generationalViewportHint2 : generationalViewportHint;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
