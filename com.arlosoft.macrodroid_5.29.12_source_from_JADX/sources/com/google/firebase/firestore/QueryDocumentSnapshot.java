package com.google.firebase.firestore;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;

public class QueryDocumentSnapshot extends DocumentSnapshot {
    private QueryDocumentSnapshot(FirebaseFirestore firebaseFirestore, DocumentKey documentKey, @Nullable Document document, boolean z, boolean z2) {
        super(firebaseFirestore, documentKey, document, z, z2);
    }

    /* renamed from: e */
    static QueryDocumentSnapshot m7918e(FirebaseFirestore firebaseFirestore, Document document, boolean z, boolean z2) {
        return new QueryDocumentSnapshot(firebaseFirestore, document.getKey(), document, z, z2);
    }
}
