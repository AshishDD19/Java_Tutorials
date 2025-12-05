package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	private int id;
	private String name;
	private Double cost;
	
	
	public Product(int id, String name, Double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Double getCost() {
		return cost;
	}


	
	
	
	
}
public class Pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(21, "PS5", 55000.0);
		Product p2 = new Product(11, "Laptop", 45000.0);
		Product p3 = new Product(31, "Monitor", 30000.0);
		Product p4 = new Product(41, "Bottle", 5000.0);
		Product p5 = new Product(51, "iPhone", 100000.0);
		
//		1. print name and cost whose cost  27k
		
		Stream<Product> stream = Stream.of(p1,p2,p3,p4,p5);
		stream.filter(x -> x.getCost() > 27000.0).map(x -> x.getName()+"-"+x.getCost()).forEach(System.out::println);
		
		System.out.println("----------------");
		
//		2.name of product of cost 30k
		Stream<Product> stream1 = Stream.of(p1,p2,p3,p4,p5);
		stream1.filter(x -> x.getCost() == 30000.0).forEach(x -> System.out.println(x.getName()));
		
		System.out.println("----------------");
//		3.total  cost
		List<Product> plist = Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println(plist.stream().collect(Collectors.summingDouble(x -> x.getCost())));

//		or
		System.out.println(plist.stream().collect(Collectors.summingDouble(Product::getCost)));
		
		
		System.out.println("----------------");
//		4. Max
		System.out.println("Max cost- "+plist.stream().max(Comparator.comparingDouble(Product::getCost)).get().getName());
		
//		or
		
		System.out.println("Max cost- "+plist.stream().max(Comparator.comparingDouble(Product::getCost)).get());
		
		
		System.out.println("----------------");
//		5. Min
		System.out.println("Min cost- "+plist.stream().min(Comparator.comparingDouble(Product::getCost)).get().getName());
		
//		6. List to Set
		System.out.println("----------------");
		System.out.println("List to Set: "+plist
				.stream()
				.filter(x -> x.getCost() <= 50000)
				.map(Product::getCost)
				.collect(Collectors.toSet()));
		
		System.out.println("----------------");
//		7. List to Map
		
		System.out.println(plist.stream().collect(Collectors.toMap(Product::getId, Product::getName)));
		
//		or
		Map<Integer, String> map = plist.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
		System.out.println(map);
		
		
	}

}
