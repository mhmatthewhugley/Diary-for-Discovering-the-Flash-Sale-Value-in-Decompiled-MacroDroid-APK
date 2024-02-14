package p434xb;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;

/* renamed from: xb.d */
/* compiled from: BuiltInsResourceLoader.kt */
public final class C16908d {
    /* renamed from: a */
    public final InputStream mo80080a(String str) {
        C13706o.m87929f(str, ClientCookie.PATH_ATTR);
        ClassLoader classLoader = C16908d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
