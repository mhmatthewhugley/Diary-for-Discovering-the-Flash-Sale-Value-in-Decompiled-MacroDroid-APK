package com.google.android.gms.wearable;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public interface Channel extends Parcelable {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface GetInputStreamResult extends Releasable, Result {
        @Nullable
        InputStream getInputStream();
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface GetOutputStreamResult extends Releasable, Result {
        @Nullable
        OutputStream getOutputStream();
    }
}
