package p275h7;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.miguelbcr.p231ui.rx_paparazzo2.entities.UserCanceledException;
import p216ba.C11114e;
import p259f7.C12246f;
import p414v9.C16735i;
import rx_activity_result2.C17425b;
import rx_activity_result2.C17429f;
import rx_activity_result2.C17430g;

/* renamed from: h7.k */
/* compiled from: StartIntent */
public final class C12401k extends C12405m<Intent> {

    /* renamed from: a */
    private final C12246f f59116a;

    /* renamed from: b */
    private Intent f59117b;

    /* renamed from: c */
    private C17425b f59118c;

    /* renamed from: h7.k$a */
    /* compiled from: StartIntent */
    class C12402a implements C11114e<C17429f<Fragment>, Intent> {
        C12402a() {
        }

        /* renamed from: a */
        public Intent apply(C17429f<Fragment> fVar) throws Exception {
            return C12401k.this.m83251b(fVar);
        }
    }

    /* renamed from: h7.k$b */
    /* compiled from: StartIntent */
    class C12403b implements C11114e<C17429f<FragmentActivity>, Intent> {
        C12403b() {
        }

        /* renamed from: a */
        public Intent apply(C17429f<FragmentActivity> fVar) throws Exception {
            return C12401k.this.m83251b(fVar);
        }
    }

    public C12401k(C12246f fVar) {
        this.f59116a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Intent m83251b(C17429f fVar) {
        this.f59116a.mo68562d(fVar.mo80777c());
        if (fVar.mo80776b() == -1) {
            return fVar.mo80775a() == null ? new Intent() : fVar.mo80775a();
        }
        throw new UserCanceledException();
    }

    /* renamed from: c */
    public C16735i<Intent> mo68752c() {
        Fragment b = this.f59116a.mo68560b();
        if (b != null) {
            return C17430g.m101211b(b).mo80779e(this.f59117b, this.f59118c).mo79678G(new C12402a());
        }
        return C17430g.m101210a(this.f59116a.mo68559a()).mo80779e(this.f59117b, this.f59118c).mo79678G(new C12403b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12401k mo68753d(Intent intent) {
        this.f59117b = intent;
        this.f59118c = null;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C12401k mo68754e(Intent intent, C17425b bVar) {
        this.f59117b = intent;
        this.f59118c = bVar;
        return this;
    }
}
