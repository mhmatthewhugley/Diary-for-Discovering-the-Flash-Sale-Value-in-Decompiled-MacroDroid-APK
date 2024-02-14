package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @Nullable Throwable th) {
        super(str, th);
    }

    @NonNull
    /* renamed from: a */
    public static IllegalStateException m66626a(@NonNull Task<?> task) {
        String str;
        if (!task.mo23718s()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception o = task.mo23714o();
        if (o != null) {
            str = "failure";
        } else if (task.mo23719t()) {
            str = "result ".concat(String.valueOf(task.mo23715p()));
        } else {
            str = task.mo23717r() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), o);
    }
}
