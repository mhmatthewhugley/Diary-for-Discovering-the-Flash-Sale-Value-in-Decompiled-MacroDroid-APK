package com.google.api.client.json.rpc2;

import com.google.api.client.util.Beta;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;

@Beta
public class JsonRpcRequest extends GenericData {
    @Key

    /* renamed from: id */
    private Object f52562id;
    @Key
    private final String jsonrpc = "2.0";
    @Key
    private String method;
    @Key
    private Object params;

    /* renamed from: e */
    public JsonRpcRequest clone() {
        return (JsonRpcRequest) super.clone();
    }

    /* renamed from: f */
    public JsonRpcRequest mo60078d(String str, Object obj) {
        return (JsonRpcRequest) super.mo60078d(str, obj);
    }
}
