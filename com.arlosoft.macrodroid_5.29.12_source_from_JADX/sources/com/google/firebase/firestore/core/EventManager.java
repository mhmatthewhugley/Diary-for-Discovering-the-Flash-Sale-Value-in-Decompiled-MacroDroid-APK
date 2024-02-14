package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.SyncEngine;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p292io.grpc.C12537b1;

public final class EventManager implements SyncEngine.SyncEngineCallback {

    /* renamed from: a */
    private final SyncEngine f5846a;

    /* renamed from: b */
    private final Map<Query, QueryListenersInfo> f5847b;

    /* renamed from: c */
    private final Set<EventListener<Void>> f5848c = new HashSet();

    /* renamed from: d */
    private OnlineState f5849d = OnlineState.UNKNOWN;

    public static class ListenOptions {

        /* renamed from: a */
        public boolean f5850a;

        /* renamed from: b */
        public boolean f5851b;

        /* renamed from: c */
        public boolean f5852c;
    }

    private static class QueryListenersInfo {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<QueryListener> f5853a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ViewSnapshot f5854b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f5855c;

        QueryListenersInfo() {
        }
    }

    public EventManager(SyncEngine syncEngine) {
        this.f5846a = syncEngine;
        this.f5847b = new HashMap();
        syncEngine.mo23949w(this);
    }

    /* renamed from: f */
    private void m8052f() {
        for (EventListener<Void> a : this.f5848c) {
            a.mo23672a(null, (FirebaseFirestoreException) null);
        }
    }

    /* renamed from: a */
    public void mo23851a(OnlineState onlineState) {
        this.f5849d = onlineState;
        boolean z = false;
        for (QueryListenersInfo a : this.f5847b.values()) {
            for (QueryListener c : a.f5853a) {
                if (c.mo23939c(onlineState)) {
                    z = true;
                }
            }
        }
        if (z) {
            m8052f();
        }
    }

    /* renamed from: b */
    public void mo23852b(Query query, C12537b1 b1Var) {
        QueryListenersInfo queryListenersInfo = this.f5847b.get(query);
        if (queryListenersInfo != null) {
            for (QueryListener b : queryListenersInfo.f5853a) {
                b.mo23938b(Util.m76527j(b1Var));
            }
        }
        this.f5847b.remove(query);
    }

    /* renamed from: c */
    public void mo23853c(List<ViewSnapshot> list) {
        boolean z = false;
        for (ViewSnapshot next : list) {
            QueryListenersInfo queryListenersInfo = this.f5847b.get(next.mo23987h());
            if (queryListenersInfo != null) {
                for (QueryListener d : queryListenersInfo.f5853a) {
                    if (d.mo23940d(next)) {
                        z = true;
                    }
                }
                ViewSnapshot unused = queryListenersInfo.f5854b = next;
            }
        }
        if (z) {
            m8052f();
        }
    }

    /* renamed from: d */
    public int mo23854d(QueryListener queryListener) {
        Query a = queryListener.mo23937a();
        QueryListenersInfo queryListenersInfo = this.f5847b.get(a);
        boolean z = queryListenersInfo == null;
        if (z) {
            queryListenersInfo = new QueryListenersInfo();
            this.f5847b.put(a, queryListenersInfo);
        }
        queryListenersInfo.f5853a.add(queryListener);
        Assert.m76443d(true ^ queryListener.mo23939c(this.f5849d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (queryListenersInfo.f5854b != null && queryListener.mo23940d(queryListenersInfo.f5854b)) {
            m8052f();
        }
        if (z) {
            int unused = queryListenersInfo.f5855c = this.f5846a.mo23946n(a);
        }
        return queryListenersInfo.f5855c;
    }

    /* renamed from: e */
    public void mo23855e(EventListener<Void> eventListener) {
        this.f5848c.add(eventListener);
        eventListener.mo23672a(null, (FirebaseFirestoreException) null);
    }

    /* renamed from: g */
    public void mo23856g(QueryListener queryListener) {
        boolean z;
        Query a = queryListener.mo23937a();
        QueryListenersInfo queryListenersInfo = this.f5847b.get(a);
        if (queryListenersInfo != null) {
            queryListenersInfo.f5853a.remove(queryListener);
            z = queryListenersInfo.f5853a.isEmpty();
        } else {
            z = false;
        }
        if (z) {
            this.f5847b.remove(a);
            this.f5846a.mo23950x(a);
        }
    }

    /* renamed from: h */
    public void mo23857h(EventListener<Void> eventListener) {
        this.f5848c.remove(eventListener);
    }
}
