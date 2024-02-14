package com.android.p023dx.command.dump;

import com.android.p023dx.p024cf.code.ConcreteMethod;
import com.android.p023dx.p024cf.code.Ropper;
import com.android.p023dx.p024cf.iface.Member;
import com.android.p023dx.p024cf.iface.Method;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.code.DexTranslationAdvice;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.ssa.Optimizer;
import com.android.p023dx.ssa.SsaBasicBlock;
import com.android.p023dx.ssa.SsaInsn;
import com.android.p023dx.ssa.SsaMethod;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.command.dump.SsaDumper */
public class SsaDumper extends BlockDumper {
    private SsaDumper(byte[] bArr, PrintStream printStream, String str, Args args) {
        super(bArr, printStream, str, true, args);
    }

    public static void dump(byte[] bArr, PrintStream printStream, String str, Args args) {
        new SsaDumper(bArr, printStream, str, args).dump();
    }

    public void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member) {
        if ((member instanceof Method) && shouldDumpMethod(str) && (member.getAccessFlags() & 1280) == 0) {
            ConcreteMethod concreteMethod = new ConcreteMethod((Method) member, this.classFile, true, true);
            DexTranslationAdvice dexTranslationAdvice = DexTranslationAdvice.THE_ONE;
            RopMethod convert = Ropper.convert(concreteMethod, dexTranslationAdvice, this.classFile.getMethods());
            SsaMethod ssaMethod = null;
            boolean isStatic = AccessFlags.isStatic(concreteMethod.getAccessFlags());
            int computeParamWidth = BaseDumper.computeParamWidth(concreteMethod, isStatic);
            String str3 = this.args.ssaStep;
            if (str3 == null) {
                ssaMethod = Optimizer.debugNoRegisterAllocation(convert, computeParamWidth, isStatic, true, dexTranslationAdvice, EnumSet.allOf(Optimizer.OptionalStep.class));
            } else if ("edge-split".equals(str3)) {
                ssaMethod = Optimizer.debugEdgeSplit(convert, computeParamWidth, isStatic, true, dexTranslationAdvice);
            } else if ("phi-placement".equals(this.args.ssaStep)) {
                ssaMethod = Optimizer.debugPhiPlacement(convert, computeParamWidth, isStatic, true, dexTranslationAdvice);
            } else if ("renaming".equals(this.args.ssaStep)) {
                ssaMethod = Optimizer.debugRenaming(convert, computeParamWidth, isStatic, true, dexTranslationAdvice);
            } else if ("dead-code".equals(this.args.ssaStep)) {
                ssaMethod = Optimizer.debugDeadCodeRemover(convert, computeParamWidth, isStatic, true, dexTranslationAdvice);
            }
            StringBuffer stringBuffer = new StringBuffer(2000);
            stringBuffer.append("first ");
            stringBuffer.append(Hex.m907u2(ssaMethod.blockIndexToRopLabel(ssaMethod.getEntryBlockIndex())));
            stringBuffer.append(10);
            ArrayList arrayList = (ArrayList) ssaMethod.getBlocks().clone();
            Collections.sort(arrayList, SsaBasicBlock.LABEL_COMPARATOR);
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    SsaBasicBlock ssaBasicBlock = (SsaBasicBlock) it.next();
                    stringBuffer.append("block ");
                    stringBuffer.append(Hex.m907u2(ssaBasicBlock.getRopLabel()));
                    stringBuffer.append(10);
                    BitSet predecessors = ssaBasicBlock.getPredecessors();
                    for (int nextSetBit = predecessors.nextSetBit(0); nextSetBit >= 0; nextSetBit = predecessors.nextSetBit(nextSetBit + 1)) {
                        stringBuffer.append("  pred ");
                        stringBuffer.append(Hex.m907u2(ssaMethod.blockIndexToRopLabel(nextSetBit)));
                        stringBuffer.append(10);
                    }
                    stringBuffer.append("  live in:" + ssaBasicBlock.getLiveInRegs());
                    stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                    Iterator<SsaInsn> it2 = ssaBasicBlock.getInsns().iterator();
                    while (it2.hasNext()) {
                        stringBuffer.append("  ");
                        stringBuffer.append(it2.next().toHuman());
                        stringBuffer.append(10);
                    }
                    if (ssaBasicBlock.getSuccessors().cardinality() == 0) {
                        stringBuffer.append("  returns\n");
                    } else {
                        int primarySuccessorRopLabel = ssaBasicBlock.getPrimarySuccessorRopLabel();
                        IntList ropLabelSuccessorList = ssaBasicBlock.getRopLabelSuccessorList();
                        int size = ropLabelSuccessorList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            stringBuffer.append("  next ");
                            stringBuffer.append(Hex.m907u2(ropLabelSuccessorList.get(i2)));
                            if (size != 1 && primarySuccessorRopLabel == ropLabelSuccessorList.get(i2)) {
                                stringBuffer.append(" *");
                            }
                            stringBuffer.append(10);
                        }
                    }
                    stringBuffer.append("  live out:" + ssaBasicBlock.getLiveOutRegs());
                    stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                } else {
                    this.suppressDump = false;
                    setAt(byteArray, 0);
                    parsed(byteArray, 0, byteArray.size(), stringBuffer.toString());
                    this.suppressDump = true;
                    return;
                }
            }
        }
    }
}
