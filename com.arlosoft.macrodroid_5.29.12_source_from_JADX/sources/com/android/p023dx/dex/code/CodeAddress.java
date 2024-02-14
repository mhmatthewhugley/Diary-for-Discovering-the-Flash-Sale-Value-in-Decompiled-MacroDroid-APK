package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;

/* renamed from: com.android.dx.dex.code.CodeAddress */
public final class CodeAddress extends ZeroSizeInsn {
    private final boolean bindsClosely;

    public CodeAddress(SourcePosition sourcePosition) {
        this(sourcePosition, false);
    }

    /* access modifiers changed from: protected */
    public String argString() {
        return null;
    }

    public boolean getBindsClosely() {
        return this.bindsClosely;
    }

    /* access modifiers changed from: protected */
    public String listingString0(boolean z) {
        return "code-address";
    }

    public final DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new CodeAddress(getPosition());
    }

    public CodeAddress(SourcePosition sourcePosition, boolean z) {
        super(sourcePosition);
        this.bindsClosely = z;
    }
}
