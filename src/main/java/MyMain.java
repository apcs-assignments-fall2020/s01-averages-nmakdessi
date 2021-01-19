public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        int counter = 0;
        double total = 0;
        for (int row = 0; row < mat.length; row++){
            for (int column = 0; column < mat[0].length; column++){
                total += mat[row][column];
            }
        }
        return total/counter;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int count = 0;
        double med = 0;
        int size = mat.length * mat[0].length;
        double [] arr = new double [size];
        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[0].length; column++) {
                arr[count] = mat[row][column];
                count = count + 1;
            }
        }
        if (arr.length % 2 != 0) {
            int l1 = arr.length/2;
            med = arr[l1];
        }
        else {
            int l2 = arr.length/2;
            int l3 = l2 + 1;
            med = (arr[l2-1] + arr[l3-1]) / 2; 
        }
        return med;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        int value = 0;
        int [] x = new int[100];
        for (int row=0;row<mat.length;row++){
            for (int col = 0;col<mat[0].length;col++){
                value = (int)mat[row][col];
                x[value]++;
            }
        }
        int big = 0;
        int mode = -1;

        for (int i = 0; i < 100; i++){
            if (x[i] > big){
                big = x[i];
                mode = i;

            }
        }

        ArrayList<Double> l1 = new ArrayList<Double>();
        double maxc = 0;
        double maxv = 0;

        for (int i = 0;i<l1.size();i++){
            double count = 0;
            for (int j = 0; j < l1.size();j++){
                if (l1.get(j) == l1.get(i)){
                    count++;
                }
                if (count > maxc){
                    maxc = count;
                    maxv = l1.get(j);
                }
            }
        }
        
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
