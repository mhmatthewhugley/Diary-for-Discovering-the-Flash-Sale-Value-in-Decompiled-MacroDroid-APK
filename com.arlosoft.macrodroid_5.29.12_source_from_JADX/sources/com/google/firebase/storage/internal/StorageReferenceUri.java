package com.google.firebase.storage.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.storage.network.NetworkRequest;

public class StorageReferenceUri {

    /* renamed from: a */
    private final Uri f55504a;

    /* renamed from: b */
    private final Uri f55505b;

    /* renamed from: c */
    private final Uri f55506c;

    public StorageReferenceUri(@NonNull Uri uri, @Nullable EmulatedServiceSettings emulatedServiceSettings) {
        Uri uri2;
        this.f55506c = uri;
        if (emulatedServiceSettings == null) {
            uri2 = NetworkRequest.f55514k;
        } else {
            uri2 = Uri.parse("http://" + emulatedServiceSettings.mo23594a() + ":" + emulatedServiceSettings.mo23595b() + "/v0");
        }
        this.f55504a = uri2;
        Uri.Builder appendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String a = Slashes.m77604a(uri.getPath());
        if (a.length() > 0 && !"/".equals(a)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(a);
        }
        this.f55505b = appendEncodedPath.build();
    }

    @NonNull
    /* renamed from: a */
    public Uri mo63721a() {
        return this.f55506c;
    }

    @NonNull
    /* renamed from: b */
    public Uri mo63722b() {
        return this.f55504a;
    }

    @NonNull
    /* renamed from: c */
    public Uri mo63723c() {
        return this.f55505b;
    }
}
