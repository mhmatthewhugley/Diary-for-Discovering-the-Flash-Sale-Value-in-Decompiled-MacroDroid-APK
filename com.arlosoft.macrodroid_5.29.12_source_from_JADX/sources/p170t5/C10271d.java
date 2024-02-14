package p170t5;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.viewmodel.C6902a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import p127l5.C7688b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: t5.d */
/* compiled from: RecoverPasswordHandler */
public class C10271d extends C6902a<String> {

    /* renamed from: t5.d$a */
    /* compiled from: RecoverPasswordHandler */
    class C10272a implements OnCompleteListener<Void> {

        /* renamed from: a */
        final /* synthetic */ String f23420a;

        C10272a(String str) {
            this.f23420a = str;
        }

        /* renamed from: a */
        public void mo21120a(@NonNull Task<Void> task) {
            C7688b bVar;
            if (task.mo23719t()) {
                bVar = C7688b.m32060c(this.f23420a);
            } else {
                bVar = C7688b.m32058a(task.mo23714o());
            }
            C10271d.this.mo34268j(bVar);
        }
    }

    public C10271d(Application application) {
        super(application);
    }

    /* renamed from: o */
    public void mo40883o(@NonNull String str, @Nullable ActionCodeSettings actionCodeSettings) {
        Task<Void> task;
        mo34268j(C7688b.m32059b());
        if (actionCodeSettings != null) {
            task = mo34264k().mo22621n(str, actionCodeSettings);
        } else {
            task = mo34264k().mo22620m(str);
        }
        task.mo23702c(new C10272a(str));
    }
}
