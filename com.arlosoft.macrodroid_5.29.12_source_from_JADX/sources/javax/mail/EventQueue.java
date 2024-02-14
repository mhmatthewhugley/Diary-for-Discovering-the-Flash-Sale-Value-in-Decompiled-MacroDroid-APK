package javax.mail;

import java.util.EventListener;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import javax.mail.event.MailEvent;

class EventQueue implements Runnable {
    private static WeakHashMap<ClassLoader, EventQueue> appq;
    private Executor executor;

    /* renamed from: q */
    private volatile BlockingQueue<QueueElement> f61335q;

    static class QueueElement {
        MailEvent event;
        Vector<? extends EventListener> vector;

        QueueElement(MailEvent mailEvent, Vector<? extends EventListener> vector2) {
            this.event = mailEvent;
            this.vector = vector2;
        }
    }

    static class TerminatorEvent extends MailEvent {
        private static final long serialVersionUID = -2481895000841664111L;

        TerminatorEvent() {
            super(new Object());
        }

        public void dispatch(Object obj) {
            Thread.currentThread().interrupt();
        }
    }

    EventQueue(Executor executor2) {
        this.executor = executor2;
    }

    static synchronized EventQueue getApplicationEventQueue(Executor executor2) {
        EventQueue eventQueue;
        synchronized (EventQueue.class) {
            ClassLoader contextClassLoader = Session.getContextClassLoader();
            if (appq == null) {
                appq = new WeakHashMap<>();
            }
            eventQueue = appq.get(contextClassLoader);
            if (eventQueue == null) {
                eventQueue = new EventQueue(executor2);
                appq.put(contextClassLoader, eventQueue);
            }
        }
        return eventQueue;
    }

    /* access modifiers changed from: package-private */
    public synchronized void enqueue(MailEvent mailEvent, Vector<? extends EventListener> vector) {
        if (this.f61335q == null) {
            this.f61335q = new LinkedBlockingQueue();
            Executor executor2 = this.executor;
            if (executor2 != null) {
                executor2.execute(this);
            } else {
                Thread thread = new Thread(this, "Jakarta-Mail-EventQueue");
                thread.setDaemon(true);
                thread.start();
            }
        }
        this.f61335q.add(new QueueElement(mailEvent, vector));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016 A[SYNTHETIC, Splitter:B:7:0x0016] */
    public void run() {
        /*
            r5 = this;
            java.util.concurrent.BlockingQueue<javax.mail.EventQueue$QueueElement> r0 = r5.f61335q
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r1 = r0.take()     // Catch:{ InterruptedException -> 0x0027 }
            javax.mail.EventQueue$QueueElement r1 = (javax.mail.EventQueue.QueueElement) r1     // Catch:{ InterruptedException -> 0x0027 }
            javax.mail.event.MailEvent r2 = r1.event     // Catch:{ InterruptedException -> 0x0027 }
            java.util.Vector<? extends java.util.EventListener> r1 = r1.vector     // Catch:{ InterruptedException -> 0x0027 }
            r3 = 0
        L_0x0010:
            int r4 = r1.size()     // Catch:{ InterruptedException -> 0x0027 }
            if (r3 >= r4) goto L_0x0005
            java.lang.Object r4 = r1.elementAt(r3)     // Catch:{ all -> 0x001e }
            r2.dispatch(r4)     // Catch:{ all -> 0x001e }
            goto L_0x0024
        L_0x001e:
            r4 = move-exception
            boolean r4 = r4 instanceof java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x0027 }
            if (r4 == 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.EventQueue.run():void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void terminateQueue() {
        if (this.f61335q != null) {
            Vector vector = new Vector();
            vector.setSize(1);
            this.f61335q.add(new QueueElement(new TerminatorEvent(), vector));
            this.f61335q = null;
        }
    }
}
