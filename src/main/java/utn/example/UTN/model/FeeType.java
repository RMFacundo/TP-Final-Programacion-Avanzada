package utn.example.UTN.model;

public enum FeeType {
    TOTAL("total",105.0f),
    PARTIAL("partial",55.0f);

    private String detail;
    private Float pricePerKwh;

    FeeType(String detail, Float pricePerKwh) {
        this.detail = detail;
        this.pricePerKwh = pricePerKwh;
    }

    public String getDetail() {
        return detail;
    }

    public Float getPricePerKwh() {
        return pricePerKwh;
    }
}
