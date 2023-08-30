package model;

public class Microscope extends LabEquipment {

    private int magnification;
    private static final int MIN_MAGNIFICATION = 1;

    public Microscope(String manufacturer, String model, int year, int magnification){
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope(Microscope source){
        super(source);
        setMagnification(source.magnification);
    }

    public int getMagnification(){
        return this.magnification;
    }

    public void setMagnification(int magnification){
        if(magnification < MIN_MAGNIFICATION){
            throw new IllegalArgumentException("Magnification must be greater than or equal to minimum magnification");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance(){
        return "Microscope maintenance: clean the lenses and check light source";
    }

    @Override
    public LabEquipment clone(){
        return new Microscope(this);
        
    }
    
}
