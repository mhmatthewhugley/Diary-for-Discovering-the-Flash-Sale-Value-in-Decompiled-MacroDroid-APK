package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.core.view.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0498d implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ MenuHostHelper f504a;

    /* renamed from: c */
    public final /* synthetic */ MenuProvider f505c;

    public /* synthetic */ C0498d(MenuHostHelper menuHostHelper, MenuProvider menuProvider) {
        this.f504a = menuHostHelper;
        this.f505c = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f504a.lambda$addMenuProvider$0(this.f505c, lifecycleOwner, event);
    }
}
