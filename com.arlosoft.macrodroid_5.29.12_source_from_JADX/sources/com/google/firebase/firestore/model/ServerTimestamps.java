package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import com.google.firestore.p228v1.MapValue;
import com.google.firestore.p228v1.Value;
import com.google.protobuf.Timestamp;

public final class ServerTimestamps {
    private ServerTimestamps() {
    }

    /* renamed from: a */
    public static Timestamp m75907a(Value value) {
        return value.mo63922m0().mo63834Z("__local_write_time__").mo63925p0();
    }

    /* renamed from: b */
    public static boolean m75908b(@Nullable Value value) {
        Value value2 = null;
        if (value != null) {
            value2 = value.mo63922m0().mo63833Y("__type__", (Value) null);
        }
        return value2 != null && "server_timestamp".equals(value2.mo63924o0());
    }

    /* renamed from: c */
    public static Value m75909c(com.google.firebase.Timestamp timestamp, @Nullable Value value) {
        MapValue.Builder P = MapValue.m77924d0().mo63837P("__type__", (Value) Value.m78180r0().mo63938a0("server_timestamp").build()).mo63837P("__local_write_time__", (Value) Value.m78180r0().mo63939b0(Timestamp.m81258Z().mo65440O(timestamp.mo61973e()).mo65439N(timestamp.mo61971d())).build());
        if (value != null) {
            P.mo63837P("__previous_value__", value);
        }
        return (Value) Value.m78180r0().mo63934V(P).build();
    }
}
