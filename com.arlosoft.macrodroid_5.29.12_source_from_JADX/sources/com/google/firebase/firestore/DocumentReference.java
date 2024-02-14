package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import java.util.concurrent.ExecutionException;

public class DocumentReference {

    /* renamed from: a */
    private final DocumentKey f5632a;

    /* renamed from: b */
    private final FirebaseFirestore f5633b;

    /* renamed from: a */
    static /* synthetic */ void m7843a(DocumentReference documentReference, EventListener eventListener, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        DocumentSnapshot documentSnapshot;
        if (firebaseFirestoreException != null) {
            eventListener.mo23672a(null, firebaseFirestoreException);
            return;
        }
        boolean z = true;
        Assert.m76443d(viewSnapshot != null, "Got event without value or error set", new Object[0]);
        if (viewSnapshot.mo23983e().size() > 1) {
            z = false;
        }
        Assert.m76443d(z, "Too many documents returned on a document query", new Object[0]);
        Document f = viewSnapshot.mo23983e().mo62838f(documentReference.f5632a);
        if (f != null) {
            documentSnapshot = DocumentSnapshot.m7849b(documentReference.f5633b, f, viewSnapshot.mo23990j(), viewSnapshot.mo23985f().contains(f.getKey()));
        } else {
            documentSnapshot = DocumentSnapshot.m7850c(documentReference.f5633b, documentReference.f5632a, viewSnapshot.mo23990j());
        }
        eventListener.mo23672a(documentSnapshot, (FirebaseFirestoreException) null);
    }

    /* renamed from: b */
    static /* synthetic */ DocumentSnapshot m7844b(DocumentReference documentReference, Task task) throws Exception {
        Document document = (Document) task.mo23715p();
        return new DocumentSnapshot(documentReference.f5633b, documentReference.f5632a, document, true, document != null && document.mo62819b());
    }

    /* renamed from: c */
    static /* synthetic */ void m7845c(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Source source, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            taskCompletionSource.mo56138b(firebaseFirestoreException);
            return;
        }
        try {
            ((ListenerRegistration) Tasks.m66662a(taskCompletionSource2.mo56137a())).remove();
            if (!documentSnapshot.mo23673a() && documentSnapshot.mo23674d().mo23749a()) {
                taskCompletionSource.mo56138b(new FirebaseFirestoreException("Failed to get document because the client is offline.", FirebaseFirestoreException.Code.UNAVAILABLE));
            } else if (!documentSnapshot.mo23673a() || !documentSnapshot.mo23674d().mo23749a() || source != Source.SERVER) {
                taskCompletionSource.mo56139c(documentSnapshot);
            } else {
                taskCompletionSource.mo56138b(new FirebaseFirestoreException("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", FirebaseFirestoreException.Code.UNAVAILABLE));
            }
        } catch (ExecutionException e) {
            throw Assert.m76441b(e, "Failed to register a listener for a single document", new Object[0]);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw Assert.m76441b(e2, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentReference)) {
            return false;
        }
        DocumentReference documentReference = (DocumentReference) obj;
        if (!this.f5632a.equals(documentReference.f5632a) || !this.f5633b.equals(documentReference.f5633b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f5632a.hashCode() * 31) + this.f5633b.hashCode();
    }
}
