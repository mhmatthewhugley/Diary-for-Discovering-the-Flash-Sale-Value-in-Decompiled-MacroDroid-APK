package com.twofortyfouram.locale.sdk.host.model;

import androidx.annotation.NonNull;

interface IPluginError {
    @NonNull
    String getDeveloperExplanation();

    boolean isFatal();
}
