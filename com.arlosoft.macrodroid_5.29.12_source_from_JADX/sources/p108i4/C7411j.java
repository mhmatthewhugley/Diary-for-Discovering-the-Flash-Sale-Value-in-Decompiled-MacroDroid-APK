package p108i4;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p083e4.C7275g;
import p090f5.C7306c;
import p090f5.C7311f;
import p102h4.C7376a;
import p108i4.C7401d;
import p146p4.C8091g;

/* renamed from: i4.j */
/* compiled from: HttpUrlFetcher */
public class C7411j implements C7401d<InputStream> {
    @VisibleForTesting

    /* renamed from: p */
    static final C7413b f18112p = new C7412a();

    /* renamed from: a */
    private final C8091g f18113a;

    /* renamed from: c */
    private final int f18114c;

    /* renamed from: d */
    private final C7413b f18115d;

    /* renamed from: f */
    private HttpURLConnection f18116f;

    /* renamed from: g */
    private InputStream f18117g;

    /* renamed from: o */
    private volatile boolean f18118o;

    /* renamed from: i4.j$a */
    /* compiled from: HttpUrlFetcher */
    private static class C7412a implements C7413b {
        C7412a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo37462a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: i4.j$b */
    /* compiled from: HttpUrlFetcher */
    interface C7413b {
        /* renamed from: a */
        HttpURLConnection mo37462a(URL url) throws IOException;
    }

    public C7411j(C8091g gVar, int i) {
        this(gVar, i, f18112p);
    }

    /* renamed from: c */
    private InputStream m30599c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f18117g = C7306c.m30180c(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
            }
            this.f18117g = httpURLConnection.getInputStream();
        }
        return this.f18117g;
    }

    /* renamed from: e */
    private static boolean m30600e(int i) {
        return i / 100 == 2;
    }

    /* renamed from: g */
    private static boolean m30601g(int i) {
        return i / 100 == 3;
    }

    /* renamed from: h */
    private InputStream m30602h(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f18116f = this.f18115d.mo37462a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f18116f.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f18116f.setConnectTimeout(this.f18114c);
            this.f18116f.setReadTimeout(this.f18114c);
            this.f18116f.setUseCaches(false);
            this.f18116f.setDoInput(true);
            this.f18116f.setInstanceFollowRedirects(false);
            this.f18116f.connect();
            this.f18117g = this.f18116f.getInputStream();
            if (this.f18118o) {
                return null;
            }
            int responseCode = this.f18116f.getResponseCode();
            if (m30600e(responseCode)) {
                return m30599c(this.f18116f);
            }
            if (m30601g(responseCode)) {
                String headerField = this.f18116f.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo37435b();
                    return m30602h(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f18116f.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo37430a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo37435b() {
        InputStream inputStream = this.f18117g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f18116f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f18116f = null;
    }

    public void cancel() {
        this.f18118o = true;
    }

    @NonNull
    /* renamed from: d */
    public C7376a mo37438d() {
        return C7376a.REMOTE;
    }

    /* renamed from: f */
    public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C7311f.m30188b();
        try {
            aVar.mo33008e(m30602h(this.f18113a.mo38104h(), 0, (URL) null, this.f18113a.mo38103e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C7311f.m30187a(b));
            }
        } catch (IOException e) {
            boolean isLoggable = Log.isLoggable("HttpUrlFetcher", 3);
            aVar.mo33006c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(C7311f.m30187a(b));
            }
            throw th;
        }
    }

    @VisibleForTesting
    C7411j(C8091g gVar, int i, C7413b bVar) {
        this.f18113a = gVar;
        this.f18114c = i;
        this.f18115d = bVar;
    }
}
