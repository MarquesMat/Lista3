package ex4;

public class Ex4 {
    public static void imprimir(Data data1, Data data2, Data data3) {
        System.out.printf("%d/%d/%d\n", data1.getDia(), data1.getMesInt(), data1.getAno());
        System.out.printf("%s %d, %d\n", data2.getMesStr(), data2.getDia(), data2.getAno());
        System.out.printf("%d %d\n", data3.getDiasAno(), data3.getAno());
    }
    
    public static void main(String[] args) {
        Data data1_1 = new Data(8, 9, 2014);
        Data data1_2 = new Data(8, "Setembro", 2014);
        Data data1_3 = new Data(365, 2014);
        Data data2_1 = new Data(2, 11, 2016);
        Data data2_2 = new Data(2, "Novembro", 2016);
        Data data2_3 = new Data(366, 2016);
        System.out.println("Data 1:");
        imprimir(data1_1, data1_2, data1_3);
        System.out.println("\nData 2:");
        imprimir(data2_1, data2_2, data2_3);
    }
}
