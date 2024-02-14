package com.android.p023dx.dex.p025cf;

import com.android.p023dx.dex.file.AnnotationUtils;
import com.android.p023dx.p024cf.attrib.AttAnnotationDefault;
import com.android.p023dx.p024cf.attrib.AttEnclosingMethod;
import com.android.p023dx.p024cf.attrib.AttExceptions;
import com.android.p023dx.p024cf.attrib.AttInnerClasses;
import com.android.p023dx.p024cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p023dx.p024cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.p023dx.p024cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p023dx.p024cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.p023dx.p024cf.attrib.AttSignature;
import com.android.p023dx.p024cf.attrib.InnerClassList;
import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.p024cf.iface.Method;
import com.android.p023dx.p024cf.iface.MethodList;
import com.android.p023dx.rop.annotation.Annotation;
import com.android.p023dx.rop.annotation.AnnotationVisibility;
import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.annotation.AnnotationsList;
import com.android.p023dx.rop.annotation.NameValuePair;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.Warning;
import java.io.PrintStream;
import java.util.ArrayList;

/* renamed from: com.android.dx.dex.cf.AttributeTranslator */
class AttributeTranslator {
    private AttributeTranslator() {
    }

    public static Annotations getAnnotations(AttributeList attributeList) {
        Annotations annotations0 = getAnnotations0(attributeList);
        Annotation signature = getSignature(attributeList);
        return signature != null ? Annotations.combine(annotations0, signature) : annotations0;
    }

    private static Annotations getAnnotations0(AttributeList attributeList) {
        AttRuntimeVisibleAnnotations attRuntimeVisibleAnnotations = (AttRuntimeVisibleAnnotations) attributeList.findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        AttRuntimeInvisibleAnnotations attRuntimeInvisibleAnnotations = (AttRuntimeInvisibleAnnotations) attributeList.findFirst(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
        if (attRuntimeVisibleAnnotations == null) {
            if (attRuntimeInvisibleAnnotations == null) {
                return Annotations.EMPTY;
            }
            return attRuntimeInvisibleAnnotations.getAnnotations();
        } else if (attRuntimeInvisibleAnnotations == null) {
            return attRuntimeVisibleAnnotations.getAnnotations();
        } else {
            return Annotations.combine(attRuntimeVisibleAnnotations.getAnnotations(), attRuntimeInvisibleAnnotations.getAnnotations());
        }
    }

    public static Annotations getClassAnnotations(DirectClassFile directClassFile, CfOptions cfOptions) {
        Annotation translateAnnotationDefaults;
        CstType thisClass = directClassFile.getThisClass();
        AttributeList attributes = directClassFile.getAttributes();
        Annotations annotations = getAnnotations(attributes);
        Annotation translateEnclosingMethod = translateEnclosingMethod(attributes);
        try {
            Annotations translateInnerClasses = translateInnerClasses(thisClass, attributes, translateEnclosingMethod == null);
            if (translateInnerClasses != null) {
                annotations = Annotations.combine(annotations, translateInnerClasses);
            }
        } catch (Warning e) {
            PrintStream printStream = cfOptions.warn;
            printStream.println("warning: " + e.getMessage());
        }
        if (translateEnclosingMethod != null) {
            annotations = Annotations.combine(annotations, translateEnclosingMethod);
        }
        return (!AccessFlags.isAnnotation(directClassFile.getAccessFlags()) || (translateAnnotationDefaults = translateAnnotationDefaults(directClassFile)) == null) ? annotations : Annotations.combine(annotations, translateAnnotationDefaults);
    }

    public static TypeList getExceptions(Method method) {
        AttExceptions attExceptions = (AttExceptions) method.getAttributes().findFirst(AttExceptions.ATTRIBUTE_NAME);
        if (attExceptions == null) {
            return StdTypeList.EMPTY;
        }
        return attExceptions.getExceptions();
    }

    public static Annotations getMethodAnnotations(Method method) {
        Annotations annotations = getAnnotations(method.getAttributes());
        TypeList exceptions = getExceptions(method);
        return exceptions.size() != 0 ? Annotations.combine(annotations, AnnotationUtils.makeThrows(exceptions)) : annotations;
    }

    public static AnnotationsList getParameterAnnotations(Method method) {
        AttributeList attributes = method.getAttributes();
        AttRuntimeVisibleParameterAnnotations attRuntimeVisibleParameterAnnotations = (AttRuntimeVisibleParameterAnnotations) attributes.findFirst(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME);
        AttRuntimeInvisibleParameterAnnotations attRuntimeInvisibleParameterAnnotations = (AttRuntimeInvisibleParameterAnnotations) attributes.findFirst(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME);
        if (attRuntimeVisibleParameterAnnotations == null) {
            if (attRuntimeInvisibleParameterAnnotations == null) {
                return AnnotationsList.EMPTY;
            }
            return attRuntimeInvisibleParameterAnnotations.getParameterAnnotations();
        } else if (attRuntimeInvisibleParameterAnnotations == null) {
            return attRuntimeVisibleParameterAnnotations.getParameterAnnotations();
        } else {
            return AnnotationsList.combine(attRuntimeVisibleParameterAnnotations.getParameterAnnotations(), attRuntimeInvisibleParameterAnnotations.getParameterAnnotations());
        }
    }

    private static Annotation getSignature(AttributeList attributeList) {
        AttSignature attSignature = (AttSignature) attributeList.findFirst(AttSignature.ATTRIBUTE_NAME);
        if (attSignature == null) {
            return null;
        }
        return AnnotationUtils.makeSignature(attSignature.getSignature());
    }

    private static Annotation translateAnnotationDefaults(DirectClassFile directClassFile) {
        CstType thisClass = directClassFile.getThisClass();
        MethodList methods = directClassFile.getMethods();
        int size = methods.size();
        Annotation annotation = new Annotation(thisClass, AnnotationVisibility.EMBEDDED);
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Method method = methods.get(i);
            AttAnnotationDefault attAnnotationDefault = (AttAnnotationDefault) method.getAttributes().findFirst(AttAnnotationDefault.ATTRIBUTE_NAME);
            if (attAnnotationDefault != null) {
                annotation.add(new NameValuePair(method.getNat().getName(), attAnnotationDefault.getValue()));
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        annotation.setImmutable();
        return AnnotationUtils.makeAnnotationDefault(annotation);
    }

    private static Annotation translateEnclosingMethod(AttributeList attributeList) {
        AttEnclosingMethod attEnclosingMethod = (AttEnclosingMethod) attributeList.findFirst(AttEnclosingMethod.ATTRIBUTE_NAME);
        if (attEnclosingMethod == null) {
            return null;
        }
        CstType enclosingClass = attEnclosingMethod.getEnclosingClass();
        CstNat method = attEnclosingMethod.getMethod();
        if (method == null) {
            return AnnotationUtils.makeEnclosingClass(enclosingClass);
        }
        return AnnotationUtils.makeEnclosingMethod(new CstMethodRef(enclosingClass, method));
    }

    private static Annotations translateInnerClasses(CstType cstType, AttributeList attributeList, boolean z) {
        AttInnerClasses attInnerClasses = (AttInnerClasses) attributeList.findFirst(AttInnerClasses.ATTRIBUTE_NAME);
        if (attInnerClasses == null) {
            return null;
        }
        InnerClassList innerClasses = attInnerClasses.getInnerClasses();
        int size = innerClasses.size();
        ArrayList arrayList = new ArrayList();
        InnerClassList.Item item = null;
        for (int i = 0; i < size; i++) {
            InnerClassList.Item item2 = innerClasses.get(i);
            CstType innerClass = item2.getInnerClass();
            if (innerClass.equals(cstType)) {
                item = item2;
            } else if (cstType.equals(item2.getOuterClass())) {
                arrayList.add(innerClass.getClassType());
            }
        }
        int size2 = arrayList.size();
        if (item == null && size2 == 0) {
            return null;
        }
        Annotations annotations = new Annotations();
        if (item != null) {
            annotations.add(AnnotationUtils.makeInnerClass(item.getInnerName(), item.getAccessFlags()));
            if (z) {
                if (item.getOuterClass() != null) {
                    annotations.add(AnnotationUtils.makeEnclosingClass(item.getOuterClass()));
                } else {
                    throw new Warning("Ignoring InnerClasses attribute for an anonymous inner class\n(" + cstType.toHuman() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                }
            }
        }
        if (size2 != 0) {
            StdTypeList stdTypeList = new StdTypeList(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                stdTypeList.set(i2, (Type) arrayList.get(i2));
            }
            stdTypeList.setImmutable();
            annotations.add(AnnotationUtils.makeMemberClasses(stdTypeList));
        }
        annotations.setImmutable();
        return annotations;
    }
}
