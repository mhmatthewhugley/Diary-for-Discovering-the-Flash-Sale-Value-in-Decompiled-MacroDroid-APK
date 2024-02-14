package com.google.firebase.storage.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

public class ResumableUploadCancelRequest extends ResumableNetworkRequest {
    @VisibleForTesting

    /* renamed from: o */
    public static boolean f55532o = false;

    /* renamed from: n */
    private final Uri f55533n;

    public ResumableUploadCancelRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @NonNull Uri uri) {
        super(storageReferenceUri, firebaseApp);
        f55532o = true;
        this.f55533n = uri;
        super.mo63732H("X-Goog-Upload-Protocol", "resumable");
        super.mo63732H("X-Goog-Upload-Command", "cancel");
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
        return this.f55533n;
    }
}
