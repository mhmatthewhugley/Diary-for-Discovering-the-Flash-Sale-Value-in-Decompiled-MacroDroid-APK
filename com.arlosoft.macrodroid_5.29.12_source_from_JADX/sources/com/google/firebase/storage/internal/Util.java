package com.google.firebase.storage.internal;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.storage.network.NetworkRequest;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Util {
    /* renamed from: a */
    public static boolean m77613a(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.m4470a(obj, obj2);
    }

    @Nullable
    /* renamed from: b */
    public static String m77614b(@Nullable InternalAppCheckTokenProvider internalAppCheckTokenProvider) {
        if (internalAppCheckTokenProvider == null) {
            return null;
        }
        try {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) Tasks.m66663b(internalAppCheckTokenProvider.mo62005a(false), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
            if (appCheckTokenResult.mo62003a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + appCheckTokenResult.mo62003a());
            }
            return appCheckTokenResult.mo62004b();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public static String m77615c(@Nullable InternalAuthProvider internalAuthProvider) {
        String str;
        if (internalAuthProvider != null) {
            try {
                str = ((GetTokenResult) Tasks.m66663b(internalAuthProvider.mo22607a(false), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS)).mo22665c();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("StorageUtil", "error getting token " + e);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static Uri m77616d(@NonNull FirebaseApp firebaseApp, @Nullable String str) throws UnsupportedEncodingException {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = NetworkRequest.f55514k;
        if (str.toLowerCase().startsWith("gs://")) {
            String b = Slashes.m77605b(Slashes.m77604a(str.substring(5)));
            return Uri.parse("gs://" + b);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || (!m77613a(scheme.toLowerCase(), "http") && !m77613a(scheme.toLowerCase(), ProxyConfig.MATCH_HTTPS))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String c = Slashes.m77606c(parse.getEncodedPath());
        if (indexOf == 0 && c.startsWith("/")) {
            int indexOf2 = c.indexOf("/b/", 0);
            int i = indexOf2 + 3;
            int indexOf3 = c.indexOf("/", i);
            int indexOf4 = c.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            str2 = c.substring(i, indexOf3);
            c = indexOf4 != -1 ? c.substring(indexOf4 + 3) : "";
        } else if (indexOf > 1) {
            str2 = parse.getAuthority().substring(0, indexOf - 1);
        } else {
            Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
        }
        Preconditions.m4485h(str2, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(str2).encodedPath(c).build();
    }
}
