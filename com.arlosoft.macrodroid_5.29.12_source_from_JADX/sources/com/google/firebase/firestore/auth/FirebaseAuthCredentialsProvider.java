package com.google.firebase.firestore.auth;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.inject.Provider;

public final class FirebaseAuthCredentialsProvider extends CredentialsProvider {

    /* renamed from: a */
    private final IdTokenListener f5762a;
    @GuardedBy("this")
    @Nullable

    /* renamed from: b */
    private InternalAuthProvider f5763b;
    @GuardedBy("this")
    @Nullable

    /* renamed from: c */
    private Listener<User> f5764c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f5765d;
    @GuardedBy("this")

    /* renamed from: e */
    private boolean f5766e;

    /* renamed from: c */
    private synchronized User m7929c() {
        String uid;
        InternalAuthProvider internalAuthProvider = this.f5763b;
        uid = internalAuthProvider == null ? null : internalAuthProvider.getUid();
        return uid != null ? new User(uid) : User.f5771b;
    }

    /* renamed from: d */
    static /* synthetic */ Task m7930d(FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, int i, Task task) throws Exception {
        synchronized (firebaseAuthCredentialsProvider) {
            if (i != firebaseAuthCredentialsProvider.f5765d) {
                Logger.m76508a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                Task<String> a = firebaseAuthCredentialsProvider.mo23754a();
                return a;
            } else if (task.mo23719t()) {
                Task f = Tasks.m66667f(((GetTokenResult) task.mo23715p()).mo22665c());
                return f;
            } else {
                Task e = Tasks.m66666e(task.mo23714o());
                return e;
            }
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m7932f(FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, Provider provider) {
        synchronized (firebaseAuthCredentialsProvider) {
            firebaseAuthCredentialsProvider.f5763b = (InternalAuthProvider) provider.get();
            firebaseAuthCredentialsProvider.m7933g();
            firebaseAuthCredentialsProvider.f5763b.mo22608b(firebaseAuthCredentialsProvider.f5762a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m7933g() {
        this.f5765d++;
        Listener<User> listener = this.f5764c;
        if (listener != null) {
            listener.mo23881a(m7929c());
        }
    }

    /* renamed from: a */
    public synchronized Task<String> mo23754a() {
        InternalAuthProvider internalAuthProvider = this.f5763b;
        if (internalAuthProvider == null) {
            return Tasks.m66666e(new FirebaseApiNotAvailableException("auth is not available"));
        }
        Task<GetTokenResult> a = internalAuthProvider.mo22607a(this.f5766e);
        this.f5766e = false;
        return a.mo23713n(Executors.f54770b, FirebaseAuthCredentialsProvider$$Lambda$3.m7938b(this, this.f5765d));
    }

    /* renamed from: b */
    public synchronized void mo23755b() {
        this.f5766e = true;
    }
}
