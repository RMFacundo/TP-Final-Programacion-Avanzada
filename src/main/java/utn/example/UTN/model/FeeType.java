package utn.example.UTN.model;

public enum FeeType {
    RESIDENTIAL(1,"RESIDENTIAL",60),
    COMERTIAL(2,"COMERTIAL",75),
    INDUSTRIAL(3,"INDUSTRIAL",40),
    OTHER(4,"OTHER",65);

    private Integer id;
    private String detail;
    private Integer pricePerKwh;

    FeeType(Integer id, String detail, Integer pricePerKwh) {
        this.id = id;
        this.detail = detail;
        this.pricePerKwh = pricePerKwh;
    }

    public String getDetail() {
        return detail;
    }

    public Integer getPricePerKwh() {
        return pricePerKwh;
    }
}
