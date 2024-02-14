package com.google.firebase.remoteconfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RemoteConfigConstants {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExperimentDescriptionFieldKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestFieldKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResponseFieldKey {
    }

    private RemoteConfigConstants() {
    }
}
