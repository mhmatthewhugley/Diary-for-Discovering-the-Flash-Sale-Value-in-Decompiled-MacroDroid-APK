package com.arlosoft.macrodroid.upgrade;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17523R$anim;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.upgrade.base.BasePurchaseActivity;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8017o;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: UpgradeActivity2.kt */
public final class UpgradeActivity2 extends BasePurchaseActivity {

    /* renamed from: L */
    public static final C6289a f14829L = new C6289a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C8017o f14830F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f14831G;

    /* renamed from: H */
    private final String f14832H = "upgrade_screen";

    /* renamed from: I */
    private final boolean f14833I = true;

    /* renamed from: J */
    private CountDownTimer f14834J;

    /* renamed from: K */
    public Map<Integer, View> f14835K = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeActivity2$a */
    /* compiled from: UpgradeActivity2.kt */
    public static final class C6289a {
        private C6289a() {
        }

        public /* synthetic */ C6289a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo32326a(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivity(new Intent(activity, UpgradeActivity2.class));
            activity.overridePendingTransition(C17523R$anim.up_from_bottom_slow, C17523R$anim.no_change);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeActivity2$b */
    /* compiled from: UpgradeActivity2.kt */
    public static final class C6290b extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ UpgradeActivity2 f14836a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6290b(long j, UpgradeActivity2 upgradeActivity2) {
            super(j, 1000);
            this.f14836a = upgradeActivity2;
        }

        public void onFinish() {
            this.f14836a.mo32358j2(true);
            C8017o n2 = this.f14836a.f14830F;
            C8017o oVar = null;
            if (n2 == null) {
                C13706o.m87945v("binding");
                n2 = null;
            }
            LinearLayout linearLayout = n2.f19373b;
            C13706o.m87928e(linearLayout, "binding.flashSaleContainer");
            linearLayout.setVisibility(8);
            UpgradeActivity2 upgradeActivity2 = this.f14836a;
            C13696i0 i0Var = C13696i0.f61931a;
            String string = upgradeActivity2.getString(C17541R$string.only_this_price);
            C13706o.m87928e(string, "getString(R.string.only_this_price)");
            Object[] objArr = new Object[1];
            String o2 = this.f14836a.f14831G;
            if (o2 == null) {
                o2 = "";
            }
            objArr[0] = o2;
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            C13706o.m87928e(format, "format(format, *args)");
            upgradeActivity2.mo27275k2(format);
            C8017o n22 = this.f14836a.f14830F;
            if (n22 == null) {
                C13706o.m87945v("binding");
            } else {
                oVar = n22;
            }
            TextView textView = oVar.f19383l;
            C13706o.m87928e(textView, "binding.wasPrice");
            textView.setVisibility(8);
        }

        public void onTick(long j) {
            long j2 = j / ((long) 1000);
            C8017o n2 = this.f14836a.f14830F;
            if (n2 == null) {
                C13706o.m87945v("binding");
                n2 = null;
            }
            TextView textView = n2.f19374c;
            StringBuilder sb = new StringBuilder();
            sb.append(C15177w.m93692k0(String.valueOf(j2 / ((long) 3600)), 2, '0'));
            sb.append(':');
            long j3 = (long) 60;
            sb.append(C15177w.m93692k0(String.valueOf((j2 / j3) % j3), 2, '0'));
            sb.append(':');
            sb.append(C15177w.m93692k0(String.valueOf(j2 % j3), 2, '0'));
            textView.setText(sb.toString());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeActivity2$c */
    /* compiled from: UpgradeActivity2.kt */
    static final class C6291c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UpgradeActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6291c(UpgradeActivity2 upgradeActivity2, C13635d<? super C6291c> dVar) {
            super(3, dVar);
            this.this$0 = upgradeActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6291c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeActivity2$d */
    /* compiled from: UpgradeActivity2.kt */
    static final class C6292d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UpgradeActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6292d(UpgradeActivity2 upgradeActivity2, C13635d<? super C6292d> dVar) {
            super(3, dVar);
            this.this$0 = upgradeActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6292d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeActivity2$e */
    /* compiled from: UpgradeActivity2.kt */
    static final class C6293e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UpgradeActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6293e(UpgradeActivity2 upgradeActivity2, C13635d<? super C6293e> dVar) {
            super(3, dVar);
            this.this$0 = upgradeActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6293e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m24414u2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: s2 */
    private final void m24412s2() {
        boolean f2 = mo32355f2();
        C8017o oVar = this.f14830F;
        if (oVar == null) {
            C13706o.m87945v("binding");
            oVar = null;
        }
        LinearLayout linearLayout = oVar.f19373b;
        C13706o.m87928e(linearLayout, "binding.flashSaleContainer");
        linearLayout.setVisibility(f2 ? 0 : 8);
        if (f2) {
            long d = mo32351X1().mo40944d() - System.currentTimeMillis();
            CountDownTimer countDownTimer = this.f14834J;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f14834J = new C6290b(d, this).start();
        }
    }

    /* renamed from: t2 */
    private final void m24413t2() {
        C8017o oVar = this.f14830F;
        C8017o oVar2 = null;
        if (oVar == null) {
            C13706o.m87945v("binding");
            oVar = null;
        }
        oVar.f19380i.setAdapter(new C6338h(C6332c.m24530a()));
        Drawable drawable = ContextCompat.getDrawable(this, C17530R$drawable.upgrade_item_divider);
        C13706o.m87926c(drawable);
        C6299a aVar = new C6299a(drawable);
        C8017o oVar3 = this.f14830F;
        if (oVar3 == null) {
            C13706o.m87945v("binding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.f19380i.addItemDecoration(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m24414u2() {
        startActivityForResult(new Intent(this, UpgradeSupportActivity2.class), 0);
    }

    /* renamed from: V1 */
    public String mo27273V1() {
        return this.f14832H;
    }

    /* renamed from: c2 */
    public boolean mo32324c2() {
        return this.f14833I;
    }

    /* renamed from: k2 */
    public void mo27275k2(String str) {
        C13706o.m87929f(str, "price");
        C8017o oVar = this.f14830F;
        C8017o oVar2 = null;
        if (oVar == null) {
            C13706o.m87945v("binding");
            oVar = null;
        }
        oVar.f19378g.setText(str);
        C8017o oVar3 = this.f14830F;
        if (oVar3 == null) {
            C13706o.m87945v("binding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.f19379h.setDisplayedChild(1);
    }

    /* renamed from: l2 */
    public void mo32325l2(String str) {
        C13706o.m87929f(str, "price");
        this.f14831G = str;
        C8017o oVar = this.f14830F;
        C8017o oVar2 = null;
        if (oVar == null) {
            C13706o.m87945v("binding");
            oVar = null;
        }
        TextView textView = oVar.f19383l;
        C13696i0 i0Var = C13696i0.f61931a;
        String string = getString(C17541R$string.flash_sale_was_price);
        C13706o.m87928e(string, "getString(R.string.flash_sale_was_price)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        textView.setText(format);
        C8017o oVar3 = this.f14830F;
        if (oVar3 == null) {
            C13706o.m87945v("binding");
            oVar3 = null;
        }
        TextView textView2 = oVar3.f19383l;
        C13706o.m87928e(textView2, "binding.wasPrice");
        textView2.setVisibility(0);
        C8017o oVar4 = this.f14830F;
        if (oVar4 == null) {
            C13706o.m87945v("binding");
            oVar4 = null;
        }
        TextView textView3 = oVar4.f19383l;
        C8017o oVar5 = this.f14830F;
        if (oVar5 == null) {
            C13706o.m87945v("binding");
        } else {
            oVar2 = oVar5;
        }
        textView3.setPaintFlags(oVar2.f19383l.getPaintFlags() | 16);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            finish();
        }
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, C17523R$anim.out_to_bottom);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8017o c = C8017o.m33382c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f14830F = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C8017o oVar = this.f14830F;
        if (oVar == null) {
            C13706o.m87945v("binding");
            oVar = null;
        }
        setSupportActionBar(oVar.f19381j);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayHomeAsUpEnabled(true);
        }
        m24413t2();
        mo32354d2();
        C8017o oVar2 = this.f14830F;
        if (oVar2 == null) {
            C13706o.m87945v("binding");
            oVar2 = null;
        }
        Button button = oVar2.f19382k;
        C13706o.m87928e(button, "binding.upgradeNowButton");
        C4666m.m18147o(button, (C13640g) null, new C6291c(this, (C13635d<? super C6291c>) null), 1, (Object) null);
        C8017o oVar3 = this.f14830F;
        if (oVar3 == null) {
            C13706o.m87945v("binding");
            oVar3 = null;
        }
        FrameLayout frameLayout = oVar3.f19377f;
        C13706o.m87928e(frameLayout, "binding.priceContainer");
        C4666m.m18147o(frameLayout, (C13640g) null, new C6292d(this, (C13635d<? super C6292d>) null), 1, (Object) null);
        C8017o oVar4 = this.f14830F;
        if (oVar4 == null) {
            C13706o.m87945v("binding");
            oVar4 = null;
        }
        TextView textView = oVar4.f19376e;
        C13706o.m87928e(textView, "binding.helpButton");
        C4666m.m18147o(textView, (C13640g) null, new C6293e(this, (C13635d<? super C6293e>) null), 1, (Object) null);
        mo32351X1().mo40946f();
        mo32351X1().mo40942b(this);
        m24412s2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
