package com.google.firebase.storage;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.ListNetworkRequest;
import org.json.JSONException;

class ListTask implements Runnable {

    /* renamed from: a */
    private final StorageReference f55342a;

    /* renamed from: c */
    private final TaskCompletionSource<ListResult> f55343c;

    /* renamed from: d */
    private final ExponentialBackoffSender f55344d;
    @Nullable

    /* renamed from: f */
    private final String f55345f;
    @Nullable

    /* renamed from: g */
    private final Integer f55346g;

    ListTask(@NonNull StorageReference storageReference, @Nullable Integer num, @Nullable String str, @NonNull TaskCompletionSource<ListResult> taskCompletionSource) {
        Preconditions.m4488k(storageReference);
        Preconditions.m4488k(taskCompletionSource);
        this.f55342a = storageReference;
        this.f55346g = num;
        this.f55345f = str;
        this.f55343c = taskCompletionSource;
        FirebaseStorage l = storageReference.mo63638l();
        this.f55344d = new ExponentialBackoffSender(l.mo63590a().mo61950l(), l.mo63592c(), l.mo63591b(), l.mo63595j());
    }

    public void run() {
        ListResult listResult;
        ListNetworkRequest listNetworkRequest = new ListNetworkRequest(this.f55342a.mo63639m(), this.f55342a.mo63632g(), this.f55346g, this.f55345f);
        this.f55344d.mo63717d(listNetworkRequest);
        if (listNetworkRequest.mo63747w()) {
            try {
                listResult = ListResult.m77371a(this.f55342a.mo63638l(), listNetworkRequest.mo63740o());
            } catch (JSONException e) {
                Log.e("ListTask", "Unable to parse response body. " + listNetworkRequest.mo63739n(), e);
                this.f55343c.mo56138b(StorageException.m77380d(e));
                return;
            }
        } else {
            listResult = null;
        }
        TaskCompletionSource<ListResult> taskCompletionSource = this.f55343c;
        if (taskCompletionSource != null) {
            listNetworkRequest.mo63733a(taskCompletionSource, listResult);
        }
    }
}
