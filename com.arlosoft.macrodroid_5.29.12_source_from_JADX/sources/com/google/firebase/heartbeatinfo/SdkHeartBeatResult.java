package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    /* renamed from: b */
    public int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        return mo63196d() < sdkHeartBeatResult.mo63196d() ? -1 : 1;
    }

    /* renamed from: d */
    public abstract long mo63196d();

    /* renamed from: e */
    public abstract String mo63197e();
}
