package p146p4;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p102h4.C7384g;
import p146p4.C8105n;

/* renamed from: p4.x */
/* compiled from: UrlUriLoader */
public class C8135x<Data> implements C8105n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f19748b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", ProxyConfig.MATCH_HTTPS})));

    /* renamed from: a */
    private final C8105n<C8091g, Data> f19749a;

    /* renamed from: p4.x$a */
    /* compiled from: UrlUriLoader */
    public static class C8136a implements C8107o<Uri, InputStream> {
        @NonNull
        /* renamed from: a */
        public C8105n<Uri, InputStream> mo38078a(C8113r rVar) {
            return new C8135x(rVar.mo38133d(C8091g.class, InputStream.class));
        }
    }

    public C8135x(C8105n<C8091g, Data> nVar) {
        this.f19749a = nVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<Data> mo38074b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        return this.f19749a.mo38074b(new C8091g(uri.toString()), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull Uri uri) {
        return f19748b.contains(uri.getScheme());
    }
}
