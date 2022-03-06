package twitter.inmoclick;

import java.io.Serializable;

public class InmoclickPropiedad implements Serializable {

    public InmoclickPropiedad(){}

    public Long id;

    public Integer propiedad_id;
    public String nombre;
    public String loc_desc;
    public String pro_desc;
    public String tip_desc;
    public Integer superficie_total;
    public Integer superficie_cubierta;
    public String agua;
    public String luz;
    public String gas;
    public String baños;
    public String cochera;
    public String dormitorios;
    public Integer prp_pre_dol;
    public Integer oportunidad_dolares;

    public boolean isEqual(InmoclickPropiedad other){
       return this.id.equals(other.id);
    }
}
