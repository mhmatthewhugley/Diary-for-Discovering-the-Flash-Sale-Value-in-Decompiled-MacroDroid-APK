package com.google.android.datatransport.runtime.retries;

import androidx.annotation.Nullable;

public interface RetryStrategy<TInput, TResult> {
    @Nullable
    /* renamed from: a */
    TInput mo19287a(TInput tinput, TResult tresult);
}
