package p275h7;

import android.content.Intent;
import android.net.Uri;
import com.yalantis.ucrop.C11913a;
import java.io.File;
import java.io.FileNotFoundException;
import p216ba.C11114e;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12244d;
import p259f7.C12246f;
import p414v9.C16735i;
import p414v9.C16739l;

/* renamed from: h7.a */
/* compiled from: CropImage */
public final class C12379a extends C12405m<C12242b> {

    /* renamed from: a */
    private final C12241a f59071a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12401k f59072b;

    /* renamed from: c */
    private final C12246f f59073c;

    /* renamed from: d */
    private final C12393f f59074d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C12242b f59075e;

    /* renamed from: h7.a$a */
    /* compiled from: CropImage */
    class C12380a implements C11114e<Intent, C16739l<C12242b>> {

        /* renamed from: a */
        final /* synthetic */ File f59076a;

        /* renamed from: h7.a$a$a */
        /* compiled from: CropImage */
        class C12381a implements C11114e<Uri, C16739l<C12242b>> {
            C12381a() {
            }

            /* renamed from: a */
            public C16739l<C12242b> apply(Uri uri) throws Exception {
                if (C12380a.this.f59076a.exists()) {
                    return C16735i.m99342F(C12242b.m82933j(C12379a.this.f59075e, C12380a.this.f59076a, true, "image/jpeg"));
                }
                throw new FileNotFoundException(String.format("Cropped file not saved", new Object[]{C12380a.this.f59076a.getAbsolutePath()}));
            }
        }

        /* renamed from: h7.a$a$b */
        /* compiled from: CropImage */
        class C12382b implements C11114e<Intent, Uri> {
            C12382b() {
            }

            /* renamed from: a */
            public Uri apply(Intent intent) throws Exception {
                return C11913a.m82204b(intent);
            }
        }

        C12380a(File file) {
            this.f59076a = file;
        }

        /* renamed from: a */
        public C16739l<C12242b> apply(Intent intent) throws Exception {
            intent.addFlags(1);
            return C12379a.this.f59072b.mo68753d(intent).mo68752c().mo79678G(new C12382b()).mo79712u(new C12381a());
        }
    }

    public C12379a(C12246f fVar, C12241a aVar, C12401k kVar, C12393f fVar2) {
        this.f59073c = fVar;
        this.f59071a = aVar;
        this.f59072b = kVar;
        this.f59074d = fVar2;
    }

    /* renamed from: c */
    private C16735i<C12242b> m83155c() {
        File g = m83159g();
        return C16735i.m99342F(m83157e(Uri.fromFile(g))).mo79712u(new C12380a(g));
    }

    /* renamed from: d */
    private Uri m83156d() {
        return Uri.fromFile(this.f59075e.mo68545c());
    }

    /* renamed from: e */
    private Intent m83157e(Uri uri) {
        Uri d = m83156d();
        C11913a.C11914a f = this.f59071a.mo68530f();
        if (f == null) {
            return C11913a.m82205c(d, uri).mo67207a(this.f59073c.mo68561c());
        }
        if (f instanceof C12244d) {
            return m83158f((C12244d) f, uri);
        }
        return C11913a.m82205c(d, uri).mo67210f(this.f59071a.mo68530f()).mo67207a(this.f59073c.mo68561c());
    }

    /* renamed from: f */
    private Intent m83158f(C12244d dVar, Uri uri) {
        C11913a f = C11913a.m82205c(Uri.fromFile(this.f59075e.mo68545c()), uri).mo67210f(dVar);
        if (dVar.mo68555h() != 0.0f) {
            f.mo67208d(dVar.mo68555h(), dVar.mo68556i());
        }
        if (dVar.mo68554g() != 0) {
            f.mo67209e(dVar.mo68554g(), dVar.mo68553f());
        }
        return f.mo67207a(this.f59073c.mo68561c());
    }

    /* renamed from: g */
    private File m83159g() {
        String o = this.f59074d.mo68739o(this.f59075e.mo68545c().getAbsolutePath(), "jpg");
        return this.f59074d.mo68741v(this.f59071a.mo68526b(), this.f59074d.mo68736h("CROPPED-", o));
    }

    /* renamed from: h */
    private boolean m83160h() {
        return this.f59074d.mo68742x(this.f59075e.mo68545c());
    }

    /* renamed from: i */
    public C16735i<C12242b> mo68716i() {
        if (!this.f59071a.mo68532h()) {
            return C16735i.m99342F(this.f59075e);
        }
        if (m83160h()) {
            return m83155c();
        }
        if (!this.f59071a.mo68533i()) {
            return C16735i.m99342F(this.f59075e);
        }
        throw new IllegalArgumentException("Expected an image file, cannot perform image crop");
    }

    /* renamed from: j */
    public C12379a mo68717j(C12242b bVar) {
        this.f59075e = bVar;
        return this;
    }
}
