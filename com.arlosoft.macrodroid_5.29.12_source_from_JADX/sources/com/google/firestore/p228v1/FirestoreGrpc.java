package com.google.firestore.p228v1;

import p292io.grpc.C12542c;
import p292io.grpc.C12548d;
import p292io.grpc.C12972r0;
import p378r9.C16366b;
import p387s9.C16509a;
import p387s9.C16510b;
import p387s9.C16511c;
import p387s9.C16512d;

/* renamed from: com.google.firestore.v1.FirestoreGrpc */
public final class FirestoreGrpc {

    /* renamed from: a */
    private static volatile C12972r0<CommitRequest, CommitResponse> f55607a;

    /* renamed from: b */
    private static volatile C12972r0<WriteRequest, WriteResponse> f55608b;

    /* renamed from: c */
    private static volatile C12972r0<ListenRequest, ListenResponse> f55609c;

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$FirestoreBlockingStub */
    public static final class FirestoreBlockingStub extends C16510b<FirestoreBlockingStub> {
        /* access modifiers changed from: protected */
        /* renamed from: e */
        public FirestoreBlockingStub mo63817a(C12548d dVar, C12542c cVar) {
            return new FirestoreBlockingStub(dVar, cVar);
        }

        private FirestoreBlockingStub(C12548d dVar, C12542c cVar) {
            super(dVar, cVar);
        }
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$FirestoreFutureStub */
    public static final class FirestoreFutureStub extends C16511c<FirestoreFutureStub> {
        /* access modifiers changed from: protected */
        /* renamed from: e */
        public FirestoreFutureStub mo63817a(C12548d dVar, C12542c cVar) {
            return new FirestoreFutureStub(dVar, cVar);
        }

        private FirestoreFutureStub(C12548d dVar, C12542c cVar) {
            super(dVar, cVar);
        }
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$FirestoreImplBase */
    public static abstract class FirestoreImplBase {
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$FirestoreStub */
    public static final class FirestoreStub extends C16509a<FirestoreStub> {
        /* access modifiers changed from: protected */
        /* renamed from: g */
        public FirestoreStub mo63817a(C12548d dVar, C12542c cVar) {
            return new FirestoreStub(dVar, cVar);
        }

        private FirestoreStub(C12548d dVar, C12542c cVar) {
            super(dVar, cVar);
        }
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$MethodHandlers */
    private static final class MethodHandlers<Req, Resp> {
    }

    private FirestoreGrpc() {
    }

    /* renamed from: a */
    public static C12972r0<CommitRequest, CommitResponse> m77865a() {
        C12972r0<CommitRequest, CommitResponse> r0Var = f55607a;
        if (r0Var == null) {
            synchronized (FirestoreGrpc.class) {
                r0Var = f55607a;
                if (r0Var == null) {
                    r0Var = C12972r0.m85114g().mo69799f(C12972r0.C12976d.UNARY).mo69795b(C12972r0.m85113b("google.firestore.v1.Firestore", "Commit")).mo69798e(true).mo69796c(C16366b.m98118b(CommitRequest.m77752Y())).mo69797d(C16366b.m98118b(CommitResponse.m77759V())).mo69794a();
                    f55607a = r0Var;
                }
            }
        }
        return r0Var;
    }

    /* renamed from: b */
    public static C12972r0<ListenRequest, ListenResponse> m77866b() {
        C12972r0<ListenRequest, ListenResponse> r0Var = f55609c;
        if (r0Var == null) {
            synchronized (FirestoreGrpc.class) {
                r0Var = f55609c;
                if (r0Var == null) {
                    r0Var = C12972r0.m85114g().mo69799f(C12972r0.C12976d.BIDI_STREAMING).mo69795b(C12972r0.m85113b("google.firestore.v1.Firestore", "Listen")).mo69798e(true).mo69796c(C16366b.m98118b(ListenRequest.m77896Y())).mo69797d(C16366b.m98118b(ListenResponse.m77909U())).mo69794a();
                    f55609c = r0Var;
                }
            }
        }
        return r0Var;
    }

    /* renamed from: c */
    public static C12972r0<WriteRequest, WriteResponse> m77867c() {
        C12972r0<WriteRequest, WriteResponse> r0Var = f55608b;
        if (r0Var == null) {
            synchronized (FirestoreGrpc.class) {
                r0Var = f55608b;
                if (r0Var == null) {
                    r0Var = C12972r0.m85114g().mo69799f(C12972r0.C12976d.BIDI_STREAMING).mo69795b(C12972r0.m85113b("google.firestore.v1.Firestore", "Write")).mo69798e(true).mo69796c(C16366b.m98118b(WriteRequest.m78256Z())).mo69797d(C16366b.m98118b(WriteResponse.m78265V())).mo69794a();
                    f55608b = r0Var;
                }
            }
        }
        return r0Var;
    }

    /* renamed from: d */
    public static FirestoreStub m77868d(C12548d dVar) {
        return (FirestoreStub) C16509a.m98597e(new C16512d.C16513a<FirestoreStub>() {
            /* renamed from: b */
            public FirestoreStub mo63813a(C12548d dVar, C12542c cVar) {
                return new FirestoreStub(dVar, cVar);
            }
        }, dVar);
    }
}
