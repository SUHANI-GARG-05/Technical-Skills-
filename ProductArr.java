public class ProductArr {
    public static void main (String[] args){
        int arr[] = {5,1,10,1};
        // Declare product array
        int productArr[] = new int[arr.length];

        int TotalProduct = 1;

        // calculate Total Product 
        for(int i=0; i<arr.length; i++){
            TotalProduct *= arr[i];
        }

        // create product array using TotalProduct
        for(int i=0; i<productArr.length; i++){
            productArr[i] = TotalProduct / arr[i];
        }

        // print the Elements of the product array
        System.out.print("Product array : ");
        for(int i=0; i<productArr.length; i++){
            System.out.print(+productArr[i]+" ");
        }
        System.out.println();
    }
}

// arr[] = [1 2 3 4 5]
//       = [120 60 40 30 24 ]  -------------product upon elements