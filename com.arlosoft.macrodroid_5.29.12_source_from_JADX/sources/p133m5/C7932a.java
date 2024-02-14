package p133m5;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import p127l5.C7688b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.a */
/* compiled from: AnonymousSignInHandler */
public class C7932a extends C7959j<FlowParameters> {
    @VisibleForTesting

    /* renamed from: e */
    public FirebaseAuth f19050e;

    /* renamed from: m5.a$a */
    /* compiled from: AnonymousSignInHandler */
    class C7933a implements OnFailureListener {
        C7933a() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C7932a.this.mo34268j(C7688b.m32058a(exc));
        }
    }

    /* renamed from: m5.a$b */
    /* compiled from: AnonymousSignInHandler */
    class C7934b implements OnSuccessListener<AuthResult> {
        C7934b() {
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C7932a aVar = C7932a.this;
            aVar.mo34268j(C7688b.m32060c(aVar.m33162r(authResult.mo22579N1().mo22575R0())));
        }
    }

    public C7932a(Application application) {
        super(application, "anonymous");
    }

    /* renamed from: q */
    private FirebaseAuth m33161q() {
        return AuthUI.m25699l(((FlowParameters) mo34277f()).f15984a).mo34051f();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public IdpResponse m33162r(boolean z) {
        return new IdpResponse.C6845b(new User.C6853b("anonymous", (String) null).mo34171a()).mo34110b(z).mo34109a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo34263h() {
        this.f19050e = m33161q();
    }

    /* renamed from: l */
    public void mo34270l(int i, int i2, @Nullable Intent intent) {
    }

    /* renamed from: m */
    public void mo34271m(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        mo34268j(C7688b.m32059b());
        this.f19050e.mo22625r().mo23708i(new C7934b()).mo23705f(new C7933a());
    }
}
