import java.awt.*;
import javax.swing.*;
import java.util.*;

public class calButton extends JButton
{

	public calButton(String temp)
	{
		super(temp);
	}
	
	public void setList(ToDoList l)
	{
		list = l;
		count = 1;
	}
	
	public ToDoList getList()
	{
		return list;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setDate(int date, int month, int year)
	{
		Day = date;
		Month = month;
		Year = year;
	}
	
	public int getDay() {return Day;}
	public String getMonth()
	{
		switch (Month)
		{
			case 0:
				return "JANUARY";
			case 1:
				return "FEBRUARY";
			case 2:
				return "MARCH";
			case 3:
				return "APRIL";
			case 4:
				return "MAY";
			case 5:
				return "JUNE";
			case 6:
				return "JULY";
			case 7:
				return "AUGUST";
			case 8:
				return "SEPTEMBER";
			case 9:
				return "OCTOBER";
			case 10:
				return "NOVEMBER";
			case 11:
				return "DECEMBER";
		}
		return "EMPTY";
	}	
	public int getYear() { return Year;}
	
	private ToDoList list;
	int count = 0;
	int Day;
	int Month;
	int Year;
	
}
