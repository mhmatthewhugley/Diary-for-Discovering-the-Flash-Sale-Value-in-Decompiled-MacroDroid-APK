package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: TransactionRunner */
final /* synthetic */ class TransactionRunner$$Lambda$3 implements OnCompleteListener {

    /* renamed from: a */
    private final TransactionRunner f6019a;

    /* renamed from: c */
    private final Task f6020c;

    private TransactionRunner$$Lambda$3(TransactionRunner transactionRunner, Task task) {
        this.f6019a = transactionRunner;
        this.f6020c = task;
    }

    /* renamed from: b */
    public static OnCompleteListener m8246b(TransactionRunner transactionRunner, Task task) {
        return new TransactionRunner$$Lambda$3(transactionRunner, task);
    }

    /* renamed from: a */
    public void mo21120a(Task task) {
        TransactionRunner.m8238c(this.f6019a, this.f6020c, task);
    }
}
