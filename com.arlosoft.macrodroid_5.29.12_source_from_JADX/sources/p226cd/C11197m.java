package p226cd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0004*\u00020\t\"\u001c\u0010\u0010\u001a\u00020\r*\u00060\u000bj\u0002`\f8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo71668d2 = {"Ljava/io/OutputStream;", "Lcd/w;", "c", "Ljava/io/InputStream;", "Lcd/y;", "f", "Ljava/net/Socket;", "d", "g", "Ljava/io/File;", "e", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "", "b", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, mo71669k = 5, mo71670mv = {1, 5, 1}, mo71673xs = "okio/Okio")
/* renamed from: cd.m */
/* compiled from: JvmOkio.kt */
final /* synthetic */ class C11197m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f54122a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final boolean m75171b(AssertionError assertionError) {
        C13706o.m87929f(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message == null ? false : C15177w.m93663N(message, "getsockname failed", false, 2, (Object) null);
    }

    /* renamed from: c */
    public static final C11210w m75172c(OutputStream outputStream) {
        C13706o.m87929f(outputStream, "<this>");
        return new C11201p(outputStream, new C11213z());
    }

    /* renamed from: d */
    public static final C11210w m75173d(Socket socket) throws IOException {
        C13706o.m87929f(socket, "<this>");
        C11211x xVar = new C11211x(socket);
        OutputStream outputStream = socket.getOutputStream();
        C13706o.m87928e(outputStream, "getOutputStream()");
        return xVar.mo62379x(new C11201p(outputStream, xVar));
    }

    /* renamed from: e */
    public static final C11212y m75174e(File file) throws FileNotFoundException {
        C13706o.m87929f(file, "<this>");
        return new C11195k(new FileInputStream(file), C11213z.f54158e);
    }

    /* renamed from: f */
    public static final C11212y m75175f(InputStream inputStream) {
        C13706o.m87929f(inputStream, "<this>");
        return new C11195k(inputStream, new C11213z());
    }

    /* renamed from: g */
    public static final C11212y m75176g(Socket socket) throws IOException {
        C13706o.m87929f(socket, "<this>");
        C11211x xVar = new C11211x(socket);
        InputStream inputStream = socket.getInputStream();
        C13706o.m87928e(inputStream, "getInputStream()");
        return xVar.mo62380y(new C11195k(inputStream, xVar));
    }
}
