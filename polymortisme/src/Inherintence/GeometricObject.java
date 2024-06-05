package Inherintence;

public class GeometricObject {
    private String warna = "white";
    private boolean properti;
    
    public GeometricObject() {
    }
    
    public GeometricObject(String color, boolean filled) {
        this.warna = color;
        this.properti = filled;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String color) {
        this.warna = color;
    }
    
    public boolean properti() {
        return properti;
    }
    
    public void setProperti(boolean filled) {
        this.properti = filled;
    }
    
    @Override
    public String toString() {
        return "Color: " + warna + " and filled: " + properti;
    }
}
