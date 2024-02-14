package p133m5;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OAuthCredential;
import com.google.firebase.auth.OAuthProvider;
import p127l5.C7688b;
import p159r5.C8198a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.d */
/* compiled from: GenericIdpAnonymousUpgradeLinkingHandler */
public class C7939d extends C7942e {

    /* renamed from: m5.d$a */
    /* compiled from: GenericIdpAnonymousUpgradeLinkingHandler */
    class C7940a implements OnFailureListener {
        C7940a() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C7939d.this.mo34268j(C7688b.m32058a(exc));
        }
    }

    /* renamed from: m5.d$b */
    /* compiled from: GenericIdpAnonymousUpgradeLinkingHandler */
    class C7941b implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ boolean f19058a;

        /* renamed from: b */
        final /* synthetic */ OAuthProvider f19059b;

        C7941b(boolean z, OAuthProvider oAuthProvider) {
            this.f19058a = z;
            this.f19059b = oAuthProvider;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C7939d.this.mo37831A(this.f19058a, this.f19059b.mo22672c(), authResult.getUser(), (OAuthCredential) authResult.mo22578J(), true);
        }
    }

    public C7939d(Application application) {
        super(application);
    }

    /* renamed from: D */
    private void m33175D(HelperActivityBase helperActivityBase, OAuthProvider oAuthProvider, FlowParameters flowParameters) {
        C8198a.m34015c().mo38267f(helperActivityBase, oAuthProvider, flowParameters).mo23708i(new C7941b(helperActivityBase.mo34179N1().mo34054m(), oAuthProvider)).mo23705f(new C7940a());
    }

    /* renamed from: m */
    public void mo34271m(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        mo34268j(C7688b.m32059b());
        FlowParameters O1 = helperActivityBase.mo34180O1();
        OAuthProvider u = mo37833u(str, firebaseAuth);
        if (O1 == null || !C8198a.m34015c().mo38265a(firebaseAuth, O1)) {
            mo37835z(firebaseAuth, helperActivityBase, u);
        } else {
            m33175D(helperActivityBase, u, O1);
        }
    }
}
