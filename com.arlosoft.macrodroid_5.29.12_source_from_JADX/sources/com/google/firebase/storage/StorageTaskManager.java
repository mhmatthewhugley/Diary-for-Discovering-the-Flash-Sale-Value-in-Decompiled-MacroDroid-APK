package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class StorageTaskManager {

    /* renamed from: c */
    private static final StorageTaskManager f55391c = new StorageTaskManager();

    /* renamed from: a */
    private final Map<String, WeakReference<StorageTask<?>>> f55392a = new HashMap();

    /* renamed from: b */
    private final Object f55393b = new Object();

    StorageTaskManager() {
    }

    /* renamed from: b */
    static StorageTaskManager m77517b() {
        return f55391c;
    }

    /* renamed from: a */
    public void mo63672a(StorageTask<?> storageTask) {
        synchronized (this.f55393b) {
            this.f55392a.put(storageTask.mo63585Y().toString(), new WeakReference(storageTask));
        }
    }

    /* renamed from: c */
    public void mo63673c(StorageTask<?> storageTask) {
        synchronized (this.f55393b) {
            String storageReference = storageTask.mo63585Y().toString();
            WeakReference weakReference = this.f55392a.get(storageReference);
            StorageTask<?> storageTask2 = weakReference != null ? (StorageTask) weakReference.get() : null;
            if (storageTask2 == null || storageTask2 == storageTask) {
                this.f55392a.remove(storageReference);
            }
        }
    }
}
