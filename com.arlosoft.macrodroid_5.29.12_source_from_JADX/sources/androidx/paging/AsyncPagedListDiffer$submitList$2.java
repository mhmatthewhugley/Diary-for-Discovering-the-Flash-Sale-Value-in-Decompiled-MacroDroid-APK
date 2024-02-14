package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, mo71668d2 = {"", "T", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: AsyncPagedListDiffer.kt */
final class AsyncPagedListDiffer$submitList$2 implements Runnable {
    final /* synthetic */ Runnable $commitCallback;
    final /* synthetic */ PagedList<T> $newSnapshot;
    final /* synthetic */ PagedList<T> $oldSnapshot;
    final /* synthetic */ PagedList<T> $pagedList;
    final /* synthetic */ RecordingCallback $recordingCallback;
    final /* synthetic */ int $runGeneration;
    final /* synthetic */ AsyncPagedListDiffer<T> this$0;

    AsyncPagedListDiffer$submitList$2(PagedList<T> pagedList, PagedList<T> pagedList2, AsyncPagedListDiffer<T> asyncPagedListDiffer, int i, PagedList<T> pagedList3, RecordingCallback recordingCallback, Runnable runnable) {
        this.$oldSnapshot = pagedList;
        this.$newSnapshot = pagedList2;
        this.this$0 = asyncPagedListDiffer;
        this.$runGeneration = i;
        this.$pagedList = pagedList3;
        this.$recordingCallback = recordingCallback;
        this.$commitCallback = runnable;
    }

    public final void run() {
        NullPaddedList<T> nullPaddedList = this.$oldSnapshot.getNullPaddedList();
        NullPaddedList<T> nullPaddedList2 = this.$newSnapshot.getNullPaddedList();
        DiffUtil.ItemCallback<T> diffCallback = this.this$0.getConfig$paging_runtime_release().getDiffCallback();
        C13706o.m87928e(diffCallback, "config.diffCallback");
        final NullPaddedDiffResult computeDiff = NullPaddedListDiffHelperKt.computeDiff(nullPaddedList, nullPaddedList2, diffCallback);
        Executor mainThreadExecutor$paging_runtime_release = this.this$0.getMainThreadExecutor$paging_runtime_release();
        final AsyncPagedListDiffer<T> asyncPagedListDiffer = this.this$0;
        final int i = this.$runGeneration;
        final PagedList<T> pagedList = this.$pagedList;
        final PagedList<T> pagedList2 = this.$newSnapshot;
        final RecordingCallback recordingCallback = this.$recordingCallback;
        final PagedList<T> pagedList3 = this.$oldSnapshot;
        final Runnable runnable = this.$commitCallback;
        mainThreadExecutor$paging_runtime_release.execute(new Runnable() {
            public final void run() {
                if (asyncPagedListDiffer.getMaxScheduledGeneration$paging_runtime_release() == i) {
                    asyncPagedListDiffer.latchPagedList$paging_runtime_release(pagedList, pagedList2, computeDiff, recordingCallback, pagedList3.lastLoad(), runnable);
                }
            }
        });
    }
}
