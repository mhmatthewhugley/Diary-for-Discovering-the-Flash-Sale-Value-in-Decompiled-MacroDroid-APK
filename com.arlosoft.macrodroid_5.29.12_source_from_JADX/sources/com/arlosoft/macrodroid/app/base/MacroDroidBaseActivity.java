package com.arlosoft.macrodroid.app.base;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C4699g0;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6361a;
import p148q0.C8151a;

public abstract class MacroDroidBaseActivity extends AppCompatActivity {

    /* renamed from: d */
    private boolean f9912d = false;

    /* renamed from: f */
    private boolean f9913f = false;

    /* renamed from: g */
    private int f9914g = -1;

    /* renamed from: K1 */
    private void m14868K1() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            this.f9914g = 0;
        } else if (this.f9914g == 0) {
            this.f9914g = 1;
            m14869O1();
        }
    }

    /* renamed from: O1 */
    private synchronized void m14869O1() {
        Macro.setMacroDroidEnabledState(false);
        C4934n.m18998M().mo29694n0();
        Macro.setMacroDroidEnabledState(true);
        C4934n.m18998M().mo29694n0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L1 */
    public int mo27313L1() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public boolean mo27314M1() {
        return this.f9912d;
    }

    /* renamed from: N1 */
    public boolean mo27315N1() {
        return isFinishing() || isDestroyed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public boolean mo24631P1() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C6361a.m24594a(context, this));
    }

    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    public void onBackPressed() {
        if (!this.f9912d) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            try {
                setRequestedOrientation(1);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f9913f = true;
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (this.f9912d) {
                return super.onKeyDown(i, keyEvent);
            }
            if (i != 82 || !"LGE".equalsIgnoreCase(Build.BRAND)) {
                return super.onKeyDown(i, keyEvent);
            }
            return true;
        } catch (IllegalStateException unused) {
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (this.f9912d) {
                return super.onKeyUp(i, keyEvent);
            }
            if (i != 82 || !"LGE".equalsIgnoreCase(Build.BRAND)) {
                return super.onKeyUp(i, keyEvent);
            }
            openOptionsMenu();
            return true;
        } catch (IllegalStateException unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C4699g0.m18220j();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8151a.m33860a("Activity resumed: " + getClass().getSimpleName());
        this.f9912d = false;
        this.f9913f = false;
        m14868K1();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        super.onResumeFragments();
        if (mo24631P1()) {
            C4699g0.m18221k(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f9912d = true;
        super.onSaveInstanceState(bundle);
    }

    public void setContentView(int i) {
        super.setContentView(i);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
