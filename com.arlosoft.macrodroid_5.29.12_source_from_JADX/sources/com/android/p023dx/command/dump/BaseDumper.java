package com.android.p023dx.command.dump;

import com.android.p023dx.p024cf.code.ConcreteMethod;
import com.android.p023dx.p024cf.iface.Member;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IndentingWriter;
import com.android.p023dx.util.TwoColumnOutput;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;

/* renamed from: com.android.dx.command.dump.BaseDumper */
public abstract class BaseDumper implements ParseObserver {
    protected Args args;

    /* renamed from: at */
    private int f1044at;
    private final byte[] bytes;
    private final String filePath;
    private final int hexCols;
    private int indent;
    private final PrintStream out;
    private final boolean rawBytes;
    private String separator;
    private final boolean strictParse;
    private final int width;

    public BaseDumper(byte[] bArr, PrintStream printStream, String str, Args args2) {
        this.bytes = bArr;
        boolean z = args2.rawBytes;
        this.rawBytes = z;
        this.out = printStream;
        int i = args2.width;
        i = i <= 0 ? 79 : i;
        this.width = i;
        this.filePath = str;
        this.strictParse = args2.strictParse;
        this.indent = 0;
        this.separator = z ? "|" : "";
        this.f1044at = 0;
        this.args = args2;
        int i2 = (((i - 5) / 15) + 1) & -2;
        if (i2 < 6) {
            i2 = 6;
        } else if (i2 > 10) {
            i2 = 10;
        }
        this.hexCols = i2;
    }

    static int computeParamWidth(ConcreteMethod concreteMethod, boolean z) {
        return concreteMethod.getEffectiveDescriptor().getParameterTypes().getWordCount();
    }

    public void changeIndent(int i) {
        this.indent += i;
        this.separator = this.rawBytes ? "|" : "";
        for (int i2 = 0; i2 < this.indent; i2++) {
            this.separator += "  ";
        }
    }

    public void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member) {
    }

    /* access modifiers changed from: protected */
    public final int getAt() {
        return this.f1044at;
    }

    /* access modifiers changed from: protected */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* access modifiers changed from: protected */
    public final String getFilePath() {
        return this.filePath;
    }

    /* access modifiers changed from: protected */
    public final boolean getRawBytes() {
        return this.rawBytes;
    }

    /* access modifiers changed from: protected */
    public final boolean getStrictParse() {
        return this.strictParse;
    }

    /* access modifiers changed from: protected */
    public final int getWidth1() {
        if (!this.rawBytes) {
            return 0;
        }
        int i = this.hexCols;
        return (i * 2) + 5 + (i / 2);
    }

    /* access modifiers changed from: protected */
    public final int getWidth2() {
        return (this.width - (this.rawBytes ? getWidth1() + 1 : 0)) - (this.indent * 2);
    }

    /* access modifiers changed from: protected */
    public final String hexDump(int i, int i2) {
        return Hex.dump(this.bytes, i, i2, i, this.hexCols, 4);
    }

    public void parsed(ByteArray byteArray, int i, int i2, String str) {
        int underlyingOffset = byteArray.underlyingOffset(i, getBytes());
        boolean rawBytes2 = getRawBytes();
        int i3 = this.f1044at;
        String str2 = "";
        if (underlyingOffset < i3) {
            println("<dump skipped backwards to " + Hex.m909u4(underlyingOffset) + ">");
            this.f1044at = underlyingOffset;
        } else if (underlyingOffset > i3) {
            print(twoColumns(rawBytes2 ? hexDump(i3, underlyingOffset - i3) : str2, "<skipped to " + Hex.m909u4(underlyingOffset) + ">"));
            this.f1044at = underlyingOffset;
        }
        if (rawBytes2) {
            str2 = hexDump(underlyingOffset, i2);
        }
        print(twoColumns(str2, str));
        this.f1044at += i2;
    }

    /* access modifiers changed from: protected */
    public final void print(String str) {
        this.out.print(str);
    }

    /* access modifiers changed from: protected */
    public final void println(String str) {
        this.out.println(str);
    }

    /* access modifiers changed from: protected */
    public final void setAt(ByteArray byteArray, int i) {
        this.f1044at = byteArray.underlyingOffset(i, this.bytes);
    }

    public void startParsingMember(ByteArray byteArray, int i, String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public final String twoColumns(String str, String str2) {
        int width1 = getWidth1();
        int width2 = getWidth2();
        if (width1 != 0) {
            return TwoColumnOutput.toString(str, width1, this.separator, str2, width2);
        }
        try {
            int length = str2.length();
            StringWriter stringWriter = new StringWriter(length * 2);
            IndentingWriter indentingWriter = new IndentingWriter(stringWriter, width2, this.separator);
            indentingWriter.write(str2);
            if (length == 0 || str2.charAt(length - 1) != 10) {
                indentingWriter.write(10);
            }
            indentingWriter.flush();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
