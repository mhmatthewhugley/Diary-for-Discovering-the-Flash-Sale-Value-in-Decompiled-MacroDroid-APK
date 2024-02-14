package com.google.firebase.storage.network;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.HashMap;
import java.util.Map;

public class ListNetworkRequest extends NetworkRequest {
    @Nullable

    /* renamed from: n */
    private final Integer f55512n;
    @Nullable

    /* renamed from: o */
    private final String f55513o;

    public ListNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @Nullable Integer num, @Nullable String str) {
        super(storageReferenceUri, firebaseApp);
        this.f55512n = num;
        this.f55513o = str;
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
        HashMap hashMap = new HashMap();
        String k = mo63738k();
        if (!k.isEmpty()) {
            hashMap.put("prefix", k + "/");
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f55512n;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f55513o)) {
            hashMap.put("pageToken", this.f55513o);
        }
        return hashMap;
    }

    @NonNull
    /* renamed from: v */
    public Uri mo63726v() {
        String authority = mo63745t().mo63721a().getAuthority();
        return Uri.parse(mo63745t().mo63722b() + "/b/" + authority + "/o");
    }
}
