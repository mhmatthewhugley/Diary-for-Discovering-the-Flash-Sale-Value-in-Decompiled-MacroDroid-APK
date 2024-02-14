package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstallationServiceClient {

    /* renamed from: d */
    private static final Pattern f54909d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f54910e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f54911a;

    /* renamed from: b */
    private final Provider<HeartBeatController> f54912b;

    /* renamed from: c */
    private final RequestLimiter f54913c = new RequestLimiter();

    public FirebaseInstallationServiceClient(@NonNull Context context, @NonNull Provider<HeartBeatController> provider) {
        this.f54911a = context;
        this.f54912b = provider;
    }

    /* renamed from: a */
    private static String m76727a(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m76728b(@Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m76729c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m76730f() {
        try {
            Context context = this.f54911a;
            byte[] a = AndroidUtilsLight.m4839a(context, context.getPackageName());
            if (a != null) {
                return Hex.m4886c(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f54911a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f54911a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m76731g(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m76732h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m76733i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m76734j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m76735k(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String o = m76739o(httpURLConnection);
        if (!TextUtils.isEmpty(o)) {
            Log.w("Firebase-Installations", o);
            Log.w("Firebase-Installations", m76727a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m76736l(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f54911a.getPackageName());
            HeartBeatController heartBeatController = this.f54912b.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.m66662a(heartBeatController.mo63201a()));
                } catch (ExecutionException e) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m76730f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    /* renamed from: m */
    static long m76737m(String str) {
        Preconditions.m4479b(f54909d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private InstallationResponse m76738n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f54910e));
        TokenResult.Builder a = TokenResult.m76764a();
        InstallationResponse.Builder a2 = InstallationResponse.m76746a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo63296f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo63293c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo63294d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo63305c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo63306d(m76737m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo63292b(a.mo63303a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo63295e(InstallationResponse.ResponseCode.OK).mo63291a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    @androidx.annotation.Nullable
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m76739o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f54910e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.m76739o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: p */
    private TokenResult m76740p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f54910e));
        TokenResult.Builder a = TokenResult.m76764a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo63305c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo63306d(m76737m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo63304b(TokenResult.ResponseCode.OK).mo63303a();
    }

    /* renamed from: q */
    private void m76741q(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) throws IOException {
        m76743s(httpURLConnection, m76732h(m76728b(str, str2)));
    }

    /* renamed from: r */
    private void m76742r(HttpURLConnection httpURLConnection) throws IOException {
        m76743s(httpURLConnection, m76732h(m76729c()));
    }

    /* renamed from: s */
    private static void m76743s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    @NonNull
    /* renamed from: d */
    public InstallationResponse mo63307d(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) throws FirebaseInstallationsException {
        InstallationResponse n;
        if (this.f54913c.mo63309b()) {
            int i = 0;
            URL g = m76731g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m76736l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m76741q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f54913c.mo63310f(responseCode);
                    if (m76733i(responseCode)) {
                        n = m76738n(l);
                    } else {
                        m76735k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m76734j();
                            n = InstallationResponse.m76746a().mo63295e(InstallationResponse.ResponseCode.BAD_CONFIG).mo63291a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    /* renamed from: e */
    public TokenResult mo63308e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        TokenResult p;
        if (this.f54913c.mo63309b()) {
            int i = 0;
            URL g = m76731g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m76736l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty(AUTH.WWW_AUTH_RESP, "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    m76742r(l);
                    int responseCode = l.getResponseCode();
                    this.f54913c.mo63310f(responseCode);
                    if (m76733i(responseCode)) {
                        p = m76740p(l);
                    } else {
                        m76735k(l, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    m76734j();
                                    p = TokenResult.m76764a().mo63304b(TokenResult.ResponseCode.BAD_CONFIG).mo63303a();
                                } else {
                                    l.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        p = TokenResult.m76764a().mo63304b(TokenResult.ResponseCode.AUTH_ERROR).mo63303a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
