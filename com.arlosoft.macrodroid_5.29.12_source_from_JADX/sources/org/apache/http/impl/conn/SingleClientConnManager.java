package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

@ThreadSafe
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected final boolean alwaysShutDown;
    protected final ClientConnectionOperator connOperator;
    @GuardedBy("this")
    protected long connectionExpiresTime;
    protected volatile boolean isShutDown;
    @GuardedBy("this")
    protected long lastReleaseTime;
    private final Log log = LogFactory.getLog((Class) getClass());
    @GuardedBy("this")
    protected ConnAdapter managedConn;
    protected final SchemeRegistry schemeRegistry;
    @GuardedBy("this")
    protected PoolEntry uniquePoolEntry;

    protected class ConnAdapter extends AbstractPooledConnAdapter {
        protected ConnAdapter(PoolEntry poolEntry, HttpRoute httpRoute) {
            super(SingleClientConnManager.this, poolEntry);
            markReusable();
            poolEntry.route = httpRoute;
        }
    }

    protected class PoolEntry extends AbstractPoolEntry {
        protected PoolEntry() {
            super(SingleClientConnManager.this.connOperator, (HttpRoute) null);
        }

        /* access modifiers changed from: protected */
        public void close() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        /* access modifiers changed from: protected */
        public void shutdown() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    public SingleClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            this.connOperator = createConnectionOperator(schemeRegistry2);
            this.uniquePoolEntry = new PoolEntry();
            this.managedConn = null;
            this.lastReleaseTime = -1;
            this.alwaysShutDown = false;
            this.isShutDown = false;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }

    /* access modifiers changed from: protected */
    public final void assertStillUp() throws IllegalStateException {
        if (this.isShutDown) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    public synchronized void closeExpiredConnections() {
        if (System.currentTimeMillis() >= this.connectionExpiresTime) {
            closeIdleConnections(0, TimeUnit.MILLISECONDS);
        }
    }

    public synchronized void closeIdleConnections(long j, TimeUnit timeUnit) {
        assertStillUp();
        if (timeUnit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        } else if (this.managedConn == null && this.uniquePoolEntry.connection.isOpen()) {
            if (this.lastReleaseTime <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                try {
                    this.uniquePoolEntry.close();
                } catch (IOException e) {
                    this.log.debug("Problem closing idle connection.", e);
                }
            }
        }
        return;
    }

    /* access modifiers changed from: protected */
    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public synchronized ManagedClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        boolean z;
        ConnAdapter connAdapter;
        if (httpRoute != null) {
            try {
                assertStillUp();
                if (this.log.isDebugEnabled()) {
                    Log log2 = this.log;
                    log2.debug("Get connection for route " + httpRoute);
                }
                if (this.managedConn == null) {
                    closeExpiredConnections();
                    boolean z2 = true;
                    boolean z3 = false;
                    if (this.uniquePoolEntry.connection.isOpen()) {
                        RouteTracker routeTracker = this.uniquePoolEntry.tracker;
                        z3 = routeTracker == null || !routeTracker.toRoute().equals(httpRoute);
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z3) {
                        this.uniquePoolEntry.shutdown();
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        this.uniquePoolEntry = new PoolEntry();
                    }
                    connAdapter = new ConnAdapter(this.uniquePoolEntry, httpRoute);
                    this.managedConn = connAdapter;
                } else {
                    throw new IllegalStateException(MISUSE_MESSAGE);
                }
            } catch (IOException e) {
                this.log.debug("Problem shutting down connection.", e);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Route may not be null.");
        }
        return connAdapter;
    }

    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0097=Splitter:B:42:0x0097, B:30:0x0069=Splitter:B:30:0x0069} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void releaseConnection(org.apache.http.conn.ManagedClientConnection r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.assertStillUp()     // Catch:{ all -> 0x00d3 }
            boolean r0 = r9 instanceof org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cb
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0026
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Releasing connection "
            r1.append(r2)     // Catch:{ all -> 0x00d3 }
            r1.append(r9)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d3 }
            r0.debug(r1)     // Catch:{ all -> 0x00d3 }
        L_0x0026:
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r9 = (org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter) r9     // Catch:{ all -> 0x00d3 }
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r9.poolEntry     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r8)
            return
        L_0x002e:
            org.apache.http.conn.ClientConnectionManager r0 = r9.getManager()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x003f
            if (r0 != r8) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = "Connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d3 }
            throw r9     // Catch:{ all -> 0x00d3 }
        L_0x003f:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r4 = 0
            boolean r5 = r9.isOpen()     // Catch:{ IOException -> 0x0087 }
            if (r5 == 0) goto L_0x0069
            boolean r5 = r8.alwaysShutDown     // Catch:{ IOException -> 0x0087 }
            if (r5 != 0) goto L_0x0057
            boolean r5 = r9.isMarkedReusable()     // Catch:{ IOException -> 0x0087 }
            if (r5 != 0) goto L_0x0069
        L_0x0057:
            org.apache.commons.logging.Log r5 = r8.log     // Catch:{ IOException -> 0x0087 }
            boolean r5 = r5.isDebugEnabled()     // Catch:{ IOException -> 0x0087 }
            if (r5 == 0) goto L_0x0066
            org.apache.commons.logging.Log r5 = r8.log     // Catch:{ IOException -> 0x0087 }
            java.lang.String r6 = "Released connection open but not reusable."
            r5.debug(r6)     // Catch:{ IOException -> 0x0087 }
        L_0x0066:
            r9.shutdown()     // Catch:{ IOException -> 0x0087 }
        L_0x0069:
            r9.detach()     // Catch:{ all -> 0x00d3 }
            r8.managedConn = r4     // Catch:{ all -> 0x00d3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.lastReleaseTime = r4     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0082
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.lastReleaseTime     // Catch:{ all -> 0x00d3 }
        L_0x007e:
            long r9 = r9 + r11
            r8.connectionExpiresTime = r9     // Catch:{ all -> 0x00d3 }
            goto L_0x00ad
        L_0x0082:
            r8.connectionExpiresTime = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00ad
        L_0x0085:
            r5 = move-exception
            goto L_0x00af
        L_0x0087:
            r5 = move-exception
            org.apache.commons.logging.Log r6 = r8.log     // Catch:{ all -> 0x0085 }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0097
            org.apache.commons.logging.Log r6 = r8.log     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "Exception shutting down released connection."
            r6.debug(r7, r5)     // Catch:{ all -> 0x0085 }
        L_0x0097:
            r9.detach()     // Catch:{ all -> 0x00d3 }
            r8.managedConn = r4     // Catch:{ all -> 0x00d3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.lastReleaseTime = r4     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0082
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.lastReleaseTime     // Catch:{ all -> 0x00d3 }
            goto L_0x007e
        L_0x00ad:
            monitor-exit(r8)
            return
        L_0x00af:
            r9.detach()     // Catch:{ all -> 0x00d3 }
            r8.managedConn = r4     // Catch:{ all -> 0x00d3 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.lastReleaseTime = r6     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c8
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.lastReleaseTime     // Catch:{ all -> 0x00d3 }
            long r9 = r9 + r11
            r8.connectionExpiresTime = r9     // Catch:{ all -> 0x00d3 }
            goto L_0x00ca
        L_0x00c8:
            r8.connectionExpiresTime = r0     // Catch:{ all -> 0x00d3 }
        L_0x00ca:
            throw r5     // Catch:{ all -> 0x00d3 }
        L_0x00cb:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = "Connection class mismatch, connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d3 }
            throw r9     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SingleClientConnManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() {
            public void abortRequest() {
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return SingleClientConnManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public synchronized void revokeConnection() {
        ConnAdapter connAdapter = this.managedConn;
        if (connAdapter != null) {
            connAdapter.detach();
            try {
                this.uniquePoolEntry.shutdown();
            } catch (IOException e) {
                this.log.debug("Problem while shutting down connection.", e);
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void shutdown() {
        this.isShutDown = true;
        ConnAdapter connAdapter = this.managedConn;
        if (connAdapter != null) {
            connAdapter.detach();
        }
        try {
            PoolEntry poolEntry = this.uniquePoolEntry;
            if (poolEntry != null) {
                poolEntry.shutdown();
            }
        } catch (IOException e) {
            try {
                this.log.debug("Problem while shutting down manager.", e);
            } catch (Throwable th) {
                this.uniquePoolEntry = null;
                throw th;
            }
        }
        this.uniquePoolEntry = null;
    }
}
