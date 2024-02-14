package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;

@Keep
public class CctBackendFactory implements BackendFactory {
    public TransportBackend create(CreationContext creationContext) {
        return new CctTransportBackend(creationContext.mo19481b(), creationContext.mo19484e(), creationContext.mo19483d());
    }
}
