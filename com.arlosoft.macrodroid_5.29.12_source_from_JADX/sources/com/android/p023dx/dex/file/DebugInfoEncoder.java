package com.android.p023dx.dex.file;

import androidx.core.view.InputDeviceCompat;
import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.dex.code.LocalList;
import com.android.p023dx.dex.code.PositionList;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.ByteArrayAnnotatedOutput;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.android.dx.dex.file.DebugInfoEncoder */
public final class DebugInfoEncoder {
    private static final boolean DEBUG = false;
    private int address = 0;
    private AnnotatedOutput annotateTo;
    private final int codeSize;
    private PrintWriter debugPrint;
    private final Prototype desc;
    private final DexFile file;
    private final boolean isStatic;
    private final LocalList.Entry[] lastEntryForReg;
    private int line = 1;
    private final LocalList locals;
    private final ByteArrayAnnotatedOutput output;
    private final PositionList positions;
    private String prefix;
    private final int regSize;
    private boolean shouldConsume;

    public DebugInfoEncoder(PositionList positionList, LocalList localList, DexFile dexFile, int i, int i2, boolean z, CstMethodRef cstMethodRef) {
        this.positions = positionList;
        this.locals = localList;
        this.file = dexFile;
        this.desc = cstMethodRef.getPrototype();
        this.isStatic = z;
        this.codeSize = i;
        this.regSize = i2;
        this.output = new ByteArrayAnnotatedOutput();
        this.lastEntryForReg = new LocalList.Entry[i2];
    }

    private void annotate(int i, String str) {
        if (this.prefix != null) {
            str = this.prefix + str;
        }
        AnnotatedOutput annotatedOutput = this.annotateTo;
        if (annotatedOutput != null) {
            if (!this.shouldConsume) {
                i = 0;
            }
            annotatedOutput.annotate(i, str);
        }
        PrintWriter printWriter = this.debugPrint;
        if (printWriter != null) {
            printWriter.println(str);
        }
    }

    private ArrayList<PositionList.Entry> buildSortedPositions() {
        PositionList positionList = this.positions;
        int size = positionList == null ? 0 : positionList.size();
        ArrayList<PositionList.Entry> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(this.positions.get(i));
        }
        Collections.sort(arrayList, new Comparator<PositionList.Entry>() {
            public boolean equals(Object obj) {
                return obj == this;
            }

            public int compare(PositionList.Entry entry, PositionList.Entry entry2) {
                return entry.getAddress() - entry2.getAddress();
            }
        });
        return arrayList;
    }

    private static int computeOpcode(int i, int i2) {
        if (i >= -4 && i <= 10) {
            return (i - -4) + (i2 * 15) + 10;
        }
        throw new RuntimeException("Parameter out of range");
    }

    private byte[] convert0() throws IOException {
        ArrayList<PositionList.Entry> buildSortedPositions = buildSortedPositions();
        emitHeader(buildSortedPositions, extractMethodArguments());
        this.output.writeByte(7);
        int i = 0;
        if (!(this.annotateTo == null && this.debugPrint == null)) {
            annotate(1, String.format("%04x: prologue end", new Object[]{Integer.valueOf(this.address)}));
        }
        int size = buildSortedPositions.size();
        int size2 = this.locals.size();
        int i2 = 0;
        while (true) {
            i = emitLocalsAtAddress(i);
            i2 = emitPositionsAtAddress(i2, buildSortedPositions);
            int address2 = i < size2 ? this.locals.get(i).getAddress() : Integer.MAX_VALUE;
            int address3 = i2 < size ? buildSortedPositions.get(i2).getAddress() : Integer.MAX_VALUE;
            int min = Math.min(address3, address2);
            if (!(min == Integer.MAX_VALUE || (min == this.codeSize && address2 == Integer.MAX_VALUE && address3 == Integer.MAX_VALUE))) {
                if (min == address3) {
                    emitPosition(buildSortedPositions.get(i2));
                    i2++;
                } else {
                    emitAdvancePc(min - this.address);
                }
            }
        }
        emitEndSequence();
        return this.output.toByteArray();
    }

    private void emitAdvanceLine(int i) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(2);
        this.output.writeSleb128(i);
        this.line += i;
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(this.output.getCursor() - cursor, String.format("line = %d", new Object[]{Integer.valueOf(this.line)}));
        }
    }

    private void emitAdvancePc(int i) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(1);
        this.output.writeUleb128(i);
        this.address += i;
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(this.output.getCursor() - cursor, String.format("%04x: advance pc", new Object[]{Integer.valueOf(this.address)}));
        }
    }

    private void emitEndSequence() {
        this.output.writeByte(0);
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(1, "end sequence");
        }
    }

    private void emitHeader(ArrayList<PositionList.Entry> arrayList, ArrayList<LocalList.Entry> arrayList2) throws IOException {
        LocalList.Entry entry;
        boolean z = (this.annotateTo == null && this.debugPrint == null) ? false : true;
        int cursor = this.output.getCursor();
        if (arrayList.size() > 0) {
            this.line = arrayList.get(0).getPosition().getLine();
        }
        this.output.writeUleb128(this.line);
        if (z) {
            annotate(this.output.getCursor() - cursor, "line_start: " + this.line);
        }
        int paramBase = getParamBase();
        StdTypeList parameterTypes = this.desc.getParameterTypes();
        int size = parameterTypes.size();
        if (!this.isStatic) {
            Iterator<LocalList.Entry> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LocalList.Entry next = it.next();
                if (paramBase == next.getRegister()) {
                    this.lastEntryForReg[paramBase] = next;
                    break;
                }
            }
            paramBase++;
        }
        int cursor2 = this.output.getCursor();
        this.output.writeUleb128(size);
        if (z) {
            annotate(this.output.getCursor() - cursor2, String.format("parameters_size: %04x", new Object[]{Integer.valueOf(size)}));
        }
        for (int i = 0; i < size; i++) {
            Type type = parameterTypes.get(i);
            int cursor3 = this.output.getCursor();
            Iterator<LocalList.Entry> it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    entry = null;
                    break;
                }
                entry = it2.next();
                if (paramBase == entry.getRegister()) {
                    if (entry.getSignature() != null) {
                        emitStringIndex((CstString) null);
                    } else {
                        emitStringIndex(entry.getName());
                    }
                    this.lastEntryForReg[paramBase] = entry;
                }
            }
            if (entry == null) {
                emitStringIndex((CstString) null);
            }
            if (z) {
                annotate(this.output.getCursor() - cursor3, "parameter " + ((entry == null || entry.getSignature() != null) ? "<unnamed>" : entry.getName().toHuman()) + " " + RegisterSpec.PREFIX + paramBase);
            }
            paramBase += type.getCategory();
        }
        for (LocalList.Entry entry2 : this.lastEntryForReg) {
            if (!(entry2 == null || entry2.getSignature() == null)) {
                emitLocalStartExtended(entry2);
            }
        }
    }

    private void emitLocalEnd(LocalList.Entry entry) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(5);
        this.output.writeUleb128(entry.getRegister());
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(this.output.getCursor() - cursor, String.format("%04x: -local %s", new Object[]{Integer.valueOf(this.address), entryAnnotationString(entry)}));
        }
    }

    private void emitLocalRestart(LocalList.Entry entry) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(6);
        emitUnsignedLeb128(entry.getRegister());
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(this.output.getCursor() - cursor, String.format("%04x: +local restart %s", new Object[]{Integer.valueOf(this.address), entryAnnotationString(entry)}));
        }
    }

    private void emitLocalStart(LocalList.Entry entry) throws IOException {
        if (entry.getSignature() != null) {
            emitLocalStartExtended(entry);
            return;
        }
        int cursor = this.output.getCursor();
        this.output.writeByte(3);
        emitUnsignedLeb128(entry.getRegister());
        emitStringIndex(entry.getName());
        emitTypeIndex(entry.getType());
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(this.output.getCursor() - cursor, String.format("%04x: +local %s", new Object[]{Integer.valueOf(this.address), entryAnnotationString(entry)}));
        }
    }

    private void emitLocalStartExtended(LocalList.Entry entry) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(4);
        emitUnsignedLeb128(entry.getRegister());
        emitStringIndex(entry.getName());
        emitTypeIndex(entry.getType());
        emitStringIndex(entry.getSignature());
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(this.output.getCursor() - cursor, String.format("%04x: +localx %s", new Object[]{Integer.valueOf(this.address), entryAnnotationString(entry)}));
        }
    }

    private int emitLocalsAtAddress(int i) throws IOException {
        int size = this.locals.size();
        while (i < size && this.locals.get(i).getAddress() == this.address) {
            int i2 = i + 1;
            LocalList.Entry entry = this.locals.get(i);
            int register = entry.getRegister();
            LocalList.Entry[] entryArr = this.lastEntryForReg;
            LocalList.Entry entry2 = entryArr[register];
            if (entry != entry2) {
                entryArr[register] = entry;
                if (entry.isStart()) {
                    if (entry2 == null || !entry.matches(entry2)) {
                        emitLocalStart(entry);
                    } else if (!entry2.isStart()) {
                        emitLocalRestart(entry);
                    } else {
                        throw new RuntimeException("shouldn't happen");
                    }
                } else if (entry.getDisposition() != LocalList.Disposition.END_REPLACED) {
                    emitLocalEnd(entry);
                }
            }
            i = i2;
        }
        return i;
    }

    private void emitPosition(PositionList.Entry entry) throws IOException {
        int line2 = entry.getPosition().getLine();
        int address2 = entry.getAddress();
        int i = line2 - this.line;
        int i2 = address2 - this.address;
        if (i2 >= 0) {
            if (i < -4 || i > 10) {
                emitAdvanceLine(i);
                i = 0;
            }
            int computeOpcode = computeOpcode(i, i2);
            if ((computeOpcode & InputDeviceCompat.SOURCE_ANY) > 0) {
                emitAdvancePc(i2);
                computeOpcode = computeOpcode(i, 0);
                if ((computeOpcode & InputDeviceCompat.SOURCE_ANY) > 0) {
                    emitAdvanceLine(i);
                    computeOpcode = computeOpcode(0, 0);
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = 0;
                }
            }
            this.output.writeByte(computeOpcode);
            this.line += i;
            int i3 = this.address + i2;
            this.address = i3;
            if (this.annotateTo != null || this.debugPrint != null) {
                annotate(1, String.format("%04x: line %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.line)}));
                return;
            }
            return;
        }
        throw new RuntimeException("Position entries must be in ascending address order");
    }

    private int emitPositionsAtAddress(int i, ArrayList<PositionList.Entry> arrayList) throws IOException {
        int size = arrayList.size();
        while (i < size && arrayList.get(i).getAddress() == this.address) {
            emitPosition(arrayList.get(i));
            i++;
        }
        return i;
    }

    private void emitStringIndex(CstString cstString) throws IOException {
        DexFile dexFile;
        if (cstString == null || (dexFile = this.file) == null) {
            this.output.writeUleb128(0);
        } else {
            this.output.writeUleb128(dexFile.getStringIds().indexOf(cstString) + 1);
        }
    }

    private void emitTypeIndex(CstType cstType) throws IOException {
        DexFile dexFile;
        if (cstType == null || (dexFile = this.file) == null) {
            this.output.writeUleb128(0);
        } else {
            this.output.writeUleb128(dexFile.getTypeIds().indexOf(cstType) + 1);
        }
    }

    private void emitUnsignedLeb128(int i) throws IOException {
        if (i >= 0) {
            this.output.writeUleb128(i);
            return;
        }
        throw new RuntimeException("Signed value where unsigned required: " + i);
    }

    private String entryAnnotationString(LocalList.Entry entry) {
        StringBuilder sb = new StringBuilder();
        sb.append(RegisterSpec.PREFIX);
        sb.append(entry.getRegister());
        sb.append(' ');
        CstString name = entry.getName();
        if (name == null) {
            sb.append("null");
        } else {
            sb.append(name.toHuman());
        }
        sb.append(' ');
        CstType type = entry.getType();
        if (type == null) {
            sb.append("null");
        } else {
            sb.append(type.toHuman());
        }
        CstString signature = entry.getSignature();
        if (signature != null) {
            sb.append(' ');
            sb.append(signature.toHuman());
        }
        return sb.toString();
    }

    private ArrayList<LocalList.Entry> extractMethodArguments() {
        ArrayList<LocalList.Entry> arrayList = new ArrayList<>(this.desc.getParameterTypes().size());
        int paramBase = getParamBase();
        BitSet bitSet = new BitSet(this.regSize - paramBase);
        int size = this.locals.size();
        for (int i = 0; i < size; i++) {
            LocalList.Entry entry = this.locals.get(i);
            int register = entry.getRegister();
            if (register >= paramBase) {
                int i2 = register - paramBase;
                if (!bitSet.get(i2)) {
                    bitSet.set(i2);
                    arrayList.add(entry);
                }
            }
        }
        Collections.sort(arrayList, new Comparator<LocalList.Entry>() {
            public boolean equals(Object obj) {
                return obj == this;
            }

            public int compare(LocalList.Entry entry, LocalList.Entry entry2) {
                return entry.getRegister() - entry2.getRegister();
            }
        });
        return arrayList;
    }

    private int getParamBase() {
        return (this.regSize - this.desc.getParameterTypes().getWordCount()) - (this.isStatic ^ true ? 1 : 0);
    }

    public byte[] convert() {
        try {
            return convert0();
        } catch (IOException e) {
            throw ExceptionWithContext.withContext(e, "...while encoding debug info");
        }
    }

    public byte[] convertAndAnnotate(String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        this.prefix = str;
        this.debugPrint = printWriter;
        this.annotateTo = annotatedOutput;
        this.shouldConsume = z;
        return convert();
    }
}
