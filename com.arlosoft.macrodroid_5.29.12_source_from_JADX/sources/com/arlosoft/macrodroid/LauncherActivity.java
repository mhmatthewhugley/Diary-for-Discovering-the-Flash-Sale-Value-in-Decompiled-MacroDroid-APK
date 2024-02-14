package com.arlosoft.macrodroid;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.google.android.gms.ads.MobileAds;

public class LauncherActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: s */
    C4083b f7037s;

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public boolean mo24631P1() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_launcher);
        if (!this.f7037s.mo28009e().mo28008a()) {
            MobileAds.m1728a(getApplicationContext());
        }
        System.currentTimeMillis();
        findViewById(C17532R$id.mImage).startAnimation(AnimationUtils.loadAnimation(this, 2130772006));
    }
}
