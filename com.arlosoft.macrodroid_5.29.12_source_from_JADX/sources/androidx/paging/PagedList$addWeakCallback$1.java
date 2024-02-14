package androidx.paging;

import androidx.paging.PagedList;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, mo71668d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/PagedList$Callback;", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: PagedList.kt */
final class PagedList$addWeakCallback$1 extends C13708q implements C16265l<WeakReference<PagedList.Callback>, Boolean> {
    public static final PagedList$addWeakCallback$1 INSTANCE = new PagedList$addWeakCallback$1();

    PagedList$addWeakCallback$1() {
        super(1);
    }

    public final Boolean invoke(WeakReference<PagedList.Callback> weakReference) {
        C13706o.m87929f(weakReference, "it");
        return Boolean.valueOf(weakReference.get() == null);
    }
}
