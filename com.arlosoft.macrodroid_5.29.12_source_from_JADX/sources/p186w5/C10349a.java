package p186w5;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.p073ui.auth.viewmodel.C6902a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p127l5.C7688b;
import p153q5.C8177a;
import p153q5.C8179c;
import p159r5.C8207h;

/* renamed from: w5.a */
/* compiled from: SmartLockHandler */
public class C10349a extends C6902a<IdpResponse> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public IdpResponse f23555f;

    /* renamed from: w5.a$a */
    /* compiled from: SmartLockHandler */
    class C10350a implements OnCompleteListener<Void> {
        C10350a() {
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<Void> task) {
            if (task.mo23719t()) {
                C10349a aVar = C10349a.this;
                aVar.mo34268j(C7688b.m32060c(aVar.f23555f));
            } else if (task.mo23714o() instanceof ResolvableApiException) {
                C10349a.this.mo34268j(C7688b.m32058a(new PendingIntentRequiredException(((ResolvableApiException) task.mo23714o()).mo21275c(), 100)));
            } else {
                Log.w("SmartLockViewModel", "Non-resolvable exception: " + task.mo23714o());
                C10349a.this.mo34268j(C7688b.m32058a(new FirebaseUiException(0, "Error when saving credential.", task.mo23714o())));
            }
        }
    }

    public C10349a(Application application) {
        super(application);
    }

    /* renamed from: r */
    private void m40635r() {
        if (this.f23555f.mo34095n().equals("google.com")) {
            C8179c.m33935a(getApplication()).mo20844G(C8177a.m33933b(mo34266m(), "pass", C8207h.m34081h("google.com")));
        }
    }

    /* renamed from: s */
    public void mo41009s(int i, int i2) {
        if (i != 100) {
            return;
        }
        if (i2 == -1) {
            mo34268j(C7688b.m32060c(this.f23555f));
            return;
        }
        Log.e("SmartLockViewModel", "SAVE: Canceled by user.");
        mo34268j(C7688b.m32058a(new FirebaseUiException(0, "Save canceled by user.")));
    }

    /* renamed from: t */
    public void mo41010t(@Nullable Credential credential) {
        if (!((FlowParameters) mo34277f()).f15978A) {
            mo34268j(C7688b.m32060c(this.f23555f));
            return;
        }
        mo34268j(C7688b.m32059b());
        if (credential == null) {
            mo34268j(C7688b.m32058a(new FirebaseUiException(0, "Failed to build credential.")));
            return;
        }
        m40635r();
        mo34265l().mo20848K(credential).mo23702c(new C10350a());
    }

    /* renamed from: u */
    public void mo41011u(@NonNull IdpResponse idpResponse) {
        this.f23555f = idpResponse;
    }
}
