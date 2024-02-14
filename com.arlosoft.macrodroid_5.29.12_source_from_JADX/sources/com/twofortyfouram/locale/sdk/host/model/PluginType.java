package com.twofortyfouram.locale.sdk.host.model;

import androidx.annotation.NonNull;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import p276h8.C12406a;

public enum PluginType {
    CONDITION("com.twofortyfouram.locale.intent.action.EDIT_CONDITION", "com.twofortyfouram.locale.intent.action.QUERY_CONDITION"),
    SETTING("com.twofortyfouram.locale.intent.action.EDIT_SETTING", "com.twofortyfouram.locale.intent.action.FIRE_SETTING"),
    EVENT(TaskerPlugin.ACTION_EDIT_EVENT, "com.twofortyfouram.locale.intent.action.QUERY_CONDITION");
    
    @NonNull
    private final String mActivityIntentAction;
    @NonNull
    private final String mReceiverIntentAction;

    private PluginType(@NonNull String str, @NonNull String str2) {
        C12406a.m83259c(str, "activityIntentAction");
        C12406a.m83259c(str2, "receiverIntentAction");
        this.mActivityIntentAction = str;
        this.mReceiverIntentAction = str2;
    }

    @NonNull
    public String getActivityIntentAction() {
        return this.mActivityIntentAction;
    }

    @NonNull
    public String getReceiverIntentAction() {
        return this.mReceiverIntentAction;
    }
}
