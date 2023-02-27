public class StringBuilder1 {
    public static void main(String[] args) {
    //   Now we will atlk about the string builder in java
    // Which is used to add string without creating new objects
        StringBuilder builder=new StringBuilder(); 
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        StringBuilder build=new StringBuilder();
        System.out.println(build.append("faizan"));
        System.out.println(build.capacity());
        System.out.println(builder.toString());
        // Time complexity O(n)
        System.out.println(builder.capacity());
        // reverse
        System.out.println(builder.reverse());
    }
}
