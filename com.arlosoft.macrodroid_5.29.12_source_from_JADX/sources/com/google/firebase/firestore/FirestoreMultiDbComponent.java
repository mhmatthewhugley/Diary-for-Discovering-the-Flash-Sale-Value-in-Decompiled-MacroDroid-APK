package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.inject.Deferred;
import java.util.HashMap;
import java.util.Map;

class FirestoreMultiDbComponent implements FirebaseAppLifecycleListener, FirebaseFirestore.InstanceRegistry {

    /* renamed from: a */
    private final Map<String, FirebaseFirestore> f5697a = new HashMap();

    /* renamed from: b */
    private final FirebaseApp f5698b;

    /* renamed from: c */
    private final Context f5699c;

    /* renamed from: d */
    private final Deferred<InternalAuthProvider> f5700d;

    /* renamed from: e */
    private final GrpcMetadataProvider f5701e;

    FirestoreMultiDbComponent(@NonNull Context context, @NonNull FirebaseApp firebaseApp, @NonNull Deferred<InternalAuthProvider> deferred, @Nullable GrpcMetadataProvider grpcMetadataProvider) {
        this.f5699c = context;
        this.f5698b = firebaseApp;
        this.f5700d = deferred;
        this.f5701e = grpcMetadataProvider;
        firebaseApp.mo61947h(this);
    }
}
