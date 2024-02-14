package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ListResult {

    /* renamed from: a */
    private final List<StorageReference> f55339a;

    /* renamed from: b */
    private final List<StorageReference> f55340b;
    @Nullable

    /* renamed from: c */
    private final String f55341c;

    ListResult(List<StorageReference> list, List<StorageReference> list2, @Nullable String str) {
        this.f55339a = list;
        this.f55340b = list2;
        this.f55341c = str;
    }

    /* renamed from: a */
    static ListResult m77371a(FirebaseStorage firebaseStorage, JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(firebaseStorage.mo63598n(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(firebaseStorage.mo63598n(jSONArray2.getJSONObject(i2).getString("name")));
            }
        }
        return new ListResult(arrayList, arrayList2, jSONObject.optString("nextPageToken", (String) null));
    }

    @NonNull
    /* renamed from: b */
    public List<StorageReference> mo63604b() {
        return this.f55340b;
    }

    @Nullable
    /* renamed from: c */
    public String mo63605c() {
        return this.f55341c;
    }

    @NonNull
    /* renamed from: d */
    public List<StorageReference> mo63606d() {
        return this.f55339a;
    }
}
