package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class HeartBeatResult {
    /* renamed from: a */
    public static HeartBeatResult m76569a(String str, List<String> list) {
        return new AutoValue_HeartBeatResult(str, list);
    }

    /* renamed from: b */
    public abstract List<String> mo63191b();

    /* renamed from: c */
    public abstract String mo63192c();
}
