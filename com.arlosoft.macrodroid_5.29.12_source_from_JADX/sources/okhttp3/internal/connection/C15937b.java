package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15962l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo71668d2 = {"Lokhttp3/internal/connection/b;", "", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "sslSocket", "Lokhttp3/l;", "a", "Ljava/io/IOException;", "e", "b", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "isFallback", "", "d", "Ljava/util/List;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.b */
/* compiled from: ConnectionSpecSelector.kt */
public final class C15937b {

    /* renamed from: a */
    private int f65635a;

    /* renamed from: b */
    private boolean f65636b;

    /* renamed from: c */
    private boolean f65637c;

    /* renamed from: d */
    private final List<C15962l> f65638d;

    public C15937b(List<C15962l> list) {
        C13706o.m87929f(list, "connectionSpecs");
        this.f65638d = list;
    }

    /* renamed from: c */
    private final boolean m96071c(SSLSocket sSLSocket) {
        int size = this.f65638d.size();
        for (int i = this.f65635a; i < size; i++) {
            if (this.f65638d.get(i).mo76167e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C15962l mo76067a(SSLSocket sSLSocket) throws IOException {
        C15962l lVar;
        C13706o.m87929f(sSLSocket, "sslSocket");
        int i = this.f65635a;
        int size = this.f65638d.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.f65638d.get(i);
            if (lVar.mo76167e(sSLSocket)) {
                this.f65635a = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            this.f65636b = m96071c(sSLSocket);
            lVar.mo76165c(sSLSocket, this.f65637c);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f65637c);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.f65638d);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C13706o.m87926c(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C13706o.m87928e(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo76068b(IOException iOException) {
        C13706o.m87929f(iOException, "e");
        this.f65637c = true;
        if (this.f65636b && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
