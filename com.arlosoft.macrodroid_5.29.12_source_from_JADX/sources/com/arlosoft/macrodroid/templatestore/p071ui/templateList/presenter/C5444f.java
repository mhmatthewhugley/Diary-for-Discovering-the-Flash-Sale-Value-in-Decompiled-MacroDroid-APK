package com.arlosoft.macrodroid.templatestore.p071ui.templateList.presenter;

import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5444f implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ C5457s f13361a;

    /* renamed from: c */
    public final /* synthetic */ MacroTemplate f13362c;

    /* renamed from: d */
    public final /* synthetic */ String f13363d;

    public /* synthetic */ C5444f(C5457s sVar, MacroTemplate macroTemplate, String str) {
        this.f13361a = sVar;
        this.f13362c = macroTemplate;
        this.f13363d = str;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        C5457s.m20948n0(this.f13361a, this.f13362c, this.f13363d, task);
    }
}
