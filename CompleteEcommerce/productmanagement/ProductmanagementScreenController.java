package productmanagement;

import add_product.AddProductScreen;
import delete_product.DeleteProductScreen;
import print_product.PrintProductScreen;
import search_product.SearchProductScreen;
import update_product.UpdateProductScreen;

public class ProductmanagementScreenController {
	
		public void addProductButtonClick() {
			new AddProductScreen().show();
		}
		
		
		public void searchProductButtonClick() {
			new SearchProductScreen().show();
		}
		
		public void updateProductButtonClick() {
			new UpdateProductScreen().show();
		}
		
		public void printProductButtonClick() {
			new PrintProductScreen().show();
		}
		
		public void deleteProductButtonClick() {
			new DeleteProductScreen().show();
		}
}
