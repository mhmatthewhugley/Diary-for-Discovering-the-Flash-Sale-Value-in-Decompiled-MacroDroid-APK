package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class TopicsStore {
    @GuardedBy("TopicsStore.class")

    /* renamed from: d */
    private static WeakReference<TopicsStore> f55044d;

    /* renamed from: a */
    private final SharedPreferences f55045a;

    /* renamed from: b */
    private SharedPreferencesQueue f55046b;

    /* renamed from: c */
    private final Executor f55047c;

    private TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.f55047c = executor;
        this.f55045a = sharedPreferences;
    }

    @WorkerThread
    /* renamed from: b */
    public static synchronized TopicsStore m77041b(Context context, Executor executor) {
        TopicsStore topicsStore;
        synchronized (TopicsStore.class) {
            topicsStore = null;
            WeakReference<TopicsStore> weakReference = f55044d;
            if (weakReference != null) {
                topicsStore = (TopicsStore) weakReference.get();
            }
            if (topicsStore == null) {
                topicsStore = new TopicsStore(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                topicsStore.m77042d();
                f55044d = new WeakReference<>(topicsStore);
            }
        }
        return topicsStore;
    }

    @WorkerThread
    /* renamed from: d */
    private synchronized void m77042d() {
        this.f55046b = SharedPreferencesQueue.m77011d(this.f55045a, "topic_operation_queue", ",", this.f55047c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo63425a(TopicOperation topicOperation) {
        return this.f55046b.mo63405b(topicOperation.mo63422e());
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public synchronized TopicOperation mo63426c() {
        return TopicOperation.m77034a(this.f55046b.mo63406f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized boolean mo63427e(TopicOperation topicOperation) {
        return this.f55046b.mo63407g(topicOperation.mo63422e());
    }
}
