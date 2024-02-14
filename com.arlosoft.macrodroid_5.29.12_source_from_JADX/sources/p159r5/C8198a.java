package p159r5;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OAuthProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.a */
/* compiled from: AuthOperationManager */
public class C8198a {

    /* renamed from: b */
    private static String f19870b = "FUIScratchApp";

    /* renamed from: c */
    private static C8198a f19871c;
    @VisibleForTesting

    /* renamed from: a */
    public FirebaseAuth f19872a;

    /* renamed from: r5.a$a */
    /* compiled from: AuthOperationManager */
    class C8199a implements Continuation<AuthResult, Task<AuthResult>> {

        /* renamed from: a */
        final /* synthetic */ AuthCredential f19873a;

        C8199a(AuthCredential authCredential) {
            this.f19873a = authCredential;
        }

        /* renamed from: b */
        public Task<AuthResult> mo21119a(@NonNull Task<AuthResult> task) throws Exception {
            return task.mo23719t() ? task.mo23715p().getUser().mo22656t2(this.f19873a) : task;
        }
    }

    private C8198a() {
    }

    /* renamed from: c */
    public static synchronized C8198a m34015c() {
        C8198a aVar;
        synchronized (C8198a.class) {
            if (f19871c == null) {
                f19871c = new C8198a();
            }
            aVar = f19871c;
        }
        return aVar;
    }

    /* renamed from: d */
    private FirebaseApp m34016d(FirebaseApp firebaseApp) {
        try {
            return FirebaseApp.m74384n(f19870b);
        } catch (IllegalStateException unused) {
            return FirebaseApp.m74388u(firebaseApp.mo61950l(), firebaseApp.mo61952p(), f19870b);
        }
    }

    /* renamed from: e */
    private FirebaseAuth m34017e(FlowParameters flowParameters) {
        if (this.f19872a == null) {
            AuthUI l = AuthUI.m25699l(flowParameters.f15984a);
            this.f19872a = FirebaseAuth.getInstance(m34016d(l.mo34050d()));
            if (l.mo34054m()) {
                this.f19872a.mo22631x(l.mo34052h(), l.mo34053i());
            }
        }
        return this.f19872a;
    }

    /* renamed from: a */
    public boolean mo38265a(FirebaseAuth firebaseAuth, FlowParameters flowParameters) {
        return flowParameters.mo34140c() && firebaseAuth.mo22613g() != null && firebaseAuth.mo22613g().mo22655s2();
    }

    /* renamed from: b */
    public Task<AuthResult> mo38266b(@NonNull FirebaseAuth firebaseAuth, @NonNull FlowParameters flowParameters, @NonNull String str, @NonNull String str2) {
        if (!mo38265a(firebaseAuth, flowParameters)) {
            return firebaseAuth.mo22610d(str, str2);
        }
        return firebaseAuth.mo22613g().mo22656t2(EmailAuthProvider.m5975a(str, str2));
    }

    @NonNull
    /* renamed from: f */
    public Task<AuthResult> mo38267f(@NonNull HelperActivityBase helperActivityBase, @NonNull OAuthProvider oAuthProvider, @NonNull FlowParameters flowParameters) {
        return m34017e(flowParameters).mo22629v(helperActivityBase, oAuthProvider);
    }

    /* renamed from: g */
    public Task<AuthResult> mo38268g(AuthCredential authCredential, AuthCredential authCredential2, FlowParameters flowParameters) {
        return m34017e(flowParameters).mo22626s(authCredential).mo23712m(new C8199a(authCredential2));
    }

    /* renamed from: h */
    public Task<AuthResult> mo38269h(@NonNull FirebaseAuth firebaseAuth, @NonNull FlowParameters flowParameters, @NonNull AuthCredential authCredential) {
        if (mo38265a(firebaseAuth, flowParameters)) {
            return firebaseAuth.mo22613g().mo22656t2(authCredential);
        }
        return firebaseAuth.mo22626s(authCredential);
    }

    @NonNull
    /* renamed from: i */
    public Task<AuthResult> mo38270i(AuthCredential authCredential, FlowParameters flowParameters) {
        return m34017e(flowParameters).mo22626s(authCredential);
    }
}
