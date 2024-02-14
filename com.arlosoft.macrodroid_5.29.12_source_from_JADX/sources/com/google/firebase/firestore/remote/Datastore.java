package com.google.firebase.firestore.remote;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.remote.WatchStream;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firestore.p228v1.BatchGetDocumentsResponse;
import com.google.firestore.p228v1.CommitRequest;
import com.google.firestore.p228v1.CommitResponse;
import com.google.firestore.p228v1.FirestoreGrpc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p292io.grpc.C12537b1;

public class Datastore {

    /* renamed from: e */
    static final Set<String> f54557e = new HashSet(Arrays.asList(new String[]{"date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"}));

    /* renamed from: a */
    private final DatabaseInfo f54558a;

    /* renamed from: b */
    private final RemoteSerializer f54559b;

    /* renamed from: c */
    private final AsyncQueue f54560c;

    /* renamed from: d */
    private final FirestoreChannel f54561d;

    /* renamed from: com.google.firebase.firestore.remote.Datastore$1 */
    static /* synthetic */ class C112371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54562a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.FirebaseFirestoreException$Code[] r0 = com.google.firebase.firestore.FirebaseFirestoreException.Code.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54562a = r0
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.CANCELLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.DEADLINE_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.RESOURCE_EXHAUSTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.UNAUTHENTICATED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.ALREADY_EXISTS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.FAILED_PRECONDITION     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.ABORTED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.OUT_OF_RANGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.UNIMPLEMENTED     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f54562a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.firebase.firestore.FirebaseFirestoreException$Code r1 = com.google.firebase.firestore.FirebaseFirestoreException.Code.DATA_LOSS     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.Datastore.C112371.<clinit>():void");
        }
    }

    public Datastore(DatabaseInfo databaseInfo, AsyncQueue asyncQueue, CredentialsProvider credentialsProvider, Context context, @Nullable GrpcMetadataProvider grpcMetadataProvider) {
        this.f54558a = databaseInfo;
        this.f54560c = asyncQueue;
        this.f54559b = new RemoteSerializer(databaseInfo.mo23839a());
        this.f54561d = new FirestoreChannel(asyncQueue, context, credentialsProvider, databaseInfo, grpcMetadataProvider);
    }

    /* renamed from: d */
    public static boolean m76164d(C12537b1 b1Var) {
        b1Var.mo69062m();
        Throwable l = b1Var.mo69061l();
        if (!(l instanceof SSLHandshakeException)) {
            return false;
        }
        boolean contains = l.getMessage().contains("no ciphers available");
        return false;
    }

    /* renamed from: e */
    public static boolean m76165e(FirebaseFirestoreException.Code code) {
        switch (C112371.f54562a[code.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + code);
        }
    }

    /* renamed from: f */
    public static boolean m76166f(C12537b1 b1Var) {
        return m76165e(FirebaseFirestoreException.Code.m7865d(b1Var.mo69062m().mo69069e()));
    }

    /* renamed from: g */
    public static boolean m76167g(C12537b1 b1Var) {
        return m76166f(b1Var) && !b1Var.mo69062m().equals(C12537b1.C12539b.ABORTED);
    }

    /* renamed from: h */
    static /* synthetic */ List m76168h(Datastore datastore, Task task) throws Exception {
        if (!task.mo23719t()) {
            if ((task.mo23714o() instanceof FirebaseFirestoreException) && ((FirebaseFirestoreException) task.mo23714o()).mo23685a() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                datastore.f54561d.mo63027e();
            }
            throw task.mo23714o();
        }
        CommitResponse commitResponse = (CommitResponse) task.mo23715p();
        SnapshotVersion w = datastore.f54559b.mo63077w(commitResponse.mo63774U());
        int X = commitResponse.mo63776X();
        ArrayList arrayList = new ArrayList(X);
        for (int i = 0; i < X; i++) {
            arrayList.add(datastore.f54559b.mo63073n(commitResponse.mo63775W(i), w));
        }
        return arrayList;
    }

    /* renamed from: i */
    static /* synthetic */ List m76169i(Datastore datastore, List list, Task task) throws Exception {
        if (!task.mo23719t() && (task.mo23714o() instanceof FirebaseFirestoreException) && ((FirebaseFirestoreException) task.mo23714o()).mo23685a() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
            datastore.f54561d.mo63027e();
        }
        HashMap hashMap = new HashMap();
        for (BatchGetDocumentsResponse k : (List) task.mo23715p()) {
            MutableDocument k2 = datastore.f54559b.mo63071k(k);
            hashMap.put(k2.getKey(), k2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MutableDocument) hashMap.get((DocumentKey) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Task<List<MutationResult>> mo63019a(List<Mutation> list) {
        CommitRequest.Builder Z = CommitRequest.m77753Z();
        Z.mo63773O(this.f54559b.mo63067a());
        for (Mutation K : list) {
            Z.mo63772N(this.f54559b.mo63060K(K));
        }
        return this.f54561d.mo63029k(FirestoreGrpc.m77865a(), (CommitRequest) Z.build()).mo23711l(this.f54560c.mo63153i(), Datastore$$Lambda$1.m76174b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public WatchStream mo63020b(WatchStream.Callback callback) {
        return new WatchStream(this.f54561d, this.f54560c, this.f54559b, callback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public WriteStream mo63021c(WriteStream.Callback callback) {
        return new WriteStream(this.f54561d, this.f54560c, this.f54559b, callback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo63022j() {
        this.f54561d.mo63030m();
    }
}
