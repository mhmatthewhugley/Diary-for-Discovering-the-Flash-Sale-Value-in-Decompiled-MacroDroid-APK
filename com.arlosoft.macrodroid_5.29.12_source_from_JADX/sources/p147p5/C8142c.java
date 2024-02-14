package p147p5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.p073ui.auth.data.model.PhoneNumberVerificationRequiredException;
import com.firebase.p073ui.auth.viewmodel.C6902a;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.concurrent.TimeUnit;
import p127l5.C7688b;

/* renamed from: p5.c */
/* compiled from: PhoneNumberVerificationHandler */
public class C8142c extends C6902a<C8144d> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f19763f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public PhoneAuthProvider.ForceResendingToken f19764g;

    /* renamed from: p5.c$a */
    /* compiled from: PhoneNumberVerificationHandler */
    class C8143a extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {

        /* renamed from: b */
        final /* synthetic */ String f19765b;

        C8143a(String str) {
            this.f19765b = str;
        }

        /* renamed from: b */
        public void mo22704b(@NonNull String str, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            String unused = C8142c.this.f19763f = str;
            PhoneAuthProvider.ForceResendingToken unused2 = C8142c.this.f19764g = forceResendingToken;
            C8142c.this.mo34268j(C7688b.m32058a(new PhoneNumberVerificationRequiredException(this.f19765b)));
        }

        /* renamed from: c */
        public void mo22705c(@NonNull PhoneAuthCredential phoneAuthCredential) {
            C8142c.this.mo34268j(C7688b.m32060c(new C8144d(this.f19765b, phoneAuthCredential, true)));
        }

        /* renamed from: d */
        public void mo22706d(@NonNull FirebaseException firebaseException) {
            C8142c.this.mo34268j(C7688b.m32058a(firebaseException));
        }
    }

    public C8142c(Application application) {
        super(application);
    }

    /* renamed from: s */
    public void mo38153s(@Nullable Bundle bundle) {
        if (this.f19763f == null && bundle != null) {
            this.f19763f = bundle.getString("verification_id");
        }
    }

    /* renamed from: t */
    public void mo38154t(@NonNull Bundle bundle) {
        bundle.putString("verification_id", this.f19763f);
    }

    /* renamed from: u */
    public void mo38155u(String str, String str2) {
        mo34268j(C7688b.m32060c(new C8144d(str, PhoneAuthProvider.m6115a(this.f19763f, str2), false)));
    }

    /* renamed from: v */
    public void mo38156v(@NonNull Activity activity, String str, boolean z) {
        mo34268j(C7688b.m32059b());
        PhoneAuthOptions.Builder c = PhoneAuthOptions.m6097a(mo34264k()).mo22700e(str).mo22701f(120L, TimeUnit.SECONDS).mo22697b(activity).mo22698c(new C8143a(str));
        if (z) {
            c.mo22699d(this.f19764g);
        }
        PhoneAuthProvider.m6116b(c.mo22696a());
    }
}
