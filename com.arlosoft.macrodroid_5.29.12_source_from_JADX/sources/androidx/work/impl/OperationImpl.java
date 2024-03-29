package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class OperationImpl implements Operation {
    private final SettableFuture<Operation.State.SUCCESS> mOperationFuture = SettableFuture.create();
    private final MutableLiveData<Operation.State> mOperationState = new MutableLiveData<>();

    public OperationImpl() {
        setState(Operation.IN_PROGRESS);
    }

    @NonNull
    public ListenableFuture<Operation.State.SUCCESS> getResult() {
        return this.mOperationFuture;
    }

    @NonNull
    public LiveData<Operation.State> getState() {
        return this.mOperationState;
    }

    public void setState(@NonNull Operation.State state) {
        this.mOperationState.postValue(state);
        if (state instanceof Operation.State.SUCCESS) {
            this.mOperationFuture.set((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            this.mOperationFuture.setException(((Operation.State.FAILURE) state).getThrowable());
        }
    }
}
