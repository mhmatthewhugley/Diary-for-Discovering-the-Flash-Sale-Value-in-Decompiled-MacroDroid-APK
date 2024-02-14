package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\t"}, mo71668d2 = {"Landroidx/paging/DifferCallback;", "", "", "position", "count", "Lja/u;", "onChanged", "onInserted", "onRemoved", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* compiled from: PagingDataDiffer.kt */
public interface DifferCallback {
    void onChanged(int i, int i2);

    void onInserted(int i, int i2);

    void onRemoved(int i, int i2);
}
