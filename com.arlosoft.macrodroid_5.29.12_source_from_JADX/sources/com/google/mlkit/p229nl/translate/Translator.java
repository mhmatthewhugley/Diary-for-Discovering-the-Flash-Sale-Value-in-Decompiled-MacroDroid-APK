package com.google.mlkit.p229nl.translate;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;
import java.io.Closeable;

/* renamed from: com.google.mlkit.nl.translate.Translator */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public interface Translator extends Closeable, LifecycleObserver {
    @NonNull
    /* renamed from: B1 */
    Task<Void> mo64633B1(@NonNull DownloadConditions downloadConditions);

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void close();

    @NonNull
    /* renamed from: y1 */
    Task<String> mo64635y1(@NonNull String str);
}
