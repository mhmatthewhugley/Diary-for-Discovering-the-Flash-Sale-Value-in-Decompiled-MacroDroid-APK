package com.android.p023dx.command.grep;

import com.android.dex.ClassData;
import com.android.dex.ClassDef;
import com.android.dex.Dex;
import com.android.dex.EncodedValueReader;
import com.android.dex.util.ByteInput;
import com.android.p023dx.p026io.CodeReader;
import com.android.p023dx.p026io.instructions.DecodedInstruction;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.android.dx.command.grep.Grep */
public final class Grep {
    private final CodeReader codeReader;
    private int count = 0;
    private ClassDef currentClass;
    private ClassData.Method currentMethod;
    private final Dex dex;
    private final PrintWriter out;
    private final Set<Integer> stringIds;

    public Grep(Dex dex2, Pattern pattern, PrintWriter printWriter) {
        CodeReader codeReader2 = new CodeReader();
        this.codeReader = codeReader2;
        this.dex = dex2;
        this.out = printWriter;
        this.stringIds = getStringIds(dex2, pattern);
        codeReader2.setStringVisitor(new CodeReader.Visitor() {
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                Grep.this.encounterString(decodedInstruction.getIndex());
            }
        });
    }

    /* access modifiers changed from: private */
    public void encounterString(int i) {
        if (this.stringIds.contains(Integer.valueOf(i))) {
            PrintWriter printWriter = this.out;
            printWriter.println(location() + " " + this.dex.strings().get(i));
            this.count = this.count + 1;
        }
    }

    private Set<Integer> getStringIds(Dex dex2, Pattern pattern) {
        HashSet hashSet = new HashSet();
        int i = 0;
        for (String matcher : dex2.strings()) {
            if (pattern.matcher(matcher).find()) {
                hashSet.add(Integer.valueOf(i));
            }
            i++;
        }
        return hashSet;
    }

    private String location() {
        String str = this.dex.typeNames().get(this.currentClass.getTypeIndex());
        if (this.currentMethod == null) {
            return str;
        }
        return str + "." + this.dex.strings().get(this.dex.methodIds().get(this.currentMethod.getMethodIndex()).getNameIndex());
    }

    private void readArray(EncodedValueReader encodedValueReader) {
        int readArray = encodedValueReader.readArray();
        for (int i = 0; i < readArray; i++) {
            int peek = encodedValueReader.peek();
            if (peek == 23) {
                encounterString(encodedValueReader.readString());
            } else if (peek == 28) {
                readArray(encodedValueReader);
            }
        }
    }

    public int grep() {
        for (ClassDef next : this.dex.classDefs()) {
            this.currentClass = next;
            this.currentMethod = null;
            if (next.getClassDataOffset() != 0) {
                ClassData readClassData = this.dex.readClassData(next);
                int staticValuesOffset = next.getStaticValuesOffset();
                if (staticValuesOffset != 0) {
                    readArray(new EncodedValueReader((ByteInput) this.dex.open(staticValuesOffset)));
                }
                for (ClassData.Method method : readClassData.allMethods()) {
                    this.currentMethod = method;
                    if (method.getCodeOffset() != 0) {
                        this.codeReader.visitAll(this.dex.readCode(method).getInstructions());
                    }
                }
            }
        }
        this.currentClass = null;
        this.currentMethod = null;
        return this.count;
    }
}
