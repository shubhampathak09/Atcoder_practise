package streams;

import java.net.Inet4Address;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findFirstOdd {
    public static void main(String[] args){
        int[] arr={2,6,7,1,0,9,10,0,3};

       /** find first odd from integer array using streams **/
        int oddOrMin= Stream.of(arr)
                .flatMapToInt(Arrays::stream)
                .filter(i -> i % 2 !=0)
                .findFirst()
                .orElse(Integer.MIN_VALUE);


        /**2. group all odd integers together in a list **/
        List<Integer>lis=Arrays.asList(2,2,4,8,1,3,13,5,6,9,10,13,17,19,100,101,4).stream().filter(o -> o % 2!=0).collect(Collectors.toList());
        System.out.println(lis);
        System.out.println(oddOrMin);

        /**3. print all even numbers from stream **/
        List<Integer>sample=Arrays.asList(2,2,4,8,1,3,13,5,6,9,10,13,17,19,100,101,4);
        List<Integer>even=sample.stream().filter(o -> o % 2 ==0).collect(Collectors.toList());
        System.out.println(even);

        /**4.program to print even numbers from an array**/
        Arrays.stream(arr).filter(x -> x%2==0).forEach(System.out::print);

        /** Print even numbers from set **/
        Set<Integer> numbers = Set.of(1, 4, 8, 40, 11, 22, 33, 99);
        Set<Integer>eveNumbers=numbers.stream().filter(x -> x % 2==0).collect(Collectors.toSet());
        System.out.println(numbers);

       /** some exercised on practical scenarios **/

       /**5 Obtain a list of products belongs to category “Books” with price > 100 **/
       orderRepoImpl orderRepo=new orderRepoImpl();

       List<Product>productsResult=orderRepo.findAllProduct()
               .stream()
               .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
               .filter(p -> p.getPrice() > 100)
               .collect(Collectors.toList());


       /**6 Obtain a list of order with products belong to category “Baby”**/
       List<Order>ordersResult2=orderRepo.findAllOrders()
               .stream()
               .filter(o ->o.getProducts()
                       .stream()
                       .anyMatch(p ->p.getCategory().equalsIgnoreCase("Baby"))).collect(Collectors.toList());

       /**7 Obtain a list of product with category = “Toys” and then apply 10% discount **/
       List<Product>toyProducts=orderRepo.findAllProduct().stream()
               .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
               //.map(p ->p.setPrice(p.getPrice() * 0.9))   // map not working
               .collect(Collectors.toList());

    }

    /** below just mocks some db layer **/


    public static class orderRepoImpl implements orderRep{

        @Override
        public List<Order> findAllOrders() {
            /** create some dummy orders list **/
            return null;
        }

        @Override
        public List<Product> findAllProduct() {
            /** create some dummy product list **/
            return null;
        }
    }

    public interface orderRep{
        public List<Order> findAllOrders();

       public List<Product>findAllProduct();
    }
    public class Order{
        private long id;
        private String status;
        LocalDate orderedDate;
        LocalDate deliveryDate;
        List<Product>products;
        List<Customer>customers;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public LocalDate getOrderedDate() {
            return orderedDate;
        }

        public void setOrderedDate(LocalDate orderedDate) {
            this.orderedDate = orderedDate;
        }

        public LocalDate getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        public List<Customer> getCustomers() {
            return customers;
        }

        public void setCustomers(List<Customer> customers) {
            this.customers = customers;
        }
    }
    public class Product{

        /** product details **/
        private long id;
        private String name;
        private String category;
        private double price;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
    public class Customer{
        /** customer class will have name, id, tier**/
        private long id;
        private String name;
        private int tier;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTier() {
            return tier;
        }

        public void setTier(int tier) {
            this.tier = tier;
        }
    }
}
