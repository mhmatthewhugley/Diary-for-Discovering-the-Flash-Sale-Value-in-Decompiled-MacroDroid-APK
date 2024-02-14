package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListLabelsResponse extends GenericJson {
    @Key
    private List<Label> labels;

    static {
        Data.m72658i(Label.class);
    }

    /* renamed from: k */
    public ListLabelsResponse mo60137e() {
        return (ListLabelsResponse) super.clone();
    }

    /* renamed from: l */
    public ListLabelsResponse mo60138f(String str, Object obj) {
        return (ListLabelsResponse) super.mo60078d(str, obj);
    }
}
