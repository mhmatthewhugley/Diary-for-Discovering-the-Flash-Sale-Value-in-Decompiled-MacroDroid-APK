package com.android.p023dx.dex.p025cf;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.dex.DexOptions;
import com.android.p023dx.dex.code.DalvCode;
import com.android.p023dx.dex.code.RopTranslator;
import com.android.p023dx.dex.file.ClassDefItem;
import com.android.p023dx.dex.file.DexFile;
import com.android.p023dx.dex.file.EncodedField;
import com.android.p023dx.dex.file.FieldIdsSection;
import com.android.p023dx.dex.file.MethodIdsSection;
import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.iface.Field;
import com.android.p023dx.p024cf.iface.FieldList;
import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.code.LocalVariableInfo;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.ConstantPool;
import com.android.p023dx.rop.cst.CstBaseMethodRef;
import com.android.p023dx.rop.cst.CstBoolean;
import com.android.p023dx.rop.cst.CstByte;
import com.android.p023dx.rop.cst.CstChar;
import com.android.p023dx.rop.cst.CstEnumRef;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstInterfaceMethodRef;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstShort;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.cst.TypedConstant;
import com.android.p023dx.rop.type.Type;

/* renamed from: com.android.dx.dex.cf.CfTranslator */
public class CfTranslator {
    private static final boolean DEBUG = false;

    private CfTranslator() {
    }

    private static TypedConstant coerceConstant(TypedConstant typedConstant, Type type) {
        if (typedConstant.getType().equals(type)) {
            return typedConstant;
        }
        int basicType = type.getBasicType();
        if (basicType == 1) {
            return CstBoolean.make(((CstInteger) typedConstant).getValue());
        }
        if (basicType == 2) {
            return CstByte.make(((CstInteger) typedConstant).getValue());
        }
        if (basicType == 3) {
            return CstChar.make(((CstInteger) typedConstant).getValue());
        }
        if (basicType == 8) {
            return CstShort.make(((CstInteger) typedConstant).getValue());
        }
        throw new UnsupportedOperationException("can't coerce " + typedConstant + " to " + type);
    }

    private static void processFields(DirectClassFile directClassFile, ClassDefItem classDefItem, DexFile dexFile) {
        CstType thisClass = directClassFile.getThisClass();
        FieldList fields = directClassFile.getFields();
        int size = fields.size();
        int i = 0;
        while (i < size) {
            Field field = fields.get(i);
            try {
                CstFieldRef cstFieldRef = new CstFieldRef(thisClass, field.getNat());
                int accessFlags = field.getAccessFlags();
                if (AccessFlags.isStatic(accessFlags)) {
                    TypedConstant constantValue = field.getConstantValue();
                    EncodedField encodedField = new EncodedField(cstFieldRef, accessFlags);
                    if (constantValue != null) {
                        constantValue = coerceConstant(constantValue, cstFieldRef.getType());
                    }
                    classDefItem.addStaticField(encodedField, constantValue);
                } else {
                    classDefItem.addInstanceField(new EncodedField(cstFieldRef, accessFlags));
                }
                Annotations annotations = AttributeTranslator.getAnnotations(field.getAttributes());
                if (annotations.size() != 0) {
                    classDefItem.addFieldAnnotations(cstFieldRef, annotations, dexFile);
                }
                dexFile.getFieldIds().intern(cstFieldRef);
                i++;
            } catch (RuntimeException e) {
                throw ExceptionWithContext.withContext(e, "...while processing " + field.getName().toHuman() + " " + field.getDescriptor().toHuman());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b A[Catch:{ RuntimeException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec A[Catch:{ RuntimeException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f6 A[Catch:{ RuntimeException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115 A[Catch:{ RuntimeException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0116 A[Catch:{ RuntimeException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127 A[Catch:{ RuntimeException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134 A[Catch:{ RuntimeException -> 0x0144 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void processMethods(com.android.p023dx.p024cf.direct.DirectClassFile r24, com.android.p023dx.dex.p025cf.CfOptions r25, com.android.p023dx.dex.DexOptions r26, com.android.p023dx.dex.file.ClassDefItem r27, com.android.p023dx.dex.file.DexFile r28) {
        /*
            r0 = r25
            r8 = r27
            r9 = r28
            com.android.dx.rop.cst.CstType r10 = r24.getThisClass()
            com.android.dx.cf.iface.MethodList r11 = r24.getMethods()
            int r12 = r11.size()
            r14 = 0
        L_0x0013:
            if (r14 >= r12) goto L_0x0173
            com.android.dx.cf.iface.Method r15 = r11.get(r14)
            com.android.dx.rop.cst.CstMethodRef r7 = new com.android.dx.rop.cst.CstMethodRef     // Catch:{ RuntimeException -> 0x0144 }
            com.android.dx.rop.cst.CstNat r1 = r15.getNat()     // Catch:{ RuntimeException -> 0x0144 }
            r7.<init>(r10, r1)     // Catch:{ RuntimeException -> 0x0144 }
            int r16 = r15.getAccessFlags()     // Catch:{ RuntimeException -> 0x0144 }
            boolean r6 = com.android.p023dx.rop.code.AccessFlags.isStatic(r16)     // Catch:{ RuntimeException -> 0x0144 }
            boolean r17 = com.android.p023dx.rop.code.AccessFlags.isPrivate(r16)     // Catch:{ RuntimeException -> 0x0144 }
            boolean r18 = com.android.p023dx.rop.code.AccessFlags.isNative(r16)     // Catch:{ RuntimeException -> 0x0144 }
            boolean r1 = com.android.p023dx.rop.code.AccessFlags.isAbstract(r16)     // Catch:{ RuntimeException -> 0x0144 }
            boolean r2 = r7.isInstanceInit()     // Catch:{ RuntimeException -> 0x0144 }
            r3 = 1
            if (r2 != 0) goto L_0x0047
            boolean r2 = r7.isClassInit()     // Catch:{ RuntimeException -> 0x0144 }
            if (r2 == 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r19 = 0
            goto L_0x0049
        L_0x0047:
            r19 = 1
        L_0x0049:
            if (r18 != 0) goto L_0x00de
            if (r1 == 0) goto L_0x004f
            goto L_0x00de
        L_0x004f:
            com.android.dx.cf.code.ConcreteMethod r1 = new com.android.dx.cf.code.ConcreteMethod     // Catch:{ RuntimeException -> 0x0144 }
            int r4 = r0.positionInfo     // Catch:{ RuntimeException -> 0x0144 }
            if (r4 == r3) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            boolean r4 = r0.localInfo     // Catch:{ RuntimeException -> 0x0144 }
            r5 = r24
            r1.<init>(r15, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0144 }
            com.android.dx.rop.code.DexTranslationAdvice r3 = com.android.p023dx.rop.code.DexTranslationAdvice.THE_ONE     // Catch:{ RuntimeException -> 0x0144 }
            com.android.dx.rop.code.RopMethod r4 = com.android.p023dx.p024cf.code.Ropper.convert(r1, r3, r11)     // Catch:{ RuntimeException -> 0x0144 }
            int r13 = r7.getParameterWordCount(r6)     // Catch:{ RuntimeException -> 0x0144 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0144 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0144 }
            com.android.dx.rop.type.Type r21 = r10.getClassType()     // Catch:{ RuntimeException -> 0x0144 }
            java.lang.String r5 = r21.getDescriptor()     // Catch:{ RuntimeException -> 0x0144 }
            r2.append(r5)     // Catch:{ RuntimeException -> 0x0144 }
            java.lang.String r5 = "."
            r2.append(r5)     // Catch:{ RuntimeException -> 0x0144 }
            com.android.dx.rop.cst.CstString r5 = r15.getName()     // Catch:{ RuntimeException -> 0x0144 }
            java.lang.String r5 = r5.getString()     // Catch:{ RuntimeException -> 0x0144 }
            r2.append(r5)     // Catch:{ RuntimeException -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ RuntimeException -> 0x0144 }
            boolean r5 = r0.optimize     // Catch:{ RuntimeException -> 0x0144 }
            if (r5 == 0) goto L_0x00a5
            boolean r2 = com.android.p023dx.dex.p025cf.OptimizerOptions.shouldOptimize(r2)     // Catch:{ RuntimeException -> 0x0144 }
            if (r2 == 0) goto L_0x00a5
            boolean r2 = r0.localInfo     // Catch:{ RuntimeException -> 0x0144 }
            com.android.dx.rop.code.RopMethod r2 = com.android.p023dx.ssa.Optimizer.optimize(r4, r13, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0144 }
            boolean r3 = r0.statistics     // Catch:{ RuntimeException -> 0x0144 }
            if (r3 == 0) goto L_0x00a3
            com.android.p023dx.dex.p025cf.CodeStatistics.updateRopStatistics(r4, r2)     // Catch:{ RuntimeException -> 0x0144 }
        L_0x00a3:
            r3 = r2
            goto L_0x00a7
        L_0x00a5:
            r3 = r4
            r4 = 0
        L_0x00a7:
            boolean r2 = r0.localInfo     // Catch:{ RuntimeException -> 0x0144 }
            if (r2 == 0) goto L_0x00b1
            com.android.dx.rop.code.LocalVariableInfo r2 = com.android.p023dx.rop.code.LocalVariableExtractor.extract(r3)     // Catch:{ RuntimeException -> 0x0144 }
            r5 = r2
            goto L_0x00b2
        L_0x00b1:
            r5 = 0
        L_0x00b2:
            int r2 = r0.positionInfo     // Catch:{ RuntimeException -> 0x0144 }
            r21 = r10
            r10 = r26
            com.android.dx.dex.code.DalvCode r20 = com.android.p023dx.dex.code.RopTranslator.translate(r3, r2, r5, r13, r10)     // Catch:{ RuntimeException -> 0x0144 }
            boolean r2 = r0.statistics     // Catch:{ RuntimeException -> 0x0144 }
            if (r2 == 0) goto L_0x00d8
            if (r4 == 0) goto L_0x00d8
            com.android.dx.cf.code.BytecodeArray r1 = r1.getCode()     // Catch:{ RuntimeException -> 0x0144 }
            int r22 = r1.size()     // Catch:{ RuntimeException -> 0x0144 }
            r1 = r25
            r2 = r26
            r23 = r6
            r6 = r13
            r13 = r7
            r7 = r22
            updateDexStatistics(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x0144 }
            goto L_0x00db
        L_0x00d8:
            r23 = r6
            r13 = r7
        L_0x00db:
            r2 = r20
            goto L_0x00e6
        L_0x00de:
            r23 = r6
            r13 = r7
            r21 = r10
            r10 = r26
            r2 = 0
        L_0x00e6:
            boolean r1 = com.android.p023dx.rop.code.AccessFlags.isSynchronized(r16)     // Catch:{ RuntimeException -> 0x0144 }
            if (r1 == 0) goto L_0x00f4
            r1 = 131072(0x20000, float:1.83671E-40)
            r16 = r16 | r1
            if (r18 != 0) goto L_0x00f4
            r16 = r16 & -33
        L_0x00f4:
            if (r19 == 0) goto L_0x00fa
            r1 = 65536(0x10000, float:9.18355E-41)
            r16 = r16 | r1
        L_0x00fa:
            r1 = r16
            com.android.dx.rop.type.TypeList r3 = com.android.p023dx.dex.p025cf.AttributeTranslator.getExceptions(r15)     // Catch:{ RuntimeException -> 0x0144 }
            com.android.dx.dex.file.EncodedMethod r4 = new com.android.dx.dex.file.EncodedMethod     // Catch:{ RuntimeException -> 0x0144 }
            r4.<init>(r13, r1, r2, r3)     // Catch:{ RuntimeException -> 0x0144 }
            boolean r1 = r13.isInstanceInit()     // Catch:{ RuntimeException -> 0x0144 }
            if (r1 != 0) goto L_0x011a
            boolean r1 = r13.isClassInit()     // Catch:{ RuntimeException -> 0x0144 }
            if (r1 != 0) goto L_0x011a
            if (r23 != 0) goto L_0x011a
            if (r17 == 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            r8.addVirtualMethod(r4)     // Catch:{ RuntimeException -> 0x0144 }
            goto L_0x011d
        L_0x011a:
            r8.addDirectMethod(r4)     // Catch:{ RuntimeException -> 0x0144 }
        L_0x011d:
            com.android.dx.rop.annotation.Annotations r1 = com.android.p023dx.dex.p025cf.AttributeTranslator.getMethodAnnotations(r15)     // Catch:{ RuntimeException -> 0x0144 }
            int r2 = r1.size()     // Catch:{ RuntimeException -> 0x0144 }
            if (r2 == 0) goto L_0x012a
            r8.addMethodAnnotations(r13, r1, r9)     // Catch:{ RuntimeException -> 0x0144 }
        L_0x012a:
            com.android.dx.rop.annotation.AnnotationsList r1 = com.android.p023dx.dex.p025cf.AttributeTranslator.getParameterAnnotations(r15)     // Catch:{ RuntimeException -> 0x0144 }
            int r2 = r1.size()     // Catch:{ RuntimeException -> 0x0144 }
            if (r2 == 0) goto L_0x0137
            r8.addParameterAnnotations(r13, r1, r9)     // Catch:{ RuntimeException -> 0x0144 }
        L_0x0137:
            com.android.dx.dex.file.MethodIdsSection r1 = r28.getMethodIds()     // Catch:{ RuntimeException -> 0x0144 }
            r1.intern(r13)     // Catch:{ RuntimeException -> 0x0144 }
            int r14 = r14 + 1
            r10 = r21
            goto L_0x0013
        L_0x0144:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "...while processing "
            r1.append(r2)
            com.android.dx.rop.cst.CstString r2 = r15.getName()
            java.lang.String r2 = r2.toHuman()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            com.android.dx.rop.cst.CstString r2 = r15.getDescriptor()
            java.lang.String r2 = r2.toHuman()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.android.dex.util.ExceptionWithContext r0 = com.android.dex.util.ExceptionWithContext.withContext(r0, r1)
            throw r0
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.dex.p025cf.CfTranslator.processMethods(com.android.dx.cf.direct.DirectClassFile, com.android.dx.dex.cf.CfOptions, com.android.dx.dex.DexOptions, com.android.dx.dex.file.ClassDefItem, com.android.dx.dex.file.DexFile):void");
    }

    public static ClassDefItem translate(DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile) {
        try {
            return translate0(directClassFile, bArr, cfOptions, dexOptions, dexFile);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, "...while processing " + directClassFile.getFilePath());
        }
    }

    private static ClassDefItem translate0(DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile) {
        CstString cstString;
        OptimizerOptions.loadOptimizeLists(cfOptions.optimizeListFile, cfOptions.dontOptimizeListFile);
        CstType thisClass = directClassFile.getThisClass();
        int accessFlags = directClassFile.getAccessFlags() & -33;
        if (cfOptions.positionInfo == 1) {
            cstString = null;
        } else {
            cstString = directClassFile.getSourceFile();
        }
        ClassDefItem classDefItem = new ClassDefItem(thisClass, accessFlags, directClassFile.getSuperclass(), directClassFile.getInterfaces(), cstString);
        Annotations classAnnotations = AttributeTranslator.getClassAnnotations(directClassFile, cfOptions);
        if (classAnnotations.size() != 0) {
            classDefItem.setClassAnnotations(classAnnotations, dexFile);
        }
        FieldIdsSection fieldIds = dexFile.getFieldIds();
        MethodIdsSection methodIds = dexFile.getMethodIds();
        processFields(directClassFile, classDefItem, dexFile);
        processMethods(directClassFile, cfOptions, dexOptions, classDefItem, dexFile);
        ConstantPool constantPool = directClassFile.getConstantPool();
        int size = constantPool.size();
        for (int i = 0; i < size; i++) {
            Constant orNull = constantPool.getOrNull(i);
            if (orNull instanceof CstMethodRef) {
                methodIds.intern((CstBaseMethodRef) orNull);
            } else if (orNull instanceof CstInterfaceMethodRef) {
                methodIds.intern(((CstInterfaceMethodRef) orNull).toMethodRef());
            } else if (orNull instanceof CstFieldRef) {
                fieldIds.intern((CstFieldRef) orNull);
            } else if (orNull instanceof CstEnumRef) {
                fieldIds.intern(((CstEnumRef) orNull).getFieldRef());
            }
        }
        return classDefItem;
    }

    private static void updateDexStatistics(CfOptions cfOptions, DexOptions dexOptions, RopMethod ropMethod, RopMethod ropMethod2, LocalVariableInfo localVariableInfo, int i, int i2) {
        DalvCode translate = RopTranslator.translate(ropMethod, cfOptions.positionInfo, localVariableInfo, i, dexOptions);
        DalvCode translate2 = RopTranslator.translate(ropMethod2, cfOptions.positionInfo, localVariableInfo, i, dexOptions);
        C15371 r2 = new DalvCode.AssignIndicesCallback() {
            public int getIndex(Constant constant) {
                return 0;
            }
        };
        translate.assignIndices(r2);
        translate2.assignIndices(r2);
        CodeStatistics.updateDexStatistics(translate2, translate);
        CodeStatistics.updateOriginalByteCount(i2);
    }
}
