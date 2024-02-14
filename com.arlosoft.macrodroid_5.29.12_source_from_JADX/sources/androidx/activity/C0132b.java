package androidx.activity;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.activity.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0132b implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ ComponentActivity f295a;

    public /* synthetic */ C0132b(ComponentActivity componentActivity) {
        this.f295a = componentActivity;
    }

    public final Bundle saveState() {
        return this.f295a.lambda$new$0();
    }
}
