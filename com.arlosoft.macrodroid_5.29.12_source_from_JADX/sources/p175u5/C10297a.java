package p175u5;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.viewmodel.C6906e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import p127l5.C7688b;
import p159r5.C8198a;
import p159r5.C8207h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: u5.a */
/* compiled from: LinkingSocialProviderResponseHandler */
public class C10297a extends C6906e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AuthCredential f23452f;

    /* renamed from: g */
    private String f23453g;

    /* renamed from: u5.a$a */
    /* compiled from: LinkingSocialProviderResponseHandler */
    class C10298a implements OnFailureListener {
        C10298a() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C7688b.m32058a(exc);
        }
    }

    /* renamed from: u5.a$b */
    /* compiled from: LinkingSocialProviderResponseHandler */
    class C10299b implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23455a;

        C10299b(IdpResponse idpResponse) {
            this.f23455a = idpResponse;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C10297a.this.mo34275p(this.f23455a, authResult);
        }
    }

    /* renamed from: u5.a$c */
    /* compiled from: LinkingSocialProviderResponseHandler */
    class C10300c implements OnFailureListener {
        C10300c() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C10297a.this.mo34276q(C7688b.m32058a(exc));
        }
    }

    /* renamed from: u5.a$d */
    /* compiled from: LinkingSocialProviderResponseHandler */
    class C10301d implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ AuthCredential f23458a;

        C10301d(AuthCredential authCredential) {
            this.f23458a = authCredential;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C10297a.this.mo34274o(this.f23458a);
        }
    }

    /* renamed from: u5.a$e */
    /* compiled from: LinkingSocialProviderResponseHandler */
    class C10302e implements OnCompleteListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23460a;

        C10302e(IdpResponse idpResponse) {
            this.f23460a = idpResponse;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<AuthResult> task) {
            if (task.mo23719t()) {
                C10297a.this.mo34275p(this.f23460a, task.mo23715p());
            } else {
                C10297a.this.mo34276q(C7688b.m32058a(task.mo23714o()));
            }
        }
    }

    /* renamed from: u5.a$f */
    /* compiled from: LinkingSocialProviderResponseHandler */
    class C10303f implements Continuation<AuthResult, Task<AuthResult>> {

        /* renamed from: u5.a$f$a */
        /* compiled from: LinkingSocialProviderResponseHandler */
        class C10304a implements Continuation<AuthResult, AuthResult> {

            /* renamed from: a */
            final /* synthetic */ AuthResult f23463a;

            C10304a(AuthResult authResult) {
                this.f23463a = authResult;
            }

            /* renamed from: b */
            public AuthResult mo21119a(@NonNull Task<AuthResult> task) {
                if (task.mo23719t()) {
                    return task.mo23715p();
                }
                return this.f23463a;
            }
        }

        C10303f() {
        }

        /* renamed from: b */
        public Task<AuthResult> mo21119a(@NonNull Task<AuthResult> task) {
            AuthResult p = task.mo23715p();
            if (C10297a.this.f23452f == null) {
                return Tasks.m66667f(p);
            }
            return p.getUser().mo22656t2(C10297a.this.f23452f).mo23710k(new C10304a(p));
        }
    }

    public C10297a(Application application) {
        super(application);
    }

    /* renamed from: y */
    private boolean m40465y(@NonNull String str) {
        return AuthUI.f15908f.contains(str) && this.f23452f != null && mo34264k().mo22613g() != null && !mo34264k().mo22613g().mo22655s2();
    }

    /* renamed from: z */
    private boolean m40466z(@NonNull String str) {
        return TextUtils.equals(str, "password") || TextUtils.equals(str, "phone");
    }

    /* renamed from: A */
    public void mo40913A(@Nullable AuthCredential authCredential, @Nullable String str) {
        this.f23452f = authCredential;
        this.f23453g = str;
    }

    /* renamed from: B */
    public void mo40914B(@NonNull IdpResponse idpResponse) {
        if (!idpResponse.mo34099r()) {
            mo34276q(C7688b.m32058a(idpResponse.mo34092j()));
        } else if (!m40466z(idpResponse.mo34095n())) {
            String str = this.f23453g;
            if (str == null || str.equals(idpResponse.mo34091i())) {
                mo34276q(C7688b.m32059b());
                if (m40465y(idpResponse.mo34095n())) {
                    mo34264k().mo22613g().mo22656t2(this.f23452f).mo23708i(new C10299b(idpResponse)).mo23705f(new C10298a());
                    return;
                }
                C8198a c = C8198a.m34015c();
                AuthCredential d = C8207h.m34077d(idpResponse);
                if (c.mo38265a(mo34264k(), (FlowParameters) mo34277f())) {
                    AuthCredential authCredential = this.f23452f;
                    if (authCredential == null) {
                        mo34274o(d);
                    } else {
                        c.mo38268g(d, authCredential, (FlowParameters) mo34277f()).mo23708i(new C10301d(d)).mo23705f(new C10300c());
                    }
                } else {
                    mo34264k().mo22626s(d).mo23712m(new C10303f()).mo23702c(new C10302e(idpResponse));
                }
            } else {
                mo34276q(C7688b.m32058a(new FirebaseUiException(6)));
            }
        } else {
            throw new IllegalStateException("This handler cannot be used to link email or phone providers.");
        }
    }

    /* renamed from: x */
    public boolean mo40915x() {
        return this.f23452f != null;
    }
}
