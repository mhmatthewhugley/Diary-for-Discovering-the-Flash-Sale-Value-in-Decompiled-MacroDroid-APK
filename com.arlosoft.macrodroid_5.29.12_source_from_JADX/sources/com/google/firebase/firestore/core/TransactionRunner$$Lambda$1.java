package com.google.firebase.firestore.core;

/* compiled from: TransactionRunner */
final /* synthetic */ class TransactionRunner$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final TransactionRunner f6016a;

    private TransactionRunner$$Lambda$1(TransactionRunner transactionRunner) {
        this.f6016a = transactionRunner;
    }

    /* renamed from: a */
    public static Runnable m8243a(TransactionRunner transactionRunner) {
        return new TransactionRunner$$Lambda$1(transactionRunner);
    }

    public void run() {
        TransactionRunner.m8240e(this.f6016a);
    }
}
