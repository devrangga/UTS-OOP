public class chart {
//    attribute
    Integer beban;
    String nama;
//    constructor
    public chart(){}
//    methods
    public void addChart(Integer beban,String nama){
        this.beban = beban;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Pie Chart Saat ini" +
                "beban=" + beban +
                ", nama='" + nama + '\'' ;
    }
}
