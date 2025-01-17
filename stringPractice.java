import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class stringPractice {
    public static void main(String[] args) {
        char[] ch = {'T', 'E', 'S', 'T',' '};

        /*
        * Strings are immutable
        * Immutability: Once instantiated, a String object cannot be modified.
        *
        * String Pool: Java maintains a pool of string literals to help save memory. When a new string literal is created,
        * Java checks the Pool for a matching string. If found, the new variable references the pooled string.
        * If not, the new string is added to the Pool.
        *
        */
        String s = "Test"; //Creating string using String Literal
        String str1 = new String(ch); //Create string using new Keyword.

        System.out.println(s);
        System.out.println(str1);

        /*
         * String class implements several interfaces
         * Serializable: Allows string objects to be serialized into byte streams, facilitating their transmission or storage.
         * Comparable<String>: Enables lexical comparison between two strings, supporting natural ordering within collections.
         * CharSequence: Provides a unified read-only interface for different kinds of char sequences,
         * allowing String objects to be manipulated and accessed generically.
         */


        /*
         * String Buffer represents a mutable sequence of characters that ensures thread safety
         * making it suitable for scenarios involving multiple threads that modify a character sequence.
         */

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", World!");
        System.out.println(sb.toString());
        sb.insert(5, " Java");
        System.out.println(sb.toString()); //o/p: Hello Java, World!
        sb.delete(5, 10); // beginIndex to endIndex
        System.out.println(sb.toString()); //Hello, World!
        System.out.println(sb.capacity());//current capacity of the buffer - 16(default)
        /*
         * String Builder
         * The crucial distinction lies in StringBuilder not being synchronized, rendering it not suitable for thread-safe operations.
         */

        StringBuilder str = new StringBuilder("Hello");
        str.append(", World!");
        System.out.println(str.toString()); // Hello, World!
        str.insert(5, " Java");
        System.out.println(str.toString()); // Hello Java, World!
        str.delete(5, 10); //beginIndex to endIndex.
        System.out.println(str.toString()); //Hello, World!
        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo

        /*
         * String Tokenizer
         *
         * simplifies the process of segmenting a string into multiple tokens, utilizing designated separators.
         *
         * The StringTokenizer class implements the Enumeration<Object> interface
         *
         * StringTokenizer(String strReplace)
         * StringTokenizer(String strReplace, String delim)
         * StringTokenizer(String strReplace, String delim, boolean returnValue)
         */

        StringJoiner sj = new StringJoiner(", ");
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Cheery");
        System.out.println(sj.toString()); //Apple, Banana, Cheery


        StringTokenizer st = new StringTokenizer("my name is khan"," ");
        System.out.println("Next token is : " + st.nextToken(",")); //Next token is : my
        System.out.println("Total number of Tokens: "+st.countTokens()); // Count Number of tokens.
        while (st.hasMoreTokens()) { //st.hasMoreElements()
            System.out.println(st.nextToken());
            //System.out.println(st.nextElement());
        }
        /*
         * Construct String from a subset of the char array
         *
         * Fn:     String(char[] value, int offset, int count)
         *
         * Parameters:
         *
         * value: The char array.
         * offset: The initial offset into the array.
         * count: The number of characters to use from the array.
         *
         */

        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String resultString = new String(charArray, 6, 5);
        System.out.println(resultString); //World

        /*
         * Java String Comparison
         *
         * There are three ways you can compare strings
         *
         * 1. By Using equals() Method
         * 2. By Using == Operator
         * 3. By compareTo() Method
         * 4. Using startsWith() and endsWith() Method
         *
         */

        /*
         * By Using equals() Method
         *
         * public boolean equals(Object another) compares this string to the specified object.
         * public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.
         */

        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        boolean equalsResult = s1.equals(s2);
        System.out.println("Using equals() method: " + equalsResult); // Output: True
        boolean equalsIgnoreCaseResult = s1.equalsIgnoreCase(s2);
        System.out.println("Using equalsIgnoreCase() method: " + equalsIgnoreCaseResult); // Output: true

        /*
         * By Using == Operator
         */

        System.out.println(s1 == s2);              // true
        System.out.println(s1 == s3);              // false

        /*
         * String compare by compareTo() Method
         *
         * s1 == s2 : The method returns 0.
         * s1 > s2 : The method returns a positive value.
         * s1 < s2 : The method returns a negative value.
         *
         */

        String cstr1 = "Sachin";
        String cstr2 = "Sachin";
        String cstr3 = "Ratan";
        System.out.println(cstr1.compareTo(cstr2));      // 0
        System.out.println(cstr1.compareTo(cstr3));      // 1 (str1 > str3)
        System.out.println(cstr3.compareTo(str1));      // -1 (str3 < str1)

        /*
         * Using startsWith() and endsWith() Methods
         *
         */

        String strCompare = "String Compare";
        System.out.println(strCompare.startsWith("String")); // true
        System.out.println(strCompare.endsWith("Compare"));  // true

        /*
         *  String.format() Method
         */

        String firstName = "Manoj";
        String lastName = "Mamilla";
        // Using String.format for string concatenation with formatting
        String result = String.format("Hello, %s %s", firstName, lastName);
        System.out.println(result); //Hello, Manoj Mamilla

        /*
         * Using Collectors.joining()
         */
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array
        String join = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
        System.out.println(join.toString());  // abc, pqr, xyz

        /*
         * Substring
         *
         * public String substring(int startIndex)
         * public String substring(int startIndex, int endIndex)
         */
        String subStr ="SachinTendulkar";
        System.out.println("Original String: " + subStr);
        System.out.println("Substring starting from index 6: " +subStr.substring(6));//Tendulkar
        System.out.println("Substring starting from index 0 to 6: "+subStr.substring(0,6)); //Sachin

        /*
         * Using String.split() method
         *
         */
        String text= new String("Hello, My name is Sachin");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));

        /*
         * Java String Class Methods
         */

        /*
         * toUpperCase() && toLowerCase()
         */
        System.out.println(s.toUpperCase());//SACHIN
        System.out.println(s.toLowerCase());//sachin
        System.out.println(s);//Sachin(no change in original)

        /*
         * Trim the empty Spaces - trim()
         */
        System.out.println(s.trim());//Sachin

        /*
         * String startsWith() and endsWith() method
         */
        System.out.println(s.startsWith("Sa"));//true
        System.out.println(s.endsWith("n"));//true

        /*
         * charAt() method returns a character at specified index.
         */

        System.out.println(s.charAt(0));//S
        System.out.println(s.charAt(3));//h

        /*
         * String intern() Method
         */

        String inter=s.intern();
        System.out.println(inter);//Sachin

        /*
         * valueOf() Method
         *
         * valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
         *
         */
        int a = 10;
        String val = String.valueOf(a);
        System.out.println(val+10);

        /*
         * replace() Method
         *
         * replace() method replaces all occurrence of first sequence of character with second sequence of character.
         *
         */

        String rep = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = rep.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);

        /*
         * Java Program to reverse tOGGLE each word in String
         */
        String words[]=rep.split("\\s");
        String reverseToggle="";
        for(String w:words){
            StringBuilder build = new StringBuilder(w);
            sb.reverse();
            String first = build.substring(0,1);
            String afterfirst = build.substring(1);
            reverseToggle += first.toLowerCase() + afterfirst.toUpperCase()+" ";
        }
        System.out.println(reverseToggle.trim());

        /*
         * Sting CompareTo () Methods
         */
        String sc1="hello";
        String sc2="hello";
        String sc3="meklo";
        String sc4="hemlo";
        String sc5="flag";
        System.out.println(sc1.compareTo(sc2));//0 because both are equal
        System.out.println(sc1.compareTo(sc3));//-5 because "h" is 5 times lower than "m"
        System.out.println(sc1.compareTo(sc4));//-1 because "l" is 1 times lower than "m"
        System.out.println(sc1.compareTo(sc5));//2 because "h" is 2 times greater than "f"

        /*
         * Index Of()
         */
        String sIndex ="this is index of example";
        //passing substring
        int index1= sIndex.indexOf("is");//returns the index of is substring
        int index2= sIndex.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

        //passing substring with from index
        int index3= sIndex.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

        //passing char value
        int index4= sIndex.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3


        /*
         * Java String lastIndexOf()
         *
         * int lastIndexOf(int ch)
         * int lastIndexOf(int ch, int fromIndex)
         * int lastIndexOf(String substring)
         * int lastIndexOf(String substring, int fromIndex)
         *
         */

        String last_IndexOf = "This is last index of example";
        int index = last_IndexOf.lastIndexOf("of", 25);
        System.out.println(index); //19
        index = last_IndexOf.lastIndexOf("of", 10);
        System.out.println(index); // -1, if not found

        /*
         *  Java String replace()
         *
         *  public String replace(char oldChar, char newChar)
         *  public String replace(CharSequence target, CharSequence replacement)
         */

        String strReplace = "Hello World";
        String replaced = strReplace.replace("o", "*");
        System.out.println(replaced); // Output: Hell* W*rld

        strReplace = "Java is awesome";
        replaced = strReplace.replace("awesome", "fantastic");
        System.out.println(replaced); // Output: Java is fantastic

        /*
         * Java String replaceAll()
         *
         * public String replaceAll(String regex, String replacement)
         *
         */
        strReplace = "javatpoint is a very good website";
        replaceString = strReplace.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString); //jevetpoint is e very good website

        strReplace="My name is Khan. My name is Bob. My name is Sonoo.";
        replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString); //My name was Khan. My name was Bob. My name was Sonoo.

        strReplace="My name is Khan. My name is Bob. My name is Sonoo.";
        replaceString=s1.replaceAll("\\s",""); //Replace empty spaces
        System.out.println(replaceString); //MynameisKhan.MynameisBob.MynameisSonoo.

    }
}
