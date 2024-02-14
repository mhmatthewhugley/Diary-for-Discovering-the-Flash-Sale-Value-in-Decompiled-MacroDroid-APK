package com.android.p023dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.dex.DexOptions;
import com.android.p023dx.dex.file.MixedItemSection;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstBaseMethodRef;
import com.android.p023dx.rop.cst.CstEnumRef;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.ByteArrayAnnotatedOutput;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.zip.Adler32;

/* renamed from: com.android.dx.dex.file.DexFile */
public final class DexFile {
    private final MixedItemSection byteData;
    private final MixedItemSection classData;
    private final ClassDefsSection classDefs;
    private DexOptions dexOptions;
    private int dumpWidth = 79;
    private final FieldIdsSection fieldIds;
    private int fileSize = -1;
    private final HeaderSection header;
    private final MixedItemSection map;
    private final MethodIdsSection methodIds;
    private final ProtoIdsSection protoIds;
    private final Section[] sections;
    private final MixedItemSection stringData;
    private final StringIdsSection stringIds;
    private final TypeIdsSection typeIds;
    private final MixedItemSection typeLists;
    private final MixedItemSection wordData;

    public DexFile(DexOptions dexOptions2) {
        this.dexOptions = dexOptions2;
        HeaderSection headerSection = new HeaderSection(this);
        this.header = headerSection;
        MixedItemSection.SortType sortType = MixedItemSection.SortType.NONE;
        MixedItemSection mixedItemSection = new MixedItemSection((String) null, this, 4, sortType);
        this.typeLists = mixedItemSection;
        MixedItemSection.SortType sortType2 = MixedItemSection.SortType.TYPE;
        MixedItemSection mixedItemSection2 = new MixedItemSection("word_data", this, 4, sortType2);
        this.wordData = mixedItemSection2;
        MixedItemSection mixedItemSection3 = new MixedItemSection("string_data", this, 1, MixedItemSection.SortType.INSTANCE);
        this.stringData = mixedItemSection3;
        MixedItemSection mixedItemSection4 = new MixedItemSection((String) null, this, 1, sortType);
        this.classData = mixedItemSection4;
        MixedItemSection mixedItemSection5 = new MixedItemSection("byte_data", this, 1, sortType2);
        this.byteData = mixedItemSection5;
        StringIdsSection stringIdsSection = new StringIdsSection(this);
        this.stringIds = stringIdsSection;
        TypeIdsSection typeIdsSection = new TypeIdsSection(this);
        this.typeIds = typeIdsSection;
        ProtoIdsSection protoIdsSection = new ProtoIdsSection(this);
        this.protoIds = protoIdsSection;
        FieldIdsSection fieldIdsSection = new FieldIdsSection(this);
        this.fieldIds = fieldIdsSection;
        MethodIdsSection methodIdsSection = new MethodIdsSection(this);
        this.methodIds = methodIdsSection;
        ClassDefsSection classDefsSection = new ClassDefsSection(this);
        this.classDefs = classDefsSection;
        MixedItemSection mixedItemSection6 = new MixedItemSection("map", this, 4, sortType);
        this.map = mixedItemSection6;
        this.sections = new Section[]{headerSection, stringIdsSection, typeIdsSection, protoIdsSection, fieldIdsSection, methodIdsSection, classDefsSection, mixedItemSection2, mixedItemSection, mixedItemSection3, mixedItemSection5, mixedItemSection4, mixedItemSection6};
    }

    private static void calcChecksum(byte[] bArr) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, 12, bArr.length - 12);
        int value = (int) adler32.getValue();
        bArr[8] = (byte) value;
        bArr[9] = (byte) (value >> 8);
        bArr[10] = (byte) (value >> 16);
        bArr[11] = (byte) (value >> 24);
    }

    private static void calcSignature(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA1);
            instance.update(bArr, 32, bArr.length - 32);
            try {
                int digest = instance.digest(bArr, 12, 20);
                if (digest != 20) {
                    throw new RuntimeException("unexpected digest write: " + digest + " bytes");
                }
            } catch (DigestException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    private ByteArrayAnnotatedOutput toDex0(boolean z, boolean z2) {
        ExceptionWithContext exceptionWithContext;
        this.classDefs.prepare();
        this.classData.prepare();
        this.wordData.prepare();
        this.byteData.prepare();
        this.methodIds.prepare();
        this.fieldIds.prepare();
        this.protoIds.prepare();
        this.typeLists.prepare();
        this.typeIds.prepare();
        this.stringIds.prepare();
        this.stringData.prepare();
        this.header.prepare();
        int length = this.sections.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Section section = this.sections[i2];
            int fileOffset = section.setFileOffset(i3);
            if (fileOffset >= i3) {
                try {
                    MixedItemSection mixedItemSection = this.map;
                    if (section == mixedItemSection) {
                        MapItem.addMap(this.sections, mixedItemSection);
                        this.map.prepare();
                    }
                    if (section instanceof MixedItemSection) {
                        ((MixedItemSection) section).placeItems();
                    }
                    i3 = section.writeSize() + fileOffset;
                    i2++;
                } catch (RuntimeException e) {
                    throw ExceptionWithContext.withContext(e, "...while writing section " + i2);
                }
            } else {
                throw new RuntimeException("bogus placement for section " + i2);
            }
        }
        this.fileSize = i3;
        byte[] bArr = new byte[i3];
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(bArr);
        if (z) {
            byteArrayAnnotatedOutput.enableAnnotations(this.dumpWidth, z2);
        }
        while (i < length) {
            try {
                Section section2 = this.sections[i];
                int fileOffset2 = section2.getFileOffset() - byteArrayAnnotatedOutput.getCursor();
                if (fileOffset2 >= 0) {
                    byteArrayAnnotatedOutput.writeZeroes(section2.getFileOffset() - byteArrayAnnotatedOutput.getCursor());
                    section2.writeTo(byteArrayAnnotatedOutput);
                    i++;
                } else {
                    throw new ExceptionWithContext("excess write of " + (-fileOffset2));
                }
            } catch (RuntimeException e2) {
                if (e2 instanceof ExceptionWithContext) {
                    exceptionWithContext = (ExceptionWithContext) e2;
                } else {
                    exceptionWithContext = new ExceptionWithContext((Throwable) e2);
                }
                exceptionWithContext.addContext("...while writing section " + i);
                throw exceptionWithContext;
            }
        }
        if (byteArrayAnnotatedOutput.getCursor() == this.fileSize) {
            calcSignature(bArr);
            calcChecksum(bArr);
            if (z) {
                this.wordData.writeIndexAnnotation(byteArrayAnnotatedOutput, ItemType.TYPE_CODE_ITEM, "\nmethod code index:\n\n");
                getStatistics().writeAnnotation(byteArrayAnnotatedOutput);
                byteArrayAnnotatedOutput.finishAnnotating();
            }
            return byteArrayAnnotatedOutput;
        }
        throw new RuntimeException("foreshortened write");
    }

    public void add(ClassDefItem classDefItem) {
        this.classDefs.add(classDefItem);
    }

    /* access modifiers changed from: package-private */
    public IndexedItem findItemOrNull(Constant constant) {
        if (constant instanceof CstString) {
            return this.stringIds.get(constant);
        }
        if (constant instanceof CstType) {
            return this.typeIds.get(constant);
        }
        if (constant instanceof CstBaseMethodRef) {
            return this.methodIds.get(constant);
        }
        if (constant instanceof CstFieldRef) {
            return this.fieldIds.get(constant);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public MixedItemSection getByteData() {
        return this.byteData;
    }

    /* access modifiers changed from: package-private */
    public MixedItemSection getClassData() {
        return this.classData;
    }

    public ClassDefsSection getClassDefs() {
        return this.classDefs;
    }

    public ClassDefItem getClassOrNull(String str) {
        try {
            return (ClassDefItem) this.classDefs.get(new CstType(Type.internClassName(str)));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public DexOptions getDexOptions() {
        return this.dexOptions;
    }

    public FieldIdsSection getFieldIds() {
        return this.fieldIds;
    }

    public int getFileSize() {
        int i = this.fileSize;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("file size not yet known");
    }

    /* access modifiers changed from: package-private */
    public Section getFirstDataSection() {
        return this.wordData;
    }

    /* access modifiers changed from: package-private */
    public Section getLastDataSection() {
        return this.map;
    }

    /* access modifiers changed from: package-private */
    public MixedItemSection getMap() {
        return this.map;
    }

    public MethodIdsSection getMethodIds() {
        return this.methodIds;
    }

    /* access modifiers changed from: package-private */
    public ProtoIdsSection getProtoIds() {
        return this.protoIds;
    }

    public Statistics getStatistics() {
        Statistics statistics = new Statistics();
        for (Section addAll : this.sections) {
            statistics.addAll(addAll);
        }
        return statistics;
    }

    /* access modifiers changed from: package-private */
    public MixedItemSection getStringData() {
        return this.stringData;
    }

    /* access modifiers changed from: package-private */
    public StringIdsSection getStringIds() {
        return this.stringIds;
    }

    public TypeIdsSection getTypeIds() {
        return this.typeIds;
    }

    /* access modifiers changed from: package-private */
    public MixedItemSection getTypeLists() {
        return this.typeLists;
    }

    /* access modifiers changed from: package-private */
    public MixedItemSection getWordData() {
        return this.wordData;
    }

    /* access modifiers changed from: package-private */
    public void internIfAppropriate(Constant constant) {
        if (constant instanceof CstString) {
            this.stringIds.intern((CstString) constant);
        } else if (constant instanceof CstType) {
            this.typeIds.intern((CstType) constant);
        } else if (constant instanceof CstBaseMethodRef) {
            this.methodIds.intern((CstBaseMethodRef) constant);
        } else if (constant instanceof CstFieldRef) {
            this.fieldIds.intern((CstFieldRef) constant);
        } else if (constant instanceof CstEnumRef) {
            this.fieldIds.intern(((CstEnumRef) constant).getFieldRef());
        } else {
            Objects.requireNonNull(constant, "cst == null");
        }
    }

    public boolean isEmpty() {
        return this.classDefs.items().isEmpty();
    }

    public void setDumpWidth(int i) {
        if (i >= 40) {
            this.dumpWidth = i;
            return;
        }
        throw new IllegalArgumentException("dumpWidth < 40");
    }

    public byte[] toDex(Writer writer, boolean z) throws IOException {
        boolean z2 = writer != null;
        ByteArrayAnnotatedOutput dex0 = toDex0(z2, z);
        if (z2) {
            dex0.writeAnnotationsTo(writer);
        }
        return dex0.getArray();
    }

    public void writeTo(OutputStream outputStream, Writer writer, boolean z) throws IOException {
        boolean z2 = writer != null;
        ByteArrayAnnotatedOutput dex0 = toDex0(z2, z);
        if (outputStream != null) {
            outputStream.write(dex0.getArray());
        }
        if (z2) {
            dex0.writeAnnotationsTo(writer);
        }
    }
}
