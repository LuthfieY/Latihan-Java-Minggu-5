package restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();
        System.out.println("");
        menu.order(10, 30);
        menu.order(0, 30);
        menu.tampilMenuMakanan();
        System.out.println("");
        menu.order(1, 5);
        menu.tampilMenuMakanan();
        System.out.println("");
        menu.order(0, 20);
        menu.tampilMenuMakanan();
    }
}
