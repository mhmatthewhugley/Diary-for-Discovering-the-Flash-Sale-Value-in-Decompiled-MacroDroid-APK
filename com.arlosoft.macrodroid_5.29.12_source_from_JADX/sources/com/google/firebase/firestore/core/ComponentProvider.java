package com.google.firebase.firestore.core;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.GarbageCollectionScheduler;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.AsyncQueue;

public abstract class ComponentProvider {

    /* renamed from: a */
    private Persistence f5820a;

    /* renamed from: b */
    private LocalStore f5821b;

    /* renamed from: c */
    private SyncEngine f5822c;

    /* renamed from: d */
    private RemoteStore f5823d;

    /* renamed from: e */
    private EventManager f5824e;

    /* renamed from: f */
    private ConnectivityMonitor f5825f;
    @Nullable

    /* renamed from: g */
    private GarbageCollectionScheduler f5826g;

    public static class Configuration {

        /* renamed from: a */
        private final Context f5827a;

        /* renamed from: b */
        private final AsyncQueue f5828b;

        /* renamed from: c */
        private final DatabaseInfo f5829c;

        /* renamed from: d */
        private final Datastore f5830d;

        /* renamed from: e */
        private final User f5831e;

        /* renamed from: f */
        private final int f5832f;

        /* renamed from: g */
        private final FirebaseFirestoreSettings f5833g;

        public Configuration(Context context, AsyncQueue asyncQueue, DatabaseInfo databaseInfo, Datastore datastore, User user, int i, FirebaseFirestoreSettings firebaseFirestoreSettings) {
            this.f5827a = context;
            this.f5828b = asyncQueue;
            this.f5829c = databaseInfo;
            this.f5830d = datastore;
            this.f5831e = user;
            this.f5832f = i;
            this.f5833g = firebaseFirestoreSettings;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AsyncQueue mo23832a() {
            return this.f5828b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Context mo23833b() {
            return this.f5827a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public DatabaseInfo mo23834c() {
            return this.f5829c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Datastore mo23835d() {
            return this.f5830d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public User mo23836e() {
            return this.f5831e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo23837f() {
            return this.f5832f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public FirebaseFirestoreSettings mo23838g() {
            return this.f5833g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ConnectivityMonitor mo23817a(Configuration configuration);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract EventManager mo23818b(Configuration configuration);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract GarbageCollectionScheduler mo23819c(Configuration configuration);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract LocalStore mo23820d(Configuration configuration);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Persistence mo23821e(Configuration configuration);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract RemoteStore mo23822f(Configuration configuration);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract SyncEngine mo23823g(Configuration configuration);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ConnectivityMonitor mo23824h() {
        return this.f5825f;
    }

    /* renamed from: i */
    public EventManager mo23825i() {
        return this.f5824e;
    }

    @Nullable
    /* renamed from: j */
    public GarbageCollectionScheduler mo23826j() {
        return this.f5826g;
    }

    /* renamed from: k */
    public LocalStore mo23827k() {
        return this.f5821b;
    }

    /* renamed from: l */
    public Persistence mo23828l() {
        return this.f5820a;
    }

    /* renamed from: m */
    public RemoteStore mo23829m() {
        return this.f5823d;
    }

    /* renamed from: n */
    public SyncEngine mo23830n() {
        return this.f5822c;
    }

    /* renamed from: o */
    public void mo23831o(Configuration configuration) {
        Persistence e = mo23821e(configuration);
        this.f5820a = e;
        e.mo62695k();
        this.f5821b = mo23820d(configuration);
        this.f5825f = mo23817a(configuration);
        this.f5823d = mo23822f(configuration);
        this.f5822c = mo23823g(configuration);
        this.f5824e = mo23818b(configuration);
        this.f5821b.mo62609O();
        this.f5823d.mo63082M();
        this.f5826g = mo23819c(configuration);
    }
}
