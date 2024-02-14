package p226cd;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000b"}, mo71668d2 = {"Lcd/x;", "Lcd/a;", "Ljava/io/IOException;", "cause", "v", "Lja/u;", "z", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.x */
/* compiled from: JvmOkio.kt */
final class C11211x extends C11173a {

    /* renamed from: m */
    private final Socket f54156m;

    public C11211x(Socket socket) {
        C13706o.m87929f(socket, "socket");
        this.f54156m = socket;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public IOException mo62378v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo62381z() {
        try {
            this.f54156m.close();
        } catch (Exception e) {
            C11197m.f54122a.log(Level.WARNING, C13706o.m87936m("Failed to close timed out socket ", this.f54156m), e);
        } catch (AssertionError e2) {
            if (C11196l.m75164c(e2)) {
                C11197m.f54122a.log(Level.WARNING, C13706o.m87936m("Failed to close timed out socket ", this.f54156m), e2);
                return;
            }
            throw e2;
        }
    }
}
