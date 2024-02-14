package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.mail.Part;
import org.apache.commons.logging.LogFactory;
import p287ia.C12478a;

@WorkerThread
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {

    /* renamed from: o */
    private static final Encoding f1576o = Encoding.m954b("proto");

    /* renamed from: a */
    private final SchemaManager f1577a;

    /* renamed from: c */
    private final Clock f1578c;

    /* renamed from: d */
    private final Clock f1579d;

    /* renamed from: f */
    private final EventStoreConfig f1580f;

    /* renamed from: g */
    private final C12478a<String> f1581g;

    interface Function<T, U> {
        U apply(T t);
    }

    private static class Metadata {

        /* renamed from: a */
        final String f1582a;

        /* renamed from: b */
        final String f1583b;

        private Metadata(String str, String str2) {
            this.f1582a = str;
            this.f1583b = str2;
        }
    }

    interface Producer<T> {
        /* renamed from: a */
        T mo19618a();
    }

    SQLiteEventStore(@WallTime Clock clock, @Monotonic Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, C12478a<String> aVar) {
        this.f1577a = schemaManager;
        this.f1578c = clock;
        this.f1579d = clock2;
        this.f1580f = eventStoreConfig;
        this.f1581g = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ ClientMetrics m1544A0(Map map, ClientMetrics.Builder builder, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason K = m1560K(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.m1355c().mo19516c(K).mo19515b(j).mo19514a());
        }
        m1576d1(builder, map);
        builder.mo19508e(m1568U());
        builder.mo19507d(m1565Q());
        builder.mo19506c(this.f1581g.get());
        return builder.mo19505b();
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ ClientMetrics m1546B0(String str, Map map, ClientMetrics.Builder builder, SQLiteDatabase sQLiteDatabase) {
        return (ClientMetrics) m1589j1(sQLiteDatabase.rawQuery(str, new String[0]), new C1696e(this, map, builder));
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ Object m1548C0(List list, TransportContext transportContext, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            EventInternal.Builder k = EventInternal.m1208a().mo19410j(cursor.getString(1)).mo19409i(cursor.getLong(2)).mo19411k(cursor.getLong(3));
            if (z) {
                k.mo19408h(new EncodedPayload(m1582g1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo19408h(new EncodedPayload(m1582g1(cursor.getString(4)), m1578e1(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo19407g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(PersistedEvent.m1539a(j, transportContext, k.mo19404d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public static /* synthetic */ Object m1550D0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new Metadata(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ Long m1552E0(EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        if (m1574c0()) {
            mo19598f(1, LogEventDropped.Reason.CACHE_FULL, eventInternal.mo19401j());
            return -1L;
        }
        long M = m1563M(sQLiteDatabase, transportContext);
        int e = this.f1580f.mo19579e();
        byte[] a = eventInternal.mo19397e().mo19440a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(M));
        contentValues.put("transport_name", eventInternal.mo19401j());
        contentValues.put("timestamp_ms", Long.valueOf(eventInternal.mo19399f()));
        contentValues.put("uptime_ms", Long.valueOf(eventInternal.mo19402k()));
        contentValues.put("payload_encoding", eventInternal.mo19397e().mo19441b().mo19267a());
        contentValues.put("code", eventInternal.mo19396d());
        contentValues.put("num_attempts", 0);
        contentValues.put(Part.INLINE, Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : eventInternal.mo19448i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public static /* synthetic */ byte[] m1555G0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public /* synthetic */ Object m1558I0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo19598f((long) i, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: K */
    private LogEventDropped.Reason m1560K(int i) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i == reason.mo19517c()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i == reason2.mo19517c()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i == reason3.mo19517c()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i == reason4.mo19517c()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i == reason5.mo19517c()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i == reason6.mo19517c()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i == reason7.mo19517c()) {
            return reason7;
        }
        Logging.m1381b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return reason;
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public /* synthetic */ Object m1561K0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m1589j1(sQLiteDatabase.rawQuery(str2, (String[]) null), new C1715v(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: L */
    private void m1562L(SQLiteDatabase sQLiteDatabase) {
        m1580f1(new C1711r(sQLiteDatabase), C1710q.f1636a);
    }

    /* renamed from: M */
    private long m1563M(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        Long W = m1571W(sQLiteDatabase, transportContext);
        if (W != null) {
            return W.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", transportContext.mo19426b());
        contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(PriorityMapping.m1670a(transportContext.mo19428d())));
        contentValues.put("next_request_ms", 0);
        if (transportContext.mo19427c() != null) {
            contentValues.put("extras", Base64.encodeToString(transportContext.mo19427c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public static /* synthetic */ Boolean m1564N0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: Q */
    private GlobalMetrics m1565Q() {
        return GlobalMetrics.m1351b().mo19511b(StorageMetrics.m1368c().mo19526b(mo19612N()).mo19527c(EventStoreConfig.f1571a.mo19581f()).mo19525a()).mo19510a();
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public static /* synthetic */ Object m1566R0(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m1589j1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.mo19517c())}), C1706m.f1632a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.mo19517c()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.mo19517c())});
        }
        return null;
    }

    /* renamed from: S */
    private long m1567S() {
        return mo19613O().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: U */
    private TimeWindow m1568U() {
        return (TimeWindow) mo19614Z(new C1705l(this.f1578c.mo19627a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ Object m1569U0(long j, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext.mo19426b(), String.valueOf(PriorityMapping.m1670a(transportContext.mo19428d()))}) < 1) {
            contentValues.put("backend_name", transportContext.mo19426b());
            contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(PriorityMapping.m1670a(transportContext.mo19428d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ Object m1570V0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f1578c.mo19627a()).execute();
        return null;
    }

    @Nullable
    /* renamed from: W */
    private Long m1571W(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{transportContext.mo19426b(), String.valueOf(PriorityMapping.m1670a(transportContext.mo19428d()))}));
        if (transportContext.mo19427c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.mo19427c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m1589j1(sQLiteDatabase.query("transport_contexts", new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C1704k.f1630a);
    }

    /* renamed from: Y0 */
    private List<PersistedEvent> m1572Y0(SQLiteDatabase sQLiteDatabase, TransportContext transportContext, int i) {
        ArrayList arrayList = new ArrayList();
        Long W = m1571W(sQLiteDatabase, transportContext);
        if (W == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m1589j1(sQLiteDatabase2.query("events", new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", Part.INLINE}, "context_id = ?", new String[]{W.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new C1694d(this, arrayList, transportContext));
        return arrayList;
    }

    /* renamed from: Z0 */
    private Map<Long, Set<Metadata>> m1573Z0(SQLiteDatabase sQLiteDatabase, List<PersistedEvent> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo19591c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m1589j1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C1700g(hashMap));
        return hashMap;
    }

    /* renamed from: c0 */
    private boolean m1574c0() {
        return m1567S() * getPageSize() >= this.f1580f.mo19581f();
    }

    /* renamed from: c1 */
    private static byte[] m1575c1(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: d1 */
    private void m1576d1(ClientMetrics.Builder builder, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry next : map.entrySet()) {
            builder.mo19504a(LogSourceMetrics.m1362c().mo19522c((String) next.getKey()).mo19521b((List) next.getValue()).mo19520a());
        }
    }

    /* renamed from: e0 */
    private List<PersistedEvent> m1577e0(List<PersistedEvent> list, Map<Long, Set<Metadata>> map) {
        ListIterator<PersistedEvent> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            PersistedEvent next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo19591c()))) {
                EventInternal.Builder l = next.mo19590b().mo19449l();
                for (Metadata metadata : map.get(Long.valueOf(next.mo19591c()))) {
                    l.mo19452c(metadata.f1582a, metadata.f1583b);
                }
                listIterator.set(PersistedEvent.m1539a(next.mo19591c(), next.mo19592d(), l.mo19404d()));
            }
        }
        return list;
    }

    /* renamed from: e1 */
    private byte[] m1578e1(long j) {
        return (byte[]) m1589j1(mo19613O().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C1701h.f1627a);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ Object m1579f0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo19598f((long) i, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: f1 */
    private <T> T m1580f1(Producer<T> producer, Function<Throwable, T> function) {
        long a = this.f1579d.mo19627a();
        while (true) {
            try {
                return producer.mo19618a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f1579d.mo19627a() >= ((long) this.f1580f.mo19576b()) + a) {
                    return function.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: g1 */
    private static Encoding m1582g1(@Nullable String str) {
        if (str == null) {
            return f1576o;
        }
        return Encoding.m954b(str);
    }

    private long getPageSize() {
        return mo19613O().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ Integer m1584h0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m1589j1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C1714u(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: h1 */
    private static String m1585h1(Iterable<PersistedEvent> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo19591c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: j1 */
    static <T> T m1589j1(Cursor cursor, Function<Cursor, T> function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public static /* synthetic */ Object m1590k0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public static /* synthetic */ SQLiteDatabase m1591l0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static /* synthetic */ Long m1593n0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static /* synthetic */ TimeWindow m1597q0(long j, SQLiteDatabase sQLiteDatabase) {
        return (TimeWindow) m1589j1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C1688a(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public static /* synthetic */ Long m1600t0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ Boolean m1604w0(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        Long W = m1571W(sQLiteDatabase, transportContext);
        if (W == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m1589j1(mo19613O().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{W.toString()}), C1707n.f1633a);
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public static /* synthetic */ List m1606x0(SQLiteDatabase sQLiteDatabase) {
        return (List) m1589j1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C1702i.f1628a);
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public static /* synthetic */ List m1608y0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(TransportContext.m1253a().mo19432b(cursor.getString(1)).mo19434d(PriorityMapping.m1671b(cursor.getInt(2))).mo19433c(m1575c1(cursor.getString(3))).mo19431a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ List m1610z0(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        List<PersistedEvent> Y0 = m1572Y0(sQLiteDatabase, transportContext, this.f1580f.mo19578d());
        for (Priority priority : Priority.values()) {
            if (priority != transportContext.mo19428d()) {
                int d = this.f1580f.mo19578d() - Y0.size();
                if (d <= 0) {
                    break;
                }
                Y0.addAll(m1572Y0(sQLiteDatabase, transportContext.mo19460f(priority), d));
            }
        }
        return m1577e0(Y0, m1573Z0(sQLiteDatabase, Y0));
    }

    /* renamed from: M0 */
    public long mo19599M0(TransportContext transportContext) {
        return ((Long) m1589j1(mo19613O().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.mo19426b(), String.valueOf(PriorityMapping.m1670a(transportContext.mo19428d()))}), C1703j.f1629a)).longValue();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: N */
    public long mo19612N() {
        return m1567S() * getPageSize();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: O */
    public SQLiteDatabase mo19613O() {
        SchemaManager schemaManager = this.f1577a;
        Objects.requireNonNull(schemaManager);
        return (SQLiteDatabase) m1580f1(new C1712s(schemaManager), C1709p.f1635a);
    }

    /* renamed from: P */
    public int mo19600P() {
        return ((Integer) mo19614Z(new C1717x(this, this.f1578c.mo19627a() - this.f1580f.mo19577c()))).intValue();
    }

    /* renamed from: Q0 */
    public boolean mo19601Q0(TransportContext transportContext) {
        return ((Boolean) mo19614Z(new C1689a0(this, transportContext))).booleanValue();
    }

    /* renamed from: R */
    public void mo19602R(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            mo19613O().compileStatement("DELETE FROM events WHERE _id in " + m1585h1(iterable)).execute();
        }
    }

    /* renamed from: S0 */
    public void mo19603S0(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            mo19614Z(new C1690b(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m1585h1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: Z */
    public <T> T mo19614Z(Function<SQLiteDatabase, T> function) {
        SQLiteDatabase O = mo19613O();
        O.beginTransaction();
        try {
            T apply = function.apply(O);
            O.setTransactionSuccessful();
            return apply;
        } finally {
            O.endTransaction();
        }
    }

    @Nullable
    /* renamed from: a2 */
    public PersistedEvent mo19604a2(TransportContext transportContext, EventInternal eventInternal) {
        Logging.m1382c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.mo19428d(), eventInternal.mo19401j(), transportContext.mo19426b());
        long longValue = ((Long) mo19614Z(new C1718y(this, eventInternal, transportContext))).longValue();
        if (longValue < 1) {
            return null;
        }
        return PersistedEvent.m1539a(longValue, transportContext, eventInternal);
    }

    /* renamed from: b */
    public void mo19596b() {
        mo19614Z(new C1716w(this));
    }

    /* renamed from: b0 */
    public void mo19605b0(TransportContext transportContext, long j) {
        mo19614Z(new C1713t(j, transportContext));
    }

    /* renamed from: c */
    public <T> T mo19615c(SynchronizationGuard.CriticalSection<T> criticalSection) {
        SQLiteDatabase O = mo19613O();
        m1562L(O);
        try {
            T execute = criticalSection.execute();
            O.setTransactionSuccessful();
            return execute;
        } finally {
            O.endTransaction();
        }
    }

    public void close() {
        this.f1577a.close();
    }

    /* renamed from: e */
    public ClientMetrics mo19597e() {
        return (ClientMetrics) mo19614Z(new C1692c(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), ClientMetrics.m1340e()));
    }

    /* renamed from: f */
    public void mo19598f(long j, LogEventDropped.Reason reason, String str) {
        mo19614Z(new C1698f(str, reason, j));
    }

    /* renamed from: g0 */
    public Iterable<TransportContext> mo19606g0() {
        return (Iterable) mo19614Z(C1708o.f1634a);
    }

    /* renamed from: p1 */
    public Iterable<PersistedEvent> mo19607p1(TransportContext transportContext) {
        return (Iterable) mo19614Z(new C1719z(this, transportContext));
    }
}
