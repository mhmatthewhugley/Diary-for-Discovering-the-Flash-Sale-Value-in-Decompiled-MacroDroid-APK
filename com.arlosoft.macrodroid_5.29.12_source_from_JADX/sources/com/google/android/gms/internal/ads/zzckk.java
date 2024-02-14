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
final class zzckk implements zzazv {

    /* renamed from: r */
    private static final Pattern f28761r = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: a */
    private final int f28762a;

    /* renamed from: b */
    private final int f28763b;

    /* renamed from: c */
    private final String f28764c;

    /* renamed from: d */
    private final zzazu f28765d = new zzazu();

    /* renamed from: e */
    private final zzbab f28766e;

    /* renamed from: f */
    private zzazo f28767f;

    /* renamed from: g */
    private HttpURLConnection f28768g;

    /* renamed from: h */
    private final Queue f28769h;

    /* renamed from: i */
    private InputStream f28770i;

    /* renamed from: j */
    private boolean f28771j;

    /* renamed from: k */
    private long f28772k;

    /* renamed from: l */
    private long f28773l;

    /* renamed from: m */
    private long f28774m;

    /* renamed from: n */
    private long f28775n;

    /* renamed from: o */
    private long f28776o;

    /* renamed from: p */
    private final long f28777p;

    /* renamed from: q */
    private final long f28778q;

    zzckk(String str, zzbab zzbab, int i, int i2, long j, long j2) {
        zzbac.m42923b(str);
        this.f28764c = str;
        this.f28766e = zzbab;
        this.f28762a = i;
        this.f28763b = i2;
        this.f28769h = new ArrayDeque();
        this.f28777p = j;
        this.f28778q = j2;
    }

    /* renamed from: g */
    private final void m45633g() {
        while (!this.f28769h.isEmpty()) {
            try {
                ((HttpURLConnection) this.f28769h.remove()).disconnect();
            } catch (Exception e) {
                zzcgp.m45227e("Unexpected error while disconnecting", e);
            }
        }
        this.f28768g = null;
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo42281a() {
        HttpURLConnection httpURLConnection = this.f28768g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Nullable
    /* renamed from: b */
    public final Map mo42294b() {
        HttpURLConnection httpURLConnection = this.f28768g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public final HttpURLConnection mo43871c(long j, long j2, int i) throws zzazs {
        String uri = this.f28767f.f26354a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f28762a);
            httpURLConnection.setReadTimeout(this.f28763b);
            for (Map.Entry entry : this.f28765d.mo42295a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + HelpFormatter.DEFAULT_OPT_PREFIX + j2);
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, this.f28764c);
            httpURLConnection.setRequestProperty("Accept-Encoding", HTTP.IDENTITY_CODING);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f28769h.add(httpURLConnection);
            String uri2 = this.f28767f.f26354a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = httpURLConnection.getHeaderFields();
                    m45633g();
                    throw new zzckj(responseCode, headerFields, this.f28767f, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f28770i != null) {
                        inputStream = new SequenceInputStream(this.f28770i, inputStream);
                    }
                    this.f28770i = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m45633g();
                    throw new zzazs(e, this.f28767f, i);
                }
            } catch (IOException e2) {
                m45633g();
                throw new zzazs("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.f28767f, i);
            }
        } catch (IOException e3) {
            throw new zzazs("Unable to connect to ".concat(String.valueOf(uri)), e3, this.f28767f, i);
        }
    }

    /* renamed from: d */
    public final void mo42282d() throws zzazs {
        try {
            InputStream inputStream = this.f28770i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f28770i = null;
            m45633g();
            if (this.f28771j) {
                this.f28771j = false;
            }
        } catch (IOException e) {
            throw new zzazs(e, this.f28767f, 3);
        } catch (Throwable th) {
            this.f28770i = null;
            m45633g();
            if (this.f28771j) {
                this.f28771j = false;
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final int mo42283e(byte[] bArr, int i, int i2) throws zzazs {
        int i3 = i2;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.f28772k;
            long j2 = this.f28773l;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = (long) i3;
            long j4 = this.f28778q;
            long j5 = this.f28776o;
            long j6 = j5 + 1;
            if (this.f28774m + j2 + j3 + j4 > j6) {
                long j7 = this.f28775n;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.f28777p + j6) - j4) - 1, -1 + j6 + j3));
                    long j8 = j6;
                    long j9 = min;
                    mo43871c(j8, min, 2);
                    this.f28776o = j9;
                    j5 = j9;
                }
            }
            int read = this.f28770i.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.f28774m) - this.f28773l));
            if (read != -1) {
                this.f28773l += (long) read;
                zzbab zzbab = this.f28766e;
                if (zzbab != null) {
                    ((zzckg) zzbab).mo43867l0(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzazs(e, this.f28767f, 2);
        }
    }

    /* renamed from: f */
    public final long mo42284f(zzazo zzazo) throws zzazs {
        long j;
        this.f28767f = zzazo;
        this.f28773l = 0;
        long j2 = zzazo.f26356c;
        long j3 = zzazo.f26357d;
        if (j3 == -1) {
            j = this.f28777p;
        } else {
            j = Math.min(this.f28777p, j3);
        }
        this.f28774m = j2;
        HttpURLConnection c = mo43871c(j2, (j + j2) - 1, 1);
        this.f28768g = c;
        String headerField = c.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f28761r.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = zzazo.f26357d;
                    if (j4 != -1) {
                        this.f28772k = j4;
                        this.f28775n = Math.max(parseLong, (this.f28774m + j4) - 1);
                    } else {
                        this.f28772k = parseLong2 - this.f28774m;
                        this.f28775n = parseLong2 - 1;
                    }
                    this.f28776o = parseLong;
                    this.f28771j = true;
                    zzbab zzbab = this.f28766e;
                    if (zzbab != null) {
                        ((zzckg) zzbab).mo42307f(this, zzazo);
                    }
                    return this.f28772k;
                } catch (NumberFormatException unused) {
                    zzcgp.m45226d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcki(headerField, zzazo);
    }
}
