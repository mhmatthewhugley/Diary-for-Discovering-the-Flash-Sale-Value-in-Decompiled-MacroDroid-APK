package com.google.firebase.messaging.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public interface ExecutorFactory {
    /* renamed from: a */
    ExecutorService mo63489a(ThreadFactory threadFactory, ThreadPriority threadPriority);
}
