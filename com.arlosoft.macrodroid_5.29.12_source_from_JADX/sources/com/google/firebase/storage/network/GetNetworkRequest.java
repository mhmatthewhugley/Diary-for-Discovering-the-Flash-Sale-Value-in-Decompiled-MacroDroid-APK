package com.google.firebase.storage.network;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.Collections;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

public class GetNetworkRequest extends NetworkRequest {
    public GetNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, long j) {
        super(storageReferenceUri, firebaseApp);
        if (j != 0) {
            super.mo63732H("Range", "bytes=" + j + HelpFormatter.DEFAULT_OPT_PREFIX);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: e */
    public String mo63724e() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: m */
    public Map<String, String> mo63725m() {
        return Collections.singletonMap("alt", "media");
    }
}
