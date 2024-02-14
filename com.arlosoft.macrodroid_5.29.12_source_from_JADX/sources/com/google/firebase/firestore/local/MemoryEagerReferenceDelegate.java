package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class MemoryEagerReferenceDelegate implements ReferenceDelegate {

    /* renamed from: a */
    private ReferenceSet f54262a;

    /* renamed from: b */
    private final MemoryPersistence f54263b;

    /* renamed from: c */
    private Set<DocumentKey> f54264c;

    MemoryEagerReferenceDelegate(MemoryPersistence memoryPersistence) {
        this.f54263b = memoryPersistence;
    }

    /* renamed from: a */
    private boolean m75428a(DocumentKey documentKey) {
        if (this.f54263b.mo62690f().mo62720k(documentKey) || m75429b(documentKey)) {
            return true;
        }
        ReferenceSet referenceSet = this.f54262a;
        if (referenceSet == null || !referenceSet.mo62730c(documentKey)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m75429b(DocumentKey documentKey) {
        for (MemoryMutationQueue n : this.f54263b.mo62696m()) {
            if (n.mo62681n(documentKey)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public long mo62657d() {
        return -1;
    }

    /* renamed from: g */
    public void mo62658g(DocumentKey documentKey) {
        if (m75428a(documentKey)) {
            this.f54264c.remove(documentKey);
        } else {
            this.f54264c.add(documentKey);
        }
    }

    /* renamed from: h */
    public void mo62659h() {
        MemoryRemoteDocumentCache n = this.f54263b.mo62689e();
        for (DocumentKey next : this.f54264c) {
            if (!m75428a(next)) {
                n.mo62700b(next);
            }
        }
        this.f54264c = null;
    }

    /* renamed from: i */
    public void mo62660i() {
        this.f54264c = new HashSet();
    }

    /* renamed from: j */
    public void mo62661j(DocumentKey documentKey) {
        this.f54264c.add(documentKey);
    }

    /* renamed from: l */
    public void mo62662l(TargetData targetData) {
        MemoryTargetCache o = this.f54263b.mo62690f();
        Iterator<DocumentKey> it = o.mo62716g(targetData.mo62788g()).iterator();
        while (it.hasNext()) {
            this.f54264c.add(it.next());
        }
        o.mo62725p(targetData);
    }

    /* renamed from: n */
    public void mo62663n(ReferenceSet referenceSet) {
        this.f54262a = referenceSet;
    }

    /* renamed from: o */
    public void mo62664o(DocumentKey documentKey) {
        this.f54264c.remove(documentKey);
    }

    /* renamed from: p */
    public void mo62665p(DocumentKey documentKey) {
        this.f54264c.add(documentKey);
    }
}
