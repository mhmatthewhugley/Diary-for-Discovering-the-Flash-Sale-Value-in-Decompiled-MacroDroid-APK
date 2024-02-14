package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.fragment.app.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0682b implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ FragmentActivity f546a;

    public /* synthetic */ C0682b(FragmentActivity fragmentActivity) {
        this.f546a = fragmentActivity;
    }

    public final Bundle saveState() {
        return this.f546a.lambda$init$0();
    }
}
