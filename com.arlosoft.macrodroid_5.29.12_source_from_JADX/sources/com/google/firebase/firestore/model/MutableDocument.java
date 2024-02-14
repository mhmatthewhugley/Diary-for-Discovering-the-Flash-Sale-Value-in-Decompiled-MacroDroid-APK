package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import com.google.firestore.p228v1.Value;

public final class MutableDocument implements Document, Cloneable {

    /* renamed from: a */
    private final DocumentKey f54451a;

    /* renamed from: c */
    private DocumentType f54452c;

    /* renamed from: d */
    private SnapshotVersion f54453d;

    /* renamed from: f */
    private ObjectValue f54454f;

    /* renamed from: g */
    private DocumentState f54455g;

    private enum DocumentState {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    private enum DocumentType {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private MutableDocument(DocumentKey documentKey) {
        this.f54451a = documentKey;
    }

    /* renamed from: p */
    public static MutableDocument m75871p(DocumentKey documentKey, SnapshotVersion snapshotVersion, ObjectValue objectValue) {
        return new MutableDocument(documentKey).mo62853h(snapshotVersion, objectValue);
    }

    /* renamed from: q */
    public static MutableDocument m75872q(DocumentKey documentKey) {
        return new MutableDocument(documentKey, DocumentType.INVALID, SnapshotVersion.f54468c, new ObjectValue(), DocumentState.SYNCED);
    }

    /* renamed from: r */
    public static MutableDocument m75873r(DocumentKey documentKey, SnapshotVersion snapshotVersion) {
        return new MutableDocument(documentKey).mo62855k(snapshotVersion);
    }

    /* renamed from: s */
    public static MutableDocument m75874s(DocumentKey documentKey, SnapshotVersion snapshotVersion) {
        return new MutableDocument(documentKey).mo62856l(snapshotVersion);
    }

    /* renamed from: a */
    public boolean mo62818a() {
        return this.f54455g.equals(DocumentState.HAS_COMMITTED_MUTATIONS);
    }

    /* renamed from: b */
    public boolean mo62819b() {
        return this.f54455g.equals(DocumentState.HAS_LOCAL_MUTATIONS);
    }

    /* renamed from: c */
    public boolean mo62820c() {
        return mo62819b() || mo62818a();
    }

    /* renamed from: d */
    public boolean mo62821d() {
        return this.f54452c.equals(DocumentType.NO_DOCUMENT);
    }

    /* renamed from: e */
    public boolean mo62822e() {
        return this.f54452c.equals(DocumentType.FOUND_DOCUMENT);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutableDocument.class != obj.getClass()) {
            return false;
        }
        MutableDocument mutableDocument = (MutableDocument) obj;
        if (this.f54451a.equals(mutableDocument.f54451a) && this.f54453d.equals(mutableDocument.f54453d) && this.f54452c.equals(mutableDocument.f54452c) && this.f54455g.equals(mutableDocument.f54455g)) {
            return this.f54454f.equals(mutableDocument.f54454f);
        }
        return false;
    }

    /* renamed from: f */
    public Value mo62823f(FieldPath fieldPath) {
        return getData().mo62866h(fieldPath);
    }

    @NonNull
    /* renamed from: g */
    public MutableDocument clone() {
        return new MutableDocument(this.f54451a, this.f54452c, this.f54453d, this.f54454f.clone(), this.f54455g);
    }

    public ObjectValue getData() {
        return this.f54454f;
    }

    public DocumentKey getKey() {
        return this.f54451a;
    }

    public SnapshotVersion getVersion() {
        return this.f54453d;
    }

    /* renamed from: h */
    public MutableDocument mo62853h(SnapshotVersion snapshotVersion, ObjectValue objectValue) {
        this.f54453d = snapshotVersion;
        this.f54452c = DocumentType.FOUND_DOCUMENT;
        this.f54454f = objectValue;
        this.f54455g = DocumentState.SYNCED;
        return this;
    }

    public int hashCode() {
        return this.f54451a.hashCode();
    }

    /* renamed from: k */
    public MutableDocument mo62855k(SnapshotVersion snapshotVersion) {
        this.f54453d = snapshotVersion;
        this.f54452c = DocumentType.NO_DOCUMENT;
        this.f54454f = new ObjectValue();
        this.f54455g = DocumentState.SYNCED;
        return this;
    }

    /* renamed from: l */
    public MutableDocument mo62856l(SnapshotVersion snapshotVersion) {
        this.f54453d = snapshotVersion;
        this.f54452c = DocumentType.UNKNOWN_DOCUMENT;
        this.f54454f = new ObjectValue();
        this.f54455g = DocumentState.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    /* renamed from: n */
    public boolean mo62857n() {
        return this.f54452c.equals(DocumentType.UNKNOWN_DOCUMENT);
    }

    /* renamed from: o */
    public boolean mo62858o() {
        return !this.f54452c.equals(DocumentType.INVALID);
    }

    /* renamed from: t */
    public MutableDocument mo62859t() {
        this.f54455g = DocumentState.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f54451a + ", version=" + this.f54453d + ", type=" + this.f54452c + ", documentState=" + this.f54455g + ", value=" + this.f54454f + '}';
    }

    /* renamed from: u */
    public MutableDocument mo62861u() {
        this.f54455g = DocumentState.HAS_LOCAL_MUTATIONS;
        return this;
    }

    private MutableDocument(DocumentKey documentKey, DocumentType documentType, SnapshotVersion snapshotVersion, ObjectValue objectValue, DocumentState documentState) {
        this.f54451a = documentKey;
        this.f54453d = snapshotVersion;
        this.f54452c = documentType;
        this.f54455g = documentState;
        this.f54454f = objectValue;
    }
}
