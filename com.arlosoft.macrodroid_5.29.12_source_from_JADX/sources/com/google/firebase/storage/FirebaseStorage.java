package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.inject.Provider;
import com.google.firebase.storage.internal.Util;
import java.io.UnsupportedEncodingException;

public class FirebaseStorage {
    @NonNull

    /* renamed from: a */
    private final FirebaseApp f55318a;
    @Nullable

    /* renamed from: b */
    private final Provider<InternalAuthProvider> f55319b;
    @Nullable

    /* renamed from: c */
    private final Provider<InternalAppCheckTokenProvider> f55320c;
    @Nullable

    /* renamed from: d */
    private final String f55321d;

    /* renamed from: e */
    private long f55322e = 600000;

    /* renamed from: f */
    private long f55323f = 60000;

    /* renamed from: g */
    private long f55324g = 600000;

    /* renamed from: h */
    private long f55325h = 120000;
    @Nullable

    /* renamed from: i */
    private EmulatedServiceSettings f55326i;

    FirebaseStorage(@Nullable String str, @NonNull FirebaseApp firebaseApp, @Nullable Provider<InternalAuthProvider> provider, @Nullable Provider<InternalAppCheckTokenProvider> provider2) {
        this.f55321d = str;
        this.f55318a = firebaseApp;
        this.f55319b = provider;
        this.f55320c = provider2;
        if (provider2 != null && provider2.get() != null) {
            provider2.get().mo62006b(new AppCheckTokenListener() {
            });
        }
    }

    @Nullable
    /* renamed from: d */
    private String m77353d() {
        return this.f55321d;
    }

    @NonNull
    /* renamed from: f */
    public static FirebaseStorage m77354f() {
        FirebaseApp m = FirebaseApp.m74383m();
        Preconditions.m4479b(m != null, "You must call FirebaseApp.initialize() first.");
        return m77355g(m);
    }

    @NonNull
    /* renamed from: g */
    public static FirebaseStorage m77355g(@NonNull FirebaseApp firebaseApp) {
        Preconditions.m4479b(firebaseApp != null, "Null is not a valid value for the FirebaseApp.");
        String f = firebaseApp.mo61952p().mo61966f();
        if (f == null) {
            return m77356h(firebaseApp, (Uri) null);
        }
        try {
            return m77356h(firebaseApp, Util.m77616d(firebaseApp, "gs://" + firebaseApp.mo61952p().mo61966f()));
        } catch (UnsupportedEncodingException e) {
            Log.e("FirebaseStorage", "Unable to parse bucket:" + f, e);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    /* renamed from: h */
    private static FirebaseStorage m77356h(@NonNull FirebaseApp firebaseApp, @Nullable Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            Preconditions.m4489l(firebaseApp, "Provided FirebaseApp must not be null.");
            FirebaseStorageComponent firebaseStorageComponent = (FirebaseStorageComponent) firebaseApp.mo61949j(FirebaseStorageComponent.class);
            Preconditions.m4489l(firebaseStorageComponent, "Firebase Storage component is not present.");
            return firebaseStorageComponent.mo63601a(host);
        }
        throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
    }

    @NonNull
    /* renamed from: m */
    private StorageReference m77357m(@NonNull Uri uri) {
        Preconditions.m4489l(uri, "uri must not be null");
        String d = m77353d();
        Preconditions.m4479b(TextUtils.isEmpty(d) || uri.getAuthority().equalsIgnoreCase(d), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new StorageReference(uri, this);
    }

    @NonNull
    /* renamed from: a */
    public FirebaseApp mo63590a() {
        return this.f55318a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public InternalAppCheckTokenProvider mo63591b() {
        Provider<InternalAppCheckTokenProvider> provider = this.f55320c;
        if (provider != null) {
            return provider.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public InternalAuthProvider mo63592c() {
        Provider<InternalAuthProvider> provider = this.f55319b;
        if (provider != null) {
            return provider.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: e */
    public EmulatedServiceSettings mo63593e() {
        return this.f55326i;
    }

    /* renamed from: i */
    public long mo63594i() {
        return this.f55323f;
    }

    /* renamed from: j */
    public long mo63595j() {
        return this.f55324g;
    }

    /* renamed from: k */
    public long mo63596k() {
        return this.f55322e;
    }

    @NonNull
    /* renamed from: l */
    public StorageReference mo63597l() {
        if (!TextUtils.isEmpty(m77353d())) {
            return m77357m(new Uri.Builder().scheme("gs").authority(m77353d()).path("/").build());
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }

    @NonNull
    /* renamed from: n */
    public StorageReference mo63598n(@NonNull String str) {
        Preconditions.m4479b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith("https://") && !lowerCase.startsWith("http://")) {
            return mo63597l().mo63628d(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    /* renamed from: o */
    public void mo63599o(long j) {
        this.f55324g = j;
    }

    /* renamed from: p */
    public void mo63600p(long j) {
        this.f55322e = j;
    }
}
