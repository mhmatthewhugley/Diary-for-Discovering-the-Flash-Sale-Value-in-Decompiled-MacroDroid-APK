package p275h7;

import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12246f;
import p270ga.C12318a;
import p414v9.C16735i;
import p414v9.C16737j;
import p414v9.C16738k;

/* renamed from: h7.c */
/* compiled from: DownloadFile */
public final class C12384c extends C12405m<C12242b> {

    /* renamed from: a */
    private final C12246f f59080a;

    /* renamed from: b */
    private final C12241a f59081b;

    /* renamed from: c */
    private final C12393f f59082c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Uri f59083d;

    /* renamed from: e */
    private C12242b f59084e;

    /* renamed from: h7.c$a */
    /* compiled from: DownloadFile */
    class C12385a implements C16738k<C12242b> {
        C12385a() {
        }

        /* renamed from: a */
        public void mo16895a(C16737j<C12242b> jVar) throws Exception {
            if (!jVar.isDisposed()) {
                try {
                    if ("content".equalsIgnoreCase(C12384c.this.f59083d.getScheme())) {
                        jVar.onNext(C12384c.this.m83173g());
                    } else {
                        jVar.onNext(C12384c.this.m83170d());
                    }
                    jVar.onComplete();
                } catch (FileNotFoundException e) {
                    jVar.onError(e);
                }
            }
        }
    }

    public C12384c(C12246f fVar, C12241a aVar, C12393f fVar2) {
        this.f59080a = fVar;
        this.f59081b = aVar;
        this.f59082c = fVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C12242b m83170d() throws Exception {
        String r = C12393f.m83209r(this.f59080a.mo68561c(), this.f59083d);
        String e = m83171e(this.f59083d);
        File t = this.f59082c.mo68740t("DOWNLOAD-", this.f59082c.mo68737m(this.f59083d));
        URL url = new URL(this.f59083d.toString());
        url.openConnection().connect();
        this.f59082c.mo68735d(new BufferedInputStream(url.openStream()), t);
        return m83174i(r, e, t);
    }

    /* renamed from: e */
    private String m83171e(Uri uri) {
        String name;
        DocumentFile fromSingleUri = DocumentFile.fromSingleUri(this.f59080a.mo68561c(), uri);
        if (fromSingleUri != null && (name = fromSingleUri.getName()) != null) {
            return C12393f.m83197B(name);
        }
        String replaceAll = uri.getLastPathSegment().replaceAll("[^A-Za-z0-9 ]", "");
        return replaceAll + "." + this.f59082c.mo68737m(uri);
    }

    /* renamed from: f */
    private C16735i<C12242b> m83172f() {
        return C16735i.m99352k(new C12385a()).mo79688T(C12318a.m83030b());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C12242b m83173g() throws FileNotFoundException {
        String r = C12393f.m83209r(this.f59080a.mo68561c(), this.f59083d);
        String e = m83171e(this.f59083d);
        File t = this.f59082c.mo68740t("DOWNLOAD-", this.f59082c.mo68737m(this.f59083d));
        this.f59082c.mo68735d(this.f59080a.mo68561c().getContentResolver().openInputStream(this.f59083d), t);
        return m83174i(r, e, t);
    }

    /* renamed from: i */
    private C12242b m83174i(String str, String str2, File file) {
        C12242b bVar = this.f59084e;
        if (bVar == null || bVar.mo68546d() == null) {
            return new C12242b(file, true, str2, str);
        }
        String e = this.f59084e.mo68547e();
        if (e != null) {
            str = e;
        }
        return C12242b.m82933j(this.f59084e, file, true, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C16735i<C12242b> mo68724h() {
        return m83172f();
    }

    /* renamed from: j */
    public C12384c mo68725j(Uri uri, C12242b bVar) {
        this.f59083d = uri;
        this.f59084e = bVar;
        return this;
    }
}
