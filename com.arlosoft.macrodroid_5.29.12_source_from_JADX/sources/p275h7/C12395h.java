package p275h7;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import p216ba.C11114e;
import p259f7.C12241a;
import p259f7.C12246f;
import p414v9.C16735i;
import rx_activity_result2.C17425b;

/* renamed from: h7.h */
/* compiled from: PickFile */
public class C12395h extends C12405m<Uri> {

    /* renamed from: a */
    private final C12241a f59101a;

    /* renamed from: b */
    private final C12401k f59102b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12246f f59103c;

    /* renamed from: h7.h$a */
    /* compiled from: PickFile */
    class C12396a implements C11114e<Intent, Uri> {
        C12396a() {
        }

        /* renamed from: a */
        public Uri apply(Intent intent) throws Exception {
            return intent.getData();
        }
    }

    /* renamed from: h7.h$b */
    /* compiled from: PickFile */
    class C12397b implements C17425b {
        C12397b() {
        }

        /* renamed from: o */
        public C16735i<Uri> mo68746o(int i, int i2, @Nullable Intent intent) {
            if (i2 != -1 || intent == null || intent.getData() == null) {
                return C16735i.m99354s();
            }
            C12394g.m83226b(C12395h.this.f59103c, intent.getData());
            return C16735i.m99342F(intent.getData());
        }
    }

    public C12395h(C12246f fVar, C12241a aVar, C12401k kVar) {
        this.f59103c = fVar;
        this.f59101a = aVar;
        this.f59102b = kVar;
    }

    /* renamed from: c */
    private Intent m83228c() {
        Intent intent = new Intent();
        if (this.f59101a.mo68529e() == null) {
            intent.setType(this.f59101a.mo68528d(mo68743b()));
        } else {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", this.f59101a.mo68529e());
        }
        if (this.f59101a.mo68536l()) {
            intent.setAction("android.intent.action.OPEN_DOCUMENT");
        } else {
            intent.setAction("android.intent.action.GET_CONTENT");
        }
        if (this.f59101a.mo68534j()) {
            intent.addCategory("android.intent.category.OPENABLE");
        }
        return intent;
    }

    /* renamed from: d */
    private C17425b m83229d() {
        return new C12397b();
    }

    /* renamed from: b */
    public String mo68743b() {
        return "*/*";
    }

    /* renamed from: e */
    public C16735i<Uri> mo68744e() {
        return this.f59102b.mo68754e(m83228c(), m83229d()).mo68752c().mo79678G(new C12396a());
    }
}
