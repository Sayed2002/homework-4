package Project;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * this is administrator class
 * @author googel plus
 * @version 4.4.2
 */
public class Administrator extends User {

    	public Administrator(){}
        
        
	public boolean approvePlayground(Playground playground) 
	{
		if( playground.getLocation()!= null  && playground.getPricePerHour()!= 0 && playground.getSize()!= 0  )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 *  make the admin cancel a playground
	 */
	public void suspendPlayground() {
		System.out.println("playground is suspended");
	}

	/**
	 * enables admin to delete a playground
	 * @param Playgrounds is the playground to be deleted
	 * @return null
	 */
	public Playground deletePlayground(ArrayList<Playground> Playgrounds) {
		return null;
	}

	/**
	 * make playground is available to players to be booked
	 * @param playground is the playground to be available
	 * @return playground
	 */
	public Playground activatePlayground(Playground playground) {
		return playground;
		// TODO - implement Administrator.activatePlayground
	}



}