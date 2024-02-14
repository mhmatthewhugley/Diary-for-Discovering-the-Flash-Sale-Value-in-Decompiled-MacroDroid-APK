package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3836o implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ AutoBackupCloudViewModel f9978a;

    /* renamed from: b */
    public final /* synthetic */ String f9979b;

    public /* synthetic */ C3836o(AutoBackupCloudViewModel autoBackupCloudViewModel, String str) {
        this.f9978a = autoBackupCloudViewModel;
        this.f9979b = str;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        AutoBackupCloudViewModel.m14911z(this.f9978a, this.f9979b, exc);
    }
}
