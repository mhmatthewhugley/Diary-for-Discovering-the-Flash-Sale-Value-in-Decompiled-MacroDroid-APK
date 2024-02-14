package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.RegOps;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.TranslationAdvice;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.ssa.SsaInsn;
import java.util.ArrayList;

/* renamed from: com.android.dx.ssa.LiteralOpUpgrader */
public class LiteralOpUpgrader {
    private final SsaMethod ssaMeth;

    private LiteralOpUpgrader(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    /* access modifiers changed from: private */
    public static boolean isConstIntZeroOrKnownNull(RegisterSpec registerSpec) {
        TypeBearer typeBearer = registerSpec.getTypeBearer();
        if (!(typeBearer instanceof CstLiteralBits) || ((CstLiteralBits) typeBearer).getLongBits() != 0) {
            return false;
        }
        return true;
    }

    public static void process(SsaMethod ssaMethod) {
        new LiteralOpUpgrader(ssaMethod).run();
    }

    /* JADX WARNING: type inference failed for: r11v5, types: [com.android.dx.rop.code.PlainInsn] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void replacePlainInsn(com.android.p023dx.ssa.NormalSsaInsn r9, com.android.p023dx.rop.code.RegisterSpecList r10, int r11, com.android.p023dx.rop.cst.Constant r12) {
        /*
            r8 = this;
            com.android.dx.rop.code.Insn r0 = r9.getOriginalRopInsn()
            com.android.dx.rop.code.RegisterSpec r1 = r9.getResult()
            com.android.dx.rop.code.Rop r3 = com.android.p023dx.rop.code.Rops.ropFor(r11, r1, r10, r12)
            if (r12 != 0) goto L_0x001c
            com.android.dx.rop.code.PlainInsn r11 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.SourcePosition r12 = r0.getPosition()
            com.android.dx.rop.code.RegisterSpec r0 = r9.getResult()
            r11.<init>((com.android.p023dx.rop.code.Rop) r3, (com.android.p023dx.rop.code.SourcePosition) r12, (com.android.p023dx.rop.code.RegisterSpec) r0, (com.android.p023dx.rop.code.RegisterSpecList) r10)
            goto L_0x002c
        L_0x001c:
            com.android.dx.rop.code.PlainCstInsn r11 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.SourcePosition r4 = r0.getPosition()
            com.android.dx.rop.code.RegisterSpec r5 = r9.getResult()
            r2 = r11
            r6 = r10
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x002c:
            com.android.dx.ssa.NormalSsaInsn r10 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.ssa.SsaBasicBlock r12 = r9.getBlock()
            r10.<init>(r11, r12)
            com.android.dx.ssa.SsaBasicBlock r11 = r9.getBlock()
            java.util.ArrayList r11 = r11.getInsns()
            com.android.dx.ssa.SsaMethod r12 = r8.ssaMeth
            r12.onInsnRemoved(r9)
            int r9 = r11.lastIndexOf(r9)
            r11.set(r9, r10)
            com.android.dx.ssa.SsaMethod r9 = r8.ssaMeth
            r9.onInsnAdded(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.LiteralOpUpgrader.replacePlainInsn(com.android.dx.ssa.NormalSsaInsn, com.android.dx.rop.code.RegisterSpecList, int, com.android.dx.rop.cst.Constant):void");
    }

    private void run() {
        final TranslationAdvice advice = Optimizer.getAdvice();
        this.ssaMeth.forEachInsn(new SsaInsn.Visitor() {
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
            }

            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                Rop opcode = normalSsaInsn.getOriginalRopInsn().getOpcode();
                RegisterSpecList sources = normalSsaInsn.getSources();
                if (LiteralOpUpgrader.this.tryReplacingWithConstant(normalSsaInsn) || sources.size() != 2) {
                    return;
                }
                if (opcode.getBranchingness() == 4) {
                    if (LiteralOpUpgrader.isConstIntZeroOrKnownNull(sources.get(0))) {
                        LiteralOpUpgrader.this.replacePlainInsn(normalSsaInsn, sources.withoutFirst(), RegOps.flippedIfOpcode(opcode.getOpcode()), (Constant) null);
                    } else if (LiteralOpUpgrader.isConstIntZeroOrKnownNull(sources.get(1))) {
                        LiteralOpUpgrader.this.replacePlainInsn(normalSsaInsn, sources.withoutLast(), opcode.getOpcode(), (Constant) null);
                    }
                } else if (advice.hasConstantOperation(opcode, sources.get(0), sources.get(1))) {
                    normalSsaInsn.upgradeToLiteral();
                } else if (opcode.isCommutative() && advice.hasConstantOperation(opcode, sources.get(1), sources.get(0))) {
                    normalSsaInsn.setNewSources(RegisterSpecList.make(sources.get(1), sources.get(0)));
                    normalSsaInsn.upgradeToLiteral();
                }
            }

            public void visitPhiInsn(PhiInsn phiInsn) {
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean tryReplacingWithConstant(NormalSsaInsn normalSsaInsn) {
        Rop opcode = normalSsaInsn.getOriginalRopInsn().getOpcode();
        RegisterSpec result = normalSsaInsn.getResult();
        if (!(result == null || this.ssaMeth.isRegALocal(result) || opcode.getOpcode() == 5)) {
            TypeBearer typeBearer = normalSsaInsn.getResult().getTypeBearer();
            if (typeBearer.isConstant() && typeBearer.getBasicType() == 6) {
                RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
                replacePlainInsn(normalSsaInsn, registerSpecList, 5, (Constant) typeBearer);
                if (opcode.getOpcode() == 56) {
                    ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(normalSsaInsn.getBlock().getPredecessors().nextSetBit(0)).getInsns();
                    replacePlainInsn((NormalSsaInsn) insns.get(insns.size() - 1), registerSpecList, 6, (Constant) null);
                }
                return true;
            }
        }
        return false;
    }
}
