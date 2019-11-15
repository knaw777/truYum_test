/**
 * 
 */
package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * @author t-Khader
 *
 */
public class CartDaoCollectionImplTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws CartEmptyException {
		// TODO Auto-generated method stub

		testAddCartItem();

	}

	static void testAddCartItem() throws CartEmptyException {

		CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoCollectionImpl;
		cartDao.addCartItem(1, 000004);
		List<MenuItem> menuItemList = cartDao.getAllCartItems(1);
		System.out.println("MenuItem list :" + menuItemList);

	}

	void testGetAllCartItems() {

	}

	void testRemoveCartItem() {

	}

}
