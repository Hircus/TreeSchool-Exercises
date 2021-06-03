public class StringaPalindroma {
    public static void main(String[] main){
        String s = "anna";
        String s2 = reverse(s, s.length()-1);
        System.out.println(s.equals(s2));
        System.out.println(s+ "  "+ s2);

    }
    public static String reverse(String s, int i){
        if(i==-1) return "";
        return s.charAt(i)+reverse(s, i-1);
    }
}
