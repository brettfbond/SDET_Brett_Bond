package class22;
// Create a class File that will have the following behaviors: open, edit, close.
// Edit and close are implemented method while open is an abstract.
// Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
// Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.
public abstract class File {
    private String name;
    private double fileSize;

    public File(String name, double fileSize) {
        this.name = name;
        this.fileSize = fileSize;
    }

    abstract void open();
    void edit() {
        System.out.println("You can edit files");
    }
    void close() {
        System.out.println("Click the X to close.");
    }
}
class JavaFile extends File {

    public JavaFile(String name, double fileSize) {
        super(name, fileSize);
    }

    @Override
    void open() {
        System.out.println("Open Java file in IntelliJ");
    }
    @Override
    void close() {
        System.out.println("Your code should save automatically before you close the file");
    }
}
class WordFile extends File {

    public WordFile(String name, double fileSize) {
        super(name, fileSize);
    }

    @Override
    void open() {
        System.out.println("Open your .docx file in Microsoft Word");
    }
}
class PDFFile extends File {

    public PDFFile(String name, double fileSize) {
        super(name, fileSize);
    }

    @Override
    void open() {
        System.out.println("Open in your favorite PDF viewer, such as Acrobat");
    }
    @Override
    void edit() {
        System.out.println("You will need a PDF editor program to edit");
    }
}
class FileTester {
    public static void main(String[] args) {
        File[] files = {
                new JavaFile("Dog", 1.2),
                new WordFile("Test Case 01", 2.3),
                new PDFFile("Flow Chart", 6.2)
        };
        for (File file : files) {
            file.open();
            file.edit();
            file.close();
        }
    }
}