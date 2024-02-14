package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.scheduling.C15528h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo71668d2 = {"Lkotlinx/coroutines/x0;", "T", "Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "h", "()Ljava/lang/Object;", "takenState", "", "cause", "Lja/u;", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "g", "", "d", "I", "resumeMode", "Lkotlin/coroutines/d;", "c", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.x0 */
/* compiled from: DispatchedTask.kt */
public abstract class C15566x0<T> extends C15528h {

    /* renamed from: d */
    public int f64813d;

    public C15566x0(int i) {
        this.f64813d = i;
    }

    /* renamed from: b */
    public void mo74764b(Object obj, Throwable th) {
    }

    /* renamed from: c */
    public abstract C13635d<T> mo74765c();

    /* renamed from: e */
    public Throwable mo74856e(Object obj) {
        C15196b0 b0Var = obj instanceof C15196b0 ? (C15196b0) obj : null;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f64404a;
    }

    /* renamed from: f */
    public <T> T mo74857f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public final void mo74927g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C13315b.m85661a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C13706o.m87926c(th);
            C15474j0.m94494a(mo74765c().getContext(), new C15494n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: h */
    public abstract Object mo74766h();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r4.mo74514L0() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r4.mo74514L0() != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.i r0 = r10.f64769c
            kotlin.coroutines.d r1 = r10.mo74765c()     // Catch:{ all -> 0x00b0 }
            kotlinx.coroutines.internal.f r1 = (kotlinx.coroutines.internal.C15441f) r1     // Catch:{ all -> 0x00b0 }
            kotlin.coroutines.d<T> r2 = r1.f64651g     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r1.f64653p     // Catch:{ all -> 0x00b0 }
            kotlin.coroutines.g r3 = r2.getContext()     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = kotlinx.coroutines.internal.C15437e0.m94362c(r3, r1)     // Catch:{ all -> 0x00b0 }
            kotlinx.coroutines.internal.a0 r4 = kotlinx.coroutines.internal.C15437e0.f64642a     // Catch:{ all -> 0x00b0 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            kotlinx.coroutines.b3 r4 = kotlinx.coroutines.C15408g0.m94275g(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            kotlin.coroutines.g r6 = r2.getContext()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r7 = r10.mo74766h()     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r8 = r10.mo74856e(r7)     // Catch:{ all -> 0x00a3 }
            if (r8 != 0) goto L_0x003e
            int r9 = r10.f64813d     // Catch:{ all -> 0x00a3 }
            boolean r9 = kotlinx.coroutines.C15570y0.m94745b(r9)     // Catch:{ all -> 0x00a3 }
            if (r9 == 0) goto L_0x003e
            kotlinx.coroutines.w1$b r9 = kotlinx.coroutines.C15561w1.f64808x     // Catch:{ all -> 0x00a3 }
            kotlin.coroutines.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00a3 }
            kotlinx.coroutines.w1 r6 = (kotlinx.coroutines.C15561w1) r6     // Catch:{ all -> 0x00a3 }
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.mo74487b()     // Catch:{ all -> 0x00a3 }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.mo74612g()     // Catch:{ all -> 0x00a3 }
            r10.mo74764b(r7, r6)     // Catch:{ all -> 0x00a3 }
            ja.n$a r7 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = p297ja.C13332o.m85684a(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = p297ja.C13329n.m85676a(r6)     // Catch:{ all -> 0x00a3 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0079
        L_0x005c:
            if (r8 == 0) goto L_0x006c
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = p297ja.C13332o.m85684a(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = p297ja.C13329n.m85676a(r6)     // Catch:{ all -> 0x00a3 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0079
        L_0x006c:
            java.lang.Object r6 = r10.mo74857f(r7)     // Catch:{ all -> 0x00a3 }
            ja.n$a r7 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = p297ja.C13329n.m85676a(r6)     // Catch:{ all -> 0x00a3 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a3 }
        L_0x0079:
            ja.u r2 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x0083
            boolean r4 = r4.mo74514L0()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x0086
        L_0x0083:
            kotlinx.coroutines.internal.C15437e0.m94360a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x0086:
            ja.n$a r1 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x0090 }
            r0.mo74894a()     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = p297ja.C13329n.m85676a(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x009b
        L_0x0090:
            r0 = move-exception
            ja.n$a r1 = p297ja.C13329n.f61327a
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)
            java.lang.Object r0 = p297ja.C13329n.m85676a(r0)
        L_0x009b:
            java.lang.Throwable r0 = p297ja.C13329n.m85678c(r0)
            r10.mo74927g(r5, r0)
            goto L_0x00cf
        L_0x00a3:
            r2 = move-exception
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r4.mo74514L0()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x00af
        L_0x00ac:
            kotlinx.coroutines.internal.C15437e0.m94360a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r2     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            ja.n$a r2 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x00bd }
            r0.mo74894a()     // Catch:{ all -> 0x00bd }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00c8
        L_0x00bd:
            r0 = move-exception
            ja.n$a r2 = p297ja.C13329n.f61327a
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)
            java.lang.Object r0 = p297ja.C13329n.m85676a(r0)
        L_0x00c8:
            java.lang.Throwable r0 = p297ja.C13329n.m85678c(r0)
            r10.mo74927g(r1, r0)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15566x0.run():void");
    }
}
