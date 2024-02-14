package com.google.firebase.storage.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import org.apache.http.client.methods.HttpPut;
import org.json.JSONObject;

public class UpdateMetadataNetworkRequest extends NetworkRequest {

    /* renamed from: n */
    private final JSONObject f55537n;

    public UpdateMetadataNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @Nullable JSONObject jSONObject) {
        super(storageReferenceUri, firebaseApp);
        this.f55537n = jSONObject;
        mo63732H("X-HTTP-Method-Override", "PATCH");
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: e */
    public String mo63724e() {
        return HttpPut.METHOD_NAME;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: h */
    public JSONObject mo63735h() {
        return this.f55537n;
    }
}
