package com.google.firebase.firestore;

import com.google.firebase.firestore.LoadBundleTask;

/* compiled from: LoadBundleTask */
final /* synthetic */ class LoadBundleTask$ManagedListener$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final LoadBundleTask.ManagedListener f5714a;

    /* renamed from: c */
    private final LoadBundleTaskProgress f5715c;

    private LoadBundleTask$ManagedListener$$Lambda$1(LoadBundleTask.ManagedListener managedListener, LoadBundleTaskProgress loadBundleTaskProgress) {
        this.f5714a = managedListener;
        this.f5715c = loadBundleTaskProgress;
    }

    /* renamed from: a */
    public static Runnable m7903a(LoadBundleTask.ManagedListener managedListener, LoadBundleTaskProgress loadBundleTaskProgress) {
        return new LoadBundleTask$ManagedListener$$Lambda$1(managedListener, loadBundleTaskProgress);
    }

    public void run() {
        this.f5714a.f5711b.mo23736a(this.f5715c);
    }
}
