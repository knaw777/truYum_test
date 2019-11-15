/**
 * 
 */
package com.cognizant.truyum.dao;
import com.cognizant.truyum.model.MenuItem;
import java.util.List;

/**
 * @author t-Khader
 *
 */
public interface CartDao {
	
	void addCartItem(long userid , long menuItemId);
	List<MenuItem> getAllCartItems(long userid) throws CartEmptyException;
	void removeCartItem(long userId,long menuitemid);
	

}
