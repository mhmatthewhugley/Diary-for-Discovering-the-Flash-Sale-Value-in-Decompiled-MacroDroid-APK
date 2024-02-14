package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.fragment.app.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0684d implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ FragmentManager f548a;

    public /* synthetic */ C0684d(FragmentManager fragmentManager) {
        this.f548a = fragmentManager;
    }

    public final Bundle saveState() {
        return this.f548a.lambda$attachController$0();
    }
}
