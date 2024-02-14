package p462hf;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import p459ef.C17158f;
import p459ef.C17163i;
import p464jf.C17176a;
import p470pf.C17223b;
import p470pf.C17225d;
import p473rx.internal.schedulers.C17370g;

@Deprecated
/* renamed from: hf.b */
/* compiled from: HandlerThreadScheduler */
public class C17172b extends C17158f {

    /* renamed from: b */
    private final Handler f68722b;

    /* renamed from: hf.b$a */
    /* compiled from: HandlerThreadScheduler */
    private static class C17173a extends C17158f.C17159a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Handler f68723a;

        /* renamed from: c */
        private final C17223b f68724c = new C17223b();

        /* renamed from: hf.b$a$a */
        /* compiled from: HandlerThreadScheduler */
        class C17174a implements C17176a {

            /* renamed from: a */
            final /* synthetic */ C17370g f68725a;

            C17174a(C17370g gVar) {
                this.f68725a = gVar;
            }

            public void call() {
                C17173a.this.f68723a.removeCallbacks(this.f68725a);
            }
        }

        public C17173a(Handler handler) {
            this.f68723a = handler;
        }

        /* renamed from: a */
        public C17163i mo80446a(C17176a aVar) {
            return mo80447c(aVar, 0, TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public boolean mo80449b() {
            return this.f68724c.mo80449b();
        }

        /* renamed from: c */
        public C17163i mo80447c(C17176a aVar, long j, TimeUnit timeUnit) {
            C17370g gVar = new C17370g(aVar);
            gVar.mo80690a(C17225d.m100808a(new C17174a(gVar)));
            gVar.mo80692e(this.f68724c);
            this.f68724c.mo80521a(gVar);
            this.f68723a.postDelayed(gVar, timeUnit.toMillis(j));
            return gVar;
        }

        /* renamed from: d */
        public void mo80450d() {
            this.f68724c.mo80450d();
        }
    }

    @Deprecated
    public C17172b(Handler handler) {
        this.f68722b = handler;
    }

    /* renamed from: a */
    public C17158f.C17159a mo80445a() {
        return new C17173a(this.f68722b);
    }
}
