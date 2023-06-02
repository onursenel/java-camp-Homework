package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",10000,5,"Siyah");
		
		product.setName("Laptop");
		product.setId(1);
		product.setPrice(10000);
		product.setStockAmount(5);
		product.setDescription("Asus Laptop");
		product.setRenk("siyah");
		product.getKod();
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
