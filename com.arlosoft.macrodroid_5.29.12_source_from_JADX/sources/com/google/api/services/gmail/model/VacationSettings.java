package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

public final class VacationSettings extends GenericJson {
    @Key
    private Boolean enableAutoReply;
    @JsonString
    @Key
    private Long endTime;
    @Key
    private String responseBodyHtml;
    @Key
    private String responseBodyPlainText;
    @Key
    private String responseSubject;
    @Key
    private Boolean restrictToContacts;
    @Key
    private Boolean restrictToDomain;
    @JsonString
    @Key
    private Long startTime;

    /* renamed from: k */
    public VacationSettings mo60137e() {
        return (VacationSettings) super.clone();
    }

    /* renamed from: l */
    public VacationSettings mo60138f(String str, Object obj) {
        return (VacationSettings) super.mo60078d(str, obj);
    }
}
