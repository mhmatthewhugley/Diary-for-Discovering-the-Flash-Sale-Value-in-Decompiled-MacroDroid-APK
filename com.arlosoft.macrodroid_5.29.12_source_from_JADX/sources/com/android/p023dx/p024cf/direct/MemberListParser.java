package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.p024cf.iface.Member;
import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.p024cf.iface.StdAttributeList;
import com.android.p023dx.rop.cst.ConstantPool;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import java.util.Objects;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.cf.direct.MemberListParser */
abstract class MemberListParser {
    private final AttributeFactory attributeFactory;

    /* renamed from: cf */
    private final DirectClassFile f1043cf;
    private final CstType definer;
    private int endOffset;
    private ParseObserver observer;
    private final int offset;

    public MemberListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory2) {
        Objects.requireNonNull(directClassFile, "cf == null");
        if (i >= 0) {
            Objects.requireNonNull(attributeFactory2, "attributeFactory == null");
            this.f1043cf = directClassFile;
            this.definer = cstType;
            this.offset = i;
            this.attributeFactory = attributeFactory2;
            this.endOffset = -1;
            return;
        }
        throw new IllegalArgumentException("offset < 0");
    }

    private void parse() {
        int i;
        ConstantPool constantPool;
        int attributeContext = getAttributeContext();
        int count = getCount();
        int i2 = this.offset + 2;
        ByteArray bytes = this.f1043cf.getBytes();
        ConstantPool constantPool2 = this.f1043cf.getConstantPool();
        ParseObserver parseObserver = this.observer;
        if (parseObserver != null) {
            int i3 = this.offset;
            parseObserver.parsed(bytes, i3, 2, humanName() + "s_count: " + Hex.m907u2(count));
        }
        int i4 = 0;
        while (i4 < count) {
            try {
                int unsignedShort = bytes.getUnsignedShort(i2);
                int i5 = i2 + 2;
                int unsignedShort2 = bytes.getUnsignedShort(i5);
                int i6 = i2 + 4;
                int unsignedShort3 = bytes.getUnsignedShort(i6);
                CstString cstString = (CstString) constantPool2.get(unsignedShort2);
                CstString cstString2 = (CstString) constantPool2.get(unsignedShort3);
                ParseObserver parseObserver2 = this.observer;
                int i7 = count;
                if (parseObserver2 != null) {
                    constantPool = constantPool2;
                    parseObserver2.startParsingMember(bytes, i2, cstString.getString(), cstString2.getString());
                    ParseObserver parseObserver3 = this.observer;
                    parseObserver3.parsed(bytes, i2, 0, IOUtils.LINE_SEPARATOR_UNIX + humanName() + "s[" + i4 + "]:\n");
                    this.observer.changeIndent(1);
                    ParseObserver parseObserver4 = this.observer;
                    StringBuilder sb = new StringBuilder();
                    sb.append("access_flags: ");
                    sb.append(humanAccessFlags(unsignedShort));
                    parseObserver4.parsed(bytes, i2, 2, sb.toString());
                    ParseObserver parseObserver5 = this.observer;
                    parseObserver5.parsed(bytes, i5, 2, "name: " + cstString.toHuman());
                    ParseObserver parseObserver6 = this.observer;
                    parseObserver6.parsed(bytes, i6, 2, "descriptor: " + cstString2.toHuman());
                } else {
                    constantPool = constantPool2;
                }
                AttributeListParser attributeListParser = new AttributeListParser(this.f1043cf, attributeContext, i2 + 6, this.attributeFactory);
                attributeListParser.setObserver(this.observer);
                i2 = attributeListParser.getEndOffset();
                StdAttributeList list = attributeListParser.getList();
                list.setImmutable();
                Member member = set(i4, unsignedShort, new CstNat(cstString, cstString2), list);
                ParseObserver parseObserver7 = this.observer;
                if (parseObserver7 != null) {
                    parseObserver7.changeIndent(-1);
                    ParseObserver parseObserver8 = this.observer;
                    parseObserver8.parsed(bytes, i2, 0, "end " + humanName() + "s[" + i4 + "]\n");
                    i = i4;
                    try {
                        this.observer.endParsingMember(bytes, i2, cstString.getString(), cstString2.getString(), member);
                    } catch (ParseException e) {
                        e = e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        ParseException parseException = new ParseException((Throwable) e);
                        parseException.addContext("...while parsing " + humanName() + "s[" + i + "]");
                        throw parseException;
                    }
                } else {
                    i = i4;
                }
                i4 = i + 1;
                count = i7;
                constantPool2 = constantPool;
            } catch (ParseException e3) {
                e = e3;
                i = i4;
                e.addContext("...while parsing " + humanName() + "s[" + i + "]");
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                i = i4;
                ParseException parseException2 = new ParseException((Throwable) e);
                parseException2.addContext("...while parsing " + humanName() + "s[" + i + "]");
                throw parseException2;
            }
        }
        this.endOffset = i2;
    }

    /* access modifiers changed from: protected */
    public abstract int getAttributeContext();

    /* access modifiers changed from: protected */
    public final int getCount() {
        return this.f1043cf.getBytes().getUnsignedShort(this.offset);
    }

    /* access modifiers changed from: protected */
    public final CstType getDefiner() {
        return this.definer;
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    /* access modifiers changed from: protected */
    public abstract String humanAccessFlags(int i);

    /* access modifiers changed from: protected */
    public abstract String humanName();

    /* access modifiers changed from: protected */
    public final void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Member set(int i, int i2, CstNat cstNat, AttributeList attributeList);

    public final void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }
}
