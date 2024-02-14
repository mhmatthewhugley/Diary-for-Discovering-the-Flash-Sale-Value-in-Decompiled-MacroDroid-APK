package p152q4;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import p102h4.C7384g;
import p146p4.C8091g;
import p146p4.C8105n;
import p146p4.C8107o;
import p146p4.C8113r;

/* renamed from: q4.e */
/* compiled from: UrlLoader */
public class C8175e implements C8105n<URL, InputStream> {

    /* renamed from: a */
    private final C8105n<C8091g, InputStream> f19807a;

    /* renamed from: q4.e$a */
    /* compiled from: UrlLoader */
    public static class C8176a implements C8107o<URL, InputStream> {
        @NonNull
        /* renamed from: a */
        public C8105n<URL, InputStream> mo38078a(C8113r rVar) {
            return new C8175e(rVar.mo38133d(C8091g.class, InputStream.class));
        }
    }

    public C8175e(C8105n<C8091g, InputStream> nVar) {
        this.f19807a = nVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<InputStream> mo38074b(@NonNull URL url, int i, int i2, @NonNull C7384g gVar) {
        return this.f19807a.mo38074b(new C8091g(url), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull URL url) {
        return true;
    }
}
