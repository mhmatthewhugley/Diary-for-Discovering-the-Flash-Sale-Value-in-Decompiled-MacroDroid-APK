package com.google.firebase.appindexing.builders;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.builders.IndexableBuilder;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class IndexableBuilder<T extends IndexableBuilder<?>> {

    /* renamed from: a */
    private final Bundle f53833a = new Bundle();

    /* renamed from: b */
    private final String f53834b;

    protected IndexableBuilder(@NonNull String str) {
        Preconditions.m4488k(str);
        Preconditions.m4484g(str);
        this.f53834b = str;
    }
}
