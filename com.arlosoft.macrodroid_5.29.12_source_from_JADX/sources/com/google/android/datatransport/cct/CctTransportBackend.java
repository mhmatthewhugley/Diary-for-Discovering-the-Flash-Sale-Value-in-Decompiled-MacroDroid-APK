package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.protocol.HTTP;

final class CctTransportBackend implements TransportBackend {

    /* renamed from: a */
    private final DataEncoder f1120a;

    /* renamed from: b */
    private final ConnectivityManager f1121b;

    /* renamed from: c */
    private final Context f1122c;

    /* renamed from: d */
    final URL f1123d;

    /* renamed from: e */
    private final Clock f1124e;

    /* renamed from: f */
    private final Clock f1125f;

    /* renamed from: g */
    private final int f1126g;

    static final class HttpRequest {

        /* renamed from: a */
        final URL f1127a;

        /* renamed from: b */
        final BatchedLogRequest f1128b;
        @Nullable

        /* renamed from: c */
        final String f1129c;

        HttpRequest(URL url, BatchedLogRequest batchedLogRequest, @Nullable String str) {
            this.f1127a = url;
            this.f1128b = batchedLogRequest;
            this.f1129c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public HttpRequest mo19285a(URL url) {
            return new HttpRequest(url, this.f1128b, this.f1129c);
        }
    }

    static final class HttpResponse {

        /* renamed from: a */
        final int f1130a;
        @Nullable

        /* renamed from: b */
        final URL f1131b;

        /* renamed from: c */
        final long f1132c;

        HttpResponse(int i, @Nullable URL url, long j) {
            this.f1130a = i;
            this.f1131b = url;
            this.f1132c = j;
        }
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2, int i) {
        this.f1120a = BatchedLogRequest.m1095b();
        this.f1122c = context;
        this.f1121b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1123d = m982n(CCTDestination.f1112c);
        this.f1124e = clock2;
        this.f1125f = clock;
        this.f1126g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public HttpResponse m973e(HttpRequest httpRequest) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        Logging.m1385f("CctTransportBackend", "Making request to: %s", httpRequest.f1127a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.f1127a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f1126g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(HTTP.USER_AGENT, String.format("datatransport/%s android/", new Object[]{"3.1.8"}));
        httpURLConnection.setRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = httpRequest.f1129c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f1120a.mo23596a(httpRequest.f1128b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Logging.m1385f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                Logging.m1381b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                Logging.m1381b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HTTP.CONTENT_ENCODING));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new HttpResponse(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m981m(inputStream, httpURLConnection.getHeaderField(HTTP.CONTENT_ENCODING));
                    HttpResponse httpResponse = new HttpResponse(responseCode, (URL) null, LogResponse.m1140b(new BufferedReader(new InputStreamReader(m))).mo19372c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return httpResponse;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            Logging.m1383d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new HttpResponse(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            Logging.m1383d("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new HttpResponse(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: f */
    private static int m974f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.mo19386d();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.mo19386d();
        }
        if (NetworkConnectionInfo.MobileSubtype.m1148b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    private static int m975g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.NetworkType.NONE.mo19387d();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m976h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Logging.m1383d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private BatchedLogRequest m977i(BackendRequest backendRequest) {
        LogEvent.Builder builder;
        HashMap hashMap = new HashMap();
        for (EventInternal next : backendRequest.mo19468b()) {
            String j = next.mo19401j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            EventInternal eventInternal = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder b = LogRequest.m1121a().mo19369f(QosTier.DEFAULT).mo19370g(this.f1125f.mo19627a()).mo19371h(this.f1124e.mo19627a()).mo19365b(ClientInfo.m1097a().mo19335c(ClientInfo.ClientType.ANDROID_FIREBASE).mo19334b(AndroidClientInfo.m988a().mo19312m(Integer.valueOf(eventInternal.mo19446g("sdk-version"))).mo19309j(eventInternal.mo19445b("model")).mo19305f(eventInternal.mo19445b("hardware")).mo19303d(eventInternal.mo19445b("device")).mo19311l(eventInternal.mo19445b("product")).mo19310k(eventInternal.mo19445b("os-uild")).mo19307h(eventInternal.mo19445b("manufacturer")).mo19304e(eventInternal.mo19445b("fingerprint")).mo19302c(eventInternal.mo19445b("country")).mo19306g(eventInternal.mo19445b("locale")).mo19308i(eventInternal.mo19445b("mcc_mnc")).mo19301b(eventInternal.mo19445b("application_build")).mo19300a()).mo19333a());
            try {
                b.mo19384i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo19385j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal2 : (List) entry.getValue()) {
                EncodedPayload e = eventInternal2.mo19397e();
                Encoding b2 = e.mo19441b();
                if (b2.equals(Encoding.m954b("proto"))) {
                    builder = LogEvent.m1105j(e.mo19440a());
                } else if (b2.equals(Encoding.m954b("json"))) {
                    builder = LogEvent.m1104i(new String(e.mo19440a(), Charset.forName("UTF-8")));
                } else {
                    Logging.m1386g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                builder.mo19348c(eventInternal2.mo19399f()).mo19349d(eventInternal2.mo19402k()).mo19353h(eventInternal2.mo19447h("tz-offset")).mo19350e(NetworkConnectionInfo.m1142a().mo19383c(NetworkConnectionInfo.NetworkType.m1150b(eventInternal2.mo19446g("net-type"))).mo19382b(NetworkConnectionInfo.MobileSubtype.m1148b(eventInternal2.mo19446g("mobile-subtype"))).mo19381a());
                if (eventInternal2.mo19396d() != null) {
                    builder.mo19347b(eventInternal2.mo19396d());
                }
                arrayList3.add(builder.mo19346a());
            }
            b.mo19366c(arrayList3);
            arrayList2.add(b.mo19364a());
        }
        return BatchedLogRequest.m1094a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m978j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @VisibleForTesting
    /* renamed from: k */
    static long m979k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ HttpRequest m980l(HttpRequest httpRequest, HttpResponse httpResponse) {
        URL url = httpResponse.f1131b;
        if (url == null) {
            return null;
        }
        Logging.m1381b("CctTransportBackend", "Following redirect to: %s", url);
        return httpRequest.mo19285a(httpResponse.f1131b);
    }

    /* renamed from: m */
    private static InputStream m981m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    private static URL m982n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public EventInternal mo19283a(EventInternal eventInternal) {
        NetworkInfo activeNetworkInfo = this.f1121b.getActiveNetworkInfo();
        return eventInternal.mo19449l().mo19450a("sdk-version", Build.VERSION.SDK_INT).mo19452c("model", Build.MODEL).mo19452c("hardware", Build.HARDWARE).mo19452c("device", Build.DEVICE).mo19452c("product", Build.PRODUCT).mo19452c("os-uild", Build.ID).mo19452c("manufacturer", Build.MANUFACTURER).mo19452c("fingerprint", Build.FINGERPRINT).mo19451b("tz-offset", m979k()).mo19450a("net-type", m975g(activeNetworkInfo)).mo19450a("mobile-subtype", m974f(activeNetworkInfo)).mo19452c("country", Locale.getDefault().getCountry()).mo19452c("locale", Locale.getDefault().getLanguage()).mo19452c("mcc_mnc", m978j(this.f1122c).getSimOperator()).mo19452c("application_build", Integer.toString(m976h(this.f1122c))).mo19404d();
    }

    /* renamed from: b */
    public BackendResponse mo19284b(BackendRequest backendRequest) {
        BatchedLogRequest i = m977i(backendRequest);
        URL url = this.f1123d;
        String str = null;
        if (backendRequest.mo19469c() != null) {
            try {
                CCTDestination c = CCTDestination.m966c(backendRequest.mo19469c());
                if (c.mo19278d() != null) {
                    str = c.mo19278d();
                }
                if (c.mo19279e() != null) {
                    url = m982n(c.mo19279e());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.m1301a();
            }
        }
        try {
            HttpResponse httpResponse = (HttpResponse) Retries.m1387a(5, new HttpRequest(url, i, str), new C1653a(this), C1654b.f1134a);
            int i2 = httpResponse.f1130a;
            if (i2 == 200) {
                return BackendResponse.m1303e(httpResponse.f1132c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    if (i2 == 400) {
                        return BackendResponse.m1302d();
                    }
                    return BackendResponse.m1301a();
                }
            }
            return BackendResponse.m1304f();
        } catch (IOException e) {
            Logging.m1383d("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.m1304f();
        }
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 130000);
    }
}
