package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.auth.C0271a;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

class GmsRpc {

    /* renamed from: a */
    private final FirebaseApp f54999a;

    /* renamed from: b */
    private final Metadata f55000b;

    /* renamed from: c */
    private final Rpc f55001c;

    /* renamed from: d */
    private final Provider<UserAgentPublisher> f55002d;

    /* renamed from: e */
    private final Provider<HeartBeatInfo> f55003e;

    /* renamed from: f */
    private final FirebaseInstallationsApi f55004f;

    GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new Rpc(firebaseApp.mo61950l()), provider, provider2, firebaseInstallationsApi);
    }

    /* renamed from: b */
    private static String m76902b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private Task<String> m76903c(Task<Bundle> task) {
        return task.mo23711l(C0271a.f317a, new C11317s(this));
    }

    /* renamed from: d */
    private String m76904d() {
        try {
            return m76902b(MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA1).digest(this.f54999a.mo61951o().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    @AnyThread
    /* renamed from: f */
    private String m76905f(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: g */
    static boolean m76906g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String m76907h(Task task) throws Exception {
        return m76905f((Bundle) task.mo23716q(IOException.class));
    }

    /* renamed from: i */
    private void m76908i(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        HeartBeatInfo.HeartBeat b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f54999a.mo61952p().mo61962c());
        bundle.putString("gmsv", Integer.toString(this.f55000b.mo63369d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f55000b.mo63367a());
        bundle.putString("app_ver_name", this.f55000b.mo63368b());
        bundle.putString("firebase-app-name-hash", m76904d());
        try {
            String b2 = ((InstallationTokenResult) Tasks.m66662a(this.f55004f.mo63232a(false))).mo63221b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.m66662a(this.f55004f.getId()));
        bundle.putString("cliv", "fcm-" + "23.1.0");
        HeartBeatInfo heartBeatInfo = this.f55003e.get();
        UserAgentPublisher userAgentPublisher = this.f55002d.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (b = heartBeatInfo.mo63202b("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.mo63204b()));
            bundle.putString("Firebase-Client", userAgentPublisher.mo63499a());
        }
    }

    /* renamed from: j */
    private Task<Bundle> m76909j(String str, String str2, Bundle bundle) {
        try {
            m76908i(str, str2, bundle);
            return this.f55001c.mo21078a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.m66666e(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Task<String> mo63360e() {
        return m76903c(m76909j(Metadata.m76948c(this.f54999a), ProxyConfig.MATCH_ALL_SCHEMES, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Task<?> mo63361k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m76903c(m76909j(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Task<?> mo63362l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m76903c(m76909j(str, "/topics/" + str2, bundle));
    }

    @VisibleForTesting
    GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Rpc rpc, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.f54999a = firebaseApp;
        this.f55000b = metadata;
        this.f55001c = rpc;
        this.f55002d = provider;
        this.f55003e = provider2;
        this.f55004f = firebaseInstallationsApi;
    }
}
