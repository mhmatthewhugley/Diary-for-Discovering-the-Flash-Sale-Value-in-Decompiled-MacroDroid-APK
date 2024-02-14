package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: TransactionRunner */
final /* synthetic */ class TransactionRunner$$Lambda$2 implements OnCompleteListener {

    /* renamed from: a */
    private final TransactionRunner f6017a;

    /* renamed from: c */
    private final Transaction f6018c;

    private TransactionRunner$$Lambda$2(TransactionRunner transactionRunner, Transaction transaction) {
        this.f6017a = transactionRunner;
        this.f6018c = transaction;
    }

    /* renamed from: b */
    public static OnCompleteListener m8244b(TransactionRunner transactionRunner, Transaction transaction) {
        return new TransactionRunner$$Lambda$2(transactionRunner, transaction);
    }

    /* renamed from: a */
    public void mo21120a(Task task) {
        TransactionRunner.m8239d(this.f6017a, this.f6018c, task);
    }
}
