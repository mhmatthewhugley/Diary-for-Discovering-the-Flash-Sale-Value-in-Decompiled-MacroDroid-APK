package com.android.p023dx.p026io;

import com.android.dex.ClassDef;
import com.android.dex.Dex;
import com.android.dex.FieldId;
import com.android.dex.MethodId;
import com.android.dex.ProtoId;
import com.android.dex.TableOfContents;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/* renamed from: com.android.dx.io.DexIndexPrinter */
public final class DexIndexPrinter {
    private final Dex dex;
    private final TableOfContents tableOfContents;

    public DexIndexPrinter(File file) throws IOException {
        Dex dex2 = new Dex(file);
        this.dex = dex2;
        this.tableOfContents = dex2.getTableOfContents();
    }

    public static void main(String[] strArr) throws IOException {
        DexIndexPrinter dexIndexPrinter = new DexIndexPrinter(new File(strArr[0]));
        dexIndexPrinter.printMap();
        dexIndexPrinter.printStrings();
        dexIndexPrinter.printTypeIds();
        dexIndexPrinter.printProtoIds();
        dexIndexPrinter.printFieldIds();
        dexIndexPrinter.printMethodIds();
        dexIndexPrinter.printTypeLists();
        dexIndexPrinter.printClassDefs();
    }

    private void printClassDefs() {
        int i = 0;
        for (ClassDef classDef : this.dex.classDefs()) {
            PrintStream printStream = System.out;
            printStream.println("class def " + i + ": " + classDef);
            i++;
        }
    }

    private void printFieldIds() throws IOException {
        int i = 0;
        for (FieldId fieldId : this.dex.fieldIds()) {
            PrintStream printStream = System.out;
            printStream.println("field " + i + ": " + fieldId);
            i++;
        }
    }

    private void printMap() {
        for (TableOfContents.Section section : this.tableOfContents.sections) {
            if (section.off != -1) {
                System.out.println("section " + Integer.toHexString(section.type) + " off=" + Integer.toHexString(section.off) + " size=" + Integer.toHexString(section.size) + " byteCount=" + Integer.toHexString(section.byteCount));
            }
        }
    }

    private void printMethodIds() throws IOException {
        int i = 0;
        for (MethodId methodId : this.dex.methodIds()) {
            PrintStream printStream = System.out;
            printStream.println("methodId " + i + ": " + methodId);
            i++;
        }
    }

    private void printProtoIds() throws IOException {
        int i = 0;
        for (ProtoId protoId : this.dex.protoIds()) {
            PrintStream printStream = System.out;
            printStream.println("proto " + i + ": " + protoId);
            i++;
        }
    }

    private void printStrings() throws IOException {
        int i = 0;
        for (String str : this.dex.strings()) {
            PrintStream printStream = System.out;
            printStream.println("string " + i + ": " + str);
            i++;
        }
    }

    private void printTypeIds() throws IOException {
        int i = 0;
        for (Integer intValue : this.dex.typeIds()) {
            PrintStream printStream = System.out;
            printStream.println("type " + i + ": " + this.dex.strings().get(intValue.intValue()));
            i++;
        }
    }

    private void printTypeLists() throws IOException {
        int i = this.tableOfContents.typeLists.off;
        if (i == -1) {
            System.out.println("No type lists");
            return;
        }
        Dex.Section open = this.dex.open(i);
        for (int i2 = 0; i2 < this.tableOfContents.typeLists.size; i2++) {
            int readInt = open.readInt();
            PrintStream printStream = System.out;
            printStream.print("Type list i=" + i2 + ", size=" + readInt + ", elements=");
            for (int i3 = 0; i3 < readInt; i3++) {
                PrintStream printStream2 = System.out;
                printStream2.print(" " + this.dex.typeNames().get(open.readShort()));
            }
            if (readInt % 2 == 1) {
                open.readShort();
            }
            System.out.println();
        }
    }
}
