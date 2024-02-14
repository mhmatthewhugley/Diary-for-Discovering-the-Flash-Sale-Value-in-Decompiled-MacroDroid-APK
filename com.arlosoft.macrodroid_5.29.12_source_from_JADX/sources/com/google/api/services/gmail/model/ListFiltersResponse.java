package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListFiltersResponse extends GenericJson {
    @Key
    private List<Filter> filter;

    static {
        Data.m72658i(Filter.class);
    }

    /* renamed from: k */
    public ListFiltersResponse mo60137e() {
        return (ListFiltersResponse) super.clone();
    }

    /* renamed from: l */
    public ListFiltersResponse mo60138f(String str, Object obj) {
        return (ListFiltersResponse) super.mo60078d(str, obj);
    }
}
