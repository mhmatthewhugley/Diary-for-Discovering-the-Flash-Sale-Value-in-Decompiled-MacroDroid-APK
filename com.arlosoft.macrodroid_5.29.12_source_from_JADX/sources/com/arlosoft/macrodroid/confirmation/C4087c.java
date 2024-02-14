package com.arlosoft.macrodroid.confirmation;

import android.content.Context;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.upgrade.billing.BillingDataSource;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.confirmation.c */
/* compiled from: PremiumStatusHandler_Factory */
public final class C4087c implements C12478a {

    /* renamed from: a */
    private final C12478a<Context> f10671a;

    /* renamed from: b */
    private final C12478a<C5070a> f10672b;

    /* renamed from: c */
    private final C12478a<BillingDataSource> f10673c;

    public C4087c(C12478a<Context> aVar, C12478a<C5070a> aVar2, C12478a<BillingDataSource> aVar3) {
        this.f10671a = aVar;
        this.f10672b = aVar2;
        this.f10673c = aVar3;
    }

    /* renamed from: a */
    public static C4087c m16097a(C12478a<Context> aVar, C12478a<C5070a> aVar2, C12478a<BillingDataSource> aVar3) {
        return new C4087c(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C4083b m16098c(C12478a<Context> aVar, C12478a<C5070a> aVar2, C12478a<BillingDataSource> aVar3) {
        return new C4083b(aVar.get(), aVar2.get(), aVar3.get());
    }

    /* renamed from: b */
    public C4083b get() {
        return m16098c(this.f10671a, this.f10672b, this.f10673c);
    }
}
