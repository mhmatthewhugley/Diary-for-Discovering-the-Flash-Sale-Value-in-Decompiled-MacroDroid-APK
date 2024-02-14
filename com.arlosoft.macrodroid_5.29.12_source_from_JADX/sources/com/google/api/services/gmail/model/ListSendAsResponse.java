package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListSendAsResponse extends GenericJson {
    @Key
    private List<SendAs> sendAs;

    /* renamed from: k */
    public ListSendAsResponse mo60137e() {
        return (ListSendAsResponse) super.clone();
    }

    /* renamed from: l */
    public ListSendAsResponse mo60138f(String str, Object obj) {
        return (ListSendAsResponse) super.mo60078d(str, obj);
    }
}
