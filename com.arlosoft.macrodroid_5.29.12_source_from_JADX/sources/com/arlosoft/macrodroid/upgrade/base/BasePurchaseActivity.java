package com.arlosoft.macrodroid.upgrade.base;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.confirmation.C4080a;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.upgrade.billing.BillingDataSource;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15288g;
import p148q0.C8151a;
import p178v3.C10319a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;

/* compiled from: BasePurchaseActivity.kt */
public abstract class BasePurchaseActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    public C10319a f14849A;

    /* renamed from: B */
    public C4083b f14850B;

    /* renamed from: C */
    public C5070a f14851C;

    /* renamed from: D */
    private final boolean f14852D;

    /* renamed from: E */
    public Map<Integer, View> f14853E = new LinkedHashMap();

    /* renamed from: s */
    private boolean f14854s;

    /* renamed from: z */
    public BillingDataSource f14855z;

    /* renamed from: com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$a */
    /* compiled from: BasePurchaseActivity.kt */
    static final class C6301a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ BasePurchaseActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6301a(BasePurchaseActivity basePurchaseActivity, C13635d<? super C6301a> dVar) {
            super(2, dVar);
            this.this$0 = basePurchaseActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6301a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6301a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                BasePurchaseActivity basePurchaseActivity = this.this$0;
                this.label = 1;
                if (basePurchaseActivity.mo32356h2(this) == c) {
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

    /* renamed from: com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$b */
    /* compiled from: BasePurchaseActivity.kt */
    static final class C6302b extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BasePurchaseActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6302b(BasePurchaseActivity basePurchaseActivity, C13635d<? super C6302b> dVar) {
            super(dVar);
            this.this$0 = basePurchaseActivity;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo32356h2(this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$c */
    /* compiled from: BasePurchaseActivity.kt */
    static final class C6303c<T> implements C15288g {

        /* renamed from: a */
        final /* synthetic */ BasePurchaseActivity f14856a;

        C6303c(BasePurchaseActivity basePurchaseActivity) {
            this.f14856a = basePurchaseActivity;
        }

        /* renamed from: a */
        public final Object emit(String str, C13635d<? super C13339u> dVar) {
            this.f14856a.mo32325l2(str);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$d */
    /* compiled from: BasePurchaseActivity.kt */
    static final class C6304d<T> implements C15288g {

        /* renamed from: a */
        final /* synthetic */ BasePurchaseActivity f14857a;

        C6304d(BasePurchaseActivity basePurchaseActivity) {
            this.f14857a = basePurchaseActivity;
        }

        /* renamed from: a */
        public final Object emit(String str, C13635d<? super C13339u> dVar) {
            this.f14857a.m24467m2(str);
            return C13339u.f61331a;
        }
    }

    /* renamed from: T1 */
    private final void m24463T1() {
        C15626c.m94876a(getApplicationContext(), getString(C17541R$string.pro_upgrade_applied), 1).show();
        C8151a.m33877s((int) ((System.currentTimeMillis() - C5163j2.m20247r0(this)) / ((long) 86400000)), C4934n.m18998M().mo29710z().size(), mo27273V1(), mo32355f2());
        mo27274g2();
        finish();
    }

    /* renamed from: a2 */
    private final String m24464a2() {
        return mo32355f2() ? mo32353Z1().mo29988o() : mo32353Z1().mo29989p();
    }

    /* renamed from: b2 */
    private final String m24465b2() {
        return mo32353Z1().mo29989p();
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public static final void m24466e2(BasePurchaseActivity basePurchaseActivity, C4080a aVar) {
        C13706o.m87929f(basePurchaseActivity, "this$0");
        if (aVar.mo28008a()) {
            basePurchaseActivity.m24463T1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m24467m2(String str) {
        try {
            C13696i0 i0Var = C13696i0.f61931a;
            String string = getString(C17541R$string.only_this_price);
            C13706o.m87928e(string, "getString(R.string.only_this_price)");
            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            mo27275k2(format);
        } catch (Exception unused) {
            mo27275k2(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public final void mo32349U1() {
    }

    /* renamed from: V1 */
    public abstract String mo27273V1();

    /* renamed from: W1 */
    public final BillingDataSource mo32350W1() {
        BillingDataSource billingDataSource = this.f14855z;
        if (billingDataSource != null) {
            return billingDataSource;
        }
        C13706o.m87945v("billingDataSource");
        return null;
    }

    /* renamed from: X1 */
    public final C10319a mo32351X1() {
        C10319a aVar = this.f14849A;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("flashSaleManager");
        return null;
    }

    /* renamed from: Y1 */
    public final C4083b mo32352Y1() {
        C4083b bVar = this.f14850B;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: Z1 */
    public final C5070a mo32353Z1() {
        C5070a aVar = this.f14851C;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("remoteConfig");
        return null;
    }

    /* renamed from: c2 */
    public boolean mo32324c2() {
        return this.f14852D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d2 */
    public final void mo32354d2() {
        mo32352Y1().mo28010f().observe(this, new C6305a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public final boolean mo32355f2() {
        return mo32324c2() && mo32351X1().mo40945e() && !this.f14854s;
    }

    /* renamed from: g2 */
    public void mo27274g2() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: h2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32356h2(kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity.C6302b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$b r0 = (com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity.C6302b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$b r0 = new com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p297ja.C13332o.m85685b(r7)
            goto L_0x0087
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity r2 = (com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity) r2
            p297ja.C13332o.m85685b(r7)
            goto L_0x0066
        L_0x003c:
            p297ja.C13332o.m85685b(r7)
            boolean r7 = r6.mo32355f2()
            if (r7 == 0) goto L_0x0065
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r7 = r6.mo32350W1()
            java.lang.String r2 = r6.m24465b2()
            kotlinx.coroutines.flow.f r7 = r7.mo32366v(r2)
            kotlinx.coroutines.flow.f r7 = kotlinx.coroutines.flow.C15290h.m94111B(r7, r4)
            com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$c r2 = new com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$c
            r2.<init>(r6)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.collect(r2, r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r2 = r6
        L_0x0066:
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r7 = r2.mo32350W1()
            java.lang.String r5 = r2.m24464a2()
            kotlinx.coroutines.flow.f r7 = r7.mo32366v(r5)
            kotlinx.coroutines.flow.f r7 = kotlinx.coroutines.flow.C15290h.m94111B(r7, r4)
            com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$d r4 = new com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity$d
            r4.<init>(r2)
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.collect(r4, r0)
            if (r7 != r1) goto L_0x0087
            return r1
        L_0x0087:
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity.mo32356h2(kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public final void mo32357i2() {
        mo32350W1().mo32362A(this, m24464a2(), new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public final void mo32358j2(boolean z) {
        this.f14854s = z;
    }

    /* renamed from: k2 */
    public abstract void mo27275k2(String str);

    /* renamed from: l2 */
    public void mo32325l2(String str) {
        C13706o.m87929f(str, "priceText");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), (C13640g) null, (C15486m0) null, new C6301a(this, (C13635d<? super C6301a>) null), 3, (Object) null);
    }
}
