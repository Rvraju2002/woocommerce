package woocommerce;

import java.io.IOException;




import org.testng.annotations.Test;

import BaseTest.parentClass;


public class ProductCreate extends parentClass {

	@Test
	public void createProduct() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		
		
		creationPage page = loginpage.loginto("spot@spot", "J!Ju#o(Wshw@r*kk@!");
		page.GoToWocommerce();
		page.GotoCreationPage();
		String[] createProductName = {"ShapphireWatch","Swagger sent","Addidas Shoe","Sunglass"};
		int k = 0;
		for (int i = 0; i < createProductName.length; i++) {
			page.addProductPage();
			designPage design = page.waitCancelguide();
			page.cancelGuide();
			design.clearExistingWord();
			design.productTitle(createProductName[i]);
			PicturePage picture= design.ProductDescription();
			picture.goToPicturePage();
			PriceDesignPage price = picture.miniProductDescription();
			PorductDescription product =  price.productPrice();
			product.ShortDescriptionOfProduct();
			product.publishProduct();
			k++;
			if (k == createProductName.length)
				break;

		    product.BackToProductCreationPage();
		}
		if( k==createProductName.length)
		{
			Driver.close();
		}
		

	}
	
}
