package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;

public class BasicPoolEntry extends AbstractPoolEntry {
    @Deprecated
    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, ReferenceQueue<Object> referenceQueue) {
        super(clientConnectionOperator, httpRoute);
        if (httpRoute == null) {
            throw new IllegalArgumentException("HTTP route may not be null");
        }
    }

    /* access modifiers changed from: protected */
    public final OperatedClientConnection getConnection() {
        return this.connection;
    }

    /* access modifiers changed from: protected */
    public final HttpRoute getPlannedRoute() {
        return this.route;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final BasicPoolEntryRef getWeakRef() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void shutdownEntry() {
        super.shutdownEntry();
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute) {
        super(clientConnectionOperator, httpRoute);
        if (httpRoute == null) {
            throw new IllegalArgumentException("HTTP route may not be null");
        }
    }
}
