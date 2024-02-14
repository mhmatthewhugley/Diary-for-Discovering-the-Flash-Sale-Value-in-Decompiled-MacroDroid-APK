package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListForwardingAddressesResponse extends GenericJson {
    @Key
    private List<ForwardingAddress> forwardingAddresses;

    static {
        Data.m72658i(ForwardingAddress.class);
    }

    /* renamed from: k */
    public ListForwardingAddressesResponse mo60137e() {
        return (ListForwardingAddressesResponse) super.clone();
    }

    /* renamed from: l */
    public ListForwardingAddressesResponse mo60138f(String str, Object obj) {
        return (ListForwardingAddressesResponse) super.mo60078d(str, obj);
    }
}
