package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class EventBus implements Subscriber, Publisher {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> f4788a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    private Queue<Event<?>> f4789b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f4790c;

    EventBus(Executor executor) {
        this.f4790c = executor;
    }

    /* renamed from: e */
    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> m6436e(Event<?> event) {
        Map map;
        map = this.f4788a.get(event.mo23660b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: a */
    public <T> void mo22917a(Class<T> cls, EventHandler<? super T> eventHandler) {
        mo22918b(cls, this.f4790c, eventHandler);
    }

    /* renamed from: b */
    public synchronized <T> void mo22918b(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        Preconditions.m6457b(cls);
        Preconditions.m6457b(eventHandler);
        Preconditions.m6457b(executor);
        if (!this.f4788a.containsKey(cls)) {
            this.f4788a.put(cls, new ConcurrentHashMap());
        }
        this.f4788a.get(cls).put(eventHandler, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo22919d() {
        Queue<Event<?>> queue;
        synchronized (this) {
            queue = this.f4789b;
            if (queue != null) {
                this.f4789b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (Event g : queue) {
                mo22920g(g);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.google.firebase.components.C1827j(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m6436e(r5).iterator();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22920g(com.google.firebase.events.Event<?> r5) {
        /*
            r4 = this;
            com.google.firebase.components.Preconditions.m6457b(r5)
            monitor-enter(r4)
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r4.f4789b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.m6436e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.j r3 = new com.google.firebase.components.j
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.EventBus.mo22920g(com.google.firebase.events.Event):void");
    }
}
