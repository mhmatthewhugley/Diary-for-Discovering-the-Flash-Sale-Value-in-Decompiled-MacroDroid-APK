package p133m5;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.IntentRequiredException;
import com.firebase.p073ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.email.EmailActivity;
import com.firebase.p073ui.auth.p074ui.email.EmailLinkCatcherActivity;
import com.firebase.p073ui.auth.p074ui.idp.AuthMethodPickerActivity;
import com.firebase.p073ui.auth.p074ui.idp.SingleSignInActivity;
import com.firebase.p073ui.auth.p074ui.phone.PhoneActivity;
import com.firebase.p073ui.auth.viewmodel.C6906e;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResponse;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import java.util.ArrayList;
import java.util.List;
import p127l5.C7688b;
import p153q5.C8179c;
import p159r5.C8207h;

/* renamed from: m5.i */
/* compiled from: SignInKickstarter */
public class C7953i extends C6906e {

    /* renamed from: m5.i$a */
    /* compiled from: SignInKickstarter */
    class C7954a implements OnFailureListener {
        C7954a() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C7953i.this.mo34276q(C7688b.m32058a(exc));
        }
    }

    /* renamed from: m5.i$b */
    /* compiled from: SignInKickstarter */
    class C7955b implements OnSuccessListener<AuthResult> {
        C7955b() {
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C7953i.this.mo34275p(new IdpResponse.C6845b(new User.C6853b(authResult.mo22578J().mo22576l2(), authResult.getUser().mo22647l2()).mo34171a()).mo34109a(), authResult);
        }
    }

    /* renamed from: m5.i$c */
    /* compiled from: SignInKickstarter */
    class C7956c implements OnCompleteListener<CredentialRequestResponse> {
        C7956c() {
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<CredentialRequestResponse> task) {
            try {
                C7953i.this.m33228y(task.mo23716q(ApiException.class).mo20838h());
            } catch (ResolvableApiException e) {
                if (e.mo21210b() == 6) {
                    C7953i.this.mo34276q(C7688b.m32058a(new PendingIntentRequiredException(e.mo21275c(), 101)));
                } else {
                    C7953i.this.m33220C();
                }
            } catch (ApiException unused) {
                C7953i.this.m33220C();
            }
        }
    }

    /* renamed from: m5.i$d */
    /* compiled from: SignInKickstarter */
    class C7957d implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ Credential f19086a;

        C7957d(Credential credential) {
            this.f19086a = credential;
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            if ((exc instanceof FirebaseAuthInvalidUserException) || (exc instanceof FirebaseAuthInvalidCredentialsException)) {
                C8179c.m33935a(C7953i.this.getApplication()).mo20844G(this.f19086a);
            }
            C7953i.this.m33220C();
        }
    }

    /* renamed from: m5.i$e */
    /* compiled from: SignInKickstarter */
    class C7958e implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f19088a;

        C7958e(IdpResponse idpResponse) {
            this.f19088a = idpResponse;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C7953i.this.mo34275p(this.f19088a, authResult);
        }
    }

    public C7953i(Application application) {
        super(application);
    }

    /* renamed from: A */
    private void m33219A(String str, String str2) {
        str.hashCode();
        if (str.equals("phone")) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_phone_number", str2);
            mo34276q(C7688b.m32058a(new IntentRequiredException(PhoneActivity.m26025W1(getApplication(), (FlowParameters) mo34277f(), bundle), 107)));
        } else if (!str.equals("password")) {
            mo34276q(C7688b.m32058a(new IntentRequiredException(SingleSignInActivity.m25992V1(getApplication(), (FlowParameters) mo34277f(), new User.C6853b(str, str2).mo34171a()), 109)));
        } else {
            mo34276q(C7688b.m32058a(new IntentRequiredException(EmailActivity.m25849V1(getApplication(), (FlowParameters) mo34277f(), str2), 106)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m33220C() {
        if (!((FlowParameters) mo34277f()).mo34147i()) {
            AuthUI.IdpConfig b = ((FlowParameters) mo34277f()).mo34139b();
            String b2 = b.mo34057b();
            b2.hashCode();
            char c = 65535;
            switch (b2.hashCode()) {
                case 106642798:
                    if (b2.equals("phone")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1216985755:
                    if (b2.equals("password")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2120171958:
                    if (b2.equals("emailLink")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo34276q(C7688b.m32058a(new IntentRequiredException(PhoneActivity.m26025W1(getApplication(), (FlowParameters) mo34277f(), b.mo34056a()), 107)));
                    return;
                case 1:
                case 2:
                    mo34276q(C7688b.m32058a(new IntentRequiredException(EmailActivity.m25848U1(getApplication(), (FlowParameters) mo34277f()), 106)));
                    return;
                default:
                    m33219A(b2, (String) null);
                    return;
            }
        } else {
            mo34276q(C7688b.m32058a(new IntentRequiredException(AuthMethodPickerActivity.m25977W1(getApplication(), (FlowParameters) mo34277f()), 105)));
        }
    }

    /* renamed from: x */
    private List<String> m33227x() {
        ArrayList arrayList = new ArrayList();
        for (AuthUI.IdpConfig b : ((FlowParameters) mo34277f()).f15985c) {
            String b2 = b.mo34057b();
            if (b2.equals("google.com")) {
                arrayList.add(C8207h.m34081h(b2));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m33228y(Credential credential) {
        String id = credential.getId();
        String p2 = credential.mo20814p2();
        if (!TextUtils.isEmpty(p2)) {
            IdpResponse a = new IdpResponse.C6845b(new User.C6853b("password", id).mo34171a()).mo34109a();
            mo34276q(C7688b.m32059b());
            mo34264k().mo22627t(id, p2).mo23708i(new C7958e(a)).mo23705f(new C7957d(credential));
        } else if (credential.mo20810l2() == null) {
            m33220C();
        } else {
            m33219A(C8207h.m34074a(credential.mo20810l2()), id);
        }
    }

    /* renamed from: B */
    public void mo37841B() {
        if (!TextUtils.isEmpty(((FlowParameters) mo34277f()).f15991s)) {
            mo34276q(C7688b.m32058a(new IntentRequiredException(EmailLinkCatcherActivity.m25867X1(getApplication(), (FlowParameters) mo34277f()), 106)));
            return;
        }
        Task<AuthResult> j = mo34264k().mo22617j();
        if (j != null) {
            j.mo23708i(new C7955b()).mo23705f(new C7954a());
            return;
        }
        boolean z = true;
        boolean z2 = C8207h.m34078e(((FlowParameters) mo34277f()).f15985c, "password") != null;
        List<String> x = m33227x();
        if (!z2 && x.size() <= 0) {
            z = false;
        }
        if (!((FlowParameters) mo34277f()).f15978A || !z) {
            m33220C();
            return;
        }
        mo34276q(C7688b.m32059b());
        C8179c.m33935a(getApplication()).mo20847J(new CredentialRequest.Builder().mo20837c(z2).mo20836b((String[]) x.toArray(new String[x.size()])).mo20835a()).mo23702c(new C7956c());
    }

    /* renamed from: z */
    public void mo37842z(int i, int i2, @Nullable Intent intent) {
        if (i != 101) {
            if (i != 109) {
                switch (i) {
                    case 105:
                    case 106:
                    case 107:
                        break;
                    default:
                        return;
                }
            }
            if (i2 == 113 || i2 == 114) {
                m33220C();
                return;
            }
            IdpResponse g = IdpResponse.m25763g(intent);
            if (g == null) {
                mo34276q(C7688b.m32058a(new UserCancellationException()));
            } else if (g.mo34099r()) {
                mo34276q(C7688b.m32060c(g));
            } else if (g.mo34092j().mo34082a() == 5) {
                mo34273n(g);
            } else {
                mo34276q(C7688b.m32058a(g.mo34092j()));
            }
        } else if (i2 == -1) {
            m33228y((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential"));
        } else {
            m33220C();
        }
    }
}
