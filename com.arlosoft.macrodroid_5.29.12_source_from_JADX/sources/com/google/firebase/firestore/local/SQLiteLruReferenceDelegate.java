package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.core.ListenSequence;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;

class SQLiteLruReferenceDelegate implements ReferenceDelegate, LruDelegate {

    /* renamed from: a */
    private final SQLitePersistence f54316a;

    /* renamed from: b */
    private ListenSequence f54317b;

    /* renamed from: c */
    private long f54318c = -1;

    /* renamed from: d */
    private final LruGarbageCollector f54319d;

    /* renamed from: e */
    private ReferenceSet f54320e;

    SQLiteLruReferenceDelegate(SQLitePersistence sQLitePersistence, LruGarbageCollector.Params params) {
        this.f54316a = sQLitePersistence;
        this.f54319d = new LruGarbageCollector(this, params);
    }

    /* renamed from: q */
    private boolean m75586q(DocumentKey documentKey) {
        if (this.f54320e.mo62730c(documentKey)) {
            return true;
        }
        return m75590u(documentKey);
    }

    /* renamed from: t */
    static /* synthetic */ void m75589t(SQLiteLruReferenceDelegate sQLiteLruReferenceDelegate, int[] iArr, Cursor cursor) {
        DocumentKey i = DocumentKey.m75849i(EncodedPath.m75289b(cursor.getString(0)));
        if (!sQLiteLruReferenceDelegate.m75586q(i)) {
            iArr[0] = iArr[0] + 1;
            sQLiteLruReferenceDelegate.f54316a.mo62689e().mo62700b(i);
            sQLiteLruReferenceDelegate.m75591v(i);
        }
    }

    /* renamed from: u */
    private boolean m75590u(DocumentKey documentKey) {
        return !this.f54316a.mo62742A("SELECT 1 FROM document_mutations WHERE path = ?").mo62760a(EncodedPath.m75290c(documentKey.mo62832k())).mo62764e();
    }

    /* renamed from: v */
    private void m75591v(DocumentKey documentKey) {
        this.f54316a.mo62744r("DELETE FROM target_documents WHERE path = ? AND target_id = 0", EncodedPath.m75290c(documentKey.mo62832k()));
    }

    /* renamed from: x */
    private void m75592x(DocumentKey documentKey) {
        String c = EncodedPath.m75290c(documentKey.mo62832k());
        this.f54316a.mo62744r("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", c, Long.valueOf(mo62657d()));
    }

    /* renamed from: a */
    public long mo62638a() {
        return this.f54316a.mo62745s();
    }

    /* renamed from: b */
    public void mo62639b(Consumer<Long> consumer) {
        this.f54316a.mo62742A("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").mo62763d(SQLiteLruReferenceDelegate$$Lambda$2.m75611a(consumer));
    }

    /* renamed from: c */
    public LruGarbageCollector mo62640c() {
        return this.f54319d;
    }

    /* renamed from: d */
    public long mo62657d() {
        Assert.m76443d(this.f54318c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f54318c;
    }

    /* renamed from: e */
    public int mo62641e(long j) {
        int[] iArr = new int[1];
        while (true) {
            boolean z = true;
            while (true) {
                if (!z) {
                    return iArr[0];
                }
                if (this.f54316a.mo62742A("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?").mo62760a(Long.valueOf(j), 100).mo62763d(SQLiteLruReferenceDelegate$$Lambda$3.m75612a(this, iArr)) != 100) {
                    z = false;
                }
            }
        }
    }

    /* renamed from: f */
    public int mo62642f(long j, SparseArray<?> sparseArray) {
        return this.f54316a.mo62690f().mo62779t(j, sparseArray);
    }

    /* renamed from: g */
    public void mo62658g(DocumentKey documentKey) {
        m75592x(documentKey);
    }

    /* renamed from: h */
    public void mo62659h() {
        Assert.m76443d(this.f54318c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f54318c = -1;
    }

    /* renamed from: i */
    public void mo62660i() {
        Assert.m76443d(this.f54318c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f54318c = this.f54317b.mo23896a();
    }

    /* renamed from: j */
    public void mo62661j(DocumentKey documentKey) {
        m75592x(documentKey);
    }

    /* renamed from: k */
    public void mo62643k(Consumer<TargetData> consumer) {
        this.f54316a.mo62690f().mo62776l(consumer);
    }

    /* renamed from: l */
    public void mo62662l(TargetData targetData) {
        this.f54316a.mo62690f().mo62710a(targetData.mo62792j(mo62657d()));
    }

    /* renamed from: m */
    public long mo62644m() {
        return this.f54316a.mo62690f().mo62778n() + ((Long) this.f54316a.mo62742A("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").mo62762c(SQLiteLruReferenceDelegate$$Lambda$1.m75610a())).longValue();
    }

    /* renamed from: n */
    public void mo62663n(ReferenceSet referenceSet) {
        this.f54320e = referenceSet;
    }

    /* renamed from: o */
    public void mo62664o(DocumentKey documentKey) {
        m75592x(documentKey);
    }

    /* renamed from: p */
    public void mo62665p(DocumentKey documentKey) {
        m75592x(documentKey);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo62736w(long j) {
        this.f54317b = new ListenSequence(j);
    }
}
