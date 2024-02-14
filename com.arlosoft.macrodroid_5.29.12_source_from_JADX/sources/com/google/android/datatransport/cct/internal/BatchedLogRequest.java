package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;

@AutoValue
@Encodable
public abstract class BatchedLogRequest {
    @NonNull
    /* renamed from: a */
    public static BatchedLogRequest m1094a(@NonNull List<LogRequest> list) {
        return new AutoValue_BatchedLogRequest(list);
    }

    @NonNull
    /* renamed from: b */
    public static DataEncoder m1095b() {
        return new JsonDataEncoderBuilder().mo23614j(AutoBatchedLogRequestEncoder.f1135a).mo23615k(true).mo23613i();
    }

    @NonNull
    @Encodable.Field
    /* renamed from: c */
    public abstract List<LogRequest> mo19324c();
}
