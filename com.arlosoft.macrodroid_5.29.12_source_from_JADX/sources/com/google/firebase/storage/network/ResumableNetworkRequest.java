package com.google.firebase.storage.network;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

abstract class ResumableNetworkRequest extends NetworkRequest {
    ResumableNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp) {
        super(storageReferenceUri, firebaseApp);
    }
}
