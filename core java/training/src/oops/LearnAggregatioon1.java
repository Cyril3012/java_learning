package oops;

public class LearnAggregatioon1 {
	int id;
	String name;
	Address address;

	public LearnAggregatioon1(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println("id :" + id);
		System.out.println("name :" + name);
		System.out.println("address :" + address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {

		Address ad = new Address("Chennai", "Tamilnadu", "Bharath");

		LearnAggregatioon1 la = new LearnAggregatioon1(1, "Cyril", ad);

		la.display();

	}

}
