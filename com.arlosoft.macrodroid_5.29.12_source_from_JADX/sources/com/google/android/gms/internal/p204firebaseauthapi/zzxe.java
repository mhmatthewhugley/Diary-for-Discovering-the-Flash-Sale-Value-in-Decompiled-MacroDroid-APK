package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.zzai;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxe */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzxe extends AsyncTask {

    /* renamed from: g */
    private static final Logger f40585g = new Logger("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a */
    private final String f40586a;

    /* renamed from: b */
    private final String f40587b;

    /* renamed from: c */
    private final WeakReference f40588c;

    /* renamed from: d */
    private final Uri.Builder f40589d;

    /* renamed from: e */
    private final String f40590e;

    /* renamed from: f */
    private final FirebaseApp f40591f;

    public zzxe(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzxg zzxg) {
        this.f40586a = Preconditions.m4484g(str);
        this.f40591f = (FirebaseApp) Preconditions.m4488k(firebaseApp);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(intent);
        String g = Preconditions.m4484g(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzxg.mo22728f0(g)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", g).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.m4488k(str2));
        this.f40587b = buildUpon.build().toString();
        this.f40588c = new WeakReference(zzxg);
        this.f40589d = zzxg.mo22730u(intent, str, str2);
        this.f40590e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void onPostExecute(zzxd zzxd) {
        String str;
        Uri.Builder builder;
        zzxg zzxg = (zzxg) this.f40588c.get();
        String str2 = null;
        if (zzxd != null) {
            str2 = zzxd.mo50032c();
            str = zzxd.mo50033d();
        } else {
            str = null;
        }
        if (zzxg == null) {
            f40585g.mo21839c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.f40589d) == null) {
            zzxg.mo22725A1(this.f40586a, zzai.m6170a(str));
        } else {
            builder.authority(str2);
            zzxg.mo22729n1(this.f40589d.build(), this.f40586a);
        }
    }

    /* renamed from: b */
    private static byte[] m58370b(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fb, code lost:
        f40585g.mo21839c("ConversionException encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0111, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0112, code lost:
        f40585g.mo21839c("Null pointer encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0128, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0129, code lost:
        f40585g.mo21839c("IOException occurred: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00df A[Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fa A[ExcHandler: zzvg (r1v8 'e' com.google.android.gms.internal.firebase-auth-api.zzvg A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0111 A[ExcHandler: NullPointerException (r1v4 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.Void[] r7 = (java.lang.Void[]) r7
            java.lang.String r7 = r6.f40590e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0013
            java.lang.String r7 = r6.f40590e
            com.google.android.gms.internal.firebase-auth-api.zzxd r0 = com.google.android.gms.internal.p204firebaseauthapi.zzxd.m58365a(r7)
            goto L_0x013e
        L_0x0013:
            r7 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r2 = r6.f40587b     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.ref.WeakReference r2 = r6.f40588c     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            com.google.android.gms.internal.firebase-auth-api.zzxg r2 = (com.google.android.gms.internal.p204firebaseauthapi.zzxg) r2     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.net.HttpURLConnection r1 = r2.mo22726C(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=UTF-8"
            r1.addRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            com.google.android.gms.internal.firebase-auth-api.zzxq r3 = new com.google.android.gms.internal.firebase-auth-api.zzxq     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            android.content.Context r2 = r2.zza()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            com.google.firebase.FirebaseApp r4 = r6.f40591f     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            com.google.android.gms.internal.firebase-auth-api.zzxo r5 = com.google.android.gms.internal.p204firebaseauthapi.zzxo.m58381a()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r5 = r5.mo50038b()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.<init>(r2, r4, r5)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.mo50060a(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 == r3) goto L_0x00bc
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r5 = 400(0x190, float:5.6E-43)
            if (r3 < r5) goto L_0x0088
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r1 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r1.<init>()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "WEB_INTERNAL_ERROR:"
            r1.append(r3)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            r1.append(r3)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x009d
        L_0x0076:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            byte[] r1 = m58370b(r1, r4)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.<init>(r1)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = com.google.android.gms.internal.p204firebaseauthapi.zzxl.m58379a(r3, r1)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x009d
        L_0x0088:
            r1 = r0
            goto L_0x009d
        L_0x008a:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r3 = f40585g     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r1 = r4.concat(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.mo21844h(r1, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x0088
        L_0x009d:
            com.google.android.gms.common.logging.Logger r3 = f40585g     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r4[r7] = r1     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r4[r5] = r2     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.mo21839c(r2, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            com.google.android.gms.internal.firebase-auth-api.zzxd r0 = com.google.android.gms.internal.p204firebaseauthapi.zzxd.m58366b(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x013e
        L_0x00bc:
            com.google.android.gms.internal.firebase-auth-api.zzzx r2 = new com.google.android.gms.internal.firebase-auth-api.zzzx     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r2.<init>()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            byte[] r1 = m58370b(r1, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r2.mo50144a(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.util.List r1 = r2.mo50145b()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
        L_0x00d9:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r2 == 0) goto L_0x013e
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r3 != 0) goto L_0x00f5
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r3 == 0) goto L_0x00d9
        L_0x00f5:
            com.google.android.gms.internal.firebase-auth-api.zzxd r0 = com.google.android.gms.internal.p204firebaseauthapi.zzxd.m58365a(r2)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x013e
        L_0x00fa:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r2 = f40585g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo21839c(r1, r7)
            goto L_0x013e
        L_0x0111:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r2 = f40585g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo21839c(r1, r7)
            goto L_0x013e
        L_0x0128:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r2 = f40585g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo21839c(r1, r7)
        L_0x013e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzxe.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onCancelled(Object obj) {
        zzxd zzxd = (zzxd) obj;
        onPostExecute((zzxd) null);
    }
}
