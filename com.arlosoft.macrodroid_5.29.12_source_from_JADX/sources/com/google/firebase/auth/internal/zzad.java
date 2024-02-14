package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzad implements Continuation {

    /* renamed from: a */
    final /* synthetic */ zzae f4583a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(@NonNull Task task) throws Exception {
        if (this.f4583a.f4587f == null) {
            return task;
        }
        if (task.mo23719t()) {
            AuthResult authResult = (AuthResult) task.mo23715p();
            return Tasks.m66667f(new zzr((zzx) authResult.getUser(), (zzp) authResult.mo22579N1(), this.f4583a.f4587f));
        }
        Exception o = task.mo23714o();
        if (o instanceof FirebaseAuthUserCollisionException) {
            ((FirebaseAuthUserCollisionException) o).mo22638d(this.f4583a.f4587f);
        }
        return Tasks.m66666e(o);
    }
}
