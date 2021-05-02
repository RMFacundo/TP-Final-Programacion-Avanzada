package utn.example.UTN.domain;

public enum TipoTarifa {
    TOTAL("total",105.0f),
    PARCIAL("parcial",55.0f);

    private String descripcion;
    private Float precioPorKwh;

    TipoTarifa(String descripcion, Float precioPorKwh) {
        this.descripcion = descripcion;
        this.precioPorKwh = precioPorKwh;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPrecioPorKwh() {
        return precioPorKwh;
    }
}
