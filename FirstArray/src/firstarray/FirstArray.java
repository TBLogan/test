
package firstarray;

public class FirstArray {

    public static void main(String[] args) {

                //use of parallel arrays
        /*
        - can be more than two arrays
        - each array can be a different data type
        - have to have the same # of items in the array
        - these itmes will use the index positions to refer to each other
        */
        
        //small canteen menu program -> items & their prices
        
        //menu array            0       1       2
        String[] menuArray = {"Coke","Burger","Salad"};
        //prices              0 1   2
        int[] pricesArray = {18,35,45};
        
        for (int i = 0; i < menuArray.length; i++) {
            System.out.println(menuArray[i]);
        }
        System.out.println("\n\n");
        System.out.println("The prices array >>>>");
        
        for (int i = 0; i < pricesArray.length; i++) {
            System.out.println(pricesArray[i]);
        }
        System.out.println("\n\n");
        
        //how to print collerated/related items
        System.out.println("The canteen menu >>>>");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(menuArray[i]+" - R"+pricesArray[i]);
        }
    }
    
}
