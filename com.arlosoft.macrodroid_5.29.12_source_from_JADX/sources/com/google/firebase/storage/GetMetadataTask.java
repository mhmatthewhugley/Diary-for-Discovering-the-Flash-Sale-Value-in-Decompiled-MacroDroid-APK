package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetMetadataNetworkRequest;
import org.json.JSONException;

class GetMetadataTask implements Runnable {

    /* renamed from: a */
    private StorageReference f55335a;

    /* renamed from: c */
    private TaskCompletionSource<StorageMetadata> f55336c;

    /* renamed from: d */
    private StorageMetadata f55337d;

    /* renamed from: f */
    private ExponentialBackoffSender f55338f;

    public void run() {
        GetMetadataNetworkRequest getMetadataNetworkRequest = new GetMetadataNetworkRequest(this.f55335a.mo63639m(), this.f55335a.mo63632g());
        this.f55338f.mo63717d(getMetadataNetworkRequest);
        if (getMetadataNetworkRequest.mo63747w()) {
            try {
                this.f55337d = new StorageMetadata.Builder(getMetadataNetworkRequest.mo63740o(), this.f55335a).mo63618a();
            } catch (JSONException e) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + getMetadataNetworkRequest.mo63739n(), e);
                this.f55336c.mo56138b(StorageException.m77380d(e));
                return;
            }
        }
        TaskCompletionSource<StorageMetadata> taskCompletionSource = this.f55336c;
        if (taskCompletionSource != null) {
            getMetadataNetworkRequest.mo63733a(taskCompletionSource, this.f55337d);
        }
    }
}
