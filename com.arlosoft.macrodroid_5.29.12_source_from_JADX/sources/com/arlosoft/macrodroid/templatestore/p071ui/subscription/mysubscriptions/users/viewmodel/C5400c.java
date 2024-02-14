package com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.users.viewmodel;

import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import p176v0.C10312a;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.viewmodel.c */
/* compiled from: MyUserSubscriptionsViewModel_Factory */
public final class C5400c implements C12478a {

    /* renamed from: a */
    private final C12478a<MacroDroidRoomDatabase> f13278a;

    /* renamed from: b */
    private final C12478a<C10312a> f13279b;

    public C5400c(C12478a<MacroDroidRoomDatabase> aVar, C12478a<C10312a> aVar2) {
        this.f13278a = aVar;
        this.f13279b = aVar2;
    }

    /* renamed from: a */
    public static C5400c m20846a(C12478a<MacroDroidRoomDatabase> aVar, C12478a<C10312a> aVar2) {
        return new C5400c(aVar, aVar2);
    }

    /* renamed from: c */
    public static MyUserSubscriptionsViewModel m20847c(C12478a<MacroDroidRoomDatabase> aVar, C12478a<C10312a> aVar2) {
        return new MyUserSubscriptionsViewModel(aVar.get(), aVar2.get());
    }

    /* renamed from: b */
    public MyUserSubscriptionsViewModel get() {
        return m20847c(this.f13278a, this.f13279b);
    }
}
