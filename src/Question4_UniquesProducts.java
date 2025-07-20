import java.util.HashMap;
import java.util.Map;

public class Question4_UniquesProducts {

    public static void main(String[] args) {

        String [] products = { "Apple", "Computer", "Apple", "Bag"};
        Question4_UniquesProducts products1 = new Question4_UniquesProducts();

        String unique = products1.uniqueProducts(products);
        System.out.println(unique);
    }
    public static String uniqueProducts(String [] products){

//        hashmap to count how many times a product appears
        Map<String, Integer> productsCounter = new HashMap();

        for (String s : products) {
            //check if we aleady have seen this before
            if (productsCounter.containsKey(s)) {
                int count = productsCounter.get(s);
                productsCounter.put(s, count + 1);
            }else{
                //start count at 1 if it's the first time we saw this product
            productsCounter.put(s, 1);
            }
        }

        //find the first product with count 1
        for (String product : products){

            if (productsCounter.get(product) == 1){
                //return the first occurence of product
                return product;
            }
        }
//return null if no product appears once
        return null;
    }
}
