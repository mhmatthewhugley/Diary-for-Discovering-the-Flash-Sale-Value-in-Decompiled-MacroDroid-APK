package com.android.p023dx.ssa;

import com.android.p023dx.p024cf.code.Merger;
import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.type.TypeBearer;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.android.dx.ssa.PhiTypeResolver */
public class PhiTypeResolver {
    SsaMethod ssaMeth;
    private final BitSet worklist;

    private PhiTypeResolver(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        this.worklist = new BitSet(ssaMethod.getRegCount());
    }

    private static boolean equalsHandlesNulls(LocalItem localItem, LocalItem localItem2) {
        return localItem == localItem2 || (localItem != null && localItem.equals(localItem2));
    }

    public static void process(SsaMethod ssaMethod) {
        new PhiTypeResolver(ssaMethod).run();
    }

    private void run() {
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
            if (definitionForRegister != null && definitionForRegister.getResult().getBasicType() == 0) {
                this.worklist.set(i);
            }
        }
        while (true) {
            int nextSetBit = this.worklist.nextSetBit(0);
            if (nextSetBit >= 0) {
                this.worklist.clear(nextSetBit);
                if (resolveResultType((PhiInsn) this.ssaMeth.getDefinitionForRegister(nextSetBit))) {
                    List<SsaInsn> useListForRegister = this.ssaMeth.getUseListForRegister(nextSetBit);
                    int size = useListForRegister.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        SsaInsn ssaInsn = useListForRegister.get(i2);
                        RegisterSpec result = ssaInsn.getResult();
                        if (result != null && (ssaInsn instanceof PhiInsn)) {
                            this.worklist.set(result.getReg());
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean resolveResultType(PhiInsn phiInsn) {
        phiInsn.updateSourcesToDefinitions(this.ssaMeth);
        RegisterSpecList sources = phiInsn.getSources();
        int size = sources.size();
        LocalItem localItem = null;
        int i = -1;
        RegisterSpec registerSpec = null;
        for (int i2 = 0; i2 < size; i2++) {
            RegisterSpec registerSpec2 = sources.get(i2);
            if (registerSpec2.getBasicType() != 0) {
                i = i2;
                registerSpec = registerSpec2;
            }
        }
        if (registerSpec == null) {
            return false;
        }
        LocalItem localItem2 = registerSpec.getLocalItem();
        TypeBearer type = registerSpec.getType();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != i) {
                RegisterSpec registerSpec3 = sources.get(i3);
                if (registerSpec3.getBasicType() != 0) {
                    z = z && equalsHandlesNulls(localItem2, registerSpec3.getLocalItem());
                    type = Merger.mergeType(type, registerSpec3.getType());
                }
            }
        }
        if (type != null) {
            if (z) {
                localItem = localItem2;
            }
            RegisterSpec result = phiInsn.getResult();
            if (result.getTypeBearer() == type && equalsHandlesNulls(localItem, result.getLocalItem())) {
                return false;
            }
            phiInsn.changeResultType(type, localItem);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(sources.get(i4).toString());
            sb.append(' ');
        }
        throw new RuntimeException("Couldn't map types in phi insn:" + sb);
    }
}
