package bai11_java_collection_framework.bai_tap.bai_tap_Luyen_Tap_Su_Dung_ArrayList_Va_LinkedList;

public class Test {
    public static void main(String[] args) {
//        test với ArrayList
        ProductManagerOfArrayList listProduct = new ProductManagerOfArrayList();
        listProduct.add(new Product(3, "Bánh", 20000));
        listProduct.add(new Product(6, "Kẹo", 35000));
        listProduct.add(new Product(1, "mứt", 40000));
        listProduct.add(new Product(2, "Hạt", 45000));
        listProduct.add(new Product(4, "Coca", 10000));
        listProduct.add(new Product(5, "Socola", 50000));
        listProduct.display();

        listProduct.remove(3);
        listProduct.display();

        listProduct.update(5);
        listProduct.display();

        listProduct.search(7);
        listProduct.sort();
        listProduct.display();

//        test với LinkedList
        ProductManagerOfLinkedList linkedList = new ProductManagerOfLinkedList();
        linkedList.add(new Product(9, "Hoa Lan", 50000));
        linkedList.add(new Product(3, "Hoa Cúc", 25000));
        linkedList.add(new Product(6, "Hoa Ly", 60000));
        linkedList.add(new Product(8, "Hoa Salem", 45000));
        linkedList.add(new Product(1, "Hoa Hồng", 20000));
        linkedList.display();

        linkedList.remove(6);
        linkedList.display();

        linkedList.update(3);
        linkedList.display();

        linkedList.search(1);
        linkedList.sort();
        linkedList.display();
    }
}
