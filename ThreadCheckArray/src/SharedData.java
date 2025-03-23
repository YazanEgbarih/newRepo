import java.util.ArrayList;


/**
 * Description of SharedData
 * The class will be used as a shared resource between 2 threads
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Constructor Description of SharedData
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Getter of winArray
	 * @return winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Setter of winArray
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Getter of array
	 * @return array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Getter of b
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Getter of flag
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Setter of flag
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
