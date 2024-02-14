package com.android.p023dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.dex.code.DalvCode;
import com.android.p023dx.dex.code.DalvInsnList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.CodeItem */
public final class CodeItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int HEADER_SIZE = 16;
    private CatchStructs catches = null;
    private final DalvCode code;
    private DebugInfoItem debugInfo = null;
    private final boolean isStatic;
    private final CstMethodRef ref;
    private final TypeList throwsList;

    public CodeItem(CstMethodRef cstMethodRef, DalvCode dalvCode, boolean z, TypeList typeList) {
        super(4, -1);
        Objects.requireNonNull(cstMethodRef, "ref == null");
        Objects.requireNonNull(dalvCode, "code == null");
        Objects.requireNonNull(typeList, "throwsList == null");
        this.ref = cstMethodRef;
        this.code = dalvCode;
        this.isStatic = z;
        this.throwsList = typeList;
    }

    private int getInsSize() {
        return this.ref.getParameterWordCount(this.isStatic);
    }

    private int getOutsSize() {
        return this.code.getInsns().getOutsSize();
    }

    private int getRegistersSize() {
        return this.code.getInsns().getRegistersSize();
    }

    private void writeCodes(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        try {
            this.code.getInsns().writeTo(annotatedOutput);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, "...while writing instructions for " + this.ref.toHuman());
        }
    }

    public void addContents(DexFile dexFile) {
        MixedItemSection byteData = dexFile.getByteData();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        if (this.code.hasPositions() || this.code.hasLocals()) {
            DebugInfoItem debugInfoItem = new DebugInfoItem(this.code, this.isStatic, this.ref);
            this.debugInfo = debugInfoItem;
            byteData.add(debugInfoItem);
        }
        if (this.code.hasAnyCatches()) {
            Iterator<Type> it = this.code.getCatchTypes().iterator();
            while (it.hasNext()) {
                typeIds.intern(it.next());
            }
            this.catches = new CatchStructs(this.code);
        }
        Iterator<Constant> it2 = this.code.getInsnConstants().iterator();
        while (it2.hasNext()) {
            dexFile.internIfAppropriate(it2.next());
        }
    }

    public void debugPrint(PrintWriter printWriter, String str, boolean z) {
        printWriter.println(this.ref.toHuman() + ":");
        DalvInsnList insns = this.code.getInsns();
        printWriter.println("regs: " + Hex.m907u2(getRegistersSize()) + "; ins: " + Hex.m907u2(getInsSize()) + "; outs: " + Hex.m907u2(getOutsSize()));
        insns.debugPrint((Writer) printWriter, str, z);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        if (this.catches != null) {
            printWriter.print(str);
            printWriter.println("catches");
            this.catches.debugPrint(printWriter, sb2);
        }
        if (this.debugInfo != null) {
            printWriter.print(str);
            printWriter.println("debug info");
            this.debugInfo.debugPrint(printWriter, sb2);
        }
    }

    public CstMethodRef getRef() {
        return this.ref;
    }

    public ItemType itemType() {
        return ItemType.TYPE_CODE_ITEM;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        int i2;
        final DexFile file = section.getFile();
        this.code.assignIndices(new DalvCode.AssignIndicesCallback() {
            public int getIndex(Constant constant) {
                IndexedItem findItemOrNull = file.findItemOrNull(constant);
                if (findItemOrNull == null) {
                    return -1;
                }
                return findItemOrNull.getIndex();
            }
        });
        CatchStructs catchStructs = this.catches;
        if (catchStructs != null) {
            catchStructs.encode(file);
            i2 = this.catches.writeSize();
        } else {
            i2 = 0;
        }
        int codeSize = this.code.getInsns().codeSize();
        if ((codeSize & 1) != 0) {
            codeSize++;
        }
        setWriteSize((codeSize * 2) + 16 + i2);
    }

    public String toHuman() {
        return this.ref.toHuman();
    }

    public String toString() {
        return "CodeItem{" + toHuman() + "}";
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        int registersSize = getRegistersSize();
        int outsSize = getOutsSize();
        int insSize = getInsSize();
        int codeSize = this.code.getInsns().codeSize();
        boolean z = (codeSize & 1) != 0;
        CatchStructs catchStructs = this.catches;
        int triesSize = catchStructs == null ? 0 : catchStructs.triesSize();
        DebugInfoItem debugInfoItem = this.debugInfo;
        int absoluteOffset = debugInfoItem == null ? 0 : debugInfoItem.getAbsoluteOffset();
        if (annotates) {
            annotatedOutput.annotate(0, offsetString() + ' ' + this.ref.toHuman());
            StringBuilder sb = new StringBuilder();
            sb.append("  registers_size: ");
            sb.append(Hex.m907u2(registersSize));
            annotatedOutput.annotate(2, sb.toString());
            annotatedOutput.annotate(2, "  ins_size:       " + Hex.m907u2(insSize));
            annotatedOutput.annotate(2, "  outs_size:      " + Hex.m907u2(outsSize));
            annotatedOutput.annotate(2, "  tries_size:     " + Hex.m907u2(triesSize));
            annotatedOutput.annotate(4, "  debug_off:      " + Hex.m909u4(absoluteOffset));
            annotatedOutput.annotate(4, "  insns_size:     " + Hex.m909u4(codeSize));
            if (this.throwsList.size() != 0) {
                annotatedOutput.annotate(0, "  throws " + StdTypeList.toHuman(this.throwsList));
            }
        }
        annotatedOutput.writeShort(registersSize);
        annotatedOutput.writeShort(insSize);
        annotatedOutput.writeShort(outsSize);
        annotatedOutput.writeShort(triesSize);
        annotatedOutput.writeInt(absoluteOffset);
        annotatedOutput.writeInt(codeSize);
        writeCodes(dexFile, annotatedOutput);
        if (this.catches != null) {
            if (z) {
                if (annotates) {
                    annotatedOutput.annotate(2, "  padding: 0");
                }
                annotatedOutput.writeShort(0);
            }
            this.catches.writeTo(dexFile, annotatedOutput);
        }
        if (annotates && this.debugInfo != null) {
            annotatedOutput.annotate(0, "  debug info");
            this.debugInfo.annotateTo(dexFile, annotatedOutput, "    ");
        }
    }
}
