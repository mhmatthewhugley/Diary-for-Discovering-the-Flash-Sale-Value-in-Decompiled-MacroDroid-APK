package com.google.firebase.storage.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

public class ResumableUploadByteRequest extends ResumableNetworkRequest {

    /* renamed from: n */
    private final Uri f55527n;

    /* renamed from: o */
    private final byte[] f55528o;

    /* renamed from: p */
    private final long f55529p;

    /* renamed from: q */
    private final boolean f55530q;

    /* renamed from: r */
    private final int f55531r;

    public ResumableUploadByteRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @NonNull Uri uri, @Nullable byte[] bArr, long j, int i, boolean z) {
        super(storageReferenceUri, firebaseApp);
        if (bArr == null && i != -1) {
            this.f55517a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j < 0) {
            this.f55517a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f55531r = i;
        this.f55527n = uri;
        this.f55528o = i <= 0 ? null : bArr;
        this.f55529p = j;
        this.f55530q = z;
        super.mo63732H("X-Goog-Upload-Protocol", "resumable");
        if (z && i > 0) {
            super.mo63732H("X-Goog-Upload-Command", "upload, finalize");
        } else if (z) {
            super.mo63732H("X-Goog-Upload-Command", "finalize");
        } else {
            super.mo63732H("X-Goog-Upload-Command", "upload");
        }
        super.mo63732H("X-Goog-Upload-Offset", Long.toString(j));
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: e */
    public String mo63724e() {
        return "POST";
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: i */
    public byte[] mo63736i() {
        return this.f55528o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo63737j() {
        int i = this.f55531r;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    @NonNull
    /* renamed from: v */
    public Uri mo63726v() {
        return this.f55527n;
    }
}
