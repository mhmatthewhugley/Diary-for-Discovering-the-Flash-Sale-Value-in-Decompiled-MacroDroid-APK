package p133m5;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.email.EmailActivity;
import com.google.firebase.auth.FirebaseAuth;
import p127l5.C7688b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.b */
/* compiled from: EmailSignInHandler */
public class C7935b extends C7959j<Void> {
    public C7935b(Application application) {
        super(application, "password");
    }

    /* renamed from: l */
    public void mo34270l(int i, int i2, @Nullable Intent intent) {
        if (i2 != 5 && i == 106) {
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
        helperActivityBase.startActivityForResult(EmailActivity.m25848U1(helperActivityBase, helperActivityBase.mo34180O1()), 106);
    }
}
