package com.google.firebase.storage.network;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.google.firebase.storage.network.connection.HttpURLConnectionFactory;
import com.google.firebase.storage.network.connection.HttpURLConnectionFactoryImpl;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.auth.AUTH;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class NetworkRequest {

    /* renamed from: k */
    public static final Uri f55514k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l */
    static HttpURLConnectionFactory f55515l = new HttpURLConnectionFactoryImpl();

    /* renamed from: m */
    private static String f55516m;

    /* renamed from: a */
    protected Exception f55517a;

    /* renamed from: b */
    private StorageReferenceUri f55518b;

    /* renamed from: c */
    private Context f55519c;

    /* renamed from: d */
    private Map<String, List<String>> f55520d;

    /* renamed from: e */
    private int f55521e;

    /* renamed from: f */
    private String f55522f;

    /* renamed from: g */
    private int f55523g;

    /* renamed from: h */
    private InputStream f55524h;

    /* renamed from: i */
    private HttpURLConnection f55525i;

    /* renamed from: j */
    private Map<String, String> f55526j = new HashMap();

    public NetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp) {
        Preconditions.m4488k(storageReferenceUri);
        Preconditions.m4488k(firebaseApp);
        this.f55518b = storageReferenceUri;
        this.f55519c = firebaseApp.mo61950l();
        mo63732H("x-firebase-gmpid", firebaseApp.mo61952p().mo61962c());
    }

    /* renamed from: B */
    private final void m77629B(@Nullable String str, @Nullable String str2) {
        mo63730E(str, str2);
        try {
            m77630F();
        } catch (IOException e) {
            Log.w("NetworkRequest", "error sending network request " + mo63724e() + " " + mo63726v(), e);
            this.f55517a = e;
            this.f55521e = -2;
        }
        mo63729D();
    }

    /* renamed from: F */
    private void m77630F() throws IOException {
        if (mo63747w()) {
            mo63727A(this.f55524h);
        } else {
            mo63748x(this.f55524h);
        }
    }

    /* renamed from: b */
    private void m77631b(@NonNull HttpURLConnection httpURLConnection, @Nullable String str, @Nullable String str2) throws IOException {
        byte[] bArr;
        int i;
        Preconditions.m4488k(httpURLConnection);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty(AUTH.WWW_AUTH_RESP, "Firebase " + str);
        } else {
            Log.w("NetworkRequest", "no auth token for request");
        }
        if (!TextUtils.isEmpty(str2)) {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        } else {
            Log.w("NetworkRequest", "No App Check token for request.");
        }
        StringBuilder sb = new StringBuilder("Android/");
        String g = m77634g(this.f55519c);
        if (!TextUtils.isEmpty(g)) {
            sb.append(g);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", sb.toString());
        for (Map.Entry next : this.f55526j.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        JSONObject h = mo63735h();
        if (h != null) {
            bArr = h.toString().getBytes("UTF-8");
            i = bArr.length;
        } else {
            bArr = mo63736i();
            i = mo63737j();
            if (i == 0 && bArr != null) {
                i = bArr.length;
            }
        }
        if (bArr == null || bArr.length <= 0) {
            httpURLConnection.setRequestProperty("Content-Length", "0");
        } else {
            if (h != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(i));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (bArr != null && bArr.length > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (outputStream != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(bArr, 0, i);
                } finally {
                    bufferedOutputStream.close();
                }
            } else {
                Log.e("NetworkRequest", "Unable to write to the http request!");
            }
        }
    }

    /* renamed from: c */
    private HttpURLConnection m77632c() throws IOException {
        Uri v = mo63726v();
        Map<String, String> m = mo63725m();
        if (m != null) {
            Uri.Builder buildUpon = v.buildUpon();
            for (Map.Entry next : m.entrySet()) {
                buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
            v = buildUpon.build();
        }
        return f55515l.mo63749a(new URL(v.toString()));
    }

    /* renamed from: d */
    private boolean m77633d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f55517a = new SocketException("Network subsystem is unavailable");
        this.f55521e = -2;
        return false;
    }

    @NonNull
    /* renamed from: g */
    private static String m77634g(Context context) {
        if (f55516m == null) {
            try {
                f55516m = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("NetworkRequest", "Unable to find gmscore in package manager", e);
            }
            if (f55516m == null) {
                f55516m = "[No Gmscore]";
            }
        }
        return f55516m;
    }

    /* renamed from: l */
    private static String m77635l(@NonNull Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return "";
        }
        return path.startsWith("/") ? path.substring(1) : path;
    }

    /* renamed from: y */
    private void m77636y(@Nullable InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f55522f = sb.toString();
        if (!mo63747w()) {
            this.f55517a = new IOException(this.f55522f);
        }
    }

    /* renamed from: z */
    private void m77637z(@NonNull HttpURLConnection httpURLConnection) throws IOException {
        Preconditions.m4488k(httpURLConnection);
        this.f55521e = httpURLConnection.getResponseCode();
        this.f55520d = httpURLConnection.getHeaderFields();
        this.f55523g = httpURLConnection.getContentLength();
        if (mo63747w()) {
            this.f55524h = httpURLConnection.getInputStream();
        } else {
            this.f55524h = httpURLConnection.getErrorStream();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo63727A(@Nullable InputStream inputStream) throws IOException {
        m77636y(inputStream);
    }

    /* renamed from: C */
    public void mo63728C(@Nullable String str, @Nullable String str2, @NonNull Context context) {
        if (m77633d(context)) {
            m77629B(str, str2);
        }
    }

    /* renamed from: D */
    public void mo63729D() {
        HttpURLConnection httpURLConnection = this.f55525i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: E */
    public void mo63730E(@Nullable String str, @Nullable String str2) {
        if (this.f55517a != null) {
            this.f55521e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("sending network request ");
            sb.append(mo63724e());
            sb.append(" ");
            sb.append(mo63726v());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f55519c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f55521e = -2;
            this.f55517a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection c = m77632c();
            this.f55525i = c;
            c.setRequestMethod(mo63724e());
            m77631b(this.f55525i, str, str2);
            m77637z(this.f55525i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("network request result ");
                sb2.append(this.f55521e);
            }
        } catch (IOException e) {
            Log.w("NetworkRequest", "error sending network request " + mo63724e() + " " + mo63726v(), e);
            this.f55517a = e;
            this.f55521e = -2;
        }
    }

    /* renamed from: G */
    public final void mo63731G() {
        this.f55517a = null;
        this.f55521e = 0;
    }

    /* renamed from: H */
    public void mo63732H(String str, String str2) {
        this.f55526j.put(str, str2);
    }

    /* renamed from: a */
    public <TResult> void mo63733a(TaskCompletionSource<TResult> taskCompletionSource, TResult tresult) {
        Exception f = mo63734f();
        if (!mo63747w() || f != null) {
            taskCompletionSource.mo56138b(StorageException.m77381e(f, mo63741p()));
        } else {
            taskCompletionSource.mo56139c(tresult);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: e */
    public abstract String mo63724e();

    @Nullable
    /* renamed from: f */
    public Exception mo63734f() {
        return this.f55517a;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: h */
    public JSONObject mo63735h() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: i */
    public byte[] mo63736i() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo63737j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo63738k() {
        return m77635l(this.f55518b.mo63721a());
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: m */
    public Map<String, String> mo63725m() {
        return null;
    }

    @Nullable
    /* renamed from: n */
    public String mo63739n() {
        return this.f55522f;
    }

    /* renamed from: o */
    public JSONObject mo63740o() {
        if (TextUtils.isEmpty(this.f55522f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f55522f);
        } catch (JSONException e) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f55522f, e);
            return new JSONObject();
        }
    }

    /* renamed from: p */
    public int mo63741p() {
        return this.f55521e;
    }

    @Nullable
    /* renamed from: q */
    public Map<String, List<String>> mo63742q() {
        return this.f55520d;
    }

    @Nullable
    /* renamed from: r */
    public String mo63743r(String str) {
        List list;
        Map<String, List<String>> q = mo63742q();
        if (q == null || (list = q.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: s */
    public int mo63744s() {
        return this.f55523g;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: t */
    public StorageReferenceUri mo63745t() {
        return this.f55518b;
    }

    /* renamed from: u */
    public InputStream mo63746u() {
        return this.f55524h;
    }

    @VisibleForTesting
    @NonNull
    /* renamed from: v */
    public Uri mo63726v() {
        return this.f55518b.mo63723c();
    }

    /* renamed from: w */
    public boolean mo63747w() {
        int i = this.f55521e;
        return i >= 200 && i < 300;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo63748x(@Nullable InputStream inputStream) throws IOException {
        m77636y(inputStream);
    }
}
