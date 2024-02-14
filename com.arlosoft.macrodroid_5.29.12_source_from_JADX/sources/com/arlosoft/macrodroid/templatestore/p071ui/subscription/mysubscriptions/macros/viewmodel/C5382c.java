package com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros.viewmodel;

import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import p176v0.C10312a;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.viewmodel.c */
/* compiled from: MyMacroSubscriptionsViewModel_Factory */
public final class C5382c implements C12478a {

    /* renamed from: a */
    private final C12478a<MacroDroidRoomDatabase> f13251a;

    /* renamed from: b */
    private final C12478a<C10312a> f13252b;

    public C5382c(C12478a<MacroDroidRoomDatabase> aVar, C12478a<C10312a> aVar2) {
        this.f13251a = aVar;
        this.f13252b = aVar2;
    }

    /* renamed from: a */
    public static C5382c m20804a(C12478a<MacroDroidRoomDatabase> aVar, C12478a<C10312a> aVar2) {
        return new C5382c(aVar, aVar2);
    }

    /* renamed from: c */
    public static MyMacroSubscriptionsViewModel m20805c(C12478a<MacroDroidRoomDatabase> aVar, C12478a<C10312a> aVar2) {
        return new MyMacroSubscriptionsViewModel(aVar.get(), aVar2.get());
    }

    /* renamed from: b */
    public MyMacroSubscriptionsViewModel get() {
        return m20805c(this.f13251a, this.f13252b);
    }
}
