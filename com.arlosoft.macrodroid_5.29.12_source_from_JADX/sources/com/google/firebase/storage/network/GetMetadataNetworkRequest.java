package com.google.firebase.storage.network;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

public class GetMetadataNetworkRequest extends NetworkRequest {
    public GetMetadataNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp) {
        super(storageReferenceUri, firebaseApp);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: e */
    public String mo63724e() {
        return "GET";
    }
}
