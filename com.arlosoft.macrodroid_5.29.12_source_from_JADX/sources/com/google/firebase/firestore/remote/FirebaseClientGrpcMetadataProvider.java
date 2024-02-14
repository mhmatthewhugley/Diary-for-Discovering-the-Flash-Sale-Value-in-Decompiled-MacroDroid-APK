package com.google.firebase.firestore.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import p292io.grpc.C12960q0;

public class FirebaseClientGrpcMetadataProvider implements GrpcMetadataProvider {

    /* renamed from: d */
    private static final C12960q0.C12967g<String> f54567d;

    /* renamed from: e */
    private static final C12960q0.C12967g<String> f54568e;

    /* renamed from: f */
    private static final C12960q0.C12967g<String> f54569f;

    /* renamed from: a */
    private final Provider<HeartBeatInfo> f54570a;

    /* renamed from: b */
    private final Provider<UserAgentPublisher> f54571b;

    /* renamed from: c */
    private final FirebaseOptions f54572c;

    static {
        C12960q0.C12964d<String> dVar = C12960q0.f60666d;
        f54567d = C12960q0.C12967g.m85092e("x-firebase-client-log-type", dVar);
        f54568e = C12960q0.C12967g.m85092e("x-firebase-client", dVar);
        f54569f = C12960q0.C12967g.m85092e("x-firebase-gmpid", dVar);
    }

    public FirebaseClientGrpcMetadataProvider(@NonNull Provider<UserAgentPublisher> provider, @NonNull Provider<HeartBeatInfo> provider2, @Nullable FirebaseOptions firebaseOptions) {
        this.f54571b = provider;
        this.f54570a = provider2;
        this.f54572c = firebaseOptions;
    }

    /* renamed from: b */
    private void m76178b(@NonNull C12960q0 q0Var) {
        FirebaseOptions firebaseOptions = this.f54572c;
        if (firebaseOptions != null) {
            String c = firebaseOptions.mo61962c();
            if (c.length() != 0) {
                q0Var.mo69768o(f54569f, c);
            }
        }
    }

    /* renamed from: a */
    public void mo63025a(@NonNull C12960q0 q0Var) {
        if (this.f54570a.get() != null && this.f54571b.get() != null) {
            int b = this.f54570a.get().mo63202b("fire-fst").mo63204b();
            if (b != 0) {
                q0Var.mo69768o(f54567d, Integer.toString(b));
            }
            q0Var.mo69768o(f54568e, this.f54571b.get().mo63499a());
            m76178b(q0Var);
        }
    }
}
