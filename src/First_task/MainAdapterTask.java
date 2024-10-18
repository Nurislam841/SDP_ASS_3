package First_task;
// Client code
public class MainAdapterTask {
    public static void main(String[] args){
        LegacyOrderProcessor legacyOrderProcessor = new LegacyOrderProcessor();
        NewOrderProcessor adapter = new OrderAdapter(legacyOrderProcessor);
        adapter.processNewOrder();
    }
}