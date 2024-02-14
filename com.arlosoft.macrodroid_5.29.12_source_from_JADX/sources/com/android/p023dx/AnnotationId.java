package com.android.p023dx;

import com.android.p023dx.dex.file.ClassDefItem;
import com.android.p023dx.rop.annotation.Annotation;
import com.android.p023dx.rop.annotation.AnnotationVisibility;
import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.annotation.NameValuePair;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstEnumRef;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import java.lang.annotation.ElementType;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.android.dx.AnnotationId */
public final class AnnotationId<D, V> {
    private final ElementType annotatedElement;
    private final TypeId<D> declaringType;
    private final HashMap<String, NameValuePair> elements = new HashMap<>();
    private final TypeId<V> type;

    /* renamed from: com.android.dx.AnnotationId$Element */
    public static final class Element {
        private final String name;
        private final Object value;

        public Element(String str, Object obj) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(obj, "value == null");
            this.name = str;
            this.value = obj;
        }

        static Constant toConstant(Object obj) {
            Class<?> cls = obj.getClass();
            if (cls.isEnum()) {
                return new CstEnumRef(new CstNat(new CstString(((Enum) obj).name()), new CstString(TypeId.get(cls).getName())));
            } else if (cls.isArray()) {
                throw new UnsupportedOperationException("Array is not supported yet");
            } else if (!(obj instanceof TypeId)) {
                return Constants.getConstant(obj);
            } else {
                throw new UnsupportedOperationException("TypeId is not supported yet");
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Element)) {
                return false;
            }
            Element element = (Element) obj;
            if (!this.name.equals(element.name) || !this.value.equals(element.value)) {
                return false;
            }
            return true;
        }

        public String getName() {
            return this.name;
        }

        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "[" + this.name + ", " + this.value + "]";
        }
    }

    private AnnotationId(TypeId<D> typeId, TypeId<V> typeId2, ElementType elementType) {
        this.declaringType = typeId;
        this.type = typeId2;
        this.annotatedElement = elementType;
    }

    public static <D, V> AnnotationId<D, V> get(TypeId<D> typeId, TypeId<V> typeId2, ElementType elementType) {
        if (elementType == ElementType.TYPE || elementType == ElementType.METHOD || elementType == ElementType.FIELD || elementType == ElementType.PARAMETER) {
            return new AnnotationId<>(typeId, typeId2, elementType);
        }
        throw new IllegalArgumentException("element type is not supported to annotate yet.");
    }

    public void addToMethod(DexMaker dexMaker, MethodId<?, ?> methodId) {
        if (this.annotatedElement == ElementType.METHOD) {
            TypeId<D> typeId = methodId.declaringType;
            TypeId<D> typeId2 = this.declaringType;
            if (typeId == typeId2) {
                ClassDefItem classDefItem = dexMaker.getTypeDeclaration(typeId2).toClassDefItem();
                Objects.requireNonNull(classDefItem, "No class defined item is found");
                CstMethodRef cstMethodRef = methodId.constant;
                Objects.requireNonNull(cstMethodRef, "Method reference is NULL");
                Annotation annotation = new Annotation(CstType.intern(this.type.ropType), AnnotationVisibility.RUNTIME);
                Annotations annotations = new Annotations();
                for (NameValuePair add : this.elements.values()) {
                    annotation.add(add);
                }
                annotations.add(annotation);
                classDefItem.addMethodAnnotations(cstMethodRef, annotations, dexMaker.getDexFile());
                return;
            }
            throw new IllegalArgumentException("Method" + methodId + "'s declaring type is inconsistent with" + this);
        }
        throw new IllegalStateException("This annotation is not for method");
    }

    public void set(Element element) {
        Objects.requireNonNull(element, "element == null");
        this.elements.put(element.getName(), new NameValuePair(new CstString(element.getName()), Element.toConstant(element.getValue())));
    }
}
