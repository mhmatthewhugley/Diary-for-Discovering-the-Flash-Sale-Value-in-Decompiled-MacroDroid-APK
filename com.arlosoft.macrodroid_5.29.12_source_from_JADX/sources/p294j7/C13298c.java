package p294j7;

import com.miguelbcr.p231ui.rx_paparazzo2.entities.PermissionDeniedException;
import com.miguelbcr.p231ui.rx_paparazzo2.entities.UserCanceledException;
import p209aa.C11078a;
import p216ba.C11114e;
import p259f7.C12245e;
import p259f7.C12246f;
import p414v9.C16735i;
import p414v9.C16739l;
import p414v9.C16740m;

/* renamed from: j7.c */
/* compiled from: Worker */
abstract class C13298c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12246f f61272a;

    /* renamed from: j7.c$a */
    /* compiled from: Worker */
    class C13299a implements C16740m<T, T> {

        /* renamed from: j7.c$a$a */
        /* compiled from: Worker */
        class C13300a implements C11114e<Throwable, C16739l<? extends T>> {
            C13300a() {
            }

            /* renamed from: a */
            public C16739l<? extends T> apply(Throwable th) throws Exception {
                if (th instanceof UserCanceledException) {
                    return C16735i.m99342F(new C12245e(C13298c.this.f61272a.mo68563e(), null, 0));
                }
                if (th instanceof PermissionDeniedException) {
                    return C16735i.m99342F(new C12245e(C13298c.this.f61272a.mo68563e(), null, ((PermissionDeniedException) th).mo65799a()));
                }
                throw C11078a.m74638a(th);
            }
        }

        C13299a() {
        }

        /* renamed from: a */
        public C16739l<T> mo62236a(C16735i<T> iVar) {
            return iVar.mo79681K(new C13300a());
        }
    }

    public C13298c(C12246f fVar) {
        this.f61272a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T> C16740m<T, T> mo70133b() {
        return new C13299a();
    }
}
