public class CompileErrorEx {
    public static void doStuff() throws Exception{
        throw new Exception("CSE 1322");
    }
    public static void main(String[] args) {
        // The compiler knows this method throws
        // an exception, so it forces you to use
        // a try/catch
        doStuff();
    }
}
