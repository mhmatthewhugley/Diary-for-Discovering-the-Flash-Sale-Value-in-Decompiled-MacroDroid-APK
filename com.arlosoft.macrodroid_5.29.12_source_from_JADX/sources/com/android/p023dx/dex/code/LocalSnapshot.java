package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.RegisterSpecSet;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.ssa.RegisterMapper;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.LocalSnapshot */
public final class LocalSnapshot extends ZeroSizeInsn {
    private final RegisterSpecSet locals;

    public LocalSnapshot(SourcePosition sourcePosition, RegisterSpecSet registerSpecSet) {
        super(sourcePosition);
        Objects.requireNonNull(registerSpecSet, "locals == null");
        this.locals = registerSpecSet;
    }

    /* access modifiers changed from: protected */
    public String argString() {
        return this.locals.toString();
    }

    public RegisterSpecSet getLocals() {
        return this.locals;
    }

    /* access modifiers changed from: protected */
    public String listingString0(boolean z) {
        int size = this.locals.size();
        int maxSize = this.locals.getMaxSize();
        StringBuffer stringBuffer = new StringBuffer((size * 40) + 100);
        stringBuffer.append("local-snapshot");
        for (int i = 0; i < maxSize; i++) {
            RegisterSpec registerSpec = this.locals.get(i);
            if (registerSpec != null) {
                stringBuffer.append("\n  ");
                stringBuffer.append(LocalStart.localString(registerSpec));
            }
        }
        return stringBuffer.toString();
    }

    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return new LocalSnapshot(getPosition(), registerMapper.map(this.locals));
    }

    public DalvInsn withRegisterOffset(int i) {
        return new LocalSnapshot(getPosition(), this.locals.withOffset(i));
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new LocalSnapshot(getPosition(), this.locals);
    }
}
