package com.google.firebase.firestore.core;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.local.GarbageCollectionScheduler;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.QueryResult;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FirestoreClient {

    /* renamed from: a */
    private final DatabaseInfo f5871a;

    /* renamed from: b */
    private final CredentialsProvider f5872b;

    /* renamed from: c */
    private final AsyncQueue f5873c;

    /* renamed from: d */
    private final GrpcMetadataProvider f5874d;

    /* renamed from: e */
    private Persistence f5875e;

    /* renamed from: f */
    private LocalStore f5876f;

    /* renamed from: g */
    private RemoteStore f5877g;

    /* renamed from: h */
    private SyncEngine f5878h;

    /* renamed from: i */
    private EventManager f5879i;
    @Nullable

    /* renamed from: j */
    private GarbageCollectionScheduler f5880j;

    /* renamed from: a */
    private void m8076a(Context context, User user, FirebaseFirestoreSettings firebaseFirestoreSettings) {
        ComponentProvider componentProvider;
        Logger.m76508a("FirestoreClient", "Initializing. user=%s", user.mo23756a());
        Context context2 = context;
        ComponentProvider.Configuration configuration = new ComponentProvider.Configuration(context2, this.f5873c, this.f5871a, new Datastore(this.f5871a, this.f5873c, this.f5872b, context, this.f5874d), user, 100, firebaseFirestoreSettings);
        if (firebaseFirestoreSettings.mo23688b()) {
            componentProvider = new SQLiteComponentProvider();
        } else {
            componentProvider = new MemoryComponentProvider();
        }
        componentProvider.mo23831o(configuration);
        this.f5875e = componentProvider.mo23828l();
        this.f5880j = componentProvider.mo23826j();
        this.f5876f = componentProvider.mo23827k();
        this.f5877g = componentProvider.mo23829m();
        this.f5878h = componentProvider.mo23830n();
        this.f5879i = componentProvider.mo23825i();
        GarbageCollectionScheduler garbageCollectionScheduler = this.f5880j;
        if (garbageCollectionScheduler != null) {
            garbageCollectionScheduler.start();
        }
    }

    /* renamed from: g */
    static /* synthetic */ Document m8081g(Task task) throws Exception {
        Document document = (Document) task.mo23715p();
        if (document.mo62822e()) {
            return document;
        }
        if (document.mo62821d()) {
            return null;
        }
        throw new FirebaseFirestoreException("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", FirebaseFirestoreException.Code.UNAVAILABLE);
    }

    /* renamed from: h */
    static /* synthetic */ ViewSnapshot m8082h(FirestoreClient firestoreClient, Query query) throws Exception {
        QueryResult i = firestoreClient.f5876f.mo62615i(query, true);
        View view = new View(query, i.mo62727b());
        return view.mo23969a(view.mo23972f(i.mo62726a())).mo23979b();
    }

    /* renamed from: i */
    static /* synthetic */ void m8083i(FirestoreClient firestoreClient, String str, TaskCompletionSource taskCompletionSource) {
        NamedQuery m = firestoreClient.f5876f.mo62619m(str);
        if (m != null) {
            Target b = m.mo23795a().mo23792b();
            taskCompletionSource.mo56139c(new Query(b.mo23959g(), b.mo23953b(), b.mo23955d(), b.mo23958f(), b.mo23956e(), m.mo23795a().mo23791a(), b.mo23960h(), b.mo23954c()));
            return;
        }
        taskCompletionSource.mo56139c(null);
    }

    /* renamed from: l */
    static /* synthetic */ void m8086l(FirestoreClient firestoreClient, TaskCompletionSource taskCompletionSource, Context context, FirebaseFirestoreSettings firebaseFirestoreSettings) {
        try {
            firestoreClient.m8076a(context, (User) Tasks.m66662a(taskCompletionSource.mo56137a()), firebaseFirestoreSettings);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m8087m(FirestoreClient firestoreClient, User user) {
        Assert.m76443d(firestoreClient.f5878h != null, "SyncEngine not yet initialized", new Object[0]);
        Logger.m76508a("FirestoreClient", "Credential changed. Current user: %s", user.mo23756a());
        firestoreClient.f5878h.mo23945l(user);
    }

    /* renamed from: n */
    static /* synthetic */ void m8088n(FirestoreClient firestoreClient, AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, AsyncQueue asyncQueue, User user) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Assert.m76443d(!taskCompletionSource.mo56137a().mo23718s(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.mo56139c(user);
            return;
        }
        asyncQueue.mo63152h(FirestoreClient$$Lambda$18.m8099a(firestoreClient, user));
    }

    /* renamed from: q */
    static /* synthetic */ void m8091q(FirestoreClient firestoreClient) {
        firestoreClient.f5877g.mo63081L();
        firestoreClient.f5875e.mo62694j();
        GarbageCollectionScheduler garbageCollectionScheduler = firestoreClient.f5880j;
        if (garbageCollectionScheduler != null) {
            garbageCollectionScheduler.stop();
        }
    }

    /* renamed from: b */
    public boolean mo23868b() {
        return this.f5873c.mo63154j();
    }

    /* renamed from: u */
    public void mo23869u(EventListener<Void> eventListener) {
        if (!mo23868b()) {
            this.f5873c.mo63152h(FirestoreClient$$Lambda$17.m8098a(this, eventListener));
        }
    }

    /* renamed from: v */
    public void mo23870v(QueryListener queryListener) {
        if (!mo23868b()) {
            this.f5873c.mo63152h(FirestoreClient$$Lambda$7.m8101a(this, queryListener));
        }
    }
}
