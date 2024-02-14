package com.android.p023dx.p026io;

import com.android.dex.DexException;
import com.android.p023dx.p026io.instructions.DecodedInstruction;

/* renamed from: com.android.dx.io.CodeReader */
public final class CodeReader {
    private Visitor fallbackVisitor = null;
    private Visitor fieldVisitor = null;
    private Visitor methodVisitor = null;
    private Visitor stringVisitor = null;
    private Visitor typeVisitor = null;

    /* renamed from: com.android.dx.io.CodeReader$1 */
    static /* synthetic */ class C15451 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$io$IndexType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.android.dx.io.IndexType[] r0 = com.android.p023dx.p026io.IndexType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$android$dx$io$IndexType = r0
                com.android.dx.io.IndexType r1 = com.android.p023dx.p026io.IndexType.STRING_REF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$android$dx$io$IndexType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.android.dx.io.IndexType r1 = com.android.p023dx.p026io.IndexType.TYPE_REF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$android$dx$io$IndexType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.android.dx.io.IndexType r1 = com.android.p023dx.p026io.IndexType.FIELD_REF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$android$dx$io$IndexType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.android.dx.io.IndexType r1 = com.android.p023dx.p026io.IndexType.METHOD_REF     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p026io.CodeReader.C15451.<clinit>():void");
        }
    }

    /* renamed from: com.android.dx.io.CodeReader$Visitor */
    public interface Visitor {
        void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction);
    }

    private void callVisit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
        Visitor visitor;
        int i = C15451.$SwitchMap$com$android$dx$io$IndexType[OpcodeInfo.getIndexType(decodedInstruction.getOpcode()).ordinal()];
        if (i == 1) {
            visitor = this.stringVisitor;
        } else if (i == 2) {
            visitor = this.typeVisitor;
        } else if (i == 3) {
            visitor = this.fieldVisitor;
        } else if (i != 4) {
            visitor = null;
        } else {
            visitor = this.methodVisitor;
        }
        if (visitor == null) {
            visitor = this.fallbackVisitor;
        }
        if (visitor != null) {
            visitor.visit(decodedInstructionArr, decodedInstruction);
        }
    }

    public void setAllVisitors(Visitor visitor) {
        this.fallbackVisitor = visitor;
        this.stringVisitor = visitor;
        this.typeVisitor = visitor;
        this.fieldVisitor = visitor;
        this.methodVisitor = visitor;
    }

    public void setFallbackVisitor(Visitor visitor) {
        this.fallbackVisitor = visitor;
    }

    public void setFieldVisitor(Visitor visitor) {
        this.fieldVisitor = visitor;
    }

    public void setMethodVisitor(Visitor visitor) {
        this.methodVisitor = visitor;
    }

    public void setStringVisitor(Visitor visitor) {
        this.stringVisitor = visitor;
    }

    public void setTypeVisitor(Visitor visitor) {
        this.typeVisitor = visitor;
    }

    public void visitAll(DecodedInstruction[] decodedInstructionArr) throws DexException {
        for (DecodedInstruction decodedInstruction : decodedInstructionArr) {
            if (decodedInstruction != null) {
                callVisit(decodedInstructionArr, decodedInstruction);
            }
        }
    }

    public void visitAll(short[] sArr) throws DexException {
        visitAll(DecodedInstruction.decodeAll(sArr));
    }
}
