package com.google.firebase.appindexing;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public interface Action {

    /* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
    public static class Builder {

        /* renamed from: a */
        private final Bundle f53825a = new Bundle();

        /* renamed from: b */
        private final String f53826b;

        public Builder(@NonNull String str) {
            this.f53826b = str;
        }
    }

    /* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
    public interface Metadata {

        /* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
        public static class Builder {

            /* renamed from: a */
            private boolean f53827a = true;
        }
    }
}
