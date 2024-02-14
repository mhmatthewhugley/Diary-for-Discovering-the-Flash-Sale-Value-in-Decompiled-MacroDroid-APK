package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class Task<ResultT> {
    @NonNull
    /* renamed from: a */
    public abstract Task<ResultT> mo60015a(@NonNull OnCompleteListener<ResultT> onCompleteListener);

    @NonNull
    /* renamed from: b */
    public abstract Task<ResultT> mo60016b(@NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: c */
    public abstract Task<ResultT> mo60017c(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: d */
    public abstract Task<ResultT> mo60018d(OnSuccessListener<? super ResultT> onSuccessListener);

    @NonNull
    /* renamed from: e */
    public abstract Task<ResultT> mo60019e(@NonNull Executor executor, @NonNull OnSuccessListener<? super ResultT> onSuccessListener);

    @Nullable
    /* renamed from: f */
    public abstract Exception mo60020f();

    @NonNull
    /* renamed from: g */
    public abstract ResultT mo60021g();

    /* renamed from: h */
    public abstract boolean mo60022h();

    /* renamed from: i */
    public abstract boolean mo60023i();
}
