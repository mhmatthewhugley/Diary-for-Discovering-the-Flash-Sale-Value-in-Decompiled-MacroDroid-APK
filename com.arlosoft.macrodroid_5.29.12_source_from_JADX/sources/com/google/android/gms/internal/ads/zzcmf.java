package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.protocol.HTTP;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcmf extends zzer implements zzfu {

    /* renamed from: v */
    private static final Pattern f28971v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e */
    private final int f28972e;

    /* renamed from: f */
    private final int f28973f;

    /* renamed from: g */
    private final String f28974g;

    /* renamed from: h */
    private final zzft f28975h = new zzft();

    /* renamed from: i */
    private zzfc f28976i;

    /* renamed from: j */
    private HttpURLConnection f28977j;

    /* renamed from: k */
    private final Queue f28978k;

    /* renamed from: l */
    private InputStream f28979l;

    /* renamed from: m */
    private boolean f28980m;

    /* renamed from: n */
    private int f28981n;

    /* renamed from: o */
    private long f28982o;

    /* renamed from: p */
    private long f28983p;

    /* renamed from: q */
    private long f28984q;

    /* renamed from: r */
    private long f28985r;

    /* renamed from: s */
    private long f28986s;

    /* renamed from: t */
    private final long f28987t;

    /* renamed from: u */
    private final long f28988u;

    zzcmf(String str, zzfz zzfz, int i, int i2, long j, long j2) {
        super(true);
        zzdd.m47209c(str);
        this.f28974g = str;
        this.f28972e = i;
        this.f28973f = i2;
        this.f28978k = new ArrayDeque();
        this.f28987t = j;
        this.f28988u = j2;
        if (zzfz != null) {
            mo43952k(zzfz);
        }
    }

    /* renamed from: s */
    private final void m45804s() {
        while (!this.f28978k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f28978k.remove()).disconnect();
            } catch (Exception e) {
                zzcgp.m45227e("Unexpected error while disconnecting", e);
            }
        }
        this.f28977j = null;
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        HttpURLConnection httpURLConnection = this.f28977j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Nullable
    /* renamed from: b */
    public final Map mo43925b() {
        HttpURLConnection httpURLConnection = this.f28977j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* renamed from: d */
    public final void mo43926d() throws zzfq {
        try {
            InputStream inputStream = this.f28979l;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f28979l = null;
            m45804s();
            if (this.f28980m) {
                this.f28980m = false;
                mo45436o();
            }
        } catch (IOException e) {
            throw new zzfq(e, this.f28976i, 2000, 3);
        } catch (Throwable th) {
            this.f28979l = null;
            m45804s();
            if (this.f28980m) {
                this.f28980m = false;
                mo45436o();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws zzfq {
        int i3 = i2;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.f28982o;
            long j2 = this.f28983p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = (long) i3;
            long j4 = this.f28988u;
            long j5 = this.f28986s;
            long j6 = j5 + 1;
            if (this.f28984q + j2 + j3 + j4 > j6) {
                long j7 = this.f28985r;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.f28987t + j6) - j4) - 1, -1 + j6 + j3));
                    long j8 = j6;
                    long j9 = min;
                    mo43985r(j8, min, 2);
                    this.f28986s = j9;
                    j5 = j9;
                }
            }
            int read = this.f28979l.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.f28984q) - this.f28983p));
            if (read != -1) {
                this.f28983p += (long) read;
                mo45439x(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzfq(e, this.f28976i, 2000, 2);
        }
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws zzfq {
        long j;
        this.f28976i = zzfc;
        this.f28983p = 0;
        long j2 = zzfc.f35401f;
        long j3 = zzfc.f35402g;
        if (j3 == -1) {
            j = this.f28987t;
        } else {
            j = Math.min(this.f28987t, j3);
        }
        this.f28984q = j2;
        HttpURLConnection r = mo43985r(j2, (j + j2) - 1, 1);
        this.f28977j = r;
        String headerField = r.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f28971v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = zzfc.f35402g;
                    if (j4 != -1) {
                        this.f28982o = j4;
                        this.f28985r = Math.max(parseLong, (this.f28984q + j4) - 1);
                    } else {
                        this.f28982o = parseLong2 - this.f28984q;
                        this.f28985r = parseLong2 - 1;
                    }
                    this.f28986s = parseLong;
                    this.f28980m = true;
                    mo45438q(zzfc);
                    return this.f28982o;
                } catch (NumberFormatException unused) {
                    zzcgp.m45226d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcmd(headerField, zzfc);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: r */
    public final HttpURLConnection mo43985r(long j, long j2, int i) throws zzfq {
        String uri = this.f28976i.f35396a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f28972e);
            httpURLConnection.setReadTimeout(this.f28973f);
            for (Map.Entry entry : this.f28975h.mo46172a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + HelpFormatter.DEFAULT_OPT_PREFIX + j2);
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, this.f28974g);
            httpURLConnection.setRequestProperty("Accept-Encoding", HTTP.IDENTITY_CODING);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f28978k.add(httpURLConnection);
            String uri2 = this.f28976i.f35396a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f28981n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = httpURLConnection.getHeaderFields();
                    m45804s();
                    throw new zzcme(this.f28981n, headerFields, this.f28976i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f28979l != null) {
                        inputStream = new SequenceInputStream(this.f28979l, inputStream);
                    }
                    this.f28979l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m45804s();
                    throw new zzfq(e, this.f28976i, 2000, i);
                }
            } catch (IOException e2) {
                m45804s();
                throw new zzfq("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.f28976i, 2000, i);
            }
        } catch (IOException e3) {
            throw new zzfq("Unable to connect to ".concat(String.valueOf(uri)), e3, this.f28976i, 2000, i);
        }
    }
}
