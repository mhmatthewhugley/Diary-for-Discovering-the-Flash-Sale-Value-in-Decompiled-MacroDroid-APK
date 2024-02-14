package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: FirestoreChannel */
final /* synthetic */ class FirestoreChannel$$Lambda$3 implements OnCompleteListener {

    /* renamed from: a */
    private final FirestoreChannel f54603a;

    /* renamed from: c */
    private final TaskCompletionSource f54604c;

    /* renamed from: d */
    private final Object f54605d;

    private FirestoreChannel$$Lambda$3(FirestoreChannel firestoreChannel, TaskCompletionSource taskCompletionSource, Object obj) {
        this.f54603a = firestoreChannel;
        this.f54604c = taskCompletionSource;
        this.f54605d = obj;
    }

    /* renamed from: b */
    public static OnCompleteListener m76213b(FirestoreChannel firestoreChannel, TaskCompletionSource taskCompletionSource, Object obj) {
        return new FirestoreChannel$$Lambda$3(firestoreChannel, taskCompletionSource, obj);
    }

    /* renamed from: a */
    public void mo21120a(Task task) {
        FirestoreChannel.m76192g(this.f54603a, this.f54604c, this.f54605d, task);
    }
}
