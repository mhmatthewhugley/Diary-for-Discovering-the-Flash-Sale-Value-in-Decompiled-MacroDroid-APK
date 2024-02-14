package com.arlosoft.macrodroid.advert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17530R$drawable;
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
import p139o1.C8005i;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: MacroDroidProAdvertActivity2.kt */
public final class MacroDroidProAdvertActivity2 extends BasePurchaseActivity {

    /* renamed from: J */
    public static final C3782a f9877J = new C3782a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C8005i f9878F;

    /* renamed from: G */
    private final String f9879G = "pro_advert_2";
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Intent f9880H;

    /* renamed from: I */
    public Map<Integer, View> f9881I = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity2$a */
    /* compiled from: MacroDroidProAdvertActivity2.kt */
    public static final class C3782a {
        private C3782a() {
        }

        public /* synthetic */ C3782a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo27280a(Activity activity, boolean z, Intent intent) {
            C13706o.m87929f(activity, "activity");
            Intent intent2 = new Intent(activity, MacroDroidProAdvertActivity2.class);
            intent2.putExtra("has_replaced_real_advert", z);
            if (intent != null) {
                intent2.putExtra("next_intent", intent);
            }
            activity.startActivity(intent2);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity2$b */
    /* compiled from: MacroDroidProAdvertActivity2.kt */
    static final class C3783b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MacroDroidProAdvertActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3783b(MacroDroidProAdvertActivity2 macroDroidProAdvertActivity2, C13635d<? super C3783b> dVar) {
            super(3, dVar);
            this.this$0 = macroDroidProAdvertActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3783b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity2$c */
    /* compiled from: MacroDroidProAdvertActivity2.kt */
    static final class C3784c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MacroDroidProAdvertActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3784c(MacroDroidProAdvertActivity2 macroDroidProAdvertActivity2, C13635d<? super C3784c> dVar) {
            super(3, dVar);
            this.this$0 = macroDroidProAdvertActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3784c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.finish();
                Intent o2 = this.this$0.f9880H;
                if (o2 != null) {
                    this.this$0.startActivity(o2);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.advert.MacroDroidProAdvertActivity2$d */
    /* compiled from: MacroDroidProAdvertActivity2.kt */
    public static final class C3785d extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ MacroDroidProAdvertActivity2 f9882a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3785d(long j, MacroDroidProAdvertActivity2 macroDroidProAdvertActivity2) {
            super(j, 1000);
            this.f9882a = macroDroidProAdvertActivity2;
        }

        public void onFinish() {
            try {
                C8005i n2 = this.f9882a.f9878F;
                C8005i iVar = null;
                if (n2 == null) {
                    C13706o.m87945v("binding");
                    n2 = null;
                }
                TextView textView = n2.f19286e;
                C13706o.m87928e(textView, "binding.countdownText");
                textView.setVisibility(8);
                C8005i n22 = this.f9882a.f9878F;
                if (n22 == null) {
                    C13706o.m87945v("binding");
                    n22 = null;
                }
                ImageView imageView = n22.f19285d;
                C13706o.m87928e(imageView, "binding.countDownBlockClose");
                imageView.setVisibility(8);
                C8005i n23 = this.f9882a.f9878F;
                if (n23 == null) {
                    C13706o.m87945v("binding");
                } else {
                    iVar = n23;
                }
                ImageView imageView2 = iVar.f19283b;
                C13706o.m87928e(imageView2, "binding.closeButton");
                imageView2.setVisibility(0);
            } catch (Exception unused) {
            }
        }

        public void onTick(long j) {
            try {
                C8005i n2 = this.f9882a.f9878F;
                if (n2 == null) {
                    C13706o.m87945v("binding");
                    n2 = null;
                }
                n2.f19286e.setText(String.valueOf((j / ((long) 1000)) + 1));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: q2 */
    private final void m14814q2() {
        String i = mo32353Z1().mo29982i();
        C8005i iVar = this.f9878F;
        if (iVar == null) {
            C13706o.m87945v("binding");
            iVar = null;
        }
        iVar.f19289h.setImageResource(C13706o.m87924a(i, "santa") ? C17530R$drawable.macrodroid_santa : C17530R$drawable.macrodroid_crown);
    }

    /* renamed from: V1 */
    public String mo27273V1() {
        return this.f9879G;
    }

    /* renamed from: g2 */
    public void mo27274g2() {
        C8151a.m33882x();
    }

    /* renamed from: k2 */
    public void mo27275k2(String str) {
        C13706o.m87929f(str, "price");
        C8005i iVar = this.f9878F;
        if (iVar == null) {
            C13706o.m87945v("binding");
            iVar = null;
        }
        Button button = iVar.f19296o;
        button.setText(getString(C17541R$string.upgrade_now) + " - " + str);
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8005i c = C8005i.m33340c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f9878F = c;
        C8005i iVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C4654a.m18109a(this);
        mo32354d2();
        this.f9880H = (Intent) getIntent().getParcelableExtra("next_intent");
        C8151a.f19786a.mo38167q(getIntent().getBooleanExtra("has_replaced_real_advert", false));
        C8005i iVar2 = this.f9878F;
        if (iVar2 == null) {
            C13706o.m87945v("binding");
            iVar2 = null;
        }
        Button button = iVar2.f19296o;
        C13706o.m87928e(button, "binding.upgradeNowButton");
        C4666m.m18147o(button, (C13640g) null, new C3783b(this, (C13635d<? super C3783b>) null), 1, (Object) null);
        C8005i iVar3 = this.f9878F;
        if (iVar3 == null) {
            C13706o.m87945v("binding");
            iVar3 = null;
        }
        ImageView imageView = iVar3.f19283b;
        C13706o.m87928e(imageView, "binding.closeButton");
        C4666m.m18147o(imageView, (C13640g) null, new C3784c(this, (C13635d<? super C3784c>) null), 1, (Object) null);
        C8005i iVar4 = this.f9878F;
        if (iVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            iVar = iVar4;
        }
        iVar.f19291j.setText(C4660g.m18128f("MACRODROID"));
        m14814q2();
        new C3785d(mo32353Z1().mo29981h() * ((long) 1000), this).start();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo32349U1();
    }
}
