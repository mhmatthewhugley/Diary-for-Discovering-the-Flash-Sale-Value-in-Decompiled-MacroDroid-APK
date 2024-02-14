package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.remote.FirestoreChannel;
import com.google.firebase.firestore.util.Assert;

public class FirebaseFirestore {

    /* renamed from: a */
    private final Context f5654a;

    /* renamed from: b */
    private final DatabaseId f5655b;

    /* renamed from: c */
    private final String f5656c;

    /* renamed from: d */
    private volatile FirestoreClient f5657d;

    public interface InstanceRegistry {
    }

    /* renamed from: a */
    static /* synthetic */ void m7854a(Runnable runnable, Void voidR, FirebaseFirestoreException firebaseFirestoreException) {
        Assert.m76443d(firebaseFirestoreException == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* renamed from: b */
    static /* synthetic */ void m7855b(FirebaseFirestore firebaseFirestore, AsyncEventListener asyncEventListener) {
        asyncEventListener.mo23808c();
        firebaseFirestore.f5657d.mo23869u(asyncEventListener);
    }

    /* renamed from: c */
    static /* synthetic */ void m7856c(FirebaseFirestore firebaseFirestore, TaskCompletionSource taskCompletionSource) {
        try {
            if (firebaseFirestore.f5657d != null) {
                if (!firebaseFirestore.f5657d.mo23868b()) {
                    throw new FirebaseFirestoreException("Persistence cannot be cleared while the firestore instance is running.", FirebaseFirestoreException.Code.FAILED_PRECONDITION);
                }
            }
            SQLitePersistence.m75662o(firebaseFirestore.f5654a, firebaseFirestore.f5655b, firebaseFirestore.f5656c);
            taskCompletionSource.mo56139c(null);
        } catch (FirebaseFirestoreException e) {
            taskCompletionSource.mo56138b(e);
        }
    }

    /* renamed from: d */
    static /* synthetic */ Query m7857d(FirebaseFirestore firebaseFirestore, Task task) throws Exception {
        Query query = (Query) task.mo23715p();
        if (query != null) {
            return new Query(query, firebaseFirestore);
        }
        return null;
    }

    @Keep
    static void setClientLanguage(@NonNull String str) {
        FirestoreChannel.m76195l(str);
    }
}
