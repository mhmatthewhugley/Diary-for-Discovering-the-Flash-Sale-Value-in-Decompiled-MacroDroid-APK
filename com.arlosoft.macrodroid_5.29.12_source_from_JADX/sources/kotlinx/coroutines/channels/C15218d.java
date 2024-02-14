package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15455o;
import kotlinx.coroutines.internal.C15466u;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020 \u0012 \u0010>\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010<j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`=¢\u0006\u0004\b?\u0010@J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0001\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0014¢\u0006\u0004\b\u0001\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0014\u00101\u001a\u00020\u00198DX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00198DX\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u00198DX\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00106\u001a\u00020\u00198DX\u0004¢\u0006\u0006\u001a\u0004\b-\u00100R\u0014\u00108\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00100R\u0014\u0010;\u001a\u0002098TX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010:¨\u0006A"}, mo71668d2 = {"Lkotlinx/coroutines/channels/d;", "E", "Lkotlinx/coroutines/channels/a;", "", "currentSize", "Lkotlinx/coroutines/internal/a0;", "R", "(I)Lkotlinx/coroutines/internal/a0;", "element", "Lja/u;", "P", "(ILjava/lang/Object;)V", "Q", "(I)V", "", "u", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/w;", "send", "e", "(Lkotlinx/coroutines/channels/w;)Ljava/lang/Object;", "M", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/s;", "receive", "", "(Lkotlinx/coroutines/channels/s;)Z", "wasClosed", "I", "(Z)V", "f", "capacity", "Lkotlinx/coroutines/channels/e;", "g", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "p", "[Ljava/lang/Object;", "buffer", "s", "head", "F", "()Z", "isBufferAlwaysEmpty", "G", "isBufferEmpty", "r", "isBufferAlwaysFull", "isBufferFull", "H", "isClosedForReceive", "", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/e;Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.d */
/* compiled from: ArrayChannel.kt */
public class C15218d<E> extends C15205a<E> {

    /* renamed from: f */
    private final int f64435f;

    /* renamed from: g */
    private final C15220e f64436g;

    /* renamed from: o */
    private final ReentrantLock f64437o;

    /* renamed from: p */
    private Object[] f64438p;

    /* renamed from: s */
    private int f64439s;
    private volatile /* synthetic */ int size;

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.channels.d$a */
    /* compiled from: ArrayChannel.kt */
    public /* synthetic */ class C15219a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64440a;

        static {
            int[] iArr = new int[C15220e.values().length];
            iArr[C15220e.SUSPEND.ordinal()] = 1;
            iArr[C15220e.DROP_LATEST.ordinal()] = 2;
            iArr[C15220e.DROP_OLDEST.ordinal()] = 3;
            f64440a = iArr;
        }
    }

    public C15218d(int i, C15220e eVar, C16265l<? super E, C13339u> lVar) {
        super(lVar);
        this.f64435f = i;
        this.f64436g = eVar;
        if (i < 1 ? false : true) {
            this.f64437o = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C13593l.m87566m(objArr, C15213b.f64422a, 0, 0, 6, (Object) null);
            this.f64438p = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: P */
    private final void m93825P(int i, E e) {
        if (i < this.f64435f) {
            m93826Q(i);
            Object[] objArr = this.f64438p;
            objArr[(this.f64439s + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f64438p;
        int i2 = this.f64439s;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f64439s = (i2 + 1) % objArr2.length;
    }

    /* renamed from: Q */
    private final void m93826Q(int i) {
        Object[] objArr = this.f64438p;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f64435f);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f64438p;
                objArr2[i2] = objArr3[(this.f64439s + i2) % objArr3.length];
            }
            C13593l.m87565l(objArr2, C15213b.f64422a, i, min);
            this.f64438p = objArr2;
            this.f64439s = 0;
        }
    }

    /* renamed from: R */
    private final C15429a0 m93827R(int i) {
        if (i < this.f64435f) {
            this.size = i + 1;
            return null;
        }
        int i2 = C15219a.f64440a[this.f64436g.ordinal()];
        if (i2 == 1) {
            return C15213b.f64424c;
        }
        if (i2 == 2) {
            return C15213b.f64423b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo74525E(C15240s<? super E> sVar) {
        ReentrantLock reentrantLock = this.f64437o;
        reentrantLock.lock();
        try {
            return super.mo74525E(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo74526F() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo74527G() {
        return this.size == 0;
    }

    /* renamed from: H */
    public boolean mo74528H() {
        ReentrantLock reentrantLock = this.f64437o;
        reentrantLock.lock();
        try {
            return super.mo74528H();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo74529I(boolean z) {
        C16265l<E, C13339u> lVar = this.f64429a;
        ReentrantLock reentrantLock = this.f64437o;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                Object obj = this.f64438p[this.f64439s];
                if (!(lVar == null || obj == C15213b.f64422a)) {
                    undeliveredElementException = C15466u.m94476c(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f64438p;
                int i3 = this.f64439s;
                objArr[i3] = C15213b.f64422a;
                this.f64439s = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            C13339u uVar = C13339u.f61331a;
            reentrantLock.unlock();
            super.mo74529I(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public Object mo74533M() {
        ReentrantLock reentrantLock = this.f64437o;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object i2 = mo74556i();
                if (i2 == null) {
                    i2 = C15213b.f64425d;
                }
                return i2;
            }
            Object[] objArr = this.f64438p;
            int i3 = this.f64439s;
            Object obj = objArr[i3];
            C15244w wVar = null;
            objArr[i3] = null;
            this.size = i - 1;
            Object obj2 = C15213b.f64425d;
            boolean z = false;
            if (i == this.f64435f) {
                C15244w wVar2 = null;
                while (true) {
                    C15244w z2 = mo74564z();
                    if (z2 == null) {
                        wVar = wVar2;
                        break;
                    } else if (z2.mo74568G((C15455o.C15457b) null) != null) {
                        obj2 = z2.mo74566E();
                        wVar = z2;
                        z = true;
                        break;
                    } else {
                        z2.mo74593H();
                        wVar2 = z2;
                    }
                }
            }
            if (obj2 != C15213b.f64425d && !(obj2 instanceof C15232m)) {
                this.size = i;
                Object[] objArr2 = this.f64438p;
                objArr2[(this.f64439s + i) % objArr2.length] = obj2;
            }
            this.f64439s = (this.f64439s + 1) % this.f64438p.length;
            C13339u uVar = C13339u.f61331a;
            reentrantLock.unlock();
            if (z) {
                C13706o.m87926c(wVar);
                wVar.mo74565D();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Object mo74553e(C15244w wVar) {
        ReentrantLock reentrantLock = this.f64437o;
        reentrantLock.lock();
        try {
            return super.mo74553e(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo74554g() {
        return "(buffer:capacity=" + this.f64435f + ",size=" + this.size + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo74558r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo74559s() {
        return this.size == this.f64435f && this.f64436g == C15220e.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo74561u(E e) {
        C15242u y;
        ReentrantLock reentrantLock = this.f64437o;
        reentrantLock.lock();
        try {
            int i = this.size;
            C15232m<?> i2 = mo74556i();
            if (i2 == null) {
                C15429a0 R = m93827R(i);
                if (R == null) {
                    if (i == 0) {
                        do {
                            y = mo74539y();
                            if (y != null) {
                                if (y instanceof C15232m) {
                                    this.size = i;
                                    reentrantLock.unlock();
                                    return y;
                                }
                            }
                        } while (y.mo74547h(e, (C15455o.C15457b) null) == null);
                        this.size = i;
                        C13339u uVar = C13339u.f61331a;
                        reentrantLock.unlock();
                        y.mo74546g(e);
                        return y.mo74588a();
                    }
                    m93825P(i, e);
                    C15429a0 a0Var = C15213b.f64423b;
                    reentrantLock.unlock();
                    return a0Var;
                }
                reentrantLock.unlock();
                return R;
            }
            reentrantLock.unlock();
            return i2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
