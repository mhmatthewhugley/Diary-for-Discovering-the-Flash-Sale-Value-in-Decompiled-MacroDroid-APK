package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.DeleteNetworkRequest;

class DeleteStorageTask implements Runnable {

    /* renamed from: a */
    private StorageReference f55304a;

    /* renamed from: c */
    private TaskCompletionSource<Void> f55305c;

    /* renamed from: d */
    private ExponentialBackoffSender f55306d;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeleteStorageTask(@NonNull StorageReference storageReference, @NonNull TaskCompletionSource<Void> taskCompletionSource) {
        Preconditions.m4488k(storageReference);
        Preconditions.m4488k(taskCompletionSource);
        this.f55304a = storageReference;
        this.f55305c = taskCompletionSource;
        FirebaseStorage l = storageReference.mo63638l();
        this.f55306d = new ExponentialBackoffSender(l.mo63590a().mo61950l(), l.mo63592c(), l.mo63591b(), l.mo63595j());
    }

    public void run() {
        DeleteNetworkRequest deleteNetworkRequest = new DeleteNetworkRequest(this.f55304a.mo63639m(), this.f55304a.mo63632g());
        this.f55306d.mo63717d(deleteNetworkRequest);
        deleteNetworkRequest.mo63733a(this.f55305c, null);
    }
}
