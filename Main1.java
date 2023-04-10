public class Main1 {
    public static void main(String[] args) {
        chart pieChart = new chart();
        pieChart.addChart(5,"IPA");
        pieChart.addChart(5,"B.INDO");
        System.out.println(pieChart);
        System.out.println();
        pieChart.addChart(5,"B.ING");
        System.out.println(pieChart);
    }
}
