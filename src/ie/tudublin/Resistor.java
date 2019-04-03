package ie.tudublin;

public class Resistor
{
    int resistance;
    UI ui;

    public Resistor(UI ui, int resistance)
    {
        this.ui = ui;
        this.resistance = resistance;
    }

    public void render()
    {
        ui.line(-100, 0, -50, 0);
        ui.line(-50, 0, -50, -50);
        ui.line(-50, -50, 50, -50);
        
        ui.line(50, -50, 50, 0);
        ui.line(50, 0, 100, 0);
        ui.line(50, 0, 50, 50);
        ui.line(50, 50, -50, 50);
        ui.line(-50, 50, -50, 0);
    }
}