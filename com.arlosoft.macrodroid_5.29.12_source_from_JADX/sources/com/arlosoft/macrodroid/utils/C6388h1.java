package com.arlosoft.macrodroid.utils;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.utils.h1 */
/* compiled from: SingleLiveEvent.kt */
public final class C6388h1<T> extends MutableLiveData<T> {

    /* renamed from: b */
    public static final C6389a f14983b = new C6389a((C13695i) null);

    /* renamed from: a */
    private final AtomicBoolean f14984a = new AtomicBoolean(false);

    /* renamed from: com.arlosoft.macrodroid.utils.h1$a */
    /* compiled from: SingleLiveEvent.kt */
    public static final class C6389a {
        private C6389a() {
        }

        public /* synthetic */ C6389a(C13695i iVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m24643b(C6388h1 h1Var, Observer observer, Object obj) {
        C13706o.m87929f(h1Var, "this$0");
        C13706o.m87929f(observer, "$observer");
        if (h1Var.f14984a.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    @MainThread
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        C13706o.m87929f(lifecycleOwner, "owner");
        C13706o.m87929f(observer, "observer");
        if (hasActiveObservers()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(lifecycleOwner, new C6385g1(this, observer));
    }

    @MainThread
    public void setValue(T t) {
        this.f14984a.set(true);
        super.setValue(t);
    }
}
