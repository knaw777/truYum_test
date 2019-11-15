/**
 * 
 */
package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

/**
 * @author t-Khader
 *
 */
public class MenuItemDaoCollectionImplTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// testGetMenuItemListAdmin();

		// testGetMenuItemListCustomer();

		testModifyMenuItem();

	}

	static void testGetMenuItemListAdmin() {

		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();

		System.out.println("Menu Item List :"
				+ menuItemDaoCollectionImpl.getMenuItemListAdmin());

		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListAdmin();

		for (MenuItem menuItem : menuItems) {

			System.out.println(menuItem.toString());

		}

	}

	static void testGetMenuItemListCustomer() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();

		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListCustomer();

		for (MenuItem menuItem : menuItems) {

			System.out.println(menuItem.toString());

		}

	}

	static void testModifyMenuItem() throws ParseException {

		MenuItem menuItem = new MenuItem(000002, "Cake", 80.00f, true,
				DateUtil.convertToDate("11/12/2019"), "Main Course", false);
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		MenuItemDao menuItemDao = menuItemDaoCollectionImpl;
		menuItemDao.modifyMenuItem(menuItem);
		System.out.println("Modified MenuItem details are :"
				+ menuItemDao.getMenuItem(000002));

	}

	void testGetMenuItem() {

	}

}
