package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n"}, mo71668d2 = {"", "Key", "Value", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: DataSource.kt */
final class DataSource$invalidateCallbackTracker$2 extends C13708q implements C16254a<Boolean> {
    final /* synthetic */ DataSource<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataSource$invalidateCallbackTracker$2(DataSource<Key, Value> dataSource) {
        super(0);
        this.this$0 = dataSource;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.isInvalid());
    }
}
