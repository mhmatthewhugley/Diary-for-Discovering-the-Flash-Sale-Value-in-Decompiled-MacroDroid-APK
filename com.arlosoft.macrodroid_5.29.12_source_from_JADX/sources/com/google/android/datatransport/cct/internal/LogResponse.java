package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class LogResponse {
    /* renamed from: a */
    static LogResponse m1139a(long j) {
        return new AutoValue_LogResponse(j);
    }

    @NonNull
    /* renamed from: b */
    public static LogResponse m1140b(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m1139a(Long.parseLong(jsonReader.nextString()));
                } else {
                    LogResponse a = m1139a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo19372c();
}
