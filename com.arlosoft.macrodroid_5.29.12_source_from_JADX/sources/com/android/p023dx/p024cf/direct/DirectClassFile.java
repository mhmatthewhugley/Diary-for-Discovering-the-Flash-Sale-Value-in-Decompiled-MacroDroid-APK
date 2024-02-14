package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.attrib.AttSourceFile;
import com.android.p023dx.p024cf.cst.ConstantPoolParser;
import com.android.p023dx.p024cf.iface.Attribute;
import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.p024cf.iface.ClassFile;
import com.android.p023dx.p024cf.iface.FieldList;
import com.android.p023dx.p024cf.iface.MethodList;
import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.p024cf.iface.StdAttributeList;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.ConstantPool;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.cst.StdConstantPool;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import java.util.Objects;

/* renamed from: com.android.dx.cf.direct.DirectClassFile */
public class DirectClassFile implements ClassFile {
    private static final int CLASS_FILE_MAGIC = -889275714;
    private static final int CLASS_FILE_MAX_MAJOR_VERSION = 51;
    private static final int CLASS_FILE_MAX_MINOR_VERSION = 0;
    private static final int CLASS_FILE_MIN_MAJOR_VERSION = 45;
    private int accessFlags;
    private AttributeFactory attributeFactory;
    private StdAttributeList attributes;
    private final ByteArray bytes;
    private FieldList fields;
    private final String filePath;
    private TypeList interfaces;
    private MethodList methods;
    private ParseObserver observer;
    private StdConstantPool pool;
    private final boolean strictParse;
    private CstType superClass;
    private CstType thisClass;

    /* renamed from: com.android.dx.cf.direct.DirectClassFile$DcfTypeList */
    private static class DcfTypeList implements TypeList {
        private final ByteArray bytes;
        private final StdConstantPool pool;
        private final int size;

        public DcfTypeList(ByteArray byteArray, int i, int i2, StdConstantPool stdConstantPool, ParseObserver parseObserver) {
            if (i2 >= 0) {
                ByteArray slice = byteArray.slice(i, (i2 * 2) + i);
                this.bytes = slice;
                this.size = i2;
                this.pool = stdConstantPool;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = i3 * 2;
                    try {
                        CstType cstType = (CstType) stdConstantPool.get(slice.getUnsignedShort(i4));
                        if (parseObserver != null) {
                            parseObserver.parsed(slice, i4, 2, "  " + cstType);
                        }
                        i3++;
                    } catch (ClassCastException e) {
                        throw new RuntimeException("bogus class cpi", e);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("size < 0");
        }

        public Type getType(int i) {
            return ((CstType) this.pool.get(this.bytes.getUnsignedShort(i * 2))).getClassType();
        }

        public int getWordCount() {
            return this.size;
        }

        public boolean isMutable() {
            return false;
        }

        public int size() {
            return this.size;
        }

        public TypeList withAddedType(Type type) {
            throw new UnsupportedOperationException("unsupported");
        }
    }

    public DirectClassFile(ByteArray byteArray, String str, boolean z) {
        Objects.requireNonNull(byteArray, "bytes == null");
        Objects.requireNonNull(str, "filePath == null");
        this.filePath = str;
        this.bytes = byteArray;
        this.strictParse = z;
        this.accessFlags = -1;
    }

    private boolean isGoodMagic(int i) {
        return i == CLASS_FILE_MAGIC;
    }

    private boolean isGoodVersion(int i, int i2) {
        if (i >= 0) {
            return i2 == 51 ? i <= 0 : i2 < 51 && i2 >= 45;
        }
        return false;
    }

    private void parse() {
        try {
            parse0();
        } catch (ParseException e) {
            e.addContext("...while parsing " + this.filePath);
            throw e;
        } catch (RuntimeException e2) {
            ParseException parseException = new ParseException((Throwable) e2);
            parseException.addContext("...while parsing " + this.filePath);
            throw parseException;
        }
    }

    private void parse0() {
        if (this.bytes.size() >= 10) {
            ParseObserver parseObserver = this.observer;
            if (parseObserver != null) {
                parseObserver.parsed(this.bytes, 0, 0, "begin classfile");
                ParseObserver parseObserver2 = this.observer;
                ByteArray byteArray = this.bytes;
                parseObserver2.parsed(byteArray, 0, 4, "magic: " + Hex.m909u4(getMagic0()));
                ParseObserver parseObserver3 = this.observer;
                ByteArray byteArray2 = this.bytes;
                parseObserver3.parsed(byteArray2, 4, 2, "minor_version: " + Hex.m907u2(getMinorVersion0()));
                ParseObserver parseObserver4 = this.observer;
                ByteArray byteArray3 = this.bytes;
                parseObserver4.parsed(byteArray3, 6, 2, "major_version: " + Hex.m907u2(getMajorVersion0()));
            }
            if (this.strictParse) {
                if (!isGoodMagic(getMagic0())) {
                    throw new ParseException("bad class file magic (" + Hex.m909u4(getMagic0()) + ")");
                } else if (!isGoodVersion(getMinorVersion0(), getMajorVersion0())) {
                    throw new ParseException("unsupported class file version " + getMajorVersion0() + "." + getMinorVersion0());
                }
            }
            ConstantPoolParser constantPoolParser = new ConstantPoolParser(this.bytes);
            constantPoolParser.setObserver(this.observer);
            StdConstantPool pool2 = constantPoolParser.getPool();
            this.pool = pool2;
            pool2.setImmutable();
            int endOffset = constantPoolParser.getEndOffset();
            int unsignedShort = this.bytes.getUnsignedShort(endOffset);
            int i = endOffset + 2;
            this.thisClass = (CstType) this.pool.get(this.bytes.getUnsignedShort(i));
            int i2 = endOffset + 4;
            this.superClass = (CstType) this.pool.get0Ok(this.bytes.getUnsignedShort(i2));
            int i3 = endOffset + 6;
            int unsignedShort2 = this.bytes.getUnsignedShort(i3);
            ParseObserver parseObserver5 = this.observer;
            if (parseObserver5 != null) {
                ByteArray byteArray4 = this.bytes;
                parseObserver5.parsed(byteArray4, endOffset, 2, "access_flags: " + AccessFlags.classString(unsignedShort));
                ParseObserver parseObserver6 = this.observer;
                ByteArray byteArray5 = this.bytes;
                parseObserver6.parsed(byteArray5, i, 2, "this_class: " + this.thisClass);
                ParseObserver parseObserver7 = this.observer;
                ByteArray byteArray6 = this.bytes;
                parseObserver7.parsed(byteArray6, i2, 2, "super_class: " + stringOrNone(this.superClass));
                ParseObserver parseObserver8 = this.observer;
                ByteArray byteArray7 = this.bytes;
                parseObserver8.parsed(byteArray7, i3, 2, "interfaces_count: " + Hex.m907u2(unsignedShort2));
                if (unsignedShort2 != 0) {
                    this.observer.parsed(this.bytes, endOffset + 8, 0, "interfaces:");
                }
            }
            int i4 = endOffset + 8;
            this.interfaces = makeTypeList(i4, unsignedShort2);
            int i5 = i4 + (unsignedShort2 * 2);
            if (this.strictParse) {
                String className = this.thisClass.getClassType().getClassName();
                if (!this.filePath.endsWith(".class") || !this.filePath.startsWith(className) || this.filePath.length() != className.length() + 6) {
                    throw new ParseException("class name (" + className + ") does not match path (" + this.filePath + ")");
                }
            }
            this.accessFlags = unsignedShort;
            FieldListParser fieldListParser = new FieldListParser(this, this.thisClass, i5, this.attributeFactory);
            fieldListParser.setObserver(this.observer);
            this.fields = fieldListParser.getList();
            MethodListParser methodListParser = new MethodListParser(this, this.thisClass, fieldListParser.getEndOffset(), this.attributeFactory);
            methodListParser.setObserver(this.observer);
            this.methods = methodListParser.getList();
            AttributeListParser attributeListParser = new AttributeListParser(this, 0, methodListParser.getEndOffset(), this.attributeFactory);
            attributeListParser.setObserver(this.observer);
            StdAttributeList list = attributeListParser.getList();
            this.attributes = list;
            list.setImmutable();
            int endOffset2 = attributeListParser.getEndOffset();
            if (endOffset2 == this.bytes.size()) {
                ParseObserver parseObserver9 = this.observer;
                if (parseObserver9 != null) {
                    parseObserver9.parsed(this.bytes, endOffset2, 0, "end classfile");
                    return;
                }
                return;
            }
            throw new ParseException("extra bytes at end of class file, at offset " + Hex.m909u4(endOffset2));
        }
        throw new ParseException("severely truncated class file");
    }

    private void parseToEndIfNecessary() {
        if (this.attributes == null) {
            parse();
        }
    }

    private void parseToInterfacesIfNecessary() {
        if (this.accessFlags == -1) {
            parse();
        }
    }

    public static String stringOrNone(Object obj) {
        return obj == null ? "(none)" : obj.toString();
    }

    public int getAccessFlags() {
        parseToInterfacesIfNecessary();
        return this.accessFlags;
    }

    public AttributeList getAttributes() {
        parseToEndIfNecessary();
        return this.attributes;
    }

    public ByteArray getBytes() {
        return this.bytes;
    }

    public ConstantPool getConstantPool() {
        parseToInterfacesIfNecessary();
        return this.pool;
    }

    public FieldList getFields() {
        parseToEndIfNecessary();
        return this.fields;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public TypeList getInterfaces() {
        parseToInterfacesIfNecessary();
        return this.interfaces;
    }

    public int getMagic() {
        parseToInterfacesIfNecessary();
        return getMagic0();
    }

    public int getMagic0() {
        return this.bytes.getInt(0);
    }

    public int getMajorVersion() {
        parseToInterfacesIfNecessary();
        return getMajorVersion0();
    }

    public int getMajorVersion0() {
        return this.bytes.getUnsignedShort(6);
    }

    public MethodList getMethods() {
        parseToEndIfNecessary();
        return this.methods;
    }

    public int getMinorVersion() {
        parseToInterfacesIfNecessary();
        return getMinorVersion0();
    }

    public int getMinorVersion0() {
        return this.bytes.getUnsignedShort(4);
    }

    public CstString getSourceFile() {
        Attribute findFirst = getAttributes().findFirst(AttSourceFile.ATTRIBUTE_NAME);
        if (findFirst instanceof AttSourceFile) {
            return ((AttSourceFile) findFirst).getSourceFile();
        }
        return null;
    }

    public CstType getSuperclass() {
        parseToInterfacesIfNecessary();
        return this.superClass;
    }

    public CstType getThisClass() {
        parseToInterfacesIfNecessary();
        return this.thisClass;
    }

    public TypeList makeTypeList(int i, int i2) {
        if (i2 == 0) {
            return StdTypeList.EMPTY;
        }
        StdConstantPool stdConstantPool = this.pool;
        if (stdConstantPool != null) {
            return new DcfTypeList(this.bytes, i, i2, stdConstantPool, this.observer);
        }
        throw new IllegalStateException("pool not yet initialized");
    }

    public void setAttributeFactory(AttributeFactory attributeFactory2) {
        Objects.requireNonNull(attributeFactory2, "attributeFactory == null");
        this.attributeFactory = attributeFactory2;
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }

    public DirectClassFile(byte[] bArr, String str, boolean z) {
        this(new ByteArray(bArr), str, z);
    }
}
