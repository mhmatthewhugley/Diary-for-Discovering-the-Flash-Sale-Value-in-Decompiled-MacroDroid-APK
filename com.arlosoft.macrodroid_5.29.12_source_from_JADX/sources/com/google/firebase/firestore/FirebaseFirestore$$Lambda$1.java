package com.google.firebase.firestore;

import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.Transaction;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

/* compiled from: FirebaseFirestore */
final /* synthetic */ class FirebaseFirestore$$Lambda$1 implements Function {

    /* renamed from: a */
    private final FirebaseFirestore f5658a;

    /* renamed from: b */
    private final Executor f5659b;

    /* renamed from: c */
    private final Transaction.Function f5660c;

    public Object apply(Object obj) {
        return Tasks.m66664c(this.f5659b, FirebaseFirestore$$Lambda$6.m7862a(this.f5658a, this.f5660c, (com.google.firebase.firestore.core.Transaction) obj));
    }
}
