/**
 * 
 */
package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

/**
 * @author t-Khader
 *
 */
public class MenuItemDaoCollectionImpl implements MenuItemDao {

	static List<MenuItem> menuItemList;

	public MenuItemDaoCollectionImpl() {

		if (menuItemList == null) {
			try {
				menuItemList = new ArrayList<MenuItem>();
				menuItemList.add(new MenuItem(000001, "Sandwich", 99.00f, true,
						DateUtil.convertToDate("15/03/2017"), "Main Course",
						true));
				menuItemList.add(new MenuItem(000002, "Burger", 129.00f, true,
						DateUtil.convertToDate("23/12/2017"), "Main Course",
						false));
				menuItemList.add(new MenuItem(000003, "Pizza", 149.00f, true,
						DateUtil.convertToDate("21/08/2018"), "Main Course",
						false));
				menuItemList.add(new MenuItem(000004, "French Fries", 200.00f,
						true, DateUtil.convertToDate("02/07/2017"),
						"Main Course", false));
				menuItemList.add(new MenuItem(000005, "Potota Chips", 10.00f,
						true, DateUtil.convertToDate("14/11/2019"),
						"Main Course", false));
				menuItemList.add(new MenuItem(000006, "Rice", 10.00f, false,
						DateUtil.convertToDate("02/08/2019"), "Main Course",
						false));
			} catch (ParseException pe) {

				System.out.println("Parse exception " + pe.getMessage());

			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cognizant.truyum.dao.MenuItemDao#getMenuItemListAdmin()
	 */
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cognizant.truyum.dao.MenuItemDao#getMenuItemListCustomer()
	 */
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		List<MenuItem> menuItemListCust = new ArrayList<MenuItem>();

		Date today = new Date();
		for (MenuItem menuItem : menuItemList) {
			if (menuItem.getDateOfLaunch().getTime() <= today.getTime()
					&& menuItem.isActive()) {
				menuItemListCust.add(menuItem);
			}
		}

		return menuItemListCust;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cognizant.truyum.dao.MenuItemDao#modifyMenuItem(com.cognizant.truyum
	 * .model.MenuItem)
	 */
	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub

		for (MenuItem menuItemForModification : menuItemList) {

			if (menuItem.getId() == menuItemForModification.getId()) {

				menuItemForModification.setName(menuItem.getName());
				menuItemForModification.setCategory(menuItem.getCategory());
				menuItemForModification.setDateOfLaunch(menuItem
						.getDateOfLaunch());
				menuItemForModification.setFreeDelivery(menuItem
						.isFreeDelivery());
				menuItemForModification.setPrice(menuItem.getPrice());
				menuItemForModification.setActive(menuItem.isActive());
			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cognizant.truyum.dao.MenuItemDao#getMenuItem(long)
	 */
	@Override
	public MenuItem getMenuItem(long menuitemId) {
		// TODO Auto-generated method stub

		for (MenuItem menuItem : menuItemList) {
			if (menuitemId == menuItem.getId()) {
				return menuItem;

			}

		}
		return null;

	}

}
