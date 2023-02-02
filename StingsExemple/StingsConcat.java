package ColectionsStrings;

public class StingsConcat {
    public static void main(String[] args) {
        String sting1 = "Hello " ;
        String string2 = "World ";
        String string3 = "!!!";
        String string = sting1.concat(string2).concat(string3);
        System.out.println(string);// ідентично sting1 + sting2 + sting3
        System.out.println(string.substring(0,1));
        String srt4 = new StringBuilder().append(sting1).append(string2).append(string3).toString();
        System.out.println(srt4);

        String str5 = new StringBuffer().append(sting1).append(string2).append(string3).toString();
        System.out.println(str5);

        StringBuilder revers = new StringBuilder(string);
        revers.reverse();
        System.out.println(revers);

        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.length());
        System.out.println(buffer.capacity());
        buffer.append(" Java ");
        System.out.println(buffer.append(buffer));


    }
}
