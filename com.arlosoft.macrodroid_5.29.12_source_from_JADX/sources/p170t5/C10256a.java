package p170t5;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.viewmodel.C6902a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import p127l5.C7688b;
import p159r5.C8198a;
import p159r5.C8200b;
import p159r5.C8202d;
import p159r5.C8210i;

/* renamed from: t5.a */
/* compiled from: EmailLinkSendEmailHandler */
public class C10256a extends C6902a<String> {

    /* renamed from: t5.a$a */
    /* compiled from: EmailLinkSendEmailHandler */
    class C10257a implements OnCompleteListener<Void> {

        /* renamed from: a */
        final /* synthetic */ String f23391a;

        /* renamed from: c */
        final /* synthetic */ String f23392c;

        /* renamed from: d */
        final /* synthetic */ String f23393d;

        C10257a(String str, String str2, String str3) {
            this.f23391a = str;
            this.f23392c = str2;
            this.f23393d = str3;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<Void> task) {
            if (task.mo23719t()) {
                C8202d.m34038b().mo38284d(C10256a.this.getApplication(), this.f23391a, this.f23392c, this.f23393d);
                C10256a.this.mo34268j(C7688b.m32060c(this.f23391a));
                return;
            }
            C10256a.this.mo34268j(C7688b.m32058a(task.mo23714o()));
        }
    }

    public C10256a(Application application) {
        super(application);
    }

    /* renamed from: p */
    private ActionCodeSettings m40325p(@NonNull ActionCodeSettings actionCodeSettings, @NonNull String str, @NonNull String str2, @Nullable IdpResponse idpResponse, boolean z) {
        C8200b bVar = new C8200b(actionCodeSettings.mo22559q2());
        bVar.mo38275e(str);
        bVar.mo38272b(str2);
        bVar.mo38273c(z);
        if (idpResponse != null) {
            bVar.mo38274d(idpResponse.mo34095n());
        }
        return ActionCodeSettings.m5929r2().mo22571e(bVar.mo38276f()).mo22569c(true).mo22568b(actionCodeSettings.mo22557o2(), actionCodeSettings.mo22555m2(), actionCodeSettings.mo22556n2()).mo22570d(actionCodeSettings.mo22558p2()).mo22567a();
    }

    /* renamed from: q */
    public void mo40874q(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings, @Nullable IdpResponse idpResponse, boolean z) {
        if (mo34264k() != null) {
            mo34268j(C7688b.m32059b());
            String r2 = C8198a.m34015c().mo38265a(mo34264k(), (FlowParameters) mo34277f()) ? mo34264k().mo22613g().mo22654r2() : null;
            String a = C8210i.m34090a(10);
            mo34264k().mo22622o(str, m40325p(actionCodeSettings, a, r2, idpResponse, z)).mo23702c(new C10257a(str, a, r2));
        }
    }
}
