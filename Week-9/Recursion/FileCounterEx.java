class File{
    String name;
    File[] subFiles;

    // This is a folder (contains sub-directories)
    public File(String name, File[] subFiles){
        this.name = name;
        this.subFiles = subFiles;
    }

    // This is a file
    public File(String name){
        this.name = name;
    }
}

public class FileCounterEx{
    public static int fileCounter(File file){
        int count = 1;
    
        if(file.subFiles != null){
            for(File subFile : file.subFiles){
                count += fileCounter(subFile);
            }
        }

        return count;
    }
    public static void main(String[] args){
        /*
         * File Structure:
         * C:\
         *     Users\
         *         John\
         *             Documents\
         *                 Notes.txt
         *                 Resume.docx
         *             Pictures\
         *     Windwows\
         *         System32\
         */
        File f1 = new File("Notes.txt");
        File f2 = new File("Resume.docx");
        File f3 = new File("Documents\\", new File[]{f1, f2});
        File f4 = new File("Pictures\\", new File[]{});
        File f5 = new File("John\\", new File[]{f3, f4});
        File f6 = new File("Users\\", new File[]{f5});

        File f7 = new File("System32\\", new File[]{});
        File f8 = new File("Windows\\", new File[]{f7});
        File f9 = new File("C:\\", new File[]{f6, f8});

        System.out.println(fileCounter(f9));
    }
}