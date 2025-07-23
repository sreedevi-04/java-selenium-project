public class RemoveJunkCharacter {
    public static void main(String[] args) {
        String s="query1234";
        //s.replace()*/
        //String input = "T@a!l a#t123";

        // Keep only letters and digits [^a-zA-Z0-9]
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Original String: " + s);
        System.out.println("Cleaned String: " + cleaned);


    }
}
