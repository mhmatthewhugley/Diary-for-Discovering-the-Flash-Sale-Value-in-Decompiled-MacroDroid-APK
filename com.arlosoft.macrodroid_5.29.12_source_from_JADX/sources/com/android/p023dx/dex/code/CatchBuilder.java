package com.android.p023dx.dex.code;

import com.android.p023dx.rop.type.Type;
import java.util.HashSet;

/* renamed from: com.android.dx.dex.code.CatchBuilder */
public interface CatchBuilder {
    CatchTable build();

    HashSet<Type> getCatchTypes();

    boolean hasAnyCatches();
}
