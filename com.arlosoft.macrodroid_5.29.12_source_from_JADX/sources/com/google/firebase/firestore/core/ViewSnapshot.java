package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ViewSnapshot {

    /* renamed from: a */
    private final Query f6043a;

    /* renamed from: b */
    private final DocumentSet f6044b;

    /* renamed from: c */
    private final DocumentSet f6045c;

    /* renamed from: d */
    private final List<DocumentViewChange> f6046d;

    /* renamed from: e */
    private final boolean f6047e;

    /* renamed from: f */
    private final ImmutableSortedSet<DocumentKey> f6048f;

    /* renamed from: g */
    private final boolean f6049g;

    /* renamed from: h */
    private boolean f6050h;

    public enum SyncState {
        NONE,
        LOCAL,
        SYNCED
    }

    public ViewSnapshot(Query query, DocumentSet documentSet, DocumentSet documentSet2, List<DocumentViewChange> list, boolean z, ImmutableSortedSet<DocumentKey> immutableSortedSet, boolean z2, boolean z3) {
        this.f6043a = query;
        this.f6044b = documentSet;
        this.f6045c = documentSet2;
        this.f6046d = list;
        this.f6047e = z;
        this.f6048f = immutableSortedSet;
        this.f6049g = z2;
        this.f6050h = z3;
    }

    /* renamed from: c */
    public static ViewSnapshot m8266c(Query query, DocumentSet documentSet, ImmutableSortedSet<DocumentKey> immutableSortedSet, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Document> it = documentSet.iterator();
        while (it.hasNext()) {
            arrayList.add(DocumentViewChange.m8047a(DocumentViewChange.Type.ADDED, it.next()));
        }
        return new ViewSnapshot(query, documentSet, DocumentSet.m75856d(query.mo23912c()), arrayList, z, immutableSortedSet, true, z2);
    }

    /* renamed from: a */
    public boolean mo23980a() {
        return this.f6049g;
    }

    /* renamed from: b */
    public boolean mo23981b() {
        return this.f6050h;
    }

    /* renamed from: d */
    public List<DocumentViewChange> mo23982d() {
        return this.f6046d;
    }

    /* renamed from: e */
    public DocumentSet mo23983e() {
        return this.f6044b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewSnapshot)) {
            return false;
        }
        ViewSnapshot viewSnapshot = (ViewSnapshot) obj;
        if (this.f6047e == viewSnapshot.f6047e && this.f6049g == viewSnapshot.f6049g && this.f6050h == viewSnapshot.f6050h && this.f6043a.equals(viewSnapshot.f6043a) && this.f6048f.equals(viewSnapshot.f6048f) && this.f6044b.equals(viewSnapshot.f6044b) && this.f6045c.equals(viewSnapshot.f6045c)) {
            return this.f6046d.equals(viewSnapshot.f6046d);
        }
        return false;
    }

    /* renamed from: f */
    public ImmutableSortedSet<DocumentKey> mo23985f() {
        return this.f6048f;
    }

    /* renamed from: g */
    public DocumentSet mo23986g() {
        return this.f6045c;
    }

    /* renamed from: h */
    public Query mo23987h() {
        return this.f6043a;
    }

    public int hashCode() {
        return (((((((((((((this.f6043a.hashCode() * 31) + this.f6044b.hashCode()) * 31) + this.f6045c.hashCode()) * 31) + this.f6046d.hashCode()) * 31) + this.f6048f.hashCode()) * 31) + (this.f6047e ? 1 : 0)) * 31) + (this.f6049g ? 1 : 0)) * 31) + (this.f6050h ? 1 : 0);
    }

    /* renamed from: i */
    public boolean mo23989i() {
        return !this.f6048f.isEmpty();
    }

    /* renamed from: j */
    public boolean mo23990j() {
        return this.f6047e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f6043a + ", " + this.f6044b + ", " + this.f6045c + ", " + this.f6046d + ", isFromCache=" + this.f6047e + ", mutatedKeys=" + this.f6048f.size() + ", didSyncStateChange=" + this.f6049g + ", excludesMetadataChanges=" + this.f6050h + ")";
    }
}
