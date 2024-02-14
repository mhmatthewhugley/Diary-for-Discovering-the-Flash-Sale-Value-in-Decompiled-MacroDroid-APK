package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListSmimeInfoResponse extends GenericJson {
    @Key
    private List<SmimeInfo> smimeInfo;

    /* renamed from: k */
    public ListSmimeInfoResponse mo60137e() {
        return (ListSmimeInfoResponse) super.clone();
    }

    /* renamed from: l */
    public ListSmimeInfoResponse mo60138f(String str, Object obj) {
        return (ListSmimeInfoResponse) super.mo60078d(str, obj);
    }
}
