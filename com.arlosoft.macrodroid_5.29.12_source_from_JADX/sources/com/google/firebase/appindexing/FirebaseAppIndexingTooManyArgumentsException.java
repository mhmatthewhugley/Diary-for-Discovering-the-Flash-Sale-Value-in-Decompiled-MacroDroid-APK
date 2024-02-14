package com.google.firebase.appindexing;

import androidx.annotation.NonNull;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public class FirebaseAppIndexingTooManyArgumentsException extends FirebaseAppIndexingException {
    public FirebaseAppIndexingTooManyArgumentsException() {
        super("Too many Indexables provided. Try splitting them in batches.");
    }

    public FirebaseAppIndexingTooManyArgumentsException(@NonNull String str) {
        super(str);
    }
}
