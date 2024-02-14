package com.android.multidex;

import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.iface.FieldList;
import com.android.p023dx.p024cf.iface.MethodList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstBaseMethodRef;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.TypeList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ClassReferenceListBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String CLASS_EXTENSION = ".class";
    private final Set<String> classNames = new HashSet();
    private final Path path;

    public ClassReferenceListBuilder(Path path2) {
        this.path = path2;
    }

    private void addClassWithHierachy(String str) {
        if (!this.classNames.contains(str)) {
            try {
                Path path2 = this.path;
                DirectClassFile directClassFile = path2.getClass(str + CLASS_EXTENSION);
                this.classNames.add(str);
                CstType superclass = directClassFile.getSuperclass();
                if (superclass != null) {
                    addClassWithHierachy(superclass.getClassType().getClassName());
                }
                TypeList interfaces = directClassFile.getInterfaces();
                int size = interfaces.size();
                for (int i = 0; i < size; i++) {
                    addClassWithHierachy(interfaces.getType(i).getClassName());
                }
            } catch (FileNotFoundException unused) {
            }
        }
    }

    private void addDependencies(DirectClassFile directClassFile) {
        for (Constant constant : directClassFile.getConstantPool().getEntries()) {
            if (constant instanceof CstType) {
                checkDescriptor(((CstType) constant).getClassType().getDescriptor());
            } else if (constant instanceof CstFieldRef) {
                checkDescriptor(((CstFieldRef) constant).getType().getDescriptor());
            } else if (constant instanceof CstBaseMethodRef) {
                checkPrototype(((CstBaseMethodRef) constant).getPrototype());
            }
        }
        FieldList fields = directClassFile.getFields();
        int size = fields.size();
        for (int i = 0; i < size; i++) {
            checkDescriptor(fields.get(i).getDescriptor().getString());
        }
        MethodList methods = directClassFile.getMethods();
        int size2 = methods.size();
        for (int i2 = 0; i2 < size2; i2++) {
            checkPrototype(Prototype.intern(methods.get(i2).getDescriptor().getString()));
        }
    }

    private void checkDescriptor(String str) {
        if (str.endsWith(";")) {
            int lastIndexOf = str.lastIndexOf(91);
            if (lastIndexOf < 0) {
                addClassWithHierachy(str.substring(1, str.length() - 1));
            } else {
                addClassWithHierachy(str.substring(lastIndexOf + 2, str.length() - 1));
            }
        }
    }

    private void checkPrototype(Prototype prototype) {
        checkDescriptor(prototype.getReturnType().getDescriptor());
        StdTypeList parameterTypes = prototype.getParameterTypes();
        for (int i = 0; i < parameterTypes.size(); i++) {
            checkDescriptor(parameterTypes.get(i).getDescriptor());
        }
    }

    @Deprecated
    public static void main(String[] strArr) {
        MainDexListBuilder.main(strArr);
    }

    public void addRoots(ZipFile zipFile) throws IOException {
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            String name = ((ZipEntry) entries.nextElement()).getName();
            if (name.endsWith(CLASS_EXTENSION)) {
                this.classNames.add(name.substring(0, name.length() - 6));
            }
        }
        Enumeration<? extends ZipEntry> entries2 = zipFile.entries();
        while (entries2.hasMoreElements()) {
            String name2 = ((ZipEntry) entries2.nextElement()).getName();
            if (name2.endsWith(CLASS_EXTENSION)) {
                try {
                    addDependencies(this.path.getClass(name2));
                } catch (FileNotFoundException e) {
                    throw new IOException("Class " + name2 + " is missing form original class path " + this.path, e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Set<String> getClassNames() {
        return this.classNames;
    }
}
