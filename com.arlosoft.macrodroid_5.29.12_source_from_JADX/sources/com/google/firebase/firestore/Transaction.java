package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;
import java.util.List;

public class Transaction {

    /* renamed from: a */
    private final com.google.firebase.firestore.core.Transaction f5758a;

    /* renamed from: b */
    private final FirebaseFirestore f5759b;

    public interface Function<TResult> {
        @Nullable
        /* renamed from: a */
        TResult mo23753a(@NonNull Transaction transaction) throws FirebaseFirestoreException;
    }

    Transaction(com.google.firebase.firestore.core.Transaction transaction, FirebaseFirestore firebaseFirestore) {
        this.f5758a = (com.google.firebase.firestore.core.Transaction) Preconditions.m76513b(transaction);
        this.f5759b = (FirebaseFirestore) Preconditions.m76513b(firebaseFirestore);
    }

    /* renamed from: a */
    static /* synthetic */ DocumentSnapshot m7924a(Transaction transaction, Task task) throws Exception {
        if (task.mo23719t()) {
            List list = (List) task.mo23715p();
            if (list.size() == 1) {
                MutableDocument mutableDocument = (MutableDocument) list.get(0);
                if (mutableDocument.mo62822e()) {
                    return DocumentSnapshot.m7849b(transaction.f5759b, mutableDocument, false, false);
                }
                if (mutableDocument.mo62821d()) {
                    return DocumentSnapshot.m7850c(transaction.f5759b, mutableDocument.getKey(), false);
                }
                throw Assert.m76440a("BatchGetDocumentsRequest returned unexpected document type: " + MutableDocument.class.getCanonicalName(), new Object[0]);
            }
            throw Assert.m76440a("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        throw task.mo23714o();
    }
}
