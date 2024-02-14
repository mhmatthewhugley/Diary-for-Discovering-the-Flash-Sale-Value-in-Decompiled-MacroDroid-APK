package com.android.p023dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.dex.code.DalvCode;
import com.android.p023dx.dex.code.DalvInsnList;
import com.android.p023dx.dex.code.LocalList;
import com.android.p023dx.dex.code.PositionList;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.util.AnnotatedOutput;
import java.io.PrintWriter;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.DebugInfoItem */
public class DebugInfoItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final boolean ENABLE_ENCODER_SELF_CHECK = false;
    private final DalvCode code;
    private byte[] encoded;
    private final boolean isStatic;
    private final CstMethodRef ref;

    public DebugInfoItem(DalvCode dalvCode, boolean z, CstMethodRef cstMethodRef) {
        super(1, -1);
        Objects.requireNonNull(dalvCode, "code == null");
        this.code = dalvCode;
        this.isStatic = z;
        this.ref = cstMethodRef;
    }

    private byte[] encode(DexFile dexFile, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        return encode0(dexFile, str, printWriter, annotatedOutput, z);
    }

    private byte[] encode0(DexFile dexFile, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        PositionList positions = this.code.getPositions();
        LocalList locals = this.code.getLocals();
        DalvInsnList insns = this.code.getInsns();
        DebugInfoEncoder debugInfoEncoder = new DebugInfoEncoder(positions, locals, dexFile, insns.codeSize(), insns.getRegistersSize(), this.isStatic, this.ref);
        if (printWriter == null && annotatedOutput == null) {
            return debugInfoEncoder.convert();
        }
        return debugInfoEncoder.convertAndAnnotate(str, printWriter, annotatedOutput, z);
    }

    public void addContents(DexFile dexFile) {
    }

    public void annotateTo(DexFile dexFile, AnnotatedOutput annotatedOutput, String str) {
        encode(dexFile, str, (PrintWriter) null, annotatedOutput, false);
    }

    public void debugPrint(PrintWriter printWriter, String str) {
        encode((DexFile) null, str, printWriter, (AnnotatedOutput) null, false);
    }

    public ItemType itemType() {
        return ItemType.TYPE_DEBUG_INFO_ITEM;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        try {
            byte[] encode = encode(section.getFile(), (String) null, (PrintWriter) null, (AnnotatedOutput) null, false);
            this.encoded = encode;
            setWriteSize(encode.length);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, "...while placing debug info for " + this.ref.toHuman());
        }
    }

    public String toHuman() {
        throw new RuntimeException("unsupported");
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(offsetString() + " debug info");
            encode(dexFile, (String) null, (PrintWriter) null, annotatedOutput, true);
        }
        annotatedOutput.write(this.encoded);
    }
}
