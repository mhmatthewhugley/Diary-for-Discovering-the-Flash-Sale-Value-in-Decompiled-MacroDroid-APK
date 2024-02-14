package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.iface.Attribute;
import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.p024cf.iface.StdAttributeList;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import java.util.Objects;

/* renamed from: com.android.dx.cf.direct.AttributeListParser */
final class AttributeListParser {
    private final AttributeFactory attributeFactory;

    /* renamed from: cf */
    private final DirectClassFile f1042cf;
    private final int context;
    private int endOffset = -1;
    private final StdAttributeList list;
    private ParseObserver observer;
    private final int offset;

    public AttributeListParser(DirectClassFile directClassFile, int i, int i2, AttributeFactory attributeFactory2) {
        Objects.requireNonNull(directClassFile, "cf == null");
        Objects.requireNonNull(attributeFactory2, "attributeFactory == null");
        int unsignedShort = directClassFile.getBytes().getUnsignedShort(i2);
        this.f1042cf = directClassFile;
        this.context = i;
        this.offset = i2;
        this.attributeFactory = attributeFactory2;
        this.list = new StdAttributeList(unsignedShort);
    }

    private void parse() {
        int size = this.list.size();
        int i = this.offset + 2;
        ByteArray bytes = this.f1042cf.getBytes();
        ParseObserver parseObserver = this.observer;
        if (parseObserver != null) {
            int i2 = this.offset;
            parseObserver.parsed(bytes, i2, 2, "attributes_count: " + Hex.m907u2(size));
        }
        int i3 = 0;
        while (i3 < size) {
            try {
                ParseObserver parseObserver2 = this.observer;
                if (parseObserver2 != null) {
                    parseObserver2.parsed(bytes, i, 0, "\nattributes[" + i3 + "]:\n");
                    this.observer.changeIndent(1);
                }
                Attribute parse = this.attributeFactory.parse(this.f1042cf, this.context, i, this.observer);
                i += parse.byteLength();
                this.list.set(i3, parse);
                ParseObserver parseObserver3 = this.observer;
                if (parseObserver3 != null) {
                    parseObserver3.changeIndent(-1);
                    ParseObserver parseObserver4 = this.observer;
                    parseObserver4.parsed(bytes, i, 0, "end attributes[" + i3 + "]\n");
                }
                i3++;
            } catch (ParseException e) {
                e.addContext("...while parsing attributes[" + i3 + "]");
                throw e;
            } catch (RuntimeException e2) {
                ParseException parseException = new ParseException((Throwable) e2);
                parseException.addContext("...while parsing attributes[" + i3 + "]");
                throw parseException;
            }
        }
        this.endOffset = i;
    }

    private void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    public StdAttributeList getList() {
        parseIfNecessary();
        return this.list;
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }
}
