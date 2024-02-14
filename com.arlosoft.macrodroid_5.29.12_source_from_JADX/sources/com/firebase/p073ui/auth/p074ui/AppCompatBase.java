package com.firebase.p073ui.auth.p074ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.firebase.p073ui.auth.R$anim;
import com.firebase.p073ui.auth.R$style;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.AppCompatBase */
public abstract class AppCompatBase extends HelperActivityBase {
    /* renamed from: R1 */
    private void m25828R1() {
        setRequestedOrientation(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public void mo34175S1(@NonNull Fragment fragment, int i, @NonNull String str) {
        mo34176T1(fragment, i, str, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public void mo34176T1(@NonNull Fragment fragment, int i, @NonNull String str, boolean z, boolean z2) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (z) {
            beginTransaction.setCustomAnimations(R$anim.fui_slide_in_right, R$anim.fui_slide_out_left);
        }
        beginTransaction.replace(i, fragment, str);
        if (z2) {
            beginTransaction.addToBackStack((String) null).commit();
        } else {
            beginTransaction.disallowAddToBackStack().commit();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R$style.FirebaseUI);
        setTheme(mo34180O1().f15987f);
        if (mo34180O1().f15982E) {
            m25828R1();
        }
    }
}
