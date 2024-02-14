package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15299i0;
import kotlinx.coroutines.flow.internal.C15302c;
import p297ja.C13329n;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b&\u0010\u0017J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R>\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0004@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070#8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010$¨\u0006'"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/internal/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "()Lkotlinx/coroutines/flow/internal/c;", "", "size", "", "i", "(I)[Lkotlinx/coroutines/flow/internal/c;", "f", "slot", "Lja/u;", "j", "(Lkotlinx/coroutines/flow/internal/c;)V", "<set-?>", "a", "[Lkotlinx/coroutines/flow/internal/c;", "l", "()[Lkotlinx/coroutines/flow/internal/c;", "getSlots$annotations", "()V", "slots", "c", "I", "k", "()I", "nCollectors", "d", "nextIndex", "Lkotlinx/coroutines/flow/internal/w;", "Lkotlinx/coroutines/flow/internal/w;", "_subscriptionCount", "Lkotlinx/coroutines/flow/i0;", "()Lkotlinx/coroutines/flow/i0;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.a */
/* compiled from: AbstractSharedFlow.kt */
public abstract class C15300a<S extends C15302c<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public S[] f64528a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f64529c;

    /* renamed from: d */
    private int f64530d;

    /* renamed from: f */
    private C15337w f64531f;

    /* renamed from: c */
    public final C15299i0<Integer> mo74676c() {
        C15337w wVar;
        synchronized (this) {
            wVar = this.f64531f;
            if (wVar == null) {
                wVar = new C15337w(mo74679k());
                this.f64531f = wVar;
            }
        }
        return wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final S mo74677f() {
        S s;
        C15337w wVar;
        synchronized (this) {
            S[] l = mo74680l();
            if (l == null) {
                l = mo74655i(2);
                this.f64528a = l;
            } else if (mo74679k() >= l.length) {
                S[] copyOf = Arrays.copyOf(l, l.length * 2);
                C13706o.m87928e(copyOf, "copyOf(this, newSize)");
                this.f64528a = (C15302c[]) copyOf;
                l = (C15302c[]) copyOf;
            }
            int i = this.f64530d;
            do {
                s = l[i];
                if (s == null) {
                    s = mo74654h();
                    l[i] = s;
                }
                i++;
                if (i >= l.length) {
                    i = 0;
                }
            } while (!s.mo74661a(this));
            this.f64530d = i;
            this.f64529c = mo74679k() + 1;
            wVar = this.f64531f;
        }
        if (wVar != null) {
            wVar.mo74694X(1);
        }
        return s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract S mo74654h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract S[] mo74655i(int i);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo74678j(S s) {
        C15337w wVar;
        int i;
        C13635d[] b;
        synchronized (this) {
            this.f64529c = mo74679k() - 1;
            wVar = this.f64531f;
            i = 0;
            if (mo74679k() == 0) {
                this.f64530d = 0;
            }
            b = s.mo74662b(this);
        }
        int length = b.length;
        while (i < length) {
            C13635d dVar = b[i];
            i++;
            if (dVar != null) {
                C13329n.C13330a aVar = C13329n.f61327a;
                dVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
            }
        }
        if (wVar != null) {
            wVar.mo74694X(-1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo74679k() {
        return this.f64529c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final S[] mo74680l() {
        return this.f64528a;
    }
}
