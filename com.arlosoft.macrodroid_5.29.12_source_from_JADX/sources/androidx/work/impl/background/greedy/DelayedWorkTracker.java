package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DelayedWorkTracker {
    static final String TAG = Logger.tagWithPrefix("DelayedWorkTracker");
    final GreedyScheduler mGreedyScheduler;
    private final RunnableScheduler mRunnableScheduler;
    private final Map<String, Runnable> mRunnables = new HashMap();

    public DelayedWorkTracker(@NonNull GreedyScheduler greedyScheduler, @NonNull RunnableScheduler runnableScheduler) {
        this.mGreedyScheduler = greedyScheduler;
        this.mRunnableScheduler = runnableScheduler;
    }

    public void schedule(@NonNull final WorkSpec workSpec) {
        Runnable remove = this.mRunnables.remove(workSpec.f709id);
        if (remove != null) {
            this.mRunnableScheduler.cancel(remove);
        }
        C13361 r0 = new Runnable() {
            public void run() {
                Logger.get().debug(DelayedWorkTracker.TAG, String.format("Scheduling work %s", new Object[]{workSpec.f709id}), new Throwable[0]);
                DelayedWorkTracker.this.mGreedyScheduler.schedule(workSpec);
            }
        };
        this.mRunnables.put(workSpec.f709id, r0);
        long currentTimeMillis = System.currentTimeMillis();
        this.mRunnableScheduler.scheduleWithDelay(workSpec.calculateNextRunTime() - currentTimeMillis, r0);
    }

    public void unschedule(@NonNull String str) {
        Runnable remove = this.mRunnables.remove(str);
        if (remove != null) {
            this.mRunnableScheduler.cancel(remove);
        }
    }
}
