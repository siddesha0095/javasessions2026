package myjava;



import com.google.gson.Gson;

public class MovieRunner1 {

    public static void main(String[] args) {
        // Create Movie object
    	Movie1 m1 = new Movie1("Pushpa: The Rise", "Allu Arjun", 8.5f, "Telugu", 'A', 250);

        // Print using toString()
        System.out.println(m1);

        // Convert to JSON using Gson
        Gson g1=new Gson();
        
        
        String result = g1.toJson(m1);
        System.out.println("JSON Output: " + result);
    }
}