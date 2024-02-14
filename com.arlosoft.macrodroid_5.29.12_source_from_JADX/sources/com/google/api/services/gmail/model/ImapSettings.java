package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class ImapSettings extends GenericJson {
    @Key
    private Boolean autoExpunge;
    @Key
    private Boolean enabled;
    @Key
    private String expungeBehavior;
    @Key
    private Integer maxFolderSize;

    /* renamed from: k */
    public ImapSettings mo60137e() {
        return (ImapSettings) super.clone();
    }

    /* renamed from: l */
    public ImapSettings mo60138f(String str, Object obj) {
        return (ImapSettings) super.mo60078d(str, obj);
    }
}
