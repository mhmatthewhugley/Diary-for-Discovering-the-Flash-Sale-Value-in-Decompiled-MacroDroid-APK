package com.android.p023dx.dex.code;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstBaseMethodRef;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.FixedSizeList;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

/* renamed from: com.android.dx.dex.code.DalvInsnList */
public final class DalvInsnList extends FixedSizeList {
    private final int regCount;

    public DalvInsnList(int i, int i2) {
        super(i);
        this.regCount = i2;
    }

    public static DalvInsnList makeImmutable(ArrayList<DalvInsn> arrayList, int i) {
        int size = arrayList.size();
        DalvInsnList dalvInsnList = new DalvInsnList(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            dalvInsnList.set(i2, arrayList.get(i2));
        }
        dalvInsnList.setImmutable();
        return dalvInsnList;
    }

    public int codeSize() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        return get(size - 1).getNextAddress();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A[Catch:{ IOException -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void debugPrint(java.io.Writer r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            com.android.dx.util.IndentingWriter r0 = new com.android.dx.util.IndentingWriter
            r1 = 0
            r0.<init>(r5, r1, r6)
            int r5 = r4.size()
            r6 = 0
        L_0x000b:
            if (r6 >= r5) goto L_0x002c
            java.lang.Object r2 = r4.get0(r6)     // Catch:{ IOException -> 0x0030 }
            com.android.dx.dex.code.DalvInsn r2 = (com.android.p023dx.dex.code.DalvInsn) r2     // Catch:{ IOException -> 0x0030 }
            int r3 = r2.codeSize()     // Catch:{ IOException -> 0x0030 }
            if (r3 != 0) goto L_0x001e
            if (r7 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r2 = 0
            goto L_0x0024
        L_0x001e:
            java.lang.String r3 = ""
            java.lang.String r2 = r2.listingString(r3, r1, r7)     // Catch:{ IOException -> 0x0030 }
        L_0x0024:
            if (r2 == 0) goto L_0x0029
            r0.write(r2)     // Catch:{ IOException -> 0x0030 }
        L_0x0029:
            int r6 = r6 + 1
            goto L_0x000b
        L_0x002c:
            r0.flush()     // Catch:{ IOException -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.dex.code.DalvInsnList.debugPrint(java.io.Writer, java.lang.String, boolean):void");
    }

    public DalvInsn get(int i) {
        return (DalvInsn) get0(i);
    }

    public int getOutsSize() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            DalvInsn dalvInsn = (DalvInsn) get0(i2);
            if (dalvInsn instanceof CstInsn) {
                Constant constant = ((CstInsn) dalvInsn).getConstant();
                if (constant instanceof CstBaseMethodRef) {
                    int parameterWordCount = ((CstBaseMethodRef) constant).getParameterWordCount(dalvInsn.getOpcode().getFamily() == 113);
                    if (parameterWordCount > i) {
                        i = parameterWordCount;
                    }
                }
            }
        }
        return i;
    }

    public int getRegistersSize() {
        return this.regCount;
    }

    public void set(int i, DalvInsn dalvInsn) {
        set0(i, dalvInsn);
    }

    public void writeTo(AnnotatedOutput annotatedOutput) {
        String str;
        int cursor = annotatedOutput.getCursor();
        int size = size();
        int i = 0;
        if (annotatedOutput.annotates()) {
            boolean isVerbose = annotatedOutput.isVerbose();
            for (int i2 = 0; i2 < size; i2++) {
                DalvInsn dalvInsn = (DalvInsn) get0(i2);
                int codeSize = dalvInsn.codeSize() * 2;
                if (codeSize != 0 || isVerbose) {
                    str = dalvInsn.listingString("  ", annotatedOutput.getAnnotationWidth(), true);
                } else {
                    str = null;
                }
                if (str != null) {
                    annotatedOutput.annotate(codeSize, str);
                } else if (codeSize != 0) {
                    annotatedOutput.annotate(codeSize, "");
                }
            }
        }
        while (i < size) {
            DalvInsn dalvInsn2 = (DalvInsn) get0(i);
            try {
                dalvInsn2.writeTo(annotatedOutput);
                i++;
            } catch (RuntimeException e) {
                throw ExceptionWithContext.withContext(e, "...while writing " + dalvInsn2);
            }
        }
        int cursor2 = (annotatedOutput.getCursor() - cursor) / 2;
        if (cursor2 != codeSize()) {
            throw new RuntimeException("write length mismatch; expected " + codeSize() + " but actually wrote " + cursor2);
        }
    }

    public void debugPrint(OutputStream outputStream, String str, boolean z) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        debugPrint((Writer) outputStreamWriter, str, z);
        try {
            outputStreamWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
