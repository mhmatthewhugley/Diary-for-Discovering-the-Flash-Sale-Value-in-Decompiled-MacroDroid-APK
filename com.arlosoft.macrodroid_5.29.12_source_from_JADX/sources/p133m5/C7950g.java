package p133m5;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.phone.PhoneActivity;
import com.google.firebase.auth.FirebaseAuth;
import p127l5.C7688b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.g */
/* compiled from: PhoneSignInHandler */
public class C7950g extends C7959j<AuthUI.IdpConfig> {
    public C7950g(Application application) {
        super(application, "phone");
    }

    /* renamed from: l */
    public void mo34270l(int i, int i2, @Nullable Intent intent) {
        if (i == 107) {
            IdpResponse g = IdpResponse.m25763g(intent);
            if (g == null) {
                mo34268j(C7688b.m32058a(new UserCancellationException()));
            } else {
                mo34268j(C7688b.m32060c(g));
            }
        }
    }

    /* renamed from: m */
    public void mo34271m(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        helperActivityBase.startActivityForResult(PhoneActivity.m26025W1(helperActivityBase, helperActivityBase.mo34180O1(), ((AuthUI.IdpConfig) mo34277f()).mo34056a()), 107);
    }
}
