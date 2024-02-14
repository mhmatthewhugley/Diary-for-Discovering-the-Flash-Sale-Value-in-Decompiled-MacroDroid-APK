package p170t5;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.viewmodel.C6906e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import p127l5.C7688b;
import p133m5.C7951h;
import p159r5.C8198a;
import p159r5.C8201c;
import p159r5.C8202d;
import p159r5.C8207h;
import p159r5.C8211j;

/* renamed from: t5.b */
/* compiled from: EmailLinkSignInHandler */
public class C10258b extends C6906e {

    /* renamed from: t5.b$a */
    /* compiled from: EmailLinkSignInHandler */
    class C10259a implements OnCompleteListener<ActionCodeResult> {

        /* renamed from: a */
        final /* synthetic */ String f23395a;

        C10259a(String str) {
            this.f23395a = str;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<ActionCodeResult> task) {
            if (!task.mo23719t()) {
                C10258b.this.mo34276q(C7688b.m32058a(new FirebaseUiException(7)));
            } else if (!TextUtils.isEmpty(this.f23395a)) {
                C10258b.this.mo34276q(C7688b.m32058a(new FirebaseUiException(10)));
            } else {
                C10258b.this.mo34276q(C7688b.m32058a(new FirebaseUiException(9)));
            }
        }
    }

    /* renamed from: t5.b$b */
    /* compiled from: EmailLinkSignInHandler */
    class C10260b implements OnCompleteListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ C8202d f23397a;

        /* renamed from: c */
        final /* synthetic */ AuthCredential f23398c;

        C10260b(C8202d dVar, AuthCredential authCredential) {
            this.f23397a = dVar;
            this.f23398c = authCredential;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<AuthResult> task) {
            this.f23397a.mo38282a(C10258b.this.getApplication());
            if (task.mo23719t()) {
                C10258b.this.mo34274o(this.f23398c);
            } else {
                C10258b.this.mo34276q(C7688b.m32058a(task.mo23714o()));
            }
        }
    }

    /* renamed from: t5.b$c */
    /* compiled from: EmailLinkSignInHandler */
    class C10261c implements OnFailureListener {
        C10261c() {
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            C10258b.this.mo34276q(C7688b.m32058a(exc));
        }
    }

    /* renamed from: t5.b$d */
    /* compiled from: EmailLinkSignInHandler */
    class C10262d implements OnSuccessListener<AuthResult> {
        C10262d() {
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            FirebaseUser user = authResult.getUser();
            C10258b.this.mo34275p(new IdpResponse.C6845b(new User.C6853b("emailLink", user.mo22647l2()).mo34172b(user.mo22651p0()).mo34174d(user.mo22650o2()).mo34171a()).mo34109a(), authResult);
        }
    }

    /* renamed from: t5.b$e */
    /* compiled from: EmailLinkSignInHandler */
    class C10263e implements Continuation<AuthResult, Task<AuthResult>> {

        /* renamed from: a */
        final /* synthetic */ C8202d f23402a;

        /* renamed from: b */
        final /* synthetic */ AuthCredential f23403b;

        /* renamed from: c */
        final /* synthetic */ IdpResponse f23404c;

        C10263e(C8202d dVar, AuthCredential authCredential, IdpResponse idpResponse) {
            this.f23402a = dVar;
            this.f23403b = authCredential;
            this.f23404c = idpResponse;
        }

        /* renamed from: b */
        public Task<AuthResult> mo21119a(@NonNull Task<AuthResult> task) {
            this.f23402a.mo38282a(C10258b.this.getApplication());
            if (!task.mo23719t()) {
                return task;
            }
            return task.mo23715p().getUser().mo22656t2(this.f23403b).mo23712m(new C7951h(this.f23404c)).mo23705f(new C8211j("EmailLinkSignInHandler", "linkWithCredential+merge failed."));
        }
    }

    /* renamed from: t5.b$f */
    /* compiled from: EmailLinkSignInHandler */
    class C10264f implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ C8202d f23406a;

        /* renamed from: b */
        final /* synthetic */ AuthCredential f23407b;

        C10264f(C8202d dVar, AuthCredential authCredential) {
            this.f23406a = dVar;
            this.f23407b = authCredential;
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            this.f23406a.mo38282a(C10258b.this.getApplication());
            if (exc instanceof FirebaseAuthUserCollisionException) {
                C10258b.this.mo34274o(this.f23407b);
            } else {
                C10258b.this.mo34276q(C7688b.m32058a(exc));
            }
        }
    }

    /* renamed from: t5.b$g */
    /* compiled from: EmailLinkSignInHandler */
    class C10265g implements OnSuccessListener<AuthResult> {

        /* renamed from: a */
        final /* synthetic */ C8202d f23409a;

        C10265g(C8202d dVar) {
            this.f23409a = dVar;
        }

        /* renamed from: a */
        public void mo22751b(AuthResult authResult) {
            this.f23409a.mo38282a(C10258b.this.getApplication());
            FirebaseUser user = authResult.getUser();
            C10258b.this.mo34275p(new IdpResponse.C6845b(new User.C6853b("emailLink", user.mo22647l2()).mo34172b(user.mo22651p0()).mo34174d(user.mo22650o2()).mo34171a()).mo34109a(), authResult);
        }
    }

    public C10258b(Application application) {
        super(application);
    }

    /* renamed from: B */
    private void m40329B(@NonNull String str, @Nullable String str2) {
        mo34264k().mo22609c(str).mo23702c(new C10259a(str2));
    }

    /* renamed from: D */
    private void m40330D(@NonNull String str, @Nullable IdpResponse idpResponse) {
        if (TextUtils.isEmpty(str)) {
            mo34276q(C7688b.m32058a(new FirebaseUiException(6)));
            return;
        }
        C8198a c = C8198a.m34015c();
        C8202d b = C8202d.m34038b();
        String str2 = ((FlowParameters) mo34277f()).f15991s;
        if (idpResponse == null) {
            m40333G(c, b, str, str2);
        } else {
            m40332F(c, b, idpResponse, str2);
        }
    }

    /* renamed from: E */
    private void m40331E(C8202d.C8203a aVar) {
        m40330D(aVar.mo38286a(), aVar.mo38287b());
    }

    /* renamed from: F */
    private void m40332F(C8198a aVar, C8202d dVar, IdpResponse idpResponse, String str) {
        AuthCredential d = C8207h.m34077d(idpResponse);
        AuthCredential b = EmailAuthProvider.m5976b(idpResponse.mo34091i(), str);
        if (aVar.mo38265a(mo34264k(), (FlowParameters) mo34277f())) {
            aVar.mo38268g(b, d, (FlowParameters) mo34277f()).mo23702c(new C10260b(dVar, d));
        } else {
            mo34264k().mo22626s(b).mo23712m(new C10263e(dVar, d, idpResponse)).mo23708i(new C10262d()).mo23705f(new C10261c());
        }
    }

    /* renamed from: G */
    private void m40333G(C8198a aVar, C8202d dVar, String str, String str2) {
        aVar.mo38269h(mo34264k(), (FlowParameters) mo34277f(), EmailAuthProvider.m5976b(str, str2)).mo23708i(new C10265g(dVar)).mo23705f(new C10264f(dVar, EmailAuthProvider.m5976b(str, str2)));
    }

    /* renamed from: H */
    private boolean m40334H(C8202d.C8203a aVar, String str) {
        return aVar == null || TextUtils.isEmpty(aVar.mo38288c()) || TextUtils.isEmpty(str) || !str.equals(aVar.mo38288c());
    }

    /* renamed from: C */
    public void mo40875C(String str) {
        mo34276q(C7688b.m32059b());
        m40330D(str, (IdpResponse) null);
    }

    /* renamed from: I */
    public void mo40876I() {
        mo34276q(C7688b.m32059b());
        String str = ((FlowParameters) mo34277f()).f15991s;
        if (!mo34264k().mo22619l(str)) {
            mo34276q(C7688b.m32058a(new FirebaseUiException(7)));
            return;
        }
        C8202d.C8203a c = C8202d.m34038b().mo38283c(getApplication());
        C8201c cVar = new C8201c(str);
        String e = cVar.mo38281e();
        String a = cVar.mo38277a();
        String c2 = cVar.mo38279c();
        String d = cVar.mo38280d();
        boolean b = cVar.mo38278b();
        if (m40334H(c, e)) {
            if (TextUtils.isEmpty(e)) {
                mo34276q(C7688b.m32058a(new FirebaseUiException(7)));
            } else if (b || !TextUtils.isEmpty(a)) {
                mo34276q(C7688b.m32058a(new FirebaseUiException(8)));
            } else {
                m40329B(c2, d);
            }
        } else if (a == null || (mo34264k().mo22613g() != null && (!mo34264k().mo22613g().mo22655s2() || a.equals(mo34264k().mo22613g().mo22654r2())))) {
            m40331E(c);
        } else {
            mo34276q(C7688b.m32058a(new FirebaseUiException(11)));
        }
    }
}
