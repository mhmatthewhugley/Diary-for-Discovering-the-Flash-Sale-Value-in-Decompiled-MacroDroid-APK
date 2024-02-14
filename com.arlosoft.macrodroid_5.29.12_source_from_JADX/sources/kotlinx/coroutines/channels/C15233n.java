package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15455o;
import kotlinx.coroutines.internal.C15466u;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010&\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010$j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`%¢\u0006\u0004\b'\u0010(J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0016\u0010\u0001\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0014R\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010#\u001a\u00020!8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\"¨\u0006)"}, mo71668d2 = {"Lkotlinx/coroutines/channels/n;", "E", "Lkotlinx/coroutines/channels/a;", "", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "P", "u", "(Ljava/lang/Object;)Ljava/lang/Object;", "M", "", "wasClosed", "Lja/u;", "I", "Lkotlinx/coroutines/channels/s;", "receive", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "f", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "g", "Ljava/lang/Object;", "value", "F", "()Z", "isBufferAlwaysEmpty", "G", "isBufferEmpty", "r", "isBufferAlwaysFull", "s", "isBufferFull", "", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.n */
/* compiled from: ConflatedChannel.kt */
public class C15233n<E> extends C15205a<E> {

    /* renamed from: f */
    private final ReentrantLock f64454f = new ReentrantLock();

    /* renamed from: g */
    private Object f64455g = C15213b.f64422a;

    public C15233n(C16265l<? super E, C13339u> lVar) {
        super(lVar);
    }

    /* renamed from: P */
    private final UndeliveredElementException m93881P(Object obj) {
        C16265l<E, C13339u> lVar;
        Object obj2 = this.f64455g;
        UndeliveredElementException undeliveredElementException = null;
        if (!(obj2 == C15213b.f64422a || (lVar = this.f64429a) == null)) {
            undeliveredElementException = C15466u.m94477d(lVar, obj2, (UndeliveredElementException) null, 2, (Object) null);
        }
        this.f64455g = obj;
        return undeliveredElementException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo74525E(C15240s<? super E> sVar) {
        ReentrantLock reentrantLock = this.f64454f;
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
        return this.f64455g == C15213b.f64422a;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo74529I(boolean z) {
        ReentrantLock reentrantLock = this.f64454f;
        reentrantLock.lock();
        try {
            UndeliveredElementException P = m93881P(C15213b.f64422a);
            C13339u uVar = C13339u.f61331a;
            reentrantLock.unlock();
            super.mo74529I(z);
            if (P != null) {
                throw P;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public Object mo74533M() {
        ReentrantLock reentrantLock = this.f64454f;
        reentrantLock.lock();
        try {
            Object obj = this.f64455g;
            C15429a0 a0Var = C15213b.f64422a;
            if (obj == a0Var) {
                Object i = mo74556i();
                if (i == null) {
                    i = C15213b.f64425d;
                }
                return i;
            }
            this.f64455g = a0Var;
            C13339u uVar = C13339u.f61331a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo74554g() {
        return "(value=" + this.f64455g + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo74558r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo74559s() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo74561u(E e) {
        C15242u y;
        ReentrantLock reentrantLock = this.f64454f;
        reentrantLock.lock();
        try {
            C15232m<?> i = mo74556i();
            if (i == null) {
                if (this.f64455g == C15213b.f64422a) {
                    do {
                        y = mo74539y();
                        if (y != null) {
                            if (y instanceof C15232m) {
                                reentrantLock.unlock();
                                return y;
                            }
                        }
                    } while (y.mo74547h(e, (C15455o.C15457b) null) == null);
                    C13339u uVar = C13339u.f61331a;
                    reentrantLock.unlock();
                    y.mo74546g(e);
                    return y.mo74588a();
                }
                UndeliveredElementException P = m93881P(e);
                if (P == null) {
                    C15429a0 a0Var = C15213b.f64423b;
                    reentrantLock.unlock();
                    return a0Var;
                }
                throw P;
            }
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
