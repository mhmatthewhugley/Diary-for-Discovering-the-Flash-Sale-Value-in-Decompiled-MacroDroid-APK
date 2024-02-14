package com.android.p023dx.command.dexer;

import androidx.webkit.ProxyConfig;
import com.android.dex.Dex;
import com.android.dex.DexException;
import com.android.dex.DexFormat;
import com.android.dex.util.FileUtils;
import com.android.p023dx.command.DxConsole;
import com.android.p023dx.command.UsageException;
import com.android.p023dx.dex.DexOptions;
import com.android.p023dx.dex.file.ClassDefItem;
import com.android.p023dx.dex.file.DexFile;
import com.android.p023dx.dex.file.EncodedMethod;
import com.android.p023dx.dex.p025cf.CfOptions;
import com.android.p023dx.dex.p025cf.CfTranslator;
import com.android.p023dx.merge.CollisionPolicy;
import com.android.p023dx.merge.DexMerger;
import com.android.p023dx.p024cf.code.SimException;
import com.android.p023dx.p024cf.direct.ClassPathOpener;
import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.direct.StdAttributeFactory;
import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.rop.annotation.Annotation;
import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.annotation.AnnotationsList;
import com.android.p023dx.rop.cst.CstString;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.p353io.FilenameUtils;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.command.dexer.Main */
public class Main {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Attributes.Name CREATED_BY = new Attributes.Name("Created-By");
    private static final String DEX_EXTENSION = ".dex";
    private static final String DEX_PREFIX = "classes";
    private static final String IN_RE_CORE_CLASSES = "Ill-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application's project, when using an IDE (such as\nEclipse). If you are sure you're not intentionally defining a\ncore class, then this is the most likely explanation of what's\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n";
    private static final String[] JAVAX_CORE = {"accessibility", "crypto", "imageio", "management", "naming", "net", "print", "rmi", "security", "sip", "sound", "sql", "swing", "transaction", "xml"};
    private static final String MANIFEST_NAME = "META-INF/MANIFEST.MF";
    private static final int MAX_FIELD_ADDED_DURING_DEX_CREATION = 9;
    private static final int MAX_METHOD_ADDED_DURING_DEX_CREATION = 2;
    /* access modifiers changed from: private */
    public static List<Future<Boolean>> addToDexFutures = new ArrayList();
    private static volatile boolean anyFilesProcessed;
    /* access modifiers changed from: private */
    public static Arguments args;
    /* access modifiers changed from: private */
    public static ExecutorService classDefItemConsumer;
    /* access modifiers changed from: private */
    public static ExecutorService classTranslatorPool;
    /* access modifiers changed from: private */
    public static Set<String> classesInMainDex = null;
    private static ExecutorService dexOutPool;
    private static List<byte[]> dexOutputArrays = new ArrayList();
    private static List<Future<byte[]>> dexOutputFutures = new ArrayList();
    /* access modifiers changed from: private */
    public static Object dexRotationLock = new Object();
    /* access modifiers changed from: private */
    public static AtomicInteger errors = new AtomicInteger(0);
    private static OutputStreamWriter humanOutWriter = null;
    private static final List<byte[]> libraryDexBuffers = new ArrayList();
    /* access modifiers changed from: private */
    public static int maxFieldIdsInProcess = 0;
    /* access modifiers changed from: private */
    public static int maxMethodIdsInProcess = 0;
    private static long minimumFileAge = 0;
    /* access modifiers changed from: private */
    public static DexFile outputDex;
    private static TreeMap<String, byte[]> outputResources;

    /* renamed from: com.android.dx.command.dexer.Main$Arguments */
    public static class Arguments {
        private static final String INCREMENTAL_OPTION = "--incremental";
        private static final String INPUT_LIST_OPTION = "--input-list";
        private static final String MAIN_DEX_LIST_OPTION = "--main-dex-list";
        private static final String MINIMAL_MAIN_DEX_OPTION = "--minimal-main-dex";
        private static final String MULTI_DEX_OPTION = "--multi-dex";
        private static final String NUM_THREADS_OPTION = "--num-threads";
        public CfOptions cfOptions;
        public boolean coreLibrary = false;
        public boolean debug = false;
        public DexOptions dexOptions;
        public String dontOptimizeListFile = null;
        public int dumpWidth = 0;
        public boolean emptyOk = false;
        public String[] fileNames;
        public boolean forceJumbo = false;
        public String humanOutName = null;
        public boolean incremental = false;
        private List<String> inputList = null;
        public boolean jarOutput = false;
        public boolean keepClassesInJar = false;
        public boolean localInfo = true;
        public String mainDexListFile = null;
        /* access modifiers changed from: private */
        public int maxNumberOfIdxPerDex = 65536;
        public String methodToDump = null;
        public boolean minimalMainDex = false;
        public boolean multiDex = false;
        public int numThreads = 1;
        public boolean optimize = true;
        public String optimizeListFile = null;
        public String outName = null;
        public int positionInfo = 2;
        public boolean statistics;
        public boolean strictNameCheck = true;
        public boolean verbose = false;
        public boolean verboseDump = false;
        public boolean warnings = true;

        /* renamed from: com.android.dx.command.dexer.Main$Arguments$ArgumentsParser */
        private static class ArgumentsParser {
            private final String[] arguments;
            private String current;
            private int index = 0;
            private String lastValue;

            public ArgumentsParser(String[] strArr) {
                this.arguments = strArr;
            }

            private boolean getNextValue() {
                int i = this.index;
                String[] strArr = this.arguments;
                if (i >= strArr.length) {
                    return false;
                }
                this.current = strArr[i];
                this.index = i + 1;
                return true;
            }

            public String getCurrent() {
                return this.current;
            }

            public String getLastValue() {
                return this.lastValue;
            }

            public boolean getNext() {
                int i = this.index;
                String[] strArr = this.arguments;
                if (i >= strArr.length) {
                    return false;
                }
                String str = strArr[i];
                this.current = str;
                if (str.equals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX) || !this.current.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                    return false;
                }
                this.index++;
                return true;
            }

            public String[] getRemaining() {
                String[] strArr = this.arguments;
                int length = strArr.length;
                int i = this.index;
                int i2 = length - i;
                String[] strArr2 = new String[i2];
                if (i2 > 0) {
                    System.arraycopy(strArr, i, strArr2, 0, i2);
                }
                return strArr2;
            }

            public boolean isArg(String str) {
                int length = str.length();
                if (length > 0) {
                    int i = length - 1;
                    if (str.charAt(i) == '=') {
                        if (this.current.startsWith(str)) {
                            this.lastValue = this.current.substring(length);
                            return true;
                        }
                        String substring = str.substring(0, i);
                        if (!this.current.equals(substring)) {
                            return false;
                        }
                        if (getNextValue()) {
                            this.lastValue = this.current;
                            return true;
                        }
                        System.err.println("Missing value after parameter " + substring);
                        throw new UsageException();
                    }
                }
                return this.current.equals(str);
            }
        }

        /* access modifiers changed from: private */
        public void makeOptionsObjects() {
            CfOptions cfOptions2 = new CfOptions();
            this.cfOptions = cfOptions2;
            cfOptions2.positionInfo = this.positionInfo;
            cfOptions2.localInfo = this.localInfo;
            cfOptions2.strictNameCheck = this.strictNameCheck;
            cfOptions2.optimize = this.optimize;
            cfOptions2.optimizeListFile = this.optimizeListFile;
            cfOptions2.dontOptimizeListFile = this.dontOptimizeListFile;
            cfOptions2.statistics = this.statistics;
            if (this.warnings) {
                cfOptions2.warn = DxConsole.err;
            } else {
                cfOptions2.warn = DxConsole.noop;
            }
            DexOptions dexOptions2 = new DexOptions();
            this.dexOptions = dexOptions2;
            dexOptions2.forceJumbo = this.forceJumbo;
        }

        public void parse(String[] strArr) {
            ArgumentsParser argumentsParser = new ArgumentsParser(strArr);
            boolean z = false;
            boolean z2 = false;
            while (argumentsParser.getNext()) {
                if (argumentsParser.isArg("--debug")) {
                    this.debug = true;
                } else if (argumentsParser.isArg("--no-warning")) {
                    this.warnings = false;
                } else if (argumentsParser.isArg("--verbose")) {
                    this.verbose = true;
                } else if (argumentsParser.isArg("--verbose-dump")) {
                    this.verboseDump = true;
                } else if (argumentsParser.isArg("--no-files")) {
                    this.emptyOk = true;
                } else if (argumentsParser.isArg("--no-optimize")) {
                    this.optimize = false;
                } else if (argumentsParser.isArg("--no-strict")) {
                    this.strictNameCheck = false;
                } else if (argumentsParser.isArg("--core-library")) {
                    this.coreLibrary = true;
                } else if (argumentsParser.isArg("--statistics")) {
                    this.statistics = true;
                } else if (argumentsParser.isArg("--optimize-list=")) {
                    if (this.dontOptimizeListFile == null) {
                        this.optimize = true;
                        this.optimizeListFile = argumentsParser.getLastValue();
                    } else {
                        System.err.println("--optimize-list and --no-optimize-list are incompatible.");
                        throw new UsageException();
                    }
                } else if (argumentsParser.isArg("--no-optimize-list=")) {
                    if (this.dontOptimizeListFile == null) {
                        this.optimize = true;
                        this.dontOptimizeListFile = argumentsParser.getLastValue();
                    } else {
                        System.err.println("--optimize-list and --no-optimize-list are incompatible.");
                        throw new UsageException();
                    }
                } else if (argumentsParser.isArg("--keep-classes")) {
                    this.keepClassesInJar = true;
                } else if (argumentsParser.isArg("--output=")) {
                    this.outName = argumentsParser.getLastValue();
                    if (new File(this.outName).isDirectory()) {
                        this.jarOutput = false;
                        z2 = true;
                    } else if (FileUtils.hasArchiveSuffix(this.outName)) {
                        this.jarOutput = true;
                    } else if (this.outName.endsWith(Main.DEX_EXTENSION) || this.outName.equals(HelpFormatter.DEFAULT_OPT_PREFIX)) {
                        this.jarOutput = false;
                        z = true;
                    } else {
                        PrintStream printStream = System.err;
                        printStream.println("unknown output extension: " + this.outName);
                        throw new UsageException();
                    }
                } else if (argumentsParser.isArg("--dump-to=")) {
                    this.humanOutName = argumentsParser.getLastValue();
                } else if (argumentsParser.isArg("--dump-width=")) {
                    this.dumpWidth = Integer.parseInt(argumentsParser.getLastValue());
                } else if (argumentsParser.isArg("--dump-method=")) {
                    this.methodToDump = argumentsParser.getLastValue();
                    this.jarOutput = false;
                } else if (argumentsParser.isArg("--positions=")) {
                    String intern = argumentsParser.getLastValue().intern();
                    if (intern == "none") {
                        this.positionInfo = 1;
                    } else if (intern == "important") {
                        this.positionInfo = 3;
                    } else if (intern == "lines") {
                        this.positionInfo = 2;
                    } else {
                        PrintStream printStream2 = System.err;
                        printStream2.println("unknown positions option: " + intern);
                        throw new UsageException();
                    }
                } else if (argumentsParser.isArg("--no-locals")) {
                    this.localInfo = false;
                } else if (argumentsParser.isArg("--num-threads=")) {
                    this.numThreads = Integer.parseInt(argumentsParser.getLastValue());
                } else if (argumentsParser.isArg(INCREMENTAL_OPTION)) {
                    this.incremental = true;
                } else if (argumentsParser.isArg("--force-jumbo")) {
                    this.forceJumbo = true;
                } else if (argumentsParser.isArg(MULTI_DEX_OPTION)) {
                    this.multiDex = true;
                } else if (argumentsParser.isArg("--main-dex-list=")) {
                    this.mainDexListFile = argumentsParser.getLastValue();
                } else if (argumentsParser.isArg(MINIMAL_MAIN_DEX_OPTION)) {
                    this.minimalMainDex = true;
                } else if (argumentsParser.isArg("--set-max-idx-number=")) {
                    this.maxNumberOfIdxPerDex = Integer.parseInt(argumentsParser.getLastValue());
                } else if (argumentsParser.isArg("--input-list=")) {
                    File file = new File(argumentsParser.getLastValue());
                    try {
                        this.inputList = new ArrayList();
                        Main.readPathsFromFile(file.getAbsolutePath(), this.inputList);
                    } catch (IOException unused) {
                        PrintStream printStream3 = System.err;
                        printStream3.println("Unable to read input list file: " + file.getName());
                        throw new UsageException();
                    }
                } else {
                    PrintStream printStream4 = System.err;
                    printStream4.println("unknown option: " + argumentsParser.getCurrent());
                    throw new UsageException();
                }
            }
            this.fileNames = argumentsParser.getRemaining();
            List<String> list = this.inputList;
            if (list != null && !list.isEmpty()) {
                this.inputList.addAll(Arrays.asList(this.fileNames));
                List<String> list2 = this.inputList;
                this.fileNames = (String[]) list2.toArray(new String[list2.size()]);
            }
            if (this.fileNames.length == 0) {
                if (!this.emptyOk) {
                    System.err.println("no input files specified");
                    throw new UsageException();
                }
            } else if (this.emptyOk) {
                System.out.println("ignoring input files");
            }
            if (this.humanOutName == null && this.methodToDump != null) {
                this.humanOutName = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            String str = this.mainDexListFile;
            if (str != null && !this.multiDex) {
                System.err.println("--main-dex-list is only supported in combination with --multi-dex");
                throw new UsageException();
            } else if (!this.minimalMainDex || (str != null && this.multiDex)) {
                boolean z3 = this.multiDex;
                if (z3 && this.incremental) {
                    System.err.println("--incremental is not supported with --multi-dex");
                    throw new UsageException();
                } else if (!z3 || !z) {
                    if (z2 && !z3) {
                        this.outName = new File(this.outName, DexFormat.DEX_IN_JAR_NAME).getPath();
                    }
                    makeOptionsObjects();
                } else {
                    PrintStream printStream5 = System.err;
                    printStream5.println("Unsupported output \"" + this.outName + "\". " + MULTI_DEX_OPTION + " supports only archive or directory output");
                    throw new UsageException();
                }
            } else {
                System.err.println("--minimal-main-dex is only supported in combination with --multi-dex and --main-dex-list");
                throw new UsageException();
            }
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$BestEffortMainDexListFilter */
    private static class BestEffortMainDexListFilter implements ClassPathOpener.FileNameFilter {
        Map<String, List<String>> map = new HashMap();

        public BestEffortMainDexListFilter() {
            for (String access$900 : Main.classesInMainDex) {
                String access$9002 = Main.fixPath(access$900);
                String simpleName = getSimpleName(access$9002);
                List list = this.map.get(simpleName);
                if (list == null) {
                    list = new ArrayList(1);
                    this.map.put(simpleName, list);
                }
                list.add(access$9002);
            }
        }

        private static String getSimpleName(String str) {
            int lastIndexOf = str.lastIndexOf(47);
            return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
        }

        public boolean accept(String str) {
            if (!str.endsWith(".class")) {
                return true;
            }
            String access$900 = Main.fixPath(str);
            List<String> list = this.map.get(getSimpleName(access$900));
            if (list == null) {
                return false;
            }
            for (String endsWith : list) {
                if (access$900.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$ClassDefItemConsumer */
    private static class ClassDefItemConsumer implements Callable<Boolean> {
        Future<ClassDefItem> futureClazz;
        int maxFieldIdsInClass;
        int maxMethodIdsInClass;
        String name;

        private ClassDefItemConsumer(String str, Future<ClassDefItem> future, int i, int i2) {
            this.name = str;
            this.futureClazz = future;
            this.maxMethodIdsInClass = i;
            this.maxFieldIdsInClass = i2;
        }

        public Boolean call() throws Exception {
            try {
                ClassDefItem classDefItem = this.futureClazz.get();
                if (classDefItem != null) {
                    boolean unused = Main.addClassToDex(classDefItem);
                    Main.updateStatus(true);
                }
                Boolean bool = Boolean.TRUE;
                if (Main.args.multiDex) {
                    synchronized (Main.dexRotationLock) {
                        int unused2 = Main.maxMethodIdsInProcess = Main.maxMethodIdsInProcess - this.maxMethodIdsInClass;
                        int unused3 = Main.maxFieldIdsInProcess = Main.maxFieldIdsInProcess - this.maxFieldIdsInClass;
                        Main.dexRotationLock.notifyAll();
                    }
                }
                return bool;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause instanceof Exception) {
                    th = (Exception) cause;
                }
                throw th;
            } catch (Throwable th2) {
                if (Main.args.multiDex) {
                    synchronized (Main.dexRotationLock) {
                        int unused4 = Main.maxMethodIdsInProcess = Main.maxMethodIdsInProcess - this.maxMethodIdsInClass;
                        int unused5 = Main.maxFieldIdsInProcess = Main.maxFieldIdsInProcess - this.maxFieldIdsInClass;
                        Main.dexRotationLock.notifyAll();
                    }
                }
                throw th2;
            }
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$ClassParserTask */
    private static class ClassParserTask implements Callable<DirectClassFile> {
        byte[] bytes;
        String name;

        private ClassParserTask(String str, byte[] bArr) {
            this.name = str;
            this.bytes = bArr;
        }

        public DirectClassFile call() throws Exception {
            return Main.parseClass(this.name, this.bytes);
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$ClassTranslatorTask */
    private static class ClassTranslatorTask implements Callable<ClassDefItem> {
        byte[] bytes;
        DirectClassFile classFile;
        String name;

        private ClassTranslatorTask(String str, byte[] bArr, DirectClassFile directClassFile) {
            this.name = str;
            this.bytes = bArr;
            this.classFile = directClassFile;
        }

        public ClassDefItem call() {
            return Main.translateClass(this.bytes, this.classFile);
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$DexWriter */
    private static class DexWriter implements Callable<byte[]> {
        private DexFile dexFile;

        private DexWriter(DexFile dexFile2) {
            this.dexFile = dexFile2;
        }

        public byte[] call() throws IOException {
            return Main.writeDex(this.dexFile);
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$DirectClassFileConsumer */
    private static class DirectClassFileConsumer implements Callable<Boolean> {
        byte[] bytes;
        Future<DirectClassFile> dcff;
        String name;

        private DirectClassFileConsumer(String str, byte[] bArr, Future<DirectClassFile> future) {
            this.name = str;
            this.bytes = bArr;
            this.dcff = future;
        }

        public Boolean call() throws Exception {
            return call(this.dcff.get());
        }

        /* access modifiers changed from: private */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public java.lang.Boolean call(com.android.p023dx.p024cf.direct.DirectClassFile r10) {
            /*
                r9 = this;
                com.android.dx.command.dexer.Main$Arguments r0 = com.android.p023dx.command.dexer.Main.args
                boolean r0 = r0.multiDex
                r1 = 0
                if (r0 == 0) goto L_0x00e1
                com.android.dx.rop.cst.ConstantPool r0 = r10.getConstantPool()
                int r0 = r0.size()
                com.android.dx.cf.iface.MethodList r1 = r10.getMethods()
                int r1 = r1.size()
                int r1 = r1 + r0
                int r1 = r1 + 2
                com.android.dx.cf.iface.FieldList r2 = r10.getFields()
                int r2 = r2.size()
                int r0 = r0 + r2
                int r0 = r0 + 9
                java.lang.Object r2 = com.android.p023dx.command.dexer.Main.dexRotationLock
                monitor-enter(r2)
                com.android.dx.dex.file.DexFile r3 = com.android.p023dx.command.dexer.Main.outputDex     // Catch:{ all -> 0x00de }
                monitor-enter(r3)     // Catch:{ all -> 0x00de }
                com.android.dx.dex.file.DexFile r4 = com.android.p023dx.command.dexer.Main.outputDex     // Catch:{ all -> 0x00db }
                com.android.dx.dex.file.MethodIdsSection r4 = r4.getMethodIds()     // Catch:{ all -> 0x00db }
                java.util.Collection r4 = r4.items()     // Catch:{ all -> 0x00db }
                int r4 = r4.size()     // Catch:{ all -> 0x00db }
                com.android.dx.dex.file.DexFile r5 = com.android.p023dx.command.dexer.Main.outputDex     // Catch:{ all -> 0x00db }
                com.android.dx.dex.file.FieldIdsSection r5 = r5.getFieldIds()     // Catch:{ all -> 0x00db }
                java.util.Collection r5 = r5.items()     // Catch:{ all -> 0x00db }
                int r5 = r5.size()     // Catch:{ all -> 0x00db }
                monitor-exit(r3)     // Catch:{ all -> 0x00db }
            L_0x0052:
                int r4 = r4 + r1
                int r3 = com.android.p023dx.command.dexer.Main.maxMethodIdsInProcess     // Catch:{ all -> 0x00de }
                int r4 = r4 + r3
                com.android.dx.command.dexer.Main$Arguments r3 = com.android.p023dx.command.dexer.Main.args     // Catch:{ all -> 0x00de }
                int r3 = r3.maxNumberOfIdxPerDex     // Catch:{ all -> 0x00de }
                if (r4 > r3) goto L_0x0072
                int r5 = r5 + r0
                int r3 = com.android.p023dx.command.dexer.Main.maxFieldIdsInProcess     // Catch:{ all -> 0x00de }
                int r5 = r5 + r3
                com.android.dx.command.dexer.Main$Arguments r3 = com.android.p023dx.command.dexer.Main.args     // Catch:{ all -> 0x00de }
                int r3 = r3.maxNumberOfIdxPerDex     // Catch:{ all -> 0x00de }
                if (r5 <= r3) goto L_0x0095
            L_0x0072:
                int r3 = com.android.p023dx.command.dexer.Main.maxMethodIdsInProcess     // Catch:{ all -> 0x00de }
                if (r3 > 0) goto L_0x00a9
                int r3 = com.android.p023dx.command.dexer.Main.maxFieldIdsInProcess     // Catch:{ all -> 0x00de }
                if (r3 <= 0) goto L_0x007f
                goto L_0x00a9
            L_0x007f:
                com.android.dx.dex.file.DexFile r3 = com.android.p023dx.command.dexer.Main.outputDex     // Catch:{ all -> 0x00de }
                com.android.dx.dex.file.ClassDefsSection r3 = r3.getClassDefs()     // Catch:{ all -> 0x00de }
                java.util.Collection r3 = r3.items()     // Catch:{ all -> 0x00de }
                int r3 = r3.size()     // Catch:{ all -> 0x00de }
                if (r3 <= 0) goto L_0x0095
                com.android.p023dx.command.dexer.Main.rotateDexFile()     // Catch:{ all -> 0x00de }
                goto L_0x00b0
            L_0x0095:
                int r3 = com.android.p023dx.command.dexer.Main.maxMethodIdsInProcess     // Catch:{ all -> 0x00de }
                int r3 = r3 + r1
                int unused = com.android.p023dx.command.dexer.Main.maxMethodIdsInProcess = r3     // Catch:{ all -> 0x00de }
                int r3 = com.android.p023dx.command.dexer.Main.maxFieldIdsInProcess     // Catch:{ all -> 0x00de }
                int r3 = r3 + r0
                int unused = com.android.p023dx.command.dexer.Main.maxFieldIdsInProcess = r3     // Catch:{ all -> 0x00de }
                monitor-exit(r2)     // Catch:{ all -> 0x00de }
                r7 = r0
                r6 = r1
                goto L_0x00e3
            L_0x00a9:
                java.lang.Object r3 = com.android.p023dx.command.dexer.Main.dexRotationLock     // Catch:{ InterruptedException -> 0x00b0 }
                r3.wait()     // Catch:{ InterruptedException -> 0x00b0 }
            L_0x00b0:
                com.android.dx.dex.file.DexFile r3 = com.android.p023dx.command.dexer.Main.outputDex     // Catch:{ all -> 0x00de }
                monitor-enter(r3)     // Catch:{ all -> 0x00de }
                com.android.dx.dex.file.DexFile r4 = com.android.p023dx.command.dexer.Main.outputDex     // Catch:{ all -> 0x00d8 }
                com.android.dx.dex.file.MethodIdsSection r4 = r4.getMethodIds()     // Catch:{ all -> 0x00d8 }
                java.util.Collection r4 = r4.items()     // Catch:{ all -> 0x00d8 }
                int r4 = r4.size()     // Catch:{ all -> 0x00d8 }
                com.android.dx.dex.file.DexFile r5 = com.android.p023dx.command.dexer.Main.outputDex     // Catch:{ all -> 0x00d8 }
                com.android.dx.dex.file.FieldIdsSection r5 = r5.getFieldIds()     // Catch:{ all -> 0x00d8 }
                java.util.Collection r5 = r5.items()     // Catch:{ all -> 0x00d8 }
                int r5 = r5.size()     // Catch:{ all -> 0x00d8 }
                monitor-exit(r3)     // Catch:{ all -> 0x00d8 }
                goto L_0x0052
            L_0x00d8:
                r10 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x00d8 }
                throw r10     // Catch:{ all -> 0x00de }
            L_0x00db:
                r10 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x00db }
                throw r10     // Catch:{ all -> 0x00de }
            L_0x00de:
                r10 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00de }
                throw r10
            L_0x00e1:
                r6 = 0
                r7 = 0
            L_0x00e3:
                java.util.concurrent.ExecutorService r0 = com.android.p023dx.command.dexer.Main.classTranslatorPool
                com.android.dx.command.dexer.Main$ClassTranslatorTask r1 = new com.android.dx.command.dexer.Main$ClassTranslatorTask
                java.lang.String r2 = r9.name
                byte[] r3 = r9.bytes
                r4 = 0
                r1.<init>(r2, r3, r10)
                java.util.concurrent.Future r5 = r0.submit(r1)
                java.util.concurrent.ExecutorService r10 = com.android.p023dx.command.dexer.Main.classDefItemConsumer
                com.android.dx.command.dexer.Main$ClassDefItemConsumer r0 = new com.android.dx.command.dexer.Main$ClassDefItemConsumer
                java.lang.String r4 = r9.name
                r8 = 0
                r3 = r0
                r3.<init>(r4, r5, r6, r7)
                java.util.concurrent.Future r10 = r10.submit(r0)
                java.util.List r0 = com.android.p023dx.command.dexer.Main.addToDexFutures
                r0.add(r10)
                java.lang.Boolean r10 = java.lang.Boolean.TRUE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.command.dexer.Main.DirectClassFileConsumer.call(com.android.dx.cf.direct.DirectClassFile):java.lang.Boolean");
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$FileBytesConsumer */
    private static class FileBytesConsumer implements ClassPathOpener.Consumer {
        private FileBytesConsumer() {
        }

        public void onException(Exception exc) {
            if (!(exc instanceof StopProcessing)) {
                if (exc instanceof SimException) {
                    DxConsole.err.println("\nEXCEPTION FROM SIMULATION:");
                    PrintStream printStream = DxConsole.err;
                    printStream.println(exc.getMessage() + IOUtils.LINE_SEPARATOR_UNIX);
                    DxConsole.err.println(((SimException) exc).getContext());
                } else if (exc instanceof ParseException) {
                    DxConsole.err.println("\nPARSE ERROR:");
                    ParseException parseException = (ParseException) exc;
                    if (Main.args.debug) {
                        parseException.printStackTrace(DxConsole.err);
                    } else {
                        parseException.printContext(DxConsole.err);
                    }
                } else {
                    DxConsole.err.println("\nUNEXPECTED TOP-LEVEL EXCEPTION:");
                    exc.printStackTrace(DxConsole.err);
                }
                Main.errors.incrementAndGet();
                return;
            }
            throw ((StopProcessing) exc);
        }

        public void onProcessArchiveStart(File file) {
            if (Main.args.verbose) {
                PrintStream printStream = DxConsole.out;
                printStream.println("processing archive " + file + "...");
            }
        }

        public boolean processFileBytes(String str, long j, byte[] bArr) {
            return Main.processFileBytes(str, j, bArr);
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$MainDexListFilter */
    private static class MainDexListFilter implements ClassPathOpener.FileNameFilter {
        private MainDexListFilter() {
        }

        public boolean accept(String str) {
            if (!str.endsWith(".class")) {
                return true;
            }
            return Main.classesInMainDex.contains(Main.fixPath(str));
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$NotFilter */
    private static class NotFilter implements ClassPathOpener.FileNameFilter {
        private final ClassPathOpener.FileNameFilter filter;

        public boolean accept(String str) {
            return !this.filter.accept(str);
        }

        private NotFilter(ClassPathOpener.FileNameFilter fileNameFilter) {
            this.filter = fileNameFilter;
        }
    }

    /* renamed from: com.android.dx.command.dexer.Main$StopProcessing */
    private static class StopProcessing extends RuntimeException {
        private StopProcessing() {
        }
    }

    private Main() {
    }

    /* access modifiers changed from: private */
    public static boolean addClassToDex(ClassDefItem classDefItem) {
        synchronized (outputDex) {
            outputDex.add(classDefItem);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (java.util.Arrays.binarySearch(JAVAX_CORE, r5.substring(6, r0)) >= 0) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void checkClassName(java.lang.String r5) {
        /*
            java.lang.String r0 = "java/"
            boolean r0 = r5.startsWith(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000c
        L_0x000a:
            r1 = 1
            goto L_0x002c
        L_0x000c:
            java.lang.String r0 = "javax/"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x002c
            r0 = 47
            r3 = 6
            int r0 = r5.indexOf(r0, r3)
            r4 = -1
            if (r0 != r4) goto L_0x001f
            goto L_0x000a
        L_0x001f:
            java.lang.String r0 = r5.substring(r3, r0)
            java.lang.String[] r3 = JAVAX_CORE
            int r0 = java.util.Arrays.binarySearch(r3, r0)
            if (r0 < 0) goto L_0x002c
            goto L_0x000a
        L_0x002c:
            if (r1 != 0) goto L_0x002f
            return
        L_0x002f:
            java.io.PrintStream r0 = com.android.p023dx.command.DxConsole.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\ntrouble processing \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\":\n\n"
            r1.append(r5)
            java.lang.String r5 = "Ill-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application's project, when using an IDE (such as\nEclipse). If you are sure you're not intentionally defining a\ncore class, then this is the most likely explanation of what's\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.println(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = errors
            r5.incrementAndGet()
            com.android.dx.command.dexer.Main$StopProcessing r5 = new com.android.dx.command.dexer.Main$StopProcessing
            r0 = 0
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.command.dexer.Main.checkClassName(java.lang.String):void");
    }

    private static void closeOutput(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.flush();
            if (outputStream != System.out) {
                outputStream.close();
            }
        }
    }

    private static void createDexFile() {
        DexFile dexFile = new DexFile(args.dexOptions);
        outputDex = dexFile;
        int i = args.dumpWidth;
        if (i != 0) {
            dexFile.setDumpWidth(i);
        }
    }

    private static boolean createJar(String str) {
        OutputStream openOutput;
        JarOutputStream jarOutputStream;
        try {
            Manifest makeManifest = makeManifest();
            openOutput = openOutput(str);
            jarOutputStream = new JarOutputStream(openOutput, makeManifest);
            for (Map.Entry next : outputResources.entrySet()) {
                String str2 = (String) next.getKey();
                byte[] bArr = (byte[]) next.getValue();
                JarEntry jarEntry = new JarEntry(str2);
                int length = bArr.length;
                if (args.verbose) {
                    PrintStream printStream = DxConsole.out;
                    printStream.println("writing " + str2 + "; size " + length + "...");
                }
                jarEntry.setSize((long) length);
                jarOutputStream.putNextEntry(jarEntry);
                jarOutputStream.write(bArr);
                jarOutputStream.closeEntry();
            }
            jarOutputStream.finish();
            jarOutputStream.flush();
            closeOutput(openOutput);
            return true;
        } catch (Exception e) {
            if (args.debug) {
                DxConsole.err.println("\ntrouble writing output:");
                e.printStackTrace(DxConsole.err);
                return false;
            }
            PrintStream printStream2 = DxConsole.err;
            printStream2.println("\ntrouble writing output: " + e.getMessage());
            return false;
        } catch (Throwable th) {
            jarOutputStream.finish();
            jarOutputStream.flush();
            closeOutput(openOutput);
            throw th;
        }
    }

    private static void dumpMethod(DexFile dexFile, String str, OutputStreamWriter outputStreamWriter) {
        boolean endsWith = str.endsWith(ProxyConfig.MATCH_ALL_SCHEMES);
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf <= 0 || lastIndexOf == str.length() - 1) {
            PrintStream printStream = DxConsole.err;
            printStream.println("bogus fully-qualified method name: " + str);
            return;
        }
        String replace = str.substring(0, lastIndexOf).replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
        String substring = str.substring(lastIndexOf + 1);
        ClassDefItem classOrNull = dexFile.getClassOrNull(replace);
        if (classOrNull == null) {
            PrintStream printStream2 = DxConsole.err;
            printStream2.println("no such class: " + replace);
            return;
        }
        if (endsWith) {
            substring = substring.substring(0, substring.length() - 1);
        }
        ArrayList<EncodedMethod> methods = classOrNull.getMethods();
        TreeMap treeMap = new TreeMap();
        Iterator<EncodedMethod> it = methods.iterator();
        while (it.hasNext()) {
            EncodedMethod next = it.next();
            String string = next.getName().getString();
            if ((endsWith && string.startsWith(substring)) || (!endsWith && string.equals(substring))) {
                treeMap.put(next.getRef().getNat(), next);
            }
        }
        if (treeMap.size() == 0) {
            PrintStream printStream3 = DxConsole.err;
            printStream3.println("no such method: " + str);
            return;
        }
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        for (EncodedMethod encodedMethod : treeMap.values()) {
            encodedMethod.debugPrint(printWriter, args.verboseDump);
            CstString sourceFile = classOrNull.getSourceFile();
            if (sourceFile != null) {
                printWriter.println("  source file: " + sourceFile.toQuoted());
            }
            Annotations methodAnnotations = classOrNull.getMethodAnnotations(encodedMethod.getRef());
            AnnotationsList parameterAnnotations = classOrNull.getParameterAnnotations(encodedMethod.getRef());
            if (methodAnnotations != null) {
                printWriter.println("  method annotations:");
                for (Annotation annotation : methodAnnotations.getAnnotations()) {
                    printWriter.println("    " + annotation);
                }
            }
            if (parameterAnnotations != null) {
                printWriter.println("  parameter annotations:");
                int size = parameterAnnotations.size();
                for (int i = 0; i < size; i++) {
                    printWriter.println("    parameter " + i);
                    for (Annotation annotation2 : parameterAnnotations.get(i).getAnnotations()) {
                        printWriter.println("      " + annotation2);
                    }
                }
            }
        }
        printWriter.flush();
    }

    /* access modifiers changed from: private */
    public static String fixPath(String str) {
        if (File.separatorChar == '\\') {
            str = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, '/');
        }
        int lastIndexOf = str.lastIndexOf("/./");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 3);
        }
        return str.startsWith("./") ? str.substring(2) : str;
    }

    private static String getDexFileName(int i) {
        if (i == 0) {
            return DexFormat.DEX_IN_JAR_NAME;
        }
        return DEX_PREFIX + (i + 1) + DEX_EXTENSION;
    }

    public static String getTooManyIdsErrorMessage() {
        return args.multiDex ? "The list of classes given in --main-dex-list is too big and does not fit in the main dex." : "You may try using --multi-dex option.";
    }

    public static void main(String[] strArr) throws IOException {
        Arguments arguments = new Arguments();
        arguments.parse(strArr);
        int run = run(arguments);
        if (run != 0) {
            System.exit(run);
        }
    }

    private static Manifest makeManifest() throws IOException {
        Attributes attributes;
        Manifest manifest;
        String str;
        byte[] bArr = outputResources.get(MANIFEST_NAME);
        if (bArr == null) {
            manifest = new Manifest();
            attributes = manifest.getMainAttributes();
            attributes.put(Attributes.Name.MANIFEST_VERSION, "1.0");
        } else {
            Manifest manifest2 = new Manifest(new ByteArrayInputStream(bArr));
            Attributes mainAttributes = manifest2.getMainAttributes();
            outputResources.remove(MANIFEST_NAME);
            attributes = mainAttributes;
            manifest = manifest2;
        }
        Attributes.Name name = CREATED_BY;
        String value = attributes.getValue(name);
        if (value == null) {
            str = "";
        } else {
            str = value + " + ";
        }
        attributes.put(name, str + "dx 1.12");
        attributes.putValue("Dex-Location", DexFormat.DEX_IN_JAR_NAME);
        return manifest;
    }

    private static byte[] mergeIncremental(byte[] bArr, File file) throws IOException {
        Dex dex = bArr != null ? new Dex(bArr) : null;
        Dex dex2 = file.exists() ? new Dex(file) : null;
        if (dex == null && dex2 == null) {
            return null;
        }
        if (dex == null) {
            dex = dex2;
        } else if (dex2 != null) {
            dex = new DexMerger(new Dex[]{dex, dex2}, CollisionPolicy.KEEP_FIRST).merge();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dex.writeTo((OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] mergeLibraryDexBuffers(byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            arrayList.add(new Dex(bArr));
        }
        for (byte[] dex : libraryDexBuffers) {
            arrayList.add(new Dex(dex));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DexMerger((Dex[]) arrayList.toArray(new Dex[arrayList.size()]), CollisionPolicy.FAIL).merge().getBytes();
    }

    private static OutputStream openOutput(String str) throws IOException {
        if (str.equals(HelpFormatter.DEFAULT_OPT_PREFIX) || str.startsWith("-.")) {
            return System.out;
        }
        return new FileOutputStream(str);
    }

    /* access modifiers changed from: private */
    public static DirectClassFile parseClass(String str, byte[] bArr) {
        DirectClassFile directClassFile = new DirectClassFile(bArr, str, args.cfOptions.strictNameCheck);
        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
        directClassFile.getMagic();
        return directClassFile;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0075 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00b3 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075 A[LOOP:1: B:21:0x0075->B:97:0x0075, LOOP_START, SYNTHETIC, Splitter:B:21:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean processAllFiles() {
        /*
            createDexFile()
            com.android.dx.command.dexer.Main$Arguments r0 = args
            boolean r0 = r0.jarOutput
            if (r0 == 0) goto L_0x0010
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            outputResources = r0
        L_0x0010:
            r0 = 0
            anyFilesProcessed = r0
            com.android.dx.command.dexer.Main$Arguments r1 = args
            java.lang.String[] r1 = r1.fileNames
            java.util.Arrays.sort(r1)
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            com.android.dx.command.dexer.Main$Arguments r2 = args
            int r4 = r2.numThreads
            r5 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ArrayBlockingQueue r8 = new java.util.concurrent.ArrayBlockingQueue
            com.android.dx.command.dexer.Main$Arguments r2 = args
            int r2 = r2.numThreads
            int r2 = r2 * 2
            r11 = 1
            r8.<init>(r2, r11)
            java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy r9 = new java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy
            r9.<init>()
            r2 = r10
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)
            classTranslatorPool = r10
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            classDefItemConsumer = r2
            com.android.dx.command.dexer.Main$Arguments r2 = args     // Catch:{ StopProcessing -> 0x00b3 }
            java.lang.String r3 = r2.mainDexListFile     // Catch:{ StopProcessing -> 0x00b3 }
            if (r3 == 0) goto L_0x00a5
            boolean r2 = r2.strictNameCheck     // Catch:{ StopProcessing -> 0x00b3 }
            r3 = 0
            if (r2 == 0) goto L_0x0053
            com.android.dx.command.dexer.Main$MainDexListFilter r2 = new com.android.dx.command.dexer.Main$MainDexListFilter     // Catch:{ StopProcessing -> 0x00b3 }
            r2.<init>()     // Catch:{ StopProcessing -> 0x00b3 }
            goto L_0x0058
        L_0x0053:
            com.android.dx.command.dexer.Main$BestEffortMainDexListFilter r2 = new com.android.dx.command.dexer.Main$BestEffortMainDexListFilter     // Catch:{ StopProcessing -> 0x00b3 }
            r2.<init>()     // Catch:{ StopProcessing -> 0x00b3 }
        L_0x0058:
            r4 = 0
        L_0x0059:
            int r5 = r1.length     // Catch:{ StopProcessing -> 0x00b3 }
            if (r4 >= r5) goto L_0x0064
            r5 = r1[r4]     // Catch:{ StopProcessing -> 0x00b3 }
            processOne(r5, r2)     // Catch:{ StopProcessing -> 0x00b3 }
            int r4 = r4 + 1
            goto L_0x0059
        L_0x0064:
            java.util.List<java.util.concurrent.Future<byte[]>> r4 = dexOutputFutures     // Catch:{ StopProcessing -> 0x00b3 }
            int r4 = r4.size()     // Catch:{ StopProcessing -> 0x00b3 }
            if (r4 > 0) goto L_0x009d
            com.android.dx.command.dexer.Main$Arguments r4 = args     // Catch:{ StopProcessing -> 0x00b3 }
            boolean r4 = r4.minimalMainDex     // Catch:{ StopProcessing -> 0x00b3 }
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = dexRotationLock     // Catch:{ StopProcessing -> 0x00b3 }
            monitor-enter(r4)     // Catch:{ StopProcessing -> 0x00b3 }
        L_0x0075:
            int r5 = maxMethodIdsInProcess     // Catch:{ all -> 0x0089 }
            if (r5 > 0) goto L_0x0083
            int r5 = maxFieldIdsInProcess     // Catch:{ all -> 0x0089 }
            if (r5 <= 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            rotateDexFile()     // Catch:{ StopProcessing -> 0x00b3 }
            goto L_0x008c
        L_0x0083:
            java.lang.Object r5 = dexRotationLock     // Catch:{ InterruptedException -> 0x0075 }
            r5.wait()     // Catch:{ InterruptedException -> 0x0075 }
            goto L_0x0075
        L_0x0089:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ StopProcessing -> 0x00b3 }
        L_0x008c:
            r4 = 0
        L_0x008d:
            int r5 = r1.length     // Catch:{ StopProcessing -> 0x00b3 }
            if (r4 >= r5) goto L_0x00b3
            r5 = r1[r4]     // Catch:{ StopProcessing -> 0x00b3 }
            com.android.dx.command.dexer.Main$NotFilter r6 = new com.android.dx.command.dexer.Main$NotFilter     // Catch:{ StopProcessing -> 0x00b3 }
            r6.<init>(r2)     // Catch:{ StopProcessing -> 0x00b3 }
            processOne(r5, r6)     // Catch:{ StopProcessing -> 0x00b3 }
            int r4 = r4 + 1
            goto L_0x008d
        L_0x009d:
            com.android.dex.DexException r1 = new com.android.dex.DexException     // Catch:{ StopProcessing -> 0x00b3 }
            java.lang.String r2 = "Too many classes in --main-dex-list, main dex capacity exceeded"
            r1.<init>((java.lang.String) r2)     // Catch:{ StopProcessing -> 0x00b3 }
            throw r1     // Catch:{ StopProcessing -> 0x00b3 }
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            int r3 = r1.length     // Catch:{ StopProcessing -> 0x00b3 }
            if (r2 >= r3) goto L_0x00b3
            r3 = r1[r2]     // Catch:{ StopProcessing -> 0x00b3 }
            com.android.dx.cf.direct.ClassPathOpener$FileNameFilter r4 = com.android.p023dx.p024cf.direct.ClassPathOpener.acceptAll     // Catch:{ StopProcessing -> 0x00b3 }
            processOne(r3, r4)     // Catch:{ StopProcessing -> 0x00b3 }
            int r2 = r2 + 1
            goto L_0x00a6
        L_0x00b3:
            java.util.concurrent.ExecutorService r1 = classTranslatorPool     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r1.shutdown()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.util.concurrent.ExecutorService r1 = classTranslatorPool     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r3 = 600(0x258, double:2.964E-321)
            r1.awaitTermination(r3, r2)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.util.concurrent.ExecutorService r1 = classDefItemConsumer     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r1.shutdown()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.util.concurrent.ExecutorService r1 = classDefItemConsumer     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r1.awaitTermination(r3, r2)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.util.List<java.util.concurrent.Future<java.lang.Boolean>> r1 = addToDexFutures     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
        L_0x00d1:
            boolean r2 = r1.hasNext()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            if (r2 == 0) goto L_0x0126
            java.lang.Object r2 = r1.next()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r2.get()     // Catch:{ ExecutionException -> 0x00e1 }
            goto L_0x00d1
        L_0x00e1:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicInteger r3 = errors     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            int r3 = r3.incrementAndGet()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r4 = 10
            if (r3 >= r4) goto L_0x011e
            com.android.dx.command.dexer.Main$Arguments r3 = args     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            boolean r3 = r3.debug     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            if (r3 == 0) goto L_0x0103
            java.io.PrintStream r3 = com.android.p023dx.command.DxConsole.err     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.lang.String r4 = "Uncaught translation error:"
            r3.println(r4)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.io.PrintStream r3 = com.android.p023dx.command.DxConsole.err     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r2.printStackTrace(r3)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            goto L_0x00d1
        L_0x0103:
            java.io.PrintStream r3 = com.android.p023dx.command.DxConsole.err     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r4.<init>()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.lang.String r5 = "Uncaught translation error: "
            r4.append(r5)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r4.append(r2)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.lang.String r2 = r4.toString()     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            r3.println(r2)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            goto L_0x00d1
        L_0x011e:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            java.lang.String r1 = "Too many errors"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
            throw r0     // Catch:{ InterruptedException -> 0x0199, Exception -> 0x0181 }
        L_0x0126:
            java.util.concurrent.atomic.AtomicInteger r1 = errors
            int r1 = r1.get()
            if (r1 == 0) goto L_0x0154
            java.io.PrintStream r2 = com.android.p023dx.command.DxConsole.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " error"
            r3.append(r4)
            if (r1 != r11) goto L_0x0142
            java.lang.String r1 = ""
            goto L_0x0144
        L_0x0142:
            java.lang.String r1 = "s"
        L_0x0144:
            r3.append(r1)
            java.lang.String r1 = "; aborting"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            return r0
        L_0x0154:
            com.android.dx.command.dexer.Main$Arguments r1 = args
            boolean r1 = r1.incremental
            if (r1 == 0) goto L_0x015f
            boolean r1 = anyFilesProcessed
            if (r1 != 0) goto L_0x015f
            return r11
        L_0x015f:
            boolean r1 = anyFilesProcessed
            if (r1 != 0) goto L_0x0171
            com.android.dx.command.dexer.Main$Arguments r1 = args
            boolean r1 = r1.emptyOk
            if (r1 != 0) goto L_0x0171
            java.io.PrintStream r1 = com.android.p023dx.command.DxConsole.err
            java.lang.String r2 = "no classfiles specified"
            r1.println(r2)
            return r0
        L_0x0171:
            com.android.dx.command.dexer.Main$Arguments r0 = args
            boolean r1 = r0.optimize
            if (r1 == 0) goto L_0x0180
            boolean r0 = r0.statistics
            if (r0 == 0) goto L_0x0180
            java.io.PrintStream r0 = com.android.p023dx.command.DxConsole.out
            com.android.p023dx.dex.p025cf.CodeStatistics.dumpStatistics(r0)
        L_0x0180:
            return r11
        L_0x0181:
            r0 = move-exception
            java.util.concurrent.ExecutorService r1 = classTranslatorPool
            r1.shutdownNow()
            java.util.concurrent.ExecutorService r1 = classDefItemConsumer
            r1.shutdownNow()
            java.io.PrintStream r1 = java.lang.System.out
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception in translator thread."
            r1.<init>(r2, r0)
            throw r1
        L_0x0199:
            r0 = move-exception
            java.util.concurrent.ExecutorService r1 = classTranslatorPool
            r1.shutdownNow()
            java.util.concurrent.ExecutorService r1 = classDefItemConsumer
            r1.shutdownNow()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Translation has been interrupted"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.command.dexer.Main.processAllFiles():boolean");
    }

    private static boolean processClass(String str, byte[] bArr) {
        if (!args.coreLibrary) {
            checkClassName(str);
        }
        try {
            Boolean unused = new DirectClassFileConsumer(str, bArr, (Future) null).call(new ClassParserTask(str, bArr).call());
            return true;
        } catch (ParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("Exception parsing classes", e2);
        }
    }

    /* access modifiers changed from: private */
    public static boolean processFileBytes(String str, long j, byte[] bArr) {
        boolean endsWith = str.endsWith(".class");
        boolean equals = str.equals(DexFormat.DEX_IN_JAR_NAME);
        boolean z = outputResources != null;
        if (endsWith || equals || z) {
            if (args.verbose) {
                PrintStream printStream = DxConsole.out;
                printStream.println("processing " + str + "...");
            }
            String fixPath = fixPath(str);
            if (endsWith) {
                if (z && args.keepClassesInJar) {
                    synchronized (outputResources) {
                        outputResources.put(fixPath, bArr);
                    }
                }
                if (j < minimumFileAge) {
                    return true;
                }
                processClass(fixPath, bArr);
                return false;
            } else if (equals) {
                List<byte[]> list = libraryDexBuffers;
                synchronized (list) {
                    list.add(bArr);
                }
                return true;
            } else {
                synchronized (outputResources) {
                    outputResources.put(fixPath, bArr);
                }
                return true;
            }
        } else {
            if (args.verbose) {
                PrintStream printStream2 = DxConsole.out;
                printStream2.println("ignored resource " + str);
            }
            return false;
        }
    }

    private static void processOne(String str, ClassPathOpener.FileNameFilter fileNameFilter) {
        if (new ClassPathOpener(str, true, fileNameFilter, new FileBytesConsumer()).process()) {
            updateStatus(true);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void readPathsFromFile(java.lang.String r2, java.util.Collection<java.lang.String> r3) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0020 }
            r1.<init>(r2)     // Catch:{ all -> 0x0020 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0020 }
            r2.<init>(r1)     // Catch:{ all -> 0x0020 }
        L_0x000b:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = fixPath(r0)     // Catch:{ all -> 0x001d }
            r3.add(r0)     // Catch:{ all -> 0x001d }
            goto L_0x000b
        L_0x0019:
            r2.close()
            return
        L_0x001d:
            r3 = move-exception
            r0 = r2
            goto L_0x0021
        L_0x0020:
            r3 = move-exception
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()
        L_0x0026:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.command.dexer.Main.readPathsFromFile(java.lang.String, java.util.Collection):void");
    }

    /* access modifiers changed from: private */
    public static void rotateDexFile() {
        DexFile dexFile = outputDex;
        if (dexFile != null) {
            ExecutorService executorService = dexOutPool;
            if (executorService != null) {
                dexOutputFutures.add(executorService.submit(new DexWriter(dexFile)));
            } else {
                dexOutputArrays.add(writeDex(dexFile));
            }
        }
        createDexFile();
    }

    public static int run(Arguments arguments) throws IOException {
        OutputStream outputStream;
        errors.set(0);
        libraryDexBuffers.clear();
        args = arguments;
        arguments.makeOptionsObjects();
        String str = args.humanOutName;
        if (str != null) {
            outputStream = openOutput(str);
            humanOutWriter = new OutputStreamWriter(outputStream);
        } else {
            outputStream = null;
        }
        try {
            if (args.multiDex) {
                return runMultiDex();
            }
            int runMonoDex = runMonoDex();
            closeOutput(outputStream);
            return runMonoDex;
        } finally {
            closeOutput(outputStream);
        }
    }

    private static int runMonoDex() throws IOException {
        File file;
        byte[] bArr;
        String str;
        Arguments arguments = args;
        if (!arguments.incremental) {
            file = null;
        } else if (arguments.outName == null) {
            System.err.println("error: no incremental output name specified");
            return -1;
        } else {
            file = new File(args.outName);
            if (file.exists()) {
                minimumFileAge = file.lastModified();
            }
        }
        if (!processAllFiles()) {
            return 1;
        }
        if (args.incremental && !anyFilesProcessed) {
            return 0;
        }
        if (!outputDex.isEmpty() || args.humanOutName != null) {
            bArr = writeDex(outputDex);
            if (bArr == null) {
                return 2;
            }
        } else {
            bArr = null;
        }
        if (args.incremental) {
            bArr = mergeIncremental(bArr, file);
        }
        byte[] mergeLibraryDexBuffers = mergeLibraryDexBuffers(bArr);
        Arguments arguments2 = args;
        if (arguments2.jarOutput) {
            outputDex = null;
            if (mergeLibraryDexBuffers != null) {
                outputResources.put(DexFormat.DEX_IN_JAR_NAME, mergeLibraryDexBuffers);
            }
            if (!createJar(args.outName)) {
                return 3;
            }
        } else if (!(mergeLibraryDexBuffers == null || (str = arguments2.outName) == null)) {
            OutputStream openOutput = openOutput(str);
            openOutput.write(mergeLibraryDexBuffers);
            closeOutput(openOutput);
        }
        return 0;
    }

    /* JADX INFO: finally extract failed */
    private static int runMultiDex() throws IOException {
        if (args.mainDexListFile != null) {
            HashSet hashSet = new HashSet();
            classesInMainDex = hashSet;
            readPathsFromFile(args.mainDexListFile, hashSet);
        }
        dexOutPool = Executors.newFixedThreadPool(args.numThreads);
        if (!processAllFiles()) {
            return 1;
        }
        if (libraryDexBuffers.isEmpty()) {
            DexFile dexFile = outputDex;
            if (dexFile != null) {
                dexOutputFutures.add(dexOutPool.submit(new DexWriter(dexFile)));
                outputDex = null;
            }
            try {
                dexOutPool.shutdown();
                if (dexOutPool.awaitTermination(600, TimeUnit.SECONDS)) {
                    for (Future<byte[]> future : dexOutputFutures) {
                        dexOutputArrays.add(future.get());
                    }
                    Arguments arguments = args;
                    if (arguments.jarOutput) {
                        for (int i = 0; i < dexOutputArrays.size(); i++) {
                            outputResources.put(getDexFileName(i), dexOutputArrays.get(i));
                        }
                        if (!createJar(args.outName)) {
                            return 3;
                        }
                    } else if (arguments.outName != null) {
                        File file = new File(args.outName);
                        int i2 = 0;
                        while (i2 < dexOutputArrays.size()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, getDexFileName(i2)));
                            try {
                                fileOutputStream.write(dexOutputArrays.get(i2));
                                closeOutput(fileOutputStream);
                                i2++;
                            } catch (Throwable th) {
                                closeOutput(fileOutputStream);
                                throw th;
                            }
                        }
                    }
                    return 0;
                }
                throw new RuntimeException("Timed out waiting for dex writer threads.");
            } catch (InterruptedException unused) {
                dexOutPool.shutdownNow();
                throw new RuntimeException("A dex writer thread has been interrupted.");
            } catch (Exception unused2) {
                dexOutPool.shutdownNow();
                throw new RuntimeException("Unexpected exception in dex writer thread");
            }
        } else {
            throw new DexException("Library dex files are not supported in multi-dex mode");
        }
    }

    /* access modifiers changed from: private */
    public static ClassDefItem translateClass(byte[] bArr, DirectClassFile directClassFile) {
        try {
            Arguments arguments = args;
            return CfTranslator.translate(directClassFile, bArr, arguments.cfOptions, arguments.dexOptions, outputDex);
        } catch (ParseException e) {
            DxConsole.err.println("\ntrouble processing:");
            if (args.debug) {
                e.printStackTrace(DxConsole.err);
            } else {
                e.printContext(DxConsole.err);
            }
            errors.incrementAndGet();
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void updateStatus(boolean z) {
        anyFilesProcessed = z | anyFilesProcessed;
    }

    /* access modifiers changed from: private */
    public static byte[] writeDex(DexFile dexFile) {
        byte[] bArr;
        try {
            Arguments arguments = args;
            if (arguments.methodToDump != null) {
                dexFile.toDex((Writer) null, false);
                dumpMethod(dexFile, args.methodToDump, humanOutWriter);
                bArr = null;
            } else {
                bArr = dexFile.toDex(humanOutWriter, arguments.verboseDump);
            }
            if (args.statistics) {
                DxConsole.out.println(dexFile.getStatistics().toHuman());
            }
            OutputStreamWriter outputStreamWriter = humanOutWriter;
            if (outputStreamWriter != null) {
                outputStreamWriter.flush();
            }
            return bArr;
        } catch (Exception e) {
            if (args.debug) {
                DxConsole.err.println("\ntrouble writing output:");
                e.printStackTrace(DxConsole.err);
            } else {
                DxConsole.err.println("\ntrouble writing output: " + e.getMessage());
            }
            return null;
        } catch (Throwable th) {
            OutputStreamWriter outputStreamWriter2 = humanOutWriter;
            if (outputStreamWriter2 != null) {
                outputStreamWriter2.flush();
            }
            throw th;
        }
    }
}
