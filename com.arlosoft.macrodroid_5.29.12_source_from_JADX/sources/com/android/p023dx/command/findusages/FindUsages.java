package com.android.p023dx.command.findusages;

import com.android.dex.ClassData;
import com.android.dex.ClassDef;
import com.android.dex.Dex;
import com.android.dex.FieldId;
import com.android.dex.MethodId;
import com.android.p023dx.p026io.CodeReader;
import com.android.p023dx.p026io.OpcodeInfo;
import com.android.p023dx.p026io.instructions.DecodedInstruction;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.android.dx.command.findusages.FindUsages */
public final class FindUsages {
    private final CodeReader codeReader = new CodeReader();
    private ClassDef currentClass;
    private ClassData.Method currentMethod;
    private final Dex dex;
    /* access modifiers changed from: private */
    public final Set<Integer> fieldIds;
    /* access modifiers changed from: private */
    public final Set<Integer> methodIds;
    private final PrintWriter out;

    public FindUsages(final Dex dex2, String str, String str2, final PrintWriter printWriter) {
        this.dex = dex2;
        this.out = printWriter;
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        Pattern compile = Pattern.compile(str);
        Pattern compile2 = Pattern.compile(str2);
        List<String> strings = dex2.strings();
        for (int i = 0; i < strings.size(); i++) {
            String str3 = strings.get(i);
            if (compile.matcher(str3).matches()) {
                hashSet.add(Integer.valueOf(i));
            }
            if (compile2.matcher(str3).matches()) {
                hashSet2.add(Integer.valueOf(i));
            }
        }
        if (hashSet.isEmpty() || hashSet2.isEmpty()) {
            this.fieldIds = null;
            this.methodIds = null;
            return;
        }
        this.methodIds = new HashSet();
        this.fieldIds = new HashSet();
        for (Integer intValue : hashSet) {
            int binarySearch = Collections.binarySearch(dex2.typeIds(), Integer.valueOf(intValue.intValue()));
            if (binarySearch >= 0) {
                this.methodIds.addAll(getMethodIds(dex2, hashSet2, binarySearch));
                this.fieldIds.addAll(getFieldIds(dex2, hashSet2, binarySearch));
            }
        }
        this.codeReader.setFieldVisitor(new CodeReader.Visitor() {
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                int index = decodedInstruction.getIndex();
                if (FindUsages.this.fieldIds.contains(Integer.valueOf(index))) {
                    PrintWriter printWriter = printWriter;
                    printWriter.println(FindUsages.this.location() + ": field reference " + dex2.fieldIds().get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
                }
            }
        });
        this.codeReader.setMethodVisitor(new CodeReader.Visitor() {
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                int index = decodedInstruction.getIndex();
                if (FindUsages.this.methodIds.contains(Integer.valueOf(index))) {
                    PrintWriter printWriter = printWriter;
                    printWriter.println(FindUsages.this.location() + ": method reference " + dex2.methodIds().get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
                }
            }
        });
    }

    private Set<Integer> findAssignableTypes(Dex dex2, int i) {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i));
        for (ClassDef next : dex2.classDefs()) {
            if (hashSet.contains(Integer.valueOf(next.getSupertypeIndex()))) {
                hashSet.add(Integer.valueOf(next.getTypeIndex()));
            } else {
                short[] interfaces = next.getInterfaces();
                int length = interfaces.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (hashSet.contains(Integer.valueOf(interfaces[i2]))) {
                        hashSet.add(Integer.valueOf(next.getTypeIndex()));
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return hashSet;
    }

    private Set<Integer> getFieldIds(Dex dex2, Set<Integer> set, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (FieldId next : dex2.fieldIds()) {
            if (set.contains(Integer.valueOf(next.getNameIndex())) && i == next.getDeclaringClassIndex()) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    private Set<Integer> getMethodIds(Dex dex2, Set<Integer> set, int i) {
        Set<Integer> findAssignableTypes = findAssignableTypes(dex2, i);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (MethodId next : dex2.methodIds()) {
            if (set.contains(Integer.valueOf(next.getNameIndex())) && findAssignableTypes.contains(Integer.valueOf(next.getDeclaringClassIndex()))) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    public String location() {
        String str = this.dex.typeNames().get(this.currentClass.getTypeIndex());
        if (this.currentMethod == null) {
            return str;
        }
        return str + "." + this.dex.strings().get(this.dex.methodIds().get(this.currentMethod.getMethodIndex()).getNameIndex());
    }

    public void findUsages() {
        if (this.fieldIds != null && this.methodIds != null) {
            for (ClassDef next : this.dex.classDefs()) {
                this.currentClass = next;
                this.currentMethod = null;
                if (next.getClassDataOffset() != 0) {
                    ClassData readClassData = this.dex.readClassData(next);
                    for (ClassData.Field fieldIndex : readClassData.allFields()) {
                        int fieldIndex2 = fieldIndex.getFieldIndex();
                        if (this.fieldIds.contains(Integer.valueOf(fieldIndex2))) {
                            this.out.println(location() + " field declared " + this.dex.fieldIds().get(fieldIndex2));
                        }
                    }
                    for (ClassData.Method method : readClassData.allMethods()) {
                        this.currentMethod = method;
                        int methodIndex = method.getMethodIndex();
                        if (this.methodIds.contains(Integer.valueOf(methodIndex))) {
                            this.out.println(location() + " method declared " + this.dex.methodIds().get(methodIndex));
                        }
                        if (method.getCodeOffset() != 0) {
                            this.codeReader.visitAll(this.dex.readCode(method).getInstructions());
                        }
                    }
                }
            }
            this.currentClass = null;
            this.currentMethod = null;
        }
    }
}
