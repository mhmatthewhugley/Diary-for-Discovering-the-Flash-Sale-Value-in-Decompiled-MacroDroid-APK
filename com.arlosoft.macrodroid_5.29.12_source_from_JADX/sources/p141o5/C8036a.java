package p141o5;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.viewmodel.C6902a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p127l5.C7688b;
import p159r5.C8207h;

/* renamed from: o5.a */
/* compiled from: CheckEmailHandler */
public class C8036a extends C6902a<User> {

    /* renamed from: o5.a$a */
    /* compiled from: CheckEmailHandler */
    class C8037a implements OnCompleteListener<String> {

        /* renamed from: a */
        final /* synthetic */ String f19559a;

        C8037a(String str) {
            this.f19559a = str;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<String> task) {
            if (task.mo23719t()) {
                C8036a.this.mo34268j(C7688b.m32060c(new User.C6853b(task.mo23715p(), this.f19559a).mo34171a()));
            } else {
                C8036a.this.mo34268j(C7688b.m32058a(task.mo23714o()));
            }
        }
    }

    /* renamed from: o5.a$b */
    /* compiled from: CheckEmailHandler */
    class C8038b implements OnCompleteListener<String> {

        /* renamed from: a */
        final /* synthetic */ String f19561a;

        /* renamed from: c */
        final /* synthetic */ Credential f19562c;

        C8038b(String str, Credential credential) {
            this.f19561a = str;
            this.f19562c = credential;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<String> task) {
            if (task.mo23719t()) {
                C8036a.this.mo34268j(C7688b.m32060c(new User.C6853b(task.mo23715p(), this.f19561a).mo34172b(this.f19562c.getName()).mo34174d(this.f19562c.mo20815q2()).mo34171a()));
            } else {
                C8036a.this.mo34268j(C7688b.m32058a(task.mo23714o()));
            }
        }
    }

    public C8036a(Application application) {
        super(application);
    }

    /* renamed from: r */
    public void mo37937r() {
        mo34268j(C7688b.m32058a(new PendingIntentRequiredException(Credentials.m3214b(getApplication()).mo20846I(new HintRequest.Builder().mo20859b(true).mo20858a()), 101)));
    }

    /* renamed from: s */
    public void mo37938s(String str) {
        mo34268j(C7688b.m32059b());
        C8207h.m34076c(mo34264k(), (FlowParameters) mo34277f(), str).mo23702c(new C8037a(str));
    }

    /* renamed from: t */
    public void mo37939t(int i, int i2, @Nullable Intent intent) {
        if (i == 101 && i2 == -1) {
            mo34268j(C7688b.m32059b());
            Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
            String id = credential.getId();
            C8207h.m34076c(mo34264k(), (FlowParameters) mo34277f(), id).mo23702c(new C8038b(id, credential));
        }
    }
}
