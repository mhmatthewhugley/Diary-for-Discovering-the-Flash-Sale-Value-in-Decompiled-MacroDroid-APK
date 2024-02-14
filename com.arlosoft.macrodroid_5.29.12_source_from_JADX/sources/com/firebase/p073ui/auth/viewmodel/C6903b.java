package com.firebase.p073ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.viewmodel.b */
/* compiled from: OperableViewModel */
public abstract class C6903b<I, O> extends C6907f<I> {

    /* renamed from: c */
    private MutableLiveData<O> f16146c = new MutableLiveData<>();

    protected C6903b(Application application) {
        super(application);
    }

    /* renamed from: i */
    public LiveData<O> mo34267i() {
        return this.f16146c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo34268j(O o) {
        this.f16146c.setValue(o);
    }
}
