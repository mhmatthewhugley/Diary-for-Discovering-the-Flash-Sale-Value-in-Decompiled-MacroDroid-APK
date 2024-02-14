package dev.skomlach.biometric.compat.utils.statusbar;

import android.view.Window;

/* renamed from: dev.skomlach.biometric.compat.utils.statusbar.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12103a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Window f58366a;

    /* renamed from: c */
    public final /* synthetic */ int f58367c;

    /* renamed from: d */
    public final /* synthetic */ int f58368d;

    /* renamed from: f */
    public final /* synthetic */ int f58369f;

    public /* synthetic */ C12103a(Window window, int i, int i2, int i3) {
        this.f58366a = window;
        this.f58367c = i;
        this.f58368d = i2;
        this.f58369f = i3;
    }

    public final void run() {
        StatusBarTools.m101368setNavBarAndStatusBarColors$lambda0(this.f58366a, this.f58367c, this.f58368d, this.f58369f);
    }
}
