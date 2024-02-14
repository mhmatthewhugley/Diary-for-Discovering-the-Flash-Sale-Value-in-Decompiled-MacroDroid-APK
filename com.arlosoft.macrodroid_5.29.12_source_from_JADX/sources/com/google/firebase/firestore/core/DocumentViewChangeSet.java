package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class DocumentViewChangeSet {

    /* renamed from: a */
    private final TreeMap<DocumentKey, DocumentViewChange> f5845a = new TreeMap<>();

    /* renamed from: a */
    public void mo23849a(DocumentViewChange documentViewChange) {
        DocumentKey key = documentViewChange.mo23844b().getKey();
        DocumentViewChange documentViewChange2 = this.f5845a.get(key);
        if (documentViewChange2 == null) {
            this.f5845a.put(key, documentViewChange);
            return;
        }
        DocumentViewChange.Type c = documentViewChange2.mo23845c();
        DocumentViewChange.Type c2 = documentViewChange.mo23845c();
        DocumentViewChange.Type type = DocumentViewChange.Type.ADDED;
        if (c2 != type && c == DocumentViewChange.Type.METADATA) {
            this.f5845a.put(key, documentViewChange);
        } else if (c2 != DocumentViewChange.Type.METADATA || c == DocumentViewChange.Type.REMOVED) {
            DocumentViewChange.Type type2 = DocumentViewChange.Type.MODIFIED;
            if (c2 == type2 && c == type2) {
                this.f5845a.put(key, DocumentViewChange.m8047a(type2, documentViewChange.mo23844b()));
            } else if (c2 == type2 && c == type) {
                this.f5845a.put(key, DocumentViewChange.m8047a(type, documentViewChange.mo23844b()));
            } else {
                DocumentViewChange.Type type3 = DocumentViewChange.Type.REMOVED;
                if (c2 == type3 && c == type) {
                    this.f5845a.remove(key);
                } else if (c2 == type3 && c == type2) {
                    this.f5845a.put(key, DocumentViewChange.m8047a(type3, documentViewChange2.mo23844b()));
                } else if (c2 == type && c == type3) {
                    this.f5845a.put(key, DocumentViewChange.m8047a(type2, documentViewChange.mo23844b()));
                } else {
                    throw Assert.m76440a("Unsupported combination of changes %s after %s", c2, c);
                }
            }
        } else {
            this.f5845a.put(key, DocumentViewChange.m8047a(c, documentViewChange.mo23844b()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<DocumentViewChange> mo23850b() {
        return new ArrayList(this.f5845a.values());
    }
}
