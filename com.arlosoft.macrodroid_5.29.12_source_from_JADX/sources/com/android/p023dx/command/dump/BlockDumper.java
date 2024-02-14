package com.android.p023dx.command.dump;

import com.android.p023dx.p024cf.code.BasicBlocker;
import com.android.p023dx.p024cf.code.ByteBlock;
import com.android.p023dx.p024cf.code.ByteBlockList;
import com.android.p023dx.p024cf.code.ByteCatchList;
import com.android.p023dx.p024cf.code.BytecodeArray;
import com.android.p023dx.p024cf.code.ConcreteMethod;
import com.android.p023dx.p024cf.code.Ropper;
import com.android.p023dx.p024cf.direct.CodeObserver;
import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.direct.StdAttributeFactory;
import com.android.p023dx.p024cf.iface.Member;
import com.android.p023dx.p024cf.iface.Method;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.code.BasicBlock;
import com.android.p023dx.rop.code.BasicBlockList;
import com.android.p023dx.rop.code.DexTranslationAdvice;
import com.android.p023dx.rop.code.InsnList;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.ssa.Optimizer;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import java.io.PrintStream;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.command.dump.BlockDumper */
public class BlockDumper extends BaseDumper {
    protected DirectClassFile classFile = null;
    private boolean first = true;
    private boolean optimize;
    private boolean rop;
    protected boolean suppressDump = true;

    BlockDumper(byte[] bArr, PrintStream printStream, String str, boolean z, Args args) {
        super(bArr, printStream, str, args);
        this.rop = z;
        this.optimize = args.optimize;
    }

    public static void dump(byte[] bArr, PrintStream printStream, String str, boolean z, Args args) {
        new BlockDumper(bArr, printStream, str, z, args).dump();
    }

    private void regularDump(ConcreteMethod concreteMethod) {
        String str;
        BytecodeArray code = concreteMethod.getCode();
        ByteArray bytes = code.getBytes();
        ByteBlockList identifyBlocks = BasicBlocker.identifyBlocks(concreteMethod);
        int size = identifyBlocks.size();
        CodeObserver codeObserver = new CodeObserver(bytes, this);
        setAt(bytes, 0);
        this.suppressDump = false;
        int i = 0;
        int i2 = 0;
        while (i < size) {
            ByteBlock byteBlock = identifyBlocks.get(i);
            int start = byteBlock.getStart();
            int end = byteBlock.getEnd();
            if (i2 < start) {
                parsed(bytes, i2, start - i2, "dead code " + Hex.m907u2(i2) + ".." + Hex.m907u2(start));
            }
            parsed(bytes, start, 0, "block " + Hex.m907u2(byteBlock.getLabel()) + ": " + Hex.m907u2(start) + ".." + Hex.m907u2(end));
            changeIndent(1);
            while (start < end) {
                int parseInstruction = code.parseInstruction(start, codeObserver);
                codeObserver.setPreviousOffset(start);
                start += parseInstruction;
            }
            IntList successors = byteBlock.getSuccessors();
            int size2 = successors.size();
            if (size2 == 0) {
                parsed(bytes, end, 0, "returns");
            } else {
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = successors.get(i3);
                    parsed(bytes, end, 0, "next " + Hex.m907u2(i4));
                }
            }
            ByteCatchList catches = byteBlock.getCatches();
            int size3 = catches.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ByteCatchList.Item item = catches.get(i5);
                CstType exceptionClass = item.getExceptionClass();
                StringBuilder sb = new StringBuilder();
                sb.append("catch ");
                if (exceptionClass == CstType.OBJECT) {
                    str = "<any>";
                } else {
                    str = exceptionClass.toHuman();
                }
                sb.append(str);
                sb.append(" -> ");
                sb.append(Hex.m907u2(item.getHandlerPc()));
                parsed(bytes, end, 0, sb.toString());
            }
            changeIndent(-1);
            i++;
            i2 = end;
        }
        int size4 = bytes.size();
        if (i2 < size4) {
            parsed(bytes, i2, size4 - i2, "dead code " + Hex.m907u2(i2) + ".." + Hex.m907u2(size4));
        }
        this.suppressDump = true;
    }

    private void ropDump(ConcreteMethod concreteMethod) {
        ConcreteMethod concreteMethod2 = concreteMethod;
        DexTranslationAdvice dexTranslationAdvice = DexTranslationAdvice.THE_ONE;
        ByteArray bytes = concreteMethod.getCode().getBytes();
        RopMethod convert = Ropper.convert(concreteMethod2, dexTranslationAdvice, this.classFile.getMethods());
        StringBuffer stringBuffer = new StringBuffer(2000);
        if (this.optimize) {
            boolean isStatic = AccessFlags.isStatic(concreteMethod.getAccessFlags());
            convert = Optimizer.optimize(convert, BaseDumper.computeParamWidth(concreteMethod2, isStatic), isStatic, true, dexTranslationAdvice);
        }
        BasicBlockList blocks = convert.getBlocks();
        int[] labelsInOrder = blocks.getLabelsInOrder();
        stringBuffer.append("first " + Hex.m907u2(convert.getFirstLabel()) + IOUtils.LINE_SEPARATOR_UNIX);
        for (int i : labelsInOrder) {
            BasicBlock basicBlock = blocks.get(blocks.indexOfLabel(i));
            stringBuffer.append("block ");
            stringBuffer.append(Hex.m907u2(i));
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
            IntList labelToPredecessors = convert.labelToPredecessors(i);
            int size = labelToPredecessors.size();
            for (int i2 = 0; i2 < size; i2++) {
                stringBuffer.append("  pred ");
                stringBuffer.append(Hex.m907u2(labelToPredecessors.get(i2)));
                stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            InsnList insns = basicBlock.getInsns();
            int size2 = insns.size();
            for (int i3 = 0; i3 < size2; i3++) {
                insns.get(i3);
                stringBuffer.append("  ");
                stringBuffer.append(insns.get(i3).toHuman());
                stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            IntList successors = basicBlock.getSuccessors();
            int size3 = successors.size();
            if (size3 == 0) {
                stringBuffer.append("  returns\n");
            } else {
                int primarySuccessor = basicBlock.getPrimarySuccessor();
                for (int i4 = 0; i4 < size3; i4++) {
                    int i5 = successors.get(i4);
                    stringBuffer.append("  next ");
                    stringBuffer.append(Hex.m907u2(i5));
                    if (size3 != 1 && i5 == primarySuccessor) {
                        stringBuffer.append(" *");
                    }
                    stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
            }
        }
        this.suppressDump = false;
        setAt(bytes, 0);
        parsed(bytes, 0, bytes.size(), stringBuffer.toString());
        this.suppressDump = true;
    }

    public void changeIndent(int i) {
        if (!this.suppressDump) {
            super.changeIndent(i);
        }
    }

    public void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member) {
        if ((member instanceof Method) && shouldDumpMethod(str) && (member.getAccessFlags() & 1280) == 0) {
            ConcreteMethod concreteMethod = new ConcreteMethod((Method) member, this.classFile, true, true);
            if (this.rop) {
                ropDump(concreteMethod);
            } else {
                regularDump(concreteMethod);
            }
        }
    }

    public void parsed(ByteArray byteArray, int i, int i2, String str) {
        if (!this.suppressDump) {
            super.parsed(byteArray, i, i2, str);
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldDumpMethod(String str) {
        String str2 = this.args.method;
        return str2 == null || str2.equals(str);
    }

    public void startParsingMember(ByteArray byteArray, int i, String str, String str2) {
        if (str2.indexOf(40) >= 0 && shouldDumpMethod(str)) {
            setAt(byteArray, i);
            this.suppressDump = false;
            if (this.first) {
                this.first = false;
            } else {
                parsed(byteArray, i, 0, IOUtils.LINE_SEPARATOR_UNIX);
            }
            parsed(byteArray, i, 0, "method " + str + " " + str2);
            this.suppressDump = true;
        }
    }

    public void dump() {
        ByteArray byteArray = new ByteArray(getBytes());
        DirectClassFile directClassFile = new DirectClassFile(byteArray, getFilePath(), getStrictParse());
        this.classFile = directClassFile;
        StdAttributeFactory stdAttributeFactory = StdAttributeFactory.THE_ONE;
        directClassFile.setAttributeFactory(stdAttributeFactory);
        this.classFile.getMagic();
        DirectClassFile directClassFile2 = new DirectClassFile(byteArray, getFilePath(), getStrictParse());
        directClassFile2.setAttributeFactory(stdAttributeFactory);
        directClassFile2.setObserver(this);
        directClassFile2.getMagic();
    }
}
