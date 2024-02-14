package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: a */
    private final List<JsonElement> f55811a = new ArrayList();

    /* renamed from: c */
    public boolean mo64013c() {
        if (this.f55811a.size() == 1) {
            return this.f55811a.get(0).mo64013c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public int mo64014d() {
        if (this.f55811a.size() == 1) {
            return this.f55811a.get(0).mo64014d();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).f55811a.equals(this.f55811a));
    }

    public int hashCode() {
        return this.f55811a.hashCode();
    }

    public Iterator<JsonElement> iterator() {
        return this.f55811a.iterator();
    }

    /* renamed from: j */
    public long mo64018j() {
        if (this.f55811a.size() == 1) {
            return this.f55811a.get(0).mo64018j();
        }
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public String mo64019k() {
        if (this.f55811a.size() == 1) {
            return this.f55811a.get(0).mo64019k();
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public void mo64020p(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.f55812a;
        }
        this.f55811a.add(jsonElement);
    }

    /* renamed from: q */
    public JsonElement mo64021q(int i) {
        return this.f55811a.get(i);
    }

    public int size() {
        return this.f55811a.size();
    }
}
