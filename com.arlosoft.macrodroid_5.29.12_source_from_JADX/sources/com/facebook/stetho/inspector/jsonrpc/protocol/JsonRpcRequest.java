package com.facebook.stetho.inspector.jsonrpc.protocol;

import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONObject;

public class JsonRpcRequest {
    @JsonProperty

    /* renamed from: id */
    public Long f15744id;
    @JsonProperty(required = true)
    public String method;
    @JsonProperty
    public JSONObject params;

    public JsonRpcRequest() {
    }

    public JsonRpcRequest(Long l, String str, JSONObject jSONObject) {
        this.f15744id = l;
        this.method = str;
        this.params = jSONObject;
    }
}
