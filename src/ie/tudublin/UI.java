package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	ArrayList<Code> codes = new ArrayList<Code>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	private void loadCodes()
	{
		Table t = loadTable("codes.csv", "header");
		for(TableRow row:t.rows())
		{
			Code c = new Code(row);
			codes.add(c);
		}
	}

	private void loadResistors()
	{
		Table t = loadTable("resistors.csv");
		for(TableRow row:t.rows())
		{			
			resistors.add(new Resistor(this,row.getInt(0)));
		}
	}

	private void printResistors()
	{
		for(Resistor r:resistors)
		{
			int i = r.resistance;
			int hundreds = (i / 100);
			int tens = (i - (hundreds * 100)) / 10;
			int ones = i - ((hundreds * 100)  + (tens * 10));
			print(hundreds + ",");
			print(tens + ",");
			println(ones);			
		}
	}

	public void settings()
	{
		size(500, 500);
		loadCodes();
		loadResistors();
		printResistors();
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
		background(0);
		stroke(255);
		for(int i = 0 ; i < resistors.size() ; i ++)
		{
			Resistor r = resistors.get(i);
			pushMatrix();
			translate(100, map(i, 0, resistors.size(), 50, 600));
			r.render();
			popMatrix();
		}
	}
}
