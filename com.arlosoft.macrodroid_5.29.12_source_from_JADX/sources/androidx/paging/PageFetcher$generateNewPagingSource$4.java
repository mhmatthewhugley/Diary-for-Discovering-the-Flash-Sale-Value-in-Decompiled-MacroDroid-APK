package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13704m;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: PageFetcher.kt */
/* synthetic */ class PageFetcher$generateNewPagingSource$4 extends C13704m implements C16254a<C13339u> {
    PageFetcher$generateNewPagingSource$4(Object obj) {
        super(0, obj, PageFetcher.class, "invalidate", "invalidate()V", 0);
    }

    public final void invoke() {
        ((PageFetcher) this.receiver).invalidate();
    }
}
