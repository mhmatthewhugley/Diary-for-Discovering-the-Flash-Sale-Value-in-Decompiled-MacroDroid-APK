package com.arlosoft.macrodroid.confirmation.validation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity;
import com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity;
import com.arlosoft.macrodroid.utils.C6417p1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8019p;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;
import p474sf.C17435a;

/* compiled from: ConfirmActionActivity.kt */
public final class ConfirmActionActivity extends BasePurchaseActivity {

    /* renamed from: J */
    public static final C4088a f10674J = new C4088a((C13695i) null);

    /* renamed from: F */
    private final String f10675F = "validate_purchase";

    /* renamed from: G */
    public C4101e f10676G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C8019p f10677H;

    /* renamed from: I */
    public Map<Integer, View> f10678I = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$a */
    /* compiled from: ConfirmActionActivity.kt */
    public static final class C4088a {
        private C4088a() {
        }

        public /* synthetic */ C4088a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo28017a(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivity(new Intent(activity, ConfirmActionActivity.class));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$b */
    /* compiled from: ConfirmActionActivity.kt */
    static final class C4089b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ConfirmActionActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4089b(ConfirmActionActivity confirmActionActivity, C13635d<? super C4089b> dVar) {
            super(3, dVar);
            this.this$0 = confirmActionActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4089b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo32357i2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$c */
    /* compiled from: ConfirmActionActivity.kt */
    static final class C4090c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ConfirmActionActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$c$a */
        /* compiled from: AlertDialog.kt */
        public static final class C4091a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f10679a;

            public C4091a(AlertDialog alertDialog) {
                this.f10679a = alertDialog;
            }

            public final void onShow(DialogInterface dialogInterface) {
            }
        }

        /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$c$b */
        /* compiled from: AlertDialog.kt */
        public static final class C4092b implements DialogInterface.OnClickListener {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C13706o.m87929f(dialogInterface, "dialog");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$c$c */
        /* compiled from: AlertDialog.kt */
        public static final class C4093c implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ConfirmActionActivity f10680a;

            public C4093c(ConfirmActionActivity confirmActionActivity) {
                this.f10680a = confirmActionActivity;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C13706o.m87929f(dialogInterface, "dialog");
                this.f10680a.mo28015r2().mo28028l();
                this.f10680a.finish();
                this.f10680a.startActivity(new Intent(this.f10680a, NewHomeScreenActivity.class));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4090c(ConfirmActionActivity confirmActionActivity, C13635d<? super C4090c> dVar) {
            super(3, dVar);
            this.this$0 = confirmActionActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4090c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                ConfirmActionActivity confirmActionActivity = this.this$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(confirmActionActivity);
                C17435a.m101225c(builder, C17541R$string.revert_to_free_version);
                C17435a.m101223a(builder, C17541R$string.revert_to_free_version_warning);
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4093c(confirmActionActivity));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4092b());
                AlertDialog create = builder.create();
                C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
                create.setOnShowListener(new C4091a(create));
                create.show();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$d */
    /* compiled from: ConfirmActionActivity.kt */
    static final class C4094d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ConfirmActionActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4094d(ConfirmActionActivity confirmActionActivity, C13635d<? super C4094d> dVar) {
            super(3, dVar);
            this.this$0 = confirmActionActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4094d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C6417p1.m24714a(this.this$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity$e */
    /* compiled from: ConfirmActionActivity.kt */
    static final class C4095e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ConfirmActionActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4095e(ConfirmActionActivity confirmActionActivity, C13635d<? super C4095e> dVar) {
            super(3, dVar);
            this.this$0 = confirmActionActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4095e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                ConfirmActionActivity confirmActionActivity = this.this$0;
                C8019p p2 = confirmActionActivity.f10677H;
                C8019p pVar = null;
                if (p2 == null) {
                    C13706o.m87945v("binding");
                    p2 = null;
                }
                String obj2 = p2.f19390b.getText().toString();
                C8019p p22 = this.this$0.f10677H;
                if (p22 == null) {
                    C13706o.m87945v("binding");
                } else {
                    pVar = p22;
                }
                confirmActionActivity.mo28016u2(obj2, pVar.f19393e.getText().toString());
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m16104s2(ConfirmActionActivity confirmActionActivity, Void voidR) {
        C13706o.m87929f(confirmActionActivity, "this$0");
        C15626c.makeText(confirmActionActivity, C17541R$string.thanks_for_purchasing, 1).show();
        confirmActionActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m16105t2(ConfirmActionActivity confirmActionActivity, Boolean bool) {
        C13706o.m87929f(confirmActionActivity, "this$0");
        C8019p pVar = confirmActionActivity.f10677H;
        if (pVar == null) {
            C13706o.m87945v("binding");
            pVar = null;
        }
        FrameLayout frameLayout = pVar.f19391c;
        C13706o.m87928e(frameLayout, "binding.loadingBlocker");
        C13706o.m87928e(bool, "it");
        frameLayout.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* renamed from: V1 */
    public String mo27273V1() {
        return this.f10675F;
    }

    /* renamed from: k2 */
    public void mo27275k2(String str) {
        C13706o.m87929f(str, "priceText");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8019p c = C8019p.m33389c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f10677H = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C8151a.m33859H();
        C8019p pVar = this.f10677H;
        if (pVar == null) {
            C13706o.m87945v("binding");
            pVar = null;
        }
        Button button = pVar.f19395g;
        C13706o.m87928e(button, "binding.upgradeNowButton");
        C4666m.m18147o(button, (C13640g) null, new C4089b(this, (C13635d<? super C4089b>) null), 1, (Object) null);
        C8019p pVar2 = this.f10677H;
        if (pVar2 == null) {
            C13706o.m87945v("binding");
            pVar2 = null;
        }
        Button button2 = pVar2.f19392d;
        C13706o.m87928e(button2, "binding.revertToFreeButton");
        C4666m.m18147o(button2, (C13640g) null, new C4090c(this, (C13635d<? super C4090c>) null), 1, (Object) null);
        C8019p pVar3 = this.f10677H;
        if (pVar3 == null) {
            C13706o.m87945v("binding");
            pVar3 = null;
        }
        Button button3 = pVar3.f19394f;
        C13706o.m87928e(button3, "binding.uninstallButton");
        C4666m.m18147o(button3, (C13640g) null, new C4094d(this, (C13635d<? super C4094d>) null), 1, (Object) null);
        C8019p pVar4 = this.f10677H;
        if (pVar4 == null) {
            C13706o.m87945v("binding");
            pVar4 = null;
        }
        Button button4 = pVar4.f19396h;
        C13706o.m87928e(button4, "binding.upgradeWithSerialButton");
        C4666m.m18147o(button4, (C13640g) null, new C4095e(this, (C13635d<? super C4095e>) null), 1, (Object) null);
        mo28015r2().mo28027k().observe(this, new C4097b(this));
        mo28015r2().mo28026j().observe(this, new C4096a(this));
    }

    /* renamed from: r2 */
    public final C4101e mo28015r2() {
        C4101e eVar = this.f10676G;
        if (eVar != null) {
            return eVar;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    /* renamed from: u2 */
    public final void mo28016u2(String str, String str2) {
        C13706o.m87929f(str, NotificationCompat.CATEGORY_EMAIL);
        C13706o.m87929f(str2, "serial");
        boolean z = false;
        if (str.length() == 0) {
            C15626c.makeText(this, C17541R$string.action_share_location_enter_email, 1).show();
            return;
        }
        if (str2.length() == 0) {
            z = true;
        }
        if (z) {
            C15626c.makeText(this, C17541R$string.invalid_serial, 1).show();
        } else {
            mo28015r2().mo28029m(this, str, str2);
        }
    }
}
