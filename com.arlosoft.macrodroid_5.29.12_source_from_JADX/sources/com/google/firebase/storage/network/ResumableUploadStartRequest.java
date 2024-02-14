package com.google.firebase.storage.network;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ResumableUploadStartRequest extends ResumableNetworkRequest {

    /* renamed from: n */
    private final JSONObject f55535n;

    /* renamed from: o */
    private final String f55536o;

    public ResumableUploadStartRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @Nullable JSONObject jSONObject, @NonNull String str) {
        super(storageReferenceUri, firebaseApp);
        this.f55535n = jSONObject;
        this.f55536o = str;
        if (TextUtils.isEmpty(str)) {
            this.f55517a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.mo63732H("X-Goog-Upload-Protocol", "resumable");
        super.mo63732H("X-Goog-Upload-Command", "start");
        super.mo63732H("X-Goog-Upload-Header-Content-Type", str);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: e */
    public String mo63724e() {
        return "POST";
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: h */
    public JSONObject mo63735h() {
        return this.f55535n;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: m */
    public Map<String, String> mo63725m() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", mo63738k());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @NonNull
    /* renamed from: v */
    public Uri mo63726v() {
        String authority = mo63745t().mo63721a().getAuthority();
        Uri.Builder buildUpon = mo63745t().mo63722b().buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
