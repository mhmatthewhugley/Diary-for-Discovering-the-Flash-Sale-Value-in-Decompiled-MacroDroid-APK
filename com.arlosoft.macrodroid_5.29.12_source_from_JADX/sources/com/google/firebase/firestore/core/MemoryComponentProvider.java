package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.local.DefaultQueryEngine;
import com.google.firebase.firestore.local.GarbageCollectionScheduler;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.MemoryPersistence;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.remote.AndroidConnectivityMonitor;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.RemoteStore;
import p292io.grpc.C12537b1;

public class MemoryComponentProvider extends ComponentProvider {

    private class RemoteStoreCallback implements RemoteStore.RemoteStoreCallback {
        private RemoteStoreCallback() {
        }

        /* renamed from: a */
        public void mo23898a(OnlineState onlineState) {
            MemoryComponentProvider.this.mo23830n().mo23898a(onlineState);
        }

        /* renamed from: b */
        public ImmutableSortedSet<DocumentKey> mo23899b(int i) {
            return MemoryComponentProvider.this.mo23830n().mo23899b(i);
        }

        /* renamed from: c */
        public void mo23900c(int i, C12537b1 b1Var) {
            MemoryComponentProvider.this.mo23830n().mo23900c(i, b1Var);
        }

        /* renamed from: d */
        public void mo23901d(int i, C12537b1 b1Var) {
            MemoryComponentProvider.this.mo23830n().mo23901d(i, b1Var);
        }

        /* renamed from: e */
        public void mo23902e(RemoteEvent remoteEvent) {
            MemoryComponentProvider.this.mo23830n().mo23902e(remoteEvent);
        }

        /* renamed from: f */
        public void mo23903f(MutationBatchResult mutationBatchResult) {
            MemoryComponentProvider.this.mo23830n().mo23903f(mutationBatchResult);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public EventManager mo23818b(ComponentProvider.Configuration configuration) {
        return new EventManager(mo23830n());
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public GarbageCollectionScheduler mo23819c(ComponentProvider.Configuration configuration) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public LocalStore mo23820d(ComponentProvider.Configuration configuration) {
        return new LocalStore(mo23828l(), new DefaultQueryEngine(), configuration.mo23836e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Persistence mo23821e(ComponentProvider.Configuration configuration) {
        return MemoryPersistence.m75482l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public RemoteStore mo23822f(ComponentProvider.Configuration configuration) {
        return new RemoteStore(new RemoteStoreCallback(), mo23827k(), configuration.mo23835d(), configuration.mo23832a(), mo23824h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public SyncEngine mo23823g(ComponentProvider.Configuration configuration) {
        return new SyncEngine(mo23827k(), mo23829m(), configuration.mo23836e(), configuration.mo23837f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public AndroidConnectivityMonitor mo23817a(ComponentProvider.Configuration configuration) {
        return new AndroidConnectivityMonitor(configuration.mo23833b());
    }
}
