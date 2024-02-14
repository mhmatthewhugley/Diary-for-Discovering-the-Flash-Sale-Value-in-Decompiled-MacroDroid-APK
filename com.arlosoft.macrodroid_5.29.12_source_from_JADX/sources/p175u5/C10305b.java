package p175u5;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.IntentRequiredException;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.p074ui.email.WelcomeBackEmailLinkPrompt;
import com.firebase.p073ui.auth.p074ui.email.WelcomeBackPasswordPrompt;
import com.firebase.p073ui.auth.p074ui.idp.WelcomeBackIdpPrompt;
import com.firebase.p073ui.auth.viewmodel.C6906e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import java.util.List;
import p127l5.C7688b;
import p133m5.C7951h;
import p153q5.C8178b;
import p159r5.C8198a;
import p159r5.C8207h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: u5.b */
/* compiled from: SocialProviderResponseHandler */
public class C10305b extends C6906e {

    /* renamed from: u5.b$a */
    /* compiled from: SocialProviderResponseHandler */
    class C10306a implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23465a;

        /* renamed from: b */
        final /* synthetic */ AuthCredential f23466b;

        /* renamed from: u5.b$a$a */
        /* compiled from: SocialProviderResponseHandler */
        class C10307a implements OnFailureListener {
            C10307a() {
            }

            /* renamed from: c */
            public void mo22733c(@NonNull Exception exc) {
                C10305b.this.mo34276q(C7688b.m32058a(exc));
            }
        }

        /* renamed from: u5.b$a$b */
        /* compiled from: SocialProviderResponseHandler */
        class C10308b implements OnSuccessListener<List<String>> {
            C10308b() {
            }

            /* renamed from: a */
            public void mo22751b(List<String> list) {
                if (list.contains(C10306a.this.f23465a.mo34095n())) {
                    C10306a aVar = C10306a.this;
                    C10305b.this.mo34274o(aVar.f23466b);
                } else if (list.isEmpty()) {
                    C10305b.this.mo34276q(C7688b.m32058a(new FirebaseUiException(3, "No supported providers.")));
                } else {
                    C10305b.this.mo40922F(list.get(0), C10306a.this.f23465a);
                }
            }
        }

        C10306a(IdpResponse idpResponse, AuthCredential authCredential) {
            this.f23465a = idpResponse;
            this.f23466b = authCredential;
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            boolean z = exc instanceof FirebaseAuthInvalidUserException;
            if ((exc instanceof FirebaseAuthException) && C8178b.m33934b((FirebaseAuthException) exc) == C8178b.ERROR_USER_DISABLED) {
                z = true;
            }
            if (z) {
                C10305b.this.mo34276q(C7688b.m32058a(new FirebaseUiException(12)));
            } else if (exc instanceof FirebaseAuthUserCollisionException) {
                String i = this.f23465a.mo34091i();
                if (i == null) {
                    C10305b.this.mo34276q(C7688b.m32058a(exc));
                } else {
                    C8207h.m34075b(C10305b.this.mo34264k(), (FlowParameters) C10305b.this.mo34277f(), i).mo23708i(new C10308b()).mo23705f(new C10307a());
                }
            }
        }
    }

    /* renamed from: u5.b$b */
    /* compiled from: SocialProviderResponseHandler */
    class C10309b implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23470a;

        C10309b(IdpResponse idpResponse) {
            this.f23470a = idpResponse;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C10305b.this.mo34275p(this.f23470a, authResult);
        }
    }

    /* renamed from: u5.b$c */
    /* compiled from: SocialProviderResponseHandler */
    class C10310c implements OnFailureListener {
        C10310c() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C10305b.this.mo34276q(C7688b.m32058a(exc));
        }
    }

    /* renamed from: u5.b$d */
    /* compiled from: SocialProviderResponseHandler */
    class C10311d implements OnSuccessListener<List<String>> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23473a;

        C10311d(IdpResponse idpResponse) {
            this.f23473a = idpResponse;
        }

        /* renamed from: a */
        public void mo22751b(@NonNull List<String> list) {
            if (list.isEmpty()) {
                C10305b.this.mo34276q(C7688b.m32058a(new FirebaseUiException(3, "No supported providers.")));
            } else {
                C10305b.this.mo40922F(list.get(0), this.f23473a);
            }
        }
    }

    public C10305b(Application application) {
        super(application);
    }

    /* renamed from: B */
    private void m40482B(@NonNull IdpResponse idpResponse) {
        C8207h.m34075b(mo34264k(), (FlowParameters) mo34277f(), idpResponse.mo34091i()).mo23708i(new C10311d(idpResponse)).mo23705f(new C10310c());
    }

    /* renamed from: C */
    private boolean m40483C(@NonNull String str) {
        return TextUtils.equals(str, "password") || TextUtils.equals(str, "phone");
    }

    /* renamed from: D */
    public void mo40920D(int i, int i2, @Nullable Intent intent) {
        FirebaseUiException firebaseUiException;
        if (i == 108) {
            IdpResponse g = IdpResponse.m25763g(intent);
            if (i2 == -1) {
                mo34276q(C7688b.m32060c(g));
                return;
            }
            if (g == null) {
                firebaseUiException = new FirebaseUiException(0, "Link canceled by user.");
            } else {
                firebaseUiException = g.mo34092j();
            }
            mo34276q(C7688b.m32058a(firebaseUiException));
        }
    }

    /* renamed from: E */
    public void mo40921E(@NonNull IdpResponse idpResponse) {
        if (!idpResponse.mo34099r() && !idpResponse.mo34098q()) {
            mo34276q(C7688b.m32058a(idpResponse.mo34092j()));
        } else if (!m40483C(idpResponse.mo34095n())) {
            mo34276q(C7688b.m32059b());
            if (idpResponse.mo34097p()) {
                m40482B(idpResponse);
                return;
            }
            AuthCredential d = C8207h.m34077d(idpResponse);
            C8198a.m34015c().mo38269h(mo34264k(), (FlowParameters) mo34277f(), d).mo23712m(new C7951h(idpResponse)).mo23708i(new C10309b(idpResponse)).mo23705f(new C10306a(idpResponse, d));
        } else {
            throw new IllegalStateException("This handler cannot be used with email or phone providers");
        }
    }

    /* renamed from: F */
    public void mo40922F(String str, IdpResponse idpResponse) {
        if (str == null) {
            throw new IllegalStateException("No provider even though we received a FirebaseAuthUserCollisionException");
        } else if (str.equals("password")) {
            mo34276q(C7688b.m32058a(new IntentRequiredException(WelcomeBackPasswordPrompt.m25899X1(getApplication(), (FlowParameters) mo34277f(), idpResponse), 108)));
        } else if (str.equals("emailLink")) {
            mo34276q(C7688b.m32058a(new IntentRequiredException(WelcomeBackEmailLinkPrompt.m25889U1(getApplication(), (FlowParameters) mo34277f(), idpResponse), 112)));
        } else {
            mo34276q(C7688b.m32058a(new IntentRequiredException(WelcomeBackIdpPrompt.m26001W1(getApplication(), (FlowParameters) mo34277f(), new User.C6853b(str, idpResponse.mo34091i()).mo34171a(), idpResponse), 108)));
        }
    }
}
