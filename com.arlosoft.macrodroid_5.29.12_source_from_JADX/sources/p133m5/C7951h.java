package p133m5;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.User;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import p159r5.C8211j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.h */
/* compiled from: ProfileMerger */
public class C7951h implements Continuation<AuthResult, Task<AuthResult>> {

    /* renamed from: a */
    private final IdpResponse f19080a;

    /* renamed from: m5.h$a */
    /* compiled from: ProfileMerger */
    class C7952a implements Continuation<Void, Task<AuthResult>> {

        /* renamed from: a */
        final /* synthetic */ AuthResult f19081a;

        C7952a(AuthResult authResult) {
            this.f19081a = authResult;
        }

        /* renamed from: b */
        public Task<AuthResult> mo21119a(@NonNull Task<Void> task) {
            return Tasks.m66667f(this.f19081a);
        }
    }

    public C7951h(IdpResponse idpResponse) {
        this.f19080a = idpResponse;
    }

    /* renamed from: b */
    public Task<AuthResult> mo21119a(@NonNull Task<AuthResult> task) {
        AuthResult p = task.mo23715p();
        FirebaseUser user = p.getUser();
        String p0 = user.mo22651p0();
        Uri o2 = user.mo22650o2();
        if (!TextUtils.isEmpty(p0) && o2 != null) {
            return Tasks.m66667f(p);
        }
        User o = this.f19080a.mo34096o();
        if (TextUtils.isEmpty(p0)) {
            p0 = o.mo34159b();
        }
        if (o2 == null) {
            o2 = o.mo34160c();
        }
        return user.mo22659w2(new UserProfileChangeRequest.Builder().mo22723b(p0).mo22724c(o2).mo22722a()).mo23705f(new C8211j("ProfileMerger", "Error updating profile")).mo23712m(new C7952a(p));
    }
}
