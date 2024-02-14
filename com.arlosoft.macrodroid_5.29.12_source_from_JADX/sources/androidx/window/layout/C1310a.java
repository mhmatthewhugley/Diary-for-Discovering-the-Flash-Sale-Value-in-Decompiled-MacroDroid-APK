package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

/* renamed from: androidx.window.layout.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1310a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f706a;

    /* renamed from: c */
    public final /* synthetic */ WindowLayoutInfo f707c;

    public /* synthetic */ C1310a(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f706a = windowLayoutChangeCallbackWrapper;
        this.f707c = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m101284accept$lambda0(this.f706a, this.f707c);
    }
}
