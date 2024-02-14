package com.android.p023dx.command.dump;

import com.android.p023dx.p024cf.code.ConcreteMethod;
import com.android.p023dx.p024cf.code.Ropper;
import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.direct.StdAttributeFactory;
import com.android.p023dx.p024cf.iface.Member;
import com.android.p023dx.p024cf.iface.Method;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.code.BasicBlock;
import com.android.p023dx.rop.code.BasicBlockList;
import com.android.p023dx.rop.code.DexTranslationAdvice;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.ssa.Optimizer;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import java.io.PrintStream;

/* renamed from: com.android.dx.command.dump.DotDumper */
public class DotDumper implements ParseObserver {
    private final Args args;
    private final byte[] bytes;
    private DirectClassFile classFile;
    private final String filePath;
    private final boolean optimize;
    private final boolean strictParse;

    DotDumper(byte[] bArr, String str, Args args2) {
        this.bytes = bArr;
        this.filePath = str;
        this.strictParse = args2.strictParse;
        this.optimize = args2.optimize;
        this.args = args2;
    }

    static void dump(byte[] bArr, String str, Args args2) {
        new DotDumper(bArr, str, args2).run();
    }

    private void run() {
        ByteArray byteArray = new ByteArray(this.bytes);
        DirectClassFile directClassFile = new DirectClassFile(byteArray, this.filePath, this.strictParse);
        this.classFile = directClassFile;
        StdAttributeFactory stdAttributeFactory = StdAttributeFactory.THE_ONE;
        directClassFile.setAttributeFactory(stdAttributeFactory);
        this.classFile.getMagic();
        DirectClassFile directClassFile2 = new DirectClassFile(byteArray, this.filePath, this.strictParse);
        directClassFile2.setAttributeFactory(stdAttributeFactory);
        directClassFile2.setObserver(this);
        directClassFile2.getMagic();
    }

    public void changeIndent(int i) {
    }

    public void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member) {
        String str3 = str;
        Member member2 = member;
        if ((member2 instanceof Method) && shouldDumpMethod(str3)) {
            ConcreteMethod concreteMethod = new ConcreteMethod((Method) member2, this.classFile, true, true);
            DexTranslationAdvice dexTranslationAdvice = DexTranslationAdvice.THE_ONE;
            RopMethod convert = Ropper.convert(concreteMethod, dexTranslationAdvice, this.classFile.getMethods());
            if (this.optimize) {
                boolean isStatic = AccessFlags.isStatic(concreteMethod.getAccessFlags());
                convert = Optimizer.optimize(convert, BaseDumper.computeParamWidth(concreteMethod, isStatic), isStatic, true, dexTranslationAdvice);
            }
            PrintStream printStream = System.out;
            printStream.println("digraph " + str3 + "{");
            PrintStream printStream2 = System.out;
            printStream2.println("\tfirst -> n" + Hex.m907u2(convert.getFirstLabel()) + ";");
            BasicBlockList blocks = convert.getBlocks();
            int size = blocks.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                BasicBlock basicBlock = blocks.get(i3);
                int label = basicBlock.getLabel();
                IntList successors = basicBlock.getSuccessors();
                if (successors.size() == 0) {
                    PrintStream printStream3 = System.out;
                    printStream3.println("\tn" + Hex.m907u2(label) + " -> returns;");
                } else if (successors.size() == 1) {
                    PrintStream printStream4 = System.out;
                    printStream4.println("\tn" + Hex.m907u2(label) + " -> n" + Hex.m907u2(successors.get(i2)) + ";");
                } else {
                    PrintStream printStream5 = System.out;
                    printStream5.print("\tn" + Hex.m907u2(label) + " -> {");
                    for (int i4 = 0; i4 < successors.size(); i4++) {
                        int i5 = successors.get(i4);
                        if (i5 != basicBlock.getPrimarySuccessor()) {
                            PrintStream printStream6 = System.out;
                            printStream6.print(" n" + Hex.m907u2(i5) + " ");
                        }
                    }
                    System.out.println("};");
                    PrintStream printStream7 = System.out;
                    printStream7.println("\tn" + Hex.m907u2(label) + " -> n" + Hex.m907u2(basicBlock.getPrimarySuccessor()) + " [label=\"primary\"];");
                }
                i3++;
                i2 = 0;
            }
            System.out.println("}");
        }
    }

    public void parsed(ByteArray byteArray, int i, int i2, String str) {
    }

    /* access modifiers changed from: protected */
    public boolean shouldDumpMethod(String str) {
        String str2 = this.args.method;
        return str2 == null || str2.equals(str);
    }

    public void startParsingMember(ByteArray byteArray, int i, String str, String str2) {
    }
}
