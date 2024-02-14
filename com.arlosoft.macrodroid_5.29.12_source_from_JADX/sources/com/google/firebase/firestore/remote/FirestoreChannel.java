package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import p292io.grpc.C12537b1;
import p292io.grpc.C12558f;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.C13010y;

public class FirestoreChannel {

    /* renamed from: f */
    private static final C12960q0.C12967g<String> f54577f;

    /* renamed from: g */
    private static final C12960q0.C12967g<String> f54578g;

    /* renamed from: h */
    private static volatile String f54579h = "gl-java/";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AsyncQueue f54580a;

    /* renamed from: b */
    private final CredentialsProvider f54581b;

    /* renamed from: c */
    private final GrpcCallProvider f54582c;

    /* renamed from: d */
    private final String f54583d;

    /* renamed from: e */
    private final GrpcMetadataProvider f54584e;

    static {
        C12960q0.C12964d<String> dVar = C12960q0.f60666d;
        f54577f = C12960q0.C12967g.m85092e("x-goog-api-client", dVar);
        f54578g = C12960q0.C12967g.m85092e("google-cloud-resource-prefix", dVar);
    }

    FirestoreChannel(AsyncQueue asyncQueue, Context context, CredentialsProvider credentialsProvider, DatabaseInfo databaseInfo, GrpcMetadataProvider grpcMetadataProvider) {
        this.f54580a = asyncQueue;
        this.f54584e = grpcMetadataProvider;
        this.f54581b = credentialsProvider;
        this.f54582c = new GrpcCallProvider(asyncQueue, context, databaseInfo, new FirestoreCallCredentials(credentialsProvider));
        DatabaseId a = databaseInfo.mo23839a();
        this.f54583d = String.format("projects/%s/databases/%s", new Object[]{a.mo62814e(), a.mo62813d()});
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public FirebaseFirestoreException m76189c(C12537b1 b1Var) {
        if (Datastore.m76164d(b1Var)) {
            return new FirebaseFirestoreException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", FirebaseFirestoreException.Code.m7865d(b1Var.mo69062m().mo69069e()), b1Var.mo69061l());
        }
        return Util.m76527j(b1Var);
    }

    /* renamed from: d */
    private String m76190d() {
        return String.format("%s fire/%s grpc/", new Object[]{f54579h, "22.1.2"});
    }

    /* renamed from: f */
    static /* synthetic */ void m76191f(FirestoreChannel firestoreChannel, final C12558f[] fVarArr, final IncomingStreamObserver incomingStreamObserver, Task task) {
        fVarArr[0] = (C12558f) task.mo23715p();
        fVarArr[0].mo69133d(new C12558f.C12559a() {
            /* renamed from: a */
            public void mo63031a(C12537b1 b1Var, C12960q0 q0Var) {
                try {
                    incomingStreamObserver.mo63003a(b1Var);
                } catch (Throwable th) {
                    FirestoreChannel.this.f54580a.mo63155r(th);
                }
            }

            /* renamed from: b */
            public void mo63032b(C12960q0 q0Var) {
                try {
                    incomingStreamObserver.mo63005c(q0Var);
                } catch (Throwable th) {
                    FirestoreChannel.this.f54580a.mo63155r(th);
                }
            }

            /* renamed from: c */
            public void mo63033c(Object obj) {
                try {
                    incomingStreamObserver.onNext(obj);
                    fVarArr[0].mo69131b(1);
                } catch (Throwable th) {
                    FirestoreChannel.this.f54580a.mo63155r(th);
                }
            }

            /* renamed from: d */
            public void mo63034d() {
            }
        }, firestoreChannel.m76194i());
        incomingStreamObserver.mo63004b();
        fVarArr[0].mo69131b(1);
    }

    /* renamed from: g */
    static /* synthetic */ void m76192g(FirestoreChannel firestoreChannel, final TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        C12558f fVar = (C12558f) task.mo23715p();
        fVar.mo69133d(new C12558f.C12559a() {
            /* renamed from: a */
            public void mo63031a(C12537b1 b1Var, C12960q0 q0Var) {
                if (!b1Var.mo69064o()) {
                    taskCompletionSource.mo56138b(FirestoreChannel.this.m76189c(b1Var));
                } else if (!taskCompletionSource.mo56137a().mo23718s()) {
                    taskCompletionSource.mo56138b(new FirebaseFirestoreException("Received onClose with status OK, but no message.", FirebaseFirestoreException.Code.INTERNAL));
                }
            }

            /* renamed from: c */
            public void mo63033c(Object obj) {
                taskCompletionSource.mo56139c(obj);
            }
        }, firestoreChannel.m76194i());
        fVar.mo69131b(2);
        fVar.mo69132c(obj);
        fVar.mo63035a();
    }

    /* renamed from: h */
    static /* synthetic */ void m76193h(FirestoreChannel firestoreChannel, final TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        final C12558f fVar = (C12558f) task.mo23715p();
        final ArrayList arrayList = new ArrayList();
        fVar.mo69133d(new C12558f.C12559a() {
            /* renamed from: a */
            public void mo63031a(C12537b1 b1Var, C12960q0 q0Var) {
                if (b1Var.mo69064o()) {
                    taskCompletionSource.mo56139c(arrayList);
                } else {
                    taskCompletionSource.mo56138b(FirestoreChannel.this.m76189c(b1Var));
                }
            }

            /* renamed from: c */
            public void mo63033c(Object obj) {
                arrayList.add(obj);
                fVar.mo69131b(1);
            }
        }, firestoreChannel.m76194i());
        fVar.mo69131b(1);
        fVar.mo69132c(obj);
        fVar.mo63035a();
    }

    /* renamed from: i */
    private C12960q0 m76194i() {
        C12960q0 q0Var = new C12960q0();
        q0Var.mo69768o(f54577f, m76190d());
        q0Var.mo69768o(f54578g, this.f54583d);
        GrpcMetadataProvider grpcMetadataProvider = this.f54584e;
        if (grpcMetadataProvider != null) {
            grpcMetadataProvider.mo63025a(q0Var);
        }
        return q0Var;
    }

    /* renamed from: l */
    public static void m76195l(String str) {
        f54579h = str;
    }

    /* renamed from: e */
    public void mo63027e() {
        this.f54581b.mo23755b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public <ReqT, RespT> C12558f<ReqT, RespT> mo63028j(C12972r0<ReqT, RespT> r0Var, IncomingStreamObserver<RespT> incomingStreamObserver) {
        final C12558f[] fVarArr = {null};
        final Task<C12558f<ReqT, RespT>> b = this.f54582c.mo63037b(r0Var);
        b.mo23703d(this.f54580a.mo63153i(), FirestoreChannel$$Lambda$1.m76210b(this, fVarArr, incomingStreamObserver));
        return new C13010y<ReqT, RespT>() {
            /* renamed from: a */
            public void mo63035a() {
                if (fVarArr[0] == null) {
                    b.mo23709j(FirestoreChannel.this.f54580a.mo63153i(), FirestoreChannel$2$$Lambda$1.m76215a());
                } else {
                    super.mo63035a();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public C12558f<ReqT, RespT> mo63036e() {
                Assert.m76443d(fVarArr[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
                return fVarArr[0];
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public <ReqT, RespT> Task<RespT> mo63029k(C12972r0<ReqT, RespT> r0Var, ReqT reqt) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f54582c.mo63037b(r0Var).mo23703d(this.f54580a.mo63153i(), FirestoreChannel$$Lambda$3.m76213b(this, taskCompletionSource, reqt));
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: m */
    public void mo63030m() {
        this.f54582c.mo63038n();
    }
}
