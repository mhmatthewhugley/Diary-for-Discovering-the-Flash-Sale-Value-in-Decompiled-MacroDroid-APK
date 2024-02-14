package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.ListResult;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3838q implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ AutoBackupCloudViewModel f9981a;

    /* renamed from: b */
    public final /* synthetic */ String f9982b;

    public /* synthetic */ C3838q(AutoBackupCloudViewModel autoBackupCloudViewModel, String str) {
        this.f9981a = autoBackupCloudViewModel;
        this.f9982b = str;
    }

    /* renamed from: b */
    public final void mo22751b(Object obj) {
        AutoBackupCloudViewModel.m14910y(this.f9981a, this.f9982b, (ListResult) obj);
    }
}
