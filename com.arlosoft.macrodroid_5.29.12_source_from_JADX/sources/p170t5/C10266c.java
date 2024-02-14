package p170t5;

import android.app.Application;
import android.util.Log;
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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import p127l5.C7688b;
import p133m5.C7951h;
import p159r5.C8198a;
import p159r5.C8207h;
import p159r5.C8211j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: t5.c */
/* compiled from: EmailProviderResponseHandler */
public class C10266c extends C6906e {

    /* renamed from: t5.c$a */
    /* compiled from: EmailProviderResponseHandler */
    class C10267a implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ C8198a f23411a;

        /* renamed from: b */
        final /* synthetic */ String f23412b;

        /* renamed from: c */
        final /* synthetic */ String f23413c;

        /* renamed from: t5.c$a$a */
        /* compiled from: EmailProviderResponseHandler */
        class C10268a implements OnFailureListener {
            C10268a() {
            }

            /* renamed from: c */
            public void mo22733c(@NonNull Exception exc) {
                C10266c.this.mo34276q(C7688b.m32058a(exc));
            }
        }

        C10267a(C8198a aVar, String str, String str2) {
            this.f23411a = aVar;
            this.f23412b = str;
            this.f23413c = str2;
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            if (!(exc instanceof FirebaseAuthUserCollisionException)) {
                C10266c.this.mo34276q(C7688b.m32058a(exc));
            } else if (this.f23411a.mo38265a(C10266c.this.mo34264k(), (FlowParameters) C10266c.this.mo34277f())) {
                C10266c.this.mo34274o(EmailAuthProvider.m5975a(this.f23412b, this.f23413c));
            } else {
                Log.w("EmailProviderResponseHa", "Got a collision error during a non-upgrade flow", exc);
                C8207h.m34076c(C10266c.this.mo34264k(), (FlowParameters) C10266c.this.mo34277f(), this.f23412b).mo23708i(new C10270c(this.f23412b)).mo23705f(new C10268a());
            }
        }
    }

    /* renamed from: t5.c$b */
    /* compiled from: EmailProviderResponseHandler */
    class C10269b implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23416a;

        C10269b(IdpResponse idpResponse) {
            this.f23416a = idpResponse;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C10266c.this.mo34275p(this.f23416a, authResult);
        }
    }

    /* renamed from: t5.c$c */
    /* compiled from: EmailProviderResponseHandler */
    private class C10270c implements OnSuccessListener<String> {

        /* renamed from: a */
        private final String f23418a;

        public C10270c(String str) {
            this.f23418a = str;
        }

        /* renamed from: a */
        public void mo22751b(@Nullable String str) {
            if (str == null) {
                Log.w("EmailProviderResponseHa", "No providers known for user (" + this.f23418a + ") this email address may be reserved.");
                C10266c.this.mo34276q(C7688b.m32058a(new FirebaseUiException(0)));
            } else if ("password".equalsIgnoreCase(str)) {
                C10266c.this.mo34276q(C7688b.m32058a(new IntentRequiredException(WelcomeBackPasswordPrompt.m25899X1(C10266c.this.getApplication(), (FlowParameters) C10266c.this.mo34277f(), new IdpResponse.C6845b(new User.C6853b("password", this.f23418a).mo34171a()).mo34109a()), 104)));
            } else if ("emailLink".equalsIgnoreCase(str)) {
                C10266c.this.mo34276q(C7688b.m32058a(new IntentRequiredException(WelcomeBackEmailLinkPrompt.m25889U1(C10266c.this.getApplication(), (FlowParameters) C10266c.this.mo34277f(), new IdpResponse.C6845b(new User.C6853b("emailLink", this.f23418a).mo34171a()).mo34109a()), 112)));
            } else {
                C10266c.this.mo34276q(C7688b.m32058a(new IntentRequiredException(WelcomeBackIdpPrompt.m26000V1(C10266c.this.getApplication(), (FlowParameters) C10266c.this.mo34277f(), new User.C6853b(str, this.f23418a).mo34171a()), 103)));
            }
        }
    }

    public C10266c(Application application) {
        super(application);
    }

    /* renamed from: G */
    public void mo40880G(@NonNull IdpResponse idpResponse, @NonNull String str) {
        if (!idpResponse.mo34099r()) {
            mo34276q(C7688b.m32058a(idpResponse.mo34092j()));
        } else if (idpResponse.mo34095n().equals("password")) {
            mo34276q(C7688b.m32059b());
            C8198a c = C8198a.m34015c();
            String i = idpResponse.mo34091i();
            c.mo38266b(mo34264k(), (FlowParameters) mo34277f(), i, str).mo23712m(new C7951h(idpResponse)).mo23705f(new C8211j("EmailProviderResponseHa", "Error creating user")).mo23708i(new C10269b(idpResponse)).mo23705f(new C10267a(c, i, str));
        } else {
            throw new IllegalStateException("This handler can only be used with the email provider");
        }
    }
}
