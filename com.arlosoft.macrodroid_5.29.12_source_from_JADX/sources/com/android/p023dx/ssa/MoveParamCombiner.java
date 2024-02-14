package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.CstInsn;
import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.ssa.SsaInsn;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.android.dx.ssa.MoveParamCombiner */
public class MoveParamCombiner {
    /* access modifiers changed from: private */
    public final SsaMethod ssaMeth;

    private MoveParamCombiner(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    /* access modifiers changed from: private */
    public int getParamIndex(NormalSsaInsn normalSsaInsn) {
        return ((CstInteger) ((CstInsn) normalSsaInsn.getOriginalRopInsn()).getConstant()).getValue();
    }

    public static void process(SsaMethod ssaMethod) {
        new MoveParamCombiner(ssaMethod).run();
    }

    private void run() {
        final RegisterSpec[] registerSpecArr = new RegisterSpec[this.ssaMeth.getParamWidth()];
        final HashSet hashSet = new HashSet();
        this.ssaMeth.forEachInsn(new SsaInsn.Visitor() {
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
            }

            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                if (normalSsaInsn.getOpcode().getOpcode() == 3) {
                    int access$000 = MoveParamCombiner.this.getParamIndex(normalSsaInsn);
                    RegisterSpec[] registerSpecArr = registerSpecArr;
                    if (registerSpecArr[access$000] == null) {
                        registerSpecArr[access$000] = normalSsaInsn.getResult();
                        return;
                    }
                    final RegisterSpec registerSpec = registerSpecArr[access$000];
                    final RegisterSpec result = normalSsaInsn.getResult();
                    LocalItem localItem = registerSpec.getLocalItem();
                    LocalItem localItem2 = result.getLocalItem();
                    if (localItem == null) {
                        localItem = localItem2;
                    } else if (localItem2 != null && !localItem.equals(localItem2)) {
                        return;
                    }
                    MoveParamCombiner.this.ssaMeth.getDefinitionForRegister(registerSpec.getReg()).setResultLocal(localItem);
                    C16061 r2 = new RegisterMapper() {
                        public int getNewRegisterCount() {
                            return MoveParamCombiner.this.ssaMeth.getRegCount();
                        }

                        public RegisterSpec map(RegisterSpec registerSpec) {
                            return registerSpec.getReg() == result.getReg() ? registerSpec : registerSpec;
                        }
                    };
                    List<SsaInsn> useListForRegister = MoveParamCombiner.this.ssaMeth.getUseListForRegister(result.getReg());
                    for (int size = useListForRegister.size() - 1; size >= 0; size--) {
                        useListForRegister.get(size).mapSourceRegisters(r2);
                    }
                    hashSet.add(normalSsaInsn);
                }
            }

            public void visitPhiInsn(PhiInsn phiInsn) {
            }
        });
        this.ssaMeth.deleteInsns(hashSet);
    }
}
