package dev.skomlach.common.network;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011J\u0018\u0010\u0015\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0004¨\u0006\u0018"}, mo71668d2 = {"Ldev/skomlach/common/network/b;", "", "", "d", "", "link", "", "timeout", "Ljava/net/HttpURLConnection;", "a", "Ljava/io/InputStream;", "src", "Ljava/io/OutputStream;", "dest", "Lja/u;", "b", "Ljava/nio/channels/ReadableByteChannel;", "Ljava/nio/channels/WritableByteChannel;", "c", "baseUrl", "relativeUrl", "e", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.network.b */
/* compiled from: NetworkApi.kt */
public final class C12126b {

    /* renamed from: a */
    public static final C12126b f58407a = new C12126b();

    private C12126b() {
    }

    /* renamed from: a */
    public final HttpURLConnection mo68335a(String str, int i) throws Exception {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str).toURI().normalize().toURL();
        if (C15176v.m93641v(url.getProtocol(), ProxyConfig.MATCH_HTTPS, true)) {
            URLConnection openConnection = url.openConnection();
            C13706o.m87927d(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpURLConnection = (HttpsURLConnection) openConnection;
        } else {
            URLConnection openConnection2 = url.openConnection();
            C13706o.m87927d(openConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) openConnection2;
        }
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        return httpURLConnection;
    }

    /* renamed from: b */
    public final void mo68336b(InputStream inputStream, OutputStream outputStream) throws IOException {
        ReadableByteChannel newChannel = Channels.newChannel(inputStream);
        WritableByteChannel newChannel2 = Channels.newChannel(outputStream);
        C13706o.m87928e(newChannel, "inputChannel");
        C13706o.m87928e(newChannel2, "outputChannel");
        mo68337c(newChannel, newChannel2);
        newChannel.close();
        newChannel2.close();
    }

    /* renamed from: c */
    public final void mo68337c(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        C13706o.m87929f(readableByteChannel, "src");
        C13706o.m87929f(writableByteChannel, "dest");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
        while (readableByteChannel.read(allocateDirect) != -1) {
            allocateDirect.flip();
            writableByteChannel.write(allocateDirect);
            allocateDirect.compact();
        }
        allocateDirect.flip();
        while (allocateDirect.hasRemaining()) {
            writableByteChannel.write(allocateDirect);
        }
    }

    /* renamed from: d */
    public final boolean mo68338d() {
        return Connection.f58385a.mo68322i();
    }

    /* renamed from: e */
    public final String mo68339e(String str, String str2) {
        C13706o.m87929f(str2, "relativeUrl");
        try {
            String uri = new URI(str).resolve(str2).toString();
            C13706o.m87928e(uri, "URI(baseUrl).resolve(relativeUrl).toString()");
            return uri;
        } catch (Throwable unused) {
            return str2;
        }
    }
}
