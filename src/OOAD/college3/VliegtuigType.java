package OOAD.college3;

public class VliegtuigType {
    private String code;
    private Integer capaciteit;
    private Fabrikant fabrikant;

    public VliegtuigType(Fabrikant fabrikant, String code, Integer capaciteit) {
        this.fabrikant = fabrikant;
        this.code = code;
        this.capaciteit = capaciteit;
    }

    public Integer geefCapaciteit() {
        return capaciteit;
    }
}
