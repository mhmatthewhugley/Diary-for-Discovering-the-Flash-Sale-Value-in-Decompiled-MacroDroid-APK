package com.arlosoft.macrodroid;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwnerKt;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.upgrade.billing.BillingDataSource;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p370qa.C16270q;

/* compiled from: DonateActivity.kt */
public final class DonateActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    public static final C2282a f7004A = new C2282a((C13695i) null);

    /* renamed from: s */
    public BillingDataSource f7005s;

    /* renamed from: z */
    public Map<Integer, View> f7006z = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.DonateActivity$a */
    /* compiled from: DonateActivity.kt */
    public static final class C2282a {
        private C2282a() {
        }

        public /* synthetic */ C2282a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.DonateActivity$b */
    /* compiled from: DonateActivity.kt */
    static final class C2283b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ DonateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2283b(DonateActivity donateActivity, C13635d<? super C2283b> dVar) {
            super(3, dVar);
            this.this$0 = donateActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2283b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m9419W1("donation_low");
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.DonateActivity$c */
    /* compiled from: DonateActivity.kt */
    static final class C2284c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ DonateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2284c(DonateActivity donateActivity, C13635d<? super C2284c> dVar) {
            super(3, dVar);
            this.this$0 = donateActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2284c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m9419W1("donation_medium");
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.DonateActivity$d */
    /* compiled from: DonateActivity.kt */
    static final class C2285d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ DonateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2285d(DonateActivity donateActivity, C13635d<? super C2285d> dVar) {
            super(3, dVar);
            this.this$0 = donateActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2285d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m9419W1("donation_high");
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.DonateActivity$e */
    /* compiled from: DonateActivity.kt */
    static final class C2286e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ DonateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2286e(DonateActivity donateActivity, C13635d<? super C2286e> dVar) {
            super(2, dVar);
            this.this$0 = donateActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2286e(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2286e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                DonateActivity donateActivity = this.this$0;
                this.label = 1;
                if (donateActivity.mo24608V1(this) == c) {
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

    /* renamed from: com.arlosoft.macrodroid.DonateActivity$f */
    /* compiled from: DonateActivity.kt */
    static final class C2287f extends C13656d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DonateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2287f(DonateActivity donateActivity, C13635d<? super C2287f> dVar) {
            super(dVar);
            this.this$0 = donateActivity;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo24608V1(this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.DonateActivity$g */
    /* compiled from: DonateActivity.kt */
    static final class C2288g<T> implements C15288g {

        /* renamed from: a */
        final /* synthetic */ DonateActivity f7007a;

        C2288g(DonateActivity donateActivity) {
            this.f7007a = donateActivity;
        }

        /* renamed from: a */
        public final Object emit(List<String> list, C13635d<? super C13339u> dVar) {
            this.f7007a.m9418U1();
            return C13339u.f61331a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m9418U1() {
        C15626c.m94876a(getApplicationContext(), getString(C17541R$string.donation_received), 1).show();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final void m9419W1(String str) {
        mo24607T1().mo32362A(this, str, new String[0]);
    }

    /* renamed from: T1 */
    public final BillingDataSource mo24607T1() {
        BillingDataSource billingDataSource = this.f7005s;
        if (billingDataSource != null) {
            return billingDataSource;
        }
        C13706o.m87945v("billingDataSource");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: V1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo24608V1(kotlin.coroutines.C13635d<? super p297ja.C13339u> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.arlosoft.macrodroid.DonateActivity.C2287f
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.arlosoft.macrodroid.DonateActivity$f r0 = (com.arlosoft.macrodroid.DonateActivity.C2287f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.DonateActivity$f r0 = new com.arlosoft.macrodroid.DonateActivity$f
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002d:
            p297ja.C13332o.m85685b(r5)
            goto L_0x004a
        L_0x0031:
            p297ja.C13332o.m85685b(r5)
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r5 = r4.mo24607T1()
            kotlinx.coroutines.flow.z r5 = r5.mo32365t()
            com.arlosoft.macrodroid.DonateActivity$g r2 = new com.arlosoft.macrodroid.DonateActivity$g
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.DonateActivity.mo24608V1(kotlin.coroutines.d):java.lang.Object");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_donate);
        setSupportActionBar((Toolbar) findViewById(2131364057));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C17532R$id.donate_button_1);
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(C17532R$id.donate_button_2);
        FloatingActionButton floatingActionButton3 = (FloatingActionButton) findViewById(C17532R$id.donate_button_3);
        C13706o.m87928e(floatingActionButton, "donateButton1");
        C4666m.m18147o(floatingActionButton, (C13640g) null, new C2283b(this, (C13635d<? super C2283b>) null), 1, (Object) null);
        C13706o.m87928e(floatingActionButton2, "donateButton2");
        C4666m.m18147o(floatingActionButton2, (C13640g) null, new C2284c(this, (C13635d<? super C2284c>) null), 1, (Object) null);
        C13706o.m87928e(floatingActionButton3, "donateButton3");
        C4666m.m18147o(floatingActionButton3, (C13640g) null, new C2285d(this, (C13635d<? super C2285d>) null), 1, (Object) null);
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), (C13640g) null, (C15486m0) null, new C2286e(this, (C13635d<? super C2286e>) null), 3, (Object) null);
    }
}
