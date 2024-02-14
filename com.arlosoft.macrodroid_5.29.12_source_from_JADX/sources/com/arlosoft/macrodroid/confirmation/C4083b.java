package com.arlosoft.macrodroid.confirmation;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.arlosoft.macrodroid.confirmation.C4080a;
import com.arlosoft.macrodroid.macro.C4917c;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.upgrade.billing.BillingDataSource;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16273t;

/* renamed from: com.arlosoft.macrodroid.confirmation.b */
/* compiled from: PremiumStatusHandler.kt */
public final class C4083b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f10665a;

    /* renamed from: b */
    private final C5070a f10666b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BillingDataSource f10667c;

    /* renamed from: d */
    private final C4080a.C4082b f10668d = C4080a.C4082b.f10664a;

    /* renamed from: e */
    private final LiveData<C4080a> f10669e;

    /* renamed from: com.arlosoft.macrodroid.confirmation.b$a */
    /* compiled from: PremiumStatusHandler.kt */
    static final class C4084a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C4083b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4084a(C4083b bVar, C13635d<? super C4084a> dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4084a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4084a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                BillingDataSource a = this.this$0.f10667c;
                this.label = 1;
                if (a.mo32363E(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.confirmation.b$b */
    /* compiled from: PremiumStatusHandler.kt */
    static final class C4085b extends C13665l implements C16273t<Boolean, Boolean, Boolean, Boolean, Boolean, C13635d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;
        final /* synthetic */ C4083b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4085b(C4083b bVar, C13635d<? super C4085b> dVar) {
            super(6, dVar);
            this.this$0 = bVar;
        }

        /* renamed from: h */
        public final Object mo28012e(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, C13635d<? super Boolean> dVar) {
            C4085b bVar = new C4085b(this.this$0, dVar);
            bVar.L$0 = bool;
            bVar.L$1 = bool2;
            bVar.L$2 = bool3;
            bVar.L$3 = bool4;
            bVar.L$4 = bool5;
            return bVar.invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Boolean bool = (Boolean) this.L$0;
                Boolean bool2 = (Boolean) this.L$1;
                Boolean bool3 = (Boolean) this.L$2;
                Boolean bool4 = (Boolean) this.L$3;
                Boolean bool5 = (Boolean) this.L$4;
                boolean z = true;
                if (bool != null && bool.booleanValue()) {
                    C4083b bVar = this.this$0;
                    bVar.m16092h(bVar.f10665a, true);
                } else if (bool2 != null && bool2.booleanValue()) {
                    C4083b bVar2 = this.this$0;
                    bVar2.m16092h(bVar2.f10665a, true);
                } else if (bool3 != null && bool3.booleanValue()) {
                    C4083b bVar3 = this.this$0;
                    bVar3.m16092h(bVar3.f10665a, true);
                } else if (bool4 != null && bool4.booleanValue()) {
                    C4083b bVar4 = this.this$0;
                    bVar4.m16092h(bVar4.f10665a, true);
                } else if (bool5 != null && bool5.booleanValue()) {
                    C4083b bVar5 = this.this$0;
                    bVar5.m16092h(bVar5.f10665a, true);
                } else if (C5163j2.m20233p2(this.this$0.f10665a) != null) {
                    C4083b bVar6 = this.this$0;
                    bVar6.m16092h(bVar6.f10665a, true);
                } else if (bool == null || bool2 == null || bool3 == null) {
                    z = C5163j2.m20208m1(this.this$0.f10665a);
                } else {
                    if (!bool.booleanValue() && !bool2.booleanValue() && !bool3.booleanValue()) {
                        z = false;
                    }
                    C4083b bVar7 = this.this$0;
                    bVar7.m16092h(bVar7.f10665a, z);
                }
                return C13654b.m87833a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.confirmation.b$c */
    /* compiled from: Transformations.kt */
    public static final class C4086c<I, O> implements Function {

        /* renamed from: a */
        final /* synthetic */ C4083b f10670a;

        public C4086c(C4083b bVar) {
            this.f10670a = bVar;
        }

        public final C4080a apply(Boolean bool) {
            return this.f10670a.m16091g(bool.booleanValue());
        }
    }

    public C4083b(Context context, C5070a aVar, BillingDataSource billingDataSource) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "remoteConfig");
        C13706o.m87929f(billingDataSource, "billingDataSource");
        this.f10665a = context;
        this.f10666b = aVar;
        this.f10667c = billingDataSource;
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C4084a(this, (C13635d<? super C4084a>) null), 2, (Object) null);
        LiveData<C4080a> map = Transformations.map(FlowLiveDataConversions.asLiveData$default((C15285f) C15290h.m94125k(C15290h.m94122h(billingDataSource.mo32367y("com.arlosoft.macrodroid.pro"), billingDataSource.mo32367y("com.arlosoft.macrodroid.pro.h"), billingDataSource.mo32367y("com.arlosoft.macrodroid.pro.h2"), billingDataSource.mo32367y("com.arlosoft.macrodroid.pro.flash_sale"), billingDataSource.mo32367y("com.arlosoft.macrodroid.pro.flash_sale2"), new C4085b(this, (C13635d<? super C4085b>) null))), (C13640g) null, 0, 3, (Object) null), new C4086c(this));
        C13706o.m87928e(map, "crossinline transform: (…p(this) { transform(it) }");
        this.f10669e = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final C4080a m16091g(boolean z) {
        String name = this.f10665a.getApplicationContext().getClass().getName();
        C13706o.m87928e(name, "context.applicationContext.javaClass.name");
        if (!C15176v.m93640u(name, "MacroDroidApplication", false, 2, (Object) null)) {
            return C4080a.C4081a.f10663a;
        }
        if (C4917c.m18992a(this.f10665a)) {
            return C4080a.C4081a.f10663a;
        }
        if (C5163j2.m20224o1(this.f10665a)) {
            return C4080a.C4081a.f10663a;
        }
        if (C5163j2.m20233p2(this.f10665a) != null) {
            return C4080a.C4082b.f10664a;
        }
        if (C5163j2.m20312z1(this.f10665a)) {
            return C4080a.C4082b.f10664a;
        }
        if (z) {
            return C4080a.C4082b.f10664a;
        }
        return C4080a.C4081a.f10663a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m16092h(Context context, boolean z) {
        C5163j2.m20108Z4(context, z);
        if (!this.f10666b.mo29983j()) {
            C5163j2.m20220n5(context, z);
        } else if (z) {
            C5163j2.m20220n5(context, true);
        }
    }

    /* renamed from: e */
    public final C4080a mo28009e() {
        if (C5163j2.m20312z1(this.f10665a)) {
            return C4080a.C4082b.f10664a;
        }
        C4080a value = this.f10669e.getValue();
        if (value == null) {
            value = C5163j2.m20208m1(this.f10665a) ? C4080a.C4082b.f10664a : C4080a.C4081a.f10663a;
        }
        C13706o.m87928e(value, "{\n                    if…us.Free\n                }");
        return value;
    }

    /* renamed from: f */
    public final LiveData<C4080a> mo28010f() {
        return this.f10669e;
    }
}
