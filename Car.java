class Car
{
    Engine engine;  // Car HAS-A Engine (instance field, not static)
    
    Car()
    {
        engine = new Engine();  // each Car gets its own Engine
    }
    
    public static void main(String[] args)
    {
        System.out.println("hey car is about to start");
        Car car = new Car();   // store the object in a reference
        car.engine.display();  // access engine through the car object
    }
}

class Engine
{
    void display()
    {
        System.out.println("engine has started");
    }
}