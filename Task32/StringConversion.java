public class StringConversion {
    public static void main(String[] args) {
        // String -> StringBuilder
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        
        // String -> StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        
        //StringBuilder -> String
        sb.append(" World");
        String fromBuilder = sb.toString();
        
        //StringBuffer -> String
        sbf.append(" Buffer");
        String fromBuffer = sbf.toString();
        
        //StringBuilder <-> StringBuffer (через String)
        StringBuilder sb2 = new StringBuilder(sbf.toString());
        StringBuffer sbf2 = new StringBuffer(sb.toString());
        
        System.out.println("Original String: " + str);
        System.out.println("StringBuilder: " + fromBuilder);
        System.out.println("StringBuffer: " + fromBuffer);
        System.out.println("StringBuilder from StringBuffer: " + sb2);
        System.out.println("StringBuffer from StringBuilder: " + sbf2);
    }
}