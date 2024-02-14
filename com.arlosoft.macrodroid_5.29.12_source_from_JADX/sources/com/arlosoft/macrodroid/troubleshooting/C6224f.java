package com.arlosoft.macrodroid.troubleshooting;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.tasks.OnSuccessListener;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6224f implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TroubleShootingActivity f14791a;

    /* renamed from: b */
    public final /* synthetic */ AppUpdateManager f14792b;

    public /* synthetic */ C6224f(TroubleShootingActivity troubleShootingActivity, AppUpdateManager appUpdateManager) {
        this.f14791a = troubleShootingActivity;
        this.f14792b = appUpdateManager;
    }

    /* renamed from: b */
    public final void mo32242b(Object obj) {
        TroubleShootingActivity.m24272b2(this.f14791a, this.f14792b, (AppUpdateInfo) obj);
    }
}
