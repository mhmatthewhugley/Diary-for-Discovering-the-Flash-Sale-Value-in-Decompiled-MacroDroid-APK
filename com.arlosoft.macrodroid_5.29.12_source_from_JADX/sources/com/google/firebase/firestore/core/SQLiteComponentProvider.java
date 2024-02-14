package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.local.GarbageCollectionScheduler;
import com.google.firebase.firestore.local.LocalSerializer;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.remote.RemoteSerializer;

public class SQLiteComponentProvider extends MemoryComponentProvider {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public GarbageCollectionScheduler mo23819c(ComponentProvider.Configuration configuration) {
        return ((SQLitePersistence) mo23828l()).mo62688d().mo62640c().mo62649i(configuration.mo23832a(), mo23827k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Persistence mo23821e(ComponentProvider.Configuration configuration) {
        return new SQLitePersistence(configuration.mo23833b(), configuration.mo23834c().mo23841c(), configuration.mo23834c().mo23839a(), new LocalSerializer(new RemoteSerializer(configuration.mo23834c().mo23839a())), LruGarbageCollector.Params.m75413a(configuration.mo23838g().mo23687a()));
    }
}
