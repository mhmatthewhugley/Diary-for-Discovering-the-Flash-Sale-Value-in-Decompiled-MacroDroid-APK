package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p370qa.C16269p;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.PageEvent$Insert", mo71894f = "PageEvent.kt", mo71895l = {74}, mo71896m = "map")
/* compiled from: PageEvent.kt */
final class PageEvent$Insert$map$1<R> extends C13656d {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageEvent.Insert<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageEvent$Insert$map$1(PageEvent.Insert<T> insert, C13635d<? super PageEvent$Insert$map$1> dVar) {
        super(dVar);
        this.this$0 = insert;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((C16269p) null, this);
    }
}
