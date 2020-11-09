package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVaribales;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase
    public Integer getIngresosTotales(){
        return ingresosTotales;
    }
    public void setIngresosTotales(){
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos(){
        return gastosFijos;
    }
    public void setGastosFijos(){
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales(){
        return gastoVaribales;
    }
    public void setGastoVaribales(){
        this.gastoVaribales = gastoVaribales;
    }

    public String getCapacidadEndeudamiento(int ingresosTotales, int gastosFijos, int gastoVaribales) {
        Double capacidadEndeudamiento = (ingresosTotales - (gastosFijos + gastoVaribales)) * POR_FIJO;
        return capacidadEndeudamiento.toString();
    }
}
