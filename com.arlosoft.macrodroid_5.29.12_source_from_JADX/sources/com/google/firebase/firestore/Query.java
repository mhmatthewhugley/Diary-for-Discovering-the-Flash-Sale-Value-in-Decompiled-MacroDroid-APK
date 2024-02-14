package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;
import java.util.concurrent.ExecutionException;

public class Query {

    /* renamed from: a */
    final com.google.firebase.firestore.core.Query f5730a;

    /* renamed from: b */
    final FirebaseFirestore f5731b;

    /* renamed from: com.google.firebase.firestore.Query$1 */
    static /* synthetic */ class C19481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.core.Filter$Operator[] r0 = com.google.firebase.firestore.core.Filter.Operator.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5732a = r0
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5732a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5732a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.IN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5732a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5732a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.NOT_IN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.Query.C19481.<clinit>():void");
        }
    }

    public enum Direction {
        ASCENDING,
        DESCENDING
    }

    Query(com.google.firebase.firestore.core.Query query, FirebaseFirestore firebaseFirestore) {
        this.f5730a = (com.google.firebase.firestore.core.Query) Preconditions.m76513b(query);
        this.f5731b = (FirebaseFirestore) Preconditions.m76513b(firebaseFirestore);
    }

    /* renamed from: a */
    static /* synthetic */ void m7912a(Query query, EventListener eventListener, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            eventListener.mo23672a(null, firebaseFirestoreException);
            return;
        }
        Assert.m76443d(viewSnapshot != null, "Got event without value or error set", new Object[0]);
        eventListener.mo23672a(new QuerySnapshot(query, viewSnapshot, query.f5731b), (FirebaseFirestoreException) null);
    }

    /* renamed from: b */
    static /* synthetic */ QuerySnapshot m7913b(Query query, Task task) throws Exception {
        return new QuerySnapshot(new Query(query.f5730a, query.f5731b), (ViewSnapshot) task.mo23715p(), query.f5731b);
    }

    /* renamed from: c */
    static /* synthetic */ void m7914c(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Source source, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            taskCompletionSource.mo56138b(firebaseFirestoreException);
            return;
        }
        try {
            ((ListenerRegistration) Tasks.m66662a(taskCompletionSource2.mo56137a())).remove();
            if (!querySnapshot.mo23740f().mo23749a() || source != Source.SERVER) {
                taskCompletionSource.mo56139c(querySnapshot);
            } else {
                taskCompletionSource.mo56138b(new FirebaseFirestoreException("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", FirebaseFirestoreException.Code.UNAVAILABLE));
            }
        } catch (ExecutionException e) {
            throw Assert.m76441b(e, "Failed to register a listener for a query result", new Object[0]);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw Assert.m76441b(e2, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Query)) {
            return false;
        }
        Query query = (Query) obj;
        if (!this.f5730a.equals(query.f5730a) || !this.f5731b.equals(query.f5731b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f5730a.hashCode() * 31) + this.f5731b.hashCode();
    }
}
