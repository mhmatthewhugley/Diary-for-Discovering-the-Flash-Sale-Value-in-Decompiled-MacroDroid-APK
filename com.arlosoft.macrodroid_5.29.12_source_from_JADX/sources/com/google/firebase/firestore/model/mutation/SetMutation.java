package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firestore.p228v1.Value;
import java.util.List;
import java.util.Map;

public final class SetMutation extends Mutation {

    /* renamed from: d */
    private final ObjectValue f54498d;

    public SetMutation(DocumentKey documentKey, ObjectValue objectValue, Precondition precondition, List<FieldTransform> list) {
        super(documentKey, precondition, list);
        this.f54498d = objectValue;
    }

    /* renamed from: a */
    public void mo62887a(MutableDocument mutableDocument, Timestamp timestamp) {
        mo62909m(mutableDocument);
        if (mo62903g().mo62937e(mutableDocument)) {
            Map<FieldPath, Value> k = mo62907k(timestamp, mutableDocument);
            ObjectValue c = this.f54498d.clone();
            c.mo62871o(k);
            mutableDocument.mo62853h(Mutation.m75954f(mutableDocument), c).mo62861u();
        }
    }

    /* renamed from: b */
    public void mo62888b(MutableDocument mutableDocument, MutationResult mutationResult) {
        mo62909m(mutableDocument);
        ObjectValue c = this.f54498d.clone();
        c.mo62871o(mo62908l(mutableDocument, mutationResult.mo62926a()));
        mutableDocument.mo62853h(mutationResult.mo62927b(), c).mo62859t();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SetMutation.class != obj.getClass()) {
            return false;
        }
        SetMutation setMutation = (SetMutation) obj;
        if (!mo62904h(setMutation) || !this.f54498d.equals(setMutation.f54498d) || !mo62901d().equals(setMutation.mo62901d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (mo62905i() * 31) + this.f54498d.hashCode();
    }

    /* renamed from: n */
    public ObjectValue mo62943n() {
        return this.f54498d;
    }

    public String toString() {
        return "SetMutation{" + mo62906j() + ", value=" + this.f54498d + "}";
    }
}
