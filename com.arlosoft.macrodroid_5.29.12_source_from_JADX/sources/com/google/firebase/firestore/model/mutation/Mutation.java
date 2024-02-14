package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Mutation {

    /* renamed from: a */
    private final DocumentKey f54477a;

    /* renamed from: b */
    private final Precondition f54478b;

    /* renamed from: c */
    private final List<FieldTransform> f54479c;

    Mutation(DocumentKey documentKey, Precondition precondition) {
        this(documentKey, precondition, new ArrayList());
    }

    /* renamed from: f */
    static SnapshotVersion m75954f(MutableDocument mutableDocument) {
        if (mutableDocument.mo62822e()) {
            return mutableDocument.getVersion();
        }
        return SnapshotVersion.f54468c;
    }

    /* renamed from: a */
    public abstract void mo62887a(MutableDocument mutableDocument, Timestamp timestamp);

    /* renamed from: b */
    public abstract void mo62888b(MutableDocument mutableDocument, MutationResult mutationResult);

    /* renamed from: c */
    public ObjectValue mo62900c(Document document) {
        ObjectValue objectValue = null;
        for (FieldTransform next : this.f54479c) {
            Value b = next.mo62897b().mo62881b(document.mo62823f(next.mo62896a()));
            if (b != null) {
                if (objectValue == null) {
                    objectValue = new ObjectValue();
                }
                objectValue.mo62870n(next.mo62896a(), b);
            }
        }
        return objectValue;
    }

    /* renamed from: d */
    public List<FieldTransform> mo62901d() {
        return this.f54479c;
    }

    /* renamed from: e */
    public DocumentKey mo62902e() {
        return this.f54477a;
    }

    /* renamed from: g */
    public Precondition mo62903g() {
        return this.f54478b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo62904h(Mutation mutation) {
        return this.f54477a.equals(mutation.f54477a) && this.f54478b.equals(mutation.f54478b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo62905i() {
        return (mo62902e().hashCode() * 31) + this.f54478b.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo62906j() {
        return "key=" + this.f54477a + ", precondition=" + this.f54478b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Map<FieldPath, Value> mo62907k(Timestamp timestamp, MutableDocument mutableDocument) {
        HashMap hashMap = new HashMap(this.f54479c.size());
        for (FieldTransform next : this.f54479c) {
            TransformOperation b = next.mo62897b();
            Value value = null;
            if (mutableDocument.mo62822e()) {
                value = mutableDocument.mo62823f(next.mo62896a());
            }
            hashMap.put(next.mo62896a(), b.mo62880a(value, timestamp));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Map<FieldPath, Value> mo62908l(MutableDocument mutableDocument, List<Value> list) {
        HashMap hashMap = new HashMap(this.f54479c.size());
        Assert.m76443d(this.f54479c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f54479c.size()));
        for (int i = 0; i < list.size(); i++) {
            FieldTransform fieldTransform = this.f54479c.get(i);
            TransformOperation b = fieldTransform.mo62897b();
            Value value = null;
            if (mutableDocument.mo62822e()) {
                value = mutableDocument.mo62823f(fieldTransform.mo62896a());
            }
            hashMap.put(fieldTransform.mo62896a(), b.mo62882c(value, list.get(i)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo62909m(MutableDocument mutableDocument) {
        Assert.m76443d(mutableDocument.getKey().equals(mo62902e()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    Mutation(DocumentKey documentKey, Precondition precondition, List<FieldTransform> list) {
        this.f54477a = documentKey;
        this.f54478b = precondition;
        this.f54479c = list;
    }
}
