package com.firebase.p073ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AndroidViewModel;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.viewmodel.f */
/* compiled from: ViewModelBase */
public abstract class C6907f<T> extends AndroidViewModel {

    /* renamed from: a */
    private final AtomicBoolean f16151a = new AtomicBoolean();

    /* renamed from: b */
    private T f16152b;

    protected C6907f(Application application) {
        super(application);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public T mo34277f() {
        return this.f16152b;
    }

    /* renamed from: g */
    public void mo34278g(T t) {
        if (this.f16151a.compareAndSet(false, true)) {
            this.f16152b = t;
            mo34263h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo34263h() {
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onCleared() {
        this.f16151a.set(false);
    }
}
