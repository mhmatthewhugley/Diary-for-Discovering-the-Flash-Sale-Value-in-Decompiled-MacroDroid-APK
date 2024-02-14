package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Preconditions;

public class DocumentSnapshot {

    /* renamed from: a */
    private final FirebaseFirestore f5640a;

    /* renamed from: b */
    private final DocumentKey f5641b;
    @Nullable

    /* renamed from: c */
    private final Document f5642c;

    /* renamed from: d */
    private final SnapshotMetadata f5643d;

    public enum ServerTimestampBehavior {
        NONE,
        ESTIMATE,
        PREVIOUS;
        

        /* renamed from: f */
        static final ServerTimestampBehavior f5647f = null;

        static {
            ServerTimestampBehavior serverTimestampBehavior;
            f5647f = serverTimestampBehavior;
        }
    }

    DocumentSnapshot(FirebaseFirestore firebaseFirestore, DocumentKey documentKey, @Nullable Document document, boolean z, boolean z2) {
        this.f5640a = (FirebaseFirestore) Preconditions.m76513b(firebaseFirestore);
        this.f5641b = (DocumentKey) Preconditions.m76513b(documentKey);
        this.f5642c = document;
        this.f5643d = new SnapshotMetadata(z2, z);
    }

    /* renamed from: b */
    static DocumentSnapshot m7849b(FirebaseFirestore firebaseFirestore, Document document, boolean z, boolean z2) {
        return new DocumentSnapshot(firebaseFirestore, document.getKey(), document, z, z2);
    }

    /* renamed from: c */
    static DocumentSnapshot m7850c(FirebaseFirestore firebaseFirestore, DocumentKey documentKey, boolean z) {
        return new DocumentSnapshot(firebaseFirestore, documentKey, (Document) null, z, false);
    }

    /* renamed from: a */
    public boolean mo23673a() {
        return this.f5642c != null;
    }

    @NonNull
    /* renamed from: d */
    public SnapshotMetadata mo23674d() {
        return this.f5643d;
    }

    public boolean equals(@Nullable Object obj) {
        Document document;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentSnapshot)) {
            return false;
        }
        DocumentSnapshot documentSnapshot = (DocumentSnapshot) obj;
        if (!this.f5640a.equals(documentSnapshot.f5640a) || !this.f5641b.equals(documentSnapshot.f5641b) || ((document = this.f5642c) != null ? !document.equals(documentSnapshot.f5642c) : documentSnapshot.f5642c != null) || !this.f5643d.equals(documentSnapshot.f5643d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.f5640a.hashCode() * 31) + this.f5641b.hashCode()) * 31;
        Document document = this.f5642c;
        int i = 0;
        int hashCode2 = (hashCode + (document != null ? document.getKey().hashCode() : 0)) * 31;
        Document document2 = this.f5642c;
        if (document2 != null) {
            i = document2.getData().hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f5643d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f5641b + ", metadata=" + this.f5643d + ", doc=" + this.f5642c + '}';
    }
}
