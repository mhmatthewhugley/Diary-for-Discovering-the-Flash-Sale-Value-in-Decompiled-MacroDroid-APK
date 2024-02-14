package com.google.firebase.firestore.local;

import android.database.Cursor;
import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.bundle.BundledQuery;
import com.google.protobuf.InvalidProtocolBufferException;

class SQLiteBundleCache implements BundleCache {

    /* renamed from: a */
    private final SQLitePersistence f54308a;

    /* renamed from: b */
    private final LocalSerializer f54309b;

    SQLiteBundleCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f54308a = sQLitePersistence;
        this.f54309b = localSerializer;
    }

    /* renamed from: e */
    static /* synthetic */ BundleMetadata m75573e(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new BundleMetadata(str, cursor.getInt(0), new SnapshotVersion(new Timestamp(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* renamed from: f */
    static /* synthetic */ NamedQuery m75574f(SQLiteBundleCache sQLiteBundleCache, String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new NamedQuery(str, sQLiteBundleCache.f54309b.mo62596a(BundledQuery.m77695b0(cursor.getBlob(2))), new SnapshotVersion(new Timestamp(cursor.getLong(0), cursor.getInt(1))));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.m76440a("NamedQuery failed to parse: %s", e);
        }
    }

    /* renamed from: a */
    public void mo62575a(NamedQuery namedQuery) {
        BundledQuery h = this.f54309b.mo62600h(namedQuery.mo23795a());
        this.f54308a.mo62744r("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", namedQuery.mo23796b(), Long.valueOf(namedQuery.mo23797c().mo62876d().mo61973e()), Integer.valueOf(namedQuery.mo23797c().mo62876d().mo61971d()), h.mo64718h());
    }

    /* renamed from: b */
    public void mo62576b(BundleMetadata bundleMetadata) {
        this.f54308a.mo62744r("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", bundleMetadata.mo23770a(), Integer.valueOf(bundleMetadata.mo23772c()), Long.valueOf(bundleMetadata.mo23771b().mo62876d().mo61973e()), Integer.valueOf(bundleMetadata.mo23771b().mo62876d().mo61971d()), Integer.valueOf(bundleMetadata.mo23774e()), Long.valueOf(bundleMetadata.mo23773d()));
    }

    @Nullable
    /* renamed from: c */
    public BundleMetadata mo62577c(String str) {
        return (BundleMetadata) this.f54308a.mo62742A("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").mo62760a(str).mo62762c(SQLiteBundleCache$$Lambda$1.m75579a(str));
    }

    @Nullable
    /* renamed from: d */
    public NamedQuery mo62578d(String str) {
        return (NamedQuery) this.f54308a.mo62742A("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").mo62760a(str).mo62762c(SQLiteBundleCache$$Lambda$2.m75580a(this, str));
    }
}
