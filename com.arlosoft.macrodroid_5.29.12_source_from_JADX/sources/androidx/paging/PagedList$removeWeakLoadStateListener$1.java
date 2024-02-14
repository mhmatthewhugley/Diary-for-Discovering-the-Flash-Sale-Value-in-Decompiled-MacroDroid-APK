package androidx.paging;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n"}, mo71668d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "Lja/u;", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: PagedList.kt */
final class PagedList$removeWeakLoadStateListener$1 extends C13708q implements C16265l<WeakReference<C16269p<? super LoadType, ? super LoadState, ? extends C13339u>>, Boolean> {
    final /* synthetic */ C16269p<LoadType, LoadState, C13339u> $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagedList$removeWeakLoadStateListener$1(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        super(1);
        this.$listener = pVar;
    }

    public final Boolean invoke(WeakReference<C16269p<LoadType, LoadState, C13339u>> weakReference) {
        C13706o.m87929f(weakReference, "it");
        return Boolean.valueOf(weakReference.get() == null || weakReference.get() == this.$listener);
    }
}
