package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p292io.grpc.C12558f;

/* compiled from: FirestoreChannel */
final /* synthetic */ class FirestoreChannel$$Lambda$1 implements OnCompleteListener {

    /* renamed from: a */
    private final FirestoreChannel f54597a;

    /* renamed from: c */
    private final C12558f[] f54598c;

    /* renamed from: d */
    private final IncomingStreamObserver f54599d;

    private FirestoreChannel$$Lambda$1(FirestoreChannel firestoreChannel, C12558f[] fVarArr, IncomingStreamObserver incomingStreamObserver) {
        this.f54597a = firestoreChannel;
        this.f54598c = fVarArr;
        this.f54599d = incomingStreamObserver;
    }

    /* renamed from: b */
    public static OnCompleteListener m76210b(FirestoreChannel firestoreChannel, C12558f[] fVarArr, IncomingStreamObserver incomingStreamObserver) {
        return new FirestoreChannel$$Lambda$1(firestoreChannel, fVarArr, incomingStreamObserver);
    }

    /* renamed from: a */
    public void mo21120a(Task task) {
        FirestoreChannel.m76191f(this.f54597a, this.f54598c, this.f54599d, task);
    }
}
