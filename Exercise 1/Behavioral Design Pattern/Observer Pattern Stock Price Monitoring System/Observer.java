// Observer Interface
interface Observer {
    void update(float stockPrice);
}

// Concrete Observer: Mobile App
class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println("Mobile App (" + appName + ") received updated stock price: " + stockPrice);
    }
}

// Concrete Observer: Desktop Widget
class DesktopWidget implements Observer {
    private String widgetName;

    public DesktopWidget(String widgetName) {
        this.widgetName = widgetName;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println("Desktop Widget (" + widgetName + ") received updated stock price: " + stockPrice);
    }
}

// Subject: Stock
class Stock {
    private List<Observer> observers = new ArrayList<>();
    private float stockPrice;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}

// Main Class
public class ObserverPattern {
    public static void main(String[] args) {
        Stock googleStock = new Stock();
        
        Observer mobileApp = new MobileApp("Stock Tracker");
        Observer desktopWidget = new DesktopWidget("Finance Widget");

        googleStock.registerObserver(mobileApp);
        googleStock.registerObserver(desktopWidget);

        googleStock.setStockPrice(1350.55f);
        googleStock.setStockPrice(1400.00f);
    }
}
