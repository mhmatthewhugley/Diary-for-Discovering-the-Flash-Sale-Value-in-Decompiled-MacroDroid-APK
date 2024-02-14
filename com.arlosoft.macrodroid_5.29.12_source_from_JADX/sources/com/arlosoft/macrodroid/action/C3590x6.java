package com.arlosoft.macrodroid.action;

import android.view.WindowManager;
import com.arlosoft.macrodroid.utils.C6462z0;

/* renamed from: com.arlosoft.macrodroid.action.x6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3590x6 implements C6462z0.C6463a {

    /* renamed from: a */
    public final /* synthetic */ ForceScreenRotationAction f9539a;

    /* renamed from: b */
    public final /* synthetic */ WindowManager.LayoutParams f9540b;

    /* renamed from: c */
    public final /* synthetic */ WindowManager f9541c;

    public /* synthetic */ C3590x6(ForceScreenRotationAction forceScreenRotationAction, WindowManager.LayoutParams layoutParams, WindowManager windowManager) {
        this.f9539a = forceScreenRotationAction;
        this.f9540b = layoutParams;
        this.f9541c = windowManager;
    }

    /* renamed from: a */
    public final void mo27017a(boolean z) {
        this.f9539a.m10908o3(this.f9540b, this.f9541c, z);
    }
}
