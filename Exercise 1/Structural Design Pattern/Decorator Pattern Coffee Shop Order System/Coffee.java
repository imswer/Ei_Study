// Abstract Coffee Class
abstract class Coffee {
    public abstract double cost();
    public abstract String description();
}

// Concrete Component: Basic Coffee
class BasicCoffee extends Coffee {
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }
}

// Abstract Decorator Class: Coffee Decorator
abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

// Concrete Decorator: Milk
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }

    @Override
    public String description() {
        return coffee.description() + ", Milk";
    }
}

// Concrete Decorator: Sugar
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    public String description() {
        return coffee.description() + ", Sugar";
    }
}

// Concrete Decorator: Caramel
class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5;
    }

    @Override
    public String description() {
        return coffee.description() + ", Caramel";
    }
}

// Main Class to Demonstrate the Decorator Pattern
public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.description() + " -> Cost: $" + basicCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println(milkCoffee.description() + " -> Cost: $" + milkCoffee.cost());

        Coffee caramelMilkCoffee = new CaramelDecorator(milkCoffee);
        System.out.println(caramelMilkCoffee.description() + " -> Cost: $" + caramelMilkCoffee.cost());

        Coffee fullCoffee = new SugarDecorator(caramelMilkCoffee);
        System.out.println(fullCoffee.description() + " -> Cost: $" + fullCoffee.cost());
    }
}
