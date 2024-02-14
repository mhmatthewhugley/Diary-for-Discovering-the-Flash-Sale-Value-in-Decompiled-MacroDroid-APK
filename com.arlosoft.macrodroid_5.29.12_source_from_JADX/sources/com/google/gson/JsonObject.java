package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

public final class JsonObject extends JsonElement {

    /* renamed from: a */
    private final LinkedTreeMap<String, JsonElement> f55813a = new LinkedTreeMap<>();

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.f55813a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).f55813a.equals(this.f55813a));
    }

    public int hashCode() {
        return this.f55813a.hashCode();
    }

    /* renamed from: p */
    public void mo64037p(String str, JsonElement jsonElement) {
        LinkedTreeMap<String, JsonElement> linkedTreeMap = this.f55813a;
        if (jsonElement == null) {
            jsonElement = JsonNull.f55812a;
        }
        linkedTreeMap.put(str, jsonElement);
    }

    /* renamed from: q */
    public JsonElement mo64038q(String str) {
        return this.f55813a.get(str);
    }

    /* renamed from: s */
    public boolean mo64039s(String str) {
        return this.f55813a.containsKey(str);
    }

    /* renamed from: t */
    public JsonElement mo64040t(String str) {
        return this.f55813a.remove(str);
    }
}
