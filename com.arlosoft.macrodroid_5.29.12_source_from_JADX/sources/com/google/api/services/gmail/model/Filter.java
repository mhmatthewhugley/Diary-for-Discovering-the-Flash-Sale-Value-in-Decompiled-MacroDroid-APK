package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class Filter extends GenericJson {
    @Key
    private FilterAction action;
    @Key
    private FilterCriteria criteria;
    @Key

    /* renamed from: id */
    private String f52888id;

    /* renamed from: k */
    public Filter mo60137e() {
        return (Filter) super.clone();
    }

    /* renamed from: l */
    public Filter mo60138f(String str, Object obj) {
        return (Filter) super.mo60078d(str, obj);
    }
}
