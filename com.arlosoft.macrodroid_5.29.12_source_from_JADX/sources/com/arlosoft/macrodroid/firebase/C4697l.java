package com.arlosoft.macrodroid.firebase;

import com.arlosoft.macrodroid.firebase.C4688h;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.UploadTask;
import java.io.File;

/* renamed from: com.arlosoft.macrodroid.firebase.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4697l implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ File f11810a;

    /* renamed from: b */
    public final /* synthetic */ C4688h.C4691c f11811b;

    /* renamed from: c */
    public final /* synthetic */ C4688h f11812c;

    public /* synthetic */ C4697l(File file, C4688h.C4691c cVar, C4688h hVar) {
        this.f11810a = file;
        this.f11811b = cVar;
        this.f11812c = hVar;
    }

    /* renamed from: b */
    public final void mo22751b(Object obj) {
        C4688h.C4692d.m18205j(this.f11810a, this.f11811b, this.f11812c, (UploadTask.TaskSnapshot) obj);
    }
}
