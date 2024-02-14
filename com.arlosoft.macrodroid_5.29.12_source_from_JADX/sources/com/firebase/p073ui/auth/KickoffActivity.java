package com.firebase.p073ui.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.InvisibleActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p133m5.C7953i;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.KickoffActivity */
public class KickoffActivity extends InvisibleActivityBase {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C7953i f15949p;

    /* renamed from: com.firebase.ui.auth.KickoffActivity$a */
    class C6846a extends C6905d<IdpResponse> {
        C6846a(HelperActivityBase helperActivityBase) {
            super(helperActivityBase);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof UserCancellationException) {
                KickoffActivity.this.mo34177L1(0, (Intent) null);
            } else if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                KickoffActivity.this.mo34177L1(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a()));
            } else {
                KickoffActivity.this.mo34177L1(0, IdpResponse.m25764k(exc));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            KickoffActivity.this.mo34177L1(-1, idpResponse.mo34101t());
        }
    }

    /* renamed from: com.firebase.ui.auth.KickoffActivity$b */
    class C6847b implements OnFailureListener {
        C6847b() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            KickoffActivity.this.mo34177L1(0, IdpResponse.m25764k(new FirebaseUiException(2, (Throwable) exc)));
        }
    }

    /* renamed from: com.firebase.ui.auth.KickoffActivity$c */
    class C6848c implements OnSuccessListener<Void> {

        /* renamed from: a */
        final /* synthetic */ Bundle f15952a;

        C6848c(Bundle bundle) {
            this.f15952a = bundle;
        }

        /* renamed from: a */
        public void mo22751b(Void voidR) {
            if (this.f15952a == null) {
                KickoffActivity.this.f15949p.mo37841B();
            }
        }
    }

    /* renamed from: V1 */
    public static Intent m25786V1(Context context, FlowParameters flowParameters) {
        return HelperActivityBase.m25831K1(context, KickoffActivity.class, flowParameters);
    }

    /* renamed from: W1 */
    public void mo34114W1() {
        FlowParameters O1 = mo34180O1();
        O1.f15991s = null;
        setIntent(getIntent().putExtra("extra_flow_params", O1));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 106 && (i2 == 113 || i2 == 114)) {
            mo34114W1();
        }
        this.f15949p.mo37842z(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        Task<Void> task;
        super.onCreate(bundle);
        C7953i iVar = (C7953i) new ViewModelProvider(this).get(C7953i.class);
        this.f15949p = iVar;
        iVar.mo34278g(mo34180O1());
        this.f15949p.mo34267i().observe(this, new C6846a(this));
        if (mo34180O1().mo34141d()) {
            task = GoogleApiAvailability.m3521q().mo21161r(this);
        } else {
            task = Tasks.m66667f(null);
        }
        task.mo23707h(this, new C6848c(bundle)).mo23704e(this, new C6847b());
    }
}
