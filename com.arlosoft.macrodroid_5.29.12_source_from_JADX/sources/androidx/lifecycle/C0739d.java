package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.lifecycle.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0739d implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ SavedStateHandle f549a;

    public /* synthetic */ C0739d(SavedStateHandle savedStateHandle) {
        this.f549a = savedStateHandle;
    }

    public final Bundle saveState() {
        return SavedStateHandle.m101277savedStateProvider$lambda0(this.f549a);
    }
}
