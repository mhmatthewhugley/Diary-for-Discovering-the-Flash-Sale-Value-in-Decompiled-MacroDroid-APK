package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class SQLiteMutationQueue implements MutationQueue {

    /* renamed from: a */
    private final SQLitePersistence f54325a;

    /* renamed from: b */
    private final LocalSerializer f54326b;

    /* renamed from: c */
    private final String f54327c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f54328d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ByteString f54329e;

    private static class BlobAccumulator implements Consumer<Cursor> {

        /* renamed from: a */
        private final ArrayList<ByteString> f54330a = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f54331b = true;

        BlobAccumulator(byte[] bArr) {
            m75643c(bArr);
        }

        /* renamed from: c */
        private void m75643c(byte[] bArr) {
            this.f54330a.add(ByteString.m79773p(bArr));
        }

        /* renamed from: a */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            m75643c(blob);
            if (blob.length < 1000000) {
                this.f54331b = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo62739d() {
            return this.f54330a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public ByteString mo62740e() {
            return ByteString.m79770l(this.f54330a);
        }
    }

    SQLiteMutationQueue(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user) {
        this.f54325a = sQLitePersistence;
        this.f54326b = localSerializer;
        this.f54327c = user.mo23757b() ? user.mo23756a() : "";
        this.f54329e = WriteStream.f54711s;
    }

    /* renamed from: B */
    private void m75614B() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f54325a.mo62742A("SELECT uid FROM mutation_queues").mo62763d(SQLiteMutationQueue$$Lambda$2.m75651a(arrayList));
        this.f54328d = 0;
        for (String str : arrayList) {
            this.f54325a.mo62742A("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").mo62760a(str).mo62763d(SQLiteMutationQueue$$Lambda$3.m75652a(this));
        }
        this.f54328d++;
    }

    /* renamed from: C */
    private void m75615C() {
        this.f54325a.mo62744r("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f54327c, -1, this.f54329e.mo64916V());
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public MutationBatch m75616n(int i, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f54326b.mo62598d(WriteBatch.m76111k0(bArr));
            }
            BlobAccumulator blobAccumulator = new BlobAccumulator(bArr);
            while (blobAccumulator.f54331b) {
                this.f54325a.mo62742A("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").mo62760a(Integer.valueOf((blobAccumulator.mo62739d() * 1000000) + 1), 1000000, this.f54327c, Integer.valueOf(i)).mo62761b(blobAccumulator);
            }
            return this.f54326b.mo62598d(WriteBatch.m76110j0(blobAccumulator.mo62740e()));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.m76440a("MutationBatch failed to parse: %s", e);
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m75619r(SQLiteMutationQueue sQLiteMutationQueue, Set set, List list, Cursor cursor) {
        int i = cursor.getInt(0);
        if (!set.contains(Integer.valueOf(i))) {
            set.add(Integer.valueOf(i));
            list.add(sQLiteMutationQueue.m75616n(i, cursor.getBlob(1)));
        }
    }

    /* renamed from: t */
    static /* synthetic */ void m75621t(SQLiteMutationQueue sQLiteMutationQueue, List list, int i, Cursor cursor) {
        int i2 = cursor.getInt(0);
        int size = list.size();
        if ((size <= 0 || i2 != ((MutationBatch) list.get(size - 1)).mo62914e()) && EncodedPath.m75289b(cursor.getString(1)).mo62807n() == i) {
            list.add(sQLiteMutationQueue.m75616n(i2, cursor.getBlob(2)));
        }
    }

    /* renamed from: a */
    public void mo62668a() {
        if (mo62737o()) {
            ArrayList arrayList = new ArrayList();
            this.f54325a.mo62742A("SELECT path FROM document_mutations WHERE uid = ?").mo62760a(this.f54327c).mo62763d(SQLiteMutationQueue$$Lambda$12.m75650a(arrayList));
            Assert.m76443d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    /* renamed from: b */
    public List<MutationBatch> mo62669b(Iterable<DocumentKey> iterable) {
        ArrayList arrayList = new ArrayList();
        for (DocumentKey k : iterable) {
            arrayList.add(EncodedPath.m75290c(k.mo62832k()));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f54325a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(new Object[]{1000000, this.f54327c}), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (longQuery.mo62753b()) {
            longQuery.mo62754c().mo62763d(SQLiteMutationQueue$$Lambda$9.m75658a(this, hashSet, arrayList2));
        }
        if (longQuery.mo62752a() > 1) {
            Collections.sort(arrayList2, SQLiteMutationQueue$$Lambda$10.m75648a());
        }
        return arrayList2;
    }

    @Nullable
    /* renamed from: c */
    public MutationBatch mo62670c(int i) {
        return (MutationBatch) this.f54325a.mo62742A("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").mo62760a(1000000, this.f54327c, Integer.valueOf(i + 1)).mo62762c(SQLiteMutationQueue$$Lambda$5.m75654a(this));
    }

    @Nullable
    /* renamed from: d */
    public MutationBatch mo62671d(int i) {
        return (MutationBatch) this.f54325a.mo62742A("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").mo62760a(1000000, this.f54327c, Integer.valueOf(i)).mo62762c(SQLiteMutationQueue$$Lambda$4.m75653a(this, i));
    }

    /* renamed from: e */
    public ByteString mo62672e() {
        return this.f54329e;
    }

    /* renamed from: f */
    public void mo62673f(MutationBatch mutationBatch, ByteString byteString) {
        this.f54329e = (ByteString) Preconditions.m76513b(byteString);
        m75615C();
    }

    /* renamed from: g */
    public MutationBatch mo62674g(Timestamp timestamp, List<Mutation> list, List<Mutation> list2) {
        int i = this.f54328d;
        this.f54328d = i + 1;
        MutationBatch mutationBatch = new MutationBatch(i, timestamp, list, list2);
        WriteBatch k = this.f54326b.mo62602k(mutationBatch);
        this.f54325a.mo62744r("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f54327c, Integer.valueOf(i), k.mo64718h());
        HashSet hashSet = new HashSet();
        SQLiteStatement z = this.f54325a.mo62748z("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        for (Mutation e : list2) {
            DocumentKey e2 = e.mo62902e();
            if (hashSet.add(e2)) {
                String c = EncodedPath.m75290c(e2.mo62832k());
                this.f54325a.mo62743q(z, this.f54327c, c, Integer.valueOf(i));
                this.f54325a.mo62686b().mo62590a((ResourcePath) e2.mo62832k().mo62809q());
            }
        }
        return mutationBatch;
    }

    /* renamed from: h */
    public List<MutationBatch> mo62675h(DocumentKey documentKey) {
        String c = EncodedPath.m75290c(documentKey.mo62832k());
        ArrayList arrayList = new ArrayList();
        this.f54325a.mo62742A("SELECT m.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path = ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").mo62760a(1000000, this.f54327c, c).mo62763d(SQLiteMutationQueue$$Lambda$8.m75657a(this, arrayList));
        return arrayList;
    }

    /* renamed from: i */
    public void mo62676i(ByteString byteString) {
        this.f54329e = (ByteString) Preconditions.m76513b(byteString);
        m75615C();
    }

    /* renamed from: j */
    public int mo62677j() {
        return ((Integer) this.f54325a.mo62742A("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").mo62760a(-1, this.f54327c).mo62762c(SQLiteMutationQueue$$Lambda$6.m75655a())).intValue();
    }

    /* renamed from: k */
    public void mo62678k(MutationBatch mutationBatch) {
        SQLiteStatement z = this.f54325a.mo62748z("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement z2 = this.f54325a.mo62748z("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int e = mutationBatch.mo62914e();
        Assert.m76443d(this.f54325a.mo62743q(z, this.f54327c, Integer.valueOf(e)) != 0, "Mutation batch (%s, %d) did not exist", this.f54327c, Integer.valueOf(mutationBatch.mo62914e()));
        for (Mutation e2 : mutationBatch.mo62918h()) {
            DocumentKey e3 = e2.mo62902e();
            this.f54325a.mo62743q(z2, this.f54327c, EncodedPath.m75290c(e3.mo62832k()), Integer.valueOf(e));
            this.f54325a.mo62688d().mo62661j(e3);
        }
    }

    /* renamed from: l */
    public List<MutationBatch> mo62679l(Query query) {
        Assert.m76443d(!query.mo23929r(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath m = query.mo23924m();
        String c = EncodedPath.m75290c(m);
        String f = EncodedPath.m75293f(c);
        ArrayList arrayList = new ArrayList();
        this.f54325a.mo62742A("SELECT dm.batch_id, dm.path, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path >= ? AND dm.path < ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").mo62760a(1000000, this.f54327c, c, f).mo62763d(SQLiteMutationQueue$$Lambda$11.m75649a(this, arrayList, m.mo62807n() + 1));
        return arrayList;
    }

    /* renamed from: m */
    public List<MutationBatch> mo62680m() {
        ArrayList arrayList = new ArrayList();
        this.f54325a.mo62742A("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").mo62760a(1000000, this.f54327c).mo62763d(SQLiteMutationQueue$$Lambda$7.m75656a(this, arrayList));
        return arrayList;
    }

    /* renamed from: o */
    public boolean mo62737o() {
        return this.f54325a.mo62742A("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").mo62760a(this.f54327c).mo62764e();
    }

    public void start() {
        m75614B();
        if (this.f54325a.mo62742A("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").mo62760a(this.f54327c).mo62761b(SQLiteMutationQueue$$Lambda$1.m75647a(this)) == 0) {
            m75615C();
        }
    }
}
