package dev.skomlach.biometric.compat.utils.activityView;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: dev.skomlach.biometric.compat.utils.activityView.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12090f implements View.OnTouchListener {

    /* renamed from: a */
    public static final /* synthetic */ C12090f f58343a = new C12090f();

    private /* synthetic */ C12090f() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return WindowBackgroundBlurring.m101358setDrawable$lambda5$lambda4$lambda3(view, motionEvent);
    }
}
