package com.google.firebase.firestore.remote;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import java.util.concurrent.Executor;
import org.apache.http.auth.AUTH;
import p292io.grpc.C12530b;
import p292io.grpc.C12537b1;
import p292io.grpc.C12960q0;

final class FirestoreCallCredentials extends C12530b {

    /* renamed from: b */
    private static final C12960q0.C12967g<String> f54573b = C12960q0.C12967g.m85092e(AUTH.WWW_AUTH_RESP, C12960q0.f60666d);

    /* renamed from: a */
    private final CredentialsProvider f54574a;

    FirestoreCallCredentials(CredentialsProvider credentialsProvider) {
        this.f54574a = credentialsProvider;
    }

    /* renamed from: b */
    static /* synthetic */ void m76180b(C12530b.C12531a aVar, String str) {
        Logger.m76508a("FirestoreCallCredentials", "Successfully fetched token.", new Object[0]);
        C12960q0 q0Var = new C12960q0();
        if (str != null) {
            C12960q0.C12967g<String> gVar = f54573b;
            q0Var.mo69768o(gVar, "Bearer " + str);
        }
        aVar.mo69048a(q0Var);
    }

    /* renamed from: c */
    static /* synthetic */ void m76181c(C12530b.C12531a aVar, Exception exc) {
        if (exc instanceof FirebaseApiNotAvailableException) {
            Logger.m76508a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            aVar.mo69048a(new C12960q0());
        } else if (exc instanceof FirebaseNoSignedInUserException) {
            Logger.m76508a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            aVar.mo69048a(new C12960q0());
        } else {
            Logger.m76511d("FirestoreCallCredentials", "Failed to get token: %s.", exc);
            aVar.mo69049b(C12537b1.f59415n.mo69065p(exc));
        }
    }

    /* renamed from: a */
    public void mo63026a(C12530b.C12532b bVar, Executor executor, C12530b.C12531a aVar) {
        this.f54574a.mo23754a().mo23709j(executor, FirestoreCallCredentials$$Lambda$1.m76183a(aVar)).mo23706g(executor, FirestoreCallCredentials$$Lambda$2.m76185a(aVar));
    }
}
