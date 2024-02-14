package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public interface zzxg {

    /* renamed from: h */
    public static final Logger f40592h = new Logger("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    /* renamed from: A1 */
    void mo22725A1(String str, Status status);

    /* renamed from: C */
    HttpURLConnection mo22726C(URL url);

    /* renamed from: f0 */
    String mo22728f0(String str);

    /* renamed from: n1 */
    void mo22729n1(Uri uri, String str);

    /* renamed from: u */
    Uri.Builder mo22730u(Intent intent, String str, String str2);

    Context zza();
}
