package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetMetadataNetworkRequest;
import org.json.JSONObject;

class GetDownloadUrlTask implements Runnable {

    /* renamed from: a */
    private StorageReference f55332a;

    /* renamed from: c */
    private TaskCompletionSource<Uri> f55333c;

    /* renamed from: d */
    private ExponentialBackoffSender f55334d;

    /* renamed from: a */
    private Uri m77370a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(",", -1)[0];
        Uri.Builder buildUpon = this.f55332a.mo63639m().mo63723c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter("token", str);
        return buildUpon.build();
    }

    public void run() {
        GetMetadataNetworkRequest getMetadataNetworkRequest = new GetMetadataNetworkRequest(this.f55332a.mo63639m(), this.f55332a.mo63632g());
        this.f55334d.mo63717d(getMetadataNetworkRequest);
        Uri a = getMetadataNetworkRequest.mo63747w() ? m77370a(getMetadataNetworkRequest.mo63740o()) : null;
        TaskCompletionSource<Uri> taskCompletionSource = this.f55333c;
        if (taskCompletionSource != null) {
            getMetadataNetworkRequest.mo63733a(taskCompletionSource, a);
        }
    }
}
