package androidx.savedstate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.savedstate.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1159a implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ SavedStateRegistry f697a;

    public /* synthetic */ C1159a(SavedStateRegistry savedStateRegistry) {
        this.f697a = savedStateRegistry;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        SavedStateRegistry.m101280performAttach$lambda4(this.f697a, lifecycleOwner, event);
    }
}
