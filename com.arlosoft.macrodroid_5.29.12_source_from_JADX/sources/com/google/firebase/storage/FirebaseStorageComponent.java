package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

class FirebaseStorageComponent {

    /* renamed from: a */
    private final Map<String, FirebaseStorage> f55328a = new HashMap();

    /* renamed from: b */
    private final FirebaseApp f55329b;
    @Nullable

    /* renamed from: c */
    private final Provider<InternalAuthProvider> f55330c;
    @Nullable

    /* renamed from: d */
    private final Provider<InternalAppCheckTokenProvider> f55331d;

    FirebaseStorageComponent(@NonNull FirebaseApp firebaseApp, @Nullable Provider<InternalAuthProvider> provider, @Nullable Provider<InternalAppCheckTokenProvider> provider2) {
        this.f55329b = firebaseApp;
        this.f55330c = provider;
        this.f55331d = provider2;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public synchronized FirebaseStorage mo63601a(@Nullable String str) {
        FirebaseStorage firebaseStorage;
        firebaseStorage = this.f55328a.get(str);
        if (firebaseStorage == null) {
            firebaseStorage = new FirebaseStorage(str, this.f55329b, this.f55330c, this.f55331d);
            this.f55328a.put(str, firebaseStorage);
        }
        return firebaseStorage;
    }
}
