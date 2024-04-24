
class OutOfStockException extends Exception {
    public OutOfStockException() {
        System.out.println("Not enough apples in stock");
    }
}

class InsufficientCashException extends Exception {
    public String getMessage() {
        return "Insufficient Cash to buy items";
    }
}

public class UserExcep {
    public static void main(String[] args) throws OutOfStockException, InsufficientCashException {
        int applesInStock = 10;
        int applesToBuy = 20;
        try {
            if (applesInStock < applesToBuy) {
                throw new OutOfStockException();
            }
        } catch (OutOfStockException e) {
            System.out.println("Apples are out of stock");
        }

        int customerBalance = 50;
        int costOfItems = 100;
        try {
            if (customerBalance < costOfItems) {
                throw new InsufficientCashException();
            }
        } catch (InsufficientCashException e) {
            System.out.println(e.getMessage());
        }
    }
}
