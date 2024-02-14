package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.view.KeyEventDispatcher;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0180a implements KeyEventDispatcher.Component {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f310a;

    public /* synthetic */ C0180a(AppCompatDialog appCompatDialog) {
        this.f310a = appCompatDialog;
    }

    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return this.f310a.superDispatchKeyEvent(keyEvent);
    }
}
