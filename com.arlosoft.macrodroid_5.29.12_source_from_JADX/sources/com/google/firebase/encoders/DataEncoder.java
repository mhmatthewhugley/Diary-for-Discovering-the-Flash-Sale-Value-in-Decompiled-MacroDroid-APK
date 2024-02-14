package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

public interface DataEncoder {
    /* renamed from: a */
    void mo23596a(@NonNull Object obj, @NonNull Writer writer) throws IOException;

    @NonNull
    String encode(@NonNull Object obj);
}
