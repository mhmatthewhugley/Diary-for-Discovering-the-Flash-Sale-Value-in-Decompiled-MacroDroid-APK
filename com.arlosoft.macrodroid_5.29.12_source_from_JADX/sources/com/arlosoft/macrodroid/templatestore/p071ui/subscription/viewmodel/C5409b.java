package com.arlosoft.macrodroid.templatestore.p071ui.subscription.viewmodel;

import android.content.Context;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import p176v0.C10312a;
import p199z2.C10434a;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.b */
/* compiled from: TemplateUpdatesViewModel_Factory */
public final class C5409b implements C12478a {

    /* renamed from: a */
    private final C12478a<Context> f13294a;

    /* renamed from: b */
    private final C12478a<MacroDroidRoomDatabase> f13295b;

    /* renamed from: c */
    private final C12478a<C10312a> f13296c;

    /* renamed from: d */
    private final C12478a<C10434a> f13297d;

    /* renamed from: e */
    private final C12478a<C5527g> f13298e;

    public C5409b(C12478a<Context> aVar, C12478a<MacroDroidRoomDatabase> aVar2, C12478a<C10312a> aVar3, C12478a<C10434a> aVar4, C12478a<C5527g> aVar5) {
        this.f13294a = aVar;
        this.f13295b = aVar2;
        this.f13296c = aVar3;
        this.f13297d = aVar4;
        this.f13298e = aVar5;
    }

    /* renamed from: a */
    public static C5409b m20865a(C12478a<Context> aVar, C12478a<MacroDroidRoomDatabase> aVar2, C12478a<C10312a> aVar3, C12478a<C10434a> aVar4, C12478a<C5527g> aVar5) {
        return new C5409b(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static TemplateUpdatesViewModel m20866c(C12478a<Context> aVar, C12478a<MacroDroidRoomDatabase> aVar2, C12478a<C10312a> aVar3, C12478a<C10434a> aVar4, C12478a<C5527g> aVar5) {
        return new TemplateUpdatesViewModel(aVar.get(), aVar2.get(), aVar3.get(), aVar4.get(), aVar5.get());
    }

    /* renamed from: b */
    public TemplateUpdatesViewModel get() {
        return m20866c(this.f13294a, this.f13295b, this.f13296c, this.f13297d, this.f13298e);
    }
}
