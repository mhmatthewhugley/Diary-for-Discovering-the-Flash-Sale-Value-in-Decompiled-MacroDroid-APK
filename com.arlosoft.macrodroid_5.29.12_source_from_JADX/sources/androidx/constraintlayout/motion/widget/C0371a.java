package androidx.constraintlayout.motion.widget;

import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0371a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ViewTransition f394a;

    /* renamed from: c */
    public final /* synthetic */ View[] f395c;

    public /* synthetic */ C0371a(ViewTransition viewTransition, View[] viewArr) {
        this.f394a = viewTransition;
        this.f395c = viewArr;
    }

    public final void run() {
        this.f394a.lambda$applyTransition$0(this.f395c);
    }
}
