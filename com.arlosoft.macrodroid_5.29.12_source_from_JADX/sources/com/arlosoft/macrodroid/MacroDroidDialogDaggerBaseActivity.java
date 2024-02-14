package com.arlosoft.macrodroid;

import android.content.Context;
import android.os.Bundle;
import com.arlosoft.macrodroid.app.base.AppCompatDaggerBaseActivity;
import com.arlosoft.macrodroid.utils.C6361a;

public abstract class MacroDroidDialogDaggerBaseActivity extends AppCompatDaggerBaseActivity {

    /* renamed from: g */
    private boolean f7039g = false;

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public boolean mo24633L1() {
        return isFinishing() || isDestroyed();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C6361a.m24594a(context, this));
    }

    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f7039g = true;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C4699g0.m18220j();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        super.onResumeFragments();
        C4699g0.m18221k(this);
    }
}
