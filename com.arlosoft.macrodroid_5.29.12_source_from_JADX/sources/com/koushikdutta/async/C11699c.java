package com.koushikdutta.async;

import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

/* renamed from: com.koushikdutta.async.c */
/* compiled from: ThreadQueue */
public class C11699c extends LinkedList<Runnable> {

    /* renamed from: a */
    private static final WeakHashMap<Thread, C11699c> f57508a = new WeakHashMap<>();
    Semaphore queueSemaphore = new Semaphore(0);
    C11693a waiter;

    /* renamed from: d */
    static C11699c m81833d(Thread thread) {
        C11699c cVar;
        WeakHashMap<Thread, C11699c> weakHashMap = f57508a;
        synchronized (weakHashMap) {
            cVar = weakHashMap.get(thread);
            if (cVar == null) {
                cVar = new C11699c();
                weakHashMap.put(thread, cVar);
            }
        }
        return cVar;
    }

    /* renamed from: f */
    static void m81834f(C11693a aVar) {
        WeakHashMap<Thread, C11699c> weakHashMap = f57508a;
        synchronized (weakHashMap) {
            for (C11699c next : weakHashMap.values()) {
                if (next.waiter == aVar) {
                    next.queueSemaphore.release();
                }
            }
        }
    }

    /* renamed from: c */
    public boolean add(Runnable runnable) {
        boolean add;
        synchronized (this) {
            add = super.add(runnable);
        }
        return add;
    }

    /* renamed from: h */
    public Runnable remove() {
        synchronized (this) {
            if (isEmpty()) {
                return null;
            }
            Runnable runnable = (Runnable) super.remove();
            return runnable;
        }
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this) {
            remove = super.remove(obj);
        }
        return remove;
    }
}
