public class ThrowThrows {
    public static void doStuff() throws Exception{
        throw new Exception("CSE 1322");
    }
    public static void main(String[] args) {
        while(true){
            try{
                // doStuff();
                // System.out.println("This line never prints");

                float x = 5 / 0;
            }
            catch(Exception e){
                System.out.println("Exception thrown: " + e);
            }
            finally{
                System.out.println("This prints no matter what");
            }
        }
    }
}
