package com.google.common.util.concurrent;

import androidx.core.app.NotificationCompat;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class ListenerCallQueue<L> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f53605b = Logger.getLogger(ListenerCallQueue.class.getName());

    /* renamed from: a */
    private final List<PerListenerQueue<L>> f53606a = Collections.synchronizedList(new ArrayList());

    interface Event<L> {
        /* renamed from: a */
        void mo61626a(L l);
    }

    private static final class PerListenerQueue<L> implements Runnable {

        /* renamed from: a */
        final L f53607a;

        /* renamed from: c */
        final Executor f53608c;
        @GuardedBy

        /* renamed from: d */
        final Queue<Event<L>> f53609d;
        @GuardedBy

        /* renamed from: f */
        final Queue<Object> f53610f;
        @GuardedBy

        /* renamed from: g */
        boolean f53611g;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo61844a(Event<L> event, Object obj) {
            this.f53609d.add(event);
            this.f53610f.add(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo61845b() {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.f53611g) {
                    this.f53611g = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                try {
                    this.f53608c.execute(this);
                } catch (RuntimeException e) {
                    synchronized (this) {
                        this.f53611g = false;
                        Logger a = ListenerCallQueue.f53605b;
                        Level level = Level.SEVERE;
                        String valueOf = String.valueOf(this.f53607a);
                        String valueOf2 = String.valueOf(this.f53608c);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 42 + valueOf2.length());
                        sb.append("Exception while running callbacks for ");
                        sb.append(valueOf);
                        sb.append(" on ");
                        sb.append(valueOf2);
                        a.log(level, sb.toString(), e);
                        throw e;
                    }
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        public void run() {
            /*
                r10 = this;
            L_0x0000:
                r0 = 0
                r1 = 1
                monitor-enter(r10)     // Catch:{ all -> 0x006b }
                boolean r2 = r10.f53611g     // Catch:{ all -> 0x005f }
                com.google.common.base.Preconditions.m5398y(r2)     // Catch:{ all -> 0x005f }
                java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue$Event<L>> r2 = r10.f53609d     // Catch:{ all -> 0x005f }
                java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x005f }
                com.google.common.util.concurrent.ListenerCallQueue$Event r2 = (com.google.common.util.concurrent.ListenerCallQueue.Event) r2     // Catch:{ all -> 0x005f }
                java.util.Queue<java.lang.Object> r3 = r10.f53610f     // Catch:{ all -> 0x005f }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x005f }
                if (r2 != 0) goto L_0x001f
                r10.f53611g = r0     // Catch:{ all -> 0x005f }
                monitor-exit(r10)     // Catch:{ all -> 0x001c }
                return
            L_0x001c:
                r1 = move-exception
                r2 = 0
                goto L_0x0062
            L_0x001f:
                monitor-exit(r10)     // Catch:{ all -> 0x005f }
                L r4 = r10.f53607a     // Catch:{ RuntimeException -> 0x0026 }
                r2.mo61626a(r4)     // Catch:{ RuntimeException -> 0x0026 }
                goto L_0x0000
            L_0x0026:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.ListenerCallQueue.f53605b     // Catch:{ all -> 0x006b }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x006b }
                L r6 = r10.f53607a     // Catch:{ all -> 0x006b }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x006b }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x006b }
                int r7 = r6.length()     // Catch:{ all -> 0x006b }
                int r7 = r7 + 37
                int r8 = r3.length()     // Catch:{ all -> 0x006b }
                int r7 = r7 + r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
                r8.<init>(r7)     // Catch:{ all -> 0x006b }
                java.lang.String r7 = "Exception while executing callback: "
                r8.append(r7)     // Catch:{ all -> 0x006b }
                r8.append(r6)     // Catch:{ all -> 0x006b }
                java.lang.String r6 = " "
                r8.append(r6)     // Catch:{ all -> 0x006b }
                r8.append(r3)     // Catch:{ all -> 0x006b }
                java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x006b }
                r4.log(r5, r3, r2)     // Catch:{ all -> 0x006b }
                goto L_0x0000
            L_0x005f:
                r2 = move-exception
                r1 = r2
                r2 = 1
            L_0x0062:
                monitor-exit(r10)     // Catch:{ all -> 0x0069 }
                throw r1     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r1 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
                goto L_0x006c
            L_0x0069:
                r1 = move-exception
                goto L_0x0062
            L_0x006b:
                r2 = move-exception
            L_0x006c:
                if (r1 == 0) goto L_0x0076
                monitor-enter(r10)
                r10.f53611g = r0     // Catch:{ all -> 0x0073 }
                monitor-exit(r10)     // Catch:{ all -> 0x0073 }
                goto L_0x0076
            L_0x0073:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0073 }
                throw r0
            L_0x0076:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue.run():void");
        }
    }

    ListenerCallQueue() {
    }

    /* renamed from: d */
    private void m74245d(Event<L> event, Object obj) {
        Preconditions.m5393t(event, NotificationCompat.CATEGORY_EVENT);
        Preconditions.m5393t(obj, "label");
        synchronized (this.f53606a) {
            for (PerListenerQueue<L> a : this.f53606a) {
                a.mo61844a(event, obj);
            }
        }
    }

    /* renamed from: b */
    public void mo61842b() {
        for (int i = 0; i < this.f53606a.size(); i++) {
            this.f53606a.get(i).mo61845b();
        }
    }

    /* renamed from: c */
    public void mo61843c(Event<L> event) {
        m74245d(event, event);
    }
}
