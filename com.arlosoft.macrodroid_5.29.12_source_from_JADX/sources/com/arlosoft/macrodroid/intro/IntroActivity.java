package com.arlosoft.macrodroid.intro;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.extensions.C4654a;
import com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13706o;
import p013b2.C1402c;
import p013b2.C1403d;
import p013b2.C1404e;
import p013b2.C2241a;
import p013b2.C2242b;
import p013b2.C2243f;
import p013b2.C2244g;
import p013b2.C2246h;
import p148q0.C8151a;
import p270ga.C12318a;
import p440y9.C16971a;

/* compiled from: IntroActivity.kt */
public final class IntroActivity extends MaterialIntroActivity {

    /* renamed from: M */
    public Map<Integer, View> f12150M = new LinkedHashMap();

    /* renamed from: l2 */
    private final void m18686l2() {
        ImageButton imageButton = (ImageButton) findViewById(2131362123);
        ((ImageButton) findViewById(2131362145)).setContentDescription(getString(C17541R$string.action_control_media_next));
        findViewById(2131362396).setBackgroundColor(-1);
        View findViewById = findViewById(2131362396);
        C13706o.m87928e(findViewById, "findViewById<View>(R.id.coordinator_layout_slide)");
        findViewById.setVisibility(8);
        mo74X1(new C2246h());
        mo74X1(new C2243f());
        mo74X1(new C2241a());
        mo74X1(new C2242b());
        String str = Build.MANUFACTURER;
        String str2 = "xiaomi";
        String str3 = null;
        if (C15176v.m93641v(str, str2, true)) {
            str3 = "Xiaomi";
        } else if (C15176v.m93641v(str, "huawei", true)) {
            str3 = "Huawei";
            str2 = "huawei";
        } else {
            str2 = null;
        }
        if (!(str3 == null || str2 == null)) {
            mo74X1(C2244g.f6881F.mo24469a(str3, str2));
        }
        C8151a.m33880v();
        mo76f2();
        this.f57p.setOnClickListener(new C1402c(this));
        if (!MacroDroidApplication.f9883I.mo27303b().mo27298w().mo28009e().mo28008a()) {
            try {
                MobileAds.m1728a(getApplicationContext());
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
        }
        MacroDroidApplication.f9883I.mo27303b().mo27292p().mo79694Z(5, TimeUnit.SECONDS).mo79690V(1).mo79688T(C12318a.m83030b()).mo79679I(C16971a.m100210a()).mo79686Q(new C1404e(this, System.currentTimeMillis()), new C1403d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m18687m2(IntroActivity introActivity, View view) {
        C13706o.m87929f(introActivity, "this$0");
        C8151a.m33879u();
        introActivity.mo75e2();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m18688n2(IntroActivity introActivity, long j, Boolean bool) {
        C13706o.m87929f(introActivity, "this$0");
        introActivity.m18690p2(System.currentTimeMillis() - j > 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m18689o2(IntroActivity introActivity, Throwable th) {
        C13706o.m87929f(introActivity, "this$0");
        introActivity.m18690p2(true);
    }

    /* renamed from: p2 */
    private final void m18690p2(boolean z) {
        if (C5163j2.m20303y0(this) != 0 || C5163j2.m20191k0(this)) {
            startActivity(new Intent(this, NewHomeScreenActivity.class));
            finish();
            if (z) {
                overridePendingTransition(17432576, 17432577);
            } else {
                overridePendingTransition(0, 0);
            }
        } else {
            View findViewById = findViewById(2131362396);
            C13706o.m87928e(findViewById, "findViewById<View>(R.id.coordinator_layout_slide)");
            findViewById.setVisibility(0);
        }
    }

    /* renamed from: e2 */
    public void mo75e2() {
        C5163j2.m20100Y3(this, true);
        startActivity(new Intent(this, NewHomeScreenActivity.class));
        C8151a.m33878t();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C4654a.m18109a(this);
        super.onCreate(bundle);
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            try {
                setRequestedOrientation(1);
            } catch (IllegalStateException unused) {
            }
        }
        m18686l2();
    }
}
