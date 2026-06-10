//A warehouse stores item quantities in an array. Find the max, min,
//total stock, and detect duplicates. Extend: rotate the stock array by
//k positions (simulate daily shift handover), and transpose a 2D shelf
//grid.
public class Warehouse {
    public static void main(String[] args) {
        int stock[] = {45,20,60,20,90,15,60};
        findMaxMin(stock);
        findTotal(stock);
        searchItem(stock, 20);
        detectDuplicates(stock);
        rotateStock(stock, 2);
        transposeShelf(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    public static void findMaxMin(int[] stock) {
        int max = stock[0], min = stock[0];
        for (int qty : stock) {
            if (qty > max) max = qty;
            if (qty < min) min = qty;
        }
        System.out.println("Max quantity: " + max);
        System.out.println("Min quantity: " + min);
    }

    public static void findTotal(int[] stock) {
        int total = 0;
        for (int qty : stock) {
            total += qty;
        }
        System.out.println("Total stock: " + total);
    }

    public static void searchItem(int[] stock, int item) {
        boolean found = false;
        for (int qty : stock) {
            if (qty == item) {
                found = true;
                break;
            }
        }
        System.out.println("Item " + item + " found: " + found);
    }

    public static void detectDuplicates(int[] stock) {
        boolean hasDuplicates = false;
        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) break;
        }
        System.out.println("Duplicates detected: " + hasDuplicates);
    }

    public static void rotateStock(int[] stock, int k) {
        int n = stock.length;
        k = k % n; 
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }
        System.out.print("Rotated stock: ");
        for (int qty : rotated) {
            System.out.print(qty + " ");
        }
        System.out.println();
    }
    
    public static void transposeShelf(int[][] shelf) {
        int rows = shelf.length;
        int cols = shelf[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = shelf[i][j];
            }
        }
        System.out.println("Transposed shelf:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");   
            }
            System.out.println();
        }
    }
}