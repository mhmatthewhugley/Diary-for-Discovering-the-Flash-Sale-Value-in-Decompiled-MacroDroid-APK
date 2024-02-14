package com.android.p023dx;

import com.android.dex.DexFormat;
import com.android.p023dx.dex.DexOptions;
import com.android.p023dx.dex.code.RopTranslator;
import com.android.p023dx.dex.file.ClassDefItem;
import com.android.p023dx.dex.file.DexFile;
import com.android.p023dx.dex.file.EncodedField;
import com.android.p023dx.dex.file.EncodedMethod;
import com.android.p023dx.rop.code.LocalVariableInfo;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.StdTypeList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

/* renamed from: com.android.dx.DexMaker */
public final class DexMaker {
    private DexFile outputDex;
    private ClassLoader sharedClassLoader;
    private final Map<TypeId<?>, TypeDeclaration> types = new LinkedHashMap();

    /* renamed from: com.android.dx.DexMaker$FieldDeclaration */
    static class FieldDeclaration {
        private final int accessFlags;
        final FieldId<?, ?> fieldId;
        /* access modifiers changed from: private */
        public final Object staticValue;

        FieldDeclaration(FieldId<?, ?> fieldId2, int i, Object obj) {
            if ((i & 8) != 0 || obj == null) {
                this.fieldId = fieldId2;
                this.accessFlags = i;
                this.staticValue = obj;
                return;
            }
            throw new IllegalArgumentException("instance fields may not have a value");
        }

        public boolean isStatic() {
            return (this.accessFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public EncodedField toEncodedField() {
            return new EncodedField(this.fieldId.constant, this.accessFlags);
        }
    }

    /* renamed from: com.android.dx.DexMaker$MethodDeclaration */
    static class MethodDeclaration {
        /* access modifiers changed from: private */
        public final Code code = new Code(this);
        private final int flags;
        final MethodId<?, ?> method;

        public MethodDeclaration(MethodId<?, ?> methodId, int i) {
            this.method = methodId;
            this.flags = i;
        }

        /* access modifiers changed from: package-private */
        public boolean isDirect() {
            return (this.flags & 65546) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isStatic() {
            return (this.flags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public EncodedMethod toEncodedMethod(DexOptions dexOptions) {
            return new EncodedMethod(this.method.constant, this.flags, RopTranslator.translate(new RopMethod(this.code.toBasicBlocks(), 0), 1, (LocalVariableInfo) null, this.code.paramSize(), dexOptions), StdTypeList.EMPTY);
        }
    }

    /* renamed from: com.android.dx.DexMaker$TypeDeclaration */
    static class TypeDeclaration {
        private ClassDefItem classDefItem;
        /* access modifiers changed from: private */
        public boolean declared;
        /* access modifiers changed from: private */
        public final Map<FieldId, FieldDeclaration> fields = new LinkedHashMap();
        /* access modifiers changed from: private */
        public int flags;
        /* access modifiers changed from: private */
        public TypeList interfaces;
        /* access modifiers changed from: private */
        public final Map<MethodId, MethodDeclaration> methods = new LinkedHashMap();
        /* access modifiers changed from: private */
        public String sourceFile;
        /* access modifiers changed from: private */
        public TypeId<?> supertype;
        private final TypeId<?> type;

        TypeDeclaration(TypeId<?> typeId) {
            this.type = typeId;
        }

        /* access modifiers changed from: package-private */
        public ClassDefItem toClassDefItem() {
            if (this.declared) {
                DexOptions dexOptions = new DexOptions();
                dexOptions.targetApiLevel = 13;
                CstType cstType = this.type.constant;
                if (this.classDefItem == null) {
                    this.classDefItem = new ClassDefItem(cstType, this.flags, this.supertype.constant, this.interfaces.ropTypes, new CstString(this.sourceFile));
                    for (MethodDeclaration next : this.methods.values()) {
                        EncodedMethod encodedMethod = next.toEncodedMethod(dexOptions);
                        if (next.isDirect()) {
                            this.classDefItem.addDirectMethod(encodedMethod);
                        } else {
                            this.classDefItem.addVirtualMethod(encodedMethod);
                        }
                    }
                    for (FieldDeclaration next2 : this.fields.values()) {
                        EncodedField encodedField = next2.toEncodedField();
                        if (next2.isStatic()) {
                            this.classDefItem.addStaticField(encodedField, Constants.getConstant(next2.staticValue));
                        } else {
                            this.classDefItem.addInstanceField(encodedField);
                        }
                    }
                }
                return this.classDefItem;
            }
            throw new IllegalStateException("Undeclared type " + this.type + " declares members: " + this.fields.keySet() + " " + this.methods.keySet());
        }
    }

    private ClassLoader generateClassLoader(File file, File file2, ClassLoader classLoader) {
        Class<String> cls = String.class;
        try {
            ClassLoader classLoader2 = this.sharedClassLoader;
            if (classLoader2 != null) {
                if (classLoader == null) {
                    classLoader = classLoader2;
                }
                classLoader.getClass().getMethod("addDexPath", new Class[]{cls}).invoke(classLoader, new Object[]{file.getPath()});
                return classLoader;
            }
            return (ClassLoader) Class.forName("dalvik.system.DexClassLoader").getConstructor(new Class[]{cls, cls, cls, ClassLoader.class}).newInstance(new Object[]{file.getPath(), file2.getAbsolutePath(), null, classLoader});
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("load() requires a Dalvik VM", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        } catch (InstantiationException unused) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError();
        } catch (IllegalAccessException unused3) {
            throw new AssertionError();
        }
    }

    private String generateFileName() {
        Set<TypeId<?>> keySet = this.types.keySet();
        int size = keySet.size();
        int[] iArr = new int[size];
        int i = 0;
        for (TypeId<?> typeDeclaration : keySet) {
            TypeDeclaration typeDeclaration2 = getTypeDeclaration(typeDeclaration);
            Set keySet2 = typeDeclaration2.methods.keySet();
            if (typeDeclaration2.supertype != null) {
                iArr[i] = (typeDeclaration2.supertype.hashCode() * 31) + keySet2.hashCode();
                i++;
            }
        }
        Arrays.sort(iArr);
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return "Generated_" + i2 + ".jar";
    }

    public void declare(TypeId<?> typeId, String str, int i, TypeId<?> typeId2, TypeId<?>... typeIdArr) {
        TypeDeclaration typeDeclaration = getTypeDeclaration(typeId);
        if ((i & -1042) != 0) {
            throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(i));
        } else if (!typeDeclaration.declared) {
            boolean unused = typeDeclaration.declared = true;
            int unused2 = typeDeclaration.flags = i;
            TypeId unused3 = typeDeclaration.supertype = typeId2;
            String unused4 = typeDeclaration.sourceFile = str;
            TypeList unused5 = typeDeclaration.interfaces = new TypeList(typeIdArr);
        } else {
            throw new IllegalStateException("already declared: " + typeId);
        }
    }

    public byte[] generate() {
        if (this.outputDex == null) {
            DexOptions dexOptions = new DexOptions();
            dexOptions.targetApiLevel = 13;
            this.outputDex = new DexFile(dexOptions);
        }
        for (TypeDeclaration classDefItem : this.types.values()) {
            this.outputDex.add(classDefItem.toClassDefItem());
        }
        try {
            return this.outputDex.toDex((Writer) null, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClassLoader generateAndLoad(ClassLoader classLoader, File file) throws IOException {
        if (file == null) {
            String property = System.getProperty("dexmaker.dexcache");
            if (property != null) {
                file = new File(property);
            } else {
                file = new AppDataDirGuesser().guess();
                if (file == null) {
                    throw new IllegalArgumentException("dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)");
                }
            }
        }
        File file2 = new File(file, generateFileName());
        if (file2.exists()) {
            return generateClassLoader(file2, file, classLoader);
        }
        byte[] generate = generate();
        file2.createNewFile();
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(file2));
        JarEntry jarEntry = new JarEntry(DexFormat.DEX_IN_JAR_NAME);
        jarEntry.setSize((long) generate.length);
        jarOutputStream.putNextEntry(jarEntry);
        jarOutputStream.write(generate);
        jarOutputStream.closeEntry();
        jarOutputStream.close();
        return generateClassLoader(file2, file, classLoader);
    }

    /* access modifiers changed from: package-private */
    public DexFile getDexFile() {
        if (this.outputDex == null) {
            DexOptions dexOptions = new DexOptions();
            dexOptions.targetApiLevel = 13;
            this.outputDex = new DexFile(dexOptions);
        }
        return this.outputDex;
    }

    /* access modifiers changed from: package-private */
    public TypeDeclaration getTypeDeclaration(TypeId<?> typeId) {
        TypeDeclaration typeDeclaration = this.types.get(typeId);
        if (typeDeclaration != null) {
            return typeDeclaration;
        }
        TypeDeclaration typeDeclaration2 = new TypeDeclaration(typeId);
        this.types.put(typeId, typeDeclaration2);
        return typeDeclaration2;
    }

    public void setSharedClassLoader(ClassLoader classLoader) {
        this.sharedClassLoader = classLoader;
    }

    public Code declare(MethodId<?, ?> methodId, int i) {
        TypeDeclaration typeDeclaration = getTypeDeclaration(methodId.declaringType);
        if (typeDeclaration.methods.containsKey(methodId)) {
            throw new IllegalStateException("already declared: " + methodId);
        } else if ((i & -64) == 0) {
            if ((i & 32) != 0) {
                i = (i & -33) | 131072;
            }
            if (methodId.isConstructor() || methodId.isStaticInitializer()) {
                i |= 65536;
            }
            MethodDeclaration methodDeclaration = new MethodDeclaration(methodId, i);
            typeDeclaration.methods.put(methodId, methodDeclaration);
            return methodDeclaration.code;
        } else {
            throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(i));
        }
    }

    public void declare(FieldId<?, ?> fieldId, int i, Object obj) {
        TypeDeclaration typeDeclaration = getTypeDeclaration(fieldId.declaringType);
        if (typeDeclaration.fields.containsKey(fieldId)) {
            throw new IllegalStateException("already declared: " + fieldId);
        } else if ((i & -224) != 0) {
            throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(i));
        } else if ((i & 8) != 0 || obj == null) {
            typeDeclaration.fields.put(fieldId, new FieldDeclaration(fieldId, i, obj));
        } else {
            throw new IllegalArgumentException("staticValue is non-null, but field is not static");
        }
    }
}
