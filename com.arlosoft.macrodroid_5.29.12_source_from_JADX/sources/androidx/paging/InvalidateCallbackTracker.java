package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u001d\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0000@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, mo71668d2 = {"Landroidx/paging/InvalidateCallbackTracker;", "T", "", "", "callbackCount$paging_common", "()I", "callbackCount", "callback", "Lja/u;", "registerInvalidatedCallback$paging_common", "(Ljava/lang/Object;)V", "registerInvalidatedCallback", "unregisterInvalidatedCallback$paging_common", "unregisterInvalidatedCallback", "invalidate$paging_common", "()V", "invalidate", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "callbacks", "Ljava/util/List;", "", "<set-?>", "invalid", "Z", "getInvalid$paging_common", "()Z", "Lkotlin/Function1;", "callbackInvoker", "Lkotlin/Function0;", "invalidGetter", "<init>", "(Lqa/l;Lqa/a;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: InvalidateCallbackTracker.kt */
public final class InvalidateCallbackTracker<T> {
    private final C16265l<T, C13339u> callbackInvoker;
    private final List<T> callbacks;
    private boolean invalid;
    private final C16254a<Boolean> invalidGetter;
    private final ReentrantLock lock;

    public InvalidateCallbackTracker(C16265l<? super T, C13339u> lVar, C16254a<Boolean> aVar) {
        C13706o.m87929f(lVar, "callbackInvoker");
        this.callbackInvoker = lVar;
        this.invalidGetter = aVar;
        this.lock = new ReentrantLock();
        this.callbacks = new ArrayList();
    }

    @VisibleForTesting
    public final int callbackCount$paging_common() {
        return this.callbacks.size();
    }

    public final boolean getInvalid$paging_common() {
        return this.invalid;
    }

    public final void invalidate$paging_common() {
        if (!this.invalid) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (!getInvalid$paging_common()) {
                    this.invalid = true;
                    List<Object> F0 = C13566b0.m87402F0(this.callbacks);
                    this.callbacks.clear();
                    C13339u uVar = C13339u.f61331a;
                    reentrantLock.unlock();
                    if (F0 != null) {
                        C16265l<T, C13339u> lVar = this.callbackInvoker;
                        for (Object invoke : F0) {
                            lVar.invoke(invoke);
                        }
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void registerInvalidatedCallback$paging_common(T t) {
        C16254a<Boolean> aVar = this.invalidGetter;
        boolean z = false;
        if (aVar != null && aVar.invoke().booleanValue()) {
            invalidate$paging_common();
        }
        if (this.invalid) {
            this.callbackInvoker.invoke(t);
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (getInvalid$paging_common()) {
                C13339u uVar = C13339u.f61331a;
                z = true;
            } else {
                this.callbacks.add(t);
            }
            if (z) {
                this.callbackInvoker.invoke(t);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void unregisterInvalidatedCallback$paging_common(T t) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.callbacks.remove(t);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvalidateCallbackTracker(C16265l lVar, C16254a aVar, int i, C13695i iVar) {
        this(lVar, (i & 2) != 0 ? null : aVar);
    }
}
