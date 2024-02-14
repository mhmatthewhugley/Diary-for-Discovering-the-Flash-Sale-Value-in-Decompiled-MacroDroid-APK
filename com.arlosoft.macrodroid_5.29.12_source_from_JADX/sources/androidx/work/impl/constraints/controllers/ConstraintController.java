package androidx.work.impl.constraints.controllers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

public abstract class ConstraintController<T> implements ConstraintListener<T> {
    private OnConstraintUpdatedCallback mCallback;
    private T mCurrentValue;
    private final List<String> mMatchingWorkSpecIds = new ArrayList();
    private ConstraintTracker<T> mTracker;

    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(@NonNull List<String> list);

        void onConstraintNotMet(@NonNull List<String> list);
    }

    ConstraintController(ConstraintTracker<T> constraintTracker) {
        this.mTracker = constraintTracker;
    }

    private void updateCallback(@Nullable OnConstraintUpdatedCallback onConstraintUpdatedCallback, @Nullable T t) {
        if (!this.mMatchingWorkSpecIds.isEmpty() && onConstraintUpdatedCallback != null) {
            if (t == null || isConstrained(t)) {
                onConstraintUpdatedCallback.onConstraintNotMet(this.mMatchingWorkSpecIds);
            } else {
                onConstraintUpdatedCallback.onConstraintMet(this.mMatchingWorkSpecIds);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean hasConstraint(@NonNull WorkSpec workSpec);

    /* access modifiers changed from: package-private */
    public abstract boolean isConstrained(@NonNull T t);

    public boolean isWorkSpecConstrained(@NonNull String str) {
        T t = this.mCurrentValue;
        return t != null && isConstrained(t) && this.mMatchingWorkSpecIds.contains(str);
    }

    public void onConstraintChanged(@Nullable T t) {
        this.mCurrentValue = t;
        updateCallback(this.mCallback, t);
    }

    public void replace(@NonNull Iterable<WorkSpec> iterable) {
        this.mMatchingWorkSpecIds.clear();
        for (WorkSpec next : iterable) {
            if (hasConstraint(next)) {
                this.mMatchingWorkSpecIds.add(next.f709id);
            }
        }
        if (this.mMatchingWorkSpecIds.isEmpty()) {
            this.mTracker.removeListener(this);
        } else {
            this.mTracker.addListener(this);
        }
        updateCallback(this.mCallback, this.mCurrentValue);
    }

    public void reset() {
        if (!this.mMatchingWorkSpecIds.isEmpty()) {
            this.mMatchingWorkSpecIds.clear();
            this.mTracker.removeListener(this);
        }
    }

    public void setCallback(@Nullable OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.mCallback != onConstraintUpdatedCallback) {
            this.mCallback = onConstraintUpdatedCallback;
            updateCallback(onConstraintUpdatedCallback, this.mCurrentValue);
        }
    }
}
