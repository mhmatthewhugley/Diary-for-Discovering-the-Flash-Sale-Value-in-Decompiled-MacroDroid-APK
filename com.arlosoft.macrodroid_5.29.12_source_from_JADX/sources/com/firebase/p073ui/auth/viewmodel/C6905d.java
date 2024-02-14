package com.firebase.p073ui.auth.viewmodel;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.lifecycle.Observer;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.util.p075ui.C6897b;
import p127l5.C7688b;
import p127l5.C7689c;
import p138n5.C7985a;
import p138n5.C7988c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.viewmodel.d */
/* compiled from: ResourceObserver */
public abstract class C6905d<T> implements Observer<C7688b<T>> {

    /* renamed from: a */
    private final C7988c f16147a;

    /* renamed from: b */
    private final HelperActivityBase f16148b;

    /* renamed from: c */
    private final C7985a f16149c;

    /* renamed from: d */
    private final int f16150d;

    protected C6905d(@NonNull HelperActivityBase helperActivityBase) {
        this(helperActivityBase, (C7985a) null, helperActivityBase, R$string.fui_progress_dialog_loading);
    }

    /* renamed from: a */
    public final void onChanged(C7688b<T> bVar) {
        boolean z;
        if (bVar.mo37733e() == C7689c.LOADING) {
            this.f16147a.mo34184b1(this.f16150d);
            return;
        }
        this.f16147a.mo34183E();
        if (!bVar.mo37736g()) {
            if (bVar.mo37733e() == C7689c.SUCCESS) {
                mo34116c(bVar.mo37735f());
            } else if (bVar.mo37733e() == C7689c.FAILURE) {
                Exception d = bVar.mo37732d();
                C7985a aVar = this.f16149c;
                if (aVar == null) {
                    z = C6897b.m26056c(this.f16148b, d);
                } else {
                    z = C6897b.m26057d(aVar, d);
                }
                if (z) {
                    Log.e("AuthUI", "A sign-in error occurred.", d);
                    mo34115b(d);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo34115b(@NonNull Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo34116c(@NonNull T t);

    protected C6905d(@NonNull HelperActivityBase helperActivityBase, @StringRes int i) {
        this(helperActivityBase, (C7985a) null, helperActivityBase, i);
    }

    protected C6905d(@NonNull C7985a aVar) {
        this((HelperActivityBase) null, aVar, aVar, R$string.fui_progress_dialog_loading);
    }

    protected C6905d(@NonNull C7985a aVar, @StringRes int i) {
        this((HelperActivityBase) null, aVar, aVar, i);
    }

    private C6905d(HelperActivityBase helperActivityBase, C7985a aVar, C7988c cVar, int i) {
        this.f16148b = helperActivityBase;
        this.f16149c = aVar;
        if (helperActivityBase == null && aVar == null) {
            throw new IllegalStateException("ResourceObserver must be attached to an Activity or a Fragment");
        }
        this.f16147a = cVar;
        this.f16150d = i;
    }
}
