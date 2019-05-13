package zoo;

/**
 *
 * @author José Ángel Adalid - adalid97
 * @version 0.0
 */
public class Gallina extends Ave {
 
    private String cacareo = "KOKOKO";
    
    /**
     * Constructor.
     */
    public Gallina () {}
    
    /**
     * Constructor.
     * @param habitat: habitat
     * @param comida: comida
     * @param longevidad: longevidad
     * @param periodoIncubacion: periodo de Incubación
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Setter.
     * @param cacareo
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Getter.
     * @return cacareo: cascareo
     */
    public String getCacareo () { return cacareo; }
    
    /**
     * Método cacarear
     */
    public void cacarear () { System.out.println(cacareo); }
    
    /**
     * Método comer
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método desplazarse
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
