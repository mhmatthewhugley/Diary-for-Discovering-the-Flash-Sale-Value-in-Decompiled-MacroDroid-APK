package p147p5;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.p073ui.auth.viewmodel.C6902a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.HintRequest;
import p127l5.C7687a;
import p127l5.C7688b;
import p159r5.C8204e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: p5.a */
/* compiled from: CheckPhoneHandler */
public class C8137a extends C6902a<C7687a> {
    public C8137a(Application application) {
        super(application);
    }

    /* renamed from: n */
    public void mo38148n() {
        mo34268j(C7688b.m32058a(new PendingIntentRequiredException(Credentials.m3214b(getApplication()).mo20846I(new HintRequest.Builder().mo20860c(true).mo20858a()), 101)));
    }

    /* renamed from: o */
    public void mo38149o(int i, int i2, @Nullable Intent intent) {
        String c;
        if (i == 101 && i2 == -1 && (c = C8204e.m34050c(((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential")).getId(), getApplication())) != null) {
            mo34268j(C7688b.m32060c(C8204e.m34059l(c)));
        }
    }
}
