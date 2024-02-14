package p133m5;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.FirebaseUiUserCollisionException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6904c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.OAuthCredential;
import com.google.firebase.auth.OAuthProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p127l5.C7688b;
import p153q5.C8178b;
import p159r5.C8198a;
import p159r5.C8207h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.e */
/* compiled from: GenericIdpSignInHandler */
public class C7942e extends C6904c<AuthUI.IdpConfig> {

    /* renamed from: m5.e$a */
    /* compiled from: GenericIdpSignInHandler */
    class C7943a implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ OAuthProvider f19061a;

        C7943a(OAuthProvider oAuthProvider) {
            this.f19061a = oAuthProvider;
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthException) {
                C8178b b = C8178b.m33934b((FirebaseAuthException) exc);
                if (exc instanceof FirebaseAuthUserCollisionException) {
                    FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exc;
                    C7942e.this.mo34268j(C7688b.m32058a(new FirebaseUiUserCollisionException(13, "Recoverable error.", this.f19061a.mo22672c(), firebaseAuthUserCollisionException.mo22636b(), firebaseAuthUserCollisionException.mo22637c())));
                } else if (b == C8178b.ERROR_WEB_CONTEXT_CANCELED) {
                    C7942e.this.mo34268j(C7688b.m32058a(new UserCancellationException()));
                } else {
                    C7942e.this.mo34268j(C7688b.m32058a(exc));
                }
            } else {
                C7942e.this.mo34268j(C7688b.m32058a(exc));
            }
        }
    }

    /* renamed from: m5.e$b */
    /* compiled from: GenericIdpSignInHandler */
    class C7944b implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ boolean f19063a;

        /* renamed from: b */
        final /* synthetic */ OAuthProvider f19064b;

        C7944b(boolean z, OAuthProvider oAuthProvider) {
            this.f19063a = z;
            this.f19064b = oAuthProvider;
        }

        /* renamed from: a */
        public void mo22751b(@NonNull AuthResult authResult) {
            C7942e.this.mo37831A(this.f19063a, this.f19064b.mo22672c(), authResult.getUser(), (OAuthCredential) authResult.mo22578J(), authResult.mo22579N1().mo22575R0());
        }
    }

    /* renamed from: m5.e$c */
    /* compiled from: GenericIdpSignInHandler */
    class C7945c implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ FirebaseAuth f19066a;

        /* renamed from: b */
        final /* synthetic */ FlowParameters f19067b;

        /* renamed from: c */
        final /* synthetic */ OAuthProvider f19068c;

        /* renamed from: m5.e$c$a */
        /* compiled from: GenericIdpSignInHandler */
        class C7946a implements OnSuccessListener<List<String>> {

            /* renamed from: a */
            final /* synthetic */ AuthCredential f19070a;

            /* renamed from: b */
            final /* synthetic */ String f19071b;

            C7946a(AuthCredential authCredential, String str) {
                this.f19070a = authCredential;
                this.f19071b = str;
            }

            /* renamed from: a */
            public void mo22751b(List<String> list) {
                if (list.isEmpty()) {
                    C7942e.this.mo34268j(C7688b.m32058a(new FirebaseUiException(3, "Unable to complete the linkingflow - the user is using unsupported providers.")));
                } else if (list.contains(C7945c.this.f19068c.mo22672c())) {
                    C7942e.this.mo37834y(this.f19070a);
                } else {
                    C7942e.this.mo34268j(C7688b.m32058a(new FirebaseUiUserCollisionException(13, "Recoverable error.", C7945c.this.f19068c.mo22672c(), this.f19071b, this.f19070a)));
                }
            }
        }

        C7945c(FirebaseAuth firebaseAuth, FlowParameters flowParameters, OAuthProvider oAuthProvider) {
            this.f19066a = firebaseAuth;
            this.f19067b = flowParameters;
            this.f19068c = oAuthProvider;
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            if (!(exc instanceof FirebaseAuthUserCollisionException)) {
                C7942e.this.mo34268j(C7688b.m32058a(exc));
                return;
            }
            FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exc;
            AuthCredential c = firebaseAuthUserCollisionException.mo22637c();
            String b = firebaseAuthUserCollisionException.mo22636b();
            C8207h.m34075b(this.f19066a, this.f19067b, b).mo23708i(new C7946a(c, b));
        }
    }

    /* renamed from: m5.e$d */
    /* compiled from: GenericIdpSignInHandler */
    class C7947d implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ boolean f19073a;

        /* renamed from: b */
        final /* synthetic */ OAuthProvider f19074b;

        C7947d(boolean z, OAuthProvider oAuthProvider) {
            this.f19073a = z;
            this.f19074b = oAuthProvider;
        }

        /* renamed from: a */
        public void mo22751b(@NonNull AuthResult authResult) {
            C7942e.this.mo37831A(this.f19073a, this.f19074b.mo22672c(), authResult.getUser(), (OAuthCredential) authResult.mo22578J(), authResult.mo22579N1().mo22575R0());
        }
    }

    public C7942e(Application application) {
        super(application);
    }

    @NonNull
    /* renamed from: v */
    public static AuthUI.IdpConfig m33187v() {
        return new AuthUI.IdpConfig.C6837d("facebook.com", "Facebook", R$layout.fui_idp_button_facebook).mo34067b();
    }

    @NonNull
    /* renamed from: w */
    public static AuthUI.IdpConfig m33188w() {
        return new AuthUI.IdpConfig.C6837d("google.com", "Google", R$layout.fui_idp_button_google).mo34067b();
    }

    /* renamed from: x */
    private void m33189x(FirebaseAuth firebaseAuth, HelperActivityBase helperActivityBase, OAuthProvider oAuthProvider, FlowParameters flowParameters) {
        firebaseAuth.mo22613g().mo22658v2(helperActivityBase, oAuthProvider).mo23708i(new C7947d(helperActivityBase.mo34179N1().mo34054m(), oAuthProvider)).mo23705f(new C7945c(firebaseAuth, flowParameters, oAuthProvider));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo37831A(boolean z, @NonNull String str, @NonNull FirebaseUser firebaseUser, @NonNull OAuthCredential oAuthCredential, boolean z2) {
        mo37832B(z, str, firebaseUser, oAuthCredential, z2, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo37832B(boolean z, @NonNull String str, @NonNull FirebaseUser firebaseUser, @NonNull OAuthCredential oAuthCredential, boolean z2, boolean z3) {
        String n2 = oAuthCredential.mo22670n2();
        if (n2 == null && z) {
            n2 = "fake_access_token";
        }
        String o2 = oAuthCredential.mo22671o2();
        if (o2 == null && z) {
            o2 = "fake_secret";
        }
        IdpResponse.C6845b d = new IdpResponse.C6845b(new User.C6853b(str, firebaseUser.mo22647l2()).mo34172b(firebaseUser.mo22651p0()).mo34174d(firebaseUser.mo22650o2()).mo34171a()).mo34113e(n2).mo34112d(o2);
        if (z3) {
            d.mo34111c(oAuthCredential);
        }
        d.mo34110b(z2);
        mo34268j(C7688b.m32060c(d.mo34109a()));
    }

    /* renamed from: l */
    public void mo34270l(int i, int i2, @Nullable Intent intent) {
        if (i == 117) {
            IdpResponse g = IdpResponse.m25763g(intent);
            if (g == null) {
                mo34268j(C7688b.m32058a(new UserCancellationException()));
            } else {
                mo34268j(C7688b.m32060c(g));
            }
        }
    }

    /* renamed from: m */
    public void mo34271m(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        mo34268j(C7688b.m32059b());
        FlowParameters O1 = helperActivityBase.mo34180O1();
        OAuthProvider u = mo37833u(str, firebaseAuth);
        if (O1 == null || !C8198a.m34015c().mo38265a(firebaseAuth, O1)) {
            mo37835z(firebaseAuth, helperActivityBase, u);
        } else {
            m33189x(firebaseAuth, helperActivityBase, u, O1);
        }
    }

    /* renamed from: u */
    public OAuthProvider mo37833u(String str, FirebaseAuth firebaseAuth) {
        OAuthProvider.Builder d = OAuthProvider.m6079d(str, firebaseAuth);
        ArrayList<String> stringArrayList = ((AuthUI.IdpConfig) mo34277f()).mo34056a().getStringArrayList("generic_oauth_scopes");
        HashMap hashMap = (HashMap) ((AuthUI.IdpConfig) mo34277f()).mo34056a().getSerializable("generic_oauth_custom_parameters");
        if (stringArrayList != null) {
            d.mo22675c(stringArrayList);
        }
        if (hashMap != null) {
            d.mo22673a(hashMap);
        }
        return d.mo22674b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo37834y(@NonNull AuthCredential authCredential) {
        mo34268j(C7688b.m32058a(new FirebaseAuthAnonymousUpgradeException(5, new IdpResponse.C6845b().mo34111c(authCredential).mo34109a())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo37835z(FirebaseAuth firebaseAuth, HelperActivityBase helperActivityBase, OAuthProvider oAuthProvider) {
        firebaseAuth.mo22629v(helperActivityBase, oAuthProvider).mo23708i(new C7944b(helperActivityBase.mo34179N1().mo34054m(), oAuthProvider)).mo23705f(new C7943a(oAuthProvider));
    }
}
