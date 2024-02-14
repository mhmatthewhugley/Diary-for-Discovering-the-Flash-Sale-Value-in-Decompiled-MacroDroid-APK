package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.UpdateMetadataNetworkRequest;
import org.json.JSONException;

class UpdateMetadataTask implements Runnable {

    /* renamed from: a */
    private final StorageReference f55431a;

    /* renamed from: c */
    private final TaskCompletionSource<StorageMetadata> f55432c;

    /* renamed from: d */
    private final StorageMetadata f55433d;

    /* renamed from: f */
    private StorageMetadata f55434f;

    /* renamed from: g */
    private ExponentialBackoffSender f55435g;

    public void run() {
        UpdateMetadataNetworkRequest updateMetadataNetworkRequest = new UpdateMetadataNetworkRequest(this.f55431a.mo63639m(), this.f55431a.mo63632g(), this.f55433d.mo63612q());
        this.f55435g.mo63717d(updateMetadataNetworkRequest);
        if (updateMetadataNetworkRequest.mo63747w()) {
            try {
                this.f55434f = new StorageMetadata.Builder(updateMetadataNetworkRequest.mo63740o(), this.f55431a).mo63618a();
            } catch (JSONException e) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + updateMetadataNetworkRequest.mo63739n(), e);
                this.f55432c.mo56138b(StorageException.m77380d(e));
                return;
            }
        }
        TaskCompletionSource<StorageMetadata> taskCompletionSource = this.f55432c;
        if (taskCompletionSource != null) {
            updateMetadataNetworkRequest.mo63733a(taskCompletionSource, this.f55434f);
        }
    }
}
