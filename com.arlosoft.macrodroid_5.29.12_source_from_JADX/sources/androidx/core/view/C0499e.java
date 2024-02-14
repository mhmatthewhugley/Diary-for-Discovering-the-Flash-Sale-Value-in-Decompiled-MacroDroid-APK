package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.core.view.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0499e implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ MenuHostHelper f506a;

    /* renamed from: c */
    public final /* synthetic */ Lifecycle.State f507c;

    /* renamed from: d */
    public final /* synthetic */ MenuProvider f508d;

    public /* synthetic */ C0499e(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider) {
        this.f506a = menuHostHelper;
        this.f507c = state;
        this.f508d = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f506a.lambda$addMenuProvider$1(this.f507c, this.f508d, lifecycleOwner, event);
    }
}
