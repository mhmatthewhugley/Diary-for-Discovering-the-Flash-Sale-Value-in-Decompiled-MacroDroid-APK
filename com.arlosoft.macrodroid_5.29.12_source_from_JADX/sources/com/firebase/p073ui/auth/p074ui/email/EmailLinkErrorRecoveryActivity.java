package com.firebase.p073ui.auth.p074ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.email.C6865b;
import com.firebase.p073ui.auth.p074ui.email.C6872d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.EmailLinkErrorRecoveryActivity */
public class EmailLinkErrorRecoveryActivity extends AppCompatBase implements C6872d.C6874b, C6865b.C6866a {
    /* renamed from: U1 */
    public static Intent m25873U1(Context context, FlowParameters flowParameters, int i) {
        return HelperActivityBase.m25831K1(context, EmailLinkErrorRecoveryActivity.class, flowParameters).putExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", i);
    }

    /* renamed from: C1 */
    public void mo34198C1(IdpResponse idpResponse) {
        mo34177L1(-1, idpResponse.mo34101t());
    }

    /* renamed from: E */
    public void mo34183E() {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    /* renamed from: b1 */
    public void mo34184b1(@StringRes int i) {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    /* renamed from: g1 */
    public void mo34199g1() {
        mo34176T1(C6872d.m25946a0(), R$id.fragment_register_email, "CrossDeviceFragment", true, true);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_register_email);
        if (bundle == null) {
            if (getIntent().getIntExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", -1) == 116) {
                fragment = C6865b.m25924W();
            } else {
                fragment = C6872d.m25946a0();
            }
            mo34175S1(fragment, R$id.fragment_register_email, "EmailLinkPromptEmailFragment");
        }
    }
}
