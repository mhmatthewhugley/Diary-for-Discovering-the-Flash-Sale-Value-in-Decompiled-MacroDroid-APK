package com.google.firebase.firestore;

import com.google.firebase.firestore.Transaction;
import java.util.concurrent.Callable;

/* compiled from: FirebaseFirestore */
final /* synthetic */ class FirebaseFirestore$$Lambda$6 implements Callable {

    /* renamed from: a */
    private final FirebaseFirestore f5667a;

    /* renamed from: c */
    private final Transaction.Function f5668c;

    /* renamed from: d */
    private final com.google.firebase.firestore.core.Transaction f5669d;

    private FirebaseFirestore$$Lambda$6(FirebaseFirestore firebaseFirestore, Transaction.Function function, com.google.firebase.firestore.core.Transaction transaction) {
        this.f5667a = firebaseFirestore;
        this.f5668c = function;
        this.f5669d = transaction;
    }

    /* renamed from: a */
    public static Callable m7862a(FirebaseFirestore firebaseFirestore, Transaction.Function function, com.google.firebase.firestore.core.Transaction transaction) {
        return new FirebaseFirestore$$Lambda$6(firebaseFirestore, function, transaction);
    }

    public Object call() {
        return this.f5668c.mo23753a(new Transaction(this.f5669d, this.f5667a));
    }
}
