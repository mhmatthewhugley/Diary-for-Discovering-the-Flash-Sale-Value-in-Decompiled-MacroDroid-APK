package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;

public final class VerifyMutation extends Mutation {
    public VerifyMutation(DocumentKey documentKey, Precondition precondition) {
        super(documentKey, precondition);
    }

    /* renamed from: a */
    public void mo62887a(MutableDocument mutableDocument, Timestamp timestamp) {
        throw Assert.m76440a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    /* renamed from: b */
    public void mo62888b(MutableDocument mutableDocument, MutationResult mutationResult) {
        throw Assert.m76440a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VerifyMutation.class != obj.getClass()) {
            return false;
        }
        return mo62904h((VerifyMutation) obj);
    }

    public int hashCode() {
        return mo62905i();
    }

    public String toString() {
        return "VerifyMutation{" + mo62906j() + "}";
    }
}
