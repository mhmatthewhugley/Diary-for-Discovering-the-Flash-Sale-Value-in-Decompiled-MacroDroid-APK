package com.google.firebase.appindexing;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.icing.zzfw;
import com.google.firebase.appindexing.builders.IndexableBuilder;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public interface Indexable {

    /* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
    public static class Builder extends IndexableBuilder<Builder> {
        public Builder() {
            this("Thing");
        }

        public Builder(@NonNull String str) {
            super(str);
        }
    }

    /* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
    public interface Metadata {

        /* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
        public static final class Builder {

            /* renamed from: a */
            private boolean f53829a = zzfw.m59104t().mo50451q();

            /* renamed from: b */
            private int f53830b = zzfw.m59104t().mo50452r();

            /* renamed from: c */
            private String f53831c = zzfw.m59104t().mo50453s();

            /* renamed from: d */
            private final Bundle f53832d = new Bundle();
        }
    }
}
