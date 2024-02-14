package p275h7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import p216ba.C11114e;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12246f;
import p414v9.C16735i;
import p414v9.C16739l;

/* renamed from: h7.i */
/* compiled from: SaveFile */
public final class C12398i extends C12405m<C12242b> {

    /* renamed from: f */
    private static final String f59106f = "i";

    /* renamed from: a */
    private final C12246f f59107a;

    /* renamed from: b */
    private final C12241a f59108b;

    /* renamed from: c */
    private final C12400j f59109c;

    /* renamed from: d */
    private final C12393f f59110d;

    /* renamed from: e */
    private C12242b f59111e;

    /* renamed from: h7.i$a */
    /* compiled from: SaveFile */
    class C12399a implements C11114e<C12383b, C16739l<C12242b>> {
        C12399a() {
        }

        /* renamed from: a */
        public C16739l<C12242b> apply(C12383b bVar) throws Exception {
            return C12398i.this.m83238f(bVar);
        }
    }

    public C12398i(C12246f fVar, C12241a aVar, C12400j jVar, C12393f fVar2) {
        this.f59107a = fVar;
        this.f59108b = aVar;
        this.f59109c = jVar;
        this.f59110d = fVar2;
    }

    /* renamed from: b */
    private File m83235b() {
        return this.f59110d.mo68740t("SAVED-", this.f59110d.mo68738n(this.f59111e.mo68546d()));
    }

    /* renamed from: c */
    private boolean m83236c(File file) {
        return file.exists() && file.length() > this.f59108b.mo68527c();
    }

    /* renamed from: e */
    private C12242b m83237e(C12383b bVar) throws Exception {
        C12383b q = C12393f.m83208q(this.f59111e.mo68545c());
        if (q.mo68721a()) {
            return m83239g(new C12242b(this.f59111e, q), bVar);
        }
        return m83240h(this.f59111e);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C16739l<C12242b> m83238f(C12383b bVar) throws Exception {
        C12242b e = m83237e(bVar);
        if (this.f59108b.mo68535k()) {
            if (this.f59108b.mo68537m()) {
                Log.w(f59106f, String.format("Media scanner will not be able to access internal storage '%s'", new Object[]{this.f59111e.mo68545c().getAbsolutePath()}));
            }
            if (e.mo68545c() != null && e.mo68545c().exists()) {
                m83241i(e);
            }
        }
        return C16735i.m99342F(e);
    }

    /* renamed from: g */
    private C12242b m83239g(C12242b bVar, C12383b bVar2) {
        C12242b A = this.f59110d.mo68733A(bVar, m83235b(), bVar2);
        if (m83236c(A.mo68545c())) {
            C12242b.m82931a(bVar);
            C12242b.m82931a(A);
            return C12242b.m82932b(bVar);
        }
        C12242b.m82931a(bVar);
        return A;
    }

    /* renamed from: h */
    private C12242b m83240h(C12242b bVar) throws Exception {
        File c = bVar.mo68545c();
        if (m83236c(c)) {
            C12242b.m82931a(bVar);
            return C12242b.m82932b(bVar);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(c));
        File b = m83235b();
        this.f59110d.mo68735d(bufferedInputStream, b);
        return C12242b.m82933j(bVar, b, true, bVar.mo68547e());
    }

    /* renamed from: i */
    private void m83241i(C12242b bVar) {
        File c = bVar.mo68545c();
        if (c.exists()) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            Context c2 = this.f59107a.mo68561c();
            intent.setData(Uri.fromFile(c));
            c2.sendBroadcast(intent);
        }
    }

    /* renamed from: d */
    public C16735i<C12242b> mo68747d() {
        return this.f59109c.mo68751e(this.f59111e).mo68750d().mo79712u(new C12399a());
    }

    /* renamed from: j */
    public C12398i mo68748j(C12242b bVar) {
        this.f59111e = bVar;
        return this;
    }
}
