package p180v5;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.viewmodel.C6906e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.PhoneAuthCredential;
import p127l5.C7688b;
import p159r5.C8198a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: v5.a */
/* compiled from: PhoneProviderResponseHandler */
public class C10323a extends C6906e {

    /* renamed from: v5.a$a */
    /* compiled from: PhoneProviderResponseHandler */
    class C10324a implements OnFailureListener {
        C10324a() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthUserCollisionException) {
                C10323a.this.mo34274o(((FirebaseAuthUserCollisionException) exc).mo22637c());
            } else {
                C10323a.this.mo34276q(C7688b.m32058a(exc));
            }
        }
    }

    /* renamed from: v5.a$b */
    /* compiled from: PhoneProviderResponseHandler */
    class C10325b implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23490a;

        C10325b(IdpResponse idpResponse) {
            this.f23490a = idpResponse;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C10323a.this.mo34275p(this.f23490a, authResult);
        }
    }

    public C10323a(Application application) {
        super(application);
    }

    /* renamed from: u */
    public void mo40949u(@NonNull PhoneAuthCredential phoneAuthCredential, @NonNull IdpResponse idpResponse) {
        if (!idpResponse.mo34099r()) {
            mo34276q(C7688b.m32058a(idpResponse.mo34092j()));
        } else if (idpResponse.mo34095n().equals("phone")) {
            mo34276q(C7688b.m32059b());
            C8198a.m34015c().mo38269h(mo34264k(), (FlowParameters) mo34277f(), phoneAuthCredential).mo23708i(new C10325b(idpResponse)).mo23705f(new C10324a());
        } else {
            throw new IllegalStateException("This handler cannot be used without a phone response.");
        }
    }
}
