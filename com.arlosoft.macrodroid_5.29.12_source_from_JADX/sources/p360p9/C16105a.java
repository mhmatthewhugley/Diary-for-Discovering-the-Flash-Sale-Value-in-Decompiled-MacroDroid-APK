package p360p9;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.Socket;
import p226cd.C11179b;
import p226cd.C11210w;
import p226cd.C11213z;
import p292io.grpc.internal.C12895z1;
import p360p9.C16110b;
import p405u9.C16673b;
import p405u9.C16674c;

/* renamed from: p9.a */
/* compiled from: AsyncSink */
final class C16105a implements C11210w {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f66074a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11179b f66075c = new C11179b();

    /* renamed from: d */
    private final C12895z1 f66076d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16110b.C16111a f66077f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f66078g = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f66079o = false;

    /* renamed from: p */
    private boolean f66080p = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C11210w f66081s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Socket f66082z;

    /* renamed from: p9.a$a */
    /* compiled from: AsyncSink */
    class C16106a extends C16109d {

        /* renamed from: c */
        final C16673b f66083c = C16674c.m99123e();

        C16106a() {
            super(C16105a.this, (C16106a) null);
        }

        /* renamed from: a */
        public void mo78442a() throws IOException {
            C16674c.m99124f("WriteRunnable.runWrite");
            C16674c.m99122d(this.f66083c);
            C11179b bVar = new C11179b();
            try {
                synchronized (C16105a.this.f66074a) {
                    bVar.mo62384X(C16105a.this.f66075c, C16105a.this.f66075c.mo62428e());
                    boolean unused = C16105a.this.f66078g = false;
                }
                C16105a.this.f66081s.mo62384X(bVar, bVar.mo62399D());
                C16674c.m99126h("WriteRunnable.runWrite");
            } catch (Throwable th) {
                C16674c.m99126h("WriteRunnable.runWrite");
                throw th;
            }
        }
    }

    /* renamed from: p9.a$b */
    /* compiled from: AsyncSink */
    class C16107b extends C16109d {

        /* renamed from: c */
        final C16673b f66085c = C16674c.m99123e();

        C16107b() {
            super(C16105a.this, (C16106a) null);
        }

        /* renamed from: a */
        public void mo78442a() throws IOException {
            C16674c.m99124f("WriteRunnable.runFlush");
            C16674c.m99122d(this.f66085c);
            C11179b bVar = new C11179b();
            try {
                synchronized (C16105a.this.f66074a) {
                    bVar.mo62384X(C16105a.this.f66075c, C16105a.this.f66075c.mo62399D());
                    boolean unused = C16105a.this.f66079o = false;
                }
                C16105a.this.f66081s.mo62384X(bVar, bVar.mo62399D());
                C16105a.this.f66081s.flush();
                C16674c.m99126h("WriteRunnable.runFlush");
            } catch (Throwable th) {
                C16674c.m99126h("WriteRunnable.runFlush");
                throw th;
            }
        }
    }

    /* renamed from: p9.a$c */
    /* compiled from: AsyncSink */
    class C16108c implements Runnable {
        C16108c() {
        }

        public void run() {
            C16105a.this.f66075c.close();
            try {
                if (C16105a.this.f66081s != null) {
                    C16105a.this.f66081s.close();
                }
            } catch (IOException e) {
                C16105a.this.f66077f.mo78457a(e);
            }
            try {
                if (C16105a.this.f66082z != null) {
                    C16105a.this.f66082z.close();
                }
            } catch (IOException e2) {
                C16105a.this.f66077f.mo78457a(e2);
            }
        }
    }

    /* renamed from: p9.a$d */
    /* compiled from: AsyncSink */
    private abstract class C16109d implements Runnable {
        private C16109d() {
        }

        /* renamed from: a */
        public abstract void mo78442a() throws IOException;

        public final void run() {
            try {
                if (C16105a.this.f66081s != null) {
                    mo78442a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e) {
                C16105a.this.f66077f.mo78457a(e);
            }
        }

        /* synthetic */ C16109d(C16105a aVar, C16106a aVar2) {
            this();
        }
    }

    private C16105a(C12895z1 z1Var, C16110b.C16111a aVar) {
        this.f66076d = (C12895z1) Preconditions.m5393t(z1Var, "executor");
        this.f66077f = (C16110b.C16111a) Preconditions.m5393t(aVar, "exceptionHandler");
    }

    /* renamed from: m */
    static C16105a m96738m(C12895z1 z1Var, C16110b.C16111a aVar) {
        return new C16105a(z1Var, aVar);
    }

    /* renamed from: X */
    public void mo62384X(C11179b bVar, long j) throws IOException {
        Preconditions.m5393t(bVar, "source");
        if (!this.f66080p) {
            C16674c.m99124f("AsyncSink.write");
            try {
                synchronized (this.f66074a) {
                    this.f66075c.mo62384X(bVar, j);
                    if (!this.f66078g && !this.f66079o) {
                        if (this.f66075c.mo62428e() > 0) {
                            this.f66078g = true;
                            this.f66076d.execute(new C16106a());
                            C16674c.m99126h("AsyncSink.write");
                            return;
                        }
                    }
                    C16674c.m99126h("AsyncSink.write");
                }
            } catch (Throwable th) {
                C16674c.m99126h("AsyncSink.write");
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    public void close() {
        if (!this.f66080p) {
            this.f66080p = true;
            this.f66076d.execute(new C16108c());
        }
    }

    public void flush() throws IOException {
        if (!this.f66080p) {
            C16674c.m99124f("AsyncSink.flush");
            try {
                synchronized (this.f66074a) {
                    if (this.f66079o) {
                        C16674c.m99126h("AsyncSink.flush");
                        return;
                    }
                    this.f66079o = true;
                    this.f66076d.execute(new C16107b());
                    C16674c.m99126h("AsyncSink.flush");
                }
            } catch (Throwable th) {
                C16674c.m99126h("AsyncSink.flush");
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo78441j(C11210w wVar, Socket socket) {
        Preconditions.m5399z(this.f66081s == null, "AsyncSink's becomeConnected should only be called once.");
        this.f66081s = (C11210w) Preconditions.m5393t(wVar, "sink");
        this.f66082z = (Socket) Preconditions.m5393t(socket, "socket");
    }

    /* renamed from: q */
    public C11213z mo62388q() {
        return C11213z.f54158e;
    }
}
