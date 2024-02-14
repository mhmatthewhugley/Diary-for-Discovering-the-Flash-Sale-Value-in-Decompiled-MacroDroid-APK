package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class FilterCriteria extends GenericJson {
    @Key
    private Boolean excludeChats;
    @Key
    private String from;
    @Key
    private Boolean hasAttachment;
    @Key
    private String negatedQuery;
    @Key
    private String query;
    @Key
    private Integer size;
    @Key
    private String sizeComparison;
    @Key
    private String subject;
    @Key

    /* renamed from: to */
    private String f52889to;

    /* renamed from: k */
    public FilterCriteria mo60137e() {
        return (FilterCriteria) super.clone();
    }

    /* renamed from: l */
    public FilterCriteria mo60138f(String str, Object obj) {
        return (FilterCriteria) super.mo60078d(str, obj);
    }
}
