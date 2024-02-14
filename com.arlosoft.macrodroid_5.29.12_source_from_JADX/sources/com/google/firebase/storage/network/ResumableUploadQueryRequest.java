package com.google.firebase.storage.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

public class ResumableUploadQueryRequest extends ResumableNetworkRequest {

    /* renamed from: n */
    private final Uri f55534n;

    public ResumableUploadQueryRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @NonNull Uri uri) {
        super(storageReferenceUri, firebaseApp);
        this.f55534n = uri;
        super.mo63732H("X-Goog-Upload-Protocol", "resumable");
        super.mo63732H("X-Goog-Upload-Command", "query");
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: e */
    public String mo63724e() {
        return "POST";
    }

    @NonNull
    /* renamed from: v */
    public Uri mo63726v() {
        return this.f55534n;
    }
}
