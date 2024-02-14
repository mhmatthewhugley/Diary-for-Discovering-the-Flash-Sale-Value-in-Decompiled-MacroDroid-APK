package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;

public final class DeleteMutation extends Mutation {
    public DeleteMutation(DocumentKey documentKey, Precondition precondition) {
        super(documentKey, precondition);
    }

    /* renamed from: a */
    public void mo62887a(MutableDocument mutableDocument, Timestamp timestamp) {
        mo62909m(mutableDocument);
        if (mo62903g().mo62937e(mutableDocument)) {
            mutableDocument.mo62855k(SnapshotVersion.f54468c);
        }
    }

    /* renamed from: b */
    public void mo62888b(MutableDocument mutableDocument, MutationResult mutationResult) {
        mo62909m(mutableDocument);
        Assert.m76443d(mutationResult.mo62926a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        mutableDocument.mo62855k(mutationResult.mo62927b()).mo62859t();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeleteMutation.class != obj.getClass()) {
            return false;
        }
        return mo62904h((DeleteMutation) obj);
    }

    public int hashCode() {
        return mo62905i();
    }

    public String toString() {
        return "DeleteMutation{" + mo62906j() + "}";
    }
}
