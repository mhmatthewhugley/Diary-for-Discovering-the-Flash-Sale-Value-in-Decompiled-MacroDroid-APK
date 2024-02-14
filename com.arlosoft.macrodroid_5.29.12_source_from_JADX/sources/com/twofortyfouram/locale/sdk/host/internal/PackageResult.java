package com.twofortyfouram.locale.sdk.host.internal;

import androidx.annotation.NonNull;

public enum PackageResult {
    NOTHING_CHANGED,
    CONDITIONS_CHANGED,
    SETTINGS_CHANGED,
    CONDITIONS_AND_SETTINGS_CHANGED,
    EVENTS_CHANGED,
    EVENTS_AND_CONDITIONS_CHANGED,
    EVENT_AND_SETTINGS_CHANGED,
    EVENT_AND_SETTINGS_AND_CONDITIONS_CHANGED;

    @NonNull
    public static PackageResult get(boolean z, boolean z2, boolean z3) {
        if (z && z2 && z3) {
            return EVENT_AND_SETTINGS_AND_CONDITIONS_CHANGED;
        }
        if (z && z2) {
            return CONDITIONS_AND_SETTINGS_CHANGED;
        }
        if (z && z3) {
            return EVENTS_AND_CONDITIONS_CHANGED;
        }
        if (z3 && z2) {
            return EVENT_AND_SETTINGS_CHANGED;
        }
        if (z3) {
            return EVENTS_CHANGED;
        }
        if (z2) {
            return SETTINGS_CHANGED;
        }
        if (z) {
            return CONDITIONS_CHANGED;
        }
        return NOTHING_CHANGED;
    }
}
