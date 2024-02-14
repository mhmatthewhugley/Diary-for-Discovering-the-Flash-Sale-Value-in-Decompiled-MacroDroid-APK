package com.arlosoft.macrodroid.advert;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4654a;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8007j;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: MacroDroidProAdvertActivity.kt */
public final class MacroDroidProAdvertActivity extends BasePurchaseActivity {

    /* renamed from: J */
    public static final C3778a f9871J = new C3778a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C8007j f9872F;

    /* renamed from: G */
    private final String f9873G = "pro_advert";
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Intent f9874H;

    /* renamed from: I */
    public Map<Integer, View> f9875I = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity$a */
    /* compiled from: MacroDroidProAdvertActivity.kt */
    public static final class C3778a {
        private C3778a() {
        }

        public /* synthetic */ C3778a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity$b */
    /* compiled from: MacroDroidProAdvertActivity.kt */
    static final class C3779b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MacroDroidProAdvertActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3779b(MacroDroidProAdvertActivity macroDroidProAdvertActivity, C13635d<? super C3779b> dVar) {
            super(3, dVar);
            this.this$0 = macroDroidProAdvertActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3779b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity$c */
    /* compiled from: MacroDroidProAdvertActivity.kt */
    static final class C3780c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MacroDroidProAdvertActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3780c(MacroDroidProAdvertActivity macroDroidProAdvertActivity, C13635d<? super C3780c> dVar) {
            super(3, dVar);
            this.this$0 = macroDroidProAdvertActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3780c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.finish();
                Intent o2 = this.this$0.f9874H;
                if (o2 != null) {
                    this.this$0.startActivity(o2);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity$d */
    /* compiled from: MacroDroidProAdvertActivity.kt */
    public static final class C3781d extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ MacroDroidProAdvertActivity f9876a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3781d(long j, MacroDroidProAdvertActivity macroDroidProAdvertActivity) {
            super(j, 1000);
            this.f9876a = macroDroidProAdvertActivity;
        }

        public void onFinish() {
            try {
                C8007j n2 = this.f9876a.f9872F;
                C8007j jVar = null;
                if (n2 == null) {
                    C13706o.m87945v("binding");
                    n2 = null;
                }
                TextView textView = n2.f19305e;
                C13706o.m87928e(textView, "binding.countdownText");
                textView.setVisibility(8);
                C8007j n22 = this.f9876a.f9872F;
                if (n22 == null) {
                    C13706o.m87945v("binding");
                    n22 = null;
                }
                ImageView imageView = n22.f19304d;
                C13706o.m87928e(imageView, "binding.countDownBlockClose");
                imageView.setVisibility(8);
                C8007j n23 = this.f9876a.f9872F;
                if (n23 == null) {
                    C13706o.m87945v("binding");
                } else {
                    jVar = n23;
                }
                ImageView imageView2 = jVar.f19302b;
                C13706o.m87928e(imageView2, "binding.closeButton");
                imageView2.setVisibility(0);
            } catch (Exception unused) {
            }
        }

        public void onTick(long j) {
            try {
                C8007j n2 = this.f9876a.f9872F;
                if (n2 == null) {
                    C13706o.m87945v("binding");
                    n2 = null;
                }
                n2.f19305e.setText(String.valueOf((j / ((long) 1000)) + 1));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: V1 */
    public String mo27273V1() {
        return this.f9873G;
    }

    /* renamed from: g2 */
    public void mo27274g2() {
        C8151a.m33882x();
    }

    /* renamed from: k2 */
    public void mo27275k2(String str) {
        C13706o.m87929f(str, "price");
        C8007j jVar = this.f9872F;
        if (jVar == null) {
            C13706o.m87945v("binding");
            jVar = null;
        }
        Button button = jVar.f19316p;
        button.setText(getString(C17541R$string.upgrade_now) + " - " + str);
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8007j c = C8007j.m33347c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f9872F = c;
        C8007j jVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C4654a.m18109a(this);
        mo32354d2();
        this.f9874H = (Intent) getIntent().getParcelableExtra("next_intent");
        C8151a.f19786a.mo38167q(getIntent().getBooleanExtra("has_replaced_real_advert", false));
        C8007j jVar2 = this.f9872F;
        if (jVar2 == null) {
            C13706o.m87945v("binding");
            jVar2 = null;
        }
        Button button = jVar2.f19316p;
        C13706o.m87928e(button, "binding.upgradeNowButton");
        C4666m.m18147o(button, (C13640g) null, new C3779b(this, (C13635d<? super C3779b>) null), 1, (Object) null);
        C8007j jVar3 = this.f9872F;
        if (jVar3 == null) {
            C13706o.m87945v("binding");
            jVar3 = null;
        }
        ImageView imageView = jVar3.f19302b;
        C13706o.m87928e(imageView, "binding.closeButton");
        C4666m.m18147o(imageView, (C13640g) null, new C3780c(this, (C13635d<? super C3780c>) null), 1, (Object) null);
        C8007j jVar4 = this.f9872F;
        if (jVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            jVar = jVar4;
        }
        jVar.f19310j.setText(C4660g.m18128f("MACRODROID"));
        new C3781d(mo32353Z1().mo29981h() * ((long) 1000), this).start();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo32349U1();
    }
}
