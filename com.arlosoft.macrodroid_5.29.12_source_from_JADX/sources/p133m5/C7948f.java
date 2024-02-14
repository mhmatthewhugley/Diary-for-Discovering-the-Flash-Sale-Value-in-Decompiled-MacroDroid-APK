package p133m5;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.IntentRequiredException;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.auth.FirebaseAuth;
import p127l5.C7688b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.f */
/* compiled from: GoogleSignInHandler */
public class C7948f extends C7959j<C7949a> {

    /* renamed from: e */
    private AuthUI.IdpConfig f19076e;
    @Nullable

    /* renamed from: f */
    private String f19077f;

    /* renamed from: m5.f$a */
    /* compiled from: GoogleSignInHandler */
    public static final class C7949a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final AuthUI.IdpConfig f19078a;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: b */
        public final String f19079b;

        public C7949a(AuthUI.IdpConfig idpConfig) {
            this(idpConfig, (String) null);
        }

        public C7949a(AuthUI.IdpConfig idpConfig, @Nullable String str) {
            this.f19078a = idpConfig;
            this.f19079b = str;
        }
    }

    public C7948f(Application application) {
        super(application, "google.com");
    }

    /* renamed from: n */
    private static IdpResponse m33205n(GoogleSignInAccount googleSignInAccount) {
        return new IdpResponse.C6845b(new User.C6853b("google.com", googleSignInAccount.mo20964l2()).mo34172b(googleSignInAccount.mo20968p0()).mo34174d(googleSignInAccount.mo20969p2()).mo34171a()).mo34113e(googleSignInAccount.mo20967o2()).mo34109a();
    }

    /* renamed from: o */
    private GoogleSignInOptions m33206o() {
        GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder((GoogleSignInOptions) this.f19076e.mo34056a().getParcelable("extra_google_sign_in_options"));
        if (!TextUtils.isEmpty(this.f19077f)) {
            builder.mo20996g(this.f19077f);
        }
        return builder.mo20990a();
    }

    /* renamed from: p */
    private void m33207p() {
        mo34268j(C7688b.m32059b());
        mo34268j(C7688b.m32058a(new IntentRequiredException(GoogleSignIn.m3281a(getApplication(), m33206o()).mo20975G(), 110)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo34263h() {
        C7949a aVar = (C7949a) mo34277f();
        this.f19076e = aVar.f19078a;
        this.f19077f = aVar.f19079b;
    }

    /* renamed from: l */
    public void mo34270l(int i, int i2, @Nullable Intent intent) {
        if (i == 110) {
            try {
                mo34268j(C7688b.m32060c(m33205n(GoogleSignIn.m3282b(intent).mo23716q(ApiException.class))));
            } catch (ApiException e) {
                if (e.mo21210b() == 5) {
                    this.f19077f = null;
                    m33207p();
                } else if (e.mo21210b() == 12502) {
                    m33207p();
                } else if (e.mo21210b() == 12501) {
                    mo34268j(C7688b.m32058a(new UserCancellationException()));
                } else {
                    if (e.mo21210b() == 10) {
                        Log.w("GoogleSignInHandler", "Developer error: this application is misconfigured. Check your SHA1 and package name in the Firebase console.");
                    }
                    mo34268j(C7688b.m32058a(new FirebaseUiException(4, "Code: " + e.mo21210b() + ", message: " + e.getMessage())));
                }
            }
        }
    }

    /* renamed from: m */
    public void mo34271m(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        m33207p();
    }
}
