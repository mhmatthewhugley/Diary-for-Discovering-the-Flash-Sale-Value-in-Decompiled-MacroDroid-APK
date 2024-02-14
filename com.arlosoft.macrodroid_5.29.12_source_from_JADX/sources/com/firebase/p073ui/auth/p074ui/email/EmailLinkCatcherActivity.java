package com.firebase.p073ui.auth.p074ui.email;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.InvisibleActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import p170t5.C10258b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity */
public class EmailLinkCatcherActivity extends InvisibleActivityBase {

    /* renamed from: p */
    private C10258b f16012p;

    /* renamed from: com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity$a */
    class C6857a extends C6905d<IdpResponse> {
        C6857a(HelperActivityBase helperActivityBase) {
            super(helperActivityBase);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof UserCancellationException) {
                EmailLinkCatcherActivity.this.mo34177L1(0, (Intent) null);
            } else if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                EmailLinkCatcherActivity.this.mo34177L1(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a()));
            } else if (exc instanceof FirebaseUiException) {
                int a = ((FirebaseUiException) exc).mo34082a();
                if (a == 8 || a == 7 || a == 11) {
                    EmailLinkCatcherActivity.this.m25866W1(a).show();
                } else if (a == 9 || a == 6) {
                    EmailLinkCatcherActivity.this.m25869Z1(115);
                } else if (a == 10) {
                    EmailLinkCatcherActivity.this.m25869Z1(116);
                }
            } else if (exc instanceof FirebaseAuthInvalidCredentialsException) {
                EmailLinkCatcherActivity.this.m25869Z1(115);
            } else {
                EmailLinkCatcherActivity.this.mo34177L1(0, IdpResponse.m25764k(exc));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            EmailLinkCatcherActivity.this.mo34177L1(-1, idpResponse.mo34101t());
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity$b */
    class C6858b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f16014a;

        C6858b(int i) {
            this.f16014a = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            EmailLinkCatcherActivity.this.mo34177L1(this.f16014a, (Intent) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public AlertDialog m25866W1(int i) {
        String str;
        String str2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (i == 11) {
            str2 = getString(R$string.fui_email_link_different_anonymous_user_header);
            str = getString(R$string.fui_email_link_different_anonymous_user_message);
        } else if (i == 7) {
            str2 = getString(R$string.fui_email_link_invalid_link_header);
            str = getString(R$string.fui_email_link_invalid_link_message);
        } else {
            str2 = getString(R$string.fui_email_link_wrong_device_header);
            str = getString(R$string.fui_email_link_wrong_device_message);
        }
        return builder.setTitle(str2).setMessage(str).setPositiveButton(R$string.fui_email_link_dismiss_button, new C6858b(i)).create();
    }

    /* renamed from: X1 */
    public static Intent m25867X1(Context context, FlowParameters flowParameters) {
        return HelperActivityBase.m25831K1(context, EmailLinkCatcherActivity.class, flowParameters);
    }

    /* renamed from: Y1 */
    private void m25868Y1() {
        C10258b bVar = (C10258b) new ViewModelProvider(this).get(C10258b.class);
        this.f16012p = bVar;
        bVar.mo34278g(mo34180O1());
        this.f16012p.mo34267i().observe(this, new C6857a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m25869Z1(int i) {
        if (i == 116 || i == 115) {
            startActivityForResult(EmailLinkErrorRecoveryActivity.m25873U1(getApplicationContext(), mo34180O1(), i), i);
            return;
        }
        throw new IllegalStateException("Invalid flow param. It must be either RequestCodes.EMAIL_LINK_CROSS_DEVICE_LINKING_FLOW or RequestCodes.EMAIL_LINK_PROMPT_FOR_EMAIL_FLOW");
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 115 || i == 116) {
            IdpResponse g = IdpResponse.m25763g(intent);
            if (i2 == -1) {
                mo34177L1(-1, g.mo34101t());
            } else {
                mo34177L1(0, (Intent) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m25868Y1();
        if (mo34180O1().f15991s != null) {
            this.f16012p.mo40876I();
        }
    }
}
