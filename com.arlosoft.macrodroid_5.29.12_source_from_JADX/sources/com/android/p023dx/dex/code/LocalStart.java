package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.ssa.RegisterMapper;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.LocalStart */
public final class LocalStart extends ZeroSizeInsn {
    private final RegisterSpec local;

    public LocalStart(SourcePosition sourcePosition, RegisterSpec registerSpec) {
        super(sourcePosition);
        Objects.requireNonNull(registerSpec, "local == null");
        this.local = registerSpec;
    }

    public static String localString(RegisterSpec registerSpec) {
        return registerSpec.regString() + ' ' + registerSpec.getLocalItem().toString() + ": " + registerSpec.getTypeBearer().toHuman();
    }

    /* access modifiers changed from: protected */
    public String argString() {
        return this.local.toString();
    }

    public RegisterSpec getLocal() {
        return this.local;
    }

    /* access modifiers changed from: protected */
    public String listingString0(boolean z) {
        return "local-start " + localString(this.local);
    }

    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return new LocalStart(getPosition(), registerMapper.map(this.local));
    }

    public DalvInsn withRegisterOffset(int i) {
        return new LocalStart(getPosition(), this.local.withOffset(i));
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new LocalStart(getPosition(), this.local);
    }
}
