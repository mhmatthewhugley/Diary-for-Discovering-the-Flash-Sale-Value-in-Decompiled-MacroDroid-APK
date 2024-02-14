package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0004*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00030\u0003H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/PagingSource;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: InvalidatingPagingSourceFactory.kt */
final class InvalidatingPagingSourceFactory$invalidate$1 extends C13708q implements C16265l<PagingSource<Key, Value>, Boolean> {
    public static final InvalidatingPagingSourceFactory$invalidate$1 INSTANCE = new InvalidatingPagingSourceFactory$invalidate$1();

    InvalidatingPagingSourceFactory$invalidate$1() {
        super(1);
    }

    public final Boolean invoke(PagingSource<Key, Value> pagingSource) {
        return Boolean.valueOf(pagingSource.getInvalid());
    }
}
