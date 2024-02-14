package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.core.view.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0502h implements View.OnUnhandledKeyEventListener {

    /* renamed from: a */
    public final /* synthetic */ ViewCompat.OnUnhandledKeyEventListenerCompat f510a;

    public /* synthetic */ C0502h(ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        this.f510a = onUnhandledKeyEventListenerCompat;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.f510a.onUnhandledKeyEvent(view, keyEvent);
    }
}
