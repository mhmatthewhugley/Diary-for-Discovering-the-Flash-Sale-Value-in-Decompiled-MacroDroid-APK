package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firestore.p228v1.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class PatchMutation extends Mutation {

    /* renamed from: d */
    private final ObjectValue f54492d;

    /* renamed from: e */
    private final FieldMask f54493e;

    public PatchMutation(DocumentKey documentKey, ObjectValue objectValue, FieldMask fieldMask, Precondition precondition) {
        this(documentKey, objectValue, fieldMask, precondition, new ArrayList());
    }

    /* renamed from: o */
    private Map<FieldPath, Value> m75990o() {
        HashMap hashMap = new HashMap();
        for (FieldPath next : this.f54493e.mo62892b()) {
            if (!next.mo62804k()) {
                hashMap.put(next, this.f54492d.mo62866h(next));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo62887a(MutableDocument mutableDocument, Timestamp timestamp) {
        mo62909m(mutableDocument);
        if (mo62903g().mo62937e(mutableDocument)) {
            Map<FieldPath, Value> k = mo62907k(timestamp, mutableDocument);
            ObjectValue data = mutableDocument.getData();
            data.mo62871o(m75990o());
            data.mo62871o(k);
            mutableDocument.mo62853h(Mutation.m75954f(mutableDocument), mutableDocument.getData()).mo62861u();
        }
    }

    /* renamed from: b */
    public void mo62888b(MutableDocument mutableDocument, MutationResult mutationResult) {
        mo62909m(mutableDocument);
        if (!mo62903g().mo62937e(mutableDocument)) {
            mutableDocument.mo62856l(mutationResult.mo62927b());
            return;
        }
        Map<FieldPath, Value> l = mo62908l(mutableDocument, mutationResult.mo62926a());
        ObjectValue data = mutableDocument.getData();
        data.mo62871o(m75990o());
        data.mo62871o(l);
        mutableDocument.mo62853h(mutationResult.mo62927b(), mutableDocument.getData()).mo62859t();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PatchMutation.class != obj.getClass()) {
            return false;
        }
        PatchMutation patchMutation = (PatchMutation) obj;
        if (!mo62904h(patchMutation) || !this.f54492d.equals(patchMutation.f54492d) || !mo62901d().equals(patchMutation.mo62901d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (mo62905i() * 31) + this.f54492d.hashCode();
    }

    /* renamed from: n */
    public FieldMask mo62931n() {
        return this.f54493e;
    }

    /* renamed from: p */
    public ObjectValue mo62932p() {
        return this.f54492d;
    }

    public String toString() {
        return "PatchMutation{" + mo62906j() + ", mask=" + this.f54493e + ", value=" + this.f54492d + "}";
    }

    public PatchMutation(DocumentKey documentKey, ObjectValue objectValue, FieldMask fieldMask, Precondition precondition, List<FieldTransform> list) {
        super(documentKey, precondition, list);
        this.f54492d = objectValue;
        this.f54493e = fieldMask;
    }
}
