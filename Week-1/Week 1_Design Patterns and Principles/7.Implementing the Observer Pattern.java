// Observer.java
interface Observer {
    void update(String stockPrice);
}

// Stock.java
interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

// StockMarket.java
import java.util.ArrayList;
import java.util.List;

class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockPrice);
        }
    }
}

// MobileApp.java
class MobileApp implements Observer {
    private String stockPrice;

    public void update(String stockPrice) {
        this.stockPrice = stockPrice;
        display();
    }

    public void display() {
        System.out.println("Mobile App Stock Price: " + stockPrice);
    }
}

// WebApp.java
class WebApp implements Observer {
    private String stockPrice;

    public void update(String stockPrice) {
        this.stockPrice = stockPrice;
        display();
    }

    public void display() {
        System.out.println("Web App Stock Price: " + stockPrice);
    }
}

// ObserverPatternExample.java
public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setStockPrice("100 USD");
        stockMarket.setStockPrice("120 USD");
    }
}
