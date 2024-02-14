package com.android.p023dx.dex.file;

import com.android.p023dx.dex.code.CatchHandlerList;
import com.android.p023dx.dex.code.CatchTable;
import com.android.p023dx.dex.code.DalvCode;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.ByteArrayAnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.dx.dex.file.CatchStructs */
public final class CatchStructs {
    private static final int TRY_ITEM_WRITE_SIZE = 8;
    private final DalvCode code;
    private int encodedHandlerHeaderSize = 0;
    private byte[] encodedHandlers = null;
    private TreeMap<CatchHandlerList, Integer> handlerOffsets = null;
    private CatchTable table = null;

    public CatchStructs(DalvCode dalvCode) {
        this.code = dalvCode;
    }

    private static void annotateAndConsumeHandlers(CatchHandlerList catchHandlerList, int i, int i2, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput) {
        String human = catchHandlerList.toHuman(str, Hex.m907u2(i) + ": ");
        if (printWriter != null) {
            printWriter.println(human);
        }
        annotatedOutput.annotate(i2, human);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: com.android.dx.dex.code.CatchHandlerList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void annotateEntries(java.lang.String r16, java.io.PrintWriter r17, com.android.p023dx.util.AnnotatedOutput r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r7 = r17
            r8 = r18
            r15.finishProcessingIfNecessary()
            r2 = 0
            if (r8 == 0) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            r4 = 6
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            if (r3 == 0) goto L_0x0019
            r5 = 2
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            com.android.dx.dex.code.CatchTable r6 = r0.table
            int r6 = r6.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r10 = "  "
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "tries:"
            if (r3 == 0) goto L_0x0049
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r8.annotate(r2, r10)
            goto L_0x005b
        L_0x0049:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r7.println(r10)
        L_0x005b:
            r10 = 0
        L_0x005c:
            if (r10 >= r6) goto L_0x00ad
            com.android.dx.dex.code.CatchTable r11 = r0.table
            com.android.dx.dex.code.CatchTable$Entry r11 = r11.get(r10)
            com.android.dx.dex.code.CatchHandlerList r12 = r11.getHandlers()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            java.lang.String r14 = "try "
            r13.append(r14)
            int r14 = r11.getStart()
            java.lang.String r14 = com.android.p023dx.util.Hex.u2or4(r14)
            r13.append(r14)
            java.lang.String r14 = ".."
            r13.append(r14)
            int r11 = r11.getEnd()
            java.lang.String r11 = com.android.p023dx.util.Hex.u2or4(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.lang.String r13 = ""
            java.lang.String r12 = r12.toHuman(r9, r13)
            if (r3 == 0) goto L_0x00a4
            r8.annotate(r4, r11)
            r8.annotate(r5, r12)
            goto L_0x00aa
        L_0x00a4:
            r7.println(r11)
            r7.println(r12)
        L_0x00aa:
            int r10 = r10 + 1
            goto L_0x005c
        L_0x00ad:
            if (r3 != 0) goto L_0x00b0
            return
        L_0x00b0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "handlers:"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r8.annotate(r2, r1)
            int r1 = r0.encodedHandlerHeaderSize
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r4 = "size: "
            r3.append(r4)
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r4 = r0.handlerOffsets
            int r4 = r4.size()
            java.lang.String r4 = com.android.p023dx.util.Hex.m907u2(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.annotate(r1, r3)
            r1 = 0
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r3 = r0.handlerOffsets
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r10 = r3.iterator()
        L_0x00f2:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r10.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            r11 = r4
            com.android.dx.dex.code.CatchHandlerList r11 = (com.android.p023dx.dex.code.CatchHandlerList) r11
            java.lang.Object r3 = r3.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r12 = r3.intValue()
            if (r1 == 0) goto L_0x011b
            int r3 = r12 - r2
            r4 = r9
            r5 = r17
            r6 = r18
            annotateAndConsumeHandlers(r1, r2, r3, r4, r5, r6)
        L_0x011b:
            r1 = r11
            r2 = r12
            goto L_0x00f2
        L_0x011e:
            byte[] r3 = r0.encodedHandlers
            int r3 = r3.length
            int r3 = r3 - r2
            r4 = r9
            r5 = r17
            r6 = r18
            annotateAndConsumeHandlers(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.dex.file.CatchStructs.annotateEntries(java.lang.String, java.io.PrintWriter, com.android.dx.util.AnnotatedOutput):void");
    }

    private void finishProcessingIfNecessary() {
        if (this.table == null) {
            this.table = this.code.getCatches();
        }
    }

    public void debugPrint(PrintWriter printWriter, String str) {
        annotateEntries(str, printWriter, (AnnotatedOutput) null);
    }

    public void encode(DexFile dexFile) {
        finishProcessingIfNecessary();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int size = this.table.size();
        this.handlerOffsets = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            this.handlerOffsets.put(this.table.get(i).getHandlers(), (Object) null);
        }
        if (this.handlerOffsets.size() <= 65535) {
            ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
            this.encodedHandlerHeaderSize = byteArrayAnnotatedOutput.writeUleb128(this.handlerOffsets.size());
            for (Map.Entry next : this.handlerOffsets.entrySet()) {
                CatchHandlerList catchHandlerList = (CatchHandlerList) next.getKey();
                int size2 = catchHandlerList.size();
                boolean catchesAll = catchHandlerList.catchesAll();
                next.setValue(Integer.valueOf(byteArrayAnnotatedOutput.getCursor()));
                if (catchesAll) {
                    byteArrayAnnotatedOutput.writeSleb128(-(size2 - 1));
                    size2--;
                } else {
                    byteArrayAnnotatedOutput.writeSleb128(size2);
                }
                for (int i2 = 0; i2 < size2; i2++) {
                    CatchHandlerList.Entry entry = catchHandlerList.get(i2);
                    byteArrayAnnotatedOutput.writeUleb128(typeIds.indexOf(entry.getExceptionType()));
                    byteArrayAnnotatedOutput.writeUleb128(entry.getHandler());
                }
                if (catchesAll) {
                    byteArrayAnnotatedOutput.writeUleb128(catchHandlerList.get(size2).getHandler());
                }
            }
            this.encodedHandlers = byteArrayAnnotatedOutput.toByteArray();
            return;
        }
        throw new UnsupportedOperationException("too many catch handlers");
    }

    public int triesSize() {
        finishProcessingIfNecessary();
        return this.table.size();
    }

    public int writeSize() {
        return (triesSize() * 8) + this.encodedHandlers.length;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        finishProcessingIfNecessary();
        if (annotatedOutput.annotates()) {
            annotateEntries("  ", (PrintWriter) null, annotatedOutput);
        }
        int size = this.table.size();
        int i = 0;
        while (i < size) {
            CatchTable.Entry entry = this.table.get(i);
            int start = entry.getStart();
            int end = entry.getEnd();
            int i2 = end - start;
            if (i2 < 65536) {
                annotatedOutput.writeInt(start);
                annotatedOutput.writeShort(i2);
                annotatedOutput.writeShort(this.handlerOffsets.get(entry.getHandlers()).intValue());
                i++;
            } else {
                throw new UnsupportedOperationException("bogus exception range: " + Hex.m909u4(start) + ".." + Hex.m909u4(end));
            }
        }
        annotatedOutput.write(this.encodedHandlers);
    }
}
