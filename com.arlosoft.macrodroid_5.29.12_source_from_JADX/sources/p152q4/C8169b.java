package p152q4;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p102h4.C7384g;
import p146p4.C8091g;
import p146p4.C8105n;
import p146p4.C8107o;
import p146p4.C8113r;

/* renamed from: q4.b */
/* compiled from: HttpUriLoader */
public class C8169b implements C8105n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f19801b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", ProxyConfig.MATCH_HTTPS})));

    /* renamed from: a */
    private final C8105n<C8091g, InputStream> f19802a;

    /* renamed from: q4.b$a */
    /* compiled from: HttpUriLoader */
    public static class C8170a implements C8107o<Uri, InputStream> {
        @NonNull
        /* renamed from: a */
        public C8105n<Uri, InputStream> mo38078a(C8113r rVar) {
            return new C8169b(rVar.mo38133d(C8091g.class, InputStream.class));
        }
    }

    public C8169b(C8105n<C8091g, InputStream> nVar) {
        this.f19802a = nVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<InputStream> mo38074b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        return this.f19802a.mo38074b(new C8091g(uri.toString()), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull Uri uri) {
        return f19801b.contains(uri.getScheme());
    }
}
