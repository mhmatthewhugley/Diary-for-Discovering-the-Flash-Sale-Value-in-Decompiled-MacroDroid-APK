package com.android.p023dx.command.annotool;

import com.android.p023dx.command.annotool.Main;
import com.android.p023dx.p024cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p023dx.p024cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p023dx.p024cf.attrib.BaseAnnotations;
import com.android.p023dx.p024cf.direct.ClassPathOpener;
import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.direct.StdAttributeFactory;
import com.android.p023dx.p024cf.iface.Attribute;
import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.rop.annotation.Annotation;
import com.android.p023dx.util.ByteArray;
import java.io.File;
import java.lang.annotation.ElementType;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: com.android.dx.command.annotool.AnnotationLister */
class AnnotationLister {
    private static final String PACKAGE_INFO = "package-info";
    private final Main.Arguments args;
    HashSet<String> matchInnerClassesOf = new HashSet<>();
    HashSet<String> matchPackages = new HashSet<>();

    /* renamed from: com.android.dx.command.annotool.AnnotationLister$2 */
    static /* synthetic */ class C15322 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$command$annotool$Main$PrintType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.android.dx.command.annotool.Main$PrintType[] r0 = com.android.p023dx.command.annotool.Main.PrintType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$android$dx$command$annotool$Main$PrintType = r0
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.p023dx.command.annotool.Main.PrintType.CLASS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$android$dx$command$annotool$Main$PrintType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.p023dx.command.annotool.Main.PrintType.INNERCLASS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$android$dx$command$annotool$Main$PrintType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.p023dx.command.annotool.Main.PrintType.METHOD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$android$dx$command$annotool$Main$PrintType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.p023dx.command.annotool.Main.PrintType.PACKAGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.command.annotool.AnnotationLister.C15322.<clinit>():void");
        }
    }

    AnnotationLister(Main.Arguments arguments) {
        this.args = arguments;
    }

    /* access modifiers changed from: private */
    public boolean isMatchingInnerClass(String str) {
        do {
            int lastIndexOf = str.lastIndexOf(36);
            if (lastIndexOf <= 0) {
                return false;
            }
            str = str.substring(0, lastIndexOf);
        } while (!this.matchInnerClassesOf.contains(str));
        return true;
    }

    /* access modifiers changed from: private */
    public boolean isMatchingPackage(String str) {
        String str2;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            str2 = str.substring(0, lastIndexOf);
        }
        return this.matchPackages.contains(str2);
    }

    /* access modifiers changed from: private */
    public void printMatch(DirectClassFile directClassFile) {
        Iterator it = this.args.printTypes.iterator();
        while (it.hasNext()) {
            int i = C15322.$SwitchMap$com$android$dx$command$annotool$Main$PrintType[((Main.PrintType) it.next()).ordinal()];
            if (i == 1) {
                System.out.println(directClassFile.getThisClass().getClassType().getClassName().replace('/', FilenameUtils.EXTENSION_SEPARATOR));
            } else if (i == 2) {
                this.matchInnerClassesOf.add(directClassFile.getThisClass().getClassType().getClassName());
            }
        }
    }

    private void printMatchPackage(String str) {
        Iterator it = this.args.printTypes.iterator();
        while (it.hasNext()) {
            int i = C15322.$SwitchMap$com$android$dx$command$annotool$Main$PrintType[((Main.PrintType) it.next()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                this.matchPackages.add(str);
            } else if (i == 4) {
                System.out.println(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
            }
        }
    }

    /* access modifiers changed from: private */
    public void visitClassAnnotation(DirectClassFile directClassFile, BaseAnnotations baseAnnotations) {
        if (this.args.eTypes.contains(ElementType.TYPE)) {
            for (Annotation type : baseAnnotations.getAnnotations().getAnnotations()) {
                if (this.args.aclass.equals(type.getType().getClassType().getClassName())) {
                    printMatch(directClassFile);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void visitPackageAnnotation(DirectClassFile directClassFile, BaseAnnotations baseAnnotations) {
        String str;
        if (this.args.eTypes.contains(ElementType.PACKAGE)) {
            String className = directClassFile.getThisClass().getClassType().getClassName();
            int lastIndexOf = className.lastIndexOf(47);
            if (lastIndexOf == -1) {
                str = "";
            } else {
                str = className.substring(0, lastIndexOf);
            }
            for (Annotation type : baseAnnotations.getAnnotations().getAnnotations()) {
                if (this.args.aclass.equals(type.getType().getClassType().getClassName())) {
                    printMatchPackage(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void process() {
        for (String classPathOpener : this.args.files) {
            new ClassPathOpener(classPathOpener, true, new ClassPathOpener.Consumer() {
                public void onException(Exception exc) {
                    throw new RuntimeException(exc);
                }

                public void onProcessArchiveStart(File file) {
                }

                public boolean processFileBytes(String str, long j, byte[] bArr) {
                    if (!str.endsWith(".class")) {
                        return true;
                    }
                    DirectClassFile directClassFile = new DirectClassFile(new ByteArray(bArr), str, true);
                    directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
                    AttributeList attributes = directClassFile.getAttributes();
                    String className = directClassFile.getThisClass().getClassType().getClassName();
                    if (className.endsWith(AnnotationLister.PACKAGE_INFO)) {
                        for (Attribute findFirst = attributes.findFirst(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME); findFirst != null; findFirst = attributes.findNext(findFirst)) {
                            AnnotationLister.this.visitPackageAnnotation(directClassFile, (BaseAnnotations) findFirst);
                        }
                        for (Attribute findFirst2 = attributes.findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME); findFirst2 != null; findFirst2 = attributes.findNext(findFirst2)) {
                            AnnotationLister.this.visitPackageAnnotation(directClassFile, (BaseAnnotations) findFirst2);
                        }
                    } else if (AnnotationLister.this.isMatchingInnerClass(className) || AnnotationLister.this.isMatchingPackage(className)) {
                        AnnotationLister.this.printMatch(directClassFile);
                    } else {
                        for (Attribute findFirst3 = attributes.findFirst(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME); findFirst3 != null; findFirst3 = attributes.findNext(findFirst3)) {
                            AnnotationLister.this.visitClassAnnotation(directClassFile, (BaseAnnotations) findFirst3);
                        }
                        for (Attribute findFirst4 = attributes.findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME); findFirst4 != null; findFirst4 = attributes.findNext(findFirst4)) {
                            AnnotationLister.this.visitClassAnnotation(directClassFile, (BaseAnnotations) findFirst4);
                        }
                    }
                    return true;
                }
            }).process();
        }
    }
}
