package p185w4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p063b5.C2253f;
import p067c5.C2276f;
import p079d5.C7259b;
import p083e4.C7271c;
import p083e4.C7276h;
import p083e4.C7278i;
import p084e5.C7284c;
import p090f5.C7315j;
import p090f5.C7316k;
import p095g4.C7333a;
import p102h4.C7380e;
import p102h4.C7387j;
import p120k4.C7580a;
import p126l4.C7669d;

/* renamed from: w4.g */
/* compiled from: GifFrameLoader */
class C10341g {

    /* renamed from: a */
    private final C7333a f23528a;

    /* renamed from: b */
    private final Handler f23529b;

    /* renamed from: c */
    private final List<C10343b> f23530c;

    /* renamed from: d */
    final C7278i f23531d;

    /* renamed from: e */
    private final C7669d f23532e;

    /* renamed from: f */
    private boolean f23533f;

    /* renamed from: g */
    private boolean f23534g;

    /* renamed from: h */
    private boolean f23535h;

    /* renamed from: i */
    private C7276h<Bitmap> f23536i;

    /* renamed from: j */
    private C10342a f23537j;

    /* renamed from: k */
    private boolean f23538k;

    /* renamed from: l */
    private C10342a f23539l;

    /* renamed from: m */
    private Bitmap f23540m;

    /* renamed from: n */
    private C7387j<Bitmap> f23541n;

    /* renamed from: o */
    private C10342a f23542o;
    @Nullable

    /* renamed from: p */
    private C10345d f23543p;

    @VisibleForTesting
    /* renamed from: w4.g$a */
    /* compiled from: GifFrameLoader */
    static class C10342a extends C2276f<Bitmap> {

        /* renamed from: d */
        private final Handler f23544d;

        /* renamed from: e */
        final int f23545e;

        /* renamed from: f */
        private final long f23546f;

        /* renamed from: g */
        private Bitmap f23547g;

        C10342a(Handler handler, int i, long j) {
            this.f23544d = handler;
            this.f23545e = i;
            this.f23546f = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Bitmap mo41001i() {
            return this.f23547g;
        }

        /* renamed from: j */
        public void mo24592e(@NonNull Bitmap bitmap, @Nullable C7259b<? super Bitmap> bVar) {
            this.f23547g = bitmap;
            this.f23544d.sendMessageAtTime(this.f23544d.obtainMessage(1, this), this.f23546f);
        }
    }

    /* renamed from: w4.g$b */
    /* compiled from: GifFrameLoader */
    public interface C10343b {
        /* renamed from: a */
        void mo40964a();
    }

    /* renamed from: w4.g$c */
    /* compiled from: GifFrameLoader */
    private class C10344c implements Handler.Callback {
        C10344c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C10341g.this.mo40997n((C10342a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C10341g.this.f23531d.mo37183m((C10342a) message.obj);
                return false;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: w4.g$d */
    /* compiled from: GifFrameLoader */
    interface C10345d {
        /* renamed from: a */
        void mo41004a();
    }

    C10341g(C7271c cVar, C7333a aVar, int i, int i2, C7387j<Bitmap> jVar, Bitmap bitmap) {
        this(cVar.mo37143f(), C7271c.m30017t(cVar.mo37145h()), aVar, (Handler) null, m40599j(C7271c.m30017t(cVar.mo37145h()), i, i2), jVar, bitmap);
    }

    /* renamed from: g */
    private static C7380e m40597g() {
        return new C7284c(Double.valueOf(Math.random()));
    }

    /* renamed from: h */
    private int m40598h() {
        return C7316k.m30211f(mo40990c().getWidth(), mo40990c().getHeight(), mo40990c().getConfig());
    }

    /* renamed from: j */
    private static C7276h<Bitmap> m40599j(C7278i iVar, int i, int i2) {
        return iVar.mo37180j().mo24491a(((C2253f) ((C2253f) C2253f.m9245t0(C7580a.f18489b).mo24518r0(true)).mo24506j0(true)).mo24489Y(i, i2));
    }

    /* renamed from: m */
    private void m40600m() {
        if (this.f23533f && !this.f23534g) {
            if (this.f23535h) {
                C7315j.m30201a(this.f23542o == null, "Pending target must be null when starting from the first frame");
                this.f23528a.mo37304g();
                this.f23535h = false;
            }
            C10342a aVar = this.f23542o;
            if (aVar != null) {
                this.f23542o = null;
                mo40997n(aVar);
                return;
            }
            this.f23534g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f23528a.mo37303f());
            this.f23528a.mo37299c();
            this.f23539l = new C10342a(this.f23529b, this.f23528a.mo37306h(), uptimeMillis);
            this.f23536i.mo24491a(C2253f.m9246u0(m40597g())).mo37174M0(this.f23528a).mo37167C0(this.f23539l);
        }
    }

    /* renamed from: o */
    private void m40601o() {
        Bitmap bitmap = this.f23540m;
        if (bitmap != null) {
            this.f23532e.mo37692c(bitmap);
            this.f23540m = null;
        }
    }

    /* renamed from: q */
    private void m40602q() {
        if (!this.f23533f) {
            this.f23533f = true;
            this.f23538k = false;
            m40600m();
        }
    }

    /* renamed from: r */
    private void m40603r() {
        this.f23533f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40988a() {
        this.f23530c.clear();
        m40601o();
        m40603r();
        C10342a aVar = this.f23537j;
        if (aVar != null) {
            this.f23531d.mo37183m(aVar);
            this.f23537j = null;
        }
        C10342a aVar2 = this.f23539l;
        if (aVar2 != null) {
            this.f23531d.mo37183m(aVar2);
            this.f23539l = null;
        }
        C10342a aVar3 = this.f23542o;
        if (aVar3 != null) {
            this.f23531d.mo37183m(aVar3);
            this.f23542o = null;
        }
        this.f23528a.clear();
        this.f23538k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo40989b() {
        return this.f23528a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo40990c() {
        C10342a aVar = this.f23537j;
        return aVar != null ? aVar.mo41001i() : this.f23540m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo40991d() {
        C10342a aVar = this.f23537j;
        if (aVar != null) {
            return aVar.f23545e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo40992e() {
        return this.f23540m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo40993f() {
        return this.f23528a.mo37301d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo40994i() {
        return mo40990c().getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo40995k() {
        return this.f23528a.mo37297a() + m40598h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo40996l() {
        return mo40990c().getWidth();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: n */
    public void mo40997n(C10342a aVar) {
        C10345d dVar = this.f23543p;
        if (dVar != null) {
            dVar.mo41004a();
        }
        this.f23534g = false;
        if (this.f23538k) {
            this.f23529b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f23533f) {
            this.f23542o = aVar;
        } else {
            if (aVar.mo41001i() != null) {
                m40601o();
                C10342a aVar2 = this.f23537j;
                this.f23537j = aVar;
                for (int size = this.f23530c.size() - 1; size >= 0; size--) {
                    this.f23530c.get(size).mo40964a();
                }
                if (aVar2 != null) {
                    this.f23529b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m40600m();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [h4.j<android.graphics.Bitmap>, h4.j, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40998p(p102h4.C7387j<android.graphics.Bitmap> r2, android.graphics.Bitmap r3) {
        /*
            r1 = this;
            java.lang.Object r0 = p090f5.C7315j.m30204d(r2)
            h4.j r0 = (p102h4.C7387j) r0
            r1.f23541n = r0
            java.lang.Object r3 = p090f5.C7315j.m30204d(r3)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r1.f23540m = r3
            e4.h<android.graphics.Bitmap> r3 = r1.f23536i
            b5.f r0 = new b5.f
            r0.<init>()
            b5.a r2 = r0.mo24508k0(r2)
            e4.h r2 = r3.mo24491a(r2)
            r1.f23536i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p185w4.C10341g.mo40998p(h4.j, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo40999s(C10343b bVar) {
        if (this.f23538k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f23530c.contains(bVar)) {
            boolean isEmpty = this.f23530c.isEmpty();
            this.f23530c.add(bVar);
            if (isEmpty) {
                m40602q();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo41000t(C10343b bVar) {
        this.f23530c.remove(bVar);
        if (this.f23530c.isEmpty()) {
            m40603r();
        }
    }

    C10341g(C7669d dVar, C7278i iVar, C7333a aVar, Handler handler, C7276h<Bitmap> hVar, C7387j<Bitmap> jVar, Bitmap bitmap) {
        this.f23530c = new ArrayList();
        this.f23531d = iVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C10344c()) : handler;
        this.f23532e = dVar;
        this.f23529b = handler;
        this.f23536i = hVar;
        this.f23528a = aVar;
        mo40998p(jVar, bitmap);
    }
}
