package com.google.firebase.inject;

import androidx.annotation.NonNull;
import com.google.firebase.annotations.DeferredApi;

public interface Deferred<T> {

    public interface DeferredHandler<T> {
        @DeferredApi
        /* renamed from: a */
        void mo22929a(Provider<T> provider);
    }

    /* renamed from: a */
    void mo22924a(@NonNull DeferredHandler<T> deferredHandler);
}
