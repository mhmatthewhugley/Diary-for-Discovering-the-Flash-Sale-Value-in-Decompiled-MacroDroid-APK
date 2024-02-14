package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzchs {

    /* renamed from: a */
    private final WeakReference f28473a;

    public zzchs(View view) {
        this.f28473a = new WeakReference(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo43585a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo43586b(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public final ViewTreeObserver mo43589c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f28473a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: d */
    public final void mo43590d() {
        ViewTreeObserver c = mo43589c();
        if (c != null) {
            mo43585a(c);
        }
    }

    /* renamed from: e */
    public final void mo43591e() {
        ViewTreeObserver c = mo43589c();
        if (c != null) {
            mo43586b(c);
        }
    }
}
