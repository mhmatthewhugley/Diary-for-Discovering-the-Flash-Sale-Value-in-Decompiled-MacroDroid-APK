package com.arlosoft.macrodroid.troubleshooting;

import android.content.DialogInterface;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6221c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AppUpdateManager f14786a;

    /* renamed from: c */
    public final /* synthetic */ AppUpdateInfo f14787c;

    /* renamed from: d */
    public final /* synthetic */ TroubleShootingActivity f14788d;

    public /* synthetic */ C6221c(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo, TroubleShootingActivity troubleShootingActivity) {
        this.f14786a = appUpdateManager;
        this.f14787c = appUpdateInfo;
        this.f14788d = troubleShootingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TroubleShootingActivity.m24276f2(this.f14786a, this.f14787c, this.f14788d, dialogInterface, i);
    }
}
