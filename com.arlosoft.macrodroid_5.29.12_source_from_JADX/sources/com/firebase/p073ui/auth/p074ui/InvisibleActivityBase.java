package com.firebase.p073ui.auth.p074ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import p329me.zhanghai.android.materialprogressbar.MaterialProgressBar;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.InvisibleActivityBase */
public class InvisibleActivityBase extends HelperActivityBase {

    /* renamed from: f */
    private Handler f16004f = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MaterialProgressBar f16005g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f16006o = 0;

    /* renamed from: com.firebase.ui.auth.ui.InvisibleActivityBase$a */
    class C6854a implements Runnable {
        C6854a() {
        }

        public void run() {
            long unused = InvisibleActivityBase.this.f16006o = 0;
            InvisibleActivityBase.this.f16005g.setVisibility(8);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.InvisibleActivityBase$b */
    class C6855b implements Runnable {
        C6855b() {
        }

        public void run() {
            InvisibleActivityBase.this.finish();
        }
    }

    /* renamed from: T1 */
    private void m25840T1(Runnable runnable) {
        this.f16004f.postDelayed(runnable, Math.max(750 - (System.currentTimeMillis() - this.f16006o), 0));
    }

    /* renamed from: E */
    public void mo34183E() {
        m25840T1(new C6854a());
    }

    /* renamed from: L1 */
    public void mo34177L1(int i, @Nullable Intent intent) {
        setResult(i, intent);
        m25840T1(new C6855b());
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        if (this.f16005g.getVisibility() == 0) {
            this.f16004f.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.f16006o = System.currentTimeMillis();
        this.f16005g.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_invisible);
        MaterialProgressBar materialProgressBar = new MaterialProgressBar(new ContextThemeWrapper(this, mo34180O1().f15987f));
        this.f16005g = materialProgressBar;
        materialProgressBar.setIndeterminate(true);
        this.f16005g.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ((FrameLayout) findViewById(R$id.invisible_frame)).addView(this.f16005g, layoutParams);
    }
}
