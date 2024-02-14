package p170t5;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.viewmodel.C6906e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import p127l5.C7688b;
import p133m5.C7951h;
import p159r5.C8198a;
import p159r5.C8211j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: t5.e */
/* compiled from: WelcomeBackPasswordHandler */
public class C10273e extends C6906e {

    /* renamed from: f */
    private String f23422f;

    /* renamed from: t5.e$a */
    /* compiled from: WelcomeBackPasswordHandler */
    class C10274a implements OnFailureListener {
        C10274a() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C10273e.this.mo34276q(C7688b.m32058a(exc));
        }
    }

    /* renamed from: t5.e$b */
    /* compiled from: WelcomeBackPasswordHandler */
    class C10275b implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ AuthCredential f23424a;

        C10275b(AuthCredential authCredential) {
            this.f23424a = authCredential;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C10273e.this.mo34274o(this.f23424a);
        }
    }

    /* renamed from: t5.e$c */
    /* compiled from: WelcomeBackPasswordHandler */
    class C10276c implements OnCompleteListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ AuthCredential f23426a;

        C10276c(AuthCredential authCredential) {
            this.f23426a = authCredential;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<AuthResult> task) {
            if (task.mo23719t()) {
                C10273e.this.mo34274o(this.f23426a);
            } else {
                C10273e.this.mo34276q(C7688b.m32058a(task.mo23714o()));
            }
        }
    }

    /* renamed from: t5.e$d */
    /* compiled from: WelcomeBackPasswordHandler */
    class C10277d implements OnFailureListener {
        C10277d() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C10273e.this.mo34276q(C7688b.m32058a(exc));
        }
    }

    /* renamed from: t5.e$e */
    /* compiled from: WelcomeBackPasswordHandler */
    class C10278e implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ IdpResponse f23429a;

        C10278e(IdpResponse idpResponse) {
            this.f23429a = idpResponse;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            C10273e.this.mo34275p(this.f23429a, authResult);
        }
    }

    /* renamed from: t5.e$f */
    /* compiled from: WelcomeBackPasswordHandler */
    class C10279f implements Continuation<AuthResult, Task<AuthResult>> {

        /* renamed from: a */
        final /* synthetic */ AuthCredential f23431a;

        /* renamed from: b */
        final /* synthetic */ IdpResponse f23432b;

        C10279f(AuthCredential authCredential, IdpResponse idpResponse) {
            this.f23431a = authCredential;
            this.f23432b = idpResponse;
        }

        /* renamed from: b */
        public Task<AuthResult> mo21119a(@NonNull Task<AuthResult> task) throws Exception {
            AuthResult q = task.mo23716q(Exception.class);
            if (this.f23431a == null) {
                return Tasks.m66667f(q);
            }
            return q.getUser().mo22656t2(this.f23431a).mo23712m(new C7951h(this.f23432b)).mo23705f(new C8211j("WBPasswordHandler", "linkWithCredential+merge failed."));
        }
    }

    public C10273e(Application application) {
        super(application);
    }

    /* renamed from: x */
    public String mo40884x() {
        return this.f23422f;
    }

    /* renamed from: y */
    public void mo40885y(@NonNull String str, @NonNull String str2, @NonNull IdpResponse idpResponse, @Nullable AuthCredential authCredential) {
        IdpResponse idpResponse2;
        mo34276q(C7688b.m32059b());
        this.f23422f = str2;
        if (authCredential == null) {
            idpResponse2 = new IdpResponse.C6845b(new User.C6853b("password", str).mo34171a()).mo34109a();
        } else {
            idpResponse2 = new IdpResponse.C6845b(idpResponse.mo34096o()).mo34111c(idpResponse.mo34089h()).mo34113e(idpResponse.mo34094m()).mo34112d(idpResponse.mo34093l()).mo34109a();
        }
        C8198a c = C8198a.m34015c();
        if (c.mo38265a(mo34264k(), (FlowParameters) mo34277f())) {
            AuthCredential a = EmailAuthProvider.m5975a(str, str2);
            if (AuthUI.f15909g.contains(idpResponse.mo34095n())) {
                c.mo38268g(a, authCredential, (FlowParameters) mo34277f()).mo23708i(new C10275b(a)).mo23705f(new C10274a());
            } else {
                c.mo38270i(a, (FlowParameters) mo34277f()).mo23702c(new C10276c(a));
            }
        } else {
            mo34264k().mo22627t(str, str2).mo23712m(new C10279f(authCredential, idpResponse2)).mo23708i(new C10278e(idpResponse2)).mo23705f(new C10277d()).mo23705f(new C8211j("WBPasswordHandler", "signInWithEmailAndPassword failed."));
        }
    }
}
