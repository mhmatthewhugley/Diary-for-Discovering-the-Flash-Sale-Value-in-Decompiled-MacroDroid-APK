package com.arlosoft.macrodroid.firebase;

import com.arlosoft.macrodroid.firebase.C4688h;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import java.io.File;

/* renamed from: com.arlosoft.macrodroid.firebase.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4685e implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ C4688h.C4690b f11794a;

    /* renamed from: b */
    public final /* synthetic */ File f11795b;

    public /* synthetic */ C4685e(C4688h.C4690b bVar, File file) {
        this.f11794a = bVar;
        this.f11795b = file;
    }

    /* renamed from: b */
    public final void mo22751b(Object obj) {
        C4688h.m18187w(this.f11794a, this.f11795b, (FileDownloadTask.TaskSnapshot) obj);
    }
}
